package io.sentry;

import io.sentry.util.Objects;
import java.io.File;
import k0.c.e;
import k0.c.f;

public final class SendCachedEnvelopeFireAndForgetIntegration implements Integration {
    private final SendFireAndForgetFactory factory;

    public interface SendFireAndForget {
        void send();
    }

    public interface SendFireAndForgetDirPath {
        String getDirPath();
    }

    public interface SendFireAndForgetFactory {
        SendFireAndForget create(IHub iHub, SentryOptions sentryOptions);

        boolean hasValidPath(String str, ILogger iLogger) {
            if (str != null && !str.isEmpty()) {
                return true;
            }
            iLogger.log(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
            return false;
        }

        SendFireAndForget processDir(DirectoryProcessor directoryProcessor, String str, ILogger iLogger) {
            return new f(iLogger, str, directoryProcessor, new File(str));
        }
    }

    public SendCachedEnvelopeFireAndForgetIntegration(SendFireAndForgetFactory sendFireAndForgetFactory) {
        this.factory = (SendFireAndForgetFactory) Objects.requireNonNull(sendFireAndForgetFactory, "SendFireAndForgetFactory is required");
    }

    public final void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!this.factory.hasValidPath(sentryOptions.getCacheDirPath(), sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        SendFireAndForget create = this.factory.create(iHub, sentryOptions);
        if (create == null) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            sentryOptions.getExecutorService().submit(new e(create, sentryOptions));
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "SendCachedEventFireAndForgetIntegration installed.", new Object[0]);
        } catch (Exception e) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", (Throwable) e);
        }
    }
}
