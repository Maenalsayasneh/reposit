package com.stripe.android.utils;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/utils/StripeUrlUtils;", "", "", "url", "", "isStripeUrl$payments_core_release", "(Ljava/lang/String;)Z", "isStripeUrl", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeUrlUtils.kt */
public final class StripeUrlUtils {
    public static final StripeUrlUtils INSTANCE = new StripeUrlUtils();

    private StripeUrlUtils() {
    }

    public final boolean isStripeUrl$payments_core_release(String str) {
        i.e(str, "url");
        Uri parse = Uri.parse(str);
        i.d(parse, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        if (!i.a(parse.getScheme(), "https")) {
            return false;
        }
        String host = parse.getHost();
        if (i.a(host, "stripe.com")) {
            return true;
        }
        if (host != null ? StringsKt__IndentKt.e(host, ".stripe.com", false, 2) : false) {
            return true;
        }
        return false;
    }
}
