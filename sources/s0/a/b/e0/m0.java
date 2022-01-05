package s0.a.b.e0;

import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.d1;
import s0.a.b.k0.y0;
import s0.a.b.y;
import s0.a.e.b.b0.c.h3;

public class m0 implements y {
    public e a;
    public y0 b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public byte[] f = null;

    public m0(e eVar) {
        byte[] bArr = {-90, 89, 89, -90};
        this.d = bArr;
        this.e = bArr;
        this.a = eVar;
    }

    public byte[] a(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        if (!this.c) {
            int i3 = i2 / 8;
            if (i3 * 8 != i2) {
                throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
            } else if (i3 > 1) {
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                byte[] bArr4 = new byte[i2];
                if (i3 == 2) {
                    this.a.init(false, this.b);
                    int i4 = 0;
                    while (i4 < i2) {
                        this.a.a(bArr3, i4, bArr4, i4);
                        i4 += this.a.b();
                    }
                    byte[] bArr5 = new byte[8];
                    this.f = bArr5;
                    System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
                    byte[] bArr6 = this.f;
                    int length = i2 - bArr6.length;
                    bArr2 = new byte[length];
                    System.arraycopy(bArr4, bArr6.length, bArr2, 0, length);
                } else {
                    int i5 = i2 - 8;
                    byte[] bArr7 = new byte[i5];
                    byte[] bArr8 = new byte[8];
                    byte[] bArr9 = new byte[16];
                    System.arraycopy(bArr, i, bArr8, 0, 8);
                    System.arraycopy(bArr, i + 8, bArr7, 0, i5);
                    this.a.init(false, this.b);
                    int i6 = i3 - 1;
                    for (int i7 = 5; i7 >= 0; i7--) {
                        int i8 = i6;
                        while (i8 >= 1) {
                            System.arraycopy(bArr8, 0, bArr9, 0, 8);
                            int i9 = i8 - 1;
                            int i10 = i9 * 8;
                            System.arraycopy(bArr7, i10, bArr9, 8, 8);
                            int i11 = (i6 * i7) + i8;
                            int i12 = 1;
                            while (i11 != 0) {
                                int i13 = 8 - i12;
                                bArr9[i13] = (byte) (((byte) i11) ^ bArr9[i13]);
                                i11 >>>= 8;
                                i12++;
                            }
                            this.a.a(bArr9, 0, bArr9, 0);
                            System.arraycopy(bArr9, 0, bArr8, 0, 8);
                            System.arraycopy(bArr9, 8, bArr7, i10, 8);
                            i8 = i9;
                        }
                    }
                    this.f = bArr8;
                    bArr2 = bArr7;
                }
                int i14 = 4;
                byte[] bArr10 = new byte[4];
                byte[] bArr11 = new byte[4];
                System.arraycopy(this.f, 0, bArr10, 0, 4);
                System.arraycopy(this.f, 4, bArr11, 0, 4);
                int y = h3.y(bArr11, 0);
                boolean U = h3.U(bArr10, this.e);
                int length2 = bArr2.length;
                if (y <= length2 - 8) {
                    U = false;
                }
                if (y > length2) {
                    U = false;
                }
                int i15 = length2 - y;
                if (i15 >= 8 || i15 < 0) {
                    U = false;
                } else {
                    i14 = i15;
                }
                byte[] bArr12 = new byte[i14];
                System.arraycopy(bArr2, bArr2.length - i14, bArr12, 0, i14);
                if (!h3.U(bArr12, new byte[i14])) {
                    U = false;
                }
                if (U) {
                    byte[] bArr13 = new byte[y];
                    System.arraycopy(bArr2, 0, bArr13, 0, y);
                    return bArr13;
                }
                throw new InvalidCipherTextException("checksum failed");
            } else {
                throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
            }
        } else {
            throw new IllegalStateException("not set for unwrapping");
        }
    }

    public byte[] b(byte[] bArr, int i, int i2) {
        if (this.c) {
            byte[] bArr2 = new byte[8];
            byte[] C1 = h3.C1(i2);
            byte[] bArr3 = this.e;
            int i3 = 0;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            System.arraycopy(C1, 0, bArr2, this.e.length, C1.length);
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            int i4 = (8 - (i2 % 8)) % 8;
            int i5 = i2 + i4;
            byte[] bArr5 = new byte[i5];
            System.arraycopy(bArr4, 0, bArr5, 0, i2);
            if (i4 != 0) {
                System.arraycopy(new byte[i4], 0, bArr5, i2, i4);
            }
            if (i5 == 8) {
                int i6 = i5 + 8;
                byte[] bArr6 = new byte[i6];
                System.arraycopy(bArr2, 0, bArr6, 0, 8);
                System.arraycopy(bArr5, 0, bArr6, 8, i5);
                this.a.init(true, this.b);
                while (i3 < i6) {
                    this.a.a(bArr6, i3, bArr6, i3);
                    i3 += this.a.b();
                }
                return bArr6;
            }
            l0 l0Var = new l0(this.a);
            l0Var.init(true, new c1(this.b, bArr2));
            return l0Var.b(bArr5, 0, i5);
        }
        throw new IllegalStateException("not set for wrapping");
    }

    public String getAlgorithmName() {
        return this.a.getAlgorithmName();
    }

    public void init(boolean z, i iVar) {
        this.c = z;
        if (iVar instanceof d1) {
            iVar = ((d1) iVar).d;
        }
        if (iVar instanceof y0) {
            this.b = (y0) iVar;
            this.e = this.d;
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr = c1Var.c;
            this.e = bArr;
            this.b = (y0) c1Var.d;
            if (bArr.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }
}
