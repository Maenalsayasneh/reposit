package com.stripe.android.paymentsheet;

import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.e;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$fetchIsGooglePayReady$1", f = "PaymentSheetViewModel.kt", l = {142}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModel$fetchIsGooglePayReady$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int label;
    public final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$fetchIsGooglePayReady$1(PaymentSheetViewModel paymentSheetViewModel, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentSheetViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PaymentSheetViewModel$fetchIsGooglePayReady$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentSheetViewModel$fetchIsGooglePayReady$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            e access$getWorkContext$p = this.this$0.getWorkContext();
            PaymentSheetViewModel$fetchIsGooglePayReady$1$isGooglePayReady$1 paymentSheetViewModel$fetchIsGooglePayReady$1$isGooglePayReady$1 = new PaymentSheetViewModel$fetchIsGooglePayReady$1$isGooglePayReady$1(this, (m0.l.c) null);
            this.label = 1;
            obj = a.k4(access$getWorkContext$p, paymentSheetViewModel$fetchIsGooglePayReady$1$isGooglePayReady$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.get_isGooglePayReady().setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return i.a;
    }
}
