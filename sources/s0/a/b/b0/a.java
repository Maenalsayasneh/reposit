package s0.a.b.b0;

import java.util.Arrays;
import s0.a.b.o;
import s0.a.e.b.b0.c.h3;

public class a implements o {
    public static final long[] a = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
    public static final byte[][] b = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};
    public int c;
    public int d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int i;
    public long[] j;
    public long[] k;
    public long l;
    public long m;
    public long n;

    public a() {
        this(512);
    }

    public a(int i2) {
        this.c = 64;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = new long[16];
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        if (i2 < 8 || i2 > 512 || i2 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.h = new byte[128];
        this.d = 0;
        this.c = i2 / 8;
        d();
    }

    public a(a aVar) {
        this.c = 64;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = new long[16];
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.i = aVar.i;
        this.h = h3.I(aVar.h);
        this.d = aVar.d;
        this.g = h3.I(aVar.g);
        this.c = aVar.c;
        this.k = h3.L(aVar.k);
        this.f = h3.I(aVar.f);
        this.e = h3.I(aVar.e);
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
    }

    public final void a(long j2, long j3, int i2, int i3, int i4, int i5) {
        long[] jArr = this.j;
        jArr[i2] = jArr[i2] + jArr[i3] + j2;
        jArr[i5] = Long.rotateRight(jArr[i5] ^ jArr[i2], 32);
        long[] jArr2 = this.j;
        jArr2[i4] = jArr2[i4] + jArr2[i5];
        jArr2[i3] = Long.rotateRight(jArr2[i3] ^ jArr2[i4], 24);
        long[] jArr3 = this.j;
        jArr3[i2] = jArr3[i2] + jArr3[i3] + j3;
        jArr3[i5] = Long.rotateRight(jArr3[i5] ^ jArr3[i2], 16);
        long[] jArr4 = this.j;
        jArr4[i4] = jArr4[i4] + jArr4[i5];
        jArr4[i3] = Long.rotateRight(jArr4[i3] ^ jArr4[i4], 63);
    }

    public final void c(byte[] bArr, int i2) {
        long[] jArr = this.k;
        int i3 = 0;
        System.arraycopy(jArr, 0, this.j, 0, jArr.length);
        long[] jArr2 = a;
        System.arraycopy(jArr2, 0, this.j, this.k.length, 4);
        long[] jArr3 = this.j;
        jArr3[12] = this.l ^ jArr2[4];
        jArr3[13] = this.m ^ jArr2[5];
        jArr3[14] = this.n ^ jArr2[6];
        jArr3[15] = jArr2[7];
        long[] jArr4 = new long[16];
        for (int i4 = 0; i4 < 16; i4++) {
            jArr4[i4] = h3.i2(bArr, (i4 * 8) + i2);
        }
        int i5 = 0;
        while (i5 < 12) {
            byte[][] bArr2 = b;
            int i6 = i5;
            long[] jArr5 = jArr4;
            a(jArr4[bArr2[i5][0]], jArr4[bArr2[i5][1]], 0, 4, 8, 12);
            a(jArr5[bArr2[i6][2]], jArr5[bArr2[i6][3]], 1, 5, 9, 13);
            a(jArr5[bArr2[i6][4]], jArr5[bArr2[i6][5]], 2, 6, 10, 14);
            a(jArr5[bArr2[i6][6]], jArr5[bArr2[i6][7]], 3, 7, 11, 15);
            a(jArr5[bArr2[i6][8]], jArr5[bArr2[i6][9]], 0, 5, 10, 15);
            a(jArr5[bArr2[i6][10]], jArr5[bArr2[i6][11]], 1, 6, 11, 12);
            a(jArr5[bArr2[i6][12]], jArr5[bArr2[i6][13]], 2, 7, 8, 13);
            a(jArr5[bArr2[i6][14]], jArr5[bArr2[i6][15]], 3, 4, 9, 14);
            i5 = i6 + 1;
            jArr4 = jArr5;
        }
        while (true) {
            long[] jArr6 = this.k;
            if (i3 < jArr6.length) {
                long j2 = jArr6[i3];
                long[] jArr7 = this.j;
                jArr6[i3] = (j2 ^ jArr7[i3]) ^ jArr7[i3 + 8];
                i3++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        if (this.k == null) {
            long[] jArr = new long[8];
            this.k = jArr;
            long[] jArr2 = a;
            jArr[0] = jArr2[0] ^ ((long) ((this.c | (this.d << 8)) | 16842752));
            jArr[1] = jArr2[1];
            jArr[2] = jArr2[2];
            jArr[3] = jArr2[3];
            jArr[4] = jArr2[4];
            jArr[5] = jArr2[5];
            byte[] bArr = this.e;
            if (bArr != null) {
                jArr[4] = jArr[4] ^ h3.i2(bArr, 0);
                long[] jArr3 = this.k;
                jArr3[5] = jArr3[5] ^ h3.i2(this.e, 8);
            }
            long[] jArr4 = this.k;
            jArr4[6] = jArr2[6];
            jArr4[7] = jArr2[7];
            byte[] bArr2 = this.f;
            if (bArr2 != null) {
                jArr4[6] = h3.i2(bArr2, 0) ^ jArr4[6];
                long[] jArr5 = this.k;
                jArr5[7] = jArr5[7] ^ h3.i2(this.f, 8);
            }
        }
    }

    public int doFinal(byte[] bArr, int i2) {
        long[] jArr;
        int i3;
        this.n = -1;
        long j2 = this.l;
        int i4 = this.i;
        long j3 = j2 + ((long) i4);
        this.l = j3;
        if (i4 > 0 && j3 == 0) {
            this.m++;
        }
        c(this.h, 0);
        Arrays.fill(this.h, (byte) 0);
        Arrays.fill(this.j, 0);
        int i5 = 0;
        while (true) {
            jArr = this.k;
            if (i5 >= jArr.length || (i3 = i5 * 8) >= this.c) {
                Arrays.fill(jArr, 0);
                reset();
            } else {
                byte[] o2 = h3.o2(jArr[i5]);
                int i6 = this.c;
                if (i3 < i6 - 8) {
                    System.arraycopy(o2, 0, bArr, i3 + i2, 8);
                } else {
                    System.arraycopy(o2, 0, bArr, i2 + i3, i6 - i3);
                }
                i5++;
            }
        }
        Arrays.fill(jArr, 0);
        reset();
        return this.c;
    }

    public String getAlgorithmName() {
        return "BLAKE2b";
    }

    public int getByteLength() {
        return 128;
    }

    public int getDigestSize() {
        return this.c;
    }

    public void reset() {
        this.i = 0;
        this.n = 0;
        this.l = 0;
        this.m = 0;
        this.k = null;
        Arrays.fill(this.h, (byte) 0);
        byte[] bArr = this.g;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.h, 0, bArr.length);
            this.i = 128;
        }
        d();
    }

    public void update(byte b2) {
        int i2 = this.i;
        if (128 - i2 == 0) {
            long j2 = this.l + 128;
            this.l = j2;
            if (j2 == 0) {
                this.m++;
            }
            c(this.h, 0);
            Arrays.fill(this.h, (byte) 0);
            this.h[0] = b2;
            this.i = 1;
            return;
        }
        this.h[i2] = b2;
        this.i = i2 + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0061
            if (r14 != 0) goto L_0x0005
            goto L_0x0061
        L_0x0005:
            int r0 = r11.i
            r1 = 1
            r3 = 0
            r5 = 128(0x80, double:6.32E-322)
            r7 = 0
            if (r0 == 0) goto L_0x003f
            int r8 = 128 - r0
            if (r8 >= r14) goto L_0x0034
            byte[] r9 = r11.h
            java.lang.System.arraycopy(r12, r13, r9, r0, r8)
            long r9 = r11.l
            long r9 = r9 + r5
            r11.l = r9
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            long r9 = r11.m
            long r9 = r9 + r1
            r11.m = r9
        L_0x0027:
            byte[] r0 = r11.h
            r11.c(r0, r7)
            r11.i = r7
            byte[] r0 = r11.h
            java.util.Arrays.fill(r0, r7)
            goto L_0x0040
        L_0x0034:
            byte[] r1 = r11.h
            java.lang.System.arraycopy(r12, r13, r1, r0, r14)
        L_0x0039:
            int r12 = r11.i
            int r12 = r12 + r14
            r11.i = r12
            return
        L_0x003f:
            r8 = r7
        L_0x0040:
            int r14 = r14 + r13
            int r0 = r14 + -128
            int r13 = r13 + r8
        L_0x0044:
            if (r13 >= r0) goto L_0x005a
            long r8 = r11.l
            long r8 = r8 + r5
            r11.l = r8
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            long r8 = r11.m
            long r8 = r8 + r1
            r11.m = r8
        L_0x0054:
            r11.c(r12, r13)
            int r13 = r13 + 128
            goto L_0x0044
        L_0x005a:
            byte[] r0 = r11.h
            int r14 = r14 - r13
            java.lang.System.arraycopy(r12, r13, r0, r7, r14)
            goto L_0x0039
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.b0.a.update(byte[], int, int):void");
    }
}
