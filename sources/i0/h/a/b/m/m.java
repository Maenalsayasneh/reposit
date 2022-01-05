package i0.h.a.b.m;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class m implements Runnable {
    public final /* synthetic */ g c;
    public final /* synthetic */ k d;

    public m(k kVar, g gVar) {
        this.d = kVar;
        this.c = gVar;
    }

    public final void run() {
        if (this.c.l()) {
            this.d.c.r();
            return;
        }
        try {
            this.d.c.q(this.d.b.a(this.c));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.d.c.p((Exception) e.getCause());
            } else {
                this.d.c.p(e);
            }
        } catch (Exception e2) {
            this.d.c.p(e2);
        }
    }
}
