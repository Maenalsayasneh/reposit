package com.stripe.android;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;

@c(c = "com.stripe.android.StripePaymentController$beginWebAuth$2", f = "StripePaymentController.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$beginWebAuth$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ String $authUrl;
    public final /* synthetic */ String $clientSecret;
    public final /* synthetic */ PaymentBrowserAuthStarter $paymentBrowserWebStarter;
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ String $returnUrl;
    public final /* synthetic */ boolean $shouldCancelIntentOnUserNavigation;
    public final /* synthetic */ boolean $shouldCancelSource;
    public final /* synthetic */ String $stripeAccount;
    public final /* synthetic */ StripeIntent $stripeIntent;
    public int label;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$beginWebAuth$2(StripePaymentController stripePaymentController, PaymentBrowserAuthStarter paymentBrowserAuthStarter, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripePaymentController;
        this.$paymentBrowserWebStarter = paymentBrowserAuthStarter;
        this.$stripeIntent = stripeIntent;
        this.$requestCode = i;
        this.$clientSecret = str;
        this.$authUrl = str2;
        this.$returnUrl = str3;
        this.$stripeAccount = str4;
        this.$shouldCancelSource = z;
        this.$shouldCancelIntentOnUserNavigation = z2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new StripePaymentController$beginWebAuth$2(this.this$0, this.$paymentBrowserWebStarter, this.$stripeIntent, this.$requestCode, this.$clientSecret, this.$authUrl, this.$returnUrl, this.$stripeAccount, this.$shouldCancelSource, this.$shouldCancelIntentOnUserNavigation, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripePaymentController$beginWebAuth$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            this.this$0.logger.debug("PaymentBrowserAuthStarter#start()");
            PaymentBrowserAuthStarter paymentBrowserAuthStarter = this.$paymentBrowserWebStarter;
            String id = this.$stripeIntent.getId();
            if (id == null) {
                id = "";
            }
            int i = this.$requestCode;
            String str = this.$clientSecret;
            String str2 = this.$authUrl;
            String str3 = this.$returnUrl;
            boolean access$getEnableLogging$p = this.this$0.enableLogging;
            String str4 = this.$stripeAccount;
            boolean z = this.$shouldCancelSource;
            boolean z2 = this.$shouldCancelIntentOnUserNavigation;
            PaymentBrowserAuthContract.Args args = r2;
            PaymentBrowserAuthContract.Args args2 = new PaymentBrowserAuthContract.Args(id, i, str, str2, str3, access$getEnableLogging$p, (StripeToolbarCustomization) null, str4, z, z2, (Integer) null, 1088, (f) null);
            paymentBrowserAuthStarter.start(args);
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
