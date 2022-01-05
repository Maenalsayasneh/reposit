package io.sentry;

import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ITransport;
import io.sentry.util.ApplyScopeUtils;
import io.sentry.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k0.c.i;
import org.jetbrains.annotations.ApiStatus;

public final class SentryClient implements ISentryClient {
    public static final String SENTRY_PROTOCOL_VERSION = "7";
    private boolean enabled;
    private final SentryOptions options;
    private final Random random;
    private final SortBreadcrumbsByDate sortBreadcrumbsByDate = new SortBreadcrumbsByDate();
    private final ITransport transport;

    public static final class SortBreadcrumbsByDate implements Comparator<Breadcrumb> {
        private SortBreadcrumbsByDate() {
        }

        public int compare(Breadcrumb breadcrumb, Breadcrumb breadcrumb2) {
            return breadcrumb.getTimestamp().compareTo(breadcrumb2.getTimestamp());
        }
    }

    public SentryClient(SentryOptions sentryOptions) {
        Random random2 = null;
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.enabled = true;
        ITransportFactory transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof NoOpTransportFactory) {
            transportFactory = new AsyncHttpTransportFactory();
            sentryOptions.setTransportFactory(transportFactory);
        }
        this.transport = transportFactory.create(sentryOptions, new RequestDetailsResolver(sentryOptions).resolve());
        this.random = sentryOptions.getSampleRate() != null ? new Random() : random2;
    }

    private SentryEvent applyScope(SentryEvent sentryEvent, Scope scope, Object obj) {
        if (scope == null) {
            return sentryEvent;
        }
        if (sentryEvent.getTransaction() == null) {
            sentryEvent.setTransaction(scope.getTransactionName());
        }
        if (sentryEvent.getUser() == null) {
            sentryEvent.setUser(scope.getUser());
        }
        if (sentryEvent.getRequest() == null) {
            sentryEvent.setRequest(scope.getRequest());
        }
        if (sentryEvent.getFingerprints() == null) {
            sentryEvent.setFingerprints(scope.getFingerprint());
        }
        if (sentryEvent.getBreadcrumbs() == null) {
            sentryEvent.setBreadcrumbs(new ArrayList(scope.getBreadcrumbs()));
        } else {
            sortBreadcrumbsByDate(sentryEvent, scope.getBreadcrumbs());
        }
        if (sentryEvent.getTags() == null) {
            sentryEvent.setTags(new HashMap(scope.getTags()));
        } else {
            for (Map.Entry next : scope.getTags().entrySet()) {
                if (!sentryEvent.getTags().containsKey(next.getKey())) {
                    sentryEvent.getTags().put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
        if (sentryEvent.getExtras() == null) {
            sentryEvent.setExtras(new HashMap(scope.getExtras()));
        } else {
            for (Map.Entry next2 : scope.getExtras().entrySet()) {
                if (!sentryEvent.getExtras().containsKey(next2.getKey())) {
                    sentryEvent.getExtras().put((String) next2.getKey(), next2.getValue());
                }
            }
        }
        try {
            for (Map.Entry entry : scope.getContexts().clone().entrySet()) {
                if (!sentryEvent.getContexts().containsKey(entry.getKey())) {
                    sentryEvent.getContexts().put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (CloneNotSupportedException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "An error has occurred when cloning Contexts", (Throwable) e);
        }
        if (scope.getLevel() != null) {
            sentryEvent.setLevel(scope.getLevel());
        }
        ISpan span = scope.getSpan();
        if (sentryEvent.getContexts().getTrace() == null && span != null) {
            sentryEvent.getContexts().setTrace(span.getSpanContext());
        }
        return processEvent(sentryEvent, obj, scope.getEventProcessors());
    }

    private SentryEnvelope buildEnvelope(SentryBaseEvent sentryBaseEvent, List<Attachment> list) throws IOException {
        return buildEnvelope(sentryBaseEvent, list, (Session) null);
    }

    private SentryEvent executeBeforeSend(SentryEvent sentryEvent, Object obj) {
        SentryOptions.BeforeSendCallback beforeSend = this.options.getBeforeSend();
        if (beforeSend == null) {
            return sentryEvent;
        }
        try {
            return beforeSend.execute(sentryEvent, obj);
        } catch (Exception e) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", (Throwable) e);
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setMessage("BeforeSend callback failed.");
            breadcrumb.setCategory("SentryClient");
            breadcrumb.setLevel(SentryLevel.ERROR);
            breadcrumb.setData("sentry:message", e.getMessage());
            sentryEvent.addBreadcrumb(breadcrumb);
            return sentryEvent;
        }
    }

    private List<Attachment> filterForTransaction(List<Attachment> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Attachment next : list) {
            if (next.isAddToTransactions()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private List<Attachment> getAttachmentsFromScope(Scope scope) {
        if (scope != null) {
            return scope.getAttachments();
        }
        return null;
    }

    private SentryEvent processEvent(SentryEvent sentryEvent, Object obj, List<EventProcessor> list) {
        Iterator<EventProcessor> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EventProcessor next = it.next();
            try {
                sentryEvent = next.process(sentryEvent, obj);
                continue;
            } catch (Exception e) {
                this.options.getLogger().log(SentryLevel.ERROR, e, "An exception occurred while processing event by processor: %s", next.getClass().getName());
                continue;
            }
            if (sentryEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                break;
            }
        }
        return sentryEvent;
    }

    private SentryTransaction processTransaction(SentryTransaction sentryTransaction) {
        if (sentryTransaction.getRelease() == null) {
            sentryTransaction.setRelease(this.options.getRelease());
        }
        if (sentryTransaction.getEnvironment() == null) {
            sentryTransaction.setEnvironment(this.options.getEnvironment());
        }
        if (sentryTransaction.getTags() == null) {
            sentryTransaction.setTags(new HashMap(this.options.getTags()));
        } else {
            for (Map.Entry next : this.options.getTags().entrySet()) {
                if (!sentryTransaction.getTags().containsKey(next.getKey())) {
                    sentryTransaction.setTag((String) next.getKey(), (String) next.getValue());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Span next2 : sentryTransaction.getSpans()) {
            if (!next2.isFinished()) {
                arrayList.add(next2);
            }
        }
        if (!arrayList.isEmpty()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Dropping %d unfinished spans", Integer.valueOf(arrayList.size()));
        }
        sentryTransaction.getSpans().removeAll(arrayList);
        return sentryTransaction;
    }

    private boolean sample() {
        if (this.options.getSampleRate() == null || this.random == null || this.options.getSampleRate().doubleValue() >= this.random.nextDouble()) {
            return true;
        }
        return false;
    }

    private void sortBreadcrumbsByDate(SentryEvent sentryEvent, Collection<Breadcrumb> collection) {
        List<Breadcrumb> breadcrumbs = sentryEvent.getBreadcrumbs();
        if (!collection.isEmpty()) {
            breadcrumbs.addAll(collection);
            Collections.sort(breadcrumbs, this.sortBreadcrumbsByDate);
        }
    }

    public /* synthetic */ void a(SentryEvent sentryEvent, Object obj, Session session) {
        boolean z = false;
        if (session != null) {
            String str = null;
            Session.State state = sentryEvent.isCrashed() ? Session.State.Crashed : null;
            if (Session.State.Crashed == state || sentryEvent.isErrored()) {
                z = true;
            }
            if (!(sentryEvent.getRequest() == null || sentryEvent.getRequest().getHeaders() == null || !sentryEvent.getRequest().getHeaders().containsKey("user-agent"))) {
                str = sentryEvent.getRequest().getHeaders().get("user-agent");
            }
            if (session.update(state, str, z) && (obj instanceof DiskFlushNotification)) {
                session.end();
                return;
            }
            return;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    @ApiStatus.Internal
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        try {
            this.transport.send(sentryEnvelope, obj);
            return sentryEnvelope.getHeader().getEventId();
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope.", (Throwable) e);
            return SentryId.EMPTY_ID;
        }
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj) {
        Objects.requireNonNull(sentryEvent, "SentryEvent is required.");
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing event: %s", sentryEvent.getEventId());
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            sentryEvent = applyScope(sentryEvent, scope, obj);
            if (sentryEvent == null) {
                this.options.getLogger().log(sentryLevel, "Event was dropped by applyScope", new Object[0]);
            }
        } else {
            this.options.getLogger().log(sentryLevel, "Event was cached so not applying scope: %s", sentryEvent.getEventId());
        }
        SentryEvent processEvent = processEvent(sentryEvent, obj, this.options.getEventProcessors());
        Session session = null;
        if (processEvent != null) {
            Session updateSessionData = updateSessionData(processEvent, obj, scope);
            if (!sample()) {
                this.options.getLogger().log(sentryLevel, "Event %s was dropped due to sampling decision.", processEvent.getEventId());
                processEvent = null;
            }
            session = updateSessionData;
        }
        if (processEvent != null && (processEvent = executeBeforeSend(processEvent, obj)) == null) {
            this.options.getLogger().log(sentryLevel, "Event was dropped by beforeSend", new Object[0]);
        }
        SentryId sentryId = SentryId.EMPTY_ID;
        if (processEvent != null) {
            sentryId = processEvent.getEventId();
        }
        try {
            SentryEnvelope buildEnvelope = buildEnvelope(processEvent, getAttachmentsFromScope(scope), session);
            if (buildEnvelope == null) {
                return sentryId;
            }
            this.transport.send(buildEnvelope, obj);
            return sentryId;
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing event %s failed.", sentryId);
            return SentryId.EMPTY_ID;
        }
    }

    @ApiStatus.Internal
    public void captureSession(Session session, Object obj) {
        Objects.requireNonNull(session, "Session is required.");
        if (session.getRelease() == null || session.getRelease().isEmpty()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            captureEnvelope(SentryEnvelope.from(this.options.getSerializer(), session, this.options.getSdkVersion()), obj);
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to capture session.", (Throwable) e);
        }
    }

    public SentryId captureTransaction(ITransaction iTransaction, Scope scope, Object obj) {
        Objects.requireNonNull(iTransaction, "Transaction is required.");
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "Capturing transaction: %s", iTransaction.getEventId());
        SentryId eventId = iTransaction.getEventId();
        if (iTransaction instanceof SentryTransaction) {
            try {
                SentryEnvelope buildEnvelope = buildEnvelope(processTransaction((SentryTransaction) iTransaction), filterForTransaction(getAttachmentsFromScope(scope)));
                if (buildEnvelope == null) {
                    return SentryId.EMPTY_ID;
                }
                this.transport.send(buildEnvelope, obj);
                return eventId;
            } catch (IOException e) {
                this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing transaction %s failed.", eventId);
                return SentryId.EMPTY_ID;
            }
        } else {
            this.options.getLogger().log(sentryLevel, "Captured a NoOpTransaction %s", eventId);
            return eventId;
        }
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
        Objects.requireNonNull(userFeedback, "SentryEvent is required.");
        if (SentryId.EMPTY_ID.equals(userFeedback.getEventId())) {
            this.options.getLogger().log(SentryLevel.WARNING, "Capturing userFeedback without a Sentry Id.", new Object[0]);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Capturing userFeedback: %s", userFeedback.getEventId());
        try {
            this.transport.send(buildEnvelope(userFeedback));
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.WARNING, e, "Capturing user feedback %s failed.", userFeedback.getEventId());
        }
    }

    public void close() {
        this.options.getLogger().log(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        try {
            flush(this.options.getShutdownTimeout());
            this.transport.close();
        } catch (IOException e) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", (Throwable) e);
        }
        this.enabled = false;
    }

    public void flush(long j) {
        this.transport.flush(j);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public Session updateSessionData(SentryEvent sentryEvent, Object obj, Scope scope) {
        if (ApplyScopeUtils.shouldApplyScopeData(obj)) {
            if (scope != null) {
                return scope.withSession(new i(this, sentryEvent, obj));
            }
            this.options.getLogger().log(SentryLevel.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    private SentryEnvelope buildEnvelope(SentryBaseEvent sentryBaseEvent, List<Attachment> list, Session session) throws IOException {
        SentryId sentryId;
        ArrayList arrayList = new ArrayList();
        if (sentryBaseEvent != null) {
            arrayList.add(SentryEnvelopeItem.fromEvent(this.options.getSerializer(), sentryBaseEvent));
            sentryId = sentryBaseEvent.getEventId();
        } else {
            sentryId = null;
        }
        if (session != null) {
            arrayList.add(SentryEnvelopeItem.fromSession(this.options.getSerializer(), session));
        }
        if (list != null) {
            for (Attachment fromAttachment : list) {
                arrayList.add(SentryEnvelopeItem.fromAttachment(fromAttachment, this.options.getMaxAttachmentSize()));
            }
        }
        if (!arrayList.isEmpty()) {
            return new SentryEnvelope(new SentryEnvelopeHeader(sentryId, this.options.getSdkVersion()), arrayList);
        }
        return null;
    }

    private SentryEnvelope buildEnvelope(UserFeedback userFeedback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SentryEnvelopeItem.fromUserFeedback(this.options.getSerializer(), userFeedback));
        return new SentryEnvelope(new SentryEnvelopeHeader(userFeedback.getEventId(), this.options.getSdkVersion()), arrayList);
    }
}
