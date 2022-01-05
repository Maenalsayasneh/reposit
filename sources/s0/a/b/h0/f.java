package s0.a.b.h0;

import i0.d.a.a.a;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.e1;
import s0.a.b.k0.y0;
import s0.a.b.s;

public class f implements s {
    public int a = 0;
    public byte[] b = new byte[8];
    public byte[] c = new byte[8];
    public boolean d = true;
    public int[] e = null;
    public byte[] f = null;
    public byte[] g = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    public final byte[] a(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length - i)];
        System.arraycopy(bArr, i, bArr3, 0, bArr2.length);
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    public final int b(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & -16777216) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    public final void c(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int b2 = b(bArr, i);
        int b3 = b(bArr, i + 4);
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = 0;
            while (i4 < 8) {
                int i5 = iArr[i4] + b2;
                byte[] bArr3 = this.g;
                int i6 = (bArr3[((i5 >> 0) & 15) + 0] << 0) + (bArr3[((i5 >> 4) & 15) + 16] << 4) + (bArr3[((i5 >> 8) & 15) + 32] << 8) + (bArr3[((i5 >> 12) & 15) + 48] << 12) + (bArr3[((i5 >> 16) & 15) + 64] << 16) + (bArr3[((i5 >> 20) & 15) + 80] << 20) + (bArr3[((i5 >> 24) & 15) + 96] << 24) + (bArr3[((i5 >> 28) & 15) + 112] << 28);
                i4++;
                int i7 = b2;
                b2 = b3 ^ ((i6 << 11) | (i6 >>> 21));
                b3 = i7;
            }
        }
        d(b2, bArr2, i2);
        d(b3, bArr2, i2 + 4);
    }

    public final void d(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        while (true) {
            int i2 = this.a;
            if (i2 >= 8) {
                break;
            }
            this.b[i2] = 0;
            this.a = i2 + 1;
        }
        byte[] bArr2 = this.b;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, this.c.length);
        if (this.d) {
            this.d = false;
        } else {
            bArr3 = a(this.b, 0, this.c);
        }
        c(this.e, bArr3, 0, this.c, 0);
        byte[] bArr4 = this.c;
        System.arraycopy(bArr4, (bArr4.length / 2) - 4, bArr, i, 4);
        reset();
        return 4;
    }

    public final void e(i iVar) throws IllegalArgumentException {
        if (iVar != null) {
            i iVar2 = null;
            if (iVar instanceof e1) {
                e1 e1Var = (e1) iVar;
                byte[] bArr = e1Var.d;
                System.arraycopy(bArr, 0, this.g, 0, bArr.length);
                iVar2 = e1Var.c;
            } else if (iVar instanceof y0) {
                byte[] bArr2 = ((y0) iVar).c;
                if (bArr2.length == 32) {
                    int[] iArr = new int[8];
                    for (int i = 0; i != 8; i++) {
                        iArr[i] = b(bArr2, i * 4);
                    }
                    this.e = iArr;
                } else {
                    throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
                }
            } else if (iVar instanceof c1) {
                c1 c1Var = (c1) iVar;
                byte[] bArr3 = c1Var.c;
                byte[] bArr4 = this.c;
                System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
                this.f = c1Var.c;
                iVar2 = c1Var.d;
            } else {
                throw new IllegalArgumentException(a.L0(iVar, a.P0("invalid parameter passed to GOST28147 init - ")));
            }
            e(iVar2);
        }
    }

    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    public int getMacSize() {
        return 4;
    }

    public void init(i iVar) throws IllegalArgumentException {
        reset();
        this.b = new byte[8];
        this.f = null;
        e(iVar);
    }

    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.a = 0;
                this.d = true;
                return;
            }
        }
    }

    public void update(byte b2) throws IllegalStateException {
        int i = this.a;
        byte[] bArr = this.b;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, this.c.length);
            if (this.d) {
                this.d = false;
                byte[] bArr3 = this.f;
                if (bArr3 != null) {
                    bArr2 = a(this.b, 0, bArr3);
                }
            } else {
                bArr2 = a(this.b, 0, this.c);
            }
            c(this.e, bArr2, 0, this.c, 0);
            this.a = 0;
        }
        byte[] bArr4 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        bArr4[i2] = b2;
    }

    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (i2 >= 0) {
            int i3 = this.a;
            int i4 = 8 - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.b, i3, i4);
                byte[] bArr2 = this.b;
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, this.c.length);
                if (this.d) {
                    this.d = false;
                    byte[] bArr4 = this.f;
                    if (bArr4 != null) {
                        bArr3 = a(this.b, 0, bArr4);
                    }
                } else {
                    bArr3 = a(this.b, 0, this.c);
                }
                c(this.e, bArr3, 0, this.c, 0);
                this.a = 0;
                i2 -= i4;
                i += i4;
                while (i2 > 8) {
                    c(this.e, a(bArr, i, this.c), 0, this.c, 0);
                    i2 -= 8;
                    i += 8;
                }
            }
            System.arraycopy(bArr, i, this.b, this.a, i2);
            this.a += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
