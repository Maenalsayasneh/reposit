package io.sentry.transport;

public final class NoOpTransportGate implements ITransportGate {
    private static final NoOpTransportGate instance = new NoOpTransportGate();

    private NoOpTransportGate() {
    }

    public static NoOpTransportGate getInstance() {
        return instance;
    }

    public boolean isConnected() {
        return true;
    }
}
