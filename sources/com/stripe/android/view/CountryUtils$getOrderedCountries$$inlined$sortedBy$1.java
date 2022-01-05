package com.stripe.android.view;

import i0.j.f.p.h;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Comparisons.kt */
public final class CountryUtils$getOrderedCountries$$inlined$sortedBy$1<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        String name = ((Country) t).getName();
        Locale locale = Locale.ROOT;
        i.d(locale, "Locale.ROOT");
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(locale);
        i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        String name2 = ((Country) t2).getName();
        i.d(locale, "Locale.ROOT");
        Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase2 = name2.toLowerCase(locale);
        i.d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
        return h.L(lowerCase, lowerCase2);
    }
}
