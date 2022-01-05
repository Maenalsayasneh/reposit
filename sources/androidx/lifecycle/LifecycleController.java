package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.q.h;
import h0.q.n;
import h0.q.r;
import java.util.concurrent.CancellationException;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

/* compiled from: LifecycleController.kt */
public final class LifecycleController {
    public final n a;
    public final Lifecycle b;
    public final Lifecycle.State c;
    public final h d;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, h hVar, f1 f1Var) {
        i.e(lifecycle, "lifecycle");
        i.e(state, "minState");
        i.e(hVar, "dispatchQueue");
        i.e(f1Var, "parentJob");
        this.b = lifecycle;
        this.c = state;
        this.d = hVar;
        LifecycleController$observer$1 lifecycleController$observer$1 = new LifecycleController$observer$1(this, f1Var);
        this.a = lifecycleController$observer$1;
        if (((r) lifecycle).c == Lifecycle.State.DESTROYED) {
            a.o0(f1Var, (CancellationException) null, 1, (Object) null);
            a();
            return;
        }
        lifecycle.a(lifecycleController$observer$1);
    }

    public final void a() {
        this.b.b(this.a);
        h hVar = this.d;
        hVar.b = true;
        hVar.b();
    }
}
