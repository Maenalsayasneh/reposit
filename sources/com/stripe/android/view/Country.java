package com.stripe.android.view;

import com.stripe.android.model.CountryCode;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/view/Country;", "", "", "toString", "()Ljava/lang/String;", "Lcom/stripe/android/model/CountryCode;", "component1", "()Lcom/stripe/android/model/CountryCode;", "component2", "code", "name", "copy", "(Lcom/stripe/android/model/CountryCode;Ljava/lang/String;)Lcom/stripe/android/view/Country;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/CountryCode;", "getCode", "Ljava/lang/String;", "getName", "<init>", "(Lcom/stripe/android/model/CountryCode;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Country.kt */
public final class Country {
    private final CountryCode code;
    private final String name;

    public Country(CountryCode countryCode, String str) {
        i.e(countryCode, PaymentMethodOptionsParams.Blik.PARAM_CODE);
        i.e(str, "name");
        this.code = countryCode;
        this.name = str;
    }

    public static /* synthetic */ Country copy$default(Country country, CountryCode countryCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            countryCode = country.code;
        }
        if ((i & 2) != 0) {
            str = country.name;
        }
        return country.copy(countryCode, str);
    }

    public final CountryCode component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final Country copy(CountryCode countryCode, String str) {
        i.e(countryCode, PaymentMethodOptionsParams.Blik.PARAM_CODE);
        i.e(str, "name");
        return new Country(countryCode, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return i.a(this.code, country.code) && i.a(this.name, country.name);
    }

    public final CountryCode getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        CountryCode countryCode = this.code;
        int i = 0;
        int hashCode = (countryCode != null ? countryCode.hashCode() : 0) * 31;
        String str = this.name;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.name;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Country(String str, String str2) {
        this(CountryCode.Companion.create(str), str2);
        i.e(str, PaymentMethodOptionsParams.Blik.PARAM_CODE);
        i.e(str2, "name");
    }
}
