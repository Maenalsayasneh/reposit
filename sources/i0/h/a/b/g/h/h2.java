package i0.h.a.b.g.h;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class h2 extends g2 {
    public static int b(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            g2 g2Var = e2.a;
            if (i > -12) {
                return -1;
            }
            return i;
        } else if (i2 == 1) {
            byte a = d2.a(bArr, j);
            g2 g2Var2 = e2.a;
            if (i > -12 || a > -65) {
                return -1;
            }
            return i ^ (a << 8);
        } else if (i2 == 2) {
            return e2.a(i, d2.a(bArr, j), d2.a(bArr, j + 1));
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ba, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r18, byte[] r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r1 | r2
            int r4 = r0.length
            int r4 = r4 - r2
            r3 = r3 | r4
            r4 = 2
            r5 = 3
            r6 = 0
            if (r3 < 0) goto L_0x00bb
            long r7 = (long) r1
            long r1 = (long) r2
            long r1 = r1 - r7
            int r1 = (int) r1
            r2 = 16
            r9 = 1
            if (r1 >= r2) goto L_0x001c
            r2 = r6
            goto L_0x002e
        L_0x001c:
            r2 = r6
            r11 = r7
        L_0x001e:
            if (r2 >= r1) goto L_0x002d
            long r13 = r11 + r9
            byte r3 = i0.h.a.b.g.h.d2.a(r0, r11)
            if (r3 >= 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            int r2 = r2 + 1
            r11 = r13
            goto L_0x001e
        L_0x002d:
            r2 = r1
        L_0x002e:
            int r1 = r1 - r2
            long r2 = (long) r2
            long r7 = r7 + r2
        L_0x0031:
            r2 = r6
        L_0x0032:
            if (r1 <= 0) goto L_0x0045
            long r2 = r7 + r9
            byte r7 = i0.h.a.b.g.h.d2.a(r0, r7)
            if (r7 < 0) goto L_0x0042
            int r1 = r1 + -1
            r15 = r2
            r2 = r7
            r7 = r15
            goto L_0x0032
        L_0x0042:
            r15 = r2
            r2 = r7
            r7 = r15
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return r6
        L_0x0048:
            int r1 = r1 + -1
            r3 = -32
            r11 = -65
            r12 = -1
            if (r2 >= r3) goto L_0x0066
            if (r1 != 0) goto L_0x0054
            return r2
        L_0x0054:
            int r1 = r1 + -1
            r3 = -62
            if (r2 < r3) goto L_0x0065
            long r2 = r7 + r9
            byte r7 = i0.h.a.b.g.h.d2.a(r0, r7)
            if (r7 <= r11) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = r2
            goto L_0x0031
        L_0x0065:
            return r12
        L_0x0066:
            r13 = -16
            if (r2 >= r13) goto L_0x0090
            if (r1 >= r4) goto L_0x0071
            int r0 = b(r0, r2, r7, r1)
            return r0
        L_0x0071:
            int r1 = r1 + -2
            long r13 = r7 + r9
            byte r7 = i0.h.a.b.g.h.d2.a(r0, r7)
            if (r7 > r11) goto L_0x008f
            r8 = -96
            if (r2 != r3) goto L_0x0081
            if (r7 < r8) goto L_0x008f
        L_0x0081:
            r3 = -19
            if (r2 != r3) goto L_0x0087
            if (r7 >= r8) goto L_0x008f
        L_0x0087:
            long r7 = r13 + r9
            byte r2 = i0.h.a.b.g.h.d2.a(r0, r13)
            if (r2 <= r11) goto L_0x0031
        L_0x008f:
            return r12
        L_0x0090:
            if (r1 >= r5) goto L_0x0097
            int r0 = b(r0, r2, r7, r1)
            return r0
        L_0x0097:
            int r1 = r1 + -3
            long r13 = r7 + r9
            byte r3 = i0.h.a.b.g.h.d2.a(r0, r7)
            if (r3 > r11) goto L_0x00ba
            int r2 = r2 << 28
            int r3 = r3 + 112
            int r3 = r3 + r2
            int r2 = r3 >> 30
            if (r2 != 0) goto L_0x00ba
            long r2 = r13 + r9
            byte r7 = i0.h.a.b.g.h.d2.a(r0, r13)
            if (r7 > r11) goto L_0x00ba
            long r7 = r2 + r9
            byte r2 = i0.h.a.b.g.h.d2.a(r0, r2)
            if (r2 <= r11) goto L_0x0031
        L_0x00ba:
            return r12
        L_0x00bb:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r1 = 1
            r5[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r5[r4] = r0
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.h.h2.a(int, byte[], int, int):int");
    }
}
