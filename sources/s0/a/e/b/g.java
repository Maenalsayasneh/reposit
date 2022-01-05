package s0.a.e.b;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import s0.a.e.b.b0.c.g1;
import s0.a.e.b.b0.c.h3;

public abstract class g implements c {

    public static abstract class a extends g {
        public g u() {
            int f = f();
            if ((f & 1) != 0) {
                int i = (f + 1) >>> 1;
                int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
                g gVar = this;
                int i2 = 1;
                while (numberOfLeadingZeros > 0) {
                    gVar = gVar.q(i2 << 1).a(gVar);
                    numberOfLeadingZeros--;
                    i2 = i >>> numberOfLeadingZeros;
                    if ((i2 & 1) != 0) {
                        gVar = gVar.q(2).a(this);
                    }
                }
                return gVar;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }

        public boolean v() {
            return this instanceof g1;
        }

        public int w() {
            int f = f();
            int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(f);
            g gVar = this;
            int i = 1;
            while (numberOfLeadingZeros > 0) {
                gVar = gVar.q(i).a(gVar);
                numberOfLeadingZeros--;
                i = f >>> numberOfLeadingZeros;
                if ((i & 1) != 0) {
                    gVar = gVar.o().a(this);
                }
            }
            if (gVar.i()) {
                return 0;
            }
            if (gVar.h()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    public static abstract class b extends g {
    }

    public static class c extends a {
        public int g;
        public int h;
        public int[] i;
        public m j;

        public c(int i2, int i3, int i4, int i5, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i2) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i4 == 0 && i5 == 0) {
                this.g = 2;
                this.i = new int[]{i3};
            } else if (i4 >= i5) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else if (i4 > 0) {
                this.g = 3;
                this.i = new int[]{i3, i4, i5};
            } else {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.h = i2;
            this.j = new m(bigInteger);
        }

        public c(int i2, int[] iArr, m mVar) {
            this.h = i2;
            this.g = iArr.length == 1 ? 2 : 3;
            this.i = iArr;
            this.j = mVar;
        }

        public g a(g gVar) {
            m mVar = (m) this.j.clone();
            mVar.f(((c) gVar).j, 0);
            return new c(this.h, this.i, mVar);
        }

        public g b() {
            m mVar;
            int i2 = this.h;
            int[] iArr = this.i;
            m mVar2 = this.j;
            if (mVar2.q.length == 0) {
                mVar = new m(new long[]{1});
            } else {
                int max = Math.max(1, mVar2.o());
                long[] jArr = new long[max];
                long[] jArr2 = mVar2.q;
                System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, max));
                jArr[0] = jArr[0] ^ 1;
                mVar = new m(jArr);
            }
            return new c(i2, iArr, mVar);
        }

        public int c() {
            return this.j.i();
        }

        public g d(g gVar) {
            return j(gVar.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.h != cVar.h || this.g != cVar.g || !Arrays.equals(this.i, cVar.i) || !this.j.equals(cVar.j)) {
                return false;
            }
            return true;
        }

        public int f() {
            return this.h;
        }

        public g g() {
            int i2;
            int i3 = this.h;
            int[] iArr = this.i;
            m mVar = this.j;
            int i4 = mVar.i();
            if (i4 != 0) {
                int i5 = 1;
                if (i4 != 1) {
                    int i6 = (i3 + 63) >>> 6;
                    m mVar2 = new m(i6);
                    m.v(mVar2.q, 0, i3, i3, iArr);
                    m mVar3 = new m(i6);
                    mVar3.q[0] = 1;
                    m mVar4 = new m(i6);
                    int[] iArr2 = {i4, i3 + 1};
                    m[] mVarArr = {(m) mVar.clone(), mVar2};
                    int[] iArr3 = {1, 0};
                    m[] mVarArr2 = {mVar3, mVar4};
                    int i7 = iArr2[1];
                    int i8 = iArr3[1];
                    int i9 = i7 - iArr2[0];
                    while (true) {
                        if (i9 < 0) {
                            i9 = -i9;
                            iArr2[i5] = i7;
                            iArr3[i5] = i8;
                            i5 = 1 - i5;
                            i7 = iArr2[i5];
                            i8 = iArr3[i5];
                        }
                        i2 = 1 - i5;
                        mVarArr[i5].e(mVarArr[i2], iArr2[i2], i9);
                        int j2 = mVarArr[i5].j(i7);
                        if (j2 == 0) {
                            break;
                        }
                        int i10 = iArr3[i2];
                        mVarArr2[i5].e(mVarArr2[i2], i10, i9);
                        int i11 = i10 + i9;
                        if (i11 > i8) {
                            i8 = i11;
                        } else if (i11 == i8) {
                            i8 = mVarArr2[i5].j(i8);
                        }
                        i9 += j2 - i7;
                        i7 = j2;
                    }
                    mVar = mVarArr2[i2];
                }
                return new c(i3, iArr, mVar);
            }
            throw new IllegalStateException();
        }

        public boolean h() {
            return this.j.q();
        }

        public int hashCode() {
            return (this.j.hashCode() ^ this.h) ^ h3.n1(this.i);
        }

        public boolean i() {
            return this.j.r();
        }

        public g j(g gVar) {
            long[] jArr;
            int i2;
            int i3 = this.h;
            int[] iArr = this.i;
            m mVar = this.j;
            m mVar2 = ((c) gVar).j;
            int i4 = mVar.i();
            if (i4 != 0) {
                int i5 = mVar2.i();
                if (i5 != 0) {
                    if (i4 > i5) {
                        int i6 = i5;
                        i5 = i4;
                        i4 = i6;
                    } else {
                        m mVar3 = mVar2;
                        mVar2 = mVar;
                        mVar = mVar3;
                    }
                    int i7 = (i4 + 63) >>> 6;
                    int i8 = (i5 + 63) >>> 6;
                    int i9 = ((i4 + i5) + 62) >>> 6;
                    if (i7 == 1) {
                        long j2 = mVar2.q[0];
                        if (j2 != 1) {
                            long[] jArr2 = new long[i9];
                            m.t(j2, mVar.q, i8, jArr2, 0);
                            mVar = new m(jArr2, 0, m.w(jArr2, 0, i9, i3, iArr));
                        }
                    } else {
                        int i10 = ((i5 + 7) + 63) >>> 6;
                        int[] iArr2 = new int[16];
                        int i11 = i10 << 4;
                        long[] jArr3 = new long[i11];
                        iArr2[1] = i10;
                        System.arraycopy(mVar.q, 0, jArr3, i10, i8);
                        int i12 = 2;
                        int i13 = i10;
                        for (int i14 = 16; i12 < i14; i14 = 16) {
                            i13 += i10;
                            iArr2[i12] = i13;
                            if ((i12 & 1) == 0) {
                                jArr = jArr3;
                                i2 = i11;
                                m.x(jArr3, i13 >>> 1, jArr, i13, i10, 1);
                            } else {
                                jArr = jArr3;
                                i2 = i11;
                                m.c(jArr3, i10, jArr, i13 - i10, jArr, i13, i10);
                            }
                            i12++;
                            i11 = i2;
                            jArr3 = jArr;
                        }
                        long[] jArr4 = jArr3;
                        int i15 = i11;
                        long[] jArr5 = new long[i15];
                        m.x(jArr3, 0, jArr5, 0, i15, 4);
                        long[] jArr6 = mVar2.q;
                        int i16 = i9 << 3;
                        long[] jArr7 = new long[i16];
                        int i17 = 0;
                        while (i17 < i7) {
                            long j3 = jArr6[i17];
                            int i18 = i17;
                            while (true) {
                                long j4 = j3 >>> 4;
                                m.d(jArr7, i18, jArr4, iArr2[((int) j3) & 15], jArr5, iArr2[((int) j4) & 15], i10);
                                j3 = j4 >>> 4;
                                if (j3 == 0) {
                                    break;
                                }
                                i18 += i9;
                            }
                            i17++;
                        }
                        while (true) {
                            i16 -= i9;
                            if (i16 == 0) {
                                break;
                            }
                            m.g(jArr7, i16 - i9, jArr7, i16, i9, 8);
                        }
                        mVar2 = new m(jArr7, 0, m.w(jArr7, 0, i9, i3, iArr));
                    }
                }
                mVar = mVar2;
            }
            return new c(i3, iArr, mVar);
        }

        public g k(g gVar, g gVar2, g gVar3) {
            return l(gVar, gVar2, gVar3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: s0.a.e.b.m} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public s0.a.e.b.g l(s0.a.e.b.g r3, s0.a.e.b.g r4, s0.a.e.b.g r5) {
            /*
                r2 = this;
                s0.a.e.b.m r0 = r2.j
                s0.a.e.b.g$c r3 = (s0.a.e.b.g.c) r3
                s0.a.e.b.m r3 = r3.j
                s0.a.e.b.g$c r4 = (s0.a.e.b.g.c) r4
                s0.a.e.b.m r4 = r4.j
                s0.a.e.b.g$c r5 = (s0.a.e.b.g.c) r5
                s0.a.e.b.m r5 = r5.j
                s0.a.e.b.m r1 = r0.s(r3)
                s0.a.e.b.m r4 = r4.s(r5)
                if (r1 == r0) goto L_0x001a
                if (r1 != r3) goto L_0x0021
            L_0x001a:
                java.lang.Object r3 = r1.clone()
                r1 = r3
                s0.a.e.b.m r1 = (s0.a.e.b.m) r1
            L_0x0021:
                r3 = 0
                r1.f(r4, r3)
                int r3 = r2.h
                int[] r4 = r2.i
                r1.u(r3, r4)
                s0.a.e.b.g$c r3 = new s0.a.e.b.g$c
                int r4 = r2.h
                int[] r5 = r2.i
                r3.<init>(r4, r5, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.g.c.l(s0.a.e.b.g, s0.a.e.b.g, s0.a.e.b.g):s0.a.e.b.g");
        }

        public g m() {
            return this;
        }

        public g n() {
            return (this.j.r() || this.j.q()) ? this : q(this.h - 1);
        }

        public g o() {
            int i2 = this.h;
            int[] iArr = this.i;
            m mVar = this.j;
            int o = mVar.o();
            if (o != 0) {
                int i3 = o << 1;
                long[] jArr = new long[i3];
                int i4 = 0;
                while (i4 < i3) {
                    long j2 = mVar.q[i4 >>> 1];
                    int i5 = i4 + 1;
                    jArr[i4] = m.p((int) j2);
                    i4 = i5 + 1;
                    jArr[i5] = m.p((int) (j2 >>> 32));
                }
                mVar = new m(jArr, 0, m.w(jArr, 0, i3, i2, iArr));
            }
            return new c(i2, iArr, mVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: s0.a.e.b.m} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public s0.a.e.b.g p(s0.a.e.b.g r11, s0.a.e.b.g r12) {
            /*
                r10 = this;
                s0.a.e.b.m r0 = r10.j
                s0.a.e.b.g$c r11 = (s0.a.e.b.g.c) r11
                s0.a.e.b.m r11 = r11.j
                s0.a.e.b.g$c r12 = (s0.a.e.b.g.c) r12
                s0.a.e.b.m r12 = r12.j
                int r1 = r0.o()
                r2 = 0
                if (r1 != 0) goto L_0x0013
                r4 = r0
                goto L_0x003b
            L_0x0013:
                int r1 = r1 << 1
                long[] r3 = new long[r1]
                r4 = r2
            L_0x0018:
                if (r4 >= r1) goto L_0x0036
                long[] r5 = r0.q
                int r6 = r4 >>> 1
                r6 = r5[r6]
                int r5 = r4 + 1
                int r8 = (int) r6
                long r8 = s0.a.e.b.m.p(r8)
                r3[r4] = r8
                int r4 = r5 + 1
                r8 = 32
                long r6 = r6 >>> r8
                int r6 = (int) r6
                long r6 = s0.a.e.b.m.p(r6)
                r3[r5] = r6
                goto L_0x0018
            L_0x0036:
                s0.a.e.b.m r4 = new s0.a.e.b.m
                r4.<init>(r3, r2, r1)
            L_0x003b:
                s0.a.e.b.m r11 = r11.s(r12)
                if (r4 != r0) goto L_0x0048
                java.lang.Object r12 = r4.clone()
                r4 = r12
                s0.a.e.b.m r4 = (s0.a.e.b.m) r4
            L_0x0048:
                r4.f(r11, r2)
                int r11 = r10.h
                int[] r12 = r10.i
                r4.u(r11, r12)
                s0.a.e.b.g$c r11 = new s0.a.e.b.g$c
                int r12 = r10.h
                int[] r0 = r10.i
                r11.<init>(r12, r0, r4)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.g.c.p(s0.a.e.b.g, s0.a.e.b.g):s0.a.e.b.g");
        }

        public g q(int i2) {
            if (i2 < 1) {
                return this;
            }
            int i3 = this.h;
            int[] iArr = this.i;
            m mVar = this.j;
            int o = mVar.o();
            if (o != 0) {
                int i4 = ((i3 + 63) >>> 6) << 1;
                long[] jArr = new long[i4];
                System.arraycopy(mVar.q, 0, jArr, 0, o);
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                    int i5 = o << 1;
                    while (true) {
                        o--;
                        if (o < 0) {
                            break;
                        }
                        long j2 = jArr[o];
                        int i6 = i5 - 1;
                        jArr[i6] = m.p((int) (j2 >>> 32));
                        i5 = i6 - 1;
                        jArr[i5] = m.p((int) j2);
                    }
                    o = m.w(jArr, 0, i4, i3, iArr);
                }
                mVar = new m(jArr, 0, o);
            }
            return new c(i3, iArr, mVar);
        }

        public g r(g gVar) {
            return a(gVar);
        }

        public boolean s() {
            long[] jArr = this.j.q;
            return jArr.length > 0 && (1 & jArr[0]) != 0;
        }

        public BigInteger t() {
            m mVar = this.j;
            int o = mVar.o();
            if (o == 0) {
                return c.a;
            }
            int i2 = o - 1;
            long j2 = mVar.q[i2];
            byte[] bArr = new byte[8];
            int i3 = 0;
            boolean z = false;
            for (int i4 = 7; i4 >= 0; i4--) {
                byte b = (byte) ((int) (j2 >>> (i4 * 8)));
                if (z || b != 0) {
                    bArr[i3] = b;
                    i3++;
                    z = true;
                }
            }
            byte[] bArr2 = new byte[((i2 * 8) + i3)];
            for (int i5 = 0; i5 < i3; i5++) {
                bArr2[i5] = bArr[i5];
            }
            for (int i6 = o - 2; i6 >= 0; i6--) {
                long j3 = mVar.q[i6];
                int i7 = 7;
                while (i7 >= 0) {
                    bArr2[i3] = (byte) ((int) (j3 >>> (i7 * 8)));
                    i7--;
                    i3++;
                }
            }
            return new BigInteger(1, bArr2);
        }
    }

    public static class d extends b {
        public static final /* synthetic */ int g = 0;
        public BigInteger h;
        public BigInteger i;
        public BigInteger j;

        public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.h = bigInteger;
            this.i = bigInteger2;
            this.j = bigInteger3;
        }

        public g a(g gVar) {
            BigInteger bigInteger = this.h;
            BigInteger bigInteger2 = this.i;
            BigInteger add = this.j.add(gVar.t());
            if (add.compareTo(this.h) >= 0) {
                add = add.subtract(this.h);
            }
            return new d(bigInteger, bigInteger2, add);
        }

        public g b() {
            BigInteger add = this.j.add(c.b);
            if (add.compareTo(this.h) == 0) {
                add = c.a;
            }
            return new d(this.h, this.i, add);
        }

        public g d(g gVar) {
            return new d(this.h, this.i, x(this.j.multiply(s0.a.g.b.j(this.h, gVar.t()))));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.h.equals(dVar.h) && this.j.equals(dVar.j);
        }

        public int f() {
            return this.h.bitLength();
        }

        public g g() {
            BigInteger bigInteger = this.h;
            return new d(bigInteger, this.i, s0.a.g.b.j(bigInteger, this.j));
        }

        public int hashCode() {
            return this.h.hashCode() ^ this.j.hashCode();
        }

        public g j(g gVar) {
            return new d(this.h, this.i, w(this.j, gVar.t()));
        }

        public g k(g gVar, g gVar2, g gVar3) {
            BigInteger bigInteger = this.j;
            BigInteger t = gVar.t();
            BigInteger t2 = gVar2.t();
            BigInteger t3 = gVar3.t();
            return new d(this.h, this.i, x(bigInteger.multiply(t).subtract(t2.multiply(t3))));
        }

        public g l(g gVar, g gVar2, g gVar3) {
            BigInteger bigInteger = this.j;
            BigInteger t = gVar.t();
            BigInteger t2 = gVar2.t();
            BigInteger t3 = gVar3.t();
            return new d(this.h, this.i, x(bigInteger.multiply(t).add(t2.multiply(t3))));
        }

        public g m() {
            if (this.j.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.h;
            return new d(bigInteger, this.i, bigInteger.subtract(this.j));
        }

        public g n() {
            BigInteger bigInteger;
            if (i() || h()) {
                return this;
            }
            boolean z = false;
            if (this.h.testBit(0)) {
                int i2 = 1;
                if (this.h.testBit(1)) {
                    BigInteger add = this.h.shiftRight(2).add(c.b);
                    BigInteger bigInteger2 = this.h;
                    return u(new d(bigInteger2, this.i, this.j.modPow(add, bigInteger2)));
                } else if (this.h.testBit(2)) {
                    BigInteger modPow = this.j.modPow(this.h.shiftRight(3), this.h);
                    BigInteger w = w(modPow, this.j);
                    if (w(w, modPow).equals(c.b)) {
                        return u(new d(this.h, this.i, w));
                    }
                    return u(new d(this.h, this.i, w(w, c.c.modPow(this.h.shiftRight(2), this.h))));
                } else {
                    BigInteger shiftRight = this.h.shiftRight(1);
                    BigInteger modPow2 = this.j.modPow(shiftRight, this.h);
                    BigInteger bigInteger3 = c.b;
                    Object obj = null;
                    if (!modPow2.equals(bigInteger3)) {
                        return null;
                    }
                    BigInteger bigInteger4 = this.j;
                    BigInteger v = v(v(bigInteger4));
                    BigInteger add2 = shiftRight.add(bigInteger3);
                    BigInteger subtract = this.h.subtract(bigInteger3);
                    Random random = new Random();
                    while (true) {
                        BigInteger bigInteger5 = new BigInteger(this.h.bitLength(), random);
                        if (bigInteger5.compareTo(this.h) >= 0 || !x(bigInteger5.multiply(bigInteger5).subtract(v)).modPow(shiftRight, this.h).equals(subtract)) {
                            boolean z2 = z;
                            Object obj2 = obj;
                            z = z2;
                        } else {
                            int bitLength = add2.bitLength();
                            int lowestSetBit = add2.getLowestSetBit();
                            BigInteger bigInteger6 = c.b;
                            int i3 = bitLength - i2;
                            BigInteger bigInteger7 = bigInteger5;
                            BigInteger bigInteger8 = bigInteger6;
                            BigInteger bigInteger9 = c.c;
                            BigInteger bigInteger10 = bigInteger8;
                            while (i3 >= lowestSetBit + 1) {
                                bigInteger6 = w(bigInteger6, bigInteger10);
                                if (add2.testBit(i3)) {
                                    BigInteger x = x(bigInteger6.multiply(bigInteger4));
                                    bigInteger8 = w(bigInteger8, bigInteger7);
                                    bigInteger9 = x(bigInteger7.multiply(bigInteger9).subtract(bigInteger5.multiply(bigInteger6)));
                                    bigInteger = shiftRight;
                                    bigInteger7 = x(bigInteger7.multiply(bigInteger7).subtract(x.shiftLeft(1)));
                                    bigInteger10 = x;
                                } else {
                                    bigInteger = shiftRight;
                                    BigInteger x2 = x(bigInteger8.multiply(bigInteger9).subtract(bigInteger6));
                                    BigInteger x3 = x(bigInteger7.multiply(bigInteger9).subtract(bigInteger5.multiply(bigInteger6)));
                                    bigInteger9 = x(bigInteger9.multiply(bigInteger9).subtract(bigInteger6.shiftLeft(1)));
                                    bigInteger8 = x2;
                                    bigInteger7 = x3;
                                    bigInteger10 = bigInteger6;
                                }
                                i3--;
                                shiftRight = bigInteger;
                            }
                            BigInteger bigInteger11 = shiftRight;
                            BigInteger w2 = w(bigInteger6, bigInteger10);
                            BigInteger x4 = x(w2.multiply(bigInteger4));
                            BigInteger x5 = x(bigInteger8.multiply(bigInteger9).subtract(w2));
                            BigInteger x6 = x(bigInteger7.multiply(bigInteger9).subtract(bigInteger5.multiply(w2)));
                            BigInteger w3 = w(w2, x4);
                            for (int i4 = 1; i4 <= lowestSetBit; i4++) {
                                x5 = w(x5, x6);
                                x6 = x(x6.multiply(x6).subtract(w3.shiftLeft(1)));
                                w3 = x(w3.multiply(w3));
                            }
                            BigInteger[] bigIntegerArr = {x5, x6};
                            BigInteger bigInteger12 = bigIntegerArr[0];
                            BigInteger bigInteger13 = bigIntegerArr[1];
                            if (w(bigInteger13, bigInteger13).equals(v)) {
                                BigInteger bigInteger14 = this.h;
                                BigInteger bigInteger15 = this.i;
                                if (bigInteger13.testBit(0)) {
                                    bigInteger13 = this.h.subtract(bigInteger13);
                                }
                                return new d(bigInteger14, bigInteger15, bigInteger13.shiftRight(1));
                            } else if (!bigInteger12.equals(c.b) && !bigInteger12.equals(subtract)) {
                                return null;
                            } else {
                                i2 = 1;
                                z = false;
                                shiftRight = bigInteger11;
                                obj = null;
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("not done yet");
            }
        }

        public g o() {
            BigInteger bigInteger = this.h;
            BigInteger bigInteger2 = this.i;
            BigInteger bigInteger3 = this.j;
            return new d(bigInteger, bigInteger2, w(bigInteger3, bigInteger3));
        }

        public g p(g gVar, g gVar2) {
            BigInteger bigInteger = this.j;
            BigInteger t = gVar.t();
            BigInteger t2 = gVar2.t();
            return new d(this.h, this.i, x(bigInteger.multiply(bigInteger).add(t.multiply(t2))));
        }

        public g r(g gVar) {
            BigInteger bigInteger = this.h;
            BigInteger bigInteger2 = this.i;
            BigInteger subtract = this.j.subtract(gVar.t());
            if (subtract.signum() < 0) {
                subtract = subtract.add(this.h);
            }
            return new d(bigInteger, bigInteger2, subtract);
        }

        public BigInteger t() {
            return this.j;
        }

        public final g u(g gVar) {
            if (gVar.o().equals(this)) {
                return gVar;
            }
            return null;
        }

        public BigInteger v(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.h) >= 0 ? shiftLeft.subtract(this.h) : shiftLeft;
        }

        public BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
            return x(bigInteger.multiply(bigInteger2));
        }

        public BigInteger x(BigInteger bigInteger) {
            if (this.i == null) {
                return bigInteger.mod(this.h);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.h.bitLength();
            boolean equals = this.i.equals(c.b);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.i);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.h) >= 0) {
                bigInteger = bigInteger.subtract(this.h);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.h.subtract(bigInteger);
        }
    }

    public abstract g a(g gVar);

    public abstract g b();

    public int c() {
        return t().bitLength();
    }

    public abstract g d(g gVar);

    public byte[] e() {
        return s0.a.g.b.b((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract g g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return t().signum() == 0;
    }

    public abstract g j(g gVar);

    public g k(g gVar, g gVar2, g gVar3) {
        return j(gVar).r(gVar2.j(gVar3));
    }

    public g l(g gVar, g gVar2, g gVar3) {
        return j(gVar).a(gVar2.j(gVar3));
    }

    public abstract g m();

    public abstract g n();

    public abstract g o();

    public g p(g gVar, g gVar2) {
        return o().a(gVar.j(gVar2));
    }

    public g q(int i) {
        g gVar = this;
        for (int i2 = 0; i2 < i; i2++) {
            gVar = gVar.o();
        }
        return gVar;
    }

    public abstract g r(g gVar);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public String toString() {
        return t().toString(16);
    }
}
