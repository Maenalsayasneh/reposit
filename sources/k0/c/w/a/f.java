package k0.c.w.a;

import io.sentry.IHub;
import io.sentry.android.core.ANRWatchDog;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.ApplicationNotResponding;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.Objects;

/* compiled from: lambda */
public final /* synthetic */ class f implements ANRWatchDog.ANRListener {
    public final /* synthetic */ AnrIntegration a;
    public final /* synthetic */ IHub b;
    public final /* synthetic */ SentryAndroidOptions c;

    public /* synthetic */ f(AnrIntegration anrIntegration, IHub iHub, SentryAndroidOptions sentryAndroidOptions) {
        this.a = anrIntegration;
        this.b = iHub;
        this.c = sentryAndroidOptions;
    }

    public final void onAppNotResponding(ApplicationNotResponding applicationNotResponding) {
        AnrIntegration anrIntegration = this.a;
        IHub iHub = this.b;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        Objects.requireNonNull(anrIntegration);
        anrIntegration.reportANR(iHub, sentryAndroidOptions.getLogger(), applicationNotResponding);
    }
}
