package k0.c;

import io.sentry.Sentry;
import io.sentry.SentryOptions;

/* compiled from: lambda */
public final /* synthetic */ class h implements Sentry.OptionsConfiguration {
    public static final /* synthetic */ h a = new h();

    public final void configure(SentryOptions sentryOptions) {
        int i = Sentry.a;
        sentryOptions.setEnableExternalConfiguration(true);
    }
}
