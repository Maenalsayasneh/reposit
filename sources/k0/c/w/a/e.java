package k0.c.w.a;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SentryOptions;

/* compiled from: lambda */
public final /* synthetic */ class e implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetDirPath {
    public final /* synthetic */ SentryOptions a;

    public /* synthetic */ e(SentryOptions sentryOptions) {
        this.a = sentryOptions;
    }

    public final String getDirPath() {
        return this.a.getCacheDirPath();
    }
}
