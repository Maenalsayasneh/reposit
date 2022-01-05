package i0.h.a.b.m;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class d0 implements Runnable {
    public final /* synthetic */ b0 c;
    public final /* synthetic */ Callable d;

    public d0(b0 b0Var, Callable callable) {
        this.c = b0Var;
        this.d = callable;
    }

    public final void run() {
        try {
            this.c.q(this.d.call());
        } catch (Exception e) {
            this.c.p(e);
        } catch (Throwable th) {
            this.c.p(new RuntimeException(th));
        }
    }
}
