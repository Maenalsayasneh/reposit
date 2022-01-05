package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.List;

public final class NoOpHub implements IHub {
    private static final NoOpHub instance = new NoOpHub();
    private final SentryOptions emptyOptions = SentryOptions.empty();

    private NoOpHub() {
    }

    public static NoOpHub getInstance() {
        return instance;
    }

    public void addBreadcrumb(Breadcrumb breadcrumb, Object obj) {
    }

    public void bindClient(ISentryClient iSentryClient) {
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public SentryId captureException(Throwable th, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return SentryId.EMPTY_ID;
    }

    public SentryId captureTransaction(ITransaction iTransaction, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    public void clearBreadcrumbs() {
    }

    public void close() {
    }

    public void configureScope(ScopeCallback scopeCallback) {
    }

    public void endSession() {
    }

    public void flush(long j) {
    }

    public SentryId getLastEventId() {
        return SentryId.EMPTY_ID;
    }

    public SentryOptions getOptions() {
        return this.emptyOptions;
    }

    public ISpan getSpan() {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public void popScope() {
    }

    public void pushScope() {
    }

    public void removeExtra(String str) {
    }

    public void removeTag(String str) {
    }

    public void setExtra(String str, String str2) {
    }

    public void setFingerprint(List<String> list) {
    }

    public void setLevel(SentryLevel sentryLevel) {
    }

    public void setSpanContext(Throwable th, ISpan iSpan) {
    }

    public void setTag(String str, String str2) {
    }

    public void setTransaction(String str) {
    }

    public void setUser(User user) {
    }

    public void startSession() {
    }

    public ITransaction startTransaction(TransactionContext transactionContext) {
        return new SentryTransaction(transactionContext, (IHub) getInstance());
    }

    public SentryTraceHeader traceHeaders() {
        return new SentryTraceHeader(SentryId.EMPTY_ID, SpanId.EMPTY_ID, Boolean.TRUE);
    }

    public void withScope(ScopeCallback scopeCallback) {
    }

    public IHub clone() {
        return instance;
    }

    public ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        return new SentryTransaction(transactionContext, (IHub) getInstance());
    }
}
