package io.sentry.config;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class CompositePropertiesProvider implements PropertiesProvider {
    private final List<PropertiesProvider> providers;

    public CompositePropertiesProvider(List<PropertiesProvider> list) {
        this.providers = list;
    }

    public Map<String, String> getMap(String str) {
        for (PropertiesProvider map : this.providers) {
            Map<String, String> map2 = map.getMap(str);
            if (!map2.isEmpty()) {
                return map2;
            }
        }
        return new ConcurrentHashMap();
    }

    public String getProperty(String str) {
        for (PropertiesProvider property : this.providers) {
            String property2 = property.getProperty(str);
            if (property2 != null) {
                return property2;
            }
        }
        return null;
    }
}
