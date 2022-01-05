package s0.a.b.i0;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.f;
import s0.a.b.i;
import s0.a.b.i0.y.b;
import s0.a.b.i0.y.c;
import s0.a.b.i0.y.d;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.e.b.b0.c.h3;

public class r implements a {
    public e a;
    public f b;
    public int c;
    public boolean d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public s0.a.b.i0.y.a h;
    public long[] i;
    public final int j;
    public a k = new a(this);
    public a l = new a(this);

    public class a extends ByteArrayOutputStream {
        public a(r rVar) {
        }

        public byte[] a() {
            return this.buf;
        }
    }

    public r(e eVar) {
        s0.a.b.i0.y.a aVar;
        this.a = eVar;
        this.b = new f(new q(eVar));
        this.c = -1;
        int b2 = this.a.b();
        this.j = b2;
        this.e = new byte[b2];
        this.g = new byte[b2];
        if (b2 == 16) {
            aVar = new c();
        } else if (b2 == 32) {
            aVar = new d();
        } else if (b2 == 64) {
            aVar = new b();
        } else {
            throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
        }
        this.h = aVar;
        this.i = new long[(b2 >>> 3)];
        this.f = null;
    }

    public static void e(long[] jArr, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3] = jArr[i3] ^ h3.i2(bArr, i2);
            i2 += 8;
        }
    }

    public byte[] a() {
        int i2 = this.c;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f, 0, bArr, 0, i2);
        return bArr;
    }

    public void b(byte[] bArr, int i2, int i3) {
        this.k.write(bArr, i2, i3);
    }

    public final void c(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        while (i2 < i5) {
            e(this.i, bArr, i2);
            this.h.a(this.i);
            i2 += this.j;
        }
        long[] jArr = this.i;
        jArr[0] = ((((long) i4) & 4294967295L) << 3) ^ jArr[0];
        int i6 = this.j >>> 4;
        jArr[i6] = jArr[i6] ^ ((4294967295L & ((long) i3)) << 3);
        byte[] bArr2 = new byte[(jArr.length * 8)];
        h3.n2(jArr, bArr2, 0);
        this.f = bArr2;
        this.a.a(bArr2, 0, bArr2, 0);
    }

    public void d() {
        Arrays.fill(this.i, 0);
        this.a.reset();
        this.l.reset();
        this.k.reset();
        byte[] bArr = this.e;
        if (bArr != null) {
            this.k.write(bArr, 0, bArr.length);
        }
    }

    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException {
        int i3;
        int size = this.l.size();
        if (this.d || size >= this.c) {
            byte[] bArr2 = new byte[this.j];
            this.a.a(bArr2, 0, bArr2, 0);
            long[] jArr = new long[(this.j >>> 3)];
            h3.j2(bArr2, 0, jArr);
            this.h.b(jArr);
            Arrays.fill(bArr2, (byte) 0);
            Arrays.fill(jArr, 0);
            int size2 = this.k.size();
            if (size2 > 0) {
                byte[] a2 = this.k.a();
                int i4 = size2 + 0;
                int i5 = 0;
                while (i5 < i4) {
                    e(this.i, a2, i5);
                    this.h.a(this.i);
                    i5 += this.j;
                }
            }
            if (!this.d) {
                int i6 = size - this.c;
                if (bArr.length - i2 >= i6) {
                    c(this.l.a(), 0, i6, size2);
                    int g2 = this.b.g(this.l.a(), 0, i6, bArr, i2);
                    i3 = this.b.a(bArr, i2 + g2) + g2;
                } else {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else if ((bArr.length - i2) - this.c >= size) {
                int g3 = this.b.g(this.l.a(), 0, size, bArr, i2);
                i3 = this.b.a(bArr, i2 + g3) + g3;
                c(bArr, i2, size, size2);
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
            byte[] bArr3 = this.f;
            if (bArr3 == null) {
                throw new IllegalStateException("mac is not calculated");
            } else if (this.d) {
                System.arraycopy(bArr3, 0, bArr, i2 + i3, this.c);
                d();
                return i3 + this.c;
            } else {
                byte[] bArr4 = new byte[this.c];
                byte[] a3 = this.l.a();
                int i7 = this.c;
                System.arraycopy(a3, size - i7, bArr4, 0, i7);
                int i8 = this.c;
                byte[] bArr5 = new byte[i8];
                System.arraycopy(this.f, 0, bArr5, 0, i8);
                if (h3.U(bArr4, bArr5)) {
                    d();
                    return i3;
                }
                throw new InvalidCipherTextException("mac verification failed");
            }
        } else {
            throw new InvalidCipherTextException("data too short");
        }
    }

    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/KGCM";
    }

    public int getOutputSize(int i2) {
        int size = this.l.size() + i2;
        if (this.d) {
            return size + this.c;
        }
        int i3 = this.c;
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
        y0 y0Var;
        this.d = z;
        if (iVar instanceof s0.a.b.k0.a) {
            s0.a.b.k0.a aVar = (s0.a.b.k0.a) iVar;
            byte[] b2 = aVar.b();
            byte[] bArr = this.g;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(b2, 0, this.g, bArr.length - b2.length, b2.length);
            byte[] a2 = aVar.a();
            this.e = a2;
            int i2 = aVar.x;
            if (i2 < 64 || i2 > (this.j << 3) || (i2 & 7) != 0) {
                throw new IllegalArgumentException(i0.d.a.a.a.e0("Invalid value for MAC size: ", i2));
            }
            this.c = i2 >>> 3;
            y0Var = aVar.q;
            if (a2 != null) {
                this.k.write(a2, 0, a2.length);
            }
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            byte[] bArr2 = c1Var.c;
            byte[] bArr3 = this.g;
            Arrays.fill(bArr3, (byte) 0);
            System.arraycopy(bArr2, 0, this.g, bArr3.length - bArr2.length, bArr2.length);
            this.e = null;
            this.c = this.j;
            y0Var = (y0) c1Var.d;
        } else {
            throw new IllegalArgumentException("Invalid parameter passed");
        }
        this.f = new byte[this.j];
        this.b.e(true, new c1(y0Var, this.g));
        this.a.init(true, y0Var);
    }

    public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException, IllegalStateException {
        this.l.write(b2);
        return 0;
    }

    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException, IllegalStateException {
        if (bArr.length >= i2 + i3) {
            this.l.write(bArr, i2, i3);
            return 0;
        }
        throw new DataLengthException("input buffer too short");
    }
}
