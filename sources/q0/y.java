package q0;

import i0.j.f.p.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.c;
import m0.q.e;

/* compiled from: MediaType.kt */
public final class y {
    public static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public static final a c = null;
    public final String d;
    public final String e;
    public final String[] f;

    /* compiled from: MediaType.kt */
    public static final class a {
        public static final y a(String str) {
            i.e(str, "$this$toMediaType");
            Matcher matcher = y.a.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                i.d(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                i.d(locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                i.d(group2, "typeSubtype.group(2)");
                i.d(locale, "Locale.US");
                String lowerCase2 = group2.toLowerCase(locale);
                i.d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = y.b.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (StringsKt__IndentKt.J(group4, "'", false, 2) && StringsKt__IndentKt.e(group4, "'", false, 2) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                i.d(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder P0 = i0.d.a.a.a.P0("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        i.d(substring, "(this as java.lang.String).substring(startIndex)");
                        P0.append(substring);
                        P0.append("\" for: \"");
                        P0.append(str);
                        P0.append('\"');
                        throw new IllegalArgumentException(P0.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new y(str, lowerCase, lowerCase2, (String[]) array, (f) null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public static final y b(String str) {
            i.e(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public y(String str, String str2, String str3, String[] strArr, f fVar) {
        this.d = str;
        this.e = str2;
        this.f = strArr;
    }

    public static final y b(String str) {
        return a.a(str);
    }

    public final Charset a(Charset charset) {
        String str;
        i.e("charset", "name");
        String[] strArr = this.f;
        i.e(strArr, "$this$indices");
        c e2 = m0.q.i.e(new e(0, h.t1(strArr)), 2);
        int i = e2.c;
        int i2 = e2.d;
        int i3 = e2.q;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                if (!StringsKt__IndentKt.f(this.f[i], "charset", true)) {
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                } else {
                    str = this.f[i + 1];
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && i.a(((y) obj).d, this.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d;
    }
}
