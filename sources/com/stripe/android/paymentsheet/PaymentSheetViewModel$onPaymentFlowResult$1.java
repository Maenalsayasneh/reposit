package com.stripe.android.paymentsheet;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.e;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$onPaymentFlowResult$1", f = "PaymentSheetViewModel.kt", l = {362}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModel$onPaymentFlowResult$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentFlowResult.Unvalidated $paymentFlowResult;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$onPaymentFlowResult$1(PaymentSheetViewModel paymentSheetViewModel, PaymentFlowResult.Unvalidated unvalidated, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentSheetViewModel;
        this.$paymentFlowResult = unvalidated;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        PaymentSheetViewModel$onPaymentFlowResult$1 paymentSheetViewModel$onPaymentFlowResult$1 = new PaymentSheetViewModel$onPaymentFlowResult$1(this.this$0, this.$paymentFlowResult, cVar);
        paymentSheetViewModel$onPaymentFlowResult$1.L$0 = obj;
        return paymentSheetViewModel$onPaymentFlowResult$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentSheetViewModel$onPaymentFlowResult$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            e access$getWorkContext$p = this.this$0.getWorkContext();
            PaymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1 paymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1 = new PaymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1((m0.l.c) null, this);
            this.label = 1;
            obj = a.k4(access$getWorkContext$p, paymentSheetViewModel$onPaymentFlowResult$1$invokeSuspend$$inlined$runCatching$lambda$1, this);
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
        obj2 = (StripeIntentResult) obj;
        Throwable a = Result.a(obj2);
        if (a == null) {
            this.this$0.onStripeIntentResult((StripeIntentResult) obj2);
        } else {
            PaymentSelection value = this.this$0.getSelection$payments_core_release().getValue();
            if (value != null) {
                this.this$0.eventReporter.onPaymentFailure(value);
            }
            StripeIntent value2 = this.this$0.getStripeIntent$payments_core_release().getValue();
            if (value2 != null) {
                PaymentSheetViewModel paymentSheetViewModel = this.this$0;
                m0.n.b.i.d(value2, "it");
                paymentSheetViewModel.resetViewState(value2, this.this$0.apiThrowableToString(a));
            }
        }
        return i.a;
    }
}
