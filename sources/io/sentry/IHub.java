package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

public interface IHub {
    void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, (Object) null);
    }

    void addBreadcrumb(Breadcrumb breadcrumb, Object obj);

    void bindClient(ISentryClient iSentryClient);

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, (Object) null);
    }

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj);

    SentryId captureEvent(SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, (Object) null);
    }

    SentryId captureEvent(SentryEvent sentryEvent, Object obj);

    SentryId captureException(Throwable th) {
        return captureException(th, (Object) null);
    }

    SentryId captureException(Throwable th, Object obj);

    SentryId captureMessage(String str) {
        return captureMessage(str, SentryLevel.INFO);
    }

    SentryId captureMessage(String str, SentryLevel sentryLevel);

    @ApiStatus.Internal
    SentryId captureTransaction(ITransaction iTransaction) {
        return captureTransaction(iTransaction, (Object) null);
    }

    @ApiStatus.Internal
    SentryId captureTransaction(ITransaction iTransaction, Object obj);

    void captureUserFeedback(UserFeedback userFeedback);

    void clearBreadcrumbs();

    IHub clone();

    void close();

    void configureScope(ScopeCallback scopeCallback);

    void endSession();

    void flush(long j);

    SentryId getLastEventId();

    SentryOptions getOptions();

    ISpan getSpan();

    boolean isEnabled();

    void popScope();

    void pushScope();

    void removeExtra(String str);

    void removeTag(String str);

    void setExtra(String str, String str2);

    void setFingerprint(List<String> list);

    void setLevel(SentryLevel sentryLevel);

    @ApiStatus.Internal
    void setSpanContext(Throwable th, ISpan iSpan);

    void setTag(String str, String str2);

    void setTransaction(String str);

    void setUser(User user);

    void startSession();

    ITransaction startTransaction(TransactionContext transactionContext);

    ITransaction startTransaction(TransactionContext transactionContext, CustomSamplingContext customSamplingContext);

    ITransaction startTransaction(String str, String str2, CustomSamplingContext customSamplingContext) {
        return startTransaction(new TransactionContext(str, str2), customSamplingContext);
    }

    SentryTraceHeader traceHeaders();

    void withScope(ScopeCallback scopeCallback);

    void addBreadcrumb(String str) {
        addBreadcrumb(new Breadcrumb(str));
    }

    ITransaction startTransaction(String str, String str2) {
        return startTransaction(str, str2, (CustomSamplingContext) null);
    }

    void addBreadcrumb(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb(str);
        breadcrumb.setCategory(str2);
        addBreadcrumb(breadcrumb);
    }
}
