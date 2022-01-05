package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.local.payment.RecentPayment;
import i0.e.b.b3.b.e.k;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.payments.GetRecentPaymentsState$recentPaymentsData$1", f = "RecentPaymentsViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: RecentPaymentsViewModel.kt */
public final class GetRecentPaymentsState$recentPaymentsData$1 extends SuspendLambda implements p<k, m0.l.c<? super k>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ GetRecentPaymentsState d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRecentPaymentsState$recentPaymentsData$1(GetRecentPaymentsState getRecentPaymentsState, m0.l.c<? super GetRecentPaymentsState$recentPaymentsData$1> cVar) {
        super(2, cVar);
        this.d = getRecentPaymentsState;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        GetRecentPaymentsState$recentPaymentsData$1 getRecentPaymentsState$recentPaymentsData$1 = new GetRecentPaymentsState$recentPaymentsData$1(this.d, cVar);
        getRecentPaymentsState$recentPaymentsData$1.c = obj;
        return getRecentPaymentsState$recentPaymentsData$1;
    }

    public Object invoke(Object obj, Object obj2) {
        GetRecentPaymentsState$recentPaymentsData$1 getRecentPaymentsState$recentPaymentsData$1 = new GetRecentPaymentsState$recentPaymentsData$1(this.d, (m0.l.c) obj2);
        getRecentPaymentsState$recentPaymentsData$1.c = (k) obj;
        return getRecentPaymentsState$recentPaymentsData$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        k kVar = (k) this.c;
        RecentPayment recentPayment = kVar.b;
        if (this.d.b.contains(new Integer(recentPayment.c))) {
            z = true;
        } else {
            z = kVar.b.Y1;
        }
        int i = recentPayment.c;
        int i2 = recentPayment.d;
        int i3 = recentPayment.q;
        String str = recentPayment.x;
        String str2 = recentPayment.y;
        OffsetDateTime offsetDateTime = recentPayment.Z1;
        m0.n.b.i.e(str, "fromName");
        m0.n.b.i.e(offsetDateTime, "timeCreated");
        RecentPayment recentPayment2 = new RecentPayment(i, i2, i3, str, str2, z, offsetDateTime);
        m0.n.b.i.e(recentPayment2, "recentPayment");
        return new k(recentPayment2);
    }
}
