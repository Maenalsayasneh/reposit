package k0.c.w.a;

import io.sentry.IHub;
import io.sentry.android.core.AppLifecycleIntegration;

/* compiled from: lambda */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ AppLifecycleIntegration c;
    public final /* synthetic */ IHub d;

    public /* synthetic */ g(AppLifecycleIntegration appLifecycleIntegration, IHub iHub) {
        this.c = appLifecycleIntegration;
        this.d = iHub;
    }

    public final void run() {
        this.c.a(this.d);
    }
}
