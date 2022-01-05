package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.q.n;
import h0.q.p;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Lh0/q/n;", "Lh0/q/p;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lm0/i;", "a", "(Lh0/q/p;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1 implements n {
    public void a(p pVar, Lifecycle.Event event) {
        i.e(pVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(event, "event");
        if (event == Lifecycle.Event.upTo((Lifecycle.State) null)) {
            throw null;
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            throw null;
        }
    }
}
