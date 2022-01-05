package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.local.payment.RecentPayment;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.s.r;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RecentPaymentsFragment.kt */
public final class RecentPaymentsFragment$RecentPaymentItemContoller$buildItemModel$3$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ RecentPaymentsFragment c;
    public final /* synthetic */ RecentPayment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsFragment$RecentPaymentItemContoller$buildItemModel$3$1(RecentPaymentsFragment recentPaymentsFragment, RecentPayment recentPayment) {
        super(1);
        this.c = recentPaymentsFragment;
        this.d = recentPayment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.all_set);
        RecentPaymentsFragment recentPaymentsFragment = this.c;
        RecentPayment recentPayment = this.d;
        aVar.a.f = recentPaymentsFragment.getString(R.string.already_thanked, recentPayment.x, Integer.valueOf(recentPayment.d / 100));
        aVar.d(R.string.ok, r.c);
        return i.a;
    }
}
