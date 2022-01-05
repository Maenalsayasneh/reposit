package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

public final class HubAdapter implements IHub {
    private static final HubAdapter INSTANCE = new HubAdapter();

    private HubAdapter() {
    }

    public static HubAdapter getInstance() {
        return INSTANCE;
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
        Sentry.addBreadcrumb(breadcrumb, obj);
    }

    public void bindClient(ISentryClient iSentryClient) {
        Sentry.bindClient(iSentryClient);
    }

    @ApiStatus.Internal
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return Sentry.getCurrentHub().captureEnvelope(sentryEnvelope, obj);
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        return Sentry.captureEvent(sentryEvent, obj);
    }

    public SentryId captureException(Throwable th, Object obj) {
        return Sentry.captureException(th, obj);
    }

    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return Sentry.captureMessage(str, sentryLevel);
    }

    public SentryId captureTransaction(ITransaction iTransaction, Object obj) {
        return Sentry.getCurrentHub().captureTransaction(iTransaction, obj);
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
        Sentry.captureUserFeedback(userFeedback);
    }

    public void clearBreadcrumbs() {
        Sentry.clearBreadcrumbs();
    }

    public void close() {
        Sentry.close();
    }

    public void configureScope(ScopeCallback scopeCallback) {
        Sentry.configureScope(scopeCallback);
    }

    public void endSession() {
        Sentry.endSession();
    }

    public void flush(long j) {
        Sentry.flush(j);
    }

    public SentryId getLastEventId() {
        return Sentry.getLastEventId();
    }

    public SentryOptions getOptions() {
        return Sentry.getCurrentHub().getOptions();
    }

    public ISpan getSpan() {
        return Sentry.getCurrentHub().getSpan();
    }

    public boolean isEnabled() {
        return Sentry.isEnabled();
    }

    public void popScope() {
        Sentry.popScope();
    }

    public void pushScope() {
        Sentry.pushScope();
    }

    public void removeExtra(String str) {
        Sentry.removeExtra(str);
    }

    public void removeTag(String str) {
        Sentry.removeTag(str);
    }

    public void setExtra(String str, String str2) {
        Sentry.setExtra(str, str2);
    }

    public void setFingerprint(List<String> list) {
        Sentry.setFingerprint(list);
    }

    public void setLevel(SentryLevel sentryLevel) {
        Sentry.setLevel(sentryLevel);
    }

    public void setSpanContext(Throwable th, ISpan iSpan) {
        Sentry.getCurrentHub().setSpanContext(th, iSpan);
    }

    public void setTag(String str, String str2) {
        Sentry.setTag(str, str2);
    }

    public void setTransaction(String str) {
        Sentry.setTransaction(str);
    }

    public void setUser(User user) {
        Sentry.setUser(user);
    }

    public void startSession() {
        Sentry.startSession();
    }

    public ITransaction startTransaction(TransactionContext transactionContext) {
        return Sentry.startTransaction(transactionContext);
    }

    public SentryTraceHeader traceHeaders() {
        return Sentry.traceHeaders();
    }

    public void withScope(ScopeCallback scopeCallback) {
        Sentry.withScope(scopeCallback);
    }

    public IHub clone() {
        return Sentry.getCurrentHub().clone();
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        return Sentry.startTransaction(transactionContext, customSamplingContext);
    }

    public ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext) {
        return Sentry.startTransaction(str, str2, customSamplingContext);
    }
}
