package s0.a.b.b0;

import java.lang.reflect.Array;
import s0.a.b.e;
import s0.a.b.e0.u;
import s0.a.b.i;
import s0.a.b.k0.e1;
import s0.a.b.k0.y0;
import s0.a.b.o;
import s0.a.e.b.b0.c.h3;
import s0.a.g.f;

public class d implements o, f {
    public static final byte[] a = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    public byte[] b = new byte[32];
    public byte[] c = new byte[32];
    public byte[] d = new byte[32];
    public byte[] e = new byte[32];
    public byte[][] f = ((byte[][]) Array.newInstance(byte.class, new int[]{4, 32}));
    public byte[] g = new byte[32];
    public int h;
    public long i;
    public e j = new u();
    public byte[] k;
    public byte[] l = new byte[32];
    public byte[] m = new byte[8];
    public short[] n = new short[16];
    public short[] o = new short[16];
    public byte[] p = new byte[32];
    public byte[] q = new byte[32];
    public byte[] r = new byte[32];
    public byte[] s = new byte[32];

    public d() {
        byte[] g2 = u.g("D-A");
        this.k = g2;
        this.j.init(true, new e1((i) null, g2));
        reset();
    }

    public d(d dVar) {
        c(dVar);
    }

    public d(byte[] bArr) {
        byte[] I = h3.I(bArr);
        this.k = I;
        this.j.init(true, new e1((i) null, I));
        reset();
    }

    public f a() {
        return new d(this);
    }

    public void c(f fVar) {
        d dVar = (d) fVar;
        byte[] bArr = dVar.k;
        this.k = bArr;
        this.j.init(true, new e1((i) null, bArr));
        reset();
        byte[] bArr2 = dVar.b;
        System.arraycopy(bArr2, 0, this.b, 0, bArr2.length);
        byte[] bArr3 = dVar.c;
        System.arraycopy(bArr3, 0, this.c, 0, bArr3.length);
        byte[] bArr4 = dVar.d;
        System.arraycopy(bArr4, 0, this.d, 0, bArr4.length);
        byte[] bArr5 = dVar.e;
        System.arraycopy(bArr5, 0, this.e, 0, bArr5.length);
        byte[][] bArr6 = dVar.f;
        System.arraycopy(bArr6[1], 0, this.f[1], 0, bArr6[1].length);
        byte[][] bArr7 = dVar.f;
        System.arraycopy(bArr7[2], 0, this.f[2], 0, bArr7[2].length);
        byte[][] bArr8 = dVar.f;
        System.arraycopy(bArr8[3], 0, this.f[3], 0, bArr8[3].length);
        byte[] bArr9 = dVar.g;
        System.arraycopy(bArr9, 0, this.g, 0, bArr9.length);
        this.h = dVar.h;
        this.i = dVar.i;
    }

    public final byte[] d(byte[] bArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            this.m[i2] = (byte) (bArr[i2] ^ bArr[i2 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.m, 0, bArr, 24, 8);
        return bArr;
    }

    public int doFinal(byte[] bArr, int i2) {
        h3.m2(this.i * 8, this.c, 0);
        while (this.h != 0) {
            update((byte) 0);
        }
        g(this.c, 0);
        g(this.e, 0);
        byte[] bArr2 = this.b;
        System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
        reset();
        return 32;
    }

    public final byte[] e(byte[] bArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            byte[] bArr2 = this.l;
            int i3 = i2 * 4;
            bArr2[i3] = bArr[i2];
            bArr2[i3 + 1] = bArr[i2 + 8];
            bArr2[i3 + 2] = bArr[i2 + 16];
            bArr2[i3 + 3] = bArr[i2 + 24];
        }
        return this.l;
    }

    public final void f(byte[] bArr) {
        short[] sArr = this.n;
        for (int i2 = 0; i2 < bArr.length / 2; i2++) {
            int i3 = i2 * 2;
            sArr[i2] = (short) ((bArr[i3] & 255) | ((bArr[i3 + 1] << 8) & 65280));
        }
        short[] sArr2 = this.o;
        short[] sArr3 = this.n;
        sArr2[15] = (short) (((((sArr3[0] ^ sArr3[1]) ^ sArr3[2]) ^ sArr3[3]) ^ sArr3[12]) ^ sArr3[15]);
        System.arraycopy(sArr3, 1, sArr2, 0, 15);
        short[] sArr4 = this.o;
        for (int i4 = 0; i4 < bArr.length / 2; i4++) {
            int i5 = i4 * 2;
            bArr[i5 + 1] = (byte) (sArr4[i4] >> 8);
            bArr[i5] = (byte) sArr4[i4];
        }
    }

    public void g(byte[] bArr, int i2) {
        System.arraycopy(bArr, i2, this.d, 0, 32);
        System.arraycopy(this.b, 0, this.q, 0, 32);
        System.arraycopy(this.d, 0, this.r, 0, 32);
        for (int i3 = 0; i3 < 32; i3++) {
            this.s[i3] = (byte) (this.q[i3] ^ this.r[i3]);
        }
        byte[] e2 = e(this.s);
        byte[] bArr2 = this.p;
        byte[] bArr3 = this.b;
        this.j.init(true, new y0(e2));
        this.j.a(bArr3, 0, bArr2, 0);
        for (int i4 = 1; i4 < 4; i4++) {
            byte[] bArr4 = this.q;
            d(bArr4);
            for (int i5 = 0; i5 < 32; i5++) {
                this.q[i5] = (byte) (bArr4[i5] ^ this.f[i4][i5]);
            }
            byte[] bArr5 = this.r;
            d(bArr5);
            d(bArr5);
            this.r = bArr5;
            for (int i6 = 0; i6 < 32; i6++) {
                this.s[i6] = (byte) (this.q[i6] ^ this.r[i6]);
            }
            byte[] e3 = e(this.s);
            byte[] bArr6 = this.p;
            int i7 = i4 * 8;
            byte[] bArr7 = this.b;
            this.j.init(true, new y0(e3));
            this.j.a(bArr7, i7, bArr6, i7);
        }
        for (int i8 = 0; i8 < 12; i8++) {
            f(this.p);
        }
        for (int i9 = 0; i9 < 32; i9++) {
            byte[] bArr8 = this.p;
            bArr8[i9] = (byte) (bArr8[i9] ^ this.d[i9]);
        }
        f(this.p);
        for (int i10 = 0; i10 < 32; i10++) {
            byte[] bArr9 = this.p;
            bArr9[i10] = (byte) (this.b[i10] ^ bArr9[i10]);
        }
        for (int i11 = 0; i11 < 61; i11++) {
            f(this.p);
        }
        byte[] bArr10 = this.p;
        byte[] bArr11 = this.b;
        System.arraycopy(bArr10, 0, bArr11, 0, bArr11.length);
    }

    public String getAlgorithmName() {
        return "GOST3411";
    }

    public int getByteLength() {
        return 32;
    }

    public int getDigestSize() {
        return 32;
    }

    public final void h(byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = this.e;
            if (i2 != bArr2.length) {
                int i4 = (bArr2[i2] & 255) + (bArr[i2] & 255) + i3;
                bArr2[i2] = (byte) i4;
                i3 = i4 >>> 8;
                i2++;
            } else {
                return;
            }
        }
    }

    public void reset() {
        this.i = 0;
        this.h = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr2 = this.c;
            if (i3 >= bArr2.length) {
                break;
            }
            bArr2[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr3 = this.d;
            if (i4 >= bArr3.length) {
                break;
            }
            bArr3[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[][] bArr4 = this.f;
            if (i5 >= bArr4[1].length) {
                break;
            }
            bArr4[1][i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[][] bArr5 = this.f;
            if (i6 >= bArr5[3].length) {
                break;
            }
            bArr5[3][i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr6 = this.e;
            if (i7 >= bArr6.length) {
                break;
            }
            bArr6[i7] = 0;
            i7++;
        }
        int i8 = 0;
        while (true) {
            byte[] bArr7 = this.g;
            if (i8 < bArr7.length) {
                bArr7[i8] = 0;
                i8++;
            } else {
                byte[] bArr8 = a;
                System.arraycopy(bArr8, 0, this.f[2], 0, bArr8.length);
                return;
            }
        }
    }

    public void update(byte b2) {
        byte[] bArr = this.g;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr[i2] = b2;
        if (i3 == bArr.length) {
            h(bArr);
            g(this.g, 0);
            this.h = 0;
        }
        this.i++;
    }

    public void update(byte[] bArr, int i2, int i3) {
        while (this.h != 0 && i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
        while (true) {
            byte[] bArr2 = this.g;
            if (i3 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i2, bArr2, 0, bArr2.length);
            h(this.g);
            g(this.g, 0);
            byte[] bArr3 = this.g;
            i2 += bArr3.length;
            i3 -= bArr3.length;
            this.i += (long) bArr3.length;
        }
        while (i3 > 0) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
    }
}
