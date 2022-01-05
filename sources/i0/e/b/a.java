package i0.e.b;

import com.clubhouse.android.ClubhouseApplication;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.timber.SentryTimberIntegration;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements Sentry.OptionsConfiguration {
    public static final /* synthetic */ a a = new a();

    public final void configure(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        int i = ClubhouseApplication.d;
        i.e(sentryAndroidOptions, "options");
        sentryAndroidOptions.setEnvironment("production");
        sentryAndroidOptions.setRelease("com.clubhouse.app@1.0.8+4734");
        sentryAndroidOptions.addIntegration(new SentryTimberIntegration(SentryLevel.ERROR, SentryLevel.INFO));
    }
}
