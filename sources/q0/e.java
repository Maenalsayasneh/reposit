package q0;

import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CacheControl.kt */
public final class e {
    public static final e a;
    public static final a b = new a((f) null);
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public String o;

    /* compiled from: CacheControl.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final int a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (StringsKt__IndentKt.c(str2, str.charAt(i), false, 2)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final q0.e b(q0.v r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                java.lang.String r2 = "headers"
                m0.n.b.i.e(r1, r2)
                int r2 = r27.size()
                r6 = 1
                r8 = r6
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0191
                java.lang.String r3 = r1.c(r7)
                java.lang.String r4 = r1.k(r7)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r3, r5, r6)
                if (r5 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r4
                goto L_0x0043
            L_0x003a:
                java.lang.String r5 = "Pragma"
                boolean r3 = kotlin.text.StringsKt__IndentKt.f(r3, r5, r6)
                if (r3 == 0) goto L_0x0185
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r5 = r4.length()
                if (r3 >= r5) goto L_0x0180
                java.lang.String r5 = "=,;"
                int r5 = r0.a(r4, r5, r3)
                java.lang.String r3 = r4.substring(r3, r5)
                java.lang.String r6 = "(this as java.lang.Strin???ing(startIndex, endIndex)"
                m0.n.b.i.d(r3, r6)
                java.lang.CharSequence r3 = kotlin.text.StringsKt__IndentKt.X(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r4.length()
                if (r5 == r1) goto L_0x00dc
                char r1 = r4.charAt(r5)
                r24 = r2
                r2 = 44
                if (r1 == r2) goto L_0x00de
                char r1 = r4.charAt(r5)
                r2 = 59
                if (r1 != r2) goto L_0x007a
                goto L_0x00de
            L_0x007a:
                int r5 = r5 + 1
                byte[] r1 = q0.h0.c.a
                java.lang.String r1 = "$this$indexOfNonWhitespace"
                m0.n.b.i.e(r4, r1)
                int r1 = r4.length()
            L_0x0087:
                if (r5 >= r1) goto L_0x009d
                char r2 = r4.charAt(r5)
                r25 = r1
                r1 = 32
                if (r2 == r1) goto L_0x0098
                r1 = 9
                if (r2 == r1) goto L_0x0098
                goto L_0x00a1
            L_0x0098:
                int r5 = r5 + 1
                r1 = r25
                goto L_0x0087
            L_0x009d:
                int r5 = r4.length()
            L_0x00a1:
                int r1 = r4.length()
                if (r5 >= r1) goto L_0x00c3
                char r1 = r4.charAt(r5)
                r2 = 34
                if (r1 != r2) goto L_0x00c3
                int r5 = r5 + 1
                r1 = 4
                r25 = r9
                r9 = 0
                int r1 = kotlin.text.StringsKt__IndentKt.l(r4, r2, r5, r9, r1)
                java.lang.String r2 = r4.substring(r5, r1)
                m0.n.b.i.d(r2, r6)
                r5 = 1
                int r1 = r1 + r5
                goto L_0x00e5
            L_0x00c3:
                r25 = r9
                r9 = 0
                java.lang.String r1 = ",;"
                int r1 = r0.a(r4, r1, r5)
                java.lang.String r2 = r4.substring(r5, r1)
                m0.n.b.i.d(r2, r6)
                java.lang.CharSequence r2 = kotlin.text.StringsKt__IndentKt.X(r2)
                java.lang.String r2 = r2.toString()
                goto L_0x00e5
            L_0x00dc:
                r24 = r2
            L_0x00de:
                r25 = r9
                r9 = 0
                int r5 = r5 + 1
                r1 = r5
                r2 = 0
            L_0x00e5:
                java.lang.String r5 = "no-cache"
                r6 = 1
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x00f2
                r10 = r6
            L_0x00ef:
                r5 = -1
                goto L_0x0177
            L_0x00f2:
                java.lang.String r5 = "no-store"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x00fc
                r11 = r6
                goto L_0x00ef
            L_0x00fc:
                java.lang.String r5 = "max-age"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x010b
                r5 = -1
                int r12 = q0.h0.c.y(r2, r5)
                goto L_0x0177
            L_0x010b:
                r5 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = kotlin.text.StringsKt__IndentKt.f(r9, r3, r6)
                if (r9 == 0) goto L_0x0119
                int r13 = q0.h0.c.y(r2, r5)
                goto L_0x0177
            L_0x0119:
                java.lang.String r5 = "private"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0123
                r14 = r6
                goto L_0x00ef
            L_0x0123:
                java.lang.String r5 = "public"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x012d
                r15 = r6
                goto L_0x00ef
            L_0x012d:
                java.lang.String r5 = "must-revalidate"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0138
                r16 = r6
                goto L_0x00ef
            L_0x0138:
                java.lang.String r5 = "max-stale"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0148
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = q0.h0.c.y(r2, r3)
                goto L_0x00ef
            L_0x0148:
                java.lang.String r5 = "min-fresh"
                boolean r5 = kotlin.text.StringsKt__IndentKt.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0156
                r5 = -1
                int r18 = q0.h0.c.y(r2, r5)
                goto L_0x0177
            L_0x0156:
                r5 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = kotlin.text.StringsKt__IndentKt.f(r2, r3, r6)
                if (r2 == 0) goto L_0x0162
                r19 = r6
                goto L_0x0177
            L_0x0162:
                java.lang.String r2 = "no-transform"
                boolean r2 = kotlin.text.StringsKt__IndentKt.f(r2, r3, r6)
                if (r2 == 0) goto L_0x016d
                r20 = r6
                goto L_0x0177
            L_0x016d:
                java.lang.String r2 = "immutable"
                boolean r2 = kotlin.text.StringsKt__IndentKt.f(r2, r3, r6)
                if (r2 == 0) goto L_0x0177
                r21 = r6
            L_0x0177:
                r3 = r1
                r2 = r24
                r9 = r25
                r1 = r27
                goto L_0x0044
            L_0x0180:
                r24 = r2
                r25 = r9
                goto L_0x0188
            L_0x0185:
                r24 = r2
                r3 = r9
            L_0x0188:
                r5 = -1
                int r7 = r7 + 1
                r1 = r27
                r2 = r24
                goto L_0x0023
            L_0x0191:
                r3 = r9
                if (r8 != 0) goto L_0x0197
                r22 = 0
                goto L_0x0199
            L_0x0197:
                r22 = r3
            L_0x0199:
                q0.e r1 = new q0.e
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.e.a.b(q0.v):q0.e");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.e(timeUnit, "timeUnit");
        int i2 = Integer.MAX_VALUE;
        long j2 = (long) Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(j2);
        if (seconds <= j2) {
            i2 = (int) seconds;
        }
        a = new e(false, false, -1, -1, false, false, false, i2, -1, true, false, false, (String) null, (f) null);
    }

    public e(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str, f fVar) {
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i4;
        this.k = i5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = str;
    }

    public String toString() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("no-cache, ");
        }
        if (this.d) {
            sb.append("no-store, ");
        }
        if (this.e != -1) {
            sb.append("max-age=");
            sb.append(this.e);
            sb.append(", ");
        }
        if (this.f != -1) {
            sb.append("s-maxage=");
            sb.append(this.f);
            sb.append(", ");
        }
        if (this.g) {
            sb.append("private, ");
        }
        if (this.h) {
            sb.append("public, ");
        }
        if (this.i) {
            sb.append("must-revalidate, ");
        }
        if (this.j != -1) {
            sb.append("max-stale=");
            sb.append(this.j);
            sb.append(", ");
        }
        if (this.k != -1) {
            sb.append("min-fresh=");
            sb.append(this.k);
            sb.append(", ");
        }
        if (this.l) {
            sb.append("only-if-cached, ");
        }
        if (this.m) {
            sb.append("no-transform, ");
        }
        if (this.n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.o = sb2;
        return sb2;
    }
}
