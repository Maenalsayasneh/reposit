package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

public final class OperatingSystem implements IUnknownPropertiesConsumer, Cloneable {
    public static final String TYPE = "os";
    private String build;
    private String kernelVersion;
    private String name;
    private String rawDescription;
    private Boolean rooted;
    private Map<String, Object> unknown;
    private String version;

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getBuild() {
        return this.build;
    }

    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public String getName() {
        return this.name;
    }

    public String getRawDescription() {
        return this.rawDescription;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getVersion() {
        return this.version;
    }

    public Boolean isRooted() {
        return this.rooted;
    }

    public void setBuild(String str) {
        this.build = str;
    }

    public void setKernelVersion(String str) {
        this.kernelVersion = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRawDescription(String str) {
        this.rawDescription = str;
    }

    public void setRooted(Boolean bool) {
        this.rooted = bool;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public OperatingSystem clone() throws CloneNotSupportedException {
        OperatingSystem operatingSystem = (OperatingSystem) super.clone();
        operatingSystem.unknown = CollectionUtils.shallowCopy(this.unknown);
        return operatingSystem;
    }
}
