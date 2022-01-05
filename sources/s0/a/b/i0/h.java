package s0.a.b.i0;

import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.h0.c;
import s0.a.b.i;
import s0.a.b.k0.a;
import s0.a.b.k0.c1;
import s0.a.b.s;

public class h implements a {
    public w a;
    public boolean b;
    public int c;
    public s d;
    public byte[] e;
    public byte[] f;
    public byte[] g = new byte[this.c];
    public int h;
    public byte[] i;
    public int j;
    public boolean k;
    public byte[] l;

    public h(e eVar) {
        this.c = eVar.b();
        c cVar = new c(eVar);
        this.d = cVar;
        this.f = new byte[cVar.getMacSize()];
        this.e = new byte[this.d.getMacSize()];
        this.a = new w(eVar);
    }

    public byte[] a() {
        int i2 = this.h;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.g, 0, bArr, 0, i2);
        return bArr;
    }

    public void b(byte[] bArr, int i2, int i3) {
        if (!this.k) {
            this.d.update(bArr, i2, i3);
            return;
        }
        throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    public final void c() {
        byte[] bArr = new byte[this.c];
        int i2 = 0;
        this.d.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.g;
            if (i2 < bArr2.length) {
                bArr2[i2] = (byte) ((this.e[i2] ^ this.f[i2]) ^ bArr[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        if (!this.k) {
            this.k = true;
            this.d.doFinal(this.f, 0);
            int i2 = this.c;
            byte[] bArr = new byte[i2];
            bArr[i2 - 1] = 2;
            this.d.update(bArr, 0, i2);
        }
    }

    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, InvalidCipherTextException {
        d();
        int i3 = this.j;
        byte[] bArr2 = this.i;
        byte[] bArr3 = new byte[bArr2.length];
        this.j = 0;
        if (this.b) {
            int i4 = i2 + i3;
            if (bArr.length >= this.h + i4) {
                this.a.a(bArr2, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i2, i3);
                this.d.update(bArr3, 0, i3);
                c();
                System.arraycopy(this.g, 0, bArr, i4, this.h);
                f(false);
                return i3 + this.h;
            }
            throw new OutputLengthException("Output buffer too short");
        }
        int i5 = this.h;
        if (i3 < i5) {
            throw new InvalidCipherTextException("data too short");
        } else if (bArr.length >= (i2 + i3) - i5) {
            if (i3 > i5) {
                this.d.update(bArr2, 0, i3 - i5);
                this.a.a(this.i, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i2, i3 - this.h);
            }
            c();
            byte[] bArr4 = this.i;
            int i6 = i3 - this.h;
            byte b2 = 0;
            for (int i7 = 0; i7 < this.h; i7++) {
                b2 |= this.g[i7] ^ bArr4[i6 + i7];
            }
            if (b2 == 0) {
                f(false);
                return i3 - this.h;
            }
            throw new InvalidCipherTextException("mac check in EAX failed");
        } else {
            throw new OutputLengthException("Output buffer too short");
        }
    }

    public final int e(byte b2, byte[] bArr, int i2) {
        int i3;
        byte[] bArr2 = this.i;
        int i4 = this.j;
        int i5 = i4 + 1;
        this.j = i5;
        bArr2[i4] = b2;
        if (i5 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i6 = this.c;
        if (length >= i2 + i6) {
            if (this.b) {
                i3 = this.a.a(bArr2, 0, bArr, i2);
                this.d.update(bArr, i2, this.c);
            } else {
                this.d.update(bArr2, 0, i6);
                i3 = this.a.a(this.i, 0, bArr, i2);
            }
            this.j = 0;
            if (!this.b) {
                byte[] bArr3 = this.i;
                System.arraycopy(bArr3, this.c, bArr3, 0, this.h);
                this.j = this.h;
            }
            return i3;
        }
        throw new OutputLengthException("Output buffer is too short");
    }

    public final void f(boolean z) {
        this.a.reset();
        this.d.reset();
        this.j = 0;
        Arrays.fill(this.i, (byte) 0);
        if (z) {
            Arrays.fill(this.g, (byte) 0);
        }
        int i2 = this.c;
        byte[] bArr = new byte[i2];
        bArr[i2 - 1] = 1;
        this.d.update(bArr, 0, i2);
        this.k = false;
        byte[] bArr2 = this.l;
        if (bArr2 != null) {
            this.d.update(bArr2, 0, bArr2.length);
        }
    }

    public String getAlgorithmName() {
        return this.a.a.getAlgorithmName() + "/EAX";
    }

    public int getOutputSize(int i2) {
        int i3 = i2 + this.j;
        if (this.b) {
            return i3 + this.h;
        }
        int i4 = this.h;
        if (i3 < i4) {
            return 0;
        }
        return i3 - i4;
    }

    public e getUnderlyingCipher() {
        return this.a.a;
    }

    public int getUpdateOutputSize(int i2) {
        int i3 = i2 + this.j;
        if (!this.b) {
            int i4 = this.h;
            if (i3 < i4) {
                return 0;
            }
            i3 -= i4;
        }
        return i3 - (i3 % this.c);
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        i iVar2;
        byte[] bArr;
        this.b = z;
        if (iVar instanceof a) {
            a aVar = (a) iVar;
            bArr = aVar.b();
            this.l = aVar.a();
            this.h = aVar.x / 8;
            iVar2 = aVar.q;
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            bArr = c1Var.c;
            this.l = null;
            this.h = this.d.getMacSize() / 2;
            iVar2 = c1Var.d;
        } else {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        this.i = new byte[(z ? this.c : this.c + this.h)];
        byte[] bArr2 = new byte[this.c];
        this.d.init(iVar2);
        int i2 = this.c;
        bArr2[i2 - 1] = 0;
        this.d.update(bArr2, 0, i2);
        this.d.update(bArr, 0, bArr.length);
        this.d.doFinal(this.e, 0);
        this.a.init(true, new c1((i) null, this.e));
        f(true);
    }

    public int processByte(byte b2, byte[] bArr, int i2) throws DataLengthException {
        d();
        return e(b2, bArr, i2);
    }

    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException {
        d();
        if (bArr.length >= i2 + i3) {
            int i5 = 0;
            for (int i6 = 0; i6 != i3; i6++) {
                i5 += e(bArr[i2 + i6], bArr2, i4 + i5);
            }
            return i5;
        }
        throw new DataLengthException("Input buffer too short");
    }
}
