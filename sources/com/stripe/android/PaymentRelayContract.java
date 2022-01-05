package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.Source;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.PaymentRelayActivity;
import h0.a.f.d.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/PaymentRelayContract;", "Lh0/a/f/d/a;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/stripe/android/PaymentRelayStarter$Args;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentRelayContract.kt */
public final class PaymentRelayContract extends a<PaymentRelayStarter.Args, PaymentFlowResult.Unvalidated> {
    public Intent createIntent(Context context, PaymentRelayStarter.Args args) {
        PaymentFlowResult.Unvalidated unvalidated;
        i.e(context, "context");
        if (args == null || (unvalidated = args.toResult()) == null) {
            unvalidated = new PaymentFlowResult.Unvalidated((String) null, 0, (StripeException) null, false, (String) null, (Source) null, (String) null, 127, (f) null);
        }
        Intent putExtras = new Intent(context, PaymentRelayActivity.class).putExtras(unvalidated.toBundle());
        i.d(putExtras, "Intent(context, PaymentR…entFlowResult.toBundle())");
        return putExtras;
    }

    public PaymentFlowResult.Unvalidated parseResult(int i, Intent intent) {
        return PaymentFlowResult.Unvalidated.Companion.fromIntent$payments_core_release(intent);
    }
}
