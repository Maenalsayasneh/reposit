package s0.a.b.k0;

import java.math.BigInteger;

public class j extends e {
    public static final BigInteger q = BigInteger.valueOf(1);
    public static final BigInteger x = BigInteger.valueOf(2);
    public BigInteger y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (1 == (s0.a.e.b.b0.c.h3.I1(r1, r15) ? 1 - (r4 & 2) : r0)) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (q.equals(r14.modPow(r15, r1)) != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(java.math.BigInteger r14, s0.a.b.k0.h r15) {
        /*
            r13 = this;
            r0 = 0
            r13.<init>(r0, r15)
            java.lang.String r1 = "y value cannot be null"
            java.util.Objects.requireNonNull(r14, r1)
            java.math.BigInteger r1 = r15.d
            java.math.BigInteger r2 = x
            int r3 = r14.compareTo(r2)
            if (r3 < 0) goto L_0x00d2
            java.math.BigInteger r2 = r1.subtract(r2)
            int r2 = r14.compareTo(r2)
            if (r2 > 0) goto L_0x00d2
            java.math.BigInteger r15 = r15.q
            if (r15 != 0) goto L_0x0023
            goto L_0x00c7
        L_0x0023:
            boolean r2 = r1.testBit(r0)
            if (r2 == 0) goto L_0x00bb
            int r2 = r1.bitLength()
            r3 = 1
            int r2 = r2 - r3
            int r4 = r15.bitLength()
            if (r2 != r4) goto L_0x00bb
            java.math.BigInteger r2 = r1.shiftRight(r3)
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x00bb
            int r15 = r1.bitLength()
            int[] r2 = s0.a.e.b.b0.c.h3.P0(r15, r14)
            int[] r15 = s0.a.e.b.b0.c.h3.P0(r15, r1)
            int r1 = r15.length
            r4 = r0
        L_0x004d:
            r5 = r2[r0]
            r6 = -1
            if (r5 != 0) goto L_0x005d
            r7 = r0
            r5 = r1
        L_0x0054:
            int r5 = r5 + r6
            if (r5 < 0) goto L_0x004d
            r8 = r2[r5]
            r2[r5] = r7
            r7 = r8
            goto L_0x0054
        L_0x005d:
            r5 = r2[r0]
            int r5 = java.lang.Integer.numberOfTrailingZeros(r5)
            if (r5 <= 0) goto L_0x007e
            r8 = r0
            r7 = r1
        L_0x0067:
            int r7 = r7 + r6
            if (r7 < 0) goto L_0x0075
            r9 = r2[r7]
            int r10 = r9 >>> r5
            int r11 = -r5
            int r8 = r8 << r11
            r8 = r8 | r10
            r2[r7] = r8
            r8 = r9
            goto L_0x0067
        L_0x0075:
            r7 = r15[r0]
            int r8 = r7 >>> 1
            r7 = r7 ^ r8
            int r5 = r5 << 1
            r5 = r5 & r7
            r4 = r4 ^ r5
        L_0x007e:
            int r5 = r1 + -1
        L_0x0080:
            if (r5 < 0) goto L_0x0094
            r7 = r2[r5]
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 ^ r8
            r9 = r15[r5]
            r8 = r8 ^ r9
            if (r7 >= r8) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            if (r7 <= r8) goto L_0x0091
            r6 = r3
            goto L_0x0095
        L_0x0091:
            int r5 = r5 + -1
            goto L_0x0080
        L_0x0094:
            r6 = r0
        L_0x0095:
            if (r6 != 0) goto L_0x00a4
            boolean r15 = s0.a.e.b.b0.c.h3.I1(r1, r15)
            if (r15 == 0) goto L_0x00a1
            r15 = r4 & 2
            int r0 = 1 - r15
        L_0x00a1:
            if (r3 != r0) goto L_0x00ca
            goto L_0x00c7
        L_0x00a4:
            if (r6 >= 0) goto L_0x00af
            r5 = r2[r0]
            r6 = r15[r0]
            r5 = r5 & r6
            r4 = r4 ^ r5
            r12 = r2
            r2 = r15
            r15 = r12
        L_0x00af:
            int r5 = r1 + -1
            r6 = r2[r5]
            if (r6 != 0) goto L_0x00b7
            r1 = r5
            goto L_0x00af
        L_0x00b7:
            s0.a.e.b.b0.c.h3.W2(r1, r2, r15, r2)
            goto L_0x004d
        L_0x00bb:
            java.math.BigInteger r0 = q
            java.math.BigInteger r15 = r14.modPow(r15, r1)
            boolean r15 = r0.equals(r15)
            if (r15 == 0) goto L_0x00ca
        L_0x00c7:
            r13.y = r14
            return
        L_0x00ca:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Y value does not appear to be in correct group"
            r14.<init>(r15)
            throw r14
        L_0x00d2:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "invalid DH public key"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.k0.j.<init>(java.math.BigInteger, s0.a.b.k0.h):void");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof j) && ((j) obj).y.equals(this.y) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.y.hashCode() ^ super.hashCode();
    }
}
