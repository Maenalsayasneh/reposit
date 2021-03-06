package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

public final class SentryException implements IUnknownPropertiesConsumer {
    private Mechanism mechanism;
    private String module;
    private SentryStackTrace stacktrace;
    private Long threadId;
    private String type;
    private Map<String, Object> unknown;
    private String value;

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public Mechanism getMechanism() {
        return this.mechanism;
    }

    public String getModule() {
        return this.module;
    }

    public SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public Long getThreadId() {
        return this.threadId;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setMechanism(Mechanism mechanism2) {
        this.mechanism = mechanism2;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setStacktrace(SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public void setThreadId(Long l) {
        this.threadId = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
