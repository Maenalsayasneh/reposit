package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class SentryTransaction extends SentryBaseEvent implements ITransaction {
    private final transient SpanContext context;
    private final transient AtomicBoolean finished;
    private final transient IHub hub;
    private final List<Span> spans;
    private final Date startTimestamp;
    private Date timestamp;
    private String transaction;
    private final String type;

    public SentryTransaction(String str, String str2) {
        this(str, new SpanContext(str2), (IHub) NoOpHub.getInstance());
    }

    public void finish() {
        finish(getStatus());
    }

    public SpanContext getContext() {
        return this.context;
    }

    public String getDescription() {
        return this.context.getDescription();
    }

    public Span getLatestActiveSpan() {
        ArrayList arrayList = new ArrayList(this.spans);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((Span) arrayList.get(size)).isFinished()) {
                return (Span) arrayList.get(size);
            }
        }
        return null;
    }

    public String getName() {
        return this.transaction;
    }

    public String getOperation() {
        return this.context.getOperation();
    }

    public SpanContext getSpanContext() {
        return this.context;
    }

    public SpanId getSpanId() {
        return this.context.getSpanId();
    }

    public List<Span> getSpans() {
        return this.spans;
    }

    public Date getStartTimestamp() {
        return this.startTimestamp;
    }

    public SpanStatus getStatus() {
        return this.context.getStatus();
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public SentryId getTraceId() {
        return this.context.getTraceId();
    }

    @ApiStatus.Internal
    public String getTransaction() {
        return this.transaction;
    }

    public boolean isFinished() {
        return this.finished.get();
    }

    public Boolean isSampled() {
        return this.context.getSampled();
    }

    public void setDescription(String str) {
        this.context.setDescription(str);
    }

    public void setName(String str) {
        Objects.requireNonNull(str, "name is required");
        this.transaction = str;
    }

    public void setOperation(String str) {
        this.context.setOperation(str);
    }

    public void setStatus(SpanStatus spanStatus) {
        this.context.setStatus(spanStatus);
    }

    public ISpan startChild(String str) {
        return startChild(str, (String) null);
    }

    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(getTraceId(), getSpanId(), isSampled());
    }

    public SentryTransaction(String str, String str2, IHub iHub) {
        this(str, new SpanContext(str2), iHub);
    }

    public void finish(SpanStatus spanStatus) {
        if (this.finished.compareAndSet(false, true)) {
            setStatus(spanStatus);
            this.timestamp = DateUtils.getCurrentDateTime();
            Throwable th = this.throwable;
            if (th != null) {
                this.hub.setSpanContext(th, this);
            }
            getContexts().setTrace(this.context);
            this.hub.captureTransaction(this, (Object) null);
        }
    }

    public ISpan startChild(String str, String str2) {
        return startChild(getSpanId(), str, str2);
    }

    public SentryTransaction(TransactionContext transactionContext, IHub iHub) {
        this(transactionContext.getName(), (SpanContext) transactionContext, iHub);
    }

    private ISpan startChild(SpanId spanId, String str) {
        Objects.requireNonNull(spanId, "parentSpanId is required");
        Objects.requireNonNull(str, "operation is required");
        Span span = new Span(getTraceId(), spanId, this, str, this.hub);
        this.spans.add(span);
        return span;
    }

    public SentryTransaction(String str, SpanContext spanContext, IHub iHub) {
        this.spans = new CopyOnWriteArrayList();
        this.finished = new AtomicBoolean(false);
        this.type = "transaction";
        this.transaction = (String) Objects.requireNonNull(str, "name is required");
        this.startTimestamp = DateUtils.getCurrentDateTime();
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
        this.context = (SpanContext) Objects.requireNonNull(spanContext, "contexts is required");
    }

    public ISpan startChild(SpanId spanId, String str, String str2) {
        ISpan startChild = startChild(spanId, str);
        startChild.setDescription(str2);
        return startChild;
    }
}
