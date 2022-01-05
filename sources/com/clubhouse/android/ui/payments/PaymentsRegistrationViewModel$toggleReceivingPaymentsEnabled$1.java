package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.PaymentsRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.payments.PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1", f = "PaymentsRegistrationViewModel.kt", l = {82}, m = "invokeSuspend")
/* compiled from: PaymentsRegistrationViewModel.kt */
public final class PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ PaymentsRegistrationViewModel d;
    public final /* synthetic */ boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1(PaymentsRegistrationViewModel paymentsRegistrationViewModel, boolean z, m0.l.c<? super PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1> cVar) {
        super(1, cVar);
        this.d = paymentsRegistrationViewModel;
        this.q = z;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            PaymentsRepo paymentsRepo = this.d.p;
            boolean z = this.q;
            this.c = 1;
            obj = paymentsRepo.d(z, this);
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
