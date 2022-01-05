package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Span extends SpanContext implements ISpan {
    private final transient AtomicBoolean finished = new AtomicBoolean(false);
    private final transient IHub hub;
    private final Date startTimestamp;
    private transient Throwable throwable;
    private Date timestamp;
    private final transient SentryTransaction transaction;

    public Span(SentryId sentryId, SpanId spanId, SentryTransaction sentryTransaction, String str, IHub iHub) {
        super(sentryId, new SpanId(), str, spanId, sentryTransaction.isSampled());
        this.transaction = (SentryTransaction) Objects.requireNonNull(sentryTransaction, "transaction is required");
        this.startTimestamp = DateUtils.getCurrentDateTime();
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
    }

    public void finish() {
        finish(this.status);
    }

    public SpanContext getSpanContext() {
        return this;
    }

    public Date getStartTimestamp() {
        return this.startTimestamp;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public boolean isFinished() {
        return this.finished.get();
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public ISpan startChild(String str) {
        return startChild(str, (String) null);
    }

    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(getTraceId(), getSpanId(), getSampled());
    }

    public void finish(SpanStatus spanStatus) {
        if (this.finished.compareAndSet(false, true)) {
            this.status = spanStatus;
            this.timestamp = DateUtils.getCurrentDateTime();
            Throwable th = this.throwable;
            if (th != null) {
                this.hub.setSpanContext(th, this);
            }
        }
    }

    public ISpan startChild(String str, String str2) {
        return this.transaction.startChild(super.getSpanId(), str, str2);
    }
}
