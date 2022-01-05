package io.sentry;

import io.sentry.protocol.SentryId;

public final class NoOpSentryClient implements ISentryClient {
    private static final NoOpSentryClient instance = new NoOpSentryClient();

    private NoOpSentryClient() {
    }

    public static NoOpSentryClient getInstance() {
        return instance;
    }

    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public void captureSession(Session session, Object obj) {
    }

    public SentryId captureTransaction(ITransaction iTransaction, Scope scope, Object obj) {
        return SentryId.EMPTY_ID;
    }

    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    public void close() {
    }

    public void flush(long j) {
    }

    public boolean isEnabled() {
        return false;
    }
}
