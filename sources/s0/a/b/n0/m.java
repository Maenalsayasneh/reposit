package s0.a.b.n0;

import org.bouncycastle.crypto.CryptoException;
import s0.a.b.a;
import s0.a.b.i;
import s0.a.b.k0.k1;
import s0.a.b.n;
import s0.a.b.v;

public class m implements v {
    public n g;
    public a h;
    public int i;
    public int j;
    public byte[] k;
    public byte[] l;
    public int m;
    public byte[] n;

    public m(a aVar, n nVar, boolean z) {
        int i2;
        this.h = aVar;
        this.g = nVar;
        if (z) {
            i2 = 188;
        } else {
            Integer num = n.a.get(nVar.getAlgorithmName());
            if (num != null) {
                i2 = num.intValue();
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("no valid trailer for digest: ");
                P0.append(nVar.getAlgorithmName());
                throw new IllegalArgumentException(P0.toString());
            }
        }
        this.i = i2;
    }

    public boolean a(byte[] bArr) {
        boolean z;
        try {
            byte[] b = this.h.b(bArr, 0, bArr.length);
            if (((b[0] & 192) ^ 64) != 0) {
                this.m = 0;
                c(this.l);
            } else if (((b[b.length - 1] & 15) ^ 12) != 0) {
                this.m = 0;
                c(this.l);
            } else {
                int i2 = 2;
                if (((b[b.length - 1] & 255) ^ 188) == 0) {
                    i2 = 1;
                } else {
                    byte b2 = ((b[b.length - 2] & 255) << 8) | (b[b.length - 1] & 255);
                    Integer a = n.a(this.g);
                    if (a != null) {
                        int intValue = a.intValue();
                        if (!(b2 == intValue || (intValue == 15052 && b2 == 16588))) {
                            throw new IllegalStateException(i0.d.a.a.a.e0("signer initialised with wrong digest for trailer ", b2));
                        }
                    } else {
                        throw new IllegalArgumentException("unrecognised hash in signature");
                    }
                }
                int i3 = 0;
                while (i3 != b.length && ((b[i3] & 15) ^ 10) != 0) {
                    i3++;
                }
                int i4 = i3 + 1;
                int digestSize = this.g.getDigestSize();
                byte[] bArr2 = new byte[digestSize];
                int length = (b.length - i2) - digestSize;
                int i5 = length - i4;
                if (i5 <= 0) {
                    this.m = 0;
                    c(this.l);
                } else {
                    if ((b[0] & 32) != 0) {
                        this.g.doFinal(bArr2, 0);
                        boolean z2 = true;
                        for (int i6 = 0; i6 != digestSize; i6++) {
                            int i7 = length + i6;
                            b[i7] = (byte) (b[i7] ^ bArr2[i6]);
                            if (b[i7] != 0) {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                            this.m = 0;
                            c(this.l);
                        } else {
                            byte[] bArr3 = new byte[i5];
                            this.n = bArr3;
                            System.arraycopy(b, i4, bArr3, 0, i5);
                        }
                    } else if (this.m > i5) {
                        this.m = 0;
                        c(this.l);
                    } else {
                        this.g.reset();
                        this.g.update(b, i4, i5);
                        this.g.doFinal(bArr2, 0);
                        boolean z3 = true;
                        for (int i8 = 0; i8 != digestSize; i8++) {
                            int i9 = length + i8;
                            b[i9] = (byte) (b[i9] ^ bArr2[i8]);
                            if (b[i9] != 0) {
                                z3 = false;
                            }
                        }
                        if (!z3) {
                            this.m = 0;
                            c(this.l);
                        } else {
                            byte[] bArr4 = new byte[i5];
                            this.n = bArr4;
                            System.arraycopy(b, i4, bArr4, 0, i5);
                        }
                    }
                    int i10 = this.m;
                    if (i10 != 0) {
                        byte[] bArr5 = this.l;
                        byte[] bArr6 = this.n;
                        if (i10 > bArr5.length) {
                            z = bArr5.length <= bArr6.length;
                            for (int i11 = 0; i11 != this.l.length; i11++) {
                                if (bArr5[i11] != bArr6[i11]) {
                                    z = false;
                                }
                            }
                        } else {
                            z = i10 == bArr6.length;
                            for (int i12 = 0; i12 != bArr6.length; i12++) {
                                if (bArr5[i12] != bArr6[i12]) {
                                    z = false;
                                }
                            }
                        }
                        if (!z) {
                            this.m = 0;
                            c(this.l);
                        }
                    }
                    c(this.l);
                    c(b);
                    this.m = 0;
                    return true;
                }
            }
            c(b);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public byte[] b() throws CryptoException {
        int i2;
        int i3;
        int i4;
        byte b;
        int digestSize = this.g.getDigestSize();
        if (this.i == 188) {
            byte[] bArr = this.k;
            i2 = (bArr.length - digestSize) - 1;
            this.g.doFinal(bArr, i2);
            byte[] bArr2 = this.k;
            bArr2[bArr2.length - 1] = -68;
            i3 = 8;
        } else {
            i3 = 16;
            byte[] bArr3 = this.k;
            int length = (bArr3.length - digestSize) - 2;
            this.g.doFinal(bArr3, length);
            byte[] bArr4 = this.k;
            int i5 = this.i;
            bArr4[bArr4.length - 2] = (byte) (i5 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i5;
            i2 = length;
        }
        int i6 = this.m;
        int i7 = ((((digestSize + i6) * 8) + i3) + 4) - this.j;
        if (i7 > 0) {
            int i8 = i6 - ((i7 + 7) / 8);
            b = 96;
            i4 = i2 - i8;
            System.arraycopy(this.l, 0, this.k, i4, i8);
            this.n = new byte[i8];
        } else {
            b = 64;
            i4 = i2 - i6;
            System.arraycopy(this.l, 0, this.k, i4, i6);
            this.n = new byte[this.m];
        }
        int i9 = i4 - 1;
        if (i9 > 0) {
            for (int i10 = i9; i10 != 0; i10--) {
                this.k[i10] = -69;
            }
            byte[] bArr5 = this.k;
            bArr5[i9] = (byte) (bArr5[i9] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (bArr5[0] | b);
        } else {
            byte[] bArr6 = this.k;
            bArr6[0] = 10;
            bArr6[0] = (byte) (bArr6[0] | b);
        }
        a aVar = this.h;
        byte[] bArr7 = this.k;
        byte[] b2 = aVar.b(bArr7, 0, bArr7.length);
        byte b3 = b & 32;
        byte[] bArr8 = this.l;
        byte[] bArr9 = this.n;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.m = 0;
        c(this.l);
        c(this.k);
        return b2;
    }

    public final void c(byte[] bArr) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            bArr[i2] = 0;
        }
    }

    public void init(boolean z, i iVar) {
        k1 k1Var = (k1) iVar;
        this.h.init(z, k1Var);
        int bitLength = k1Var.x.bitLength();
        this.j = bitLength;
        int i2 = (bitLength + 7) / 8;
        this.k = new byte[i2];
        if (this.i == 188) {
            this.l = new byte[((i2 - this.g.getDigestSize()) - 2)];
        } else {
            this.l = new byte[((i2 - this.g.getDigestSize()) - 3)];
        }
        this.g.reset();
        this.m = 0;
        c(this.l);
        byte[] bArr = this.n;
        if (bArr != null) {
            c(bArr);
        }
        this.n = null;
    }

    public void update(byte b) {
        this.g.update(b);
        int i2 = this.m;
        byte[] bArr = this.l;
        if (i2 < bArr.length) {
            bArr[i2] = b;
        }
        this.m = i2 + 1;
    }

    public void update(byte[] bArr, int i2, int i3) {
        while (i3 > 0 && this.m < this.l.length) {
            update(bArr[i2]);
            i2++;
            i3--;
        }
        this.g.update(bArr, i2, i3);
        this.m += i3;
    }
}
