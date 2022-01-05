package com.stripe.android.paymentsheet;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$onPaymentFlowResult$1$result$1$1", f = "PaymentSheetViewModel.kt", l = {364}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/StripeIntent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/stripe/android/paymentsheet/PaymentSheetViewModel$onPaymentFlowResult$1$result$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1 extends SuspendLambda implements p<f0, m0.l.c<? super StripeIntentResult<? extends StripeIntent>>, Object> {
    public int label;
    public final /* synthetic */ PaymentSheetViewModel$onPaymentFlowResult$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1(m0.l.c cVar, PaymentSheetViewModel$onPaymentFlowResult$1 paymentSheetViewModel$onPaymentFlowResult$1) {
        super(2, cVar);
        this.this$0 = paymentSheetViewModel$onPaymentFlowResult$1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PaymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1(cVar, this.this$0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            PaymentFlowResultProcessor access$getPaymentFlowResultProcessor$p = this.this$0.this$0.paymentFlowResultProcessor;
            PaymentFlowResult.Unvalidated unvalidated = this.this$0.$paymentFlowResult;
            this.label = 1;
            obj = access$getPaymentFlowResultProcessor$p.processResult(unvalidated, this);
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
