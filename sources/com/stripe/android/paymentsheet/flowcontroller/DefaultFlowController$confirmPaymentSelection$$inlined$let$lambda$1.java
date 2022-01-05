package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.view.AuthActivityStarter;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmPaymentSelection$1$1", f = "DefaultFlowController.kt", l = {289}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$confirmPaymentSelection$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$confirmPaymentSelection$$inlined$let$lambda$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ConfirmStripeIntentParams $confirmParams;
    public int label;
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$confirmPaymentSelection$$inlined$let$lambda$1(ConfirmStripeIntentParams confirmStripeIntentParams, m0.l.c cVar, DefaultFlowController defaultFlowController) {
        super(2, cVar);
        this.$confirmParams = confirmStripeIntentParams;
        this.this$0 = defaultFlowController;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultFlowController$confirmPaymentSelection$$inlined$let$lambda$1(this.$confirmParams, cVar, this.this$0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlowController$confirmPaymentSelection$$inlined$let$lambda$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            ConfirmStripeIntentParams confirmStripeIntentParams = this.$confirmParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPaymentConfiguration().getPublishableKey(), this.this$0.getPaymentConfiguration().getStripeAccountId(), (String) null, 4, (f) null);
            this.label = 1;
            if (this.this$0.getPaymentController().startConfirmAndAuth((AuthActivityStarter.Host) this.this$0.authHostSupplier.invoke(), confirmStripeIntentParams, options, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
