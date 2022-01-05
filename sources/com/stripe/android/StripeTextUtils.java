package com.stripe.android;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/StripeTextUtils;", "", "", "cardNumberWithSpaces", "removeSpacesAndHyphens", "(Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeTextUtils.kt */
public final class StripeTextUtils {
    public static final StripeTextUtils INSTANCE = new StripeTextUtils();

    private StripeTextUtils() {
    }

    public static final String removeSpacesAndHyphens(String str) {
        if (str == null || StringsKt__IndentKt.o(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        i.e("\\s|-", "pattern");
        Pattern compile = Pattern.compile("\\s|-");
        i.d(compile, "Pattern.compile(pattern)");
        i.e(compile, "nativePattern");
        i.e(str, "input");
        i.e("", "replacement");
        String replaceAll = compile.matcher(str).replaceAll("");
        i.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }
}
