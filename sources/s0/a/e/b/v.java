package s0.a.e.b;

import java.math.BigInteger;

public abstract class v {
    public static final int[] a = {13, 41, 121, 337, 897, 2305};
    public static final byte[] b = new byte[0];
    public static final int[] c = new int[0];
    public static final h[] d = new h[0];

    public static class a implements n {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        public o a(o oVar) {
            u uVar = oVar instanceof u ? (u) oVar : null;
            if (uVar == null || uVar.b != this.a) {
                u uVar2 = new u();
                uVar2.a = 0;
                uVar2.b = this.a;
                if (uVar != null) {
                    uVar2.c = uVar.c;
                    uVar2.d = uVar.d;
                    uVar2.e = uVar.e;
                    uVar2.f = uVar.f;
                }
                return uVar2;
            }
            uVar.a = 0;
            return uVar;
        }
    }

    public static class b implements n {
        public final /* synthetic */ int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ h c;
        public final /* synthetic */ e d;

        public b(int i, boolean z, h hVar, e eVar) {
            this.a = i;
            this.b = z;
            this.c = hVar;
            this.d = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
            if ((r6 != null && r6.length >= r4) != false) goto L_0x0044;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0107 A[LOOP:0: B:63:0x0105->B:64:0x0107, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public s0.a.e.b.o a(s0.a.e.b.o r14) {
            /*
                r13 = this;
                boolean r0 = r14 instanceof s0.a.e.b.u
                r1 = 0
                if (r0 == 0) goto L_0x0008
                s0.a.e.b.u r14 = (s0.a.e.b.u) r14
                goto L_0x0009
            L_0x0008:
                r14 = r1
            L_0x0009:
                int r0 = r13.a
                r2 = 16
                int r0 = java.lang.Math.min(r2, r0)
                r3 = 2
                int r0 = java.lang.Math.max(r3, r0)
                int r4 = r0 + -2
                r5 = 1
                int r4 = r5 << r4
                boolean r6 = r13.b
                r7 = 0
                if (r14 == 0) goto L_0x0046
                int r8 = r14.f
                int r9 = r14.b
                int r9 = java.lang.Math.max(r9, r0)
                if (r8 < r9) goto L_0x0046
                s0.a.e.b.h[] r8 = r14.c
                if (r8 == 0) goto L_0x0033
                int r8 = r8.length
                if (r8 < r4) goto L_0x0033
                r8 = r5
                goto L_0x0034
            L_0x0033:
                r8 = r7
            L_0x0034:
                if (r8 == 0) goto L_0x0046
                if (r6 == 0) goto L_0x0044
                s0.a.e.b.h[] r6 = r14.d
                if (r6 == 0) goto L_0x0041
                int r6 = r6.length
                if (r6 < r4) goto L_0x0041
                r4 = r5
                goto L_0x0042
            L_0x0041:
                r4 = r7
            L_0x0042:
                if (r4 == 0) goto L_0x0046
            L_0x0044:
                r4 = r5
                goto L_0x0047
            L_0x0046:
                r4 = r7
            L_0x0047:
                if (r4 == 0) goto L_0x004d
                r14.a()
                return r14
            L_0x004d:
                s0.a.e.b.u r4 = new s0.a.e.b.u
                r4.<init>()
                if (r14 == 0) goto L_0x0065
                int r6 = r14.a()
                r4.a = r6
                int r6 = r14.b
                r4.b = r6
                s0.a.e.b.h[] r6 = r14.c
                s0.a.e.b.h[] r8 = r14.d
                s0.a.e.b.h r14 = r14.e
                goto L_0x0068
            L_0x0065:
                r14 = r1
                r6 = r14
                r8 = r6
            L_0x0068:
                int r9 = r4.b
                int r0 = java.lang.Math.max(r9, r0)
                int r0 = java.lang.Math.min(r2, r0)
                int r2 = r0 + -2
                int r2 = r5 << r2
                if (r6 != 0) goto L_0x007c
                s0.a.e.b.h[] r6 = s0.a.e.b.v.d
                r9 = r7
                goto L_0x007d
            L_0x007c:
                int r9 = r6.length
            L_0x007d:
                if (r9 >= r2) goto L_0x0119
                s0.a.e.b.h[] r10 = new s0.a.e.b.h[r2]
                int r11 = r6.length
                java.lang.System.arraycopy(r6, r7, r10, r7, r11)
                if (r2 != r5) goto L_0x0091
                s0.a.e.b.h r1 = r13.c
                s0.a.e.b.h r1 = r1.q()
                r10[r7] = r1
                goto L_0x0118
            L_0x0091:
                if (r9 != 0) goto L_0x0099
                s0.a.e.b.h r6 = r13.c
                r10[r7] = r6
                r6 = r5
                goto L_0x009a
            L_0x0099:
                r6 = r9
            L_0x009a:
                if (r2 != r3) goto L_0x00a6
                s0.a.e.b.h r3 = r13.c
                s0.a.e.b.h r3 = r3.x()
                r10[r5] = r3
                goto L_0x0111
            L_0x00a6:
                int r5 = r6 + -1
                r5 = r10[r5]
                if (r14 != 0) goto L_0x0104
                r14 = r10[r7]
                s0.a.e.b.h r14 = r14.z()
                boolean r11 = r14.m()
                if (r11 != 0) goto L_0x0104
                s0.a.e.b.e r11 = r13.d
                boolean r11 = m0.r.t.a.r.m.a1.a.v2(r11)
                if (r11 == 0) goto L_0x0104
                s0.a.e.b.e r11 = r13.d
                int r11 = r11.l()
                r12 = 64
                if (r11 < r12) goto L_0x0104
                s0.a.e.b.e r11 = r13.d
                int r11 = r11.f
                if (r11 == r3) goto L_0x00d7
                r3 = 3
                if (r11 == r3) goto L_0x00d7
                r3 = 4
                if (r11 == r3) goto L_0x00d7
                goto L_0x0104
            L_0x00d7:
                s0.a.e.b.g r1 = r14.k(r7)
                s0.a.e.b.e r3 = r13.d
                s0.a.e.b.g r11 = r14.c
                java.math.BigInteger r11 = r11.t()
                s0.a.e.b.g r12 = r14.j()
                java.math.BigInteger r12 = r12.t()
                s0.a.e.b.h r3 = r3.e(r11, r12)
                s0.a.e.b.g r11 = r1.o()
                s0.a.e.b.g r12 = r11.j(r1)
                s0.a.e.b.h r5 = r5.u(r11)
                s0.a.e.b.h r5 = r5.v(r12)
                if (r9 != 0) goto L_0x0105
                r10[r7] = r5
                goto L_0x0105
            L_0x0104:
                r3 = r14
            L_0x0105:
                if (r6 >= r2) goto L_0x0111
                int r11 = r6 + 1
                s0.a.e.b.h r5 = r5.a(r3)
                r10[r6] = r5
                r6 = r11
                goto L_0x0105
            L_0x0111:
                s0.a.e.b.e r3 = r13.d
                int r5 = r2 - r9
                r3.q(r10, r9, r5, r1)
            L_0x0118:
                r6 = r10
            L_0x0119:
                boolean r1 = r13.b
                if (r1 == 0) goto L_0x013d
                if (r8 != 0) goto L_0x0123
                s0.a.e.b.h[] r1 = new s0.a.e.b.h[r2]
                r8 = r1
                goto L_0x0130
            L_0x0123:
                int r1 = r8.length
                if (r1 >= r2) goto L_0x012f
                s0.a.e.b.h[] r3 = new s0.a.e.b.h[r2]
                int r5 = r8.length
                java.lang.System.arraycopy(r8, r7, r3, r7, r5)
                r7 = r1
                r8 = r3
                goto L_0x0130
            L_0x012f:
                r7 = r1
            L_0x0130:
                if (r7 >= r2) goto L_0x013d
                r1 = r6[r7]
                s0.a.e.b.h r1 = r1.p()
                r8[r7] = r1
                int r7 = r7 + 1
                goto L_0x0130
            L_0x013d:
                r4.c = r6
                r4.d = r8
                r4.e = r14
                r4.f = r0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.v.b.a(s0.a.e.b.o):s0.a.e.b.o");
        }
    }

    public static void a(h hVar) {
        e eVar = hVar.b;
        if (eVar != null) {
            BigInteger bigInteger = eVar.d;
            eVar.r(hVar, "bc_wnaf", new a(Math.min(16, e(bigInteger == null ? eVar.l() + 1 : bigInteger.bitLength(), a, 16) + 3)));
        }
    }

    public static byte[] b(int i, BigInteger bigInteger) {
        if (i == 2) {
            if (bigInteger.signum() == 0) {
                return b;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength() - 1;
            byte[] bArr = new byte[bitLength];
            BigInteger xor = add.xor(bigInteger);
            int i2 = 1;
            while (i2 < bitLength) {
                if (xor.testBit(i2)) {
                    bArr[i2 - 1] = (byte) (bigInteger.testBit(i2) ? -1 : 1);
                    i2++;
                }
                i2++;
            }
            bArr[bitLength - 1] = 1;
            return bArr;
        } else if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (bigInteger.signum() == 0) {
            return b;
        } else {
            int bitLength2 = bigInteger.bitLength() + 1;
            byte[] bArr2 = new byte[bitLength2];
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = i3 >>> 1;
            int i6 = 0;
            int i7 = 0;
            boolean z = false;
            while (i6 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i6) == z) {
                    i6++;
                } else {
                    bigInteger = bigInteger.shiftRight(i6);
                    int intValue = bigInteger.intValue() & i4;
                    if (z) {
                        intValue++;
                    }
                    z = (intValue & i5) != 0;
                    if (z) {
                        intValue -= i3;
                    }
                    if (i7 > 0) {
                        i6--;
                    }
                    int i8 = i7 + i6;
                    bArr2[i8] = (byte) intValue;
                    i7 = i8 + 1;
                    i6 = i;
                }
            }
            if (bitLength2 <= i7) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr3, 0, i7);
            return bArr3;
        }
    }

    public static int c(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static int d(int i, int i2) {
        return e(i, a, i2);
    }

    public static int e(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < iArr.length && i >= iArr[i3]) {
            i3++;
        }
        return Math.max(2, Math.min(i2, i3 + 2));
    }

    public static u f(h hVar, int i, boolean z) {
        e eVar = hVar.b;
        return (u) eVar.r(hVar, "bc_wnaf", new b(i, z, hVar, eVar));
    }
}
