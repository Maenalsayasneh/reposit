package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.q.r;
import i0.j.f.p.h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ LifecycleCoroutineScopeImpl d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, m0.l.c cVar) {
        super(2, cVar);
        this.d = lifecycleCoroutineScopeImpl;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.d, cVar);
        lifecycleCoroutineScopeImpl$register$1.c = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.d, cVar);
        lifecycleCoroutineScopeImpl$register$1.c = obj;
        i iVar = i.a;
        lifecycleCoroutineScopeImpl$register$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        f0 f0Var = (f0) this.c;
        if (((r) this.d.c).c.compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.d;
            lifecycleCoroutineScopeImpl.c.a(lifecycleCoroutineScopeImpl);
        } else {
            a.m0(f0Var.C(), (CancellationException) null, 1, (Object) null);
        }
        return i.a;
    }
}
