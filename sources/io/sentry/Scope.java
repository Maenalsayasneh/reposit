package io.sentry;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import io.sentry.SentryOptions;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;

public final class Scope implements Cloneable {
    private List<Attachment> attachments = new CopyOnWriteArrayList();
    private Queue<Breadcrumb> breadcrumbs;
    private Contexts contexts = new Contexts();
    private List<EventProcessor> eventProcessors = new CopyOnWriteArrayList();
    private Map<String, Object> extra = new ConcurrentHashMap();
    private List<String> fingerprint = new ArrayList();
    private SentryLevel level;
    private final SentryOptions options;
    private Request request;
    private volatile Session session;
    private final Object sessionLock = new Object();
    private Map<String, String> tags = new ConcurrentHashMap();
    private ITransaction transaction;
    private final Object transactionLock = new Object();
    private String transactionName;
    private User user;

    public interface IWithSession {
        void accept(Session session);
    }

    @ApiStatus.Internal
    public interface IWithTransaction {
        void accept(ITransaction iTransaction);
    }

    public static final class SessionPair {
        private final Session current;
        private final Session previous;

        public SessionPair(Session session, Session session2) {
            this.current = session;
            this.previous = session2;
        }

        public Session getCurrent() {
            return this.current;
        }

        public Session getPrevious() {
            return this.previous;
        }
    }

    public Scope(SentryOptions sentryOptions) {
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.options = sentryOptions2;
        this.breadcrumbs = createBreadcrumbsList(sentryOptions2.getMaxBreadcrumbs());
    }

    private Queue<Breadcrumb> createBreadcrumbsList(int i) {
        return SynchronizedQueue.synchronizedQueue(new CircularFifoQueue(i));
    }

    private Breadcrumb executeBeforeBreadcrumb(SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback, Breadcrumb breadcrumb, Object obj) {
        try {
            return beforeBreadcrumbCallback.execute(breadcrumb, obj);
        } catch (Exception e) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. It will be added as breadcrumb and continue.", (Throwable) e);
            breadcrumb.setData("sentry:message", e.getMessage());
            return breadcrumb;
        }
    }

    public void addAttachment(Attachment attachment) {
        this.attachments.add(attachment);
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        if (breadcrumb != null) {
            SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumb = this.options.getBeforeBreadcrumb();
            if (beforeBreadcrumb != null) {
                breadcrumb = executeBeforeBreadcrumb(beforeBreadcrumb, breadcrumb, obj);
            }
            if (breadcrumb != null) {
                this.breadcrumbs.add(breadcrumb);
                if (this.options.isEnableScopeSync()) {
                    for (IScopeObserver addBreadcrumb : this.options.getScopeObservers()) {
                        addBreadcrumb.addBreadcrumb(breadcrumb);
                    }
                    return;
                }
                return;
            }
            this.options.getLogger().log(SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
        }
    }

    public void addEventProcessor(EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    public void clear() {
        this.level = null;
        this.user = null;
        this.request = null;
        this.fingerprint.clear();
        this.breadcrumbs.clear();
        this.tags.clear();
        this.extra.clear();
        this.eventProcessors.clear();
        clearTransaction();
        this.attachments.clear();
    }

    public void clearBreadcrumbs() {
        this.breadcrumbs.clear();
    }

    public void clearTransaction() {
        synchronized (this.transactionLock) {
            this.transaction = null;
        }
        this.transactionName = null;
    }

    public Session endSession() {
        Session session2;
        synchronized (this.sessionLock) {
            session2 = null;
            if (this.session != null) {
                this.session.end();
                Session clone = this.session.clone();
                this.session = null;
                session2 = clone;
            }
        }
        return session2;
    }

    public List<Attachment> getAttachments() {
        return new CopyOnWriteArrayList(this.attachments);
    }

    public Queue<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public Contexts getContexts() {
        return this.contexts;
    }

    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    public Map<String, Object> getExtras() {
        return this.extra;
    }

    public List<String> getFingerprint() {
        return this.fingerprint;
    }

    public SentryLevel getLevel() {
        return this.level;
    }

    public Request getRequest() {
        return this.request;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r0.getLatestActiveSpan();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.ISpan getSpan() {
        /*
            r2 = this;
            io.sentry.ITransaction r0 = r2.transaction
            if (r0 == 0) goto L_0x000b
            io.sentry.Span r1 = r0.getLatestActiveSpan()
            if (r1 == 0) goto L_0x000b
            return r1
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Scope.getSpan():io.sentry.ISpan");
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public ITransaction getTransaction() {
        return this.transaction;
    }

    public String getTransactionName() {
        ITransaction iTransaction = this.transaction;
        return iTransaction != null ? iTransaction.getTransaction() : this.transactionName;
    }

    public User getUser() {
        return this.user;
    }

    public void removeContexts(String str) {
        this.contexts.remove(str);
    }

    public void removeExtra(String str) {
        this.extra.remove(str);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver removeExtra : this.options.getScopeObservers()) {
                removeExtra.removeExtra(str);
            }
        }
    }

    public void removeTag(String str) {
        this.tags.remove(str);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver removeTag : this.options.getScopeObservers()) {
                removeTag.removeTag(str);
            }
        }
    }

    public void setContexts(String str, Object obj) {
        this.contexts.put(str, obj);
    }

    public void setExtra(String str, String str2) {
        this.extra.put(str, str2);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver extra2 : this.options.getScopeObservers()) {
                extra2.setExtra(str, str2);
            }
        }
    }

    public void setFingerprint(List<String> list) {
        if (list != null) {
            this.fingerprint = list;
        }
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setRequest(Request request2) {
        this.request = request2;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver tag : this.options.getScopeObservers()) {
                tag.setTag(str, str2);
            }
        }
    }

    public void setTransaction(String str) {
        ITransaction iTransaction = this.transaction;
        if (iTransaction != null) {
            iTransaction.setName(str);
        }
        this.transactionName = str;
    }

    public void setUser(User user2) {
        this.user = user2;
        if (this.options.isEnableScopeSync()) {
            for (IScopeObserver user3 : this.options.getScopeObservers()) {
                user3.setUser(user2);
            }
        }
    }

    public SessionPair startSession() {
        SessionPair sessionPair;
        synchronized (this.sessionLock) {
            if (this.session != null) {
                this.session.end();
            }
            Session session2 = this.session;
            this.session = new Session(this.options.getDistinctId(), this.user, this.options.getEnvironment(), this.options.getRelease());
            sessionPair = new SessionPair(this.session.clone(), session2 != null ? session2.clone() : null);
        }
        return sessionPair;
    }

    public Session withSession(IWithSession iWithSession) {
        Session clone;
        synchronized (this.sessionLock) {
            iWithSession.accept(this.session);
            clone = this.session != null ? this.session.clone() : null;
        }
        return clone;
    }

    @ApiStatus.Internal
    public void withTransaction(IWithTransaction iWithTransaction) {
        synchronized (this.transactionLock) {
            iWithTransaction.accept(this.transaction);
        }
    }

    public Scope clone() throws CloneNotSupportedException {
        Scope scope = (Scope) super.clone();
        SentryLevel sentryLevel = this.level;
        Request request2 = null;
        scope.level = sentryLevel != null ? SentryLevel.valueOf(sentryLevel.name().toUpperCase(Locale.ROOT)) : null;
        User user2 = this.user;
        scope.user = user2 != null ? user2.clone() : null;
        Request request3 = this.request;
        if (request3 != null) {
            request2 = request3.clone();
        }
        scope.request = request2;
        scope.fingerprint = new ArrayList(this.fingerprint);
        scope.eventProcessors = new CopyOnWriteArrayList(this.eventProcessors);
        Queue<Breadcrumb> queue = this.breadcrumbs;
        Queue<Breadcrumb> createBreadcrumbsList = createBreadcrumbsList(this.options.getMaxBreadcrumbs());
        for (Breadcrumb clone : queue) {
            createBreadcrumbsList.add(clone.clone());
        }
        scope.breadcrumbs = createBreadcrumbsList;
        Map<String, String> map = this.tags;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (next != null) {
                concurrentHashMap.put((String) next.getKey(), (String) next.getValue());
            }
        }
        scope.tags = concurrentHashMap;
        Map<String, Object> map2 = this.extra;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry next2 : map2.entrySet()) {
            if (next2 != null) {
                concurrentHashMap2.put((String) next2.getKey(), next2.getValue());
            }
        }
        scope.extra = concurrentHashMap2;
        scope.contexts = this.contexts.clone();
        scope.attachments = new CopyOnWriteArrayList(this.attachments);
        return scope;
    }

    public void setContexts(String str, Boolean bool) {
        HashMap hashMap = new HashMap();
        hashMap.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, bool);
        setContexts(str, (Object) hashMap);
    }

    public void setTransaction(ITransaction iTransaction) {
        synchronized (this.transactionLock) {
            this.transaction = (ITransaction) Objects.requireNonNull(iTransaction, "transaction is required");
        }
    }

    public void setContexts(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, str2);
        setContexts(str, (Object) hashMap);
    }

    public void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, (Object) null);
    }

    public void setContexts(String str, Number number) {
        HashMap hashMap = new HashMap();
        hashMap.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, number);
        setContexts(str, (Object) hashMap);
    }
}
