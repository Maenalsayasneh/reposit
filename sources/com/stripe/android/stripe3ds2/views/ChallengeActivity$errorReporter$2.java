package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.SentryConfig;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.transaction.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "invoke", "()Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$errorReporter$2 extends Lambda implements a<DefaultErrorReporter> {
    public final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$errorReporter$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    public final DefaultErrorReporter invoke() {
        Context applicationContext = this.this$0.getApplicationContext();
        i.d(applicationContext, "applicationContext");
        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(this.this$0.getSdkTransactionId()), (e) null, (Logger) null, (SentryConfig) null, (String) null, (String) null, 0, 252, (f) null);
    }
}
