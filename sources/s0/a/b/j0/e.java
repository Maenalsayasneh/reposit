package s0.a.b.j0;

import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.f;
import s0.a.b.i;
import s0.a.b.k0.d1;

public class e extends f {
    public a g;

    public e(s0.a.b.e eVar) {
        d dVar = new d();
        this.d = eVar;
        this.g = dVar;
        this.a = new byte[eVar.b()];
        this.b = 0;
    }

    public e(s0.a.b.e eVar, a aVar) {
        this.d = eVar;
        this.g = aVar;
        this.a = new byte[eVar.b()];
        this.b = 0;
    }

    /* JADX INFO: finally extract failed */
    public int a(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        int i2;
        int b = this.d.b();
        if (this.c) {
            if (this.b != b) {
                i2 = 0;
            } else if ((b * 2) + i <= bArr.length) {
                i2 = this.d.a(this.a, 0, bArr, i);
                this.b = 0;
            } else {
                h();
                throw new OutputLengthException("output buffer too short");
            }
            this.g.a(this.a, this.b);
            int a = this.d.a(this.a, 0, bArr, i + i2) + i2;
            h();
            return a;
        } else if (this.b == b) {
            s0.a.b.e eVar = this.d;
            byte[] bArr2 = this.a;
            int a2 = eVar.a(bArr2, 0, bArr2, 0);
            this.b = 0;
            try {
                int b2 = a2 - this.g.b(this.a);
                System.arraycopy(this.a, 0, bArr, i, b2);
                h();
                return b2;
            } catch (Throwable th) {
                h();
                throw th;
            }
        } else {
            h();
            throw new DataLengthException("last block incomplete in decryption");
        }
    }

    public int c(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!this.c) {
            return i2;
        }
        return i2 + bArr.length;
    }

    public int d(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.a;
        int length = i2 % bArr.length;
        return length == 0 ? Math.max(0, i2 - bArr.length) : i2 - length;
    }

    public void e(boolean z, i iVar) throws IllegalArgumentException {
        s0.a.b.e eVar;
        this.c = z;
        h();
        if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.g.c(d1Var.c);
            eVar = this.d;
            iVar = d1Var.d;
        } else {
            this.g.c((SecureRandom) null);
            eVar = this.d;
        }
        eVar.init(z, iVar);
    }

    public int f(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = this.b;
        byte[] bArr2 = this.a;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int a = this.d.a(bArr2, 0, bArr, i);
            this.b = 0;
            i3 = a;
        }
        byte[] bArr3 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        bArr3[i4] = b;
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
                    this.b = 0;
                    i2 -= i5;
                    i += i5;
                    i6 = this.d.a(this.a, 0, bArr2, i3) + 0;
                    while (i2 > this.a.length) {
                        i6 += this.d.a(bArr, i, bArr2, i3 + i6);
                        i2 -= b;
                        i += b;
                    }
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
