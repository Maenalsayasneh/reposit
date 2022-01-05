package i0.h.a.b.m;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class k<TResult, TContinuationResult> implements z<TResult> {
    public final Executor a;
    public final a<TResult, TContinuationResult> b;
    public final b0<TContinuationResult> c;

    public k(Executor executor, a<TResult, TContinuationResult> aVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = b0Var;
    }

    public final void b(g<TResult> gVar) {
        this.a.execute(new m(this, gVar));
    }
}
