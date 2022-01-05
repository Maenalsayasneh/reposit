package com.stripe.android;

import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.model.Source;
import com.stripe.android.view.AuthActivityStarter;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.StripePaymentController$bypassAuth$4", f = "StripePaymentController.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$bypassAuth$4 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ AuthActivityStarter.Host $host;
    public final /* synthetic */ Source $source;
    public final /* synthetic */ String $stripeAccountId;
    public int label;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$bypassAuth$4(StripePaymentController stripePaymentController, AuthActivityStarter.Host host, Source source, String str, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripePaymentController;
        this.$host = host;
        this.$source = source;
        this.$stripeAccountId = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new StripePaymentController$bypassAuth$4(this.this$0, this.$host, this.$source, this.$stripeAccountId, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripePaymentController$bypassAuth$4) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            ((PaymentRelayStarter) this.this$0.paymentRelayStarterFactory.invoke(this.$host)).start(new PaymentRelayStarter.Args.SourceArgs(this.$source, this.$stripeAccountId));
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
