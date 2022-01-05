package i0.e.b.i3;

import android.content.Context;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.util.Locale;
import m0.n.b.i;
import v0.a.a;

/* compiled from: PhoneNumbersUtil.kt */
public final class b {
    public static final b a = new b();
    public static PhoneNumberUtil b;

    public final String a(Context context, Phonenumber$PhoneNumber phonenumber$PhoneNumber, boolean z) {
        PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat;
        i.e(context, "<this>");
        i.e(phonenumber$PhoneNumber, "phoneNumber");
        PhoneNumberUtil c = c(context);
        if (z) {
            phoneNumberFormat = PhoneNumberUtil.PhoneNumberFormat.E164;
        } else {
            phoneNumberFormat = PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;
        }
        String e = c.e(phonenumber$PhoneNumber, phoneNumberFormat);
        i.d(e, "phoneUtil.format(phoneNumber, numberFormat)");
        return e;
    }

    public final String b(Context context, String str, boolean z) {
        i.e(context, "<this>");
        i.e(str, "str");
        try {
            Phonenumber$PhoneNumber y = c(context).y(str, Locale.getDefault().getCountry());
            i.d(y, "phoneNumberFull");
            return a(context, y, z);
        } catch (Exception e) {
            a.d.d(e);
            return str;
        }
    }

    public final PhoneNumberUtil c(Context context) {
        if (b == null) {
            PhoneNumberUtil b2 = PhoneNumberUtil.b(context);
            i.d(b2, "createInstance(context)");
            b = b2;
        }
        PhoneNumberUtil phoneNumberUtil = b;
        if (phoneNumberUtil != null) {
            return phoneNumberUtil;
        }
        i.m("phoneUtil");
        throw null;
    }
}
