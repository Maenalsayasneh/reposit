package com.stripe.android.model;

import com.stripe.android.model.CountryCode;
import java.util.Locale;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/util/Locale;", "Lcom/stripe/android/model/CountryCode;", "getCountryCode", "(Ljava/util/Locale;)Lcom/stripe/android/model/CountryCode;", "payments-core_release"}, k = 2, mv = {1, 4, 2})
/* compiled from: CountryCode.kt */
public final class CountryCodeKt {
    public static final CountryCode getCountryCode(Locale locale) {
        i.e(locale, "$this$getCountryCode");
        CountryCode.Companion companion = CountryCode.Companion;
        String country = locale.getCountry();
        i.d(country, "this.country");
        return companion.create(country);
    }
}
