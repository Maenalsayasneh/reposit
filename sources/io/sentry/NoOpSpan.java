package io.sentry;

import io.sentry.protocol.SentryId;

public final class NoOpSpan implements ISpan {
    private static final NoOpSpan instance = new NoOpSpan();

    private NoOpSpan() {
    }

    public static NoOpSpan getInstance() {
        return instance;
    }

    public void finish() {
    }

    public void finish(SpanStatus spanStatus) {
    }

    public String getDescription() {
        return null;
    }

    public String getOperation() {
        return "";
    }

    public SpanContext getSpanContext() {
        return new SpanContext(SentryId.EMPTY_ID, SpanId.EMPTY_ID, "op", (SpanId) null, (Boolean) null);
    }

    public SpanStatus getStatus() {
        return null;
    }

    public Throwable getThrowable() {
        return null;
    }

    public boolean isFinished() {
        return false;
    }

    public void setDescription(String str) {
    }

    public void setOperation(String str) {
    }

    public void setStatus(SpanStatus spanStatus) {
    }

    public void setTag(String str, String str2) {
    }

    public void setThrowable(Throwable th) {
    }

    public ISpan startChild(String str) {
        return getInstance();
    }

    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, Boolean.FALSE);
    }

    public ISpan startChild(String str, String str2) {
        return getInstance();
    }
}
