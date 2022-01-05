package s0.a.b.i0;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.util.Arrays;
import java.util.Vector;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.a;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.e.b.b0.c.h3;

public class s implements a {
    public e a;
    public e b;
    public boolean c;
    public int d;
    public byte[] e;
    public Vector f;
    public byte[] g;
    public byte[] h;
    public byte[] i = null;
    public byte[] j = new byte[24];
    public byte[] k = new byte[16];
    public byte[] l;
    public byte[] m;
    public int n;
    public int o;
    public long p;
    public long q;
    public byte[] r;
    public byte[] s;
    public byte[] t = new byte[16];
    public byte[] u;
    public byte[] v;

    public s(e eVar, e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        } else if (eVar.b() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        } else if (eVar2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        } else if (eVar2.b() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        } else if (eVar.getAlgorithmName().equals(eVar2.getAlgorithmName())) {
            this.a = eVar;
            this.b = eVar2;
        } else {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
    }

    public static byte[] c(byte[] bArr) {
        int i2 = 16;
        byte[] bArr2 = new byte[16];
        int i3 = 0;
        while (true) {
            i2--;
            if (i2 >= 0) {
                byte b2 = bArr[i2] & 255;
                bArr2[i2] = (byte) (i3 | (b2 << 1));
                i3 = (b2 >>> 7) & 1;
            } else {
                bArr2[15] = (byte) (bArr2[15] ^ (PubNubErrorBuilder.PNERR_CRYPTO_ERROR >>> ((1 - i3) << 3)));
                return bArr2;
            }
        }
    }

    public static void d(byte[] bArr, int i2) {
        bArr[i2] = Byte.MIN_VALUE;
        while (true) {
            i2++;
            if (i2 < 16) {
                bArr[i2] = 0;
            } else {
                return;
            }
        }
    }

    public static int e(long j2) {
        if (j2 == 0) {
            return 64;
        }
        int i2 = 0;
        while ((1 & j2) == 0) {
            i2++;
            j2 >>>= 1;
        }
        return i2;
    }

    public static void j(byte[] bArr, byte[] bArr2) {
        for (int i2 = 15; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
    }

    public byte[] a() {
        byte[] bArr = this.v;
        return bArr == null ? new byte[this.d] : h3.I(bArr);
    }

    public void b(byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.l;
            int i5 = this.n;
            bArr2[i5] = bArr[i2 + i4];
            int i6 = i5 + 1;
            this.n = i6;
            if (i6 == bArr2.length) {
                long j2 = this.p + 1;
                this.p = j2;
                i(g(e(j2)));
                this.n = 0;
            }
        }
    }

    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException {
        byte[] bArr2;
        if (!this.c) {
            int i3 = this.o;
            int i4 = this.d;
            if (i3 >= i4) {
                int i5 = i3 - i4;
                this.o = i5;
                bArr2 = new byte[i4];
                System.arraycopy(this.m, i5, bArr2, 0, i4);
            } else {
                throw new InvalidCipherTextException("data too short");
            }
        } else {
            bArr2 = null;
        }
        int i6 = this.n;
        if (i6 > 0) {
            d(this.l, i6);
            i(this.g);
        }
        int i7 = this.o;
        if (i7 > 0) {
            if (this.c) {
                d(this.m, i7);
                j(this.u, this.m);
            }
            j(this.t, this.g);
            byte[] bArr3 = new byte[16];
            this.a.a(this.t, 0, bArr3, 0);
            j(this.m, bArr3);
            int length = bArr.length;
            int i8 = this.o;
            if (length >= i2 + i8) {
                System.arraycopy(this.m, 0, bArr, i2, i8);
                if (!this.c) {
                    d(this.m, this.o);
                    j(this.u, this.m);
                }
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        }
        j(this.u, this.t);
        j(this.u, this.h);
        e eVar = this.a;
        byte[] bArr4 = this.u;
        eVar.a(bArr4, 0, bArr4, 0);
        j(this.u, this.s);
        int i9 = this.d;
        byte[] bArr5 = new byte[i9];
        this.v = bArr5;
        System.arraycopy(this.u, 0, bArr5, 0, i9);
        int i10 = this.o;
        if (this.c) {
            int length2 = bArr.length;
            int i11 = i2 + i10;
            int i12 = this.d;
            if (length2 >= i11 + i12) {
                System.arraycopy(this.v, 0, bArr, i11, i12);
                i10 += this.d;
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (!h3.U(this.v, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        this.a.reset();
        this.b.reset();
        f(this.l);
        f(this.m);
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        f(this.r);
        f(this.s);
        System.arraycopy(this.k, 0, this.t, 0, 16);
        f(this.u);
        byte[] bArr6 = this.e;
        if (bArr6 != null) {
            b(bArr6, 0, bArr6.length);
        }
        return i10;
    }

    public void f(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public byte[] g(int i2) {
        while (i2 >= this.f.size()) {
            Vector vector = this.f;
            vector.addElement(c((byte[]) vector.lastElement()));
        }
        return (byte[]) this.f.elementAt(i2);
    }

    public String getAlgorithmName() {
        return this.b.getAlgorithmName() + "/OCB";
    }

    public int getOutputSize(int i2) {
        int i3 = i2 + this.o;
        if (this.c) {
            return i3 + this.d;
        }
        int i4 = this.d;
        if (i3 < i4) {
            return 0;
        }
        return i3 - i4;
    }

    public e getUnderlyingCipher() {
        return this.b;
    }

    public int getUpdateOutputSize(int i2) {
        int i3 = i2 + this.o;
        if (!this.c) {
            int i4 = this.d;
            if (i3 < i4) {
                return 0;
            }
            i3 -= i4;
        }
        return i3 - (i3 % 16);
    }

    public void h(byte[] bArr, int i2) {
        if (bArr.length >= i2 + 16) {
            if (this.c) {
                j(this.u, this.m);
                this.o = 0;
            }
            byte[] bArr2 = this.t;
            long j2 = this.q + 1;
            this.q = j2;
            j(bArr2, g(e(j2)));
            j(this.m, this.t);
            e eVar = this.b;
            byte[] bArr3 = this.m;
            eVar.a(bArr3, 0, bArr3, 0);
            j(this.m, this.t);
            System.arraycopy(this.m, 0, bArr, i2, 16);
            if (!this.c) {
                j(this.u, this.m);
                byte[] bArr4 = this.m;
                System.arraycopy(bArr4, 16, bArr4, 0, this.d);
                this.o = this.d;
                return;
            }
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    public void i(byte[] bArr) {
        j(this.r, bArr);
        j(this.l, this.r);
        e eVar = this.a;
        byte[] bArr2 = this.l;
        eVar.a(bArr2, 0, bArr2, 0);
        j(this.s, this.l);
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        y0 y0Var;
        byte[] bArr;
        boolean z2 = this.c;
        this.c = z;
        this.v = null;
        if (iVar instanceof a) {
            a aVar = (a) iVar;
            bArr = aVar.b();
            this.e = aVar.a();
            int i2 = aVar.x;
            if (i2 < 64 || i2 > 128 || i2 % 8 != 0) {
                throw new IllegalArgumentException(i0.d.a.a.a.e0("Invalid value for MAC size: ", i2));
            }
            this.d = i2 / 8;
            y0Var = aVar.q;
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            bArr = c1Var.c;
            this.e = null;
            this.d = 16;
            y0Var = (y0) c1Var.d;
        } else {
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        }
        this.l = new byte[16];
        this.m = new byte[(z ? 16 : this.d + 16)];
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length <= 15) {
            if (y0Var != null) {
                this.a.init(true, y0Var);
                this.b.init(z, y0Var);
                this.i = null;
            } else if (z2 != z) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
            byte[] bArr2 = new byte[16];
            this.g = bArr2;
            this.a.a(bArr2, 0, bArr2, 0);
            this.h = c(this.g);
            Vector vector = new Vector();
            this.f = vector;
            vector.addElement(c(this.h));
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, 0, bArr3, 16 - bArr.length, bArr.length);
            bArr3[0] = (byte) (this.d << 4);
            int length = 15 - bArr.length;
            bArr3[length] = (byte) (bArr3[length] | 1);
            byte b2 = bArr3[15] & 63;
            bArr3[15] = (byte) (bArr3[15] & 192);
            byte[] bArr4 = this.i;
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                byte[] bArr5 = new byte[16];
                this.i = bArr3;
                this.a.a(bArr3, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, this.j, 0, 16);
                int i3 = 0;
                while (i3 < 8) {
                    byte[] bArr6 = this.j;
                    int i4 = i3 + 16;
                    byte b3 = bArr5[i3];
                    i3++;
                    bArr6[i4] = (byte) (b3 ^ bArr5[i3]);
                }
            }
            int i5 = b2 % 8;
            int i6 = b2 / 8;
            if (i5 == 0) {
                System.arraycopy(this.j, i6, this.k, 0, 16);
            } else {
                for (int i7 = 0; i7 < 16; i7++) {
                    byte[] bArr7 = this.j;
                    i6++;
                    this.k[i7] = (byte) (((bArr7[i6] & 255) >>> (8 - i5)) | ((bArr7[i6] & 255) << i5));
                }
            }
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.r = new byte[16];
            this.s = new byte[16];
            System.arraycopy(this.k, 0, this.t, 0, 16);
            this.u = new byte[16];
            byte[] bArr8 = this.e;
            if (bArr8 != null) {
                b(bArr8, 0, bArr8.length);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("IV must be no more than 15 bytes");
    }

    public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException {
        byte[] bArr2 = this.m;
        int i3 = this.o;
        bArr2[i3] = b2;
        int i4 = i3 + 1;
        this.o = i4;
        if (i4 != bArr2.length) {
            return 0;
        }
        h(bArr, i2);
        return 16;
    }

    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException {
        if (bArr.length >= i2 + i3) {
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                byte[] bArr3 = this.m;
                int i7 = this.o;
                bArr3[i7] = bArr[i2 + i6];
                int i8 = i7 + 1;
                this.o = i8;
                if (i8 == bArr3.length) {
                    h(bArr2, i4 + i5);
                    i5 += 16;
                }
            }
            return i5;
        }
        throw new DataLengthException("Input buffer too short");
    }
}
