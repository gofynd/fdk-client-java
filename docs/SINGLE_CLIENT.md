# Single Retrofit/OkHttp Client Across All FDK Clients

You can use **one** Retrofit and one OkHttp client for all FDK clients (Platform, Application, Partner, Universal) by initializing the shared client once at startup.

## Usage

Call `FDKSharedClient.init(baseUrl)` **before** creating any clients. All configs will then use this single client.

```java
import com.sdk.common.FDKSharedClient;
import com.sdk.platform.PlatformClient;
import com.sdk.application.ApplicationClient;

// Once at application startup (e.g. in main or a bootstrap class)
FDKSharedClient.init("https://api.fynd.com");

// All clients now share the same Retrofit and OkHttp instance
PlatformClient platform = new PlatformClient(companyId, apiKey, apiSecret, "https://api.fynd.com");
ApplicationClient app = new ApplicationClient(appId, appToken, "https://api.fynd.com");
// ... use platform and app as usual
```

No other code changes are needed. Each config’s `getRetrofitServiceFactory()` automatically uses the global client when `FDKSharedClient.init()` has been called.

## How It Works

- **Auth:** Each request is tagged with the current config’s context (via `FDKContext`). The shared client’s interceptor reads this and applies the right auth (OAuth, application token, etc.) per request.
- **Cookies:** Each request uses the **CookieStore from its config**. The shared client’s `ContextAwareCookieJar` delegates to `FDKContextHolder.get().getCookieStore()` when handling the request, so:
  - Cookies are **isolated per config** (e.g. Platform vs Application vs different companies).
  - There is no cross-contamination between configs.
  - Each config can still have its own `persistentCookieStore` and it is used only for requests made with that config.

## Caveats

### 1. Same base URL

All configs should use the **same base URL** (domain). The shared client is built with a single base URL from `FDKSharedClient.init(baseUrl)`. If you need multiple domains, either:

- Use one shared client per domain (e.g. call `init(domain1)` and use a separate mechanism for domain2), or  
- Do not call `FDKSharedClient.init()` and keep the default behaviour (one Retrofit/OkHttp per config).

### 2. Thread-bound context (sync only for context propagation)

Context is set only for **synchronous** calls (`Call.execute()`). The shared client wraps each `Call` so that when you call `.execute()`, it sets the correct context for that request’s thread.

- **Async (`Call.enqueue()`):** The actual HTTP call runs on OkHttp’s dispatcher thread, which does **not** have the context set. So `enqueue()` may not get the correct auth/cookies unless you set the context in the callback thread before making further requests. Prefer `execute()` when using the single shared client if you rely on correct per-config auth/cookies.

### 3. Cookies are per config

Cookies are stored and loaded using the **CookieStore of the config** for the current request. So:

- Platform requests use `PlatformConfig`’s cookie store.
- Application requests use `ApplicationConfig`’s cookie store.
- Different `PlatformConfig` instances (e.g. different companies) use different stores if you give them different `persistentCookieStore`s.

So “one client” does **not** mean one shared cookie jar for everyone; it means one connection pool and one OkHttp/Retrofit instance, with auth and cookies still resolved per config per request.

## When Not to Use the Single Client

- You need **different base URLs** for different clients → don’t call `FDKSharedClient.init()`, or design around multiple base URLs.
- You rely heavily on **async** (`enqueue()`) and need correct per-request auth/cookies on the callback thread → either set context in the callback or use the default per-config clients.
- You want to avoid any thread-local state → use the default behaviour (one client per config, no `FDKSharedClient.init()`).

## Summary

| Aspect              | Behaviour with single client                                      |
|---------------------|-------------------------------------------------------------------|
| Retrofit/OkHttp     | One instance shared by all clients (after `FDKSharedClient.init()`). |
| Auth                | Applied per request from each config’s interceptors.              |
| Cookies             | Isolated per config via each config’s `CookieStore`.              |
| Base URL            | Must be the same for all (set in `init(baseUrl)`).                |
| Async (`enqueue`)   | Context not propagated to dispatcher thread; sync (`execute`) is safe. |
