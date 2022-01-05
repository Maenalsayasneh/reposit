package io.sentry;

import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;

public interface ISentryClient {
    SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, (Object) null);
    }

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj);

    SentryId captureEvent(SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, (Scope) null, (Object) null);
    }

    SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj);

    SentryId captureException(Throwable th) {
        return captureException(th, (Scope) null, (Object) null);
    }

    SentryId captureMessage(String str, SentryLevel sentryLevel, Scope scope) {
        SentryEvent sentryEvent = new SentryEvent();
        Message message = new Message();
        message.setFormatted(str);
        sentryEvent.setMessage(message);
        sentryEvent.setLevel(sentryLevel);
        return captureEvent(sentryEvent, scope);
    }

    void captureSession(Session session) {
        captureSession(session, (Object) null);
    }

    void captureSession(Session session, Object obj);

    SentryId captureTransaction(ITransaction iTransaction) {
        return captureTransaction(iTransaction, (Scope) null, (Object) null);
    }

    SentryId captureTransaction(ITransaction iTransaction, Scope scope, Object obj);

    void captureUserFeedback(UserFeedback userFeedback);

    void close();

    void flush(long j);

    boolean isEnabled();

    SentryId captureEvent(SentryEvent sentryEvent, Scope scope) {
        return captureEvent(sentryEvent, scope, (Object) null);
    }

    SentryId captureException(Throwable th, Scope scope, Object obj) {
        return captureEvent(new SentryEvent(th), scope, obj);
    }

    SentryId captureEvent(SentryEvent sentryEvent, Object obj) {
        return captureEvent(sentryEvent, (Scope) null, obj);
    }

    SentryId captureException(Throwable th, Object obj) {
        return captureException(th, (Scope) null, obj);
    }

    SentryId captureException(Throwable th, Scope scope) {
        return captureException(th, scope, (Object) null);
    }

    SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return captureMessage(str, sentryLevel, (Scope) null);
    }
}
