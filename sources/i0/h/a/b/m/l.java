package i0.h.a.b.m;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class l<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {
    public final Executor a;
    public final a<TResult, g<TContinuationResult>> b;
    public final b0<TContinuationResult> c;

    public l(Executor executor, a<TResult, g<TContinuationResult>> aVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = b0Var;
    }

    public final void a(Exception exc) {
        this.c.p(exc);
    }

    public final void b(g<TResult> gVar) {
        this.a.execute(new n(this, gVar));
    }

    public final void c() {
        this.c.r();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.q(tcontinuationresult);
    }
}
