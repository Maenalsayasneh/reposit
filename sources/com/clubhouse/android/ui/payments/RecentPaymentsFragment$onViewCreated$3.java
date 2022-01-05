package com.clubhouse.android.ui.payments;

import i0.e.b.g3.s.e0;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: RecentPaymentsFragment.kt */
public final class RecentPaymentsFragment$onViewCreated$3 extends Lambda implements l<Pair<? extends Integer, ? extends String>, i> {
    public final /* synthetic */ RecentPaymentsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsFragment$onViewCreated$3(RecentPaymentsFragment recentPaymentsFragment) {
        super(1);
        this.c = recentPaymentsFragment;
    }

    public Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            RecentPaymentsFragment recentPaymentsFragment = this.c;
            k<Object>[] kVarArr = RecentPaymentsFragment.Z1;
            recentPaymentsFragment.O0().p(new e0(pair));
        }
        return i.a;
    }
}
