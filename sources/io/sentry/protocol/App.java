package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

public final class App implements IUnknownPropertiesConsumer, Cloneable {
    public static final String TYPE = "app";
    private String appBuild;
    private String appIdentifier;
    private String appName;
    private Date appStartTime;
    private String appVersion;
    private String buildType;
    private String deviceAppHash;
    private Map<String, Object> unknown;

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String getAppBuild() {
        return this.appBuild;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getAppName() {
        return this.appName;
    }

    public Date getAppStartTime() {
        Date date = this.appStartTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBuildType() {
        return this.buildType;
    }

    public String getDeviceAppHash() {
        return this.deviceAppHash;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public void setAppBuild(String str) {
        this.appBuild = str;
    }

    public void setAppIdentifier(String str) {
        this.appIdentifier = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppStartTime(Date date) {
        this.appStartTime = date;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setBuildType(String str) {
        this.buildType = str;
    }

    public void setDeviceAppHash(String str) {
        this.deviceAppHash = str;
    }

    public App clone() throws CloneNotSupportedException {
        App app = (App) super.clone();
        app.unknown = CollectionUtils.shallowCopy(this.unknown);
        return app;
    }
}
