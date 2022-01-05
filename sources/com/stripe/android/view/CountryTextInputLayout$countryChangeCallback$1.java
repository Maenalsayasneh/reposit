package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/Country;", "it", "Lm0/i;", "invoke", "(Lcom/stripe/android/view/Country;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: CountryTextInputLayout.kt */
public final class CountryTextInputLayout$countryChangeCallback$1 extends Lambda implements l<Country, i> {
    public static final CountryTextInputLayout$countryChangeCallback$1 INSTANCE = new CountryTextInputLayout$countryChangeCallback$1();

    public CountryTextInputLayout$countryChangeCallback$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Country) obj);
        return i.a;
    }

    public final void invoke(Country country) {
        m0.n.b.i.e(country, "it");
    }
}
