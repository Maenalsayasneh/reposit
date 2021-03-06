package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import java.util.HashMap;
import java.util.Map;

public abstract class SentryBaseEvent {
    private final Contexts contexts;
    private String environment;
    private SentryId eventId;
    private String release;
    private Request request;
    private SdkVersion sdk;
    private Map<String, String> tags;
    public transient Throwable throwable;

    public SentryBaseEvent(SentryId sentryId) {
        this.contexts = new Contexts();
        this.eventId = sentryId;
    }

    public Contexts getContexts() {
        return this.contexts;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public Throwable getOriginThrowable() {
        Throwable th = this.throwable;
        return th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).getThrowable() : th;
    }

    public String getRelease() {
        return this.release;
    }

    public Request getRequest() {
        return this.request;
    }

    public SdkVersion getSdk() {
        return this.sdk;
    }

    public String getTag(String str) {
        Map<String, String> map = this.tags;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public void removeTag(String str) {
        Map<String, String> map = this.tags;
        if (map != null) {
            map.remove(str);
        }
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setEventId(SentryId sentryId) {
        this.eventId = sentryId;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setRequest(Request request2) {
        this.request = request2;
    }

    public void setSdk(SdkVersion sdkVersion) {
        this.sdk = sdkVersion;
    }

    public void setTag(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        this.tags.put(str, str2);
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public SentryBaseEvent() {
        this(new SentryId());
    }
}
