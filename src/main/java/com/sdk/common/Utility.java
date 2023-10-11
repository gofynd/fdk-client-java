package com.sdk.common;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utility {

    static final String SLUG_DELIMITER = ":::";

    public static String transformRequestOptions(Map<String, List<String>> params) {
        StringBuilder options = new StringBuilder();

        for (Map.Entry<String, List<String>> entry : params.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();

            if (values != null && !values.isEmpty()) {
                for (String value : values) {
                    if (value != null) {
                        try {
                            String encodedValue = URLEncoder.encode(value, "UTF-8");
                            options.append(key).append("=").append(encodedValue).append("&");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        if (options.length() > 0) {
            // Remove the trailing "&" character
            options.setLength(options.length() - 1);
        }

        return options.toString();
    }

    public static String getParamsFromItem(Map<String, List<String>> params) {
        StringBuilder strParam = new StringBuilder();

        for (Map.Entry<String, List<String>> entry : params.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();

            if (values != null && !values.isEmpty()) {
                for (int index = 0; index < values.size(); index++) {
                    String value = values.get(index);
                    strParam.append(value);

                    if (index < values.size() - 1) {
                        strParam.append(SLUG_DELIMITER);
                    }
                }
                return strParam.toString();
            }
        }

        return strParam.toString();
    }

    public static String generateUrlWithParams(Constant.NavigatorPage item, Map<String, List<String>> params) {
        if (item == null || item.getLink() == null) {
            return "";
        }

        String itemLink = item.getLink();
        if (params == null) {
            return "/" + trimChar(itemLink.split(":")[0]);
        }

        Map<String, String> joinedParamsObj = new HashMap<>();
        for (String key : params.keySet()) {
            List<String> paramValues = params.get(key);
            if (paramValues != null && !paramValues.isEmpty()) {
                StringBuilder joinedParams = new StringBuilder();
                for (int index = 0; index < paramValues.size(); index++) {
                    joinedParams.append(paramValues.get(index));
                    if (index < paramValues.size() - 1) {
                        joinedParams.append(SLUG_DELIMITER);
                    }
                }
                joinedParamsObj.put(key, joinedParams.toString());
            }
        }

        itemLink = trimChar(itemLink);

        String[] linkArr = itemLink.split("/");
        StringBuilder url = new StringBuilder();
        for (String linkSubString : linkArr) {
            if (linkSubString.startsWith(":")) {
                String linkParam = linkSubString.substring(1);
                url.append(joinedParamsObj.getOrDefault(linkParam, ""));
            } else {
                url.append(linkSubString);
            }
            url.append("/");
        }

        String resultUrl = url.toString();
        return "/" + trimChar(resultUrl);
    }

    public static HashMap<String, List<String>> getQuery(String path) {
        String[] parseUrl = path.split("\\?");
        if (parseUrl.length > 1) {
            String queryPart = parseUrl[1];
            HashMap<String, List<String>> queryResult = new HashMap<>();
            String[] keyValuePairs = queryPart.split("&");

            for (String keyValuePair : keyValuePairs) {
                String[] parts = keyValuePair.split("=");
                if (parts.length == 2) {
                    String key = parts[0];
                    String value = parts[1];

                    queryResult.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
                }
                else if(parts.length == 1){
                    String key = parts[0];
                    String value = "";

                    queryResult.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
                }
            }

            return queryResult;
        }

        return new HashMap<String, List<String>>();
    }

    //Done
    public static String trimChar(String string, char charToRemove) {
        if (string == null) {
            return null;
        }

        int startIndex = 0;
        int endIndex = string.length();

        while (startIndex < endIndex && string.charAt(startIndex) == charToRemove) {
            startIndex++;
        }

        while (endIndex > startIndex && string.charAt(endIndex - 1) == charToRemove) {
            endIndex--;
        }

        if (startIndex > 0 || endIndex < string.length()) {
            return string.substring(startIndex, endIndex);
        } else {
            return string;
        }
    }

    public static String trimChar(String string) {
        return trimChar(string, '/');
    }

    public static boolean validURL(String str) {
        String patternString = "^(https?:\\/\\/)?"
                + "((([a-z\\d]([a-z\\d-]*[a-z\\d])*)\\.)+[a-z]{2,}|"
                + "((\\d{1,3}\\.){3}\\d{1,3}))"
                + "(\\:\\d+)?(\\/[-a-z\\d%_.~+]*)*"
                + "(\\?[;&a-z\\d%_.~+=-]*)?"
                + "(\\#[-a-z\\d_]*)?$";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static Map<String, Object> findBestMatchingLink(List<String> allLinks, String pathname) {
        Map<String, Object> bestMatch = new HashMap<>();
        bestMatch.put("value", "");
        bestMatch.put("params", new HashMap<String, List<String>>());

        pathname = trimChar(pathname); // -> product/test-product-tag/reviews

        for (String link : allLinks) {
            link = trimChar(link); // -> product/:slug/add-reviews

            if (Pattern.compile("^" + trimChar(link)).matcher(pathname).find()) {
                bestMatch.put("value", link);
                break;
            }

            String[] linkArr = link.split("/"); // -> [ 'product', ':slug', 'add-reviews' ]
            String[] pathArr = pathname.split("/"); // -> [ 'product', 'test-product-tag', 'reviews' ]

            if (linkArr.length == pathArr.length) {
                // Some match
                int j;
                bestMatch.clear();
                bestMatch.put("value", "");
                bestMatch.put("params", new HashMap<String, List<String>>());

                for (j = 0; j < linkArr.length; ++j) {
                    if (linkArr[j].startsWith(":")) {
                        // This will be :slug & test-slug
                        List<String> arrParams = new ArrayList<>();
                        if (pathArr[j].contains(SLUG_DELIMITER)) {
                            // If link contains multiple path params, e.g., test-slug--test-slug-123
                            arrParams = List.of(pathArr[j].split(SLUG_DELIMITER));
                        } else {
                            arrParams = List.of(pathArr[j]); // Else assign
                        }

                        if(((Map<String, List<String>>) bestMatch.get("params")).containsKey(linkArr[j].substring(1))){
                            // If params are already present in the best match object, spread new params
                            arrParams = new ArrayList<>(arrParams);
                            arrParams.addAll(((Map<String, List<String>>)bestMatch.get("params")).get(linkArr[j].substring(1)));
                        }

                        ((Map<String, List<String>>)bestMatch.get("params")).put(linkArr[j].substring(1), arrParams); // Else assign
                    } else if (!linkArr[j].equals(pathArr[j])) {
                        break; // If path and link params do not match and are not :slug type, break and move to the next link
                    }
                }

                if (j == linkArr.length) {
                    // If all paths match and j is not 0, because 'about-us' & 'notification' have the same length, and in that case, j will be 0.
                    bestMatch.put("value", link);
                    break;
                }
            }
        }

        return bestMatch;
    }

    public static enum NavType {
        PAGE("page"),
        POPUP("popup");

        private final String value;

        NavType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
