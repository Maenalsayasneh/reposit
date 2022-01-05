package q0;

import androidx.recyclerview.widget.RecyclerView;
import i0.d.a.a.a;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import q0.h0.c;
import q0.h0.h.c;

/* compiled from: Cookie.kt */
public final class n {
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public static final n e = null;
    public final String f;
    public final String g;
    public final long h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public n(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, f fVar) {
        this.f = str;
        this.g = str2;
        this.h = j2;
        this.i = str3;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
    }

    public static final int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            boolean z2 = true;
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && (('0' > charAt || '9' < charAt) && (('a' > charAt || 'z' < charAt) && (('A' > charAt || 'Z' < charAt) && charAt != ':')))) {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0162, code lost:
        if (q0.h0.c.f.a(r1) == false) goto L_0x0164;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final q0.n b(long r20, q0.w r22, java.lang.String r23) {
        /*
            r0 = r22
            r1 = r23
            java.lang.String r2 = "url"
            m0.n.b.i.e(r0, r2)
            java.lang.String r2 = "setCookie"
            m0.n.b.i.e(r1, r2)
            byte[] r2 = q0.h0.c.a
            int r2 = r23.length()
            r3 = 59
            r4 = 0
            int r2 = q0.h0.c.f(r1, r3, r4, r2)
            r5 = 61
            int r6 = q0.h0.c.f(r1, r5, r4, r2)
            r7 = 0
            if (r6 != r2) goto L_0x0025
            return r7
        L_0x0025:
            java.lang.String r9 = q0.h0.c.z(r1, r4, r6)
            int r8 = r9.length()
            r10 = 1
            if (r8 != 0) goto L_0x0032
            r8 = r10
            goto L_0x0033
        L_0x0032:
            r8 = r4
        L_0x0033:
            if (r8 != 0) goto L_0x01bd
            int r8 = q0.h0.c.m(r9)
            r11 = -1
            if (r8 == r11) goto L_0x003e
            goto L_0x01bd
        L_0x003e:
            int r6 = r6 + r10
            java.lang.String r6 = q0.h0.c.z(r1, r6, r2)
            int r8 = q0.h0.c.m(r6)
            if (r8 == r11) goto L_0x004a
            return r7
        L_0x004a:
            int r2 = r2 + r10
            int r8 = r23.length()
            r11 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r13 = -1
            r16 = r4
            r17 = r16
            r18 = r17
            r19 = r10
            r14 = r13
            r12 = r11
            r11 = r7
        L_0x0061:
            if (r2 >= r8) goto L_0x00f8
            int r3 = q0.h0.c.f(r1, r3, r2, r8)
            int r5 = q0.h0.c.f(r1, r5, r2, r3)
            java.lang.String r2 = q0.h0.c.z(r1, r2, r5)
            if (r5 >= r3) goto L_0x0078
            int r5 = r5 + 1
            java.lang.String r5 = q0.h0.c.z(r1, r5, r3)
            goto L_0x007a
        L_0x0078:
            java.lang.String r5 = ""
        L_0x007a:
            java.lang.String r4 = "expires"
            boolean r4 = kotlin.text.StringsKt__IndentKt.f(r2, r4, r10)
            if (r4 == 0) goto L_0x008c
            int r2 = r5.length()     // Catch:{ IllegalArgumentException -> 0x00ef }
            r4 = 0
            long r12 = c(r5, r4, r2)     // Catch:{ IllegalArgumentException -> 0x00ef }
            goto L_0x0098
        L_0x008c:
            java.lang.String r4 = "max-age"
            boolean r4 = kotlin.text.StringsKt__IndentKt.f(r2, r4, r10)
            if (r4 == 0) goto L_0x009b
            long r14 = d(r5)     // Catch:{  }
        L_0x0098:
            r18 = r10
            goto L_0x00ef
        L_0x009b:
            java.lang.String r4 = "domain"
            boolean r4 = kotlin.text.StringsKt__IndentKt.f(r2, r4, r10)
            if (r4 == 0) goto L_0x00cf
            java.lang.String r2 = "."
            r4 = 0
            r10 = 2
            boolean r10 = kotlin.text.StringsKt__IndentKt.e(r5, r2, r4, r10)     // Catch:{ IllegalArgumentException -> 0x00ef }
            r4 = 1
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x00c3
            java.lang.String r2 = kotlin.text.StringsKt__IndentKt.x(r5, r2)     // Catch:{ IllegalArgumentException -> 0x00ef }
            java.lang.String r2 = m0.r.t.a.r.m.a1.a.Y3(r2)     // Catch:{ IllegalArgumentException -> 0x00ef }
            if (r2 == 0) goto L_0x00bd
            r7 = r2
            r19 = 0
            goto L_0x00ef
        L_0x00bd:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00ef }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x00ef }
            throw r2     // Catch:{ IllegalArgumentException -> 0x00ef }
        L_0x00c3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00ef }
            java.lang.String r4 = "Failed requirement."
            java.lang.String r4 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x00ef }
            r2.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x00ef }
            throw r2     // Catch:{ IllegalArgumentException -> 0x00ef }
        L_0x00cf:
            java.lang.String r4 = "path"
            r10 = 1
            boolean r4 = kotlin.text.StringsKt__IndentKt.f(r2, r4, r10)
            if (r4 == 0) goto L_0x00da
            r11 = r5
            goto L_0x00ef
        L_0x00da:
            java.lang.String r4 = "secure"
            boolean r4 = kotlin.text.StringsKt__IndentKt.f(r2, r4, r10)
            if (r4 == 0) goto L_0x00e5
            r16 = r10
            goto L_0x00ef
        L_0x00e5:
            java.lang.String r4 = "httponly"
            boolean r2 = kotlin.text.StringsKt__IndentKt.f(r2, r4, r10)
            if (r2 == 0) goto L_0x00ef
            r17 = 1
        L_0x00ef:
            int r2 = r3 + 1
            r3 = 59
            r5 = 61
            r10 = 1
            goto L_0x0061
        L_0x00f8:
            r1 = -9223372036854775808
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00ff
            goto L_0x0128
        L_0x00ff:
            r1 = -1
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x012b
            r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0113
            r1 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r1
            long r14 = r14 * r1
            goto L_0x0118
        L_0x0113:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0118:
            long r1 = r20 + r14
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r3 < 0) goto L_0x012a
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r12 = r1
            goto L_0x012b
        L_0x012a:
            r12 = r4
        L_0x012b:
            java.lang.String r1 = r0.g
            if (r7 != 0) goto L_0x0132
            r2 = 0
            r7 = r1
            goto L_0x016b
        L_0x0132:
            boolean r2 = m0.n.b.i.a(r1, r7)
            if (r2 == 0) goto L_0x013a
            r3 = 1
            goto L_0x0164
        L_0x013a:
            r2 = 0
            r3 = 2
            boolean r4 = kotlin.text.StringsKt__IndentKt.e(r1, r7, r2, r3)
            if (r4 == 0) goto L_0x0166
            int r2 = r1.length()
            int r3 = r7.length()
            int r2 = r2 - r3
            r3 = 1
            int r2 = r2 - r3
            char r2 = r1.charAt(r2)
            r4 = 46
            if (r2 != r4) goto L_0x0166
            byte[] r2 = q0.h0.c.a
            java.lang.String r2 = "$this$canParseAsIpAddress"
            m0.n.b.i.e(r1, r2)
            kotlin.text.Regex r2 = q0.h0.c.f
            boolean r2 = r2.a(r1)
            if (r2 != 0) goto L_0x0166
        L_0x0164:
            r10 = r3
            goto L_0x0167
        L_0x0166:
            r10 = 0
        L_0x0167:
            r2 = 0
            if (r10 != 0) goto L_0x016b
            return r2
        L_0x016b:
            int r1 = r1.length()
            int r3 = r7.length()
            if (r1 == r3) goto L_0x0180
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.d
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.c
            java.lang.String r1 = r1.a(r7)
            if (r1 != 0) goto L_0x0180
            return r2
        L_0x0180:
            java.lang.String r1 = "/"
            r2 = 0
            if (r11 == 0) goto L_0x018f
            r3 = 2
            boolean r3 = kotlin.text.StringsKt__IndentKt.J(r11, r1, r2, r3)
            if (r3 != 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r14 = r11
            goto L_0x01a8
        L_0x018f:
            java.lang.String r0 = r22.b()
            r3 = 47
            r4 = 6
            int r3 = kotlin.text.StringsKt__IndentKt.p(r0, r3, r2, r2, r4)
            if (r3 == 0) goto L_0x01a7
            java.lang.String r0 = r0.substring(r2, r3)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            m0.n.b.i.d(r0, r1)
            r14 = r0
            goto L_0x01a8
        L_0x01a7:
            r14 = r1
        L_0x01a8:
            q0.n r0 = new q0.n
            r1 = 0
            r8 = r0
            r10 = r6
            r11 = r12
            r13 = r7
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r1
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x01bd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.n.b(long, q0.w, java.lang.String):q0.n");
    }

    public static final long c(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = d.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(d).matches()) {
                String group = matcher.group(1);
                i.d(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                i.d(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                i.d(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 != -1 || !matcher.usePattern(c).matches()) {
                if (i7 == -1) {
                    Pattern pattern = b;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        i.d(group4, "matcher.group(1)");
                        Locale locale = Locale.US;
                        i.d(locale, "Locale.US");
                        String lowerCase = group4.toLowerCase(locale);
                        i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        i.d(pattern2, "MONTH_PATTERN.pattern()");
                        i7 = StringsKt__IndentKt.m(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(a).matches()) {
                    String group5 = matcher.group(1);
                    i.d(group5, "matcher.group(1)");
                    i4 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                i.d(group6, "matcher.group(1)");
                i6 = Integer.parseInt(group6);
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (70 <= i4 && 99 >= i4) {
            i4 += 1900;
        }
        if (i4 >= 0 && 69 >= i4) {
            i4 += RecyclerView.MAX_SCROLL_DURATION;
        }
        if (i4 >= 1601) {
            if (i7 != -1) {
                if (1 <= i6 && 31 >= i6) {
                    if (i5 >= 0 && 23 >= i5) {
                        if (i8 >= 0 && 59 >= i8) {
                            if (i9 >= 0 && 59 >= i9) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(c.e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i4);
                                gregorianCalendar.set(2, i7 - 1);
                                gregorianCalendar.set(5, i6);
                                gregorianCalendar.set(11, i5);
                                gregorianCalendar.set(12, i8);
                                gregorianCalendar.set(13, i9);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final long d(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            i.e("-?\\d+", "pattern");
            Pattern compile = Pattern.compile("-?\\d+");
            i.d(compile, "Pattern.compile(pattern)");
            i.e(compile, "nativePattern");
            i.e(str, "input");
            if (!compile.matcher(str).matches()) {
                throw e2;
            } else if (StringsKt__IndentKt.J(str, "-", false, 2)) {
                return Long.MIN_VALUE;
            } else {
                return RecyclerView.FOREVER_NS;
            }
        }
    }

    public final String e(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('=');
        sb.append(this.g);
        if (this.m) {
            if (this.h == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date date = new Date(this.h);
                c.a aVar = q0.h0.h.c.a;
                i.e(date, "$this$toHttpDateString");
                String format = ((DateFormat) q0.h0.h.c.a.get()).format(date);
                i.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.n) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.i);
        }
        sb.append("; path=");
        sb.append(this.j);
        if (this.k) {
            sb.append("; secure");
        }
        if (this.l) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString()");
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return i.a(nVar.f, this.f) && i.a(nVar.g, this.g) && nVar.h == this.h && i.a(nVar.i, this.i) && i.a(nVar.j, this.j) && nVar.k == this.k && nVar.l == this.l && nVar.m == this.m && nVar.n == this.n;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int F = a.F(this.g, a.F(this.f, 527, 31), 31);
        int F2 = a.F(this.j, a.F(this.i, (Long.hashCode(this.h) + F) * 31, 31), 31);
        int hashCode = Boolean.hashCode(this.l);
        int hashCode2 = Boolean.hashCode(this.m);
        return Boolean.hashCode(this.n) + ((hashCode2 + ((hashCode + ((Boolean.hashCode(this.k) + F2) * 31)) * 31)) * 31);
    }

    public String toString() {
        return e(false);
    }
}
