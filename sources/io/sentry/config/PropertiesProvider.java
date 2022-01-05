package io.sentry.config;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface PropertiesProvider {
    Boolean getBooleanProperty(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    Double getDoubleProperty(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Double.valueOf(property);
        }
        return null;
    }

    List<String> getList(String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(InstabugDbContract.COMMA_SEP)) : Collections.emptyList();
    }

    Map<String, String> getMap(String str);

    String getProperty(String str);

    String getProperty(String str, String str2) {
        String property = getProperty(str);
        return property != null ? property : str2;
    }
}
