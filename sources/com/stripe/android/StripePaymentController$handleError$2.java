package com.stripe.android;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.exception.StripeException;
import com.stripe.android.view.AuthActivityStarter;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.StripePaymentController$handleError$2", f = "StripePaymentController.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$handleError$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ AuthActivityStarter.Host $host;
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ Throwable $throwable;
    public int label;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$handleError$2(StripePaymentController stripePaymentController, AuthActivityStarter.Host host, Throwable th, int i, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripePaymentController;
        this.$host = host;
        this.$throwable = th;
        this.$requestCode = i;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new StripePaymentController$handleError$2(this.this$0, this.$host, this.$throwable, this.$requestCode, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripePaymentController$handleError$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            ((PaymentRelayStarter) this.this$0.paymentRelayStarterFactory.invoke(this.$host)).start(new PaymentRelayStarter.Args.ErrorArgs(StripeException.Companion.create(this.$throwable), this.$requestCode));
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
