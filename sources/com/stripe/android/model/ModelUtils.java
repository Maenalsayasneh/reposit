package com.stripe.android.model;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/ModelUtils;", "", "", "str", "", "isDigitsOnly", "(Ljava/lang/CharSequence;)Z", "", "value", "isWholePositiveNumber$payments_core_release", "(Ljava/lang/String;)Z", "isWholePositiveNumber", "", "year", "month", "Ljava/util/Calendar;", "now", "hasMonthPassed$payments_core_release", "(IILjava/util/Calendar;)Z", "hasMonthPassed", "hasYearPassed$payments_core_release", "(ILjava/util/Calendar;)Z", "hasYearPassed", "normalizeYear$payments_core_release", "(ILjava/util/Calendar;)I", "normalizeYear", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ModelUtils.kt */
public final class ModelUtils {
    public static final ModelUtils INSTANCE = new ModelUtils();

    private ModelUtils() {
    }

    private final boolean isDigitsOnly(CharSequence charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (!Character.isDigit(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }

    public final /* synthetic */ boolean hasMonthPassed$payments_core_release(int i, int i2, Calendar calendar) {
        i.e(calendar, "now");
        if (hasYearPassed$payments_core_release(i, calendar)) {
            return true;
        }
        if (normalizeYear$payments_core_release(i, calendar) != calendar.get(1) || i2 >= calendar.get(2) + 1) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean hasYearPassed$payments_core_release(int i, Calendar calendar) {
        i.e(calendar, "now");
        return normalizeYear$payments_core_release(i, calendar) < calendar.get(1);
    }

    public final /* synthetic */ boolean isWholePositiveNumber$payments_core_release(String str) {
        return str != null && isDigitsOnly(str);
    }

    public final /* synthetic */ int normalizeYear$payments_core_release(int i, Calendar calendar) {
        i.e(calendar, "now");
        if (i < 0 || 99 < i) {
            return i;
        }
        String valueOf = String.valueOf(calendar.get(1));
        String substring = valueOf.substring(0, valueOf.length() - 2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String format = String.format(Locale.US, "%s%02d", Arrays.copyOf(new Object[]{substring, Integer.valueOf(i)}, 2));
        i.d(format, "java.lang.String.format(locale, format, *args)");
        return Integer.parseInt(format);
    }
}
