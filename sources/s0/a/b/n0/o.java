package s0.a.b.n0;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Objects;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.a;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k0.d1;
import s0.a.b.k0.i1;
import s0.a.b.k0.k1;
import s0.a.b.n;
import s0.a.b.v;

public class o implements v {
    public n g;
    public n h;
    public a i;
    public SecureRandom j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public byte r;

    public o(a aVar, n nVar, n nVar2, int i2, byte b) {
        this.i = aVar;
        this.g = nVar;
        this.h = nVar2;
        this.k = nVar.getDigestSize();
        this.l = nVar2.getDigestSize();
        this.m = i2;
        this.o = new byte[i2];
        this.p = new byte[(i2 + 8 + this.k)];
        this.r = b;
    }

    public boolean a(byte[] bArr) {
        n nVar = this.g;
        byte[] bArr2 = this.p;
        nVar.doFinal(bArr2, (bArr2.length - this.k) - this.m);
        try {
            byte[] b = this.i.b(bArr, 0, bArr.length);
            byte[] bArr3 = this.q;
            Arrays.fill(bArr3, 0, bArr3.length - b.length, (byte) 0);
            byte[] bArr4 = this.q;
            System.arraycopy(b, 0, bArr4, bArr4.length - b.length, b.length);
            byte[] bArr5 = this.q;
            int length = 255 >>> ((bArr5.length * 8) - this.n);
            if ((255 & bArr5[0]) == (bArr5[0] & length) && bArr5[bArr5.length - 1] == this.r) {
                int length2 = bArr5.length;
                int i2 = this.k;
                byte[] e = e(bArr5, (length2 - i2) - 1, i2, (bArr5.length - i2) - 1);
                for (int i3 = 0; i3 != e.length; i3++) {
                    byte[] bArr6 = this.q;
                    bArr6[i3] = (byte) (bArr6[i3] ^ e[i3]);
                }
                byte[] bArr7 = this.q;
                bArr7[0] = (byte) (length & bArr7[0]);
                int i4 = 0;
                while (true) {
                    byte[] bArr8 = this.q;
                    int length3 = bArr8.length;
                    int i5 = this.k;
                    int i6 = this.m;
                    if (i4 != ((length3 - i5) - i6) - 2) {
                        if (bArr8[i4] != 0) {
                            d(bArr8);
                            return false;
                        }
                        i4++;
                    } else if (bArr8[((bArr8.length - i5) - i6) - 2] != 1) {
                        d(bArr8);
                        return false;
                    } else {
                        byte[] bArr9 = this.p;
                        System.arraycopy(bArr8, ((bArr8.length - i6) - i5) - 1, bArr9, bArr9.length - i6, i6);
                        n nVar2 = this.g;
                        byte[] bArr10 = this.p;
                        nVar2.update(bArr10, 0, bArr10.length);
                        n nVar3 = this.g;
                        byte[] bArr11 = this.p;
                        nVar3.doFinal(bArr11, bArr11.length - this.k);
                        int length4 = this.q.length;
                        int i7 = this.k;
                        int i8 = (length4 - i7) - 1;
                        int length5 = this.p.length - i7;
                        while (true) {
                            byte[] bArr12 = this.p;
                            if (length5 == bArr12.length) {
                                d(bArr12);
                                d(this.q);
                                return true;
                            } else if ((this.q[i8] ^ bArr12[length5]) != 0) {
                                d(bArr12);
                                d(this.q);
                                return false;
                            } else {
                                i8++;
                                length5++;
                            }
                        }
                    }
                }
            } else {
                d(bArr5);
                return false;
            }
        } catch (Exception unused) {
        }
    }

    public byte[] b() throws CryptoException, DataLengthException {
        n nVar = this.g;
        byte[] bArr = this.p;
        nVar.doFinal(bArr, (bArr.length - this.k) - this.m);
        if (this.m != 0) {
            this.j.nextBytes(this.o);
            byte[] bArr2 = this.o;
            byte[] bArr3 = this.p;
            int length = bArr3.length;
            int i2 = this.m;
            System.arraycopy(bArr2, 0, bArr3, length - i2, i2);
        }
        int i3 = this.k;
        byte[] bArr4 = new byte[i3];
        n nVar2 = this.g;
        byte[] bArr5 = this.p;
        nVar2.update(bArr5, 0, bArr5.length);
        this.g.doFinal(bArr4, 0);
        byte[] bArr6 = this.q;
        int length2 = bArr6.length;
        int i4 = this.m;
        int i5 = this.k;
        bArr6[(((length2 - i4) - 1) - i5) - 1] = 1;
        System.arraycopy(this.o, 0, bArr6, ((bArr6.length - i4) - i5) - 1, i4);
        byte[] e = e(bArr4, 0, i3, (this.q.length - this.k) - 1);
        for (int i6 = 0; i6 != e.length; i6++) {
            byte[] bArr7 = this.q;
            bArr7[i6] = (byte) (bArr7[i6] ^ e[i6]);
        }
        byte[] bArr8 = this.q;
        int length3 = bArr8.length;
        int i7 = this.k;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i7) - 1, i7);
        byte[] bArr9 = this.q;
        bArr9[0] = (byte) ((255 >>> ((bArr9.length * 8) - this.n)) & bArr9[0]);
        bArr9[bArr9.length - 1] = this.r;
        byte[] b = this.i.b(bArr9, 0, bArr9.length);
        d(this.q);
        return b;
    }

    public final void c(int i2, byte[] bArr) {
        bArr[0] = (byte) (i2 >>> 24);
        bArr[1] = (byte) (i2 >>> 16);
        bArr[2] = (byte) (i2 >>> 8);
        bArr[3] = (byte) (i2 >>> 0);
    }

    public final void d(byte[] bArr) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            bArr[i2] = 0;
        }
    }

    public final byte[] e(byte[] bArr, int i2, int i3, int i4) {
        int i5;
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = new byte[this.l];
        byte[] bArr4 = new byte[4];
        this.h.reset();
        int i6 = 0;
        while (true) {
            i5 = this.l;
            if (i6 >= i4 / i5) {
                break;
            }
            c(i6, bArr4);
            this.h.update(bArr, i2, i3);
            this.h.update(bArr4, 0, 4);
            this.h.doFinal(bArr3, 0);
            int i7 = this.l;
            System.arraycopy(bArr3, 0, bArr2, i6 * i7, i7);
            i6++;
        }
        if (i5 * i6 < i4) {
            c(i6, bArr4);
            this.h.update(bArr, i2, i3);
            this.h.update(bArr4, 0, 4);
            this.h.doFinal(bArr3, 0);
            int i8 = this.l;
            System.arraycopy(bArr3, 0, bArr2, i6 * i8, i4 - (i6 * i8));
        }
        return bArr2;
    }

    public void init(boolean z, i iVar) {
        i iVar2;
        k1 k1Var;
        if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            iVar2 = d1Var.d;
            this.j = d1Var.c;
        } else {
            if (z) {
                this.j = j.a();
            }
            iVar2 = iVar;
        }
        if (iVar2 instanceof i1) {
            Objects.requireNonNull((i1) iVar2);
            k1Var = null;
            this.i.init(z, iVar);
        } else {
            k1Var = (k1) iVar2;
            this.i.init(z, iVar2);
        }
        int bitLength = k1Var.x.bitLength() - 1;
        this.n = bitLength;
        if (bitLength >= (this.m * 8) + (this.k * 8) + 9) {
            this.q = new byte[((bitLength + 7) / 8)];
            this.g.reset();
            return;
        }
        throw new IllegalArgumentException("key too small for specified hash and salt lengths");
    }

    public void update(byte b) {
        this.g.update(b);
    }

    public void update(byte[] bArr, int i2, int i3) {
        this.g.update(bArr, i2, i3);
    }
}
