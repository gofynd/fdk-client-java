package com.sdk.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdk.application.ApplicationClient;
import com.sdk.application.ApplicationConfig;
import com.sdk.application.ApplicationModels;
import com.sdk.platform.PlatformClient;
import com.sdk.platform.PlatformConfig;
import com.sdk.platform.PlatformModels;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApplicationRestController {
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/")
    String home() {
        return "Hello World!";
    }

    @GetMapping("/product")
    Object getproduct(@RequestParam int page_no, @RequestParam int page_size, @RequestParam String timestamp) throws IOException {
        ApplicationConfig applicationConfig = new ApplicationConfig("000000000000000000000001", "ZRoeLTbj8");
        ApplicationClient applicationClient = new ApplicationClient(applicationConfig);
        return applicationClient.catalog.getProductStockForTimeByIds(timestamp, page_size, "*");
    }

    @GetMapping("/{slug}")
    Object getSlug(@PathVariable String slug) throws IOException {
        ApplicationConfig applicationConfig = new ApplicationConfig("000000000000000000000001", "ZRoeLTbj8");
        ApplicationClient applicationClient = new ApplicationClient(applicationConfig);
        return applicationClient.catalog.getProductDetailBySlug(slug);
    }

    @PostMapping("/card")
    Object attachCardToCustomer(@RequestBody Map<String, Object> objectMap) throws IOException {
        ApplicationConfig applicationConfig = new ApplicationConfig("000000000000000000000001", "ZRoeLTbj8");
        ApplicationClient applicationClient = new ApplicationClient(applicationConfig);
//        applicationClient.lead.getASDF(ApplicationClient.PriorityEnum.high, ApplicationClient.PriorityEnum.high, ApplicationClient.PriorityEnum.high);
        return applicationClient.payment.attachCardToCustomer(new ApplicationModels.AttachCardRequest());
    }

    @GetMapping("/paginator")
    void getPaginator(@RequestParam String timestamp) throws IOException {
        ApplicationConfig applicationConfig = new ApplicationConfig("000000000000000000000001", "ZRoeLTbj8");
        ApplicationClient applicationClient = new ApplicationClient(applicationConfig);
//        Paginator<ApplicationModels.ProductStockPolling> paginator = applicationClient.catalog.getProductStockForTimeByIdsPagination(timestamp, 20);
//        while(paginator.hasNext()) {
//            System.out.println("..............."+objectMapper.writeValueAsString(paginator.next().getItems()));
//        }
    }

    //returns this https://api.fyndx0.de/v1.0/company/1/oauth/authorize?response_type=code&client_id=604fa8b762f6f24608dcb827&scope=company/products&redirect_uri=https://www.oauth.com/playground/authorization-code.html&state=ANP0VIAFKUTQVVI&access_mode=online
    @GetMapping("/platform")
    Object getPlatform() throws IOException {
        String launchUrl = "https://test-devops";
        PlatformConfig platformConfig = new PlatformConfig("1", "60be66a2d4cbbf1fd0a67c8c", "0QFntFAQ~qc-3wE", "https://api.fyndx0.de");
        String redirectURI = platformConfig.getPlatformOauthClient().getAuthorizationURL(List.of("company/saleschannel"), launchUrl + "/fp/auth", "677979", false);
        return redirectURI;
//        platformConfig.getPlatformOauthClient().verifyCallback("8ad4abd7895abcef6830b439b0ed0f75d5802e41");
//
//        PlatformClient platformClient = new PlatformClient(platformConfig);
//        platformClient.catalog.getCompanyDetail(61);
//        return platformClient.billing.getInvoices("61");
    }

    //    @GetMapping("/fp/auth")
//    Object getAUth(HttpServletRequest httpRequest) throws IOException {
////        Object getAUth(@RequestParam String code) throws IOException {
//        PlatformConfig platformConfig = new PlatformConfig("1","60be66a2d4cbbf1fd0a67c8c","0QFntFAQ~qc-3wE","https://api.fyndx0.de");
//        platformConfig.getPlatformOauthClient().verifyCallback(httpRequest.getQueryString());
//        PlatformClient platformClient = new PlatformClient(platformConfig);
//        PlatformModels.OptinCompanyDetail companyDetail = platformClient.catalog.getCompanyDetail();
//        //get enum
//        platformClient.lead.getTicketsPagination(true, true, "", "", PlatformModels.PriorityEnum.high, "", 1);
//        return platformClient.catalog.getCompanyDetail();
//    }
    //        return applicationClient.catalog.getProductDetailBySlug("884", "000000000000000000000004","play-clan-yellow-printed-t-shirt-867279-d1c867");

    @GetMapping("/platform/application/customers")
    Object getPlatformApplication() throws IOException {
        PlatformConfig platformConfig = new PlatformConfig("884", "000000000000000000000004", "S1raaOvSAe5cGEf", "https://api.fynd.com");
        PlatformClient platformClient = new PlatformClient(platformConfig);
        PlatformClient.ApplicationClient applicationClient = platformClient.application("000000000000000000000004");
        platformClient.catalog.getCompanyDetail();
        platformClient.webhook.getSubscribersByExtensionId(1, 1, "");
        PlatformModels.GetCatalogConfigurationMetaData configurationData = applicationClient.catalog.getCatalogConfiguration();
        return configurationData;
    }

    @GetMapping("/upload")
    Object upload() {
        ApplicationConfig applicationConfig = new ApplicationConfig("000000000000000000000001", "ZRoeLTbj8");
        ApplicationClient applicationClient = new ApplicationClient(applicationConfig);
        return applicationClient.fileStorage.uploadMedia("test.csv", "image/jpg", 100, "demo", new File("/home/aparna/Downloads/IMG-8977.jpg"),
                new HashMap<>());
    }
}