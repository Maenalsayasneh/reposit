package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.PaymentsRepo", f = "PaymentsRepo.kt", l = {47}, m = "updateReceivingPaymentsEnabled")
/* compiled from: PaymentsRepo.kt */
public final class PaymentsRepo$updateReceivingPaymentsEnabled$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ PaymentsRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRepo$updateReceivingPaymentsEnabled$1(PaymentsRepo paymentsRepo, m0.l.c<? super PaymentsRepo$updateReceivingPaymentsEnabled$1> cVar) {
        super(cVar);
        this.q = paymentsRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.d(false, this);
    }
}
