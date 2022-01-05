package i0.h.a.b.c.g.j;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final /* synthetic */ class q implements Executor {
    public final Handler c;

    public q(Handler handler) {
        this.c = handler;
    }

    public final void execute(Runnable runnable) {
        this.c.post(runnable);
    }
}
