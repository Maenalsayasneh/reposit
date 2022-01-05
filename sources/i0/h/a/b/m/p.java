package i0.h.a.b.m;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class p<TResult> implements z<TResult> {
    public final Executor a;
    public final Object b = new Object();
    public b c;

    public p(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void b(g<TResult> gVar) {
        if (gVar.l()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new o(this));
                }
            }
        }
    }
}
