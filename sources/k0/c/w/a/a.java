package k0.c.w.a;

import io.sentry.android.core.ANRWatchDog;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ ANRWatchDog c;

    public /* synthetic */ a(ANRWatchDog aNRWatchDog) {
        this.c = aNRWatchDog;
    }

    public final void run() {
        this.c.a();
    }
}
