package i0.h.a.b.m;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class t<TResult> implements z<TResult> {
    public final Executor a;
    public final Object b = new Object();
    public d c;

    public t(Executor executor, d dVar) {
        this.a = executor;
        this.c = dVar;
    }

    public final void b(g<TResult> gVar) {
        if (!gVar.n() && !gVar.l()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new s(this, gVar));
                }
            }
        }
    }
}
