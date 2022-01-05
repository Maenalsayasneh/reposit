package com.stripe.android.paymentsheet.ui;

import com.stripe.android.model.CountryCode;
import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.view.CountryUtils;
import com.stripe.android.view.PostalCodeValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/CountryCode;", "newCountryCode", "Lm0/i;", "invoke", "(Lcom/stripe/android/model/CountryCode;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BillingAddressView.kt */
public final class BillingAddressView$newCountryCodeCallback$1 extends Lambda implements l<CountryCode, i> {
    public final /* synthetic */ BillingAddressView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillingAddressView$newCountryCodeCallback$1(BillingAddressView billingAddressView) {
        super(1);
        this.this$0 = billingAddressView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CountryCode) obj);
        return i.a;
    }

    public final void invoke(CountryCode countryCode) {
        m0.n.b.i.e(countryCode, "newCountryCode");
        this.this$0.updateStateView(countryCode);
        this.this$0.updatePostalCodeView(countryCode);
        this.this$0._address.setValue(this.this$0.createAddress());
        PostalCodeValidator access$getPostalCodeValidator$p = this.this$0.postalCodeValidator;
        BillingAddressView billingAddressView = this.this$0;
        String access$getValue$p = billingAddressView.getValue(billingAddressView.getPostalCodeView$payments_core_release());
        if (access$getValue$p == null) {
            access$getValue$p = "";
        }
        boolean isValid = access$getPostalCodeValidator$p.isValid(access$getValue$p, countryCode.getValue());
        BillingAddressView.PostalCodeViewListener postalCodeViewListener$payments_core_release = this.this$0.getPostalCodeViewListener$payments_core_release();
        if (postalCodeViewListener$payments_core_release != null) {
            postalCodeViewListener$payments_core_release.onCountryChanged(CountryUtils.INSTANCE.getCountryByCode$payments_core_release(countryCode, this.this$0.getLocale()), isValid);
        }
        this.this$0.getPostalCodeView$payments_core_release().setShouldShowError(!isValid);
    }
}
