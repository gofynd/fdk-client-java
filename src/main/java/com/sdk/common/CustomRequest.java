package com.sdk.common;

import okhttp3.*;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CustomRequest {
    private static final Gson gson = new Gson();
    private final OkHttpClient client;

    public CustomRequest(List<Interceptor> interceptors) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        // Add each interceptor to the builder
        if (interceptors != null) {
            for (Interceptor interceptor : interceptors) {
                builder.addInterceptor(interceptor);
            }
        }
        this.client = builder.build();
    }

    public Response request(String url, Map<String, String> queryParams, Map<String, String> headers, Object bodyObject, String method, String domain) throws IOException {
        url = domain + url;
        // Build the URL with query parameters
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();
        if (queryParams != null) {
            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        HttpUrl finalUrl = urlBuilder.build();

        // Convert the bodyObject to a JSON string if provided
        String bodyJson = null;
        if (bodyObject != null) {
            bodyJson = gson.toJson(bodyObject);
        }

        // Create the request body
        RequestBody body = null;
        if (bodyJson != null && !bodyJson.isEmpty()) {
            body = RequestBody.create(
                    bodyJson,
                    MediaType.parse("application/json; charset=utf-8")
            );
        }

        // Build the request
        Request.Builder requestBuilder = new Request.Builder().url(finalUrl);

         // Add headers to the request
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                requestBuilder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        
        if (method.equalsIgnoreCase("POST")) {
            requestBuilder.post(body);
        } else if (method.equalsIgnoreCase("PUT")) {
            requestBuilder.put(body);
        } else if (method.equalsIgnoreCase("PATCH")) {
            requestBuilder.patch(body);
        } else if (method.equalsIgnoreCase("DELETE")) {
            requestBuilder.delete(body);
        } else if (method.equalsIgnoreCase("GET")) {
            requestBuilder.get();
        } else {
            requestBuilder.get();
        }
        Request request = requestBuilder.build();
        return client.newCall(request).execute();
    }

}
