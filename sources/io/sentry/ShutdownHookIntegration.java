package io.sentry;

import io.sentry.util.Objects;
import k0.c.v;

public final class ShutdownHookIntegration implements Integration {
    private final Runtime runtime;

    public ShutdownHookIntegration(Runtime runtime2) {
        this.runtime = (Runtime) Objects.requireNonNull(runtime2, "Runtime is required");
    }

    public void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        this.runtime.addShutdownHook(new Thread(new v(iHub)));
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
