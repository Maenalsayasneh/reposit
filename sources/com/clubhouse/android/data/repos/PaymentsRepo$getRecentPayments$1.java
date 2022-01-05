package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource;
import h0.u.x;
import i0.e.b.b3.b.e.k;
import i0.e.b.l;
import i0.e.b.o2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: PaymentsRepo.kt */
public final class PaymentsRepo$getRecentPayments$1 extends Lambda implements a<x<Integer, k>> {
    public final /* synthetic */ PaymentsRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRepo$getRecentPayments$1(PaymentsRepo paymentsRepo) {
        super(0);
        this.c = paymentsRepo;
    }

    public Object invoke() {
        l.i iVar = ((o2) this.c.b).a.f;
        return new GetRecentPaymentsPagingSource(iVar.e.J(), iVar.e.u());
    }
}
