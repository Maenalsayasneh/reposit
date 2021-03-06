package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SpanContext implements Cloneable {
    public static final String TYPE = "trace";
    public String description;
    public String op;
    private final SpanId parentSpanId;
    private transient Boolean sampled;
    private final SpanId spanId;
    public SpanStatus status;
    public Map<String, String> tags;
    private final SentryId traceId;

    public SpanContext(String str, Boolean bool) {
        this(new SentryId(), new SpanId(), str, (SpanId) null, bool);
    }

    public String getDescription() {
        return this.description;
    }

    public String getOperation() {
        return this.op;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public Boolean getSampled() {
        return this.sampled;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SpanStatus getStatus() {
        return this.status;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setOperation(String str) {
        this.op = (String) Objects.requireNonNull(str, "operation is required");
    }

    public void setSampled(Boolean bool) {
        this.sampled = bool;
    }

    public void setStatus(SpanStatus spanStatus) {
        this.status = spanStatus;
    }

    public void setTag(String str, String str2) {
        Objects.requireNonNull(str, "name is required");
        Objects.requireNonNull(str2, "value is required");
        this.tags.put(str, str2);
    }

    public SpanContext(String str) {
        this(new SentryId(), new SpanId(), str, (SpanId) null, (Boolean) null);
    }

    public SpanContext clone() throws CloneNotSupportedException {
        SpanContext spanContext = (SpanContext) super.clone();
        spanContext.tags = CollectionUtils.shallowCopy(this.tags);
        return spanContext;
    }

    public SpanContext(SentryId sentryId, SpanId spanId2, String str, SpanId spanId3, Boolean bool) {
        this.tags = new ConcurrentHashMap();
        this.traceId = (SentryId) Objects.requireNonNull(sentryId, "traceId is required");
        this.spanId = (SpanId) Objects.requireNonNull(spanId2, "spanId is required");
        this.op = (String) Objects.requireNonNull(str, "operation is required");
        this.parentSpanId = spanId3;
        this.sampled = bool;
    }
}
