package s0.a.b.i0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.w;

public class f extends s0.a.b.f {
    public int g;

    public f(e eVar) {
        if (!(eVar instanceof w)) {
            this.d = eVar;
            int b = eVar.b();
            this.g = b;
            this.a = new byte[(b * 2)];
            this.b = 0;
            return;
        }
        throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
    }

    public int a(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        if (this.b + i <= bArr.length) {
            int b = this.d.b();
            int i2 = this.b;
            int i3 = i2 - b;
            byte[] bArr2 = new byte[b];
            if (this.c) {
                if (i2 >= b) {
                    this.d.a(this.a, 0, bArr2, 0);
                    int i4 = this.b;
                    if (i4 > b) {
                        while (true) {
                            byte[] bArr3 = this.a;
                            if (i4 == bArr3.length) {
                                break;
                            }
                            bArr3[i4] = bArr2[i4 - b];
                            i4++;
                        }
                        for (int i5 = b; i5 != this.b; i5++) {
                            byte[] bArr4 = this.a;
                            bArr4[i5] = (byte) (bArr4[i5] ^ bArr2[i5 - b]);
                        }
                        e eVar = this.d;
                        if (eVar instanceof c) {
                            ((c) eVar).e.a(this.a, b, bArr, i);
                        } else {
                            eVar.a(this.a, b, bArr, i);
                        }
                        System.arraycopy(bArr2, 0, bArr, i + b, i3);
                        int i6 = this.b;
                        h();
                        return i6;
                    }
                } else {
                    throw new DataLengthException("need at least one block of input for CTS");
                }
            } else if (i2 >= b) {
                byte[] bArr5 = new byte[b];
                if (i2 > b) {
                    e eVar2 = this.d;
                    if (eVar2 instanceof c) {
                        ((c) eVar2).e.a(this.a, 0, bArr2, 0);
                    } else {
                        eVar2.a(this.a, 0, bArr2, 0);
                    }
                    for (int i7 = b; i7 != this.b; i7++) {
                        int i8 = i7 - b;
                        bArr5[i8] = (byte) (bArr2[i8] ^ this.a[i7]);
                    }
                    System.arraycopy(this.a, b, bArr2, 0, i3);
                    this.d.a(bArr2, 0, bArr, i);
                    System.arraycopy(bArr5, 0, bArr, i + b, i3);
                    int i62 = this.b;
                    h();
                    return i62;
                }
                this.d.a(this.a, 0, bArr2, 0);
            } else {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            System.arraycopy(bArr2, 0, bArr, i, b);
            int i622 = this.b;
            h();
            return i622;
        }
        throw new OutputLengthException("output buffer to small in doFinal");
    }

    public int c(int i) {
        return i + this.b;
    }

    public int d(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    public int f(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = this.b;
        byte[] bArr2 = this.a;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int a = this.d.a(bArr2, 0, bArr, i);
            byte[] bArr3 = this.a;
            int i4 = this.g;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            this.b = this.g;
            i3 = a;
        }
        byte[] bArr4 = this.a;
        int i5 = this.b;
        this.b = i5 + 1;
        bArr4[i5] = b;
        return i3;
    }

    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (i2 >= 0) {
            int b = b();
            int d = d(i2);
            if (d <= 0 || d + i3 <= bArr2.length) {
                byte[] bArr3 = this.a;
                int length = bArr3.length;
                int i4 = this.b;
                int i5 = length - i4;
                int i6 = 0;
                if (i2 > i5) {
                    System.arraycopy(bArr, i, bArr3, i4, i5);
                    int a = this.d.a(this.a, 0, bArr2, i3) + 0;
                    byte[] bArr4 = this.a;
                    System.arraycopy(bArr4, b, bArr4, 0, b);
                    this.b = b;
                    i2 -= i5;
                    i += i5;
                    while (i2 > b) {
                        System.arraycopy(bArr, i, this.a, this.b, b);
                        a += this.d.a(this.a, 0, bArr2, i3 + a);
                        byte[] bArr5 = this.a;
                        System.arraycopy(bArr5, b, bArr5, 0, b);
                        i2 -= b;
                        i += b;
                    }
                    i6 = a;
                }
                System.arraycopy(bArr, i, this.a, this.b, i2);
                this.b += i2;
                return i6;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
