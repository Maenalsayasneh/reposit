package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import java.util.Collections;
import java.util.List;

public final class NoOpTransaction implements ITransaction {
    private static final NoOpTransaction instance = new NoOpTransaction();

    private NoOpTransaction() {
    }

    public static NoOpTransaction getInstance() {
        return instance;
    }

    public void finish() {
    }

    public void finish(SpanStatus spanStatus) {
    }

    public Contexts getContexts() {
        return new Contexts();
    }

    public String getDescription() {
        return null;
    }

    public SentryId getEventId() {
        return null;
    }

    public Span getLatestActiveSpan() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getOperation() {
        return "";
    }

    public Request getRequest() {
        return null;
    }

    public SpanContext getSpanContext() {
        return new SpanContext(SentryId.EMPTY_ID, SpanId.EMPTY_ID, "op", (SpanId) null, (Boolean) null);
    }

    public List<Span> getSpans() {
        return Collections.emptyList();
    }

    public SpanStatus getStatus() {
        return null;
    }

    public Throwable getThrowable() {
        return null;
    }

    public String getTransaction() {
        return null;
    }

    public boolean isFinished() {
        return true;
    }

    public Boolean isSampled() {
        return null;
    }

    public void setDescription(String str) {
    }

    public void setName(String str) {
    }

    public void setOperation(String str) {
    }

    public void setRequest(Request request) {
    }

    public void setStatus(SpanStatus spanStatus) {
    }

    public void setTag(String str, String str2) {
    }

    public void setThrowable(Throwable th) {
    }

    public ISpan startChild(String str) {
        return NoOpSpan.getInstance();
    }

    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, Boolean.FALSE);
    }

    public ISpan startChild(String str, String str2) {
        return NoOpSpan.getInstance();
    }
}
