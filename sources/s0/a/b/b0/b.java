package s0.a.b.b0;

import java.util.Arrays;
import s0.a.b.o;
import s0.a.e.b.b0.c.h3;

public class b implements o {
    public static final int[] a = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    public static final byte[][] b = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};
    public int c;
    public int d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int[] p;
    public int[] q;
    public int r;
    public int s;
    public int t;

    public b() {
        this(256);
    }

    public b(int i2) {
        this.c = 32;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 1;
        this.i = 1;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.o = 0;
        this.p = new int[16];
        this.q = null;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        if (i2 < 8 || i2 > 256 || i2 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.c = i2 / 8;
        d((byte[]) null, (byte[]) null, (byte[]) null);
    }

    public b(b bVar) {
        this.c = 32;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 1;
        this.i = 1;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.o = 0;
        this.p = new int[16];
        this.q = null;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.o = bVar.o;
        this.n = h3.I(bVar.n);
        this.d = bVar.d;
        this.g = h3.I(bVar.g);
        this.c = bVar.c;
        this.p = h3.O(this.p);
        this.q = h3.O(bVar.q);
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = bVar.t;
        this.e = h3.I(bVar.e);
        this.f = h3.I(bVar.f);
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        int[] iArr = this.p;
        iArr[i4] = iArr[i4] + iArr[i5] + i2;
        iArr[i7] = e(iArr[i7] ^ iArr[i4], 16);
        int[] iArr2 = this.p;
        iArr2[i6] = iArr2[i6] + iArr2[i7];
        iArr2[i5] = e(iArr2[i5] ^ iArr2[i6], 12);
        int[] iArr3 = this.p;
        iArr3[i4] = iArr3[i4] + iArr3[i5] + i3;
        iArr3[i7] = e(iArr3[i7] ^ iArr3[i4], 8);
        int[] iArr4 = this.p;
        iArr4[i6] = iArr4[i6] + iArr4[i7];
        iArr4[i5] = e(iArr4[i5] ^ iArr4[i6], 7);
    }

    public final void c(byte[] bArr, int i2) {
        int[] iArr = this.q;
        int i3 = 0;
        System.arraycopy(iArr, 0, this.p, 0, iArr.length);
        int[] iArr2 = a;
        System.arraycopy(iArr2, 0, this.p, this.q.length, 4);
        int[] iArr3 = this.p;
        iArr3[12] = this.r ^ iArr2[4];
        iArr3[13] = this.s ^ iArr2[5];
        iArr3[14] = this.t ^ iArr2[6];
        iArr3[15] = iArr2[7];
        int[] iArr4 = new int[16];
        for (int i4 = 0; i4 < 16; i4++) {
            iArr4[i4] = h3.g2(bArr, (i4 * 4) + i2);
        }
        int i5 = 0;
        while (i5 < 10) {
            byte[][] bArr2 = b;
            int i6 = i5;
            int[] iArr5 = iArr4;
            a(iArr4[bArr2[i5][0]], iArr4[bArr2[i5][1]], 0, 4, 8, 12);
            a(iArr5[bArr2[i6][2]], iArr5[bArr2[i6][3]], 1, 5, 9, 13);
            a(iArr5[bArr2[i6][4]], iArr5[bArr2[i6][5]], 2, 6, 10, 14);
            a(iArr5[bArr2[i6][6]], iArr5[bArr2[i6][7]], 3, 7, 11, 15);
            a(iArr5[bArr2[i6][8]], iArr5[bArr2[i6][9]], 0, 5, 10, 15);
            a(iArr5[bArr2[i6][10]], iArr5[bArr2[i6][11]], 1, 6, 11, 12);
            a(iArr5[bArr2[i6][12]], iArr5[bArr2[i6][13]], 2, 7, 8, 13);
            a(iArr5[bArr2[i6][14]], iArr5[bArr2[i6][15]], 3, 4, 9, 14);
            i5 = i6 + 1;
            iArr4 = iArr5;
        }
        while (true) {
            int[] iArr6 = this.q;
            if (i3 < iArr6.length) {
                int i7 = iArr6[i3];
                int[] iArr7 = this.p;
                iArr6[i3] = (i7 ^ iArr7[i3]) ^ iArr7[i3 + 8];
                i3++;
            } else {
                return;
            }
        }
    }

    public final void d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.n = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length <= 32) {
                byte[] bArr4 = new byte[bArr3.length];
                this.g = bArr4;
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                this.d = bArr3.length;
                System.arraycopy(bArr3, 0, this.n, 0, bArr3.length);
                this.o = 64;
            } else {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
        }
        if (this.q == null) {
            int[] iArr = new int[8];
            this.q = iArr;
            int[] iArr2 = a;
            iArr[0] = iArr2[0] ^ ((this.c | (this.d << 8)) | ((this.h << 16) | (this.i << 24)));
            iArr[1] = iArr2[1] ^ this.j;
            long j2 = this.k;
            iArr[2] = ((int) j2) ^ iArr2[2];
            int i2 = iArr2[3];
            iArr[3] = ((((int) (j2 >> 32)) | (this.l << 16)) | (this.m << 24)) ^ i2;
            iArr[4] = iArr2[4];
            iArr[5] = iArr2[5];
            if (bArr != null) {
                if (bArr.length == 8) {
                    byte[] bArr5 = new byte[8];
                    this.e = bArr5;
                    System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                    int[] iArr3 = this.q;
                    iArr3[4] = iArr3[4] ^ h3.g2(bArr, 0);
                    int[] iArr4 = this.q;
                    iArr4[5] = h3.g2(bArr, 4) ^ iArr4[5];
                } else {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
            }
            int[] iArr5 = this.q;
            iArr5[6] = iArr2[6];
            iArr5[7] = iArr2[7];
            if (bArr2 == null) {
                return;
            }
            if (bArr2.length == 8) {
                byte[] bArr6 = new byte[8];
                this.f = bArr6;
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr6 = this.q;
                iArr6[6] = iArr6[6] ^ h3.g2(bArr2, 0);
                int[] iArr7 = this.q;
                iArr7[7] = h3.g2(bArr2, 4) ^ iArr7[7];
                return;
            }
            throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
        }
    }

    public int doFinal(byte[] bArr, int i2) {
        int[] iArr;
        int i3;
        this.t = -1;
        int i4 = this.r;
        int i5 = this.o;
        int i6 = i4 + i5;
        this.r = i6;
        if (i6 < 0 && i5 > (-i6)) {
            this.s++;
        }
        c(this.n, 0);
        Arrays.fill(this.n, (byte) 0);
        Arrays.fill(this.p, 0);
        int i7 = 0;
        while (true) {
            iArr = this.q;
            if (i7 >= iArr.length || (i3 = i7 * 4) >= this.c) {
                Arrays.fill(iArr, 0);
                reset();
            } else {
                byte[] bArr2 = new byte[4];
                h3.D1(iArr[i7], bArr2, 0);
                int i8 = this.c;
                if (i3 < i8 - 4) {
                    System.arraycopy(bArr2, 0, bArr, i3 + i2, 4);
                } else {
                    System.arraycopy(bArr2, 0, bArr, i2 + i3, i8 - i3);
                }
                i7++;
            }
        }
        Arrays.fill(iArr, 0);
        reset();
        return this.c;
    }

    public final int e(int i2, int i3) {
        return (i2 << (32 - i3)) | (i2 >>> i3);
    }

    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    public int getByteLength() {
        return 64;
    }

    public int getDigestSize() {
        return this.c;
    }

    public void reset() {
        this.o = 0;
        this.t = 0;
        this.r = 0;
        this.s = 0;
        this.q = null;
        Arrays.fill(this.n, (byte) 0);
        byte[] bArr = this.g;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.n, 0, bArr.length);
            this.o = 64;
        }
        d(this.e, this.f, this.g);
    }

    public void update(byte b2) {
        int i2 = this.o;
        if (64 - i2 == 0) {
            int i3 = this.r + 64;
            this.r = i3;
            if (i3 == 0) {
                this.s++;
            }
            c(this.n, 0);
            Arrays.fill(this.n, (byte) 0);
            this.n[0] = b2;
            this.o = 1;
            return;
        }
        this.n[i2] = b2;
        this.o = i2 + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x005b
            if (r7 != 0) goto L_0x0005
            goto L_0x005b
        L_0x0005:
            int r0 = r4.o
            r1 = 0
            if (r0 == 0) goto L_0x0039
            int r2 = 64 - r0
            if (r2 >= r7) goto L_0x002e
            byte[] r3 = r4.n
            java.lang.System.arraycopy(r5, r6, r3, r0, r2)
            int r0 = r4.r
            int r0 = r0 + 64
            r4.r = r0
            if (r0 != 0) goto L_0x0021
            int r0 = r4.s
            int r0 = r0 + 1
            r4.s = r0
        L_0x0021:
            byte[] r0 = r4.n
            r4.c(r0, r1)
            r4.o = r1
            byte[] r0 = r4.n
            java.util.Arrays.fill(r0, r1)
            goto L_0x003a
        L_0x002e:
            byte[] r1 = r4.n
            java.lang.System.arraycopy(r5, r6, r1, r0, r7)
        L_0x0033:
            int r5 = r4.o
            int r5 = r5 + r7
            r4.o = r5
            return
        L_0x0039:
            r2 = r1
        L_0x003a:
            int r7 = r7 + r6
            int r0 = r7 + -64
            int r6 = r6 + r2
        L_0x003e:
            if (r6 >= r0) goto L_0x0054
            int r2 = r4.r
            int r2 = r2 + 64
            r4.r = r2
            if (r2 != 0) goto L_0x004e
            int r2 = r4.s
            int r2 = r2 + 1
            r4.s = r2
        L_0x004e:
            r4.c(r5, r6)
            int r6 = r6 + 64
            goto L_0x003e
        L_0x0054:
            byte[] r0 = r4.n
            int r7 = r7 - r6
            java.lang.System.arraycopy(r5, r6, r0, r1, r7)
            goto L_0x0033
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.b0.b.update(byte[], int, int):void");
    }
}
