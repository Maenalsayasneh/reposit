package h0.q;

import androidx.lifecycle.CoroutineLiveData;
import m0.i;
import m0.n.a.a;
import m0.n.a.p;
import n0.a.f0;
import n0.a.f1;

/* compiled from: CoroutineLiveData.kt */
public final class c<T> {
    public f1 a;
    public f1 b;
    public final CoroutineLiveData<T> c;
    public final p<v<T>, m0.l.c<? super i>, Object> d;
    public final long e;
    public final f0 f;
    public final a<i> g;

    public c(CoroutineLiveData<T> coroutineLiveData, p<? super v<T>, ? super m0.l.c<? super i>, ? extends Object> pVar, long j, f0 f0Var, a<i> aVar) {
        m0.n.b.i.e(coroutineLiveData, "liveData");
        m0.n.b.i.e(pVar, "block");
        m0.n.b.i.e(f0Var, "scope");
        m0.n.b.i.e(aVar, "onDone");
        this.c = coroutineLiveData;
        this.d = pVar;
        this.e = j;
        this.f = f0Var;
        this.g = aVar;
    }
}
