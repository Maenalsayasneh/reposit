package com.airbnb.mvrx;

import h0.q.f;
import h0.q.p;
import i0.b.b.i0;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/airbnb/mvrx/MavericksViewModel$assertOneActiveSubscription$observer$1", "Lh0/q/f;", "Lh0/q/p;", "owner", "Lm0/i;", "onCreate", "(Lh0/q/p;)V", "onDestroy", "mvrx_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$assertOneActiveSubscription$observer$1 implements f {
    public final /* synthetic */ MavericksViewModel c;
    public final /* synthetic */ i0 d;

    public MavericksViewModel$assertOneActiveSubscription$observer$1(MavericksViewModel mavericksViewModel, i0 i0Var) {
        this.c = mavericksViewModel;
        this.d = i0Var;
    }

    public void onCreate(p pVar) {
        i.e(pVar, "owner");
        if (!this.c.f.contains(this.d.a)) {
            this.c.f.add(this.d.a);
            return;
        }
        MavericksViewModel mavericksViewModel = this.c;
        i0 i0Var = this.d;
        Objects.requireNonNull(mavericksViewModel);
        throw new IllegalStateException(StringsKt__IndentKt.Y("\n        Subscribing with a duplicate subscription id: " + i0Var.a + ".\n        If you have multiple uniqueOnly subscriptions in a MvRx view that listen to the same properties\n        you must use a custom subscription id. If you are using a custom MvRxView, make sure you are using the proper\n        lifecycle owner. See BaseMvRxFragment for an example.\n    ").toString());
    }

    public void onDestroy(p pVar) {
        i.e(pVar, "owner");
        this.c.f.remove(this.d.a);
    }
}
