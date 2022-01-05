package i0.h.a.b.m;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class q<TResult> implements z<TResult> {
    public final Executor a;
    public final Object b = new Object();
    public c<TResult> c;

    public q(Executor executor, c<TResult> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void b(g<TResult> gVar) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new r(this, gVar));
            }
        }
    }
}
