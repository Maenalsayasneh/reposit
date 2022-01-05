package k0.c;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;

/* compiled from: lambda */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget c;
    public final /* synthetic */ SentryOptions d;

    public /* synthetic */ e(SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget sendFireAndForget, SentryOptions sentryOptions) {
        this.c = sendFireAndForget;
        this.d = sentryOptions;
    }

    public final void run() {
        SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget sendFireAndForget = this.c;
        SentryOptions sentryOptions = this.d;
        try {
            sendFireAndForget.send();
        } catch (Exception e) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed trying to send cached events.", (Throwable) e);
        }
    }
}
