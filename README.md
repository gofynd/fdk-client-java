# FDK Java

FDK client for Java language

## Getting Started

Get started with the Java Development SDK for Fynd Platform

## Usage



1. Create a new Maven project or use an existing one. Open the project's `pom.xml` file and add the following dependency to the `<dependencies>` section:

```xml
<dependency>
    <groupId>com.github.gofynd</groupId>
    <artifactId>fdk-client-java</artifactId>
    <version>3.8.0</version>
</dependency>
```

make sure to check the available version list on [jitpack](https://jitpack.io/#gofynd/fdk-client-java) and use the appropriate version number.

2. Add the Jitpack repository to your project's `pom.xml` file. Place the following code snippet at the end of the `<repositories>` section:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

3. Now you can start integrating the Java FDK Clients into your app. Below are two sample usage scenarios demonstrating how to use the `ApplicationClient` and `PlatformClient` classes.



---

### Sample Usage - ApplicationClient

```java
    try {
            ApplicationClient applicationClient = new ApplicationClient("YOUR_APPLICATION_ID","YOUR_APPLICATION_TOKEN");
            return applicationClient.catalog.getProductDetailBySlug("product-slug");

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
```

---

### Sample Usage - request function

The request function allows you to make custom API requests with ease. It is available on both `platform` and `application` client.

```java
public Response request(String url, Map<String, String> queryParams, Map<String, String> headers, Object bodyObject, String method) throws IOException
```

#### Parameters

-   `url`: A `String` representing the target URL for the HTTP request.
-   `queryParams`: A `Map<String, String>` containing key-value pairs for the URL's query parameters.
-   `headers`: A `Map<String, String>` representing any HTTP headers to include with the request.
-   `bodyObject`: An `Object` representing the body of the request, typically used in POST, PUT, or PATCH requests.
-   `method`: A `String` representing the HTTP method (e.g., "GET", "POST", "PUT", "PATCH" "DELETE").

#### Return Value

-   `Response`: The method returns a okhttp3 `Response` object, which encapsulates the result of the HTTP request. 

#### Example

```java

import okhttp3.Response;
...
...
...

String url = "/service/platform/catalog/v1.0/company/1/products/";
String method = "GET";
Map<String, String> queryParams = new HashMap<>();
queryParams.put("company_id", "1");
queryParams.put("name", "black");
queryParams.put("page_no", "1");
queryParams.put("page_size", "10");
Response response = platformClient.request(url, queryParams , null , null, method);

if (response.isSuccessful()) {
    // Handle successful response
    String responseData = response.body().string();
    System.out.println(responseData);
} else {
    // Handle request errors
    System.err.println("Request failed with status code: " + response.code());
}


String urlPost = "/service/platform/logistics/v1.0/company/2/packaging-materials";
String methodPost = "POST";
Map<String, String> bodyMap = Map.of(
        "name", "Pack Big",
        "width", "24",
        "height", "24",
        "length", "24"
);
Response responsePost = platformClient.request(urlPost, null , null, bodyMap , methodPost);

```

---

### Sample Usage - PlatformClient

```java
    try {
        PlatformClient platformClient = new PlatformClient("COMPANY_ID" "API_KEY", "API_SECRET", "DOMAIN"); 

        AccessTokenDto token = platformClient.getAccessTokenObj("client_credentials");
        platformClient.setToken(token);
        
        // API's without application_id
        PlatformModels.OptinCompanyDetail companyDetail = platformClient.catalog.getCompanyDetail();
        System.out.println("Company Name : " + companyDetail.getName() );

        // API's with application_id
        PlatformClient.ApplicationClient applicationClient = platformClient.application("APPLICATION_ID");
        PlatformModels.GetCatalogConfigurationMetaData configurationData =  applicationClient.catalog.getCatalogConfiguration();
        return configurationData.getListing();
    
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
```

---

### Cookie

You can use `persistentCookieStore` from `PlatformClient` or `ApplicationClient` to read and write cookies.

Following code snippet will demonstrate how to use `persistentCookieStore`.

```java
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;

public class CookieExample {

    public static void main(String[] args) {

        try {

            ApplicationClient applicationClient = new ApplicationClient("APPLICATION_ID", "APPLICATION_TOKEN");

            // Accessing cookie store
            CookieStore cookieStore = applicationClient.getPersistentCookieStore();

            // get cookies
            cookieStore.getCookies();

            // set cookies
            cookieStore.add(URI.create("https://api.fynd.com"), new HttpCookie("f.session", "<COOKIE>"));

            // remove cookies
            cookieStore.removeAll();
        }
    }
}
```

Cookies added to cookieStore will be automatically attached to subsequent requests. Also any request returning `Set-Cookie` headers will automatically added in the cookieStore.

---

### Logging

To enable detailed logging of FDK in your Java project, set the log level for the SDK to `DEBUG` in the `application.yml` file:

```yaml
logging.level.com.sdk: DEBUG
```

This setting provides comprehensive insights into Spring Boot operations and logs cURL commands for FDK-initiated requests.

---

### Headers

When calling method, custom request headers can be included by passing a HashMap of headers in the method signature

```java
Map<String, String> headers = new HashMap<>();
headers.put("x-api-version", "1.0");

ThemePlatformModels.AllAvailablePageSchema response = platformClient.application(applicationId).theme.getAllPages("<THEME_ID>", headers);
```



