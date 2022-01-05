package i0.h.a.b.m;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class u<TResult> implements z<TResult> {
    public final Executor a;
    public final Object b = new Object();
    public e<? super TResult> c;

    public u(Executor executor, e<? super TResult> eVar) {
        this.a = executor;
        this.c = eVar;
    }

    public final void b(g<TResult> gVar) {
        if (gVar.n()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new v(this, gVar));
                }
            }
        }
    }
}
