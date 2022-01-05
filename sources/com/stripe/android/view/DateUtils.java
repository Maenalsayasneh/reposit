package com.stripe.android.view;

import java.util.Calendar;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u0019\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/DateUtils;", "", "", "expiryMonth", "expiryYear", "", "isExpiryDataValid", "(II)Z", "Ljava/util/Calendar;", "calendar", "(IILjava/util/Calendar;)Z", "inputYear", "convertTwoDigitYearToFour", "(I)I", "(ILjava/util/Calendar;)I", "MAX_VALID_YEAR", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DateUtils.kt */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();
    private static final int MAX_VALID_YEAR = 9980;

    private DateUtils() {
    }

    public static final boolean isExpiryDataValid(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        i.d(instance, "Calendar.getInstance()");
        return isExpiryDataValid(i, i2, instance);
    }

    public final int convertTwoDigitYearToFour(int i) {
        Calendar instance = Calendar.getInstance();
        i.d(instance, "Calendar.getInstance()");
        return convertTwoDigitYearToFour(i, instance);
    }

    public static final boolean isExpiryDataValid(int i, int i2, Calendar calendar) {
        int i3;
        i.e(calendar, "calendar");
        if (1 > i || 12 < i || i2 < 0 || MAX_VALID_YEAR < i2 || i2 < (i3 = calendar.get(1))) {
            return false;
        }
        return i2 > i3 || i >= calendar.get(2) + 1;
    }

    public final int convertTwoDigitYearToFour(int i, Calendar calendar) {
        i.e(calendar, "calendar");
        int i2 = calendar.get(1);
        int i3 = i2 / 100;
        int i4 = i2 % 100;
        if (i4 > 80 && i < 20) {
            i3++;
        } else if (i4 < 20 && i > 80) {
            i3--;
        }
        return (i3 * 100) + i;
    }
}
