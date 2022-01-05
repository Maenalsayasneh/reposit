package io.sentry.transport;

import io.sentry.SentryEnvelope;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class NoOpTransport implements ITransport {
    private static final NoOpTransport instance = new NoOpTransport();

    private NoOpTransport() {
    }

    public static NoOpTransport getInstance() {
        return instance;
    }

    public void close() throws IOException {
    }

    public void flush(long j) {
    }

    public void send(SentryEnvelope sentryEnvelope, Object obj) throws IOException {
    }
}
