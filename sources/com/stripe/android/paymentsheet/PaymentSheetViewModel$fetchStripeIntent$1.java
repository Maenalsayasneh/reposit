package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$fetchStripeIntent$1", f = "PaymentSheetViewModel.kt", l = {167}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModel$fetchStripeIntent$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$fetchStripeIntent$1(PaymentSheetViewModel paymentSheetViewModel, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentSheetViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        PaymentSheetViewModel$fetchStripeIntent$1 paymentSheetViewModel$fetchStripeIntent$1 = new PaymentSheetViewModel$fetchStripeIntent$1(this.this$0, cVar);
        paymentSheetViewModel$fetchStripeIntent$1.L$0 = obj;
        return paymentSheetViewModel$fetchStripeIntent$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentSheetViewModel$fetchStripeIntent$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            StripeIntentRepository access$getStripeIntentRepository$p = this.this$0.stripeIntentRepository;
            ClientSecret clientSecret = this.this$0.getArgs$payments_core_release().getClientSecret();
            this.label = 1;
            obj = access$getStripeIntentRepository$p.get(clientSecret, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (StripeIntent) obj;
        PaymentSheetViewModel paymentSheetViewModel = this.this$0;
        Throwable a = Result.a(obj2);
        if (a == null) {
            paymentSheetViewModel.onStripeIntentFetchResponse((StripeIntent) obj2);
        } else {
            this.this$0.get_stripeIntent$payments_core_release().setValue(null);
            this.this$0.onFatal(a);
        }
        return i.a;
    }
}
