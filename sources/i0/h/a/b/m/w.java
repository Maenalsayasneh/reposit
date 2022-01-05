package i0.h.a.b.m;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class w implements Runnable {
    public final /* synthetic */ g c;
    public final /* synthetic */ x d;

    public w(x xVar, g gVar) {
        this.d = xVar;
        this.c = gVar;
    }

    public final void run() {
        try {
            g<TContinuationResult> a = this.d.b.a(this.c.j());
            if (a == null) {
                x xVar = this.d;
                xVar.c.p(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = i.b;
            a.e(executor, this.d);
            a.d(executor, this.d);
            a.a(executor, this.d);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.d.c.p((Exception) e.getCause());
                return;
            }
            this.d.c.p(e);
        } catch (CancellationException unused) {
            this.d.c.r();
        } catch (Exception e2) {
            this.d.c.p(e2);
        }
    }
}
