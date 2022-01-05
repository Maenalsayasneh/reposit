package i0.h.a.b.m;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class i {
    public static final Executor a = new a();
    public static final Executor b = new a0();

    /* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
    public static final class a implements Executor {
        public final Handler c = new i0.h.a.b.g.j.a(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.c.post(runnable);
        }
    }
}
