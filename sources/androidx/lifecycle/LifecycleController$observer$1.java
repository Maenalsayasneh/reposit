package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.q.h;
import h0.q.n;
import h0.q.p;
import h0.q.r;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh0/q/p;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "<anonymous parameter 1>", "Lm0/i;", "a", "(Lh0/q/p;Landroidx/lifecycle/Lifecycle$Event;)V"}, k = 3, mv = {1, 4, 1})
/* compiled from: LifecycleController.kt */
public final class LifecycleController$observer$1 implements n {
    public final /* synthetic */ LifecycleController c;
    public final /* synthetic */ f1 d;

    public LifecycleController$observer$1(LifecycleController lifecycleController, f1 f1Var) {
        this.c = lifecycleController;
        this.d = f1Var;
    }

    public final void a(p pVar, Lifecycle.Event event) {
        i.e(pVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(event, "<anonymous parameter 1>");
        Lifecycle lifecycle = pVar.getLifecycle();
        i.d(lifecycle, "source.lifecycle");
        if (((r) lifecycle).c == Lifecycle.State.DESTROYED) {
            LifecycleController lifecycleController = this.c;
            a.o0(this.d, (CancellationException) null, 1, (Object) null);
            lifecycleController.a();
            return;
        }
        Lifecycle lifecycle2 = pVar.getLifecycle();
        i.d(lifecycle2, "source.lifecycle");
        if (((r) lifecycle2).c.compareTo(this.c.c) < 0) {
            this.c.d.a = true;
            return;
        }
        h hVar = this.c.d;
        if (hVar.a) {
            if (!hVar.b) {
                hVar.a = false;
                hVar.b();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}
