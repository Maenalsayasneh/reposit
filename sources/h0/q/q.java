package h0.q;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f1;
import n0.a.h2.o;
import n0.a.l1;
import n0.a.m0;
import n0.a.x;

/* compiled from: LifecycleOwner.kt */
public final class q {
    public static final LifecycleCoroutineScope a(p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        i.e(pVar, "$this$lifecycleScope");
        Lifecycle lifecycle = pVar.getLifecycle();
        i.d(lifecycle, "lifecycle");
        i.e(lifecycle, "$this$coroutineScope");
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.a.get();
            if (lifecycleCoroutineScopeImpl == null) {
                x z = a.z((f1) null, 1);
                d0 d0Var = m0.a;
                l1 l1Var = o.c;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, e.a.C0242a.d((JobSupport) z, l1Var.T()));
                if (lifecycle.a.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                    a.E2(lifecycleCoroutineScopeImpl, l1Var.T(), (CoroutineStart) null, new LifecycleCoroutineScopeImpl$register$1(lifecycleCoroutineScopeImpl, (c) null), 2, (Object) null);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }
}
