package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import com.stripe.android.payments.PaymentFlowResult;
import com.ults.listeners.SdkChallengeInterface;
import h0.b.a.e;
import h0.s.a.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentRelayActivity;", "Lh0/b/a/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentRelayActivity.kt */
public final class PaymentRelayActivity extends e {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a(this).c(new Intent().setAction(SdkChallengeInterface.UL_HANDLE_CHALLENGE_ACTION));
        setResult(-1, new Intent().putExtras(PaymentFlowResult.Unvalidated.Companion.fromIntent$payments_core_release(getIntent()).toBundle()));
    }

    public void onResume() {
        super.onResume();
        finish();
    }
}
