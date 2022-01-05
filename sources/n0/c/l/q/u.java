package n0.c.l.q;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

/* compiled from: StringOps.kt */
public final class u {
    public static final String[] a;

    static {
        String[] strArr = new String[128];
        for (int i = 0; i <= 31; i++) {
            char c = c(i >> 12);
            char c2 = c(i >> 8);
            char c3 = c(i >> 4);
            char c4 = c(i);
            strArr[i] = "\\u" + c + c2 + c3 + c4;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        a = strArr;
    }

    public static final void a(StringBuilder sb, String str) {
        String str2;
        i.e(sb, "$this$printQuoted");
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = a;
            if (charAt < strArr.length && (str2 = strArr[charAt]) != null) {
                sb.append(str, i, i2);
                sb.append(str2);
                i = i2 + 1;
            }
        }
        sb.append(str, i, length);
        sb.append('\"');
    }

    public static final Boolean b(String str) {
        i.e(str, "$this$toBooleanStrictOrNull");
        if (StringsKt__IndentKt.f(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (StringsKt__IndentKt.f(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char c(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }
}
