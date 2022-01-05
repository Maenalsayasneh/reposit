package i0.l.a.i.a.h;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;
import java.math.BigDecimal;

/* compiled from: JSONParserBase */
public abstract class e {
    public static boolean[] a;
    public static boolean[] b;
    public static boolean[] c;
    public static boolean[] d;
    public static boolean[] e;
    public char f;
    public a g;
    public b h;
    public final a i = new a(15);
    public Object j;
    public String k;
    public int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    /* compiled from: JSONParserBase */
    public static class a {
        public char[] a;
        public int b = -1;

        public a(int i) {
            this.a = new char[i];
        }

        public void a(char c) {
            int i = this.b + 1;
            this.b = i;
            char[] cArr = this.a;
            if (cArr.length <= i) {
                char[] cArr2 = new char[((cArr.length * 2) + 1)];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.a = cArr2;
            }
            this.a[this.b] = c;
        }

        public String toString() {
            return new String(this.a, 0, this.b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        a = zArr;
        boolean[] zArr2 = new boolean[126];
        b = zArr2;
        boolean[] zArr3 = new boolean[126];
        c = zArr3;
        boolean[] zArr4 = new boolean[126];
        d = zArr4;
        boolean[] zArr5 = new boolean[126];
        e = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public e(int i2) {
        boolean z = true;
        this.n = (i2 & 4) > 0;
        this.o = (i2 & 2) > 0;
        this.p = (i2 & 1) > 0;
        this.t = (i2 & 8) > 0;
        this.v = (i2 & 16) > 0;
        this.m = (i2 & 32) > 0;
        this.q = (i2 & 64) > 0;
        this.u = (i2 & 128) > 0;
        this.r = (i2 & 768) != 768;
        this.s = (i2 & 512) != 0 ? false : z;
    }

    public void a() throws ParseException {
        int length = this.k.length();
        if (length != 1) {
            if (length != 2) {
                char charAt = this.k.charAt(0);
                char charAt2 = this.k.charAt(1);
                if (charAt == '-') {
                    char charAt3 = this.k.charAt(2);
                    if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
                        throw new ParseException(this.l, 6, this.k);
                    }
                } else if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                    throw new ParseException(this.l, 6, this.k);
                }
            } else if (this.k.equals("00")) {
                throw new ParseException(this.l, 6, this.k);
            }
        }
    }

    public Number b() throws ParseException {
        if (!this.m) {
            a();
        }
        try {
            if (!this.u) {
                return Float.valueOf(Float.parseFloat(this.k));
            }
            if (this.k.length() > 18) {
                return new BigDecimal(this.k);
            }
            return Double.valueOf(Double.parseDouble(this.k));
        } catch (NumberFormatException unused) {
            throw new ParseException(this.l, 1, this.k);
        }
    }

    public abstract void c() throws IOException;

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0341, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r0.l, 0, java.lang.Character.valueOf(r0.f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r0.l, 0, java.lang.Character.valueOf(r0.f));
     */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03ef A[LOOP:4: B:211:0x03eb->B:213:0x03ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x044c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(boolean[] r17) throws com.nimbusds.jose.shaded.json.parser.ParseException, java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
        L_0x0004:
            char r2 = r0.f
            r3 = 9
            if (r2 == r3) goto L_0x0538
            r4 = 10
            if (r2 == r4) goto L_0x0538
            r5 = 125(0x7d, float:1.75E-43)
            r6 = 44
            r7 = 32
            java.lang.String r8 = "EOF"
            r9 = 13
            java.lang.String r10 = "Internal Error"
            r11 = 91
            r12 = 58
            r13 = 93
            r14 = 1
            switch(r2) {
                case 13: goto L_0x0538;
                case 32: goto L_0x0538;
                case 34: goto L_0x0326;
                case 39: goto L_0x0326;
                case 45: goto L_0x0342;
                case 78: goto L_0x02db;
                case 91: goto L_0x023a;
                case 93: goto L_0x0333;
                case 102: goto L_0x0201;
                case 110: goto L_0x01c9;
                case 116: goto L_0x0190;
                case 123: goto L_0x0042;
                case 125: goto L_0x0333;
                default: goto L_0x0024;
            }
        L_0x0024:
            switch(r2) {
                case 48: goto L_0x0342;
                case 49: goto L_0x0342;
                case 50: goto L_0x0342;
                case 51: goto L_0x0342;
                case 52: goto L_0x0342;
                case 53: goto L_0x0342;
                case 54: goto L_0x0342;
                case 55: goto L_0x0342;
                case 56: goto L_0x0342;
                case 57: goto L_0x0342;
                case 58: goto L_0x0333;
                default: goto L_0x0027;
            }
        L_0x0027:
            r2 = r0
            i0.l.a.i.a.h.f r2 = (i0.l.a.i.a.h.f) r2
            int r3 = r2.l
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x052d
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r0.k
            return r1
        L_0x0042:
            i0.l.a.i.a.h.a r1 = r0.g
            java.util.Map r1 = r1.b()
            char r2 = r0.f
            r15 = 123(0x7b, float:1.72E-43)
            if (r2 != r15) goto L_0x018a
            i0.l.a.i.a.h.b r2 = r0.h
            i0.l.a.i.a.h.c r2 = (i0.l.a.i.a.h.c) r2
            java.util.Objects.requireNonNull(r2)
            r2 = 0
        L_0x0056:
            r16.c()
            char r10 = r0.f
            if (r10 == r3) goto L_0x0182
            if (r10 == r4) goto L_0x0182
            if (r10 == r9) goto L_0x0182
            if (r10 == r7) goto L_0x0182
            if (r10 == r6) goto L_0x016b
            if (r10 == r12) goto L_0x015c
            if (r10 == r11) goto L_0x015c
            if (r10 == r13) goto L_0x015c
            if (r10 == r15) goto L_0x015c
            if (r10 == r5) goto L_0x013b
            int r2 = r0.l
            r15 = 34
            if (r10 == r15) goto L_0x0098
            r15 = 39
            if (r10 != r15) goto L_0x007a
            goto L_0x0098
        L_0x007a:
            boolean[] r10 = c
            r15 = r0
            i0.l.a.i.a.h.f r15 = (i0.l.a.i.a.h.f) r15
            int r13 = r15.l
            r15.i(r10)
            int r10 = r15.l
            r15.k(r13, r10)
            boolean r10 = r0.o
            if (r10 == 0) goto L_0x008e
            goto L_0x009b
        L_0x008e:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            java.lang.String r3 = r0.k
            r1.<init>(r2, r14, r3)
            throw r1
        L_0x0098:
            r16.f()
        L_0x009b:
            java.lang.String r10 = r0.k
            i0.l.a.i.a.h.b r13 = r0.h
            i0.l.a.i.a.h.c r13 = (i0.l.a.i.a.h.c) r13
            java.util.Objects.requireNonNull(r13)
            r16.j()
            char r13 = r0.f
            if (r13 == r12) goto L_0x00ca
            r15 = 26
            if (r13 != r15) goto L_0x00ba
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            int r2 = r2 - r14
            r3 = 0
            r4 = 3
            r1.<init>(r2, r4, r3)
            throw r1
        L_0x00ba:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            int r2 = r2 - r14
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r4 = 0
            r1.<init>(r2, r4, r3)
            throw r1
        L_0x00ca:
            r13 = r0
            i0.l.a.i.a.h.g r13 = (i0.l.a.i.a.h.g) r13
            int r15 = r13.l
            int r15 = r15 + r14
            r13.l = r15
            int r12 = r13.w
            if (r15 >= r12) goto L_0x012c
            java.lang.String r12 = r13.x
            char r12 = r12.charAt(r15)
            r13.f = r12
            boolean[] r12 = d
            java.lang.Object r12 = r0.d(r12)
            java.lang.Object r12 = r1.put(r10, r12)
            if (r12 != 0) goto L_0x0125
            i0.l.a.i.a.h.b r2 = r0.h
            i0.l.a.i.a.h.c r2 = (i0.l.a.i.a.h.c) r2
            java.util.Objects.requireNonNull(r2)
            r16.j()
            char r2 = r0.f
            if (r2 != r5) goto L_0x0103
            r16.c()
            i0.l.a.i.a.h.b r2 = r0.h
            i0.l.a.i.a.h.c r2 = (i0.l.a.i.a.h.c) r2
            java.util.Objects.requireNonNull(r2)
            goto L_0x015b
        L_0x0103:
            r10 = 26
            if (r2 == r10) goto L_0x011a
            if (r2 != r6) goto L_0x010b
            goto L_0x0181
        L_0x010b:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            int r2 = r2 - r14
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.<init>(r2, r14, r3)
            throw r1
        L_0x011a:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            int r2 = r2 - r14
            r3 = 0
            r4 = 3
            r1.<init>(r2, r4, r3)
            throw r1
        L_0x0125:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            r3 = 5
            r1.<init>(r2, r3, r10)
            throw r1
        L_0x012c:
            r1 = 26
            r4 = 3
            r13.f = r1
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r13.l
            int r2 = r2 + -1
            r1.<init>(r2, r4, r8)
            throw r1
        L_0x013b:
            if (r2 == 0) goto L_0x0151
            boolean r2 = r0.q
            if (r2 == 0) goto L_0x0142
            goto L_0x0151
        L_0x0142:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r4 = 0
            r1.<init>(r2, r4, r3)
            throw r1
        L_0x0151:
            r16.c()
            i0.l.a.i.a.h.b r2 = r0.h
            i0.l.a.i.a.h.c r2 = (i0.l.a.i.a.h.c) r2
            java.util.Objects.requireNonNull(r2)
        L_0x015b:
            return r1
        L_0x015c:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r10 = 0
            r1.<init>(r2, r10, r3)
            throw r1
        L_0x016b:
            r10 = 0
            if (r2 == 0) goto L_0x0181
            boolean r2 = r0.q
            if (r2 == 0) goto L_0x0173
            goto L_0x0181
        L_0x0173:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.<init>(r2, r10, r3)
            throw r1
        L_0x0181:
            r2 = r14
        L_0x0182:
            r12 = 58
            r13 = 93
            r15 = 123(0x7b, float:1.72E-43)
            goto L_0x0056
        L_0x018a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r10)
            throw r1
        L_0x0190:
            r2 = r0
            i0.l.a.i.a.h.f r2 = (i0.l.a.i.a.h.f) r2
            int r3 = r2.l
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            java.lang.String r1 = r0.k
            java.lang.String r2 = "true"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01b1
            i0.l.a.i.a.h.b r1 = r0.h
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            return r2
        L_0x01b1:
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x01bf
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r0.k
            return r1
        L_0x01bf:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            java.lang.String r3 = r0.k
            r1.<init>(r2, r14, r3)
            throw r1
        L_0x01c9:
            r2 = r0
            i0.l.a.i.a.h.f r2 = (i0.l.a.i.a.h.f) r2
            int r3 = r2.l
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            java.lang.String r1 = r0.k
            java.lang.String r2 = "null"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01e9
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            return r1
        L_0x01e9:
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x01f7
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r0.k
            return r1
        L_0x01f7:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            java.lang.String r3 = r0.k
            r1.<init>(r2, r14, r3)
            throw r1
        L_0x0201:
            r2 = r0
            i0.l.a.i.a.h.f r2 = (i0.l.a.i.a.h.f) r2
            int r3 = r2.l
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            java.lang.String r1 = r0.k
            java.lang.String r2 = "false"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0222
            i0.l.a.i.a.h.b r1 = r0.h
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            return r2
        L_0x0222:
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x0230
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r0.k
            return r1
        L_0x0230:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            java.lang.String r3 = r0.k
            r1.<init>(r2, r14, r3)
            throw r1
        L_0x023a:
            i0.l.a.i.a.h.a r1 = r0.g
            java.util.List r1 = r1.a()
            char r2 = r0.f
            if (r2 != r11) goto L_0x02d5
            r16.c()
            i0.l.a.i.a.h.b r2 = r0.h
            i0.l.a.i.a.h.c r2 = (i0.l.a.i.a.h.c) r2
            java.util.Objects.requireNonNull(r2)
        L_0x024e:
            r2 = 0
        L_0x024f:
            char r10 = r0.f
            if (r10 == r3) goto L_0x02cc
            if (r10 == r4) goto L_0x02cc
            if (r10 == r9) goto L_0x02cc
            r11 = 26
            if (r10 == r11) goto L_0x02c2
            if (r10 == r7) goto L_0x02cc
            if (r10 == r6) goto L_0x02a3
            r11 = 58
            if (r10 == r11) goto L_0x0294
            r12 = 93
            if (r10 == r12) goto L_0x0273
            if (r10 == r5) goto L_0x0294
            boolean[] r2 = b
            java.lang.Object r2 = r0.d(r2)
            r1.add(r2)
            goto L_0x024e
        L_0x0273:
            if (r2 == 0) goto L_0x0289
            boolean r2 = r0.q
            if (r2 == 0) goto L_0x027a
            goto L_0x0289
        L_0x027a:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r4 = 0
            r1.<init>(r2, r4, r3)
            throw r1
        L_0x0289:
            r16.c()
            i0.l.a.i.a.h.b r2 = r0.h
            i0.l.a.i.a.h.c r2 = (i0.l.a.i.a.h.c) r2
            java.util.Objects.requireNonNull(r2)
            return r1
        L_0x0294:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r10 = 0
            r1.<init>(r2, r10, r3)
            throw r1
        L_0x02a3:
            r10 = 0
            r11 = 58
            r12 = 93
            if (r2 == 0) goto L_0x02bd
            boolean r2 = r0.q
            if (r2 == 0) goto L_0x02af
            goto L_0x02bd
        L_0x02af:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1.<init>(r2, r10, r3)
            throw r1
        L_0x02bd:
            r16.c()
            r2 = r14
            goto L_0x024f
        L_0x02c2:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            int r2 = r2 - r14
            r3 = 3
            r1.<init>(r2, r3, r8)
            throw r1
        L_0x02cc:
            r11 = 58
            r12 = 93
            r16.c()
            goto L_0x024f
        L_0x02d5:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r10)
            throw r1
        L_0x02db:
            r2 = r0
            i0.l.a.i.a.h.f r2 = (i0.l.a.i.a.h.f) r2
            int r3 = r2.l
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            boolean r1 = r0.n
            if (r1 == 0) goto L_0x031c
            java.lang.String r1 = r0.k
            java.lang.String r2 = "NaN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0304
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L_0x0304:
            boolean r1 = r0.o
            if (r1 == 0) goto L_0x0312
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r0.k
            return r1
        L_0x0312:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            java.lang.String r3 = r0.k
            r1.<init>(r2, r14, r3)
            throw r1
        L_0x031c:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            java.lang.String r3 = r0.k
            r1.<init>(r2, r14, r3)
            throw r1
        L_0x0326:
            r16.f()
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = r0.k
            return r1
        L_0x0333:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            char r3 = r0.f
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r4 = 0
            r1.<init>(r2, r4, r3)
            throw r1
        L_0x0342:
            r2 = r0
            i0.l.a.i.a.h.f r2 = (i0.l.a.i.a.h.f) r2
            int r3 = r2.l
            r2.c()
            r2.h()
            char r5 = r2.f
            r6 = 45
            r7 = 101(0x65, float:1.42E-43)
            r8 = 46
            r9 = 126(0x7e, float:1.77E-43)
            r10 = 69
            r11 = 48
            if (r5 == r8) goto L_0x0465
            if (r5 == r10) goto L_0x0465
            if (r5 == r7) goto L_0x0465
            r2.j()
            char r5 = r2.f
            if (r5 < 0) goto L_0x038c
            if (r5 >= r9) goto L_0x038c
            boolean r7 = r1[r5]
            if (r7 != 0) goto L_0x038c
            r7 = 26
            if (r5 == r7) goto L_0x038c
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            boolean r1 = r2.o
            if (r1 == 0) goto L_0x0382
            java.lang.String r1 = r2.k
            goto L_0x0521
        L_0x0382:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r3 = r2.l
            java.lang.String r2 = r2.k
            r1.<init>(r3, r14, r2)
            throw r1
        L_0x038c:
            int r1 = r2.l
            r2.k(r3, r1)
            java.lang.String r1 = r2.k
            int r3 = r1.length()
            r5 = 0
            char r7 = r1.charAt(r5)
            r5 = 6
            if (r7 != r6) goto L_0x03bb
            r6 = 20
            boolean r7 = r2.m
            if (r7 != 0) goto L_0x03b7
            r7 = 3
            if (r3 < r7) goto L_0x03b7
            char r7 = r1.charAt(r14)
            if (r7 == r11) goto L_0x03af
            goto L_0x03b7
        L_0x03af:
            com.nimbusds.jose.shaded.json.parser.ParseException r3 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r2.l
            r3.<init>(r2, r5, r1)
            throw r3
        L_0x03b7:
            r7 = r6
            r5 = r14
            r6 = 0
            goto L_0x03d7
        L_0x03bb:
            boolean r6 = r2.m
            if (r6 != 0) goto L_0x03d2
            r6 = 2
            if (r3 < r6) goto L_0x03d2
            r6 = 0
            char r7 = r1.charAt(r6)
            if (r7 == r11) goto L_0x03ca
            goto L_0x03d3
        L_0x03ca:
            com.nimbusds.jose.shaded.json.parser.ParseException r3 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r2.l
            r3.<init>(r2, r5, r1)
            throw r3
        L_0x03d2:
            r6 = 0
        L_0x03d3:
            r5 = 19
            r7 = r5
            r5 = r6
        L_0x03d7:
            if (r3 >= r7) goto L_0x03db
            r7 = r6
            goto L_0x03e8
        L_0x03db:
            if (r3 <= r7) goto L_0x03e5
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1, r4)
        L_0x03e2:
            r1 = r2
            goto L_0x0521
        L_0x03e5:
            int r3 = r3 + -1
            r7 = r14
        L_0x03e8:
            r8 = 0
            r10 = r5
        L_0x03eb:
            r12 = 10
            if (r10 >= r3) goto L_0x03fd
            long r8 = r8 * r12
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            int r10 = 48 - r10
            long r14 = (long) r10
            long r8 = r8 + r14
            r10 = r12
            r14 = 1
            goto L_0x03eb
        L_0x03fd:
            if (r7 == 0) goto L_0x0432
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x0409
            goto L_0x0421
        L_0x0409:
            if (r3 >= 0) goto L_0x040c
            goto L_0x041f
        L_0x040c:
            if (r5 == 0) goto L_0x0417
            char r3 = r1.charAt(r10)
            r7 = 56
            if (r3 <= r7) goto L_0x0421
            goto L_0x041f
        L_0x0417:
            char r3 = r1.charAt(r10)
            r7 = 55
            if (r3 <= r7) goto L_0x0421
        L_0x041f:
            r14 = 1
            goto L_0x0422
        L_0x0421:
            r14 = r6
        L_0x0422:
            if (r14 == 0) goto L_0x042a
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1, r4)
            goto L_0x03e2
        L_0x042a:
            long r8 = r8 * r12
            char r1 = r1.charAt(r10)
            int r11 = r11 - r1
            long r3 = (long) r11
            long r8 = r8 + r3
        L_0x0432:
            if (r5 == 0) goto L_0x044c
            boolean r1 = r2.v
            if (r1 == 0) goto L_0x0446
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0446
            int r1 = (int) r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0521
        L_0x0446:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            goto L_0x0521
        L_0x044c:
            long r3 = -r8
            boolean r1 = r2.v
            if (r1 == 0) goto L_0x045f
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x045f
            int r1 = (int) r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0521
        L_0x045f:
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0521
        L_0x0465:
            if (r5 != r8) goto L_0x046d
            r2.c()
            r2.h()
        L_0x046d:
            char r4 = r2.f
            if (r4 == r10) goto L_0x04aa
            if (r4 == r7) goto L_0x04aa
            r2.j()
            char r4 = r2.f
            if (r4 < 0) goto L_0x049f
            if (r4 >= r9) goto L_0x049f
            boolean r5 = r1[r4]
            if (r5 != 0) goto L_0x049f
            r5 = 26
            if (r4 == r5) goto L_0x049f
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            boolean r1 = r2.o
            if (r1 == 0) goto L_0x0494
            java.lang.String r1 = r2.k
            goto L_0x0521
        L_0x0494:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r3 = r2.l
            java.lang.String r2 = r2.k
            r4 = 1
            r1.<init>(r3, r4, r2)
            throw r1
        L_0x049f:
            int r1 = r2.l
            r2.k(r3, r1)
            java.lang.Number r1 = r2.b()
            goto L_0x0521
        L_0x04aa:
            i0.l.a.i.a.h.e$a r4 = r2.i
            r4.a(r10)
            r2.c()
            char r4 = r2.f
            r5 = 43
            if (r4 == r5) goto L_0x04e2
            if (r4 == r6) goto L_0x04e2
            if (r4 < r11) goto L_0x04c1
            r5 = 57
            if (r4 > r5) goto L_0x04c1
            goto L_0x04e2
        L_0x04c1:
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            boolean r1 = r2.o
            if (r1 == 0) goto L_0x04d7
            boolean r1 = r2.m
            if (r1 != 0) goto L_0x04d4
            r2.a()
        L_0x04d4:
            java.lang.String r1 = r2.k
            goto L_0x0521
        L_0x04d7:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r3 = r2.l
            java.lang.String r2 = r2.k
            r4 = 1
            r1.<init>(r3, r4, r2)
            throw r1
        L_0x04e2:
            i0.l.a.i.a.h.e$a r5 = r2.i
            r5.a(r4)
            r2.c()
            r2.h()
            r2.j()
            char r4 = r2.f
            if (r4 < 0) goto L_0x0518
            if (r4 >= r9) goto L_0x0518
            boolean r5 = r1[r4]
            if (r5 != 0) goto L_0x0518
            r5 = 26
            if (r4 == r5) goto L_0x0518
            r2.i(r1)
            int r1 = r2.l
            r2.k(r3, r1)
            boolean r1 = r2.o
            if (r1 == 0) goto L_0x050d
            java.lang.String r1 = r2.k
            goto L_0x0521
        L_0x050d:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r3 = r2.l
            java.lang.String r2 = r2.k
            r4 = 1
            r1.<init>(r3, r4, r2)
            throw r1
        L_0x0518:
            int r1 = r2.l
            r2.k(r3, r1)
            java.lang.Number r1 = r2.b()
        L_0x0521:
            r0.j = r1
            i0.l.a.i.a.h.b r1 = r0.h
            i0.l.a.i.a.h.c r1 = (i0.l.a.i.a.h.c) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r1 = r0.j
            return r1
        L_0x052d:
            com.nimbusds.jose.shaded.json.parser.ParseException r1 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r2 = r0.l
            java.lang.String r3 = r0.k
            r4 = 1
            r1.<init>(r2, r4, r3)
            throw r1
        L_0x0538:
            r16.c()
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.a.i.a.h.e.d(boolean[]):java.lang.Object");
    }

    public abstract void e() throws IOException;

    public abstract void f() throws ParseException, IOException;

    public char g(int i2) throws ParseException, IOException {
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i5 * 16;
            c();
            char c2 = this.f;
            if (c2 > '9' || c2 < '0') {
                if (c2 <= 'F' && c2 >= 'A') {
                    i3 = c2 - 'A';
                } else if (c2 >= 'a' && c2 <= 'f') {
                    i3 = c2 - 'a';
                } else if (c2 == 26) {
                    throw new ParseException(this.l, 3, "EOF");
                } else {
                    throw new ParseException(this.l, 4, Character.valueOf(this.f));
                }
                i4 = i3 + 10;
            } else {
                i4 = c2 - '0';
            }
            i5 = i4 + i7;
        }
        return (char) i5;
    }

    public void h() throws IOException {
        while (true) {
            char c2 = this.f;
            if (c2 >= '0' && c2 <= '9') {
                e();
            } else {
                return;
            }
        }
    }

    public void i(boolean[] zArr) throws IOException {
        while (true) {
            char c2 = this.f;
            if (c2 == 26) {
                return;
            }
            if (c2 < 0 || c2 >= '~' || !zArr[c2]) {
                e();
            } else {
                return;
            }
        }
    }

    public void j() throws IOException {
        while (true) {
            char c2 = this.f;
            if (c2 <= ' ' && c2 != 26) {
                e();
            } else {
                return;
            }
        }
    }
}
