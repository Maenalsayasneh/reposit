package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.q.n;
import h0.q.p;
import h0.q.r;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import m0.l.e;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\u00108\u0010@\u0010X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Lh0/q/n;", "Lh0/q/p;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lm0/i;", "a", "(Lh0/q/p;Landroidx/lifecycle/Lifecycle$Event;)V", "Lm0/l/e;", "d", "Lm0/l/e;", "C", "()Lm0/l/e;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "c", "Landroidx/lifecycle/Lifecycle;", "b", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;Lm0/l/e;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements n {
    public final Lifecycle c;
    public final e d;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, e eVar) {
        i.e(lifecycle, "lifecycle");
        i.e(eVar, "coroutineContext");
        this.c = lifecycle;
        this.d = eVar;
        if (((r) lifecycle).c == Lifecycle.State.DESTROYED) {
            a.m0(eVar, (CancellationException) null, 1, (Object) null);
        }
    }

    public e C() {
        return this.d;
    }

    public void a(p pVar, Lifecycle.Event event) {
        i.e(pVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(event, "event");
        if (((r) this.c).c.compareTo(Lifecycle.State.DESTROYED) <= 0) {
            r rVar = (r) this.c;
            rVar.d("removeObserver");
            rVar.b.k(this);
            a.m0(this.d, (CancellationException) null, 1, (Object) null);
        }
    }

    public Lifecycle b() {
        return this.c;
    }
}
