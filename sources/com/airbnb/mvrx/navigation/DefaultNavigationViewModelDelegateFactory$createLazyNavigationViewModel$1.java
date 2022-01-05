package com.airbnb.mvrx.navigation;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import com.airbnb.mvrx.DeliveryMode;
import com.airbnb.mvrx.MavericksViewModel;
import h0.b0.v;
import h0.t.f;
import i0.b.b.b0;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.l.c;
import m0.n.a.a;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: MavericksExtensions.kt */
public final class DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1 extends Lambda implements a<VM> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ int d;
    public final /* synthetic */ p q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1(Fragment fragment, int i, p pVar) {
        super(0);
        this.c = fragment;
        this.d = i;
        this.q = pVar;
    }

    public Object invoke() {
        f fVar;
        NavController G = g0.a.b.b.a.G(this.c);
        int i = this.d;
        Iterator<f> descendingIterator = G.h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                fVar = null;
                break;
            }
            fVar = descendingIterator.next();
            if (fVar.d.q == i) {
                break;
            }
        }
        if (fVar != null) {
            i.d(fVar, "fragment.findNavControll…ackStackEntry(navGraphId)");
            MavericksViewModel mavericksViewModel = (MavericksViewModel) this.q.invoke(new b0(), fVar);
            v.b(mavericksViewModel, this.c, (DeliveryMode) null, new DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1$$special$$inlined$apply$lambda$1((c) null, this), 2);
            return mavericksViewModel;
        }
        StringBuilder Q0 = i0.d.a.a.a.Q0("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        Q0.append(G.d());
        throw new IllegalArgumentException(Q0.toString());
    }
}
