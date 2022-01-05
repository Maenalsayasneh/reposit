package com.stripe.android;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.model.Source;
import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;

@c(c = "com.stripe.android.StripePaymentController$startSourceAuth$2", f = "StripePaymentController.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$startSourceAuth$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentBrowserAuthStarter $paymentBrowserAuthStarter;
    public final /* synthetic */ ApiRequest.Options $requestOptions;
    public final /* synthetic */ Source $source;
    public int label;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$startSourceAuth$2(StripePaymentController stripePaymentController, PaymentBrowserAuthStarter paymentBrowserAuthStarter, Source source, ApiRequest.Options options, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripePaymentController;
        this.$paymentBrowserAuthStarter = paymentBrowserAuthStarter;
        this.$source = source;
        this.$requestOptions = options;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new StripePaymentController$startSourceAuth$2(this.this$0, this.$paymentBrowserAuthStarter, this.$source, this.$requestOptions, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripePaymentController$startSourceAuth$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            this.this$0.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.this$0.analyticsRequestFactory, AnalyticsEvent.AuthSourceRedirect, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
            PaymentBrowserAuthStarter paymentBrowserAuthStarter = this.$paymentBrowserAuthStarter;
            String id = this.$source.getId();
            String str3 = id != null ? id : "";
            String clientSecret = this.$source.getClientSecret();
            if (clientSecret != null) {
                str = clientSecret;
            } else {
                str = "";
            }
            Source.Redirect redirect = this.$source.getRedirect();
            String str4 = null;
            String url = redirect != null ? redirect.getUrl() : null;
            if (url != null) {
                str2 = url;
            } else {
                str2 = "";
            }
            Source.Redirect redirect2 = this.$source.getRedirect();
            if (redirect2 != null) {
                str4 = redirect2.getReturnUrl();
            }
            boolean access$getEnableLogging$p = this.this$0.enableLogging;
            PaymentBrowserAuthContract.Args args = r2;
            PaymentBrowserAuthContract.Args args2 = new PaymentBrowserAuthContract.Args(str3, StripePaymentController.SOURCE_REQUEST_CODE, str, str2, str4, access$getEnableLogging$p, (StripeToolbarCustomization) null, this.$requestOptions.getStripeAccount$payments_core_release(), false, false, (Integer) null, 1856, (f) null);
            paymentBrowserAuthStarter.start(args);
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
