package kotlin.text;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.instabug.library.model.State;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.f;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.q.c;
import m0.r.t.a.r.m.a1.a;
import m0.t.b;
import m0.t.e;
import org.json.HTTP;

/* compiled from: Indent.kt */
public class StringsKt__IndentKt extends e {
    public static String A(String str, char c, char c2, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        i.e(str, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            i.d(replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (a.o1(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static String B(String str, String str2, String str3, boolean z, int i) {
        int i2 = 0;
        if ((i & 4) != 0) {
            z = false;
        }
        i.e(str, "$this$replace");
        i.e(str2, "oldValue");
        i.e(str3, "newValue");
        int i3 = i(str, str2, 0, z);
        if (i3 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = 1;
        if (length >= 1) {
            i4 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i2, i3);
                sb.append(str3);
                i2 = i3 + length;
                if (i3 >= str.length() || (i3 = i(str, str2, i3 + i4, z)) <= 0) {
                    sb.append(str, i2, str.length());
                    String sb2 = sb.toString();
                    i.d(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i2, i3);
                sb.append(str3);
                i2 = i3 + length;
                break;
            } while ((i3 = i(str, str2, i3 + i4, z)) <= 0);
            sb.append(str, i2, str.length());
            String sb22 = sb.toString();
            i.d(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static final List<String> C(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        boolean z2 = true;
        if (i >= 0) {
            int i3 = i(charSequence, str, 0, z);
            if (i3 == -1 || i == 1) {
                return h.L2(charSequence.toString());
            }
            if (i <= 0) {
                z2 = false;
            }
            int i4 = 10;
            if (z2 && i <= 10) {
                i4 = i;
            }
            ArrayList arrayList = new ArrayList(i4);
            do {
                arrayList.add(charSequence.subSequence(i2, i3).toString());
                i2 = str.length() + i3;
                if ((z2 && arrayList.size() == i - 1) || (i3 = i(charSequence, str, i2, z)) == -1) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, i3).toString());
                i2 = str.length() + i3;
                break;
            } while ((i3 = i(charSequence, str, i2, z)) == -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public static List D(CharSequence charSequence, char[] cArr, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        i.e(charSequence, "$this$split");
        i.e(cArr, "delimiters");
        boolean z2 = true;
        if (cArr.length == 1) {
            return C(charSequence, String.valueOf(cArr[0]), z, i);
        }
        if (i < 0) {
            z2 = false;
        }
        if (z2) {
            Iterable a = SequencesKt___SequencesKt.a(new b(charSequence, 0, i, new StringsKt__StringsKt$rangesDelimitedBy$2(cArr, z)));
            ArrayList arrayList = new ArrayList(h.K(a, 10));
            Iterator it = ((SequencesKt___SequencesKt.a) a).iterator();
            while (it.hasNext()) {
                arrayList.add(K(charSequence, (m0.q.e) it.next()));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public static List E(CharSequence charSequence, String[] strArr, boolean z, int i, int i2) {
        boolean z2 = false;
        boolean z3 = (i2 & 2) != 0 ? false : z;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        i.e(charSequence, "$this$split");
        i.e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return C(charSequence, str, z3, i3);
            }
        }
        Iterable a = SequencesKt___SequencesKt.a(u(charSequence, strArr, 0, z3, i3, 2));
        ArrayList arrayList = new ArrayList(h.K(a, 10));
        Iterator it = ((SequencesKt___SequencesKt.a) a).iterator();
        while (it.hasNext()) {
            arrayList.add(K(charSequence, (m0.q.e) it.next()));
        }
        return arrayList;
    }

    public static final boolean F(String str, String str2, int i, boolean z) {
        i.e(str, "$this$startsWith");
        i.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return v(str, i, str2, 0, str2.length(), z);
    }

    public static final boolean G(String str, String str2, boolean z) {
        i.e(str, "$this$startsWith");
        i.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return v(str, 0, str2, 0, str2.length(), z);
    }

    public static boolean H(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        i.e(charSequence, "$this$startsWith");
        i.e(charSequence2, "prefix");
        if (!z2 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return J((String) charSequence, (String) charSequence2, false, 2);
        }
        return w(charSequence, 0, charSequence2, 0, charSequence2.length(), z2);
    }

    public static /* synthetic */ boolean I(String str, String str2, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return F(str, str2, i, z);
    }

    public static /* synthetic */ boolean J(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return G(str, str2, z);
    }

    public static final String K(CharSequence charSequence, m0.q.e eVar) {
        i.e(charSequence, "$this$substring");
        i.e(eVar, "range");
        return charSequence.subSequence(eVar.c().intValue(), eVar.j().intValue() + 1).toString();
    }

    public static final String L(String str, String str2, String str3) {
        i.e(str, "$this$substringAfter");
        i.e(str2, "delimiter");
        i.e(str3, "missingDelimiterValue");
        int m = m(str, str2, 0, false, 6);
        if (m == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + m, str.length());
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String M(String str, char c, String str2, int i) {
        String str3 = (i & 2) != 0 ? str : null;
        i.e(str, "$this$substringAfter");
        i.e(str3, "missingDelimiterValue");
        int l = l(str, c, 0, false, 6);
        if (l == -1) {
            return str3;
        }
        String substring = str.substring(l + 1, str.length());
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String N(String str, String str2, String str3, int i) {
        return L(str, str2, (i & 2) != 0 ? str : null);
    }

    public static final String O(String str, char c, String str2) {
        i.e(str, "$this$substringAfterLast");
        i.e(str2, "missingDelimiterValue");
        int p = p(str, c, 0, false, 6);
        if (p == -1) {
            return str2;
        }
        String substring = str.substring(p + 1, str.length());
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String P(String str, char c, String str2, int i) {
        return O(str, c, (i & 2) != 0 ? str : null);
    }

    public static String Q(String str, char c, String str2, int i) {
        String str3 = (i & 2) != 0 ? str : null;
        i.e(str, "$this$substringBefore");
        i.e(str3, "missingDelimiterValue");
        int l = l(str, c, 0, false, 6);
        if (l == -1) {
            return str3;
        }
        String substring = str.substring(0, l);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String R(String str, String str2, String str3, int i) {
        String str4 = (i & 2) != 0 ? str : null;
        i.e(str, "$this$substringBefore");
        i.e(str2, "delimiter");
        i.e(str4, "missingDelimiterValue");
        int m = m(str, str2, 0, false, 6);
        if (m == -1) {
            return str4;
        }
        String substring = str.substring(0, m);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Integer S(String str) {
        i.e(str, "$this$toIntOrNull");
        return T(str, 10);
    }

    public static final Integer T(String str, int i) {
        boolean z;
        int i2;
        i.e(str, "$this$toIntOrNull");
        a.B0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (i.g(charAt, 48) >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int digit = Character.digit(str.charAt(i5), i);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i5++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static final Long U(String str, int i) {
        String str2 = str;
        int i2 = i;
        i.e(str2, "$this$toLongOrNull");
        a.B0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        boolean z = true;
        if (i.g(charAt, 48) >= 0) {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i3 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i3 = 1;
            }
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i3 < length) {
            int digit = Character.digit(str2.charAt(i3), i2);
            if (digit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i2);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i2);
            long j6 = (long) digit;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i3++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    public static final m0.e V(String str, int i) {
        i.e(str, "$this$toUIntOrNull");
        a.B0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = 1;
        if (i.g(charAt, 48) >= 0) {
            i3 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int i4 = 119304647;
        while (i3 < length) {
            int digit = Character.digit(str.charAt(i3), i);
            if (digit < 0) {
                return null;
            }
            if (h.u4(i2, i4) > 0) {
                if (i4 == 119304647) {
                    i4 = (int) ((((long) -1) & 4294967295L) / (4294967295L & ((long) i)));
                    if (h.u4(i2, i4) > 0) {
                    }
                }
                return null;
            }
            int i5 = i2 * i;
            int i6 = digit + i5;
            if (h.u4(i6, i5) < 0) {
                return null;
            }
            i3++;
            i2 = i6;
        }
        return new m0.e(i2);
    }

    public static final f W(String str) {
        int i;
        int i2;
        String str2 = str;
        i.e(str2, "$this$toULongOrNull");
        i.e(str2, "$this$toULongOrNull");
        int i3 = 10;
        a.B0(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str2.charAt(0);
            if (i.g(charAt, 48) >= 0) {
                i = 0;
            } else if (length != 1 && charAt == '+') {
                i = 1;
            }
            long j = (long) 10;
            long j2 = 0;
            long j3 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit(str2.charAt(i), i3);
                if (digit >= 0) {
                    if (h.v4(j2, j3) <= 0) {
                        i2 = length;
                    } else if (j3 == 512409557603043100L) {
                        i2 = length;
                        if (j < 0) {
                            j3 = h.v4(-1, j) < 0 ? 0 : 1;
                        } else {
                            long j4 = (RecyclerView.FOREVER_NS / j) << 1;
                            j3 = j4 + ((long) (h.v4(-1 - (j4 * j), j) >= 0 ? 1 : 0));
                        }
                        if (h.v4(j2, j3) > 0) {
                        }
                    }
                    long j5 = j2 * j;
                    long j6 = (((long) digit) & 4294967295L) + j5;
                    if (h.v4(j6, j5) >= 0) {
                        i++;
                        j2 = j6;
                        length = i2;
                        i3 = 10;
                    }
                }
            }
            return new f(j2);
        }
        return null;
    }

    public static final CharSequence X(CharSequence charSequence) {
        i.e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean B2 = a.B2(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!B2) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!B2) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final String Y(String str) {
        int i;
        Comparable comparable;
        i.e(str, "$this$trimIndent");
        i.e(str, "$this$replaceIndent");
        i.e("", "newIndent");
        List<String> r = r(str);
        ArrayList arrayList = new ArrayList();
        for (T next : r) {
            if (!o((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!a.B2(str2.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        i.e(arrayList2, "$this$minOrNull");
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int size = (r.size() * 0) + str.length();
        l<String, String> g = g("");
        int y = g.y(r);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : r) {
            int i2 = i + 1;
            if (i >= 0) {
                String str3 = (String) next2;
                if ((i == 0 || i == y) && o(str3)) {
                    str3 = null;
                } else {
                    String invoke = g.invoke(a.h1(str3, intValue));
                    if (invoke != null) {
                        str3 = invoke;
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i = i2;
            } else {
                g.r0();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(size);
        g.C(arrayList3, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124);
        String sb2 = sb.toString();
        i.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static String Z(String str, String str2, int i) {
        String str3;
        String invoke;
        String str4 = (i & 1) != 0 ? "|" : null;
        i.e(str, "$this$trimMargin");
        i.e(str4, "marginPrefix");
        i.e(str, "$this$replaceIndentByMargin");
        i.e("", "newIndent");
        i.e(str4, "marginPrefix");
        if (!o(str4)) {
            List<String> r = r(str);
            int size = (r.size() * 0) + str.length();
            l<String, String> g = g("");
            int y = g.y(r);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T next : r) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str5 = (String) next;
                    if ((i2 == 0 || i2 == y) && o(str5)) {
                        str5 = null;
                    } else {
                        int length = str5.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i4 = -1;
                                break;
                            } else if (!a.B2(str5.charAt(i4))) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 != -1 && I(str5, str4, i4, false, 4)) {
                            str3 = str5.substring(str4.length() + i4);
                            i.d(str3, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            str3 = null;
                        }
                        if (!(str3 == null || (invoke = g.invoke(str3)) == null)) {
                            str5 = invoke;
                        }
                    }
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                    i2 = i3;
                } else {
                    g.r0();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(size);
            g.C(arrayList, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124);
            String sb2 = sb.toString();
            i.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String a(String str) {
        i.e(str, "$this$capitalize");
        Locale locale = Locale.getDefault();
        i.d(locale, "Locale.getDefault()");
        i.e(str, "$this$capitalize");
        i.e(locale, State.KEY_LOCALE);
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String upperCase = substring.toUpperCase(locale);
            i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        i.d(substring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.e(charSequence, "$this$contains");
        i.e(charSequence2, RecaptchaActionType.OTHER);
        if (!(charSequence2 instanceof String)) {
            if (k(charSequence, charSequence2, 0, charSequence.length(), z, false, 16) >= 0) {
                return true;
            }
        } else if (m(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean c(CharSequence charSequence, char c, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        i.e(charSequence, "$this$contains");
        if (l(charSequence, c, 0, z, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean d(CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(charSequence, charSequence2, z);
    }

    public static boolean e(String str, String str2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        i.e(str, "$this$endsWith");
        i.e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return v(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean f(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final l<String, String> g(String str) {
        if (str.length() == 0) {
            return StringsKt__IndentKt$getIndentFunction$1.c;
        }
        return new StringsKt__IndentKt$getIndentFunction$2(str);
    }

    public static final int h(CharSequence charSequence) {
        i.e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int i(CharSequence charSequence, String str, int i, boolean z) {
        i.e(charSequence, "$this$indexOf");
        i.e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return k(charSequence, str, i, charSequence.length(), z, false, 16);
    }

    public static final int j(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        c cVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            cVar = new m0.q.e(i, i2);
        } else {
            int h = h(charSequence);
            if (i > h) {
                i = h;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            cVar = m0.q.i.d(i, i2);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = cVar.c;
            int i4 = cVar.d;
            int i5 = cVar.q;
            if (i5 >= 0) {
                if (i3 > i4) {
                    return -1;
                }
            } else if (i3 < i4) {
                return -1;
            }
            while (true) {
                if (w(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    return i3;
                }
                if (i3 == i4) {
                    return -1;
                }
                i3 += i5;
            }
        } else {
            int i6 = cVar.c;
            int i7 = cVar.d;
            int i8 = cVar.q;
            if (i8 >= 0) {
                if (i6 > i7) {
                    return -1;
                }
            } else if (i6 < i7) {
                return -1;
            }
            while (true) {
                if (v((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                    return i6;
                }
                if (i6 == i7) {
                    return -1;
                }
                i6 += i8;
            }
        }
    }

    public static /* synthetic */ int k(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return j(charSequence, charSequence2, i, i2, z, z2);
    }

    public static int l(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        i.e(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return n(charSequence, new char[]{c}, i, z);
    }

    public static /* synthetic */ int m(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return i(charSequence, str, i, z);
    }

    public static final int n(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        i.e(charSequence, "$this$indexOfAny");
        i.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int h = h(charSequence);
            if (i > h) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (a.o1(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return i;
                }
                if (i == h) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(h.R3(cArr), i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean o(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            m0.n.b.i.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "$this$indices"
            m0.n.b.i.e(r4, r0)
            m0.q.e r0 = new m0.q.e
            int r3 = r4.length()
            int r3 = r3 + -1
            r0.<init>(r1, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002b
            goto L_0x0049
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            r3 = r0
            m0.q.d r3 = (m0.q.d) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0049
            r3 = r0
            m0.j.o r3 = (m0.j.o) r3
            int r3 = r3.a()
            char r3 = r4.charAt(r3)
            boolean r3 = m0.r.t.a.r.m.a1.a.B2(r3)
            if (r3 != 0) goto L_0x002f
            r4 = r1
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            if (r4 == 0) goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__IndentKt.o(java.lang.CharSequence):boolean");
    }

    public static int p(CharSequence charSequence, char c, int i, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = h(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        i.e(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        i.e(charSequence, "$this$lastIndexOfAny");
        i.e(cArr, "chars");
        if (z || !(charSequence instanceof String)) {
            int h = h(charSequence);
            if (i > h) {
                i = h;
            }
            while (i >= 0) {
                char charAt = charSequence.charAt(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= 1) {
                        z2 = false;
                        break;
                    } else if (a.o1(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(h.R3(cArr), i);
    }

    public static int q(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = h(charSequence);
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        i.e(charSequence, "$this$lastIndexOf");
        i.e(str, "string");
        if (z2 || !(charSequence instanceof String)) {
            return j(charSequence, str, i3, 0, z2, true);
        }
        return ((String) charSequence).lastIndexOf(str, i3);
    }

    public static final List<String> r(CharSequence charSequence) {
        i.e(charSequence, "$this$lines");
        i.e(charSequence, "$this$lineSequence");
        String[] strArr = {HTTP.CRLF, "\n", "\r"};
        i.e(charSequence, "$this$splitToSequence");
        i.e(strArr, "delimiters");
        return SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.g(u(charSequence, strArr, 0, false, 0, 2), new StringsKt__StringsKt$splitToSequence$1(charSequence)));
    }

    public static final Void s(String str) {
        i.e(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static final String t(String str, int i, char c) {
        CharSequence charSequence;
        i.e(str, "$this$padStart");
        i.e(str, "$this$padStart");
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append(c);
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append(str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(i0.d.a.a.a.g0("Desired length ", i, " is less than zero."));
    }

    public static m0.s.h u(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3) {
        boolean z2 = false;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if (i2 >= 0) {
            z2 = true;
        }
        if (z2) {
            return new b(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$4(g.d(strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static final boolean v(String str, int i, String str2, int i2, int i3, boolean z) {
        i.e(str, "$this$regionMatches");
        i.e(str2, RecaptchaActionType.OTHER);
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean w(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        i.e(charSequence, "$this$regionMatchesImpl");
        i.e(charSequence2, RecaptchaActionType.OTHER);
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.o1(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String x(String str, CharSequence charSequence) {
        i.e(str, "$this$removePrefix");
        i.e(charSequence, "prefix");
        if (!H(str, charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String y(String str, CharSequence charSequence) {
        i.e(str, "$this$removeSuffix");
        i.e(charSequence, "suffix");
        i.e(str, "$this$endsWith");
        i.e(charSequence, "suffix");
        if (!e(str, (String) charSequence, false, 2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String z(CharSequence charSequence, int i) {
        i.e(charSequence, "$this$repeat");
        int i2 = 1;
        if (i >= 0) {
            if (i != 0) {
                if (i == 1) {
                    return charSequence.toString();
                }
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i);
                        if (1 <= i) {
                            while (true) {
                                sb.append(charSequence);
                                if (i2 == i) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        String sb2 = sb.toString();
                        i.d(sb2, "sb.toString()");
                        return sb2;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i3 = 0; i3 < i; i3++) {
                        cArr[i3] = charAt;
                    }
                    return new String(cArr);
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }
}
