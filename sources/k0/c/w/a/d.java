package k0.c.w.a;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SentryOptions;

/* compiled from: lambda */
public final /* synthetic */ class d implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath {
    public final /* synthetic */ SentryOptions a;

    public /* synthetic */ d(SentryOptions sentryOptions) {
        this.a = sentryOptions;
    }

    public final String getDirPath() {
        return this.a.getOutboxPath();
    }
}
