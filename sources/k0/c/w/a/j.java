package k0.c.w.a;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidOptionsInitializer;
import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: lambda */
public final /* synthetic */ class j implements Sentry.OptionsConfiguration {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ILogger b;
    public final /* synthetic */ Sentry.OptionsConfiguration c;

    public /* synthetic */ j(Context context, ILogger iLogger, Sentry.OptionsConfiguration optionsConfiguration) {
        this.a = context;
        this.b = iLogger;
        this.c = optionsConfiguration;
    }

    public final void configure(SentryOptions sentryOptions) {
        Context context = this.a;
        ILogger iLogger = this.b;
        Sentry.OptionsConfiguration optionsConfiguration = this.c;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        AndroidOptionsInitializer.init(sentryAndroidOptions, context, iLogger);
        optionsConfiguration.configure(sentryAndroidOptions);
    }
}
