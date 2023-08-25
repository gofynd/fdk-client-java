# FDK Java


FDK client for Java language


## Getting Started
Get started with the Java Development SDK for Fynd Platform


# Usage

1. Create Maven project and add the dependency in the pom.xml 
```
<dependency>
    <groupId>com.github.gofynd</groupId>
    <artifactId>fdk-client-java</artifactId>
    <version>v0.0.1-RELEASE</version>
</dependency>
```

2. Add it in your root pom.xml at the end of repositories:
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

3. Start integrating

### Sample Usage - ApplicationClient

```java
    ApplicationConfig applicationConfig = null;
    try {
          applicationConfig = new ApplicationConfig(
              "YOUR_APPLICATION_ID",
              "YOUR_APPLICATION_TOKEN"
              );
        if(Objects.nonNull(applicationConfig)) {
            ApplicationClient applicationClient = new ApplicationClient(applicationConfig);
            return applicationClient.catalog.getProductDetailBySlug("product-slug");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
```

### Sample Usage - PlatformClient

```java
    PlatformConfig platformConfig = null;
    try {
          platformConfig = new PlatformConfig(
          "COMPANY_ID",
          "API_KEY",
          "API_SECRET",
          "DOMAIN"
          );
        
        if(Objects.nonNull(platformConfig)) {
            PlatformClient platformClient = new PlatformClient(platformConfig); 
            
            // API's without application_id
            PlatformModels.OptinCompanyDetail companyDetail = platformClient.catalog.getCompanyDetail();
            System.out.println("Company Name : " + companyDetail.getName() );

            // API's with application_id
            PlatformClient.ApplicationClient applicationClient = platformClient.application("APPLICATION_ID");
            PlatformModels.GetCatalogConfigurationMetaData configurationData =  applicationClient.catalog.getCatalogConfiguration();
            return configurationData.getListing();
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
```

### Cookie

You can use `persistentCookieStore` from `PlatformConfig` or `ApplicationConfig` to read and write cookies.

Following code snippet will demonstrate how to use `persistentCookieStore`.

```java
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;

public class CookieExample {

    public static void main(String[] args) {

        try {
            ApplicationConfig applicationConfig = new ApplicationConfig("APPLICATION_ID", "APPLICATION_TOKEN");

            ApplicationClient applicationClient = new ApplicationClient(applicationConfig);

            // Accessing cookie store
            CookieStore cookieStore = applicationConfig.getPersistentCookieStore();

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

### Documentation

- [Application Front](documentation/application/README.md)
- [Platform Front](documentation/platform/README.md)
- [Public Front](documentation/public/README.md)

