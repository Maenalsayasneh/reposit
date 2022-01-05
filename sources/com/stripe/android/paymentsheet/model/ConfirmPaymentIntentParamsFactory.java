package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ConfirmPaymentIntentParamsFactory;", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "paymentSelection", "create", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "<init>", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ConfirmStripeIntentParamsFactory.kt */
public final class ConfirmPaymentIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmPaymentIntentParams> {
    private final ClientSecret clientSecret;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentIntentParamsFactory(ClientSecret clientSecret2) {
        super((f) null);
        i.e(clientSecret2, "clientSecret");
        this.clientSecret = clientSecret2;
    }

    public ConfirmPaymentIntentParams create(PaymentSelection.Saved saved) {
        i.e(saved, "paymentSelection");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
        String str = saved.getPaymentMethod().id;
        if (str == null) {
            str = "";
        }
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodId$default(companion, str, this.clientSecret.getValue(), (Boolean) null, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (ConfirmPaymentIntentParams.SetupFutureUsage) null, (ConfirmPaymentIntentParams.Shipping) null, 252, (Object) null);
    }

    public ConfirmPaymentIntentParams create(PaymentSelection.New newR) {
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        i.e(newR, "paymentSelection");
        ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
        PaymentMethodCreateParams paymentMethodCreateParams = newR.getPaymentMethodCreateParams();
        String value = this.clientSecret.getValue();
        boolean shouldSavePaymentMethod = newR.getShouldSavePaymentMethod();
        if (shouldSavePaymentMethod) {
            setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
        } else if (!shouldSavePaymentMethod) {
            setupFutureUsage = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(companion, paymentMethodCreateParams, value, (Boolean) null, (String) null, (MandateDataParams) null, setupFutureUsage, (ConfirmPaymentIntentParams.Shipping) null, 92, (Object) null);
    }
}
