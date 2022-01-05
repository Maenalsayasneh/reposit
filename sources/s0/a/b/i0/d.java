package s0.a.b.i0;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.e.b.b0.c.h3;

public class d implements a {
    public e a;
    public int b;
    public boolean c;
    public byte[] d;
    public byte[] e;
    public int f;
    public i g;
    public byte[] h;
    public a i = new a(this);
    public a j = new a(this);

    public class a extends ByteArrayOutputStream {
        public a(d dVar) {
        }

        public byte[] a() {
            return this.buf;
        }
    }

    public d(e eVar) {
        this.a = eVar;
        int b2 = eVar.b();
        this.b = b2;
        this.h = new byte[b2];
        if (b2 != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    public byte[] a() {
        int i2 = this.f;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.h, 0, bArr, 0, i2);
        return bArr;
    }

    public void b(byte[] bArr, int i2, int i3) {
        this.i.write(bArr, i2, i3);
    }

    public final int c(byte[] bArr, int i2, int i3, byte[] bArr2) {
        s0.a.b.h0.a aVar = new s0.a.b.h0.a(this.a, this.f * 8, (s0.a.b.j0.a) null);
        aVar.init(this.g);
        byte[] bArr3 = new byte[16];
        if (e()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i4 = 2;
        bArr3[0] = (byte) (bArr3[0] | ((((aVar.f - 2) / 2) & 7) << 3));
        byte b2 = bArr3[0];
        byte[] bArr4 = this.d;
        bArr3[0] = (byte) (b2 | (((15 - bArr4.length) - 1) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i5 = i3;
        int i6 = 1;
        while (i5 > 0) {
            bArr3[16 - i6] = (byte) (i5 & 255);
            i5 >>>= 8;
            i6++;
        }
        aVar.update(bArr3, 0, 16);
        if (e()) {
            int size = this.i.size();
            byte[] bArr5 = this.e;
            int length = size + (bArr5 == null ? 0 : bArr5.length);
            if (length < 65280) {
                aVar.update((byte) (length >> 8));
                aVar.update((byte) length);
            } else {
                aVar.update((byte) -1);
                aVar.update((byte) -2);
                aVar.update((byte) (length >> 24));
                aVar.update((byte) (length >> 16));
                aVar.update((byte) (length >> 8));
                aVar.update((byte) length);
                i4 = 6;
            }
            byte[] bArr6 = this.e;
            if (bArr6 != null) {
                aVar.update(bArr6, 0, bArr6.length);
            }
            if (this.i.size() > 0) {
                aVar.update(this.i.a(), 0, this.i.size());
            }
            int i7 = (i4 + length) % 16;
            if (i7 != 0) {
                while (i7 != 16) {
                    aVar.update((byte) 0);
                    i7++;
                }
            }
        }
        aVar.update(bArr, i2, i3);
        return aVar.doFinal(bArr2, 0);
    }

    public final int d(boolean z, int i2) {
        if (!z || (i2 >= 32 && i2 <= 128 && (i2 & 15) == 0)) {
            return i2 >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException {
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] a2 = this.j.a();
        int size = this.j.size();
        if (this.g != null) {
            byte[] bArr2 = this.d;
            int length = 15 - bArr2.length;
            if (length >= 4 || size < (1 << (length * 8))) {
                byte[] bArr3 = new byte[this.b];
                bArr3[0] = (byte) ((length - 1) & 7);
                System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
                w wVar = new w(this.a);
                wVar.init(this.c, new c1(this.g, bArr3));
                if (this.c) {
                    i3 = this.f + size;
                    if (bArr.length >= i3 + i2) {
                        c(a2, 0, size, this.h);
                        byte[] bArr4 = new byte[this.b];
                        wVar.a(this.h, 0, bArr4, 0);
                        int i7 = i2;
                        int i8 = 0;
                        while (true) {
                            i5 = 0 + size;
                            i6 = this.b;
                            if (i8 >= i5 - i6) {
                                break;
                            }
                            wVar.a(a2, i8, bArr, i7);
                            int i9 = this.b;
                            i7 += i9;
                            i8 += i9;
                        }
                        byte[] bArr5 = new byte[i6];
                        int i10 = i5 - i8;
                        System.arraycopy(a2, i8, bArr5, 0, i10);
                        wVar.a(bArr5, 0, bArr5, 0);
                        System.arraycopy(bArr5, 0, bArr, i7, i10);
                        System.arraycopy(bArr4, 0, bArr, i2 + size, this.f);
                    } else {
                        throw new OutputLengthException("Output buffer too short.");
                    }
                } else {
                    int i11 = this.f;
                    if (size >= i11) {
                        int i12 = size - i11;
                        if (bArr.length >= i12 + i2) {
                            int i13 = 0 + i12;
                            System.arraycopy(a2, i13, this.h, 0, i11);
                            byte[] bArr6 = this.h;
                            wVar.a(bArr6, 0, bArr6, 0);
                            int i14 = this.f;
                            while (true) {
                                byte[] bArr7 = this.h;
                                if (i14 == bArr7.length) {
                                    break;
                                }
                                bArr7[i14] = 0;
                                i14++;
                            }
                            int i15 = i2;
                            int i16 = 0;
                            while (true) {
                                i4 = this.b;
                                if (i16 >= i13 - i4) {
                                    break;
                                }
                                wVar.a(a2, i16, bArr, i15);
                                int i17 = this.b;
                                i15 += i17;
                                i16 += i17;
                            }
                            byte[] bArr8 = new byte[i4];
                            int i18 = i12 - (i16 + 0);
                            System.arraycopy(a2, i16, bArr8, 0, i18);
                            wVar.a(bArr8, 0, bArr8, 0);
                            System.arraycopy(bArr8, 0, bArr, i15, i18);
                            byte[] bArr9 = new byte[this.b];
                            c(bArr, i2, i12, bArr9);
                            if (h3.U(this.h, bArr9)) {
                                i3 = i12;
                            } else {
                                throw new InvalidCipherTextException("mac check in CCM failed");
                            }
                        } else {
                            throw new OutputLengthException("Output buffer too short.");
                        }
                    } else {
                        throw new InvalidCipherTextException("data too short");
                    }
                }
                f();
                return i3;
            }
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        throw new IllegalStateException("CCM cipher unitialized.");
    }

    public final boolean e() {
        int size = this.i.size();
        byte[] bArr = this.e;
        return size + (bArr == null ? 0 : bArr.length) > 0;
    }

    public void f() {
        this.a.reset();
        this.i.reset();
        this.j.reset();
    }

    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/CCM";
    }

    public int getOutputSize(int i2) {
        int size = this.j.size() + i2;
        if (this.c) {
            return size + this.f;
        }
        int i3 = this.f;
        if (size < i3) {
            return 0;
        }
        return size - i3;
    }

    public e getUnderlyingCipher() {
        return this.a;
    }

    public int getUpdateOutputSize(int i2) {
        return 0;
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        i iVar2;
        this.c = z;
        if (iVar instanceof s0.a.b.k0.a) {
            s0.a.b.k0.a aVar = (s0.a.b.k0.a) iVar;
            this.d = aVar.b();
            this.e = aVar.a();
            this.f = d(z, aVar.x);
            iVar2 = aVar.q;
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.d = c1Var.c;
            this.e = null;
            this.f = d(z, 64);
            iVar2 = c1Var.d;
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.L0(iVar, i0.d.a.a.a.P0("invalid parameters passed to CCM: ")));
        }
        if (iVar2 != null) {
            this.g = iVar2;
        }
        byte[] bArr = this.d;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        f();
    }

    public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException, IllegalStateException {
        this.j.write(b2);
        return 0;
    }

    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i2 + i3) {
            this.j.write(bArr, i2, i3);
            return 0;
        }
        throw new DataLengthException("Input buffer too short");
    }
}
