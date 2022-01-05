package com.stripe.android;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.RetryDelaySupplier;
import com.stripe.android.payments.DefaultStripeChallengeStatusReceiver;
import com.stripe.android.payments.Stripe3ds2CompletionStarter;
import com.stripe.android.stripe3ds2.transaction.ChallengeParameters;
import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.view.AuthActivityStarter;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.stripe.android.StripePaymentController$startChallengeFlow$2", f = "StripePaymentController.kt", l = {931, 954, 961}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$startChallengeFlow$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ Stripe3ds2AuthResult.Ares $ares;
    public final /* synthetic */ AuthActivityStarter.Host $host;
    public final /* synthetic */ int $maxTimeout;
    public final /* synthetic */ PaymentRelayStarter $paymentRelayStarter;
    public final /* synthetic */ ApiRequest.Options $requestOptions;
    public final /* synthetic */ String $sourceId;
    public final /* synthetic */ StripeIntent $stripeIntent;
    public final /* synthetic */ Transaction $transaction;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$startChallengeFlow$2(StripePaymentController stripePaymentController, AuthActivityStarter.Host host, Transaction transaction, Stripe3ds2AuthResult.Ares ares, StripeIntent stripeIntent, String str, ApiRequest.Options options, int i, PaymentRelayStarter paymentRelayStarter, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripePaymentController;
        this.$host = host;
        this.$transaction = transaction;
        this.$ares = ares;
        this.$stripeIntent = stripeIntent;
        this.$sourceId = str;
        this.$requestOptions = options;
        this.$maxTimeout = i;
        this.$paymentRelayStarter = paymentRelayStarter;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        StripePaymentController$startChallengeFlow$2 stripePaymentController$startChallengeFlow$2 = new StripePaymentController$startChallengeFlow$2(this.this$0, this.$host, this.$transaction, this.$ares, this.$stripeIntent, this.$sourceId, this.$requestOptions, this.$maxTimeout, this.$paymentRelayStarter, cVar);
        stripePaymentController$startChallengeFlow$2.L$0 = obj;
        return stripePaymentController$startChallengeFlow$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripePaymentController$startChallengeFlow$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            try {
                Fragment fragment$payments_core_release = this.$host.getFragment$payments_core_release();
                if (fragment$payments_core_release != null) {
                    obj2 = new Stripe3ds2ActivityStarterHost(fragment$payments_core_release);
                } else {
                    Activity activity$payments_core_release = this.$host.getActivity$payments_core_release();
                    obj2 = activity$payments_core_release != null ? new Stripe3ds2ActivityStarterHost(activity$payments_core_release) : null;
                }
                if (obj2 != null) {
                    Throwable a = Result.a(obj2);
                    if (a == null) {
                        Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost2 = (Stripe3ds2ActivityStarterHost) obj2;
                        long cHALLENGE_DELAY$payments_core_release = StripePaymentController.Companion.getCHALLENGE_DELAY$payments_core_release();
                        this.L$0 = stripe3ds2ActivityStarterHost2;
                        this.label = 1;
                        if (a.d1(cHALLENGE_DELAY$payments_core_release, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        stripe3ds2ActivityStarterHost = stripe3ds2ActivityStarterHost2;
                    } else {
                        StripePaymentController stripePaymentController = this.this$0;
                        int requestCode$payments_core_release = StripePaymentController.Companion.getRequestCode$payments_core_release(this.$stripeIntent);
                        PaymentRelayStarter paymentRelayStarter = this.$paymentRelayStarter;
                        this.label = 3;
                        if (stripePaymentController.on3ds2AuthFailure(a, requestCode$payments_core_release, paymentRelayStarter, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return i.a;
                    }
                } else {
                    throw new IllegalArgumentException("Error while attempting to start 3DS2 challenge flow.".toString());
                }
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else if (i == 1) {
            h.d4(obj);
            stripe3ds2ActivityStarterHost = (Stripe3ds2ActivityStarterHost) this.L$0;
        } else if (i == 2 || i == 3) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Transaction transaction = this.$transaction;
        ChallengeParameters challengeParameters = new ChallengeParameters(this.$ares.getThreeDSServerTransId$payments_core_release(), this.$ares.getAcsTransId$payments_core_release(), (String) null, this.$ares.getAcsSignedContent$payments_core_release(), 4, (f) null);
        DefaultStripeChallengeStatusReceiver defaultStripeChallengeStatusReceiver = new DefaultStripeChallengeStatusReceiver((Stripe3ds2CompletionStarter) this.this$0.stripe3ds2CompletionStarterFactory.invoke(this.$host, new Integer(StripePaymentController.Companion.getRequestCode$payments_core_release(this.$stripeIntent))), this.this$0.stripeRepository, this.$stripeIntent, this.$sourceId, this.$requestOptions, this.this$0.analyticsRequestExecutor, this.this$0.analyticsRequestFactory, this.$transaction, new StripePaymentController$startChallengeFlow$2$invokeSuspend$$inlined$fold$lambda$1(this), (RetryDelaySupplier) null, false, this.this$0.workContext, 1536, (f) null);
        int i2 = this.$maxTimeout;
        this.L$0 = null;
        this.label = 2;
        if (transaction.doChallenge(stripe3ds2ActivityStarterHost, challengeParameters, (ChallengeStatusReceiver) defaultStripeChallengeStatusReceiver, i2, (m0.l.c<? super i>) this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return i.a;
    }
}
