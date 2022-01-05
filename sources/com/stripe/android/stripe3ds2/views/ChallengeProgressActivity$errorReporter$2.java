package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.SentryConfig;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.views.ChallengeProgressActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "invoke", "()Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeProgressActivity.kt */
public final class ChallengeProgressActivity$errorReporter$2 extends Lambda implements a<DefaultErrorReporter> {
    public final /* synthetic */ ChallengeProgressActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeProgressActivity$errorReporter$2(ChallengeProgressActivity challengeProgressActivity) {
        super(0);
        this.this$0 = challengeProgressActivity;
    }

    public final DefaultErrorReporter invoke() {
        DefaultErrorReporter.Config config;
        SdkTransactionId sdkTransactionId;
        ChallengeProgressActivity.Args access$getNullableArgs$p = this.this$0.getNullableArgs();
        if (access$getNullableArgs$p == null || (sdkTransactionId = access$getNullableArgs$p.getSdkTransactionId()) == null) {
            config = DefaultErrorReporter.EmptyConfig.INSTANCE;
        } else {
            config = new Stripe3ds2ErrorReporterConfig(sdkTransactionId);
        }
        DefaultErrorReporter.Config config2 = config;
        Context applicationContext = this.this$0.getApplicationContext();
        i.d(applicationContext, "applicationContext");
        return new DefaultErrorReporter(applicationContext, config2, (e) null, (Logger) null, (SentryConfig) null, (String) null, (String) null, 0, 252, (f) null);
    }
}
