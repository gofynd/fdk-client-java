package com.sdk.common;


import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Constant {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NavigatorPage {
        private String name;
        private String link;
        private List<NavigatorPageParam> params;
        private List<NavigatorPageParam> query;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NavigatorPageParam {
        private String key;
        private boolean required;
    }

    public static final class AVAILABLE_PAGE_TYPE {
        public static final String ABOUT_US = "about-us";
        public static final String ADDRESSES = "addresses";
        public static final String BLOG = "blog";
        public static final String BRANDS = "brands";
        public static final String CARDS = "cards";
        public static final String CART = "cart";
        public static final String CATEGORIES = "categories";
        public static final String BRAND = "brand";
        public static final String CATEGORY = "category";
        public static final String COLLECTION = "collection";
        public static final String COLLECTIONS = "collections";
        public static final String CONTACT_US = "contact-us";
        public static final String EXTERNAL = "external";
        public static final String CUSTOM = "custom";
        public static final String FAQ = "faq";
        public static final String FRESHCHAT = "freshchat";
        public static final String HOME = "home";
        public static final String NOTIFICATION_SETTINGS = "notification-settings";
        public static final String ORDERS = "orders";
        public static final String PAGE = "page";
        public static final String POLICY = "policy";
        public static final String PRODUCT = "product";
        public static final String PRODUCT_REQUEST = "product-request";
        public static final String PRODUCTS = "products";
        public static final String PROFILE = "profile";
        public static final String PROFILE_ORDER_SHIPMENT = "profile-order-shipment";
        public static final String PROFILE_BASIC = "profile-basic";
        public static final String PROFILE_COMPANY = "profile-company";
        public static final String PROFILE_EMAIL = "profile-email";
        public static final String PROFILE_PHONE = "profile-phone";
        public static final String RATE_US = "rate-us";
        public static final String REFER_EARN = "refer-earn";
        public static final String SETTINGS = "settings";
        public static final String SHARED_CART = "shared-cart";
        public static final String TNC = "tnc";
        public static final String TRACK_ORDER = "track-order";
        public static final String WISHLIST = "wishlist";
        public static final String SECTIONS = "sections";
        public static final String FORM = "form";
        public static final String CART_DELIVERY = "cart-delivery";
        public static final String CART_PAYMENT = "cart-payment";
        public static final String CART_REVIEW = "cart-review";
        public static final String LOGIN = "login";
        public static final String REGISTER = "register";
        public static final String SHIPPING_POLICY = "shipping-policy";
        public static final String RETURN_POLICY = "return-policy";
        public static final String ORDER_STATUS = "order-status";
        public static final String LOCATE_US = "locate-us";
        public static final String SINGLE_PAGE_CHECKOUT = "single-page-checkout";
        public static final String REQUEST_REATTEMPT = "request-reattempt";
        public static final String FILES = "files";
        
    }

    public static <T extends Enum<T>> Map<T, NavigatorPage> getNavigators(Class<T> enumType){
        String navigatorJson = """
            {
	"about-us": {
		"name": "About Us",
		"link": "/about-us"
	},
	"addresses": {
		"name": "Saved Addresses",
		"link": "/profile/address"
	},
	"blog": {
		"name": "Blog",
		"link": "/blog/:slug",
		"params": [
			{
				"key": "slug",
				"required": false
			}
		]
	},
	"brands": {
		"name": "Brands",
		"link": "/brands/:department",
		"params": [
			{
				"key": "department",
				"required": false
			}
		]
	},
	"cards": {
		"name": "Saved Cards",
		"link": "/profile/my-cards"
	},
	"cart": {
		"name": "Cart",
		"link": "/cart/bag/"
	},
	"categories": {
		"name": "Categories",
		"link": "/categories/:department",
		"params": [
			{
				"key": "department",
				"required": false
			}
		]
	},
	"brand": {
		"name": "Brand",
		"link": "/brand/:slug",
		"params": [
			{
				"key": "slug",
				"required": true
			}
		]
	},
	"category": {
		"name": "Category",
		"link": "/category/:slug",
		"params": [
			{
				"key": "slug",
				"required": true
			}
		]
	},
	"collection": {
		"name": "Collection",
		"link": "/collection/:slug",
		"params": [
			{
				"key": "slug",
				"required": true
			}
		]
	},
	"collections": {
		"name": "Collections",
		"link": "/collections/"
	},
	"contact-us": {
		"name": "Contact Us",
		"link": "/contact-us/"
	},
	"external": {
		"name": "External Link",
		"link": "/external/",
		"query": [
			{
				"key": "url",
				"required": true
			}
		]
	},
	"custom": {
		"name": "Custom theme link",
		"link": "/c/",
		"query": [
			{
				"key": "url",
				"required": true
			}
		]
	},
	"faq": {
		"name": "FAQ",
		"link": "/faq"
	},
	"freshchat": {
		"name": "Chat by Freshchat",
		"link": "/freshchat"
	},
	"home": {
		"name": "Home",
		"link": "/"
	},
	"notification-settings": {
		"name": "Notification Settings",
		"link": "/notification-settings"
	},
	"orders": {
		"name": "Orders",
		"link": "/profile/orders"
	},
	"page": {
		"name": "Page",
		"link": "/page/:slug",
		"params": [
			{
				"key": "slug",
				"required": true
			}
		]
	},
	"policy": {
		"name": "Privacy Policy",
		"link": "/privacy-policy"
	},
	"product": {
		"name": "Product",
		"link": "/product/:slug",
		"params": [
			{
				"key": "slug",
				"required": true
			}
		]
	},
	"product-request": {
		"name": "Product Request",
		"link": "/product-request/"
	},
	"products": {
		"name": "Products",
		"link": "/products/"
	},
	"profile": {
		"name": "Profile",
		"link": "/profile"
	},
	"profile-order-shipment": {
		"name": "profile orders shipment",
		"link": "/profile/orders/shipment/:shipmentid",
		"params": [
			{
				"key": "shipmentid",
				"required": true
			}
		]
	},
	"profile-basic": {
		"name": "Basic Profile",
		"link": "/profile/details"
	},
	"profile-company": {
		"name": "Profile Company",
		"link": "/profile/company"
	},
	"profile-email": {
		"name": "Profile Email",
		"link": "/profile/email"
	},
	"profile-phone": {
		"name": "Profile Phone",
		"link": "/profile/phone"
	},
	"rate-us": {
		"name": "Rate Us",
		"link": "/rate-us"
	},
	"refer-earn": {
		"name": "Refer & Earn",
		"link": "/profile/refer-earn"
	},
	"settings": {
		"name": "Settings",
		"link": "/setting/currency"
	},
	"shared-cart": {
		"name": "Shared Cart",
		"link": "/shared-cart/:token",
		"params": [
			{
				"key": "token",
				"required": true
			}
		]
	},
	"tnc": {
		"name": "Terms and Conditions",
		"link": "/terms-and-conditions"
	},
	"track-order": {
		"name": "Track Order",
		"link": "/order-tracking/:orderId",
		"params": [
			{
				"key": "orderId",
				"required": false
			}
		]
	},
	"wishlist": {
		"name": "Wishlist",
		"link": "/wishlist/"
	},
	"sections": {
		"name": "Sections",
		"link": "/sections/:group",
		"params": [
			{
				"key": "group",
				"required": true
			}
		]
	},
	"form": {
		"name": "Form",
		"link": "/form/:slug",
		"params": [
			{
				"key": "slug",
				"required": true
			}
		]
	},
	"cart-delivery": {
		"name": "Cart Delivery",
		"link": "/cart/delivery"
	},
	"cart-payment": {
		"name": "Cart Payment Information",
		"link": "/cart/payment-info"
	},
	"cart-review": {
		"name": "Cart Order Review",
		"link": "/cart/order-review"
	},
	"login": {
		"name": "Login",
		"link": "/auth/login"
	},
	"register": {
		"name": "Register",
		"link": "/auth/register"
	},
	"shipping-policy": {
		"name": "Shipping policy",
		"link": "/shipping-policy"
	},
	"return-policy": {
		"name": "Return policy",
		"link": "/return-policy"
	},
	"order-status": {
		"name": "Order status",
		"link": "/cart/order-status"
	},
	"locate-us": {
		"name": "Locate us",
		"link": "/locate-us"
	},
	"single-page-checkout": {
		"name": "Single Page Checkout",
		"link": "/cart/checkout"
	},
	"request-reattempt": {
		"name": "Request Reattempt",
		"link": "/reattempt/shipment/:shipmentId",
		"params": [
			{
				"key": "shipmentId",
				"required": true
			}
		]
	},
	"files": {
		"name": "Files",
		"link": "/files/:file_name",
		"params": [
			{
				"key": "file_name",
				"required": true
			}
		]
	}
}
            """;


        try {
            ObjectMapper objectMapper = new ObjectMapper();
            // Deserialize the JSON string into a map
            JavaType mapType = objectMapper.getTypeFactory().constructMapType(Map.class, enumType, NavigatorPage.class);
            // Deserialize the JSON string into a map with the specified enum type
            return objectMapper.readValue(navigatorJson, mapType);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in parsing navigators object, contact fdk support.");
            return null;
        }
    }
}

