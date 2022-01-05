package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.Stripe3ds2CompletionContract;
import com.ults.listeners.SdkChallengeInterface;
import h0.b.a.e;
import h0.s.a.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/Stripe3ds2CompletionActivity;", "Lh0/b/a/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2CompletionActivity.kt */
public final class Stripe3ds2CompletionActivity extends e {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentFlowResult.Unvalidated parsePaymentFlowResult = new Stripe3ds2CompletionContract().parsePaymentFlowResult(getIntent());
        a.a(this).c(new Intent().setAction(SdkChallengeInterface.UL_HANDLE_CHALLENGE_ACTION));
        setResult(-1, new Intent().putExtras(parsePaymentFlowResult.toBundle()));
        finish();
    }
}
