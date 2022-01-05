package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.app.R;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.b.b.g0;
import i0.e.b.a3.b.d;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: RecentPaymentsViewModel.kt */
public final class RecentPaymentsViewModel$acknowledgePayment$2 extends Lambda implements p<GetRecentPaymentsState, b<? extends EmptySuccessResponse>, GetRecentPaymentsState> {
    public final /* synthetic */ RecentPaymentsViewModel c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsViewModel$acknowledgePayment$2(RecentPaymentsViewModel recentPaymentsViewModel, int i) {
        super(2);
        this.c = recentPaymentsViewModel;
        this.d = i;
    }

    public Object invoke(Object obj, Object obj2) {
        GetRecentPaymentsState getRecentPaymentsState = (GetRecentPaymentsState) obj;
        b bVar = (b) obj2;
        i.e(getRecentPaymentsState, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof c) {
            RecentPaymentsViewModel recentPaymentsViewModel = this.c;
            recentPaymentsViewModel.o(new d(recentPaymentsViewModel.n.getString(R.string.payment_acknowledgement_error)));
            return GetRecentPaymentsState.copy$default(getRecentPaymentsState, (w) null, (Set) null, new c(((c) bVar).b, (Object) null, 2), 3, (Object) null);
        } else if (bVar instanceof f0) {
            return GetRecentPaymentsState.copy$default(getRecentPaymentsState, (w) null, g.e0(getRecentPaymentsState.b, Integer.valueOf(this.d)), new f0(m0.i.a), 1, (Object) null);
        } else if (bVar instanceof f) {
            return GetRecentPaymentsState.copy$default(getRecentPaymentsState, (w) null, (Set) null, new f((Object) null, 1), 3, (Object) null);
        } else {
            if (bVar instanceof g0) {
                return GetRecentPaymentsState.copy$default(getRecentPaymentsState, (w) null, (Set) null, g0.b, 3, (Object) null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
