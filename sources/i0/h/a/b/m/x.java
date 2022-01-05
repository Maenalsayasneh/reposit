package i0.h.a.b.m;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class x<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {
    public final Executor a;
    public final f<TResult, TContinuationResult> b;
    public final b0<TContinuationResult> c;

    public x(Executor executor, f<TResult, TContinuationResult> fVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = fVar;
        this.c = b0Var;
    }

    public final void a(Exception exc) {
        this.c.p(exc);
    }

    public final void b(g<TResult> gVar) {
        this.a.execute(new w(this, gVar));
    }

    public final void c() {
        this.c.r();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.q(tcontinuationresult);
    }
}
