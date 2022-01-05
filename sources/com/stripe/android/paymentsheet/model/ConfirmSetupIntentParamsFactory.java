package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ConfirmSetupIntentParamsFactory;", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "paymentSelection", "create", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "<init>", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ConfirmStripeIntentParamsFactory.kt */
public final class ConfirmSetupIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmSetupIntentParams> {
    private final ClientSecret clientSecret;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfirmSetupIntentParamsFactory(ClientSecret clientSecret2) {
        super((f) null);
        i.e(clientSecret2, "clientSecret");
        this.clientSecret = clientSecret2;
    }

    public ConfirmSetupIntentParams create(PaymentSelection.Saved saved) {
        i.e(saved, "paymentSelection");
        ConfirmSetupIntentParams.Companion companion = ConfirmSetupIntentParams.Companion;
        String str = saved.getPaymentMethod().id;
        if (str == null) {
            str = "";
        }
        return ConfirmSetupIntentParams.Companion.create$default(companion, str, this.clientSecret.getValue(), (MandateDataParams) null, (String) null, 12, (Object) null);
    }

    public ConfirmSetupIntentParams create(PaymentSelection.New newR) {
        i.e(newR, "paymentSelection");
        return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, newR.getPaymentMethodCreateParams(), this.clientSecret.getValue(), (MandateDataParams) null, (String) null, 12, (Object) null);
    }
}
