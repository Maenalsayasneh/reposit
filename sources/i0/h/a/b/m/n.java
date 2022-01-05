package i0.h.a.b.m;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class n implements Runnable {
    public final /* synthetic */ g c;
    public final /* synthetic */ l d;

    public n(l lVar, g gVar) {
        this.d = lVar;
        this.c = gVar;
    }

    public final void run() {
        try {
            g a = this.d.b.a(this.c);
            if (a == null) {
                l lVar = this.d;
                lVar.c.p(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = i.b;
            a.e(executor, this.d);
            a.d(executor, this.d);
            a.a(executor, this.d);
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
