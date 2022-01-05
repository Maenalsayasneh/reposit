package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.PaymentsRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.payments.RecentPaymentsViewModel$acknowledgePayment$1", f = "RecentPaymentsViewModel.kt", l = {75}, m = "invokeSuspend")
/* compiled from: RecentPaymentsViewModel.kt */
public final class RecentPaymentsViewModel$acknowledgePayment$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ RecentPaymentsViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsViewModel$acknowledgePayment$1(RecentPaymentsViewModel recentPaymentsViewModel, int i, String str, m0.l.c<? super RecentPaymentsViewModel$acknowledgePayment$1> cVar) {
        super(1, cVar);
        this.d = recentPaymentsViewModel;
        this.q = i;
        this.x = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new RecentPaymentsViewModel$acknowledgePayment$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new RecentPaymentsViewModel$acknowledgePayment$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            PaymentsRepo paymentsRepo = this.d.p;
            int i2 = this.q;
            String str = this.x;
            this.c = 1;
            obj = paymentsRepo.a(i2, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
