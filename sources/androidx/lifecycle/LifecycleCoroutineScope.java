package androidx.lifecycle;

import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;

/* compiled from: Lifecycle.kt */
public abstract class LifecycleCoroutineScope implements f0 {
    public abstract Lifecycle b();

    public final f1 c(p<? super f0, ? super c<? super i>, ? extends Object> pVar) {
        m0.n.b.i.e(pVar, "block");
        return a.E2(this, (e) null, (CoroutineStart) null, new LifecycleCoroutineScope$launchWhenResumed$1(this, pVar, (c) null), 3, (Object) null);
    }
}
