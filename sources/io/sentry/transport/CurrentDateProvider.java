package io.sentry.transport;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class CurrentDateProvider implements ICurrentDateProvider {
    private static final ICurrentDateProvider instance = new CurrentDateProvider();

    private CurrentDateProvider() {
    }

    public static ICurrentDateProvider getInstance() {
        return instance;
    }

    public final long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
