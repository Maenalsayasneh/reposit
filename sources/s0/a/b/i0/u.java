package s0.a.b.i0;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;

public class u implements e {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public e d;
    public int e;
    public int f;
    public boolean g;

    public u(e eVar) {
        this.d = eVar;
        int b2 = eVar.b();
        this.f = b2;
        this.a = new byte[b2];
        this.b = new byte[b2];
        this.c = new byte[b2];
    }

    public int a(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 2;
        if (this.g) {
            int i9 = this.f;
            if (i + i9 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            } else if (i2 + i9 <= bArr2.length) {
                int i10 = this.e;
                if (i10 > i9) {
                    byte[] bArr3 = this.b;
                    int i11 = i9 - 2;
                    byte c2 = c(bArr[i], i9 - 2);
                    bArr2[i2] = c2;
                    bArr3[i11] = c2;
                    byte[] bArr4 = this.b;
                    int i12 = this.f;
                    int i13 = i12 - 1;
                    byte c3 = c(bArr[i + 1], i12 - 1);
                    bArr2[i2 + 1] = c3;
                    bArr4[i13] = c3;
                    this.d.a(this.b, 0, this.c, 0);
                    while (i8 < this.f) {
                        byte[] bArr5 = this.b;
                        int i14 = i8 - 2;
                        byte c4 = c(bArr[i + i8], i14);
                        bArr2[i2 + i8] = c4;
                        bArr5[i14] = c4;
                        i8++;
                    }
                } else {
                    if (i10 != 0) {
                        if (i10 == i9) {
                            this.d.a(this.b, 0, this.c, 0);
                            bArr2[i2] = c(bArr[i], 0);
                            bArr2[i2 + 1] = c(bArr[i + 1], 1);
                            byte[] bArr6 = this.b;
                            System.arraycopy(bArr6, 2, bArr6, 0, this.f - 2);
                            System.arraycopy(bArr2, i2, this.b, this.f - 2, 2);
                            this.d.a(this.b, 0, this.c, 0);
                            while (true) {
                                i6 = this.f;
                                if (i8 >= i6) {
                                    break;
                                }
                                byte[] bArr7 = this.b;
                                int i15 = i8 - 2;
                                byte c5 = c(bArr[i + i8], i15);
                                bArr2[i2 + i8] = c5;
                                bArr7[i15] = c5;
                                i8++;
                            }
                        }
                    } else {
                        this.d.a(this.b, 0, this.c, 0);
                        while (true) {
                            i6 = this.f;
                            if (i7 >= i6) {
                                break;
                            }
                            byte[] bArr8 = this.b;
                            byte c6 = c(bArr[i + i7], i7);
                            bArr2[i2 + i7] = c6;
                            bArr8[i7] = c6;
                            i7++;
                        }
                    }
                    this.e += i6;
                }
                return this.f;
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        } else {
            int i16 = this.f;
            if (i + i16 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            } else if (i2 + i16 <= bArr2.length) {
                int i17 = this.e;
                if (i17 > i16) {
                    byte b2 = bArr[i];
                    this.b[i16 - 2] = b2;
                    bArr2[i2] = c(b2, i16 - 2);
                    byte b3 = bArr[i + 1];
                    byte[] bArr9 = this.b;
                    int i18 = this.f;
                    bArr9[i18 - 1] = b3;
                    bArr2[i2 + 1] = c(b3, i18 - 1);
                    this.d.a(this.b, 0, this.c, 0);
                    while (i8 < this.f) {
                        byte b4 = bArr[i + i8];
                        int i19 = i8 - 2;
                        this.b[i19] = b4;
                        bArr2[i2 + i8] = c(b4, i19);
                        i8++;
                    }
                } else {
                    if (i17 == 0) {
                        this.d.a(this.b, 0, this.c, 0);
                        while (true) {
                            i5 = this.f;
                            if (i7 >= i5) {
                                break;
                            }
                            int i20 = i + i7;
                            this.b[i7] = bArr[i20];
                            bArr2[i7] = c(bArr[i20], i7);
                            i7++;
                        }
                        i3 = this.e + i5;
                    } else if (i17 == i16) {
                        this.d.a(this.b, 0, this.c, 0);
                        byte b5 = bArr[i];
                        byte b6 = bArr[i + 1];
                        bArr2[i2] = c(b5, 0);
                        bArr2[i2 + 1] = c(b6, 1);
                        byte[] bArr10 = this.b;
                        System.arraycopy(bArr10, 2, bArr10, 0, this.f - 2);
                        byte[] bArr11 = this.b;
                        int i21 = this.f;
                        bArr11[i21 - 2] = b5;
                        bArr11[i21 - 1] = b6;
                        this.d.a(bArr11, 0, this.c, 0);
                        while (true) {
                            i4 = this.f;
                            if (i8 >= i4) {
                                break;
                            }
                            byte b7 = bArr[i + i8];
                            int i22 = i8 - 2;
                            this.b[i22] = b7;
                            bArr2[i2 + i8] = c(b7, i22);
                            i8++;
                        }
                        i3 = this.e + i4;
                    }
                    this.e = i3;
                }
                return this.f;
            } else {
                throw new OutputLengthException("output buffer too short");
            }
        }
    }

    public int b() {
        return this.d.b();
    }

    public final byte c(byte b2, int i) {
        return (byte) (b2 ^ this.c[i]);
    }

    public String getAlgorithmName() {
        return this.d.getAlgorithmName() + "/OpenPGPCFB";
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        this.g = z;
        reset();
        this.d.init(true, iVar);
    }

    public void reset() {
        this.e = 0;
        byte[] bArr = this.a;
        byte[] bArr2 = this.b;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.d.reset();
    }
}
