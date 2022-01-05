package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingMethod;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$1$result$1", f = "PaymentFlowViewModel.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln0/a/f0;", "Lkotlin/Result;", "", "Lcom/stripe/android/model/ShippingMethod;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowViewModel.kt */
public final class PaymentFlowViewModel$validateShippingInformation$1$result$1 extends SuspendLambda implements p<f0, m0.l.c<? super Result<? extends List<? extends ShippingMethod>>>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PaymentFlowViewModel$validateShippingInformation$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewModel$validateShippingInformation$1$result$1(PaymentFlowViewModel$validateShippingInformation$1 paymentFlowViewModel$validateShippingInformation$1, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentFlowViewModel$validateShippingInformation$1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        PaymentFlowViewModel$validateShippingInformation$1$result$1 paymentFlowViewModel$validateShippingInformation$1$result$1 = new PaymentFlowViewModel$validateShippingInformation$1$result$1(this.this$0, cVar);
        paymentFlowViewModel$validateShippingInformation$1$result$1.L$0 = obj;
        return paymentFlowViewModel$validateShippingInformation$1$result$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentFlowViewModel$validateShippingInformation$1$result$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            PaymentFlowViewModel$validateShippingInformation$1 paymentFlowViewModel$validateShippingInformation$1 = this.this$0;
            if (paymentFlowViewModel$validateShippingInformation$1.$shippingInfoValidator.isValid(paymentFlowViewModel$validateShippingInformation$1.$shippingInformation)) {
                try {
                    PaymentFlowViewModel$validateShippingInformation$1 paymentFlowViewModel$validateShippingInformation$12 = this.this$0;
                    PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory = paymentFlowViewModel$validateShippingInformation$12.$shippingMethodsFactory;
                    obj2 = shippingMethodsFactory != null ? shippingMethodsFactory.create(paymentFlowViewModel$validateShippingInformation$12.$shippingInformation) : null;
                    if (obj2 == null) {
                        obj2 = EmptyList.c;
                    }
                } catch (Throwable th) {
                    obj2 = h.l0(th);
                }
            } else {
                try {
                    PaymentFlowViewModel$validateShippingInformation$1 paymentFlowViewModel$validateShippingInformation$13 = this.this$0;
                    obj3 = paymentFlowViewModel$validateShippingInformation$13.$shippingInfoValidator.getErrorMessage(paymentFlowViewModel$validateShippingInformation$13.$shippingInformation);
                } catch (Throwable th2) {
                    obj3 = h.l0(th2);
                }
                Throwable a = Result.a(obj3);
                if (a == null) {
                    a = new RuntimeException((String) obj3);
                }
                obj2 = h.l0(a);
            }
            return new Result(obj2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
