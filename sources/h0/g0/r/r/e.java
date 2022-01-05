package h0.g0.r.r;

import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService */
public class e implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ SystemForegroundService d;

    public e(SystemForegroundService systemForegroundService, int i) {
        this.d = systemForegroundService;
        this.c = i;
    }

    public void run() {
        this.d.Y1.cancel(this.c);
    }
}
