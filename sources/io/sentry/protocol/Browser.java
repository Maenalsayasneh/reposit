package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

public final class Browser implements IUnknownPropertiesConsumer, Cloneable {
    public static final String TYPE = "browser";
    private String name;
    private Map<String, Object> unknown;
    private String version;

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getName() {
        return this.name;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getVersion() {
        return this.version;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public Browser clone() throws CloneNotSupportedException {
        Browser browser = (Browser) super.clone();
        browser.unknown = CollectionUtils.shallowCopy(this.unknown);
        return browser;
    }
}
