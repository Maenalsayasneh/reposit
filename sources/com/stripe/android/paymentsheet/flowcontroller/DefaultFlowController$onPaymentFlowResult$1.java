package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f0;
import n0.a.h2.o;
import n0.a.l1;
import n0.a.m0;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$onPaymentFlowResult$1", f = "DefaultFlowController.kt", l = {423, 427, 434}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$onPaymentFlowResult$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentFlowResult.Unvalidated $paymentFlowResult;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$onPaymentFlowResult$1(DefaultFlowController defaultFlowController, PaymentFlowResult.Unvalidated unvalidated, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultFlowController;
        this.$paymentFlowResult = unvalidated;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        DefaultFlowController$onPaymentFlowResult$1 defaultFlowController$onPaymentFlowResult$1 = new DefaultFlowController$onPaymentFlowResult$1(this.this$0, this.$paymentFlowResult, cVar);
        defaultFlowController$onPaymentFlowResult$1.L$0 = obj;
        return defaultFlowController$onPaymentFlowResult$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlowController$onPaymentFlowResult$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            PaymentFlowResultProcessor access$getPaymentFlowResultProcessor$p = this.this$0.getPaymentFlowResultProcessor();
            PaymentFlowResult.Unvalidated unvalidated = this.$paymentFlowResult;
            this.label = 1;
            obj = access$getPaymentFlowResultProcessor$p.processResult(unvalidated, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else if (i == 2 || i == 3) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (StripeIntentResult) obj;
        Throwable a = Result.a(obj2);
        if (a == null) {
            d0 d0Var = m0.a;
            l1 l1Var = o.c;
            DefaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$1 defaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$1 = new DefaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$1((StripeIntentResult) obj2, (m0.l.c) null, this);
            this.label = 2;
            if (a.k4(l1Var, defaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            d0 d0Var2 = m0.a;
            l1 l1Var2 = o.c;
            DefaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$2 defaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$2 = new DefaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$2(a, (m0.l.c) null, this);
            this.label = 3;
            if (a.k4(l1Var2, defaultFlowController$onPaymentFlowResult$1$invokeSuspend$$inlined$fold$lambda$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return i.a;
    }
}
