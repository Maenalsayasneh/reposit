package com.stripe.android.view;

import com.stripe.android.model.CountryCode;
import com.stripe.android.model.CountryCodeKt;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u001aR\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/stripe/android/view/CountryUtils;", "", "Ljava/util/Locale;", "currentLocale", "", "Lcom/stripe/android/view/Country;", "localizedCountries", "(Ljava/util/Locale;)Ljava/util/List;", "Lcom/stripe/android/model/CountryCode;", "countryCode", "", "getDisplayCountry", "(Lcom/stripe/android/model/CountryCode;Ljava/util/Locale;)Ljava/lang/String;", "countryName", "getCountryCodeByName$payments_core_release", "(Ljava/lang/String;Ljava/util/Locale;)Lcom/stripe/android/model/CountryCode;", "getCountryCodeByName", "getCountryByCode$payments_core_release", "(Lcom/stripe/android/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/view/Country;", "getCountryByCode", "getOrderedCountries$payments_core_release", "getOrderedCountries", "", "doesCountryUsePostalCode$payments_core_release", "(Ljava/lang/String;)Z", "doesCountryUsePostalCode", "(Lcom/stripe/android/model/CountryCode;)Z", "", "NO_POSTAL_CODE_COUNTRIES", "Ljava/util/Set;", "getNO_POSTAL_CODE_COUNTRIES$payments_core_release", "()Ljava/util/Set;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CountryUtils.kt */
public final class CountryUtils {
    public static final CountryUtils INSTANCE = new CountryUtils();
    private static final Set<String> NO_POSTAL_CODE_COUNTRIES = g.h0("AE", "AG", "AN", "AO", "AW", "BF", "BI", "BJ", "BO", "BS", "BW", "BZ", "CD", "CF", "CG", "CI", "CK", "CM", "DJ", "DM", "ER", "FJ", "GD", "GH", "GM", "GN", "GQ", "GY", "HK", "IE", "JM", "KE", "KI", "KM", "KN", "KP", "LC", "ML", "MO", "MR", "MS", "MU", "MW", "NR", "NU", "PA", "QA", "RW", "SB", "SC", "SL", "SO", "SR", "ST", "SY", "TF", "TK", "TL", "TO", "TT", "TV", "TZ", "UG", "VU", "YE", "ZA", "ZW");

    private CountryUtils() {
    }

    private final List<Country> localizedCountries(Locale locale) {
        String[] iSOCountries = Locale.getISOCountries();
        i.d(iSOCountries, "Locale.getISOCountries()");
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String str : iSOCountries) {
            CountryCode.Companion companion = CountryCode.Companion;
            i.d(str, PaymentMethodOptionsParams.Blik.PARAM_CODE);
            CountryCode create = companion.create(str);
            String displayCountry = new Locale("", str).getDisplayCountry(locale);
            i.d(displayCountry, "Locale(\"\", code).getDisplayCountry(currentLocale)");
            arrayList.add(new Country(create, displayCountry));
        }
        return arrayList;
    }

    public final /* synthetic */ boolean doesCountryUsePostalCode$payments_core_release(String str) {
        i.e(str, "countryCode");
        Set<String> set = NO_POSTAL_CODE_COUNTRIES;
        Locale locale = Locale.ROOT;
        i.d(locale, "Locale.ROOT");
        String upperCase = str.toUpperCase(locale);
        i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return !set.contains(upperCase);
    }

    public final /* synthetic */ Country getCountryByCode$payments_core_release(CountryCode countryCode, Locale locale) {
        T t;
        i.e(locale, "currentLocale");
        Iterator<T> it = localizedCountries(locale).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.a(((Country) t).getCode(), countryCode)) {
                break;
            }
        }
        return (Country) t;
    }

    public final /* synthetic */ CountryCode getCountryCodeByName$payments_core_release(String str, Locale locale) {
        T t;
        i.e(str, "countryName");
        i.e(locale, "currentLocale");
        Iterator<T> it = localizedCountries(locale).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.a(((Country) t).getName(), str)) {
                break;
            }
        }
        Country country = (Country) t;
        if (country != null) {
            return country.getCode();
        }
        return null;
    }

    public final /* synthetic */ String getDisplayCountry(CountryCode countryCode, Locale locale) {
        String name;
        i.e(countryCode, "countryCode");
        i.e(locale, "currentLocale");
        Country countryByCode$payments_core_release = getCountryByCode$payments_core_release(countryCode, locale);
        if (countryByCode$payments_core_release != null && (name = countryByCode$payments_core_release.getName()) != null) {
            return name;
        }
        String displayCountry = new Locale("", countryCode.getValue()).getDisplayCountry(locale);
        i.d(displayCountry, "Locale(\"\", countryCode.v…layCountry(currentLocale)");
        return displayCountry;
    }

    public final Set<String> getNO_POSTAL_CODE_COUNTRIES$payments_core_release() {
        return NO_POSTAL_CODE_COUNTRIES;
    }

    public final /* synthetic */ List<Country> getOrderedCountries$payments_core_release(Locale locale) {
        i.e(locale, "currentLocale");
        List L = g.L(getCountryByCode$payments_core_release(CountryCodeKt.getCountryCode(locale), locale));
        List<T> n02 = g.n0(localizedCountries(locale), new CountryUtils$getOrderedCountries$$inlined$sortedBy$1());
        ArrayList arrayList = new ArrayList();
        for (T next : n02) {
            if (!i.a(((Country) next).getCode(), CountryCodeKt.getCountryCode(locale))) {
                arrayList.add(next);
            }
        }
        return g.Z(L, arrayList);
    }

    public final /* synthetic */ boolean doesCountryUsePostalCode$payments_core_release(CountryCode countryCode) {
        i.e(countryCode, "countryCode");
        return !NO_POSTAL_CODE_COUNTRIES.contains(countryCode.getValue());
    }
}
