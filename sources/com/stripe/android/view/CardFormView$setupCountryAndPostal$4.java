package com.stripe.android.view;

import com.stripe.android.model.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/CountryCode;", "countryCode", "Lm0/i;", "invoke", "(Lcom/stripe/android/model/CountryCode;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CardFormView.kt */
public final class CardFormView$setupCountryAndPostal$4 extends Lambda implements l<CountryCode, i> {
    public final /* synthetic */ CardFormView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardFormView$setupCountryAndPostal$4(CardFormView cardFormView) {
        super(1);
        this.this$0 = cardFormView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CountryCode) obj);
        return i.a;
    }

    public final void invoke(CountryCode countryCode) {
        m0.n.b.i.e(countryCode, "countryCode");
        this.this$0.updatePostalCodeViewLocale(countryCode);
        this.this$0.postalCodeContainer.setVisibility(CountryUtils.INSTANCE.doesCountryUsePostalCode$payments_core_release(countryCode) ? 0 : 8);
        this.this$0.postalCodeView.setShouldShowError(false);
        this.this$0.postalCodeView.setText((CharSequence) null);
    }
}
