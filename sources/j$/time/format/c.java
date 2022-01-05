package j$.time.format;

import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.State;
import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import j$.time.ZoneId;
import j$.time.format.h;
import j$.time.temporal.u;
import j$.time.temporal.v;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class c {
    private static final Map a;
    public static final /* synthetic */ int b = 0;
    private c c;
    private final c d;
    private final List e;
    private final boolean f;
    private int g;
    private char h;
    private int i;

    class a extends h {
        final /* synthetic */ h.b d;

        a(c cVar, h.b bVar) {
            this.d = bVar;
        }

        public String d(j$.time.temporal.p pVar, long j, m mVar, Locale locale) {
            return this.d.a(j, mVar);
        }

        public Iterator e(j$.time.temporal.p pVar, m mVar, Locale locale) {
            return this.d.b(mVar);
        }
    }

    static final class b implements d {
        private final char a;

        b(char c) {
            this.a = c;
        }

        public boolean k(g gVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            return (charAt == this.a || (!dVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.a) || Character.toLowerCase(charAt) == Character.toLowerCase(this.a)))) ? i + 1 : ~i;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            StringBuilder b = j$.com.android.tools.r8.a.b("'");
            b.append(this.a);
            b.append("'");
            return b.toString();
        }
    }

    /* renamed from: j$.time.format.c$c  reason: collision with other inner class name */
    static final class C0310c implements d {
        private final d[] a;
        private final boolean b;

        C0310c(List list, boolean z) {
            this.a = (d[]) list.toArray(new d[list.size()]);
            this.b = z;
        }

        C0310c(d[] dVarArr, boolean z) {
            this.a = dVarArr;
            this.b = z;
        }

        public C0310c a(boolean z) {
            return z == this.b ? this : new C0310c(this.a, z);
        }

        public boolean k(g gVar, StringBuilder sb) {
            int length = sb.length();
            if (this.b) {
                gVar.g();
            }
            try {
                for (d k : this.a) {
                    if (!k.k(gVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.b) {
                    gVar.a();
                }
                return true;
            } finally {
                if (this.b) {
                    gVar.a();
                }
            }
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            if (this.b) {
                dVar.r();
                int i2 = i;
                for (d o : this.a) {
                    i2 = o.o(dVar, charSequence, i2);
                    if (i2 < 0) {
                        dVar.f(false);
                        return i;
                    }
                }
                dVar.f(true);
                return i2;
            }
            for (d o2 : this.a) {
                i = o2.o(dVar, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(this.b ? "[" : "(");
                for (d append : this.a) {
                    sb.append(append);
                }
                sb.append(this.b ? "]" : ")");
            }
            return sb.toString();
        }
    }

    interface d {
        boolean k(g gVar, StringBuilder sb);

        int o(d dVar, CharSequence charSequence, int i);
    }

    static final class e implements d {
        private final j$.time.temporal.p a;
        private final int b;
        private final int c;
        private final boolean d;

        e(j$.time.temporal.p pVar, int i, int i2, boolean z) {
            Objects.requireNonNull(pVar, "field");
            if (!pVar.B().f()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + pVar);
            } else if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            } else if (i2 >= i) {
                this.a = pVar;
                this.b = i;
                this.c = i2;
                this.d = z;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
            }
        }

        public boolean k(g gVar, StringBuilder sb) {
            Long e = gVar.e(this.a);
            if (e == null) {
                return false;
            }
            i b2 = gVar.b();
            long longValue = e.longValue();
            u B = this.a.B();
            B.b(longValue, this.a);
            BigDecimal valueOf = BigDecimal.valueOf(B.e());
            BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(B.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
            if (stripTrailingZeros.scale() != 0) {
                String a2 = b2.a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.b), this.c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.d) {
                    sb.append(b2.c());
                }
                sb.append(a2);
                return true;
            } else if (this.b <= 0) {
                return true;
            } else {
                if (this.d) {
                    sb.append(b2.c());
                }
                for (int i = 0; i < this.b; i++) {
                    sb.append(b2.f());
                }
                return true;
            }
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            int i2;
            int i3 = dVar.l() ? this.b : 0;
            int i4 = dVar.l() ? this.c : 9;
            int length = charSequence.length();
            if (i == length) {
                return i3 > 0 ? ~i : i;
            }
            if (this.d) {
                if (charSequence.charAt(i) != dVar.g().c()) {
                    return i3 > 0 ? ~i : i;
                }
                i++;
            }
            int i5 = i;
            int i6 = i3 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int min = Math.min(i4 + i5, length);
            int i7 = 0;
            int i8 = i5;
            while (true) {
                if (i8 >= min) {
                    i2 = i8;
                    break;
                }
                int i9 = i8 + 1;
                int b2 = dVar.g().b(charSequence.charAt(i8));
                if (b2 >= 0) {
                    i7 = (i7 * 10) + b2;
                    i8 = i9;
                } else if (i9 < i6) {
                    return ~i5;
                } else {
                    i2 = i9 - 1;
                }
            }
            BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(i2 - i5);
            u B = this.a.B();
            BigDecimal valueOf = BigDecimal.valueOf(B.e());
            return dVar.o(this.a, movePointLeft.multiply(BigDecimal.valueOf(B.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i5, i2);
        }

        public String toString() {
            String str = this.d ? ",DecimalPoint" : "";
            StringBuilder b2 = j$.com.android.tools.r8.a.b("Fraction(");
            b2.append(this.a);
            b2.append(InstabugDbContract.COMMA_SEP);
            b2.append(this.b);
            b2.append(InstabugDbContract.COMMA_SEP);
            b2.append(this.c);
            b2.append(str);
            b2.append(")");
            return b2.toString();
        }
    }

    static final class f implements d {
        f(int i) {
        }

        public boolean k(g gVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            Long e = gVar.e(j$.time.temporal.j.INSTANT_SECONDS);
            j$.time.temporal.l d = gVar.d();
            j$.time.temporal.j jVar = j$.time.temporal.j.NANO_OF_SECOND;
            Long valueOf = d.f(jVar) ? Long.valueOf(gVar.d().g(jVar)) : null;
            int i = 0;
            if (e == null) {
                return false;
            }
            long longValue = e.longValue();
            int Y = jVar.Y(valueOf != null ? valueOf.longValue() : 0);
            if (longValue >= -62167219200L) {
                long j = (longValue - 315569520000L) + 62167219200L;
                long floorDiv = Math.floorDiv(j, 315569520000L) + 1;
                j$.time.f e0 = j$.time.f.e0(Math.floorMod(j, 315569520000L) - 62167219200L, 0, j$.time.k.d);
                if (floorDiv > 0) {
                    sb2.append('+');
                    sb2.append(floorDiv);
                }
                sb2.append(e0);
                if (e0.V() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                j$.time.f e02 = j$.time.f.e0(j4 - 62167219200L, 0, j$.time.k.d);
                int length = sb.length();
                sb2.append(e02);
                if (e02.V() == 0) {
                    sb2.append(":00");
                }
                if (j3 < 0) {
                    if (e02.Y() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb2.insert(length, j3);
                    } else {
                        sb2.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            if (Y > 0) {
                sb2.append('.');
                int i2 = 100000000;
                while (true) {
                    if (Y <= 0 && i % 3 == 0 && i >= -2) {
                        break;
                    }
                    int i3 = Y / i2;
                    sb2.append((char) (i3 + 48));
                    Y -= i3 * i2;
                    i2 /= 10;
                    i++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4 = i;
            c cVar = new c();
            cVar.a(DateTimeFormatter.a);
            cVar.e('T');
            j$.time.temporal.j jVar = j$.time.temporal.j.HOUR_OF_DAY;
            cVar.p(jVar, 2);
            cVar.e(':');
            j$.time.temporal.j jVar2 = j$.time.temporal.j.MINUTE_OF_HOUR;
            cVar.p(jVar2, 2);
            cVar.e(':');
            j$.time.temporal.j jVar3 = j$.time.temporal.j.SECOND_OF_MINUTE;
            cVar.p(jVar3, 2);
            j$.time.temporal.j jVar4 = j$.time.temporal.j.NANO_OF_SECOND;
            int i5 = 0;
            cVar.b(jVar4, 0, 9, true);
            cVar.e('Z');
            C0310c h = cVar.x().h(false);
            d d = dVar.d();
            int o = h.o(d, charSequence, i4);
            if (o < 0) {
                return o;
            }
            long longValue = d.j(j$.time.temporal.j.YEAR).longValue();
            int intValue = d.j(j$.time.temporal.j.MONTH_OF_YEAR).intValue();
            int intValue2 = d.j(j$.time.temporal.j.DAY_OF_MONTH).intValue();
            int intValue3 = d.j(jVar).intValue();
            int intValue4 = d.j(jVar2).intValue();
            Long j = d.j(jVar3);
            Long j2 = d.j(jVar4);
            int intValue5 = j != null ? j.intValue() : 0;
            int intValue6 = j2 != null ? j2.intValue() : 0;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i3 = 0;
                i2 = intValue5;
                i5 = 1;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                dVar.p();
                i3 = intValue3;
                i2 = 59;
            } else {
                i3 = intValue3;
                i2 = intValue5;
            }
            try {
                d dVar2 = dVar;
                int i6 = i;
                return dVar2.o(jVar4, (long) intValue6, i6, dVar2.o(j$.time.temporal.j.INSTANT_SECONDS, Math.multiplyExact(longValue / 10000, 315569520000L) + j$.time.f.c0(((int) longValue) % InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT, intValue, intValue2, i3, intValue4, i2, 0).g0((long) i5).X(j$.time.k.d), i6, o));
            } catch (RuntimeException unused) {
                return ~i4;
            }
        }

        public String toString() {
            return "Instant()";
        }
    }

    static final class g implements d {
        private final m a;

        g(m mVar) {
            this.a = mVar;
        }

        private static StringBuilder a(StringBuilder sb, int i) {
            sb.append((char) ((i / 10) + 48));
            sb.append((char) ((i % 10) + 48));
            return sb;
        }

        /* access modifiers changed from: package-private */
        public int b(CharSequence charSequence, int i) {
            char charAt = charSequence.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return -1;
            }
            return charAt - '0';
        }

        public boolean k(g gVar, StringBuilder sb) {
            Long e = gVar.e(j$.time.temporal.j.OFFSET_SECONDS);
            if (e == null) {
                return false;
            }
            sb.append("GMT");
            int intExact = Math.toIntExact(e.longValue());
            if (intExact == 0) {
                return true;
            }
            int abs = Math.abs((intExact / 3600) % 100);
            int abs2 = Math.abs((intExact / 60) % 60);
            int abs3 = Math.abs(intExact % 60);
            sb.append(intExact < 0 ? "-" : "+");
            if (this.a == m.FULL) {
                a(sb, abs);
                sb.append(':');
                a(sb, abs2);
                if (abs3 == 0) {
                    return true;
                }
            } else {
                if (abs >= 10) {
                    sb.append((char) ((abs / 10) + 48));
                }
                sb.append((char) ((abs % 10) + 48));
                if (abs2 == 0 && abs3 == 0) {
                    return true;
                }
                sb.append(':');
                a(sb, abs2);
                if (abs3 == 0) {
                    return true;
                }
            }
            sb.append(':');
            a(sb, abs3);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
            if (r13 >= 0) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e0, code lost:
            if (r13 >= 0) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int o(j$.time.format.d r12, java.lang.CharSequence r13, int r14) {
            /*
                r11 = this;
                int r0 = r13.length()
                int r0 = r0 + r14
                java.lang.String r4 = "GMT"
                r5 = 0
                r6 = 3
                r1 = r12
                r2 = r13
                r3 = r14
                boolean r1 = r1.s(r2, r3, r4, r5, r6)
                if (r1 != 0) goto L_0x0014
                int r12 = ~r14
                return r12
            L_0x0014:
                int r5 = r14 + 3
                if (r5 != r0) goto L_0x0023
                j$.time.temporal.j r1 = j$.time.temporal.j.OFFSET_SECONDS
                r2 = 0
                r0 = r12
                r4 = r14
                int r12 = r0.o(r1, r2, r4, r5)
                return r12
            L_0x0023:
                char r1 = r13.charAt(r5)
                r2 = 43
                r3 = 1
                if (r1 != r2) goto L_0x002e
                r1 = r3
                goto L_0x0033
            L_0x002e:
                r2 = 45
                if (r1 != r2) goto L_0x0102
                r1 = -1
            L_0x0033:
                int r5 = r5 + r3
                j$.time.format.m r2 = r11.a
                j$.time.format.m r3 = j$.time.format.m.FULL
                r4 = 0
                r6 = 58
                if (r2 != r3) goto L_0x008e
                int r2 = r5 + 1
                int r3 = r11.b(r13, r5)
                int r5 = r2 + 1
                int r2 = r11.b(r13, r2)
                if (r3 < 0) goto L_0x008c
                if (r2 < 0) goto L_0x008c
                int r7 = r5 + 1
                char r5 = r13.charAt(r5)
                if (r5 == r6) goto L_0x0056
                goto L_0x008c
            L_0x0056:
                int r3 = r3 * 10
                int r3 = r3 + r2
                int r2 = r7 + 1
                int r5 = r11.b(r13, r7)
                int r7 = r2 + 1
                int r2 = r11.b(r13, r2)
                if (r5 < 0) goto L_0x008a
                if (r2 >= 0) goto L_0x006a
                goto L_0x008a
            L_0x006a:
                int r5 = r5 * 10
                int r5 = r5 + r2
                int r2 = r7 + 2
                if (r2 >= r0) goto L_0x0087
                char r0 = r13.charAt(r7)
                if (r0 != r6) goto L_0x0087
                int r0 = r7 + 1
                int r0 = r11.b(r13, r0)
                int r13 = r11.b(r13, r2)
                if (r0 < 0) goto L_0x0087
                if (r13 < 0) goto L_0x0087
            L_0x0085:
                r4 = r5
                goto L_0x00e3
            L_0x0087:
                r13 = r4
                r4 = r5
                goto L_0x00ea
            L_0x008a:
                int r12 = ~r14
                return r12
            L_0x008c:
                int r12 = ~r14
                return r12
            L_0x008e:
                int r7 = r5 + 1
                int r3 = r11.b(r13, r5)
                if (r3 >= 0) goto L_0x0098
                int r12 = ~r14
                return r12
            L_0x0098:
                if (r7 >= r0) goto L_0x00e9
                int r2 = r11.b(r13, r7)
                if (r2 < 0) goto L_0x00a5
                int r3 = r3 * 10
                int r3 = r3 + r2
                int r7 = r7 + 1
            L_0x00a5:
                int r2 = r7 + 2
                if (r2 >= r0) goto L_0x00e9
                char r5 = r13.charAt(r7)
                if (r5 != r6) goto L_0x00e9
                if (r2 >= r0) goto L_0x00e9
                char r5 = r13.charAt(r7)
                if (r5 != r6) goto L_0x00e9
                int r5 = r7 + 1
                int r5 = r11.b(r13, r5)
                int r2 = r11.b(r13, r2)
                if (r5 < 0) goto L_0x00e9
                if (r2 < 0) goto L_0x00e9
                int r5 = r5 * 10
                int r5 = r5 + r2
                int r7 = r7 + 3
                int r2 = r7 + 2
                if (r2 >= r0) goto L_0x0087
                char r0 = r13.charAt(r7)
                if (r0 != r6) goto L_0x0087
                int r0 = r7 + 1
                int r0 = r11.b(r13, r0)
                int r13 = r11.b(r13, r2)
                if (r0 < 0) goto L_0x0087
                if (r13 < 0) goto L_0x0087
                goto L_0x0085
            L_0x00e3:
                int r0 = r0 * 10
                int r13 = r13 + r0
                int r7 = r7 + 3
                goto L_0x00ea
            L_0x00e9:
                r13 = r4
            L_0x00ea:
                r10 = r7
                long r0 = (long) r1
                long r2 = (long) r3
                r5 = 3600(0xe10, double:1.7786E-320)
                long r2 = r2 * r5
                long r4 = (long) r4
                r6 = 60
                long r4 = r4 * r6
                long r4 = r4 + r2
                long r2 = (long) r13
                long r4 = r4 + r2
                long r7 = r4 * r0
                j$.time.temporal.j r6 = j$.time.temporal.j.OFFSET_SECONDS
                r5 = r12
                r9 = r14
                int r12 = r5.o(r6, r7, r9, r10)
                return r12
            L_0x0102:
                j$.time.temporal.j r1 = j$.time.temporal.j.OFFSET_SECONDS
                r2 = 0
                r0 = r12
                r4 = r14
                int r12 = r0.o(r1, r2, r4, r5)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.c.g.o(j$.time.format.d, java.lang.CharSequence, int):int");
        }

        public String toString() {
            StringBuilder b = j$.com.android.tools.r8.a.b("LocalizedOffset(");
            b.append(this.a);
            b.append(")");
            return b.toString();
        }
    }

    static final class h implements d {
        private static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);
        private final FormatStyle b;
        private final FormatStyle c;

        h(FormatStyle formatStyle, FormatStyle formatStyle2) {
            this.b = formatStyle;
            this.c = formatStyle2;
        }

        private DateTimeFormatter a(Locale locale, j$.time.chrono.h hVar) {
            String str = hVar.t() + '|' + locale.toString() + '|' + this.b + this.c;
            ConcurrentMap concurrentMap = a;
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentMap.get(str);
            if (dateTimeFormatter == null) {
                FormatStyle formatStyle = this.b;
                FormatStyle formatStyle2 = this.c;
                if (formatStyle == null && formatStyle2 == null) {
                    throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
                }
                DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
                if (dateInstance instanceof SimpleDateFormat) {
                    String pattern = ((SimpleDateFormat) dateInstance).toPattern();
                    if (pattern == null) {
                        pattern = null;
                    } else {
                        int i = 0;
                        boolean z = true;
                        boolean z2 = pattern.indexOf(66) != -1;
                        if (pattern.indexOf(98) == -1) {
                            z = false;
                        }
                        if (z2 || z) {
                            StringBuilder sb = new StringBuilder(pattern.length());
                            char c2 = ' ';
                            while (i < pattern.length()) {
                                char charAt = pattern.charAt(i);
                                if (charAt == ' ' ? i == 0 || !(c2 == 'B' || c2 == 'b') : !(charAt == 'B' || charAt == 'b')) {
                                    sb.append(charAt);
                                }
                                i++;
                                c2 = charAt;
                            }
                            int length = sb.length() - 1;
                            if (length >= 0 && sb.charAt(length) == ' ') {
                                sb.deleteCharAt(length);
                            }
                            pattern = sb.toString();
                        }
                    }
                    c cVar = new c();
                    cVar.k(pattern);
                    dateTimeFormatter = cVar.z(locale);
                    DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentMap.putIfAbsent(str, dateTimeFormatter);
                    if (dateTimeFormatter2 != null) {
                        return dateTimeFormatter2;
                    }
                } else {
                    throw new UnsupportedOperationException("Can't determine pattern from " + dateInstance);
                }
            }
            return dateTimeFormatter;
        }

        public boolean k(g gVar, StringBuilder sb) {
            return a(gVar.c(), j$.time.chrono.h.E(gVar.d())).h(false).k(gVar, sb);
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            return a(dVar.i(), dVar.h()).h(false).o(dVar, charSequence, i);
        }

        public String toString() {
            StringBuilder b2 = j$.com.android.tools.r8.a.b("Localized(");
            Object obj = this.b;
            Object obj2 = "";
            if (obj == null) {
                obj = obj2;
            }
            b2.append(obj);
            b2.append(InstabugDbContract.COMMA_SEP);
            Object obj3 = this.c;
            if (obj3 != null) {
                obj2 = obj3;
            }
            b2.append(obj2);
            b2.append(")");
            return b2.toString();
        }
    }

    static class i implements d {
        static final long[] a = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
        final j$.time.temporal.p b;
        final int c;
        final int d;
        /* access modifiers changed from: private */
        public final l e;
        final int f;

        i(j$.time.temporal.p pVar, int i, int i2, l lVar) {
            this.b = pVar;
            this.c = i;
            this.d = i2;
            this.e = lVar;
            this.f = 0;
        }

        protected i(j$.time.temporal.p pVar, int i, int i2, l lVar, int i3) {
            this.b = pVar;
            this.c = i;
            this.d = i2;
            this.e = lVar;
            this.f = i3;
        }

        /* access modifiers changed from: package-private */
        public long b(g gVar, long j) {
            return j;
        }

        /* access modifiers changed from: package-private */
        public boolean c(d dVar) {
            int i = this.f;
            return i == -1 || (i > 0 && this.c == this.d && this.e == l.NOT_NEGATIVE);
        }

        /* access modifiers changed from: package-private */
        public int d(d dVar, long j, int i, int i2) {
            return dVar.o(this.b, j, i, i2);
        }

        /* access modifiers changed from: package-private */
        public i e() {
            return this.f == -1 ? this : new i(this.b, this.c, this.d, this.e, -1);
        }

        /* access modifiers changed from: package-private */
        public i f(int i) {
            return new i(this.b, this.c, this.d, this.e, this.f + i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
            if (r4 != 4) goto L_0x0092;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[LOOP:0: B:29:0x0092->B:31:0x009b, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean k(j$.time.format.g r11, java.lang.StringBuilder r12) {
            /*
                r10 = this;
                j$.time.temporal.p r0 = r10.b
                java.lang.Long r0 = r11.e(r0)
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                long r2 = r0.longValue()
                long r2 = r10.b(r11, r2)
                j$.time.format.i r11 = r11.b()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x001f
                java.lang.String r0 = "9223372036854775808"
                goto L_0x0027
            L_0x001f:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L_0x0027:
                int r4 = r0.length()
                int r5 = r10.d
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto L_0x00a9
                java.lang.String r0 = r11.a(r0)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 4
                r8 = 1
                if (r4 < 0) goto L_0x005d
                j$.time.format.l r4 = r10.e
                int r4 = r4.ordinal()
                if (r4 == r8) goto L_0x0058
                if (r4 == r5) goto L_0x004a
                goto L_0x0092
            L_0x004a:
                int r4 = r10.c
                r5 = 19
                if (r4 >= r5) goto L_0x0092
                long[] r5 = a
                r4 = r5[r4]
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0092
            L_0x0058:
                char r2 = r11.e()
                goto L_0x008f
            L_0x005d:
                j$.time.format.l r4 = r10.e
                int r4 = r4.ordinal()
                if (r4 == 0) goto L_0x008b
                if (r4 == r8) goto L_0x008b
                r9 = 3
                if (r4 == r9) goto L_0x006d
                if (r4 == r5) goto L_0x008b
                goto L_0x0092
            L_0x006d:
                j$.time.c r11 = new j$.time.c
                java.lang.StringBuilder r12 = j$.com.android.tools.r8.a.b(r7)
                j$.time.temporal.p r0 = r10.b
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L_0x008b:
                char r2 = r11.d()
            L_0x008f:
                r12.append(r2)
            L_0x0092:
                int r2 = r10.c
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto L_0x00a5
                char r2 = r11.f()
                r12.append(r2)
                int r1 = r1 + 1
                goto L_0x0092
            L_0x00a5:
                r12.append(r0)
                return r8
            L_0x00a9:
                j$.time.c r11 = new j$.time.c
                java.lang.StringBuilder r12 = j$.com.android.tools.r8.a.b(r7)
                j$.time.temporal.p r0 = r10.b
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r12.append(r0)
                int r0 = r10.d
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.c.i.k(j$.time.format.g, java.lang.StringBuilder):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
            r10 = r6.f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
            if (r10 <= 0) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
            if (r4 != 0) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x013e, code lost:
            if (r0 <= r1) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0144, code lost:
            if (r0 > r1) goto L_0x0146;
         */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x014c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int o(j$.time.format.d r18, java.lang.CharSequence r19, int r20) {
            /*
                r17 = this;
                r6 = r17
                r0 = r20
                int r1 = r19.length()
                if (r0 != r1) goto L_0x000c
                goto L_0x0147
            L_0x000c:
                char r2 = r19.charAt(r20)
                j$.time.format.i r3 = r18.g()
                char r3 = r3.e()
                r4 = 0
                r5 = 1
                if (r2 != r3) goto L_0x0039
                j$.time.format.l r2 = r6.e
                boolean r3 = r18.l()
                int r7 = r6.c
                int r8 = r6.d
                if (r7 != r8) goto L_0x002a
                r7 = r5
                goto L_0x002b
            L_0x002a:
                r7 = r4
            L_0x002b:
                boolean r2 = r2.k(r5, r3, r7)
                if (r2 != 0) goto L_0x0033
                goto L_0x0147
            L_0x0033:
                int r0 = r0 + 1
                r7 = r0
                r0 = r4
                r2 = r5
                goto L_0x0071
            L_0x0039:
                j$.time.format.i r3 = r18.g()
                char r3 = r3.d()
                if (r2 != r3) goto L_0x0060
                j$.time.format.l r2 = r6.e
                boolean r3 = r18.l()
                int r7 = r6.c
                int r8 = r6.d
                if (r7 != r8) goto L_0x0051
                r7 = r5
                goto L_0x0052
            L_0x0051:
                r7 = r4
            L_0x0052:
                boolean r2 = r2.k(r4, r3, r7)
                if (r2 != 0) goto L_0x005a
                goto L_0x0147
            L_0x005a:
                int r0 = r0 + 1
                r7 = r0
                r2 = r4
                r0 = r5
                goto L_0x0071
            L_0x0060:
                j$.time.format.l r2 = r6.e
                j$.time.format.l r3 = j$.time.format.l.ALWAYS
                if (r2 != r3) goto L_0x006e
                boolean r2 = r18.l()
                if (r2 == 0) goto L_0x006e
                goto L_0x0147
            L_0x006e:
                r7 = r0
                r0 = r4
                r2 = r0
            L_0x0071:
                boolean r3 = r18.l()
                if (r3 != 0) goto L_0x0080
                boolean r3 = r17.c(r18)
                if (r3 == 0) goto L_0x007e
                goto L_0x0080
            L_0x007e:
                r3 = r5
                goto L_0x0082
            L_0x0080:
                int r3 = r6.c
            L_0x0082:
                int r8 = r7 + r3
                if (r8 <= r1) goto L_0x0088
                goto L_0x0146
            L_0x0088:
                boolean r9 = r18.l()
                if (r9 != 0) goto L_0x0098
                boolean r9 = r17.c(r18)
                if (r9 == 0) goto L_0x0095
                goto L_0x0098
            L_0x0095:
                r9 = 9
                goto L_0x009a
            L_0x0098:
                int r9 = r6.d
            L_0x009a:
                int r10 = r6.f
                int r10 = java.lang.Math.max(r10, r4)
                int r10 = r10 + r9
            L_0x00a1:
                r9 = 0
                r11 = 2
                if (r4 >= r11) goto L_0x0100
                int r10 = r10 + r7
                int r10 = java.lang.Math.min(r10, r1)
                r11 = r7
                r14 = 0
            L_0x00ad:
                if (r11 >= r10) goto L_0x00ec
                int r16 = r11 + 1
                r5 = r19
                char r11 = r5.charAt(r11)
                j$.time.format.i r12 = r18.g()
                int r11 = r12.b(r11)
                if (r11 >= 0) goto L_0x00c7
                int r11 = r16 + -1
                if (r11 >= r8) goto L_0x00ee
                goto L_0x0146
            L_0x00c7:
                int r12 = r16 - r7
                r13 = 18
                if (r12 <= r13) goto L_0x00e3
                if (r9 != 0) goto L_0x00d3
                java.math.BigInteger r9 = java.math.BigInteger.valueOf(r14)
            L_0x00d3:
                java.math.BigInteger r12 = java.math.BigInteger.TEN
                java.math.BigInteger r9 = r9.multiply(r12)
                long r11 = (long) r11
                java.math.BigInteger r11 = java.math.BigInteger.valueOf(r11)
                java.math.BigInteger r9 = r9.add(r11)
                goto L_0x00e8
            L_0x00e3:
                r12 = 10
                long r14 = r14 * r12
                long r11 = (long) r11
                long r14 = r14 + r11
            L_0x00e8:
                r11 = r16
                r5 = 1
                goto L_0x00ad
            L_0x00ec:
                r5 = r19
            L_0x00ee:
                int r10 = r6.f
                if (r10 <= 0) goto L_0x00fe
                if (r4 != 0) goto L_0x00fe
                int r11 = r11 - r7
                int r11 = r11 - r10
                int r10 = java.lang.Math.max(r3, r11)
                int r4 = r4 + 1
                r5 = 1
                goto L_0x00a1
            L_0x00fe:
                r5 = r11
                goto L_0x0103
            L_0x0100:
                r5 = r7
                r14 = 0
            L_0x0103:
                if (r0 == 0) goto L_0x012c
                if (r9 == 0) goto L_0x011c
                java.math.BigInteger r0 = java.math.BigInteger.ZERO
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x0117
                boolean r0 = r18.l()
                if (r0 == 0) goto L_0x0117
            L_0x0115:
                r0 = 1
                goto L_0x0141
            L_0x0117:
                java.math.BigInteger r9 = r9.negate()
                goto L_0x0149
            L_0x011c:
                r0 = 0
                int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r0 != 0) goto L_0x0129
                boolean r0 = r18.l()
                if (r0 == 0) goto L_0x0129
                goto L_0x0140
            L_0x0129:
                long r0 = -r14
                r2 = r0
                goto L_0x014a
            L_0x012c:
                j$.time.format.l r0 = r6.e
                j$.time.format.l r1 = j$.time.format.l.EXCEEDS_PAD
                if (r0 != r1) goto L_0x0149
                boolean r0 = r18.l()
                if (r0 == 0) goto L_0x0149
                int r0 = r5 - r7
                int r1 = r6.c
                if (r2 == 0) goto L_0x0144
                if (r0 > r1) goto L_0x0149
            L_0x0140:
                goto L_0x0115
            L_0x0141:
                int r7 = r7 - r0
                int r0 = ~r7
                goto L_0x0169
            L_0x0144:
                if (r0 <= r1) goto L_0x0149
            L_0x0146:
                r0 = r7
            L_0x0147:
                int r0 = ~r0
                goto L_0x0169
            L_0x0149:
                r2 = r14
            L_0x014a:
                if (r9 == 0) goto L_0x0160
                int r0 = r9.bitLength()
                r1 = 63
                if (r0 <= r1) goto L_0x015c
                java.math.BigInteger r0 = java.math.BigInteger.TEN
                java.math.BigInteger r9 = r9.divide(r0)
                int r5 = r5 + -1
            L_0x015c:
                long r2 = r9.longValue()
            L_0x0160:
                r0 = r17
                r1 = r18
                r4 = r7
                int r0 = r0.d(r1, r2, r4, r5)
            L_0x0169:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.c.i.o(j$.time.format.d, java.lang.CharSequence, int):int");
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            int i = this.c;
            if (i == 1 && this.d == 19 && this.e == l.NORMAL) {
                sb = j$.com.android.tools.r8.a.b("Value(");
                obj = this.b;
            } else if (i == this.d && this.e == l.NOT_NEGATIVE) {
                sb = j$.com.android.tools.r8.a.b("Value(");
                sb.append(this.b);
                sb.append(InstabugDbContract.COMMA_SEP);
                sb.append(this.c);
                sb.append(")");
                return sb.toString();
            } else {
                sb = j$.com.android.tools.r8.a.b("Value(");
                sb.append(this.b);
                sb.append(InstabugDbContract.COMMA_SEP);
                sb.append(this.c);
                sb.append(InstabugDbContract.COMMA_SEP);
                sb.append(this.d);
                sb.append(InstabugDbContract.COMMA_SEP);
                obj = this.e;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class j implements d {
        static final String[] a = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        static final j b = new j("+HH:MM:ss", "Z");
        static final j c = new j("+HH:MM:ss", "0");
        private final String d;
        private final int e;

        j(String str, String str2) {
            Objects.requireNonNull(str, "pattern");
            Objects.requireNonNull(str2, "noOffsetText");
            int i = 0;
            while (true) {
                String[] strArr = a;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i].equals(str)) {
                    this.e = i;
                    this.d = str2;
                    return;
                } else {
                    i++;
                }
            }
        }

        private boolean a(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.e;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                    return z;
                }
                i4 = i5;
            }
            if (i4 + 2 > charSequence.length()) {
                return z;
            }
            int i6 = i4 + 1;
            char charAt = charSequence.charAt(i4);
            int i7 = i6 + 1;
            char charAt2 = charSequence.charAt(i6);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = (charAt2 - '0') + ((charAt - '0') * 10)) < 0 || i2 > 59) {
                return z;
            }
            iArr[i] = i2;
            iArr[0] = i7;
            return false;
        }

        public boolean k(g gVar, StringBuilder sb) {
            Long e2 = gVar.e(j$.time.temporal.j.OFFSET_SECONDS);
            if (e2 == null) {
                return false;
            }
            int intExact = Math.toIntExact(e2.longValue());
            if (intExact != 0) {
                int abs = Math.abs((intExact / 3600) % 100);
                int abs2 = Math.abs((intExact / 60) % 60);
                int abs3 = Math.abs(intExact % 60);
                int length = sb.length();
                sb.append(intExact < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i = this.e;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(i % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i2 = this.e;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.d);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r16.s(r17, r18, r0.d, 0, r9) != false) goto L_0x0036;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int o(j$.time.format.d r16, java.lang.CharSequence r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r7 = r17
                r8 = r18
                int r1 = r17.length()
                java.lang.String r2 = r0.d
                int r9 = r2.length()
                if (r9 != 0) goto L_0x0022
                if (r8 != r1) goto L_0x0041
                j$.time.temporal.j r2 = j$.time.temporal.j.OFFSET_SECONDS
                r3 = 0
                r1 = r16
                r5 = r18
                r6 = r18
            L_0x001d:
                int r1 = r1.o(r2, r3, r5, r6)
                return r1
            L_0x0022:
                if (r8 != r1) goto L_0x0026
                int r1 = ~r8
                return r1
            L_0x0026:
                java.lang.String r4 = r0.d
                r5 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                r6 = r9
                boolean r1 = r1.s(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x0041
            L_0x0036:
                j$.time.temporal.j r2 = j$.time.temporal.j.OFFSET_SECONDS
                int r6 = r8 + r9
                r3 = 0
                r1 = r16
                r5 = r18
                goto L_0x001d
            L_0x0041:
                char r1 = r17.charAt(r18)
                r2 = 43
                r3 = 45
                if (r1 == r2) goto L_0x004d
                if (r1 != r3) goto L_0x009a
            L_0x004d:
                r2 = 1
                if (r1 != r3) goto L_0x0052
                r1 = -1
                goto L_0x0053
            L_0x0052:
                r1 = r2
            L_0x0053:
                r3 = 4
                int[] r3 = new int[r3]
                int r4 = r8 + 1
                r5 = 0
                r3[r5] = r4
                boolean r4 = r15.a(r3, r2, r7, r2)
                r6 = 2
                r10 = 3
                if (r4 != 0) goto L_0x0079
                int r4 = r0.e
                if (r4 < r10) goto L_0x0069
                r4 = r2
                goto L_0x006a
            L_0x0069:
                r4 = r5
            L_0x006a:
                boolean r4 = r15.a(r3, r6, r7, r4)
                if (r4 != 0) goto L_0x0079
                boolean r4 = r15.a(r3, r10, r7, r5)
                if (r4 == 0) goto L_0x0077
                goto L_0x0079
            L_0x0077:
                r4 = r5
                goto L_0x007a
            L_0x0079:
                r4 = r2
            L_0x007a:
                if (r4 != 0) goto L_0x009a
                long r11 = (long) r1
                r1 = r3[r2]
                long r1 = (long) r1
                r13 = 3600(0xe10, double:1.7786E-320)
                long r1 = r1 * r13
                r4 = r3[r6]
                long r6 = (long) r4
                r13 = 60
                long r6 = r6 * r13
                long r6 = r6 + r1
                r1 = r3[r10]
                long r1 = (long) r1
                long r6 = r6 + r1
                long r6 = r6 * r11
                j$.time.temporal.j r2 = j$.time.temporal.j.OFFSET_SECONDS
                r9 = r3[r5]
                r1 = r16
                r3 = r6
                r5 = r18
                r6 = r9
                goto L_0x001d
            L_0x009a:
                if (r9 != 0) goto L_0x009d
                goto L_0x0036
            L_0x009d:
                int r1 = ~r8
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.c.j.o(j$.time.format.d, java.lang.CharSequence, int):int");
        }

        public String toString() {
            String replace = this.d.replace("'", "''");
            StringBuilder b2 = j$.com.android.tools.r8.a.b("Offset(");
            b2.append(a[this.e]);
            b2.append(",'");
            b2.append(replace);
            b2.append("')");
            return b2.toString();
        }
    }

    static final class k implements d {
        private final d a;
        private final int b;
        private final char c;

        k(d dVar, int i, char c2) {
            this.a = dVar;
            this.b = i;
            this.c = c2;
        }

        public boolean k(g gVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.a.k(gVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.b) {
                for (int i = 0; i < this.b - length2; i++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.b);
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            boolean l = dVar.l();
            if (i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i == charSequence.length()) {
                return ~i;
            } else {
                int i2 = this.b + i;
                if (i2 > charSequence.length()) {
                    if (l) {
                        return ~i;
                    }
                    i2 = charSequence.length();
                }
                int i3 = i;
                while (i3 < i2 && dVar.b(charSequence.charAt(i3), this.c)) {
                    i3++;
                }
                int o = this.a.o(dVar, charSequence.subSequence(0, i2), i3);
                return (o == i2 || !l) ? o : ~(i + i3);
            }
        }

        public String toString() {
            String str;
            StringBuilder b2 = j$.com.android.tools.r8.a.b("Pad(");
            b2.append(this.a);
            b2.append(InstabugDbContract.COMMA_SEP);
            b2.append(this.b);
            if (this.c == ' ') {
                str = ")";
            } else {
                StringBuilder b3 = j$.com.android.tools.r8.a.b(",'");
                b3.append(this.c);
                b3.append("')");
                str = b3.toString();
            }
            b2.append(str);
            return b2.toString();
        }
    }

    static class l {
        protected String a;
        protected String b;
        protected char c;
        protected l d;
        protected l e;

        private static class a extends l {
            private a(String str, String str2, l lVar) {
                super(str, str2, lVar, (a) null);
            }

            a(String str, String str2, l lVar, a aVar) {
                super(str, (String) null, (l) null, (a) null);
            }

            /* access modifiers changed from: protected */
            public boolean c(char c, char c2) {
                return d.c(c, c2);
            }

            /* access modifiers changed from: protected */
            public l e(String str, String str2, l lVar) {
                return new a(str, str2, lVar);
            }

            /* access modifiers changed from: protected */
            public boolean h(CharSequence charSequence, int i, int i2) {
                int length = this.a.length();
                if (length > i2 - i) {
                    return false;
                }
                int i3 = 0;
                while (true) {
                    int i4 = length - 1;
                    if (length <= 0) {
                        return true;
                    }
                    int i5 = i3 + 1;
                    int i6 = i + 1;
                    if (!d.c(this.a.charAt(i3), charSequence.charAt(i))) {
                        return false;
                    }
                    i = i6;
                    length = i4;
                    i3 = i5;
                }
            }
        }

        private l(String str, String str2, l lVar) {
            this.a = str;
            this.b = str2;
            this.d = lVar;
            this.c = str.length() == 0 ? 65535 : this.a.charAt(0);
        }

        /* synthetic */ l(String str, String str2, l lVar, a aVar) {
            this(str, str2, lVar);
        }

        private boolean b(String str, String str2) {
            int i = 0;
            while (i < str.length() && i < this.a.length() && c(str.charAt(i), this.a.charAt(i))) {
                i++;
            }
            if (i != this.a.length()) {
                l e2 = e(this.a.substring(i), this.b, this.d);
                this.a = str.substring(0, i);
                this.d = e2;
                if (i < str.length()) {
                    this.d.e = e(str.substring(i), str2, (l) null);
                    this.b = null;
                } else {
                    this.b = str2;
                }
                return true;
            } else if (i < str.length()) {
                String substring = str.substring(i);
                for (l lVar = this.d; lVar != null; lVar = lVar.e) {
                    if (c(lVar.c, substring.charAt(0))) {
                        return lVar.b(substring, str2);
                    }
                }
                l e3 = e(substring, str2, (l) null);
                e3.e = this.d;
                this.d = e3;
                return true;
            } else {
                this.b = str2;
                return true;
            }
        }

        public static l f(d dVar) {
            return dVar.k() ? new l("", (String) null, (l) null) : new a("", (String) null, (l) null, (a) null);
        }

        public static l g(Set set, d dVar) {
            l f = f(dVar);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                f.b(str, str);
            }
            return f;
        }

        public boolean a(String str, String str2) {
            return b(str, str2);
        }

        /* access modifiers changed from: protected */
        public boolean c(char c2, char c3) {
            return c2 == c3;
        }

        public String d(CharSequence charSequence, ParsePosition parsePosition) {
            int index = parsePosition.getIndex();
            int length = charSequence.length();
            if (!h(charSequence, index, length)) {
                return null;
            }
            int length2 = this.a.length() + index;
            l lVar = this.d;
            if (lVar != null && length2 != length) {
                while (true) {
                    if (!c(lVar.c, charSequence.charAt(length2))) {
                        lVar = lVar.e;
                        if (lVar == null) {
                            break;
                        }
                    } else {
                        parsePosition.setIndex(length2);
                        String d2 = lVar.d(charSequence, parsePosition);
                        if (d2 != null) {
                            return d2;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.b;
        }

        /* access modifiers changed from: protected */
        public l e(String str, String str2, l lVar) {
            return new l(str, str2, lVar);
        }

        /* access modifiers changed from: protected */
        public boolean h(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof String) {
                return ((String) charSequence).startsWith(this.a, i);
            }
            int length = this.a.length();
            if (length > i2 - i) {
                return false;
            }
            int i3 = 0;
            while (true) {
                int i4 = length - 1;
                if (length <= 0) {
                    return true;
                }
                int i5 = i3 + 1;
                int i6 = i + 1;
                if (!c(this.a.charAt(i3), charSequence.charAt(i))) {
                    return false;
                }
                i = i6;
                length = i4;
                i3 = i5;
            }
        }
    }

    static final class m extends i {
        static final j$.time.e g = j$.time.e.c0(RecyclerView.MAX_SCROLL_DURATION, 1, 1);
        private final int h;
        private final j$.time.chrono.b i;

        m(j$.time.temporal.p pVar, int i2, int i3, int i4, j$.time.chrono.b bVar) {
            this(pVar, i2, i3, i4, bVar, 0);
            if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The minWidth must be from 1 to 10 inclusive but was " + i2);
            } else if (i3 < 1 || i3 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i2);
            } else if (i3 < i2) {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
            }
        }

        private m(j$.time.temporal.p pVar, int i2, int i3, int i4, j$.time.chrono.b bVar, int i5) {
            super(pVar, i2, i3, l.NOT_NEGATIVE, i5);
            this.h = i4;
            this.i = bVar;
        }

        /* synthetic */ m(j$.time.temporal.p pVar, int i2, int i3, int i4, j$.time.chrono.b bVar, int i5, a aVar) {
            this(pVar, i2, i3, i4, bVar, i5);
        }

        /* access modifiers changed from: package-private */
        public long b(g gVar, long j) {
            long j2;
            long abs = Math.abs(j);
            int i2 = this.h;
            if (this.i != null) {
                i2 = j$.time.chrono.h.E(gVar.d()).u(this.i).j(this.b);
            }
            long j3 = (long) i2;
            if (j >= j3) {
                long[] jArr = i.a;
                int i3 = this.c;
                if (j < j3 + jArr[i3]) {
                    j2 = jArr[i3];
                    return abs % j2;
                }
            }
            j2 = i.a[this.d];
            return abs % j2;
        }

        /* access modifiers changed from: package-private */
        public boolean c(d dVar) {
            if (!dVar.l()) {
                return false;
            }
            return super.c(dVar);
        }

        /* access modifiers changed from: package-private */
        public int d(d dVar, long j, int i2, int i3) {
            int i4 = this.h;
            if (this.i != null) {
                i4 = dVar.h().u(this.i).j(this.b);
                dVar.a(new b(this, dVar, j, i2, i3));
            }
            int i5 = i3 - i2;
            int i6 = this.c;
            if (i5 == i6 && j >= 0) {
                long j2 = i.a[i6];
                long j3 = (long) i4;
                long j4 = j3 - (j3 % j2);
                j = i4 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return dVar.o(this.b, j, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public i e() {
            return this.f == -1 ? this : new m(this.b, this.c, this.d, this.h, this.i, -1);
        }

        /* access modifiers changed from: package-private */
        public i f(int i2) {
            return new m(this.b, this.c, this.d, this.h, this.i, this.f + i2);
        }

        public String toString() {
            StringBuilder b = j$.com.android.tools.r8.a.b("ReducedValue(");
            b.append(this.b);
            b.append(InstabugDbContract.COMMA_SEP);
            b.append(this.c);
            b.append(InstabugDbContract.COMMA_SEP);
            b.append(this.d);
            b.append(InstabugDbContract.COMMA_SEP);
            Object obj = this.i;
            if (obj == null) {
                obj = Integer.valueOf(this.h);
            }
            b.append(obj);
            b.append(")");
            return b.toString();
        }
    }

    enum n implements d {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public boolean k(g gVar, StringBuilder sb) {
            return true;
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dVar.m(true);
            } else if (ordinal == 1) {
                dVar.m(false);
            } else if (ordinal == 2) {
                dVar.q(true);
            } else if (ordinal == 3) {
                dVar.q(false);
            }
            return i;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class o implements d {
        private final String a;

        o(String str) {
            this.a = str;
        }

        public boolean k(g gVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.a;
            return !dVar.s(charSequence, i, str, 0, str.length()) ? ~i : this.a.length() + i;
        }

        public String toString() {
            String replace = this.a.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    static final class p implements d {
        private final j$.time.temporal.p a;
        private final m b;
        private final h c;
        private volatile i d;

        p(j$.time.temporal.p pVar, m mVar, h hVar) {
            this.a = pVar;
            this.b = mVar;
            this.c = hVar;
        }

        private i a() {
            if (this.d == null) {
                this.d = new i(this.a, 1, 19, l.NORMAL);
            }
            return this.d;
        }

        public boolean k(g gVar, StringBuilder sb) {
            String str;
            j$.time.chrono.j jVar;
            Long e = gVar.e(this.a);
            if (e == null) {
                return false;
            }
            j$.time.temporal.l d2 = gVar.d();
            int i = j$.time.temporal.q.a;
            j$.time.chrono.h hVar = (j$.time.chrono.h) d2.d(j$.time.temporal.d.a);
            if (hVar == null || hVar == (jVar = j$.time.chrono.j.a)) {
                str = this.c.d(this.a, e.longValue(), this.b, gVar.c());
            } else {
                h hVar2 = this.c;
                j$.time.temporal.p pVar = this.a;
                long longValue = e.longValue();
                m mVar = this.b;
                Locale c2 = gVar.c();
                Objects.requireNonNull(hVar2);
                str = (hVar == jVar || !(pVar instanceof j$.time.temporal.j)) ? hVar2.d(pVar, longValue, mVar, c2) : null;
            }
            if (str == null) {
                return a().k(gVar, sb);
            }
            sb.append(str);
            return true;
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            Iterator it;
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator it2 = null;
            m mVar = dVar.l() ? this.b : null;
            j$.time.chrono.h h = dVar.h();
            j$.time.chrono.j jVar = j$.time.chrono.j.a;
            if (h == jVar) {
                it = this.c.e(this.a, mVar, dVar.i());
            } else {
                h hVar = this.c;
                j$.time.temporal.p pVar = this.a;
                Locale i2 = dVar.i();
                Objects.requireNonNull(hVar);
                if (h == jVar || !(pVar instanceof j$.time.temporal.j)) {
                    it2 = hVar.e(pVar, mVar, i2);
                }
                it = it2;
            }
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (dVar.s(str, 0, charSequence, i, str.length())) {
                        return dVar.o(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (dVar.l()) {
                    return ~i;
                }
            }
            return a().o(dVar, charSequence, i);
        }

        public String toString() {
            Object obj;
            StringBuilder sb;
            if (this.b == m.FULL) {
                sb = j$.com.android.tools.r8.a.b("Text(");
                obj = this.a;
            } else {
                sb = j$.com.android.tools.r8.a.b("Text(");
                sb.append(this.a);
                sb.append(InstabugDbContract.COMMA_SEP);
                obj = this.b;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class q implements d {
        private char a;
        private int b;

        q(char c, int i) {
            this.a = c;
            this.b = i;
        }

        private d a(Locale locale) {
            j$.time.temporal.p pVar;
            j$.time.temporal.s sVar = v.b;
            Objects.requireNonNull(locale, State.KEY_LOCALE);
            Calendar instance = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
            v g = v.g(j$.time.d.SUNDAY.p((long) (instance.getFirstDayOfWeek() - 1)), instance.getMinimalDaysInFirstWeek());
            char c = this.a;
            if (c == 'W') {
                pVar = g.i();
            } else if (c == 'Y') {
                j$.time.temporal.p h = g.h();
                int i = this.b;
                if (i == 2) {
                    return new m(h, 2, 2, 0, m.g, 0, (a) null);
                }
                return new i(h, i, 19, i < 4 ? l.NORMAL : l.EXCEEDS_PAD, -1);
            } else if (c == 'c' || c == 'e') {
                pVar = g.d();
            } else if (c == 'w') {
                pVar = g.j();
            } else {
                throw new IllegalStateException("unreachable");
            }
            return new i(pVar, this.b == 2 ? 2 : 1, 2, l.NOT_NEGATIVE);
        }

        public boolean k(g gVar, StringBuilder sb) {
            return ((i) a(gVar.c())).k(gVar, sb);
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            return ((i) a(dVar.i())).o(dVar, charSequence, i);
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.a;
            if (c == 'Y') {
                int i = this.b;
                if (i == 1) {
                    str2 = "WeekBasedYear";
                } else if (i == 2) {
                    str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.b);
                    sb.append(InstabugDbContract.COMMA_SEP);
                    sb.append(19);
                    sb.append(InstabugDbContract.COMMA_SEP);
                    sb.append(this.b < 4 ? l.NORMAL : l.EXCEEDS_PAD);
                }
                sb.append(str2);
            } else {
                if (c == 'W') {
                    str = "WeekOfMonth";
                } else if (c == 'c' || c == 'e') {
                    str = "DayOfWeek";
                } else {
                    if (c == 'w') {
                        str = "WeekOfWeekBasedYear";
                    }
                    sb.append(InstabugDbContract.COMMA_SEP);
                    sb.append(this.b);
                }
                sb.append(str);
                sb.append(InstabugDbContract.COMMA_SEP);
                sb.append(this.b);
            }
            sb.append(")");
            return sb.toString();
        }
    }

    static class r implements d {
        private static volatile Map.Entry a;
        private static volatile Map.Entry b;
        private final j$.time.temporal.r c;
        private final String d;

        r(j$.time.temporal.r rVar, String str) {
            this.c = rVar;
            this.d = str;
        }

        private int b(d dVar, CharSequence charSequence, int i, int i2, j jVar) {
            String upperCase = charSequence.toString().substring(i, i2).toUpperCase();
            if (i2 < charSequence.length() && charSequence.charAt(i2) != '0' && !dVar.b(charSequence.charAt(i2), 'Z')) {
                d d2 = dVar.d();
                int o = jVar.o(d2, charSequence, i2);
                if (o < 0) {
                    try {
                        if (jVar == j.b) {
                            return ~i;
                        }
                        dVar.n(ZoneId.q(upperCase));
                        return i2;
                    } catch (j$.time.c unused) {
                        return ~i;
                    }
                } else {
                    dVar.n(ZoneId.B(upperCase, j$.time.k.a0((int) d2.j(j$.time.temporal.j.OFFSET_SECONDS).longValue())));
                    return o;
                }
            } else {
                dVar.n(ZoneId.q(upperCase));
                return i2;
            }
        }

        /* access modifiers changed from: protected */
        public l a(d dVar) {
            Set a2 = j$.time.zone.e.a();
            int size = ((HashSet) a2).size();
            Map.Entry entry = dVar.k() ? a : b;
            if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                synchronized (this) {
                    Map.Entry entry2 = dVar.k() ? a : b;
                    if (entry2 == null || ((Integer) entry2.getKey()).intValue() != size) {
                        entry2 = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), l.g(a2, dVar));
                        if (dVar.k()) {
                            a = entry2;
                        } else {
                            b = entry2;
                        }
                    }
                }
            }
            return (l) entry.getValue();
        }

        public boolean k(g gVar, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) gVar.f(this.c);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.t());
            return true;
        }

        public int o(d dVar, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            } else if (i == length) {
                return ~i;
            } else {
                char charAt = charSequence.charAt(i);
                if (charAt == '+' || charAt == '-') {
                    return b(dVar, charSequence, i, i, j.b);
                }
                int i3 = i + 2;
                if (length >= i3) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (dVar.b(charAt, 'U') && dVar.b(charAt2, 'T')) {
                        int i4 = i + 3;
                        if (length < i4 || !dVar.b(charSequence.charAt(i3), 'C')) {
                            return b(dVar, charSequence, i, i3, j.c);
                        }
                        return b(dVar, charSequence, i, i4, j.c);
                    } else if (dVar.b(charAt, 'G') && length >= (i2 = i + 3) && dVar.b(charAt2, 'M') && dVar.b(charSequence.charAt(i3), 'T')) {
                        return b(dVar, charSequence, i, i2, j.c);
                    }
                }
                l a2 = a(dVar);
                ParsePosition parsePosition = new ParsePosition(i);
                String d2 = a2.d(charSequence, parsePosition);
                if (d2 != null) {
                    dVar.n(ZoneId.q(d2));
                    return parsePosition.getIndex();
                } else if (!dVar.b(charAt, 'Z')) {
                    return ~i;
                } else {
                    dVar.n(j$.time.k.d);
                    return i + 1;
                }
            }
        }

        public String toString() {
            return this.d;
        }
    }

    static final class s extends r {
        private static final Map e = new ConcurrentHashMap();
        private final m f;
        private Set g;
        private final Map h = new HashMap();
        private final Map i = new HashMap();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        s(j$.time.format.m r3, java.util.Set r4) {
            /*
                r2 = this;
                int r4 = j$.time.temporal.q.a
                j$.time.temporal.i r4 = j$.time.temporal.i.a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ZoneText("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r4, r0)
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                r2.h = r4
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                r2.i = r4
                java.lang.String r4 = "textStyle"
                java.util.Objects.requireNonNull(r3, r4)
                r2.f = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.c.s.<init>(j$.time.format.m, java.util.Set):void");
        }

        /* access modifiers changed from: protected */
        public l a(d dVar) {
            l lVar;
            if (this.f == m.NARROW) {
                return super.a(dVar);
            }
            Locale i2 = dVar.i();
            boolean k = dVar.k();
            HashSet hashSet = (HashSet) j$.time.zone.e.a();
            int size = hashSet.size();
            Map map = k ? this.h : this.i;
            Map.Entry entry = (Map.Entry) map.get(i2);
            if (entry == null || ((Integer) entry.getKey()).intValue() != size || (lVar = (l) ((SoftReference) entry.getValue()).get()) == null) {
                lVar = l.f(dVar);
                String[][] zoneStrings = DateFormatSymbols.getInstance(i2).getZoneStrings();
                int length = zoneStrings.length;
                int i3 = 0;
                while (true) {
                    int i4 = 1;
                    if (i3 >= length) {
                        break;
                    }
                    String[] strArr = zoneStrings[i3];
                    String str = strArr[0];
                    if (hashSet.contains(str)) {
                        lVar.a(str, str);
                        String a = n.a(str, i2);
                        if (this.f != m.FULL) {
                            i4 = 2;
                        }
                        while (i4 < strArr.length) {
                            lVar.a(strArr[i4], a);
                            i4 += 2;
                        }
                    }
                    i3++;
                }
                if (this.g != null) {
                    for (String[] strArr2 : zoneStrings) {
                        String str2 = strArr2[0];
                        if (this.g.contains(str2) && hashSet.contains(str2)) {
                            for (int i5 = this.f == m.FULL ? 1 : 2; i5 < strArr2.length; i5 += 2) {
                                lVar.a(strArr2[i5], str2);
                            }
                        }
                    }
                }
                map.put(i2, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(lVar)));
            }
            return lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.concurrent.ConcurrentHashMap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.util.concurrent.ConcurrentHashMap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.Map} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
            if (r5 == null) goto L_0x0060;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean k(j$.time.format.g r13, java.lang.StringBuilder r14) {
            /*
                r12 = this;
                int r0 = j$.time.temporal.q.a
                j$.time.temporal.f r0 = j$.time.temporal.f.a
                java.lang.Object r0 = r13.f(r0)
                j$.time.ZoneId r0 = (j$.time.ZoneId) r0
                r1 = 0
                if (r0 != 0) goto L_0x000e
                return r1
            L_0x000e:
                java.lang.String r2 = r0.t()
                boolean r3 = r0 instanceof j$.time.k
                r4 = 1
                if (r3 != 0) goto L_0x00b2
                j$.time.temporal.l r3 = r13.d()
                j$.time.temporal.j r5 = j$.time.temporal.j.INSTANT_SECONDS
                boolean r5 = r3.f(r5)
                r6 = 2
                if (r5 == 0) goto L_0x0036
                j$.time.zone.c r0 = r0.p()
                j$.time.Instant r3 = j$.time.Instant.q(r3)
                boolean r0 = r0.h(r3)
                if (r0 == 0) goto L_0x0034
                r0 = r4
                goto L_0x0037
            L_0x0034:
                r0 = r1
                goto L_0x0037
            L_0x0036:
                r0 = r6
            L_0x0037:
                java.util.Locale r13 = r13.c()
                j$.time.format.m r3 = r12.f
                j$.time.format.m r5 = j$.time.format.m.NARROW
                r7 = 0
                if (r3 != r5) goto L_0x0043
                goto L_0x00af
            L_0x0043:
                java.util.Map r3 = e
                java.lang.Object r5 = r3.get(r2)
                java.lang.ref.SoftReference r5 = (java.lang.ref.SoftReference) r5
                r8 = 5
                r9 = 3
                if (r5 == 0) goto L_0x0060
                java.lang.Object r5 = r5.get()
                r7 = r5
                java.util.Map r7 = (java.util.Map) r7
                if (r7 == 0) goto L_0x0060
                java.lang.Object r5 = r7.get(r13)
                java.lang.String[] r5 = (java.lang.String[]) r5
                if (r5 != 0) goto L_0x009a
            L_0x0060:
                java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r2)
                r10 = 7
                java.lang.String[] r10 = new java.lang.String[r10]
                r10[r1] = r2
                java.lang.String r11 = r5.getDisplayName(r1, r4, r13)
                r10[r4] = r11
                java.lang.String r11 = r5.getDisplayName(r1, r1, r13)
                r10[r6] = r11
                java.lang.String r6 = r5.getDisplayName(r4, r4, r13)
                r10[r9] = r6
                java.lang.String r1 = r5.getDisplayName(r4, r1, r13)
                r5 = 4
                r10[r5] = r1
                r10[r8] = r2
                r1 = 6
                r10[r1] = r2
                if (r7 != 0) goto L_0x008e
                java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
                r7.<init>()
            L_0x008e:
                r7.put(r13, r10)
                java.lang.ref.SoftReference r13 = new java.lang.ref.SoftReference
                r13.<init>(r7)
                r3.put(r2, r13)
                r5 = r10
            L_0x009a:
                j$.time.format.m r13 = r12.f
                int r13 = r13.k()
                if (r0 == 0) goto L_0x00ac
                if (r0 == r4) goto L_0x00a8
                int r13 = r13 + r8
                r7 = r5[r13]
                goto L_0x00af
            L_0x00a8:
                int r13 = r13 + r9
                r7 = r5[r13]
                goto L_0x00af
            L_0x00ac:
                int r13 = r13 + r4
                r7 = r5[r13]
            L_0x00af:
                if (r7 == 0) goto L_0x00b2
                r2 = r7
            L_0x00b2:
                r14.append(r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.format.c.s.k(j$.time.format.g, java.lang.StringBuilder):boolean");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put('G', j$.time.temporal.j.ERA);
        hashMap.put('y', j$.time.temporal.j.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.j.YEAR);
        j$.time.temporal.p pVar = j$.time.temporal.k.a;
        hashMap.put('Q', pVar);
        hashMap.put('q', pVar);
        j$.time.temporal.j jVar = j$.time.temporal.j.MONTH_OF_YEAR;
        hashMap.put('M', jVar);
        hashMap.put('L', jVar);
        hashMap.put('D', j$.time.temporal.j.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.j.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.j.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.j jVar2 = j$.time.temporal.j.DAY_OF_WEEK;
        hashMap.put('E', jVar2);
        hashMap.put('c', jVar2);
        hashMap.put('e', jVar2);
        hashMap.put('a', j$.time.temporal.j.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.j.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.j.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.j.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.j.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.j.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.j.SECOND_OF_MINUTE);
        j$.time.temporal.j jVar3 = j$.time.temporal.j.NANO_OF_SECOND;
        hashMap.put('S', jVar3);
        hashMap.put('A', j$.time.temporal.j.MILLI_OF_DAY);
        hashMap.put('n', jVar3);
        hashMap.put('N', j$.time.temporal.j.NANO_OF_DAY);
    }

    public c() {
        this.c = this;
        this.e = new ArrayList();
        this.i = -1;
        this.d = null;
        this.f = false;
    }

    private c(c cVar, boolean z) {
        this.c = this;
        this.e = new ArrayList();
        this.i = -1;
        this.d = cVar;
        this.f = z;
    }

    private DateTimeFormatter A(Locale locale, k kVar, j$.time.chrono.h hVar) {
        Objects.requireNonNull(locale, State.KEY_LOCALE);
        while (this.c.d != null) {
            s();
        }
        return new DateTimeFormatter(new C0310c(this.e, false), locale, i.a, kVar, (Set) null, hVar, (ZoneId) null);
    }

    private int d(d dVar) {
        Objects.requireNonNull(dVar, "pp");
        c cVar = this.c;
        int i2 = cVar.g;
        if (i2 > 0) {
            k kVar = new k(dVar, i2, cVar.h);
            cVar.g = 0;
            cVar.h = 0;
            dVar = kVar;
        }
        cVar.e.add(dVar);
        c cVar2 = this.c;
        cVar2.i = -1;
        return cVar2.e.size() - 1;
    }

    private c n(i iVar) {
        i iVar2;
        c cVar = this.c;
        int i2 = cVar.i;
        if (i2 >= 0) {
            i iVar3 = (i) cVar.e.get(i2);
            if (iVar.c == iVar.d && iVar.e == l.NOT_NEGATIVE) {
                iVar2 = iVar3.f(iVar.d);
                d(iVar.e());
                this.c.i = i2;
            } else {
                iVar2 = iVar3.e();
                this.c.i = d(iVar);
            }
            this.c.e.set(i2, iVar2);
        } else {
            cVar.i = d(iVar);
        }
        return this;
    }

    public c a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.h(false));
        return this;
    }

    public c b(j$.time.temporal.p pVar, int i2, int i3, boolean z) {
        d(new e(pVar, i2, i3, z));
        return this;
    }

    public c c() {
        d(new f(-2));
        return this;
    }

    public c e(char c2) {
        d(new b(c2));
        return this;
    }

    public c f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.length() > 0) {
            d(str.length() == 1 ? new b(str.charAt(0)) : new o(str));
        }
        return this;
    }

    public c g(FormatStyle formatStyle, FormatStyle formatStyle2) {
        d(new h((FormatStyle) null, formatStyle2));
        return this;
    }

    public c h(m mVar) {
        Objects.requireNonNull(mVar, "style");
        if (mVar == m.FULL || mVar == m.SHORT) {
            d(new g(mVar));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public c i(String str, String str2) {
        d(new j(str, str2));
        return this;
    }

    public c j() {
        d(j.b);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ea, code lost:
        if (r3 == 1) goto L_0x01c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0330 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.format.c k(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "pattern"
            java.util.Objects.requireNonNull(r1, r2)
            r2 = 0
            r3 = r2
        L_0x000b:
            int r4 = r18.length()
            if (r3 >= r4) goto L_0x0391
            char r4 = r1.charAt(r3)
            r5 = 65
            r6 = 122(0x7a, float:1.71E-43)
            r7 = 90
            r8 = 97
            r9 = 1
            if (r4 < r5) goto L_0x0022
            if (r4 <= r7) goto L_0x0026
        L_0x0022:
            if (r4 < r8) goto L_0x02eb
            if (r4 > r6) goto L_0x02eb
        L_0x0026:
            int r10 = r3 + 1
        L_0x0028:
            int r11 = r18.length()
            if (r10 >= r11) goto L_0x0037
            char r11 = r1.charAt(r10)
            if (r11 != r4) goto L_0x0037
            int r10 = r10 + 1
            goto L_0x0028
        L_0x0037:
            int r3 = r10 - r3
            r11 = 112(0x70, float:1.57E-43)
            r12 = -1
            if (r4 != r11) goto L_0x00a6
            int r11 = r18.length()
            if (r10 >= r11) goto L_0x0064
            char r4 = r1.charAt(r10)
            if (r4 < r5) goto L_0x004c
            if (r4 <= r7) goto L_0x0050
        L_0x004c:
            if (r4 < r8) goto L_0x0064
            if (r4 > r6) goto L_0x0064
        L_0x0050:
            int r5 = r10 + 1
        L_0x0052:
            int r11 = r18.length()
            if (r5 >= r11) goto L_0x0061
            char r11 = r1.charAt(r5)
            if (r11 != r4) goto L_0x0061
            int r5 = r5 + 1
            goto L_0x0052
        L_0x0061:
            int r10 = r5 - r10
            goto L_0x0067
        L_0x0064:
            r5 = r10
            r10 = r3
            r3 = r2
        L_0x0067:
            if (r3 == 0) goto L_0x008f
            if (r3 < r9) goto L_0x0078
            j$.time.format.c r11 = r0.c
            r11.g = r3
            r3 = 32
            r11.h = r3
            r11.i = r12
            r3 = r10
            r10 = r5
            goto L_0x00a6
        L_0x0078:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "The pad width must be at least one but was "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x008f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Pad letter 'p' must be followed by valid pad pattern: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00a6:
            java.util.Map r5 = a
            java.lang.Character r11 = java.lang.Character.valueOf(r4)
            java.lang.Object r5 = r5.get(r11)
            r12 = r5
            j$.time.temporal.p r12 = (j$.time.temporal.p) r12
            r5 = 5
            r11 = 4
            java.lang.String r13 = "Too many pattern letters: "
            r14 = 2
            if (r12 == 0) goto L_0x01d9
            r6 = 81
            r7 = 3
            if (r4 == r6) goto L_0x0185
            r6 = 83
            if (r4 == r6) goto L_0x0179
            if (r4 == r8) goto L_0x016c
            r6 = 104(0x68, float:1.46E-43)
            if (r4 == r6) goto L_0x0157
            r6 = 107(0x6b, float:1.5E-43)
            if (r4 == r6) goto L_0x0157
            r6 = 109(0x6d, float:1.53E-43)
            if (r4 == r6) goto L_0x0157
            r6 = 113(0x71, float:1.58E-43)
            if (r4 == r6) goto L_0x0155
            r6 = 115(0x73, float:1.61E-43)
            if (r4 == r6) goto L_0x0157
            r6 = 117(0x75, float:1.64E-43)
            if (r4 == r6) goto L_0x012e
            r6 = 121(0x79, float:1.7E-43)
            if (r4 == r6) goto L_0x012e
            switch(r4) {
                case 68: goto L_0x0112;
                case 69: goto L_0x0185;
                case 70: goto L_0x0104;
                case 71: goto L_0x00ee;
                case 72: goto L_0x0157;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            switch(r4) {
                case 75: goto L_0x0157;
                case 76: goto L_0x0155;
                case 77: goto L_0x0185;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            switch(r4) {
                case 99: goto L_0x0123;
                case 100: goto L_0x0157;
                case 101: goto L_0x0185;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            if (r3 != r9) goto L_0x015d
            goto L_0x01c5
        L_0x00ee:
            if (r3 == r9) goto L_0x01bc
            if (r3 == r14) goto L_0x01bc
            if (r3 == r7) goto L_0x01bc
            if (r3 == r11) goto L_0x01a7
            if (r3 != r5) goto L_0x00fa
            goto L_0x0195
        L_0x00fa:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0104:
            if (r3 != r9) goto L_0x0108
            goto L_0x01c5
        L_0x0108:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0112:
            if (r3 != r9) goto L_0x0116
            goto L_0x01c5
        L_0x0116:
            if (r3 > r7) goto L_0x0119
            goto L_0x015d
        L_0x0119:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0123:
            if (r3 == r14) goto L_0x0126
            goto L_0x0155
        L_0x0126:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid pattern \"cc\""
            r1.<init>(r2)
            throw r1
        L_0x012e:
            if (r3 != r14) goto L_0x0147
            j$.time.e r3 = j$.time.format.c.m.g
            r13 = 2
            r14 = 2
            java.lang.String r4 = "baseDate"
            java.util.Objects.requireNonNull(r3, r4)
            j$.time.format.c$m r4 = new j$.time.format.c$m
            r15 = 0
            r11 = r4
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r0.n(r4)
            goto L_0x02db
        L_0x0147:
            r4 = 19
            if (r3 >= r11) goto L_0x014e
            j$.time.format.l r5 = j$.time.format.l.NORMAL
            goto L_0x0150
        L_0x014e:
            j$.time.format.l r5 = j$.time.format.l.EXCEEDS_PAD
        L_0x0150:
            r0.q(r12, r3, r4, r5)
            goto L_0x02db
        L_0x0155:
            r6 = r9
            goto L_0x0186
        L_0x0157:
            if (r3 != r9) goto L_0x015b
            goto L_0x01c5
        L_0x015b:
            if (r3 != r14) goto L_0x0162
        L_0x015d:
            r0.p(r12, r3)
            goto L_0x02db
        L_0x0162:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x016c:
            if (r3 != r9) goto L_0x016f
            goto L_0x01bc
        L_0x016f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0179:
            j$.time.temporal.j r4 = j$.time.temporal.j.NANO_OF_SECOND
            j$.time.format.c$e r5 = new j$.time.format.c$e
            r5.<init>(r4, r3, r3, r2)
            r0.d(r5)
            goto L_0x02db
        L_0x0185:
            r6 = r2
        L_0x0186:
            if (r3 == r9) goto L_0x01af
            if (r3 == r14) goto L_0x01af
            if (r3 == r7) goto L_0x01aa
            if (r3 == r11) goto L_0x01a2
            if (r3 != r5) goto L_0x0198
            if (r6 == 0) goto L_0x0195
            j$.time.format.m r3 = j$.time.format.m.NARROW_STANDALONE
            goto L_0x01be
        L_0x0195:
            j$.time.format.m r3 = j$.time.format.m.NARROW
            goto L_0x01be
        L_0x0198:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            if (r6 == 0) goto L_0x01a7
            j$.time.format.m r3 = j$.time.format.m.FULL_STANDALONE
            goto L_0x01be
        L_0x01a7:
            j$.time.format.m r3 = j$.time.format.m.FULL
            goto L_0x01be
        L_0x01aa:
            if (r6 == 0) goto L_0x01bc
            j$.time.format.m r3 = j$.time.format.m.SHORT_STANDALONE
            goto L_0x01be
        L_0x01af:
            r5 = 99
            if (r4 == r5) goto L_0x01cf
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L_0x01b8
            goto L_0x01cf
        L_0x01b8:
            r5 = 69
            if (r4 != r5) goto L_0x01c3
        L_0x01bc:
            j$.time.format.m r3 = j$.time.format.m.SHORT
        L_0x01be:
            r0.l(r12, r3)
            goto L_0x02db
        L_0x01c3:
            if (r3 != r9) goto L_0x01ca
        L_0x01c5:
            r0.o(r12)
            goto L_0x02db
        L_0x01ca:
            r0.p(r12, r14)
            goto L_0x02db
        L_0x01cf:
            j$.time.format.c$q r5 = new j$.time.format.c$q
            r5.<init>(r4, r3)
            r0.d(r5)
            goto L_0x02db
        L_0x01d9:
            if (r4 != r6) goto L_0x01fe
            if (r3 > r11) goto L_0x01f4
            r4 = 0
            if (r3 != r11) goto L_0x01e8
            j$.time.format.m r3 = j$.time.format.m.FULL
            j$.time.format.c$s r5 = new j$.time.format.c$s
            r5.<init>(r3, r4)
            goto L_0x01ef
        L_0x01e8:
            j$.time.format.m r3 = j$.time.format.m.SHORT
            j$.time.format.c$s r5 = new j$.time.format.c$s
            r5.<init>(r3, r4)
        L_0x01ef:
            r0.d(r5)
            goto L_0x02db
        L_0x01f4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x01fe:
            r6 = 86
            if (r4 != r6) goto L_0x021e
            if (r3 != r14) goto L_0x0212
            j$.time.format.c$r r3 = new j$.time.format.c$r
            j$.time.temporal.f r4 = j$.time.temporal.f.a
            java.lang.String r5 = "ZoneId()"
            r3.<init>(r4, r5)
            r0.d(r3)
            goto L_0x02db
        L_0x0212:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern letter count must be 2: "
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x021e:
            java.lang.String r6 = "+0000"
            if (r4 != r7) goto L_0x023a
            if (r3 >= r11) goto L_0x0228
            java.lang.String r3 = "+HHMM"
            goto L_0x0295
        L_0x0228:
            if (r3 != r11) goto L_0x022b
            goto L_0x0245
        L_0x022b:
            if (r3 != r5) goto L_0x0230
            java.lang.String r3 = "+HH:MM:ss"
            goto L_0x0268
        L_0x0230:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x023a:
            r7 = 79
            if (r4 != r7) goto L_0x0258
            if (r3 != r9) goto L_0x0243
            j$.time.format.m r3 = j$.time.format.m.SHORT
            goto L_0x0247
        L_0x0243:
            if (r3 != r11) goto L_0x024c
        L_0x0245:
            j$.time.format.m r3 = j$.time.format.m.FULL
        L_0x0247:
            r0.h(r3)
            goto L_0x02db
        L_0x024c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern letter count must be 1 or 4: "
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x0258:
            r7 = 88
            if (r4 != r7) goto L_0x0279
            if (r3 > r5) goto L_0x026f
            java.lang.String[] r4 = j$.time.format.c.j.a
            if (r3 != r9) goto L_0x0264
            r5 = r2
            goto L_0x0265
        L_0x0264:
            r5 = r9
        L_0x0265:
            int r3 = r3 + r5
            r3 = r4[r3]
        L_0x0268:
            java.lang.String r4 = "Z"
            r0.i(r3, r4)
            goto L_0x02db
        L_0x026f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x0279:
            r7 = 120(0x78, float:1.68E-43)
            if (r4 != r7) goto L_0x02a3
            if (r3 > r5) goto L_0x0299
            if (r3 != r9) goto L_0x0284
            java.lang.String r6 = "+00"
            goto L_0x028b
        L_0x0284:
            int r4 = r3 % 2
            if (r4 != 0) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            java.lang.String r6 = "+00:00"
        L_0x028b:
            java.lang.String[] r4 = j$.time.format.c.j.a
            if (r3 != r9) goto L_0x0291
            r5 = r2
            goto L_0x0292
        L_0x0291:
            r5 = r9
        L_0x0292:
            int r3 = r3 + r5
            r3 = r4[r3]
        L_0x0295:
            r0.i(r3, r6)
            goto L_0x02db
        L_0x0299:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x02a3:
            r5 = 87
            if (r4 != r5) goto L_0x02b9
            if (r3 > r9) goto L_0x02af
            j$.time.format.c$q r5 = new j$.time.format.c$q
            r5.<init>(r4, r3)
            goto L_0x02d8
        L_0x02af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x02b9:
            r5 = 119(0x77, float:1.67E-43)
            if (r4 != r5) goto L_0x02cf
            if (r3 > r14) goto L_0x02c5
            j$.time.format.c$q r5 = new j$.time.format.c$q
            r5.<init>(r4, r3)
            goto L_0x02d8
        L_0x02c5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r13, r4)
            r1.<init>(r2)
            throw r1
        L_0x02cf:
            r5 = 89
            if (r4 != r5) goto L_0x02df
            j$.time.format.c$q r5 = new j$.time.format.c$q
            r5.<init>(r4, r3)
        L_0x02d8:
            r0.d(r5)
        L_0x02db:
            int r3 = r10 + -1
            goto L_0x0374
        L_0x02df:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Unknown pattern letter: "
            java.lang.String r2 = j$.com.android.tools.r8.a.a(r2, r4)
            r1.<init>(r2)
            throw r1
        L_0x02eb:
            java.lang.String r5 = "'"
            r6 = 39
            if (r4 != r6) goto L_0x0347
            int r3 = r3 + 1
            r4 = r3
        L_0x02f4:
            int r7 = r18.length()
            if (r4 >= r7) goto L_0x0311
            char r7 = r1.charAt(r4)
            if (r7 != r6) goto L_0x030f
            int r7 = r4 + 1
            int r8 = r18.length()
            if (r7 >= r8) goto L_0x0311
            char r8 = r1.charAt(r7)
            if (r8 != r6) goto L_0x0311
            r4 = r7
        L_0x030f:
            int r4 = r4 + r9
            goto L_0x02f4
        L_0x0311:
            int r7 = r18.length()
            if (r4 >= r7) goto L_0x0330
            java.lang.String r3 = r1.substring(r3, r4)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x0325
            r0.e(r6)
            goto L_0x032e
        L_0x0325:
            java.lang.String r6 = "''"
            java.lang.String r3 = r3.replace(r6, r5)
            r0.f(r3)
        L_0x032e:
            r3 = r4
            goto L_0x0374
        L_0x0330:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Pattern ends with an incomplete string literal: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0347:
            r6 = 91
            if (r4 != r6) goto L_0x034f
            r17.t()
            goto L_0x0374
        L_0x034f:
            r6 = 93
            if (r4 != r6) goto L_0x0365
            j$.time.format.c r4 = r0.c
            j$.time.format.c r4 = r4.d
            if (r4 == 0) goto L_0x035d
            r17.s()
            goto L_0x0374
        L_0x035d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern invalid as it contains ] without previous ["
            r1.<init>(r2)
            throw r1
        L_0x0365:
            r6 = 123(0x7b, float:1.72E-43)
            if (r4 == r6) goto L_0x0377
            r6 = 125(0x7d, float:1.75E-43)
            if (r4 == r6) goto L_0x0377
            r6 = 35
            if (r4 == r6) goto L_0x0377
            r0.e(r4)
        L_0x0374:
            int r3 = r3 + r9
            goto L_0x000b
        L_0x0377:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Pattern includes reserved character: '"
            r2.append(r3)
            r2.append(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0391:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.c.k(java.lang.String):j$.time.format.c");
    }

    public c l(j$.time.temporal.p pVar, m mVar) {
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(mVar, "textStyle");
        d(new p(pVar, mVar, new h()));
        return this;
    }

    public c m(j$.time.temporal.p pVar, Map map) {
        Objects.requireNonNull(pVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m mVar = m.FULL;
        d(new p(pVar, mVar, new a(this, new h.b(Collections.singletonMap(mVar, linkedHashMap)))));
        return this;
    }

    public c o(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        n(new i(pVar, 1, 19, l.NORMAL));
        return this;
    }

    public c p(j$.time.temporal.p pVar, int i2) {
        Objects.requireNonNull(pVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        n(new i(pVar, i2, i2, l.NOT_NEGATIVE));
        return this;
    }

    public c q(j$.time.temporal.p pVar, int i2, int i3, l lVar) {
        if (i2 == i3 && lVar == l.NOT_NEGATIVE) {
            p(pVar, i3);
            return this;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(lVar, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        } else if (i3 >= i2) {
            n(new i(pVar, i2, i3, lVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
    }

    public c r() {
        d(new r(a.a, "ZoneRegionId()"));
        return this;
    }

    public c s() {
        c cVar = this.c;
        if (cVar.d != null) {
            if (cVar.e.size() > 0) {
                c cVar2 = this.c;
                C0310c cVar3 = new C0310c(cVar2.e, cVar2.f);
                this.c = this.c.d;
                d(cVar3);
            } else {
                this.c = this.c.d;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public c t() {
        c cVar = this.c;
        cVar.i = -1;
        this.c = new c(cVar, true);
        return this;
    }

    public c u() {
        d(n.INSENSITIVE);
        return this;
    }

    public c v() {
        d(n.SENSITIVE);
        return this;
    }

    public c w() {
        d(n.LENIENT);
        return this;
    }

    public DateTimeFormatter x() {
        return A(Locale.getDefault(), k.SMART, (j$.time.chrono.h) null);
    }

    /* access modifiers changed from: package-private */
    public DateTimeFormatter y(k kVar, j$.time.chrono.h hVar) {
        return A(Locale.getDefault(), kVar, hVar);
    }

    public DateTimeFormatter z(Locale locale) {
        return A(locale, k.SMART, (j$.time.chrono.h) null);
    }
}
