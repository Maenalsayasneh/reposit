package k0.c;

import io.sentry.Sentry;
import io.sentry.SentryOptions;

/* compiled from: lambda */
public final /* synthetic */ class g implements Sentry.OptionsConfiguration {
    public final /* synthetic */ String a;

    public /* synthetic */ g(String str) {
        this.a = str;
    }

    public final void configure(SentryOptions sentryOptions) {
        String str = this.a;
        int i = Sentry.a;
        sentryOptions.setDsn(str);
    }
}
