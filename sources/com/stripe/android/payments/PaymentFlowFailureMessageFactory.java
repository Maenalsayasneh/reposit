package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.R;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "", "Lcom/stripe/android/model/PaymentIntent;", "paymentIntent", "", "createForPaymentIntent", "(Lcom/stripe/android/model/PaymentIntent;)Ljava/lang/String;", "Lcom/stripe/android/model/SetupIntent;", "setupIntent", "createForSetupIntent", "(Lcom/stripe/android/model/SetupIntent;)Ljava/lang/String;", "Lcom/stripe/android/model/StripeIntent;", "intent", "", "outcome", "create", "(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowFailureMessageFactory.kt */
public final class PaymentFlowFailureMessageFactory {
    private final Context context;

    public PaymentFlowFailureMessageFactory(Context context2) {
        i.e(context2, "context");
        this.context = context2;
    }

    private final String createForPaymentIntent(PaymentIntent paymentIntent) {
        PaymentIntent.Error lastPaymentError = paymentIntent.getLastPaymentError();
        if (i.a(lastPaymentError != null ? lastPaymentError.getCode() : null, "payment_intent_authentication_failure")) {
            return this.context.getResources().getString(R.string.stripe_failure_reason_authentication);
        }
        PaymentIntent.Error lastPaymentError2 = paymentIntent.getLastPaymentError();
        if ((lastPaymentError2 != null ? lastPaymentError2.getType() : null) == PaymentIntent.Error.Type.CardError) {
            return paymentIntent.getLastPaymentError().getMessage();
        }
        return null;
    }

    private final String createForSetupIntent(SetupIntent setupIntent) {
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (i.a(lastSetupError != null ? lastSetupError.getCode() : null, "payment_intent_authentication_failure")) {
            return this.context.getResources().getString(R.string.stripe_failure_reason_authentication);
        }
        SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
        if ((lastSetupError2 != null ? lastSetupError2.getType() : null) == SetupIntent.Error.Type.CardError) {
            return setupIntent.getLastSetupError().getMessage();
        }
        return null;
    }

    public final String create(StripeIntent stripeIntent, int i) {
        i.e(stripeIntent, "intent");
        if (stripeIntent.getStatus() == StripeIntent.Status.RequiresPaymentMethod) {
            if (stripeIntent instanceof PaymentIntent) {
                return createForPaymentIntent((PaymentIntent) stripeIntent);
            }
            if (stripeIntent instanceof SetupIntent) {
                return createForSetupIntent((SetupIntent) stripeIntent);
            }
            return null;
        } else if (i == 4) {
            return this.context.getResources().getString(R.string.stripe_failure_reason_timed_out);
        } else {
            return null;
        }
    }
}
