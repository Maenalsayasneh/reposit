package io.sentry;

import i0.d.a.a.a;
import io.sentry.Scope;
import io.sentry.Stack;
import io.sentry.hints.SessionEndHint;
import io.sentry.hints.SessionStartHint;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.List;
import java.util.WeakHashMap;
import k0.c.d;
import org.jetbrains.annotations.ApiStatus;

public final class Hub implements IHub {
    private volatile boolean isEnabled;
    private volatile SentryId lastEventId;
    private final SentryOptions options;
    private final Stack stack;
    private final WeakHashMap<Throwable, ISpan> throwableToSpan;
    private final TracesSampler tracesSampler;

    public Hub(SentryOptions sentryOptions) {
        this(sentryOptions, createRootStackItem(sentryOptions));
    }

    private void assignTraceContext(SentryEvent sentryEvent) {
        ISpan iSpan;
        if (sentryEvent.getThrowable() != null && (iSpan = this.throwableToSpan.get(sentryEvent.getThrowable())) != null && sentryEvent.getContexts().getTrace() == null) {
            sentryEvent.getContexts().setTrace(iSpan.getSpanContext());
        }
    }

    private static Stack.StackItem createRootStackItem(SentryOptions sentryOptions) {
        validateOptions(sentryOptions);
        return new Stack.StackItem(sentryOptions, new SentryClient(sentryOptions), new Scope(sentryOptions));
    }

    private static void validateOptions(SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub is no DSN is available.");
        }
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (breadcrumb == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().addBreadcrumb(breadcrumb, obj);
        }
    }

    public void bindClient(ISentryClient iSentryClient) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'bindClient' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        if (iSentryClient != null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "New client bound to scope.", new Object[0]);
            peek.setClient(iSentryClient);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "NoOp client bound to scope.", new Object[0]);
        peek.setClient(NoOpSentryClient.getInstance());
    }

    @ApiStatus.Internal
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        } else {
            try {
                sentryId = this.stack.peek().getClient().captureEnvelope(sentryEnvelope, obj);
            } catch (Exception e) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing envelope.", (Throwable) e);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
        } else if (sentryEvent == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureEvent called with null parameter.", new Object[0]);
        } else {
            try {
                assignTraceContext(sentryEvent);
                Stack.StackItem peek = this.stack.peek();
                sentryId = peek.getClient().captureEvent(sentryEvent, peek.getScope(), obj);
            } catch (Exception e) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                StringBuilder P0 = a.P0("Error while capturing event with id: ");
                P0.append(sentryEvent.getEventId());
                logger.log(sentryLevel, P0.toString(), (Throwable) e);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    public SentryId captureException(Throwable th, Object obj) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                SentryEvent sentryEvent = new SentryEvent(th);
                assignTraceContext(sentryEvent);
                sentryId = peek.getClient().captureEvent(sentryEvent, peek.getScope(), obj);
            } catch (Exception e) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                StringBuilder P0 = a.P0("Error while capturing exception: ");
                P0.append(th.getMessage());
                logger.log(sentryLevel, P0.toString(), (Throwable) e);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                Stack.StackItem peek = this.stack.peek();
                sentryId = peek.getClient().captureMessage(str, sentryLevel, peek.getScope());
            } catch (Exception e) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel2 = SentryLevel.ERROR;
                logger.log(sentryLevel2, "Error while capturing message: " + str, (Throwable) e);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    @ApiStatus.Internal
    public SentryId captureTransaction(ITransaction iTransaction, Object obj) {
        Scope scope;
        d dVar;
        Objects.requireNonNull(iTransaction, "transaction is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else {
            if (!iTransaction.isFinished()) {
                this.options.getLogger().log(SentryLevel.WARNING, "Capturing unfinished transaction: %s", iTransaction.getEventId());
            }
            if (!Boolean.TRUE.equals(iTransaction.isSampled())) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", iTransaction.getEventId());
            } else {
                Stack.StackItem stackItem = null;
                try {
                    Stack.StackItem peek = this.stack.peek();
                    sentryId = peek.getClient().captureTransaction(iTransaction, peek.getScope(), obj);
                    scope = peek.getScope();
                    dVar = new d(iTransaction, scope);
                } catch (Exception e) {
                    ILogger logger = this.options.getLogger();
                    SentryLevel sentryLevel = SentryLevel.ERROR;
                    logger.log(sentryLevel, "Error while capturing transaction with id: " + iTransaction.getEventId(), (Throwable) e);
                    if (stackItem != null) {
                        scope = stackItem.getScope();
                        dVar = new d(iTransaction, scope);
                    }
                } catch (Throwable th) {
                    if (stackItem != null) {
                        Scope scope2 = stackItem.getScope();
                        scope2.withTransaction(new d(iTransaction, scope2));
                    }
                    throw th;
                }
                scope.withTransaction(dVar);
            }
        }
        this.lastEventId = sentryId;
        return sentryId;
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureUserFeedback' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.stack.peek().getClient().captureUserFeedback(userFeedback);
        } catch (Exception e) {
            ILogger logger = this.options.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            StringBuilder P0 = a.P0("Error while capturing captureUserFeedback: ");
            P0.append(userFeedback.toString());
            logger.log(sentryLevel, P0.toString(), (Throwable) e);
        }
    }

    public void clearBreadcrumbs() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'clearBreadcrumbs' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().clearBreadcrumbs();
        }
    }

    public void close() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration next : this.options.getIntegrations()) {
                if (next instanceof Closeable) {
                    ((Closeable) next).close();
                }
            }
            this.options.getExecutorService().close(this.options.getShutdownTimeout());
            this.stack.peek().getClient().close();
        } catch (Exception e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while closing the Hub.", (Throwable) e);
        }
        this.isEnabled = false;
    }

    public void configureScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            scopeCallback.run(this.stack.peek().getScope());
        } catch (Exception e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'configureScope' callback.", (Throwable) e);
        }
    }

    public void endSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        Session endSession = peek.getScope().endSession();
        if (endSession != null) {
            peek.getClient().captureSession(endSession, new SessionEndHint());
        }
    }

    public void flush(long j) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.stack.peek().getClient().flush(j);
        } catch (Exception e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'client.flush'.", (Throwable) e);
        }
    }

    public SentryId getLastEventId() {
        return this.lastEventId;
    }

    public SentryOptions getOptions() {
        return this.stack.peek().getOptions();
    }

    public ISpan getSpan() {
        if (isEnabled()) {
            return this.stack.peek().getScope().getSpan();
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    public SpanContext getSpanContext(Throwable th) {
        Objects.requireNonNull(th, "throwable is required");
        ISpan iSpan = this.throwableToSpan.get(th);
        if (iSpan != null) {
            return iSpan.getSpanContext();
        }
        return null;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void popScope() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
        } else {
            this.stack.pop();
        }
    }

    public void pushScope() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        Scope scope = null;
        try {
            scope = peek.getScope().clone();
        } catch (CloneNotSupportedException e) {
            this.options.getLogger().log(SentryLevel.ERROR, "An error has occurred when cloning a Scope", (Throwable) e);
        }
        if (scope != null) {
            this.stack.push(new Stack.StackItem(this.options, peek.getClient(), scope));
        }
    }

    public void removeExtra(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeExtra' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "removeExtra called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().removeExtra(str);
        }
    }

    public void removeTag(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        } else if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "removeTag called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().removeTag(str);
        }
    }

    public void setExtra(String str, String str2) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setExtra called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setExtra(str, str2);
        }
    }

    public void setFingerprint(List<String> list) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setFingerprint' call is a no-op.", new Object[0]);
        } else if (list == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setFingerprint called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setFingerprint(list);
        }
    }

    public void setLevel(SentryLevel sentryLevel) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setLevel' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setLevel(sentryLevel);
        }
    }

    @ApiStatus.Internal
    public void setSpanContext(Throwable th, ISpan iSpan) {
        Objects.requireNonNull(th, "throwable is required");
        Objects.requireNonNull(iSpan, "span is required");
        this.throwableToSpan.put(th, iSpan);
    }

    public void setTag(String str, String str2) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setTag(str, str2);
        }
    }

    public void setTransaction(String str) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTransaction' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setTransaction(str);
        }
    }

    public void setUser(User user) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setUser(user);
        }
    }

    public void startSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem peek = this.stack.peek();
        Scope.SessionPair startSession = peek.getScope().startSession();
        if (startSession.getPrevious() != null) {
            peek.getClient().captureSession(startSession.getPrevious(), new SessionEndHint());
        }
        peek.getClient().captureSession(startSession.getCurrent(), new SessionStartHint());
    }

    public ITransaction startTransaction(TransactionContext transactionContext) {
        return startTransaction(transactionContext, (CustomSamplingContext) null);
    }

    public SentryTraceHeader traceHeaders() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'traceHeaders' call is a no-op.", new Object[0]);
        } else {
            ISpan span = this.stack.peek().getScope().getSpan();
            if (span != null) {
                return span.toSentryTrace();
            }
        }
        return null;
    }

    public void withScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'withScope' call is a no-op.", new Object[0]);
            return;
        }
        pushScope();
        try {
            scopeCallback.run(this.stack.peek().getScope());
        } catch (Exception e) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", (Throwable) e);
        }
        popScope();
    }

    private Hub(SentryOptions sentryOptions, Stack stack2) {
        this.throwableToSpan = new WeakHashMap<>();
        validateOptions(sentryOptions);
        this.options = sentryOptions;
        this.tracesSampler = new TracesSampler(sentryOptions);
        this.stack = stack2;
        this.lastEventId = SentryId.EMPTY_ID;
        this.isEnabled = true;
    }

    public IHub clone() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new Hub(this.options, new Stack(this.stack));
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        Objects.requireNonNull(transactionContext, "transactionContext is required");
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            return NoOpTransaction.getInstance();
        }
        transactionContext.setSampled(Boolean.valueOf(this.tracesSampler.sample(new SamplingContext(transactionContext, customSamplingContext))));
        return new SentryTransaction(transactionContext, (IHub) this);
    }

    private Hub(SentryOptions sentryOptions, Stack.StackItem stackItem) {
        this(sentryOptions, new Stack(sentryOptions.getLogger(), stackItem));
    }
}
