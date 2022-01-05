package io.sentry;

import java.io.IOException;
import java.io.InputStream;

public final class NoOpEnvelopeReader implements IEnvelopeReader {
    private static final NoOpEnvelopeReader instance = new NoOpEnvelopeReader();

    private NoOpEnvelopeReader() {
    }

    public static NoOpEnvelopeReader getInstance() {
        return instance;
    }

    public SentryEnvelope read(InputStream inputStream) throws IOException {
        return null;
    }
}
