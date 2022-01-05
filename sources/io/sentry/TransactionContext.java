package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;

public final class TransactionContext extends SpanContext {
    private final String name;
    private Boolean parentSampled;

    public TransactionContext(String str, String str2) {
        super(str2);
        this.name = (String) Objects.requireNonNull(str, "name is required");
        this.parentSampled = null;
    }

    public static TransactionContext fromSentryTrace(String str, String str2, SentryTraceHeader sentryTraceHeader) {
        return new TransactionContext(str, str2, sentryTraceHeader.getTraceId(), new SpanId(), sentryTraceHeader.getSpanId(), sentryTraceHeader.isSampled());
    }

    public String getName() {
        return this.name;
    }

    public Boolean getParentSampled() {
        return this.parentSampled;
    }

    public void setParentSampled(Boolean bool) {
        this.parentSampled = bool;
    }

    public TransactionContext(String str, String str2, Boolean bool) {
        super(str2);
        this.name = (String) Objects.requireNonNull(str, "name is required");
        setSampled(bool);
    }

    private TransactionContext(String str, String str2, SentryId sentryId, SpanId spanId, SpanId spanId2, Boolean bool) {
        super(sentryId, spanId, str2, spanId2, (Boolean) null);
        this.name = (String) Objects.requireNonNull(str, "name is required");
        this.parentSampled = bool;
    }
}
