package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \f*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\t\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "T", "", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "paymentSelection", "create", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "<init>", "()V", "Companion", "Lcom/stripe/android/paymentsheet/model/ConfirmPaymentIntentParamsFactory;", "Lcom/stripe/android/paymentsheet/model/ConfirmSetupIntentParamsFactory;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ConfirmStripeIntentParamsFactory.kt */
public abstract class ConfirmStripeIntentParamsFactory<T extends ConfirmStripeIntentParams> {
    public static final Companion Companion = new Companion((f) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory$Companion;", "", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "createFactory", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;)Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ConfirmStripeIntentParamsFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> createFactory(ClientSecret clientSecret) {
            i.e(clientSecret, "clientSecret");
            if (clientSecret instanceof PaymentIntentClientSecret) {
                return new ConfirmPaymentIntentParamsFactory(clientSecret);
            }
            if (clientSecret instanceof SetupIntentClientSecret) {
                return new ConfirmSetupIntentParamsFactory(clientSecret);
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    private ConfirmStripeIntentParamsFactory() {
    }

    public abstract T create(PaymentSelection.New newR);

    public abstract T create(PaymentSelection.Saved saved);

    public /* synthetic */ ConfirmStripeIntentParamsFactory(f fVar) {
        this();
    }
}
