package com.stripe.android.paymentsheet;

import i0.j.f.p.h;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/CurrencyFormatter;", "", "Ljava/util/Currency;", "currency", "", "getDefaultDecimalDigits", "(Ljava/util/Currency;)I", "", "amount", "", "amountCurrencyCode", "Ljava/util/Locale;", "targetLocale", "format", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "amountCurrency", "(JLjava/util/Currency;Ljava/util/Locale;)Ljava/lang/String;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CurrencyFormatter.kt */
public final class CurrencyFormatter {
    public static final Companion Companion = new Companion((f) null);
    private static final double MAJOR_UNIT_BASE = 10.0d;
    private static final Map<Set<String>, Integer> SERVER_DECIMAL_DIGITS = h.S2(new Pair(g.h0("UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP"), 2));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/CurrencyFormatter$Companion;", "", "", "MAJOR_UNIT_BASE", "D", "", "", "", "", "SERVER_DECIMAL_DIGITS", "Ljava/util/Map;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CurrencyFormatter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public static /* synthetic */ String format$default(CurrencyFormatter currencyFormatter, long j, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            i.d(locale, "Locale.getDefault()");
        }
        return currencyFormatter.format(j, str, locale);
    }

    private final int getDefaultDecimalDigits(Currency currency) {
        Map<Set<String>, Integer> map = SERVER_DECIMAL_DIGITS;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String currencyCode = currency.getCurrencyCode();
            i.d(currencyCode, "currency.currencyCode");
            Locale locale = Locale.ROOT;
            i.d(locale, "Locale.ROOT");
            String upperCase = currencyCode.toUpperCase(locale);
            i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            if (((Set) next.getKey()).contains(upperCase)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry value : linkedHashMap.entrySet()) {
            arrayList.add(Integer.valueOf(((Number) value.getValue()).intValue()));
        }
        Integer num = (Integer) g.w(arrayList);
        return num != null ? num.intValue() : currency.getDefaultFractionDigits();
    }

    public final String format(long j, String str, Locale locale) {
        i.e(str, "amountCurrencyCode");
        i.e(locale, "targetLocale");
        Locale locale2 = Locale.ROOT;
        i.d(locale2, "Locale.ROOT");
        String upperCase = str.toUpperCase(locale2);
        i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        Currency instance = Currency.getInstance(upperCase);
        i.d(instance, "Currency.getInstance(amo…toUpperCase(Locale.ROOT))");
        return format(j, instance, locale);
    }

    public static /* synthetic */ String format$default(CurrencyFormatter currencyFormatter, long j, Currency currency, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            i.d(locale, "Locale.getDefault()");
        }
        return currencyFormatter.format(j, currency, locale);
    }

    public final String format(long j, Currency currency, Locale locale) {
        i.e(currency, "amountCurrency");
        i.e(locale, "targetLocale");
        int defaultDecimalDigits = getDefaultDecimalDigits(currency);
        double pow = ((double) j) / Math.pow(MAJOR_UNIT_BASE, (double) defaultDecimalDigits);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        if (currencyInstance != null) {
            try {
                DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
                i.d(decimalFormatSymbols, "decimalFormatSymbols");
                decimalFormatSymbols.setCurrency(currency);
                decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(locale));
                ((DecimalFormat) currencyInstance).setMinimumFractionDigits(defaultDecimalDigits);
                ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            } catch (Throwable th) {
                h.l0(th);
            }
            String format = currencyInstance.format(pow);
            i.d(format, "currencyFormat.format(majorUnitAmount)");
            return format;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.text.DecimalFormat");
    }
}
