package k0.c;

import io.sentry.IHub;

/* compiled from: lambda */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ IHub c;

    public /* synthetic */ v(IHub iHub) {
        this.c = iHub;
    }

    public final void run() {
        this.c.close();
    }
}
