package io.sentry.config;

import i0.d.a.a.a;
import io.sentry.util.StringUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class EnvironmentVariablePropertiesProvider implements PropertiesProvider {
    private static final String PREFIX = "SENTRY";

    private String propertyToEnvironmentVariableName(String str) {
        StringBuilder P0 = a.P0("SENTRY_");
        P0.append(str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT));
        return P0.toString();
    }

    public Map<String, String> getMap(String str) {
        String y0 = a.y0(new StringBuilder(), propertyToEnvironmentVariableName(str), "_");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry next : System.getenv().entrySet()) {
            String str2 = (String) next.getKey();
            if (str2.startsWith(y0)) {
                concurrentHashMap.put(str2.substring(y0.length()).toLowerCase(Locale.ROOT), StringUtils.removeSurrounding((String) next.getValue(), "\""));
            }
        }
        return concurrentHashMap;
    }

    public String getProperty(String str) {
        return StringUtils.removeSurrounding(System.getenv(propertyToEnvironmentVariableName(str)), "\"");
    }
}
