package com.stripe.android.stripe3ds2.transaction;

import android.content.Intent;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB9\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeStarter;", "", "Lm0/i;", "start", "()V", "Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;", "host", "Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "args", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cresData", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "creqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "errorExecutorFactory", "", "timeoutMins", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;I)V", "(Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeStarter.kt */
public final class ChallengeStarter {
    private final ChallengeViewArgs args;
    private final Stripe3ds2ActivityStarterHost host;

    public ChallengeStarter(Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost, ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, ChallengeRequestExecutor.Factory factory, ErrorRequestExecutor.Factory factory2, int i) {
        i.e(stripe3ds2ActivityStarterHost, "host");
        i.e(challengeRequestData, "creqData");
        i.e(challengeResponseData, "cresData");
        i.e(stripeUiCustomization, "uiCustomization");
        ChallengeRequestExecutor.Config config2 = config;
        i.e(config2, "creqExecutorConfig");
        ChallengeRequestExecutor.Factory factory3 = factory;
        i.e(factory3, "creqExecutorFactory");
        ErrorRequestExecutor.Factory factory4 = factory2;
        i.e(factory4, "errorExecutorFactory");
        this.host = stripe3ds2ActivityStarterHost;
        this.args = new ChallengeViewArgs(challengeResponseData, challengeRequestData, stripeUiCustomization, config2, factory3, factory4, i);
    }

    public final void start() {
        Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost = this.host;
        Intent putExtras = new Intent(this.host.getActivity$3ds2sdk_release(), ChallengeActivity.class).putExtras(this.args.toBundle());
        i.d(putExtras, "Intent(host.activity, Ch…utExtras(args.toBundle())");
        stripe3ds2ActivityStarterHost.startActivity$3ds2sdk_release(putExtras);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChallengeStarter(Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost, ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, int i) {
        this(stripe3ds2ActivityStarterHost, challengeRequestData, challengeResponseData, stripeUiCustomization, config, new StripeChallengeRequestExecutor.Factory(), new StripeErrorRequestExecutor.Factory(), i);
        i.e(stripe3ds2ActivityStarterHost, "host");
        i.e(challengeRequestData, "creqData");
        i.e(challengeResponseData, "cresData");
        i.e(stripeUiCustomization, "uiCustomization");
        i.e(config, "creqExecutorConfig");
    }
}
