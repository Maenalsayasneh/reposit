package io.sentry;

import io.sentry.transport.ITransport;
import io.sentry.transport.NoOpTransport;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class NoOpTransportFactory implements ITransportFactory {
    private static final NoOpTransportFactory instance = new NoOpTransportFactory();

    private NoOpTransportFactory() {
    }

    public static NoOpTransportFactory getInstance() {
        return instance;
    }

    public ITransport create(SentryOptions sentryOptions, RequestDetails requestDetails) {
        return NoOpTransport.getInstance();
    }
}
