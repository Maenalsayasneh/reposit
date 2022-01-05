package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "requireValid", "(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeIntentValidator.kt */
public final class StripeIntentValidator {
    public final /* synthetic */ StripeIntent requireValid(StripeIntent stripeIntent) {
        i.e(stripeIntent, "stripeIntent");
        boolean z = stripeIntent instanceof PaymentIntent;
        if (z) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            if (paymentIntent.getConfirmationMethod() != PaymentIntent.ConfirmationMethod.Automatic) {
                StringBuilder P0 = a.P0("\n                        PaymentIntent with confirmation_method='automatic' is required.\n                        The current PaymentIntent has confirmation_method ");
                P0.append(paymentIntent.getConfirmationMethod());
                P0.append(".\n                        See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n                    ");
                throw new IllegalStateException(StringsKt__IndentKt.Y(P0.toString()).toString());
            }
        }
        if (z && stripeIntent.getStatus() != StripeIntent.Status.RequiresPaymentMethod) {
            StringBuilder P02 = a.P0("\n                        A PaymentIntent with status='requires_payment_method' is required.\n                        The current PaymentIntent has status ");
            P02.append(stripeIntent.getStatus());
            P02.append(".\n                        See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n                    ");
            throw new IllegalStateException(StringsKt__IndentKt.Y(P02.toString()).toString());
        } else if (!(stripeIntent instanceof SetupIntent) || stripeIntent.getStatus() == StripeIntent.Status.RequiresPaymentMethod) {
            return stripeIntent;
        } else {
            StringBuilder P03 = a.P0("\n                        A SetupIntent with status='requires_payment_method' is required.\n                        The current SetupIntent has status ");
            P03.append(stripeIntent.getStatus());
            P03.append(".\n                        See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status\n                    ");
            throw new IllegalStateException(StringsKt__IndentKt.Y(P03.toString()).toString());
        }
    }
}
