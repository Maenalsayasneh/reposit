package s0.a.e.b;

public class y extends b {
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        if (r4.b(s0.a.e.b.r.b) < 0) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s0.a.e.b.h b(s0.a.e.b.h r19, java.math.BigInteger r20) {
        /*
            r18 = this;
            r0 = r19
            boolean r1 = r0 instanceof s0.a.e.b.h.b
            if (r1 == 0) goto L_0x02a4
            s0.a.e.b.h$b r0 = (s0.a.e.b.h.b) r0
            s0.a.e.b.e r1 = r0.b
            s0.a.e.b.e$a r1 = (s0.a.e.b.e.a) r1
            int r8 = r1.l()
            s0.a.e.b.g r2 = r1.b
            java.math.BigInteger r2 = r2.t()
            byte r9 = r2.byteValue()
            java.math.BigInteger r2 = s0.a.e.b.r.a
            r10 = 1
            r11 = -1
            if (r9 != 0) goto L_0x0022
            r2 = r11
            goto L_0x0023
        L_0x0022:
            r2 = r10
        L_0x0023:
            byte r12 = (byte) r2
            monitor-enter(r1)
            java.math.BigInteger[] r2 = r1.i     // Catch:{ all -> 0x02a1 }
            if (r2 != 0) goto L_0x002f
            java.math.BigInteger[] r2 = s0.a.e.b.r.c(r1)     // Catch:{ all -> 0x02a1 }
            r1.i = r2     // Catch:{ all -> 0x02a1 }
        L_0x002f:
            java.math.BigInteger[] r13 = r1.i     // Catch:{ all -> 0x02a1 }
            monitor-exit(r1)
            r1 = 10
            r14 = 0
            if (r12 != r10) goto L_0x0040
            r2 = r13[r14]
            r3 = r13[r10]
            java.math.BigInteger r2 = r2.add(r3)
            goto L_0x0048
        L_0x0040:
            r2 = r13[r14]
            r3 = r13[r10]
            java.math.BigInteger r2 = r2.subtract(r3)
        L_0x0048:
            r15 = r2
            java.math.BigInteger[] r2 = s0.a.e.b.r.b(r12, r8, r10)
            r16 = r2[r10]
            r3 = r13[r14]
            r7 = 10
            r2 = r20
            r4 = r16
            r5 = r9
            r6 = r8
            s0.a.e.b.q r7 = s0.a.e.b.r.a(r2, r3, r4, r5, r6, r7)
            r3 = r13[r10]
            r8 = r7
            r7 = r1
            s0.a.e.b.q r1 = s0.a.e.b.r.a(r2, r3, r4, r5, r6, r7)
            int r2 = r8.b
            int r3 = r1.b
            if (r3 != r2) goto L_0x0299
            if (r12 == r10) goto L_0x0078
            if (r12 != r11) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "mu must be 1 or -1"
            r0.<init>(r1)
            throw r0
        L_0x0078:
            java.math.BigInteger r2 = r8.c()
            java.math.BigInteger r3 = r1.c()
            s0.a.e.b.q r4 = new s0.a.e.b.q
            java.math.BigInteger r5 = r8.a
            int r6 = r8.b
            java.math.BigInteger r6 = r2.shiftLeft(r6)
            java.math.BigInteger r5 = r5.subtract(r6)
            int r6 = r8.b
            r4.<init>(r5, r6)
            s0.a.e.b.q r5 = new s0.a.e.b.q
            java.math.BigInteger r6 = r1.a
            int r7 = r1.b
            java.math.BigInteger r7 = r3.shiftLeft(r7)
            java.math.BigInteger r6 = r6.subtract(r7)
            int r1 = r1.b
            r5.<init>(r6, r1)
            s0.a.e.b.q r1 = r4.a(r4)
            if (r12 != r10) goto L_0x00b1
            s0.a.e.b.q r1 = r1.a(r5)
            goto L_0x00b5
        L_0x00b1:
            s0.a.e.b.q r1 = r1.d(r5)
        L_0x00b5:
            s0.a.e.b.q r6 = r5.a(r5)
            s0.a.e.b.q r6 = r6.a(r5)
            s0.a.e.b.q r5 = r6.a(r5)
            if (r12 != r10) goto L_0x00cc
            s0.a.e.b.q r6 = r4.d(r6)
            s0.a.e.b.q r4 = r4.a(r5)
            goto L_0x00d4
        L_0x00cc:
            s0.a.e.b.q r6 = r4.a(r6)
            s0.a.e.b.q r4 = r4.d(r5)
        L_0x00d4:
            java.math.BigInteger r5 = s0.a.e.b.c.b
            int r7 = r1.b(r5)
            if (r7 < 0) goto L_0x00e8
            java.math.BigInteger r7 = s0.a.e.b.r.a
            int r7 = r6.b(r7)
            if (r7 >= 0) goto L_0x00e5
            goto L_0x00f0
        L_0x00e5:
            r7 = r10
            r8 = r14
            goto L_0x00f5
        L_0x00e8:
            java.math.BigInteger r7 = s0.a.e.b.c.c
            int r7 = r4.b(r7)
            if (r7 < 0) goto L_0x00f3
        L_0x00f0:
            r8 = r12
            r7 = r14
            goto L_0x00f5
        L_0x00f3:
            r7 = r14
            r8 = r7
        L_0x00f5:
            java.math.BigInteger r11 = s0.a.e.b.r.a
            int r1 = r1.b(r11)
            if (r1 >= 0) goto L_0x0106
            int r1 = r6.b(r5)
            if (r1 < 0) goto L_0x0104
            goto L_0x010e
        L_0x0104:
            r7 = -1
            goto L_0x0110
        L_0x0106:
            java.math.BigInteger r1 = s0.a.e.b.r.b
            int r1 = r4.b(r1)
            if (r1 >= 0) goto L_0x0110
        L_0x010e:
            int r1 = -r12
            byte r8 = (byte) r1
        L_0x0110:
            long r4 = (long) r7
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r1 = r2.add(r1)
            long r4 = (long) r8
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r2 = r3.add(r2)
            java.math.BigInteger r3 = r15.multiply(r1)
            r4 = r20
            java.math.BigInteger r3 = r4.subtract(r3)
            r4 = 2
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            r5 = r13[r10]
            java.math.BigInteger r4 = r4.multiply(r5)
            java.math.BigInteger r4 = r4.multiply(r2)
            java.math.BigInteger r3 = r3.subtract(r4)
            r4 = r13[r10]
            java.math.BigInteger r1 = r4.multiply(r1)
            r4 = r13[r14]
            java.math.BigInteger r2 = r4.multiply(r2)
            java.math.BigInteger r1 = r1.subtract(r2)
            if (r9 != 0) goto L_0x0155
            s0.a.e.b.a0[] r2 = s0.a.e.b.r.d
            goto L_0x0157
        L_0x0155:
            s0.a.e.b.a0[] r2 = s0.a.e.b.r.f
        L_0x0157:
            if (r12 != r10) goto L_0x015c
            r4 = 6
            goto L_0x015e
        L_0x015c:
            r4 = 10
        L_0x015e:
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            r5 = 16
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
            java.lang.String r6 = "mu must be 1 or -1"
            if (r12 == r10) goto L_0x0176
            r7 = -1
            if (r12 != r7) goto L_0x0170
            goto L_0x0176
        L_0x0170:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L_0x0176:
            java.math.BigInteger r7 = r3.multiply(r3)
            java.math.BigInteger r8 = r3.multiply(r1)
            java.math.BigInteger r9 = r1.multiply(r1)
            java.math.BigInteger r9 = r9.shiftLeft(r10)
            if (r12 != r10) goto L_0x018d
            java.math.BigInteger r6 = r7.add(r8)
            goto L_0x0194
        L_0x018d:
            r11 = -1
            if (r12 != r11) goto L_0x0293
            java.math.BigInteger r6 = r7.subtract(r8)
        L_0x0194:
            java.math.BigInteger r6 = r6.add(r9)
            int r6 = r6.bitLength()
            r7 = 30
            if (r6 <= r7) goto L_0x01a5
            int r6 = r6 + 4
            int r6 = r6 + 4
            goto L_0x01a7
        L_0x01a5:
            r6 = 38
        L_0x01a7:
            r7 = r6
            byte[] r8 = new byte[r7]
            java.math.BigInteger r9 = r5.shiftRight(r10)
            r6 = r14
        L_0x01af:
            java.math.BigInteger r11 = s0.a.e.b.c.a
            boolean r13 = r3.equals(r11)
            if (r13 == 0) goto L_0x0222
            boolean r11 = r1.equals(r11)
            if (r11 != 0) goto L_0x01be
            goto L_0x0222
        L_0x01be:
            s0.a.e.b.e r1 = r0.b
            s0.a.e.b.e$a r1 = (s0.a.e.b.e.a) r1
            s0.a.e.b.g r2 = r1.b
            java.math.BigInteger r2 = r2.t()
            byte r2 = r2.byteValue()
            s0.a.e.b.x r3 = new s0.a.e.b.x
            r3.<init>(r0, r2)
            java.lang.String r2 = "bc_wtnaf"
            s0.a.e.b.o r1 = r1.r(r0, r2, r3)
            s0.a.e.b.z r1 = (s0.a.e.b.z) r1
            s0.a.e.b.h$b[] r1 = r1.a
            int r2 = r1.length
            s0.a.e.b.h$b[] r2 = new s0.a.e.b.h.b[r2]
            r3 = r14
        L_0x01df:
            int r4 = r1.length
            if (r3 >= r4) goto L_0x01ef
            r4 = r1[r3]
            s0.a.e.b.h r4 = r4.p()
            s0.a.e.b.h$b r4 = (s0.a.e.b.h.b) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x01df
        L_0x01ef:
            s0.a.e.b.e r0 = r0.b
            s0.a.e.b.h r0 = r0.m()
            s0.a.e.b.h$b r0 = (s0.a.e.b.h.b) r0
            r11 = -1
            int r7 = r7 + r11
            r3 = r14
        L_0x01fa:
            if (r7 < 0) goto L_0x021b
            int r3 = r3 + 1
            byte r4 = r8[r7]
            if (r4 == 0) goto L_0x0218
            s0.a.e.b.h$b r0 = r0.B(r3)
            if (r4 <= 0) goto L_0x020d
            int r3 = r4 >>> 1
            r3 = r1[r3]
            goto L_0x0211
        L_0x020d:
            int r3 = -r4
            int r3 = r3 >>> r10
            r3 = r2[r3]
        L_0x0211:
            s0.a.e.b.h r0 = r0.a(r3)
            s0.a.e.b.h$b r0 = (s0.a.e.b.h.b) r0
            r3 = r14
        L_0x0218:
            int r7 = r7 + -1
            goto L_0x01fa
        L_0x021b:
            if (r3 <= 0) goto L_0x0221
            s0.a.e.b.h$b r0 = r0.B(r3)
        L_0x0221:
            return r0
        L_0x0222:
            r11 = -1
            boolean r13 = r3.testBit(r14)
            if (r13 == 0) goto L_0x0271
            java.math.BigInteger r13 = r1.multiply(r4)
            java.math.BigInteger r13 = r3.add(r13)
            java.math.BigInteger r13 = r13.mod(r5)
            int r15 = r13.compareTo(r9)
            if (r15 < 0) goto L_0x023f
            java.math.BigInteger r13 = r13.subtract(r5)
        L_0x023f:
            int r13 = r13.intValue()
            byte r13 = (byte) r13
            r8[r6] = r13
            if (r13 >= 0) goto L_0x024c
            int r13 = -r13
            byte r13 = (byte) r13
            r15 = r14
            goto L_0x024d
        L_0x024c:
            r15 = r10
        L_0x024d:
            if (r15 == 0) goto L_0x0260
            r15 = r2[r13]
            java.math.BigInteger r15 = r15.a
            java.math.BigInteger r3 = r3.subtract(r15)
            r13 = r2[r13]
            java.math.BigInteger r13 = r13.b
            java.math.BigInteger r1 = r1.subtract(r13)
            goto L_0x0273
        L_0x0260:
            r15 = r2[r13]
            java.math.BigInteger r15 = r15.a
            java.math.BigInteger r3 = r3.add(r15)
            r13 = r2[r13]
            java.math.BigInteger r13 = r13.b
            java.math.BigInteger r1 = r1.add(r13)
            goto L_0x0273
        L_0x0271:
            r8[r6] = r14
        L_0x0273:
            java.math.BigInteger r13 = r3.shiftRight(r10)
            if (r12 != r10) goto L_0x027e
            java.math.BigInteger r1 = r1.add(r13)
            goto L_0x0282
        L_0x027e:
            java.math.BigInteger r1 = r1.subtract(r13)
        L_0x0282:
            java.math.BigInteger r3 = r3.shiftRight(r10)
            java.math.BigInteger r3 = r3.negate()
            int r6 = r6 + 1
            r17 = r3
            r3 = r1
            r1 = r17
            goto L_0x01af
        L_0x0293:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L_0x0299:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "lambda0 and lambda1 do not have same scale"
            r0.<init>(r1)
            throw r0
        L_0x02a1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only ECPoint.AbstractF2m can be used in WTauNafMultiplier"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e.b.y.b(s0.a.e.b.h, java.math.BigInteger):s0.a.e.b.h");
    }
}
