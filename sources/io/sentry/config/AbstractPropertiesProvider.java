package io.sentry.config;

import i0.d.a.a.a;
import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public abstract class AbstractPropertiesProvider implements PropertiesProvider {
    private final String prefix;
    private final Properties properties;

    public AbstractPropertiesProvider(String str, Properties properties2) {
        this.prefix = (String) Objects.requireNonNull(str, "prefix is required");
        this.properties = (Properties) Objects.requireNonNull(properties2, "properties are required");
    }

    public Map<String, String> getMap(String str) {
        String z0 = a.z0(new StringBuilder(), this.prefix, str, ".");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.properties.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str2 = (String) entry.getKey();
                if (str2.startsWith(z0)) {
                    hashMap.put(str2.substring(z0.length()), StringUtils.removeSurrounding((String) entry.getValue(), "\""));
                }
            }
        }
        return hashMap;
    }

    public String getProperty(String str) {
        Properties properties2 = this.properties;
        return StringUtils.removeSurrounding(properties2.getProperty(this.prefix + str), "\"");
    }

    public AbstractPropertiesProvider(Properties properties2) {
        this("", properties2);
    }
}
