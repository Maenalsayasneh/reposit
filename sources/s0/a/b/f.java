package s0.a.b;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

public class f {
    public byte[] a;
    public int b;
    public boolean c;
    public e d;
    public boolean e;
    public boolean f;

    public f() {
    }

    public f(e eVar) {
        this.d = eVar;
        this.a = new byte[eVar.b()];
        boolean z = false;
        this.b = 0;
        String algorithmName = eVar.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.f = z2;
        if (z2 || (eVar instanceof x)) {
            this.e = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z = true;
        }
        this.e = z;
    }

    public int a(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        try {
            int i2 = this.b;
            if (i + i2 <= bArr.length) {
                int i3 = 0;
                if (i2 != 0) {
                    if (this.e) {
                        e eVar = this.d;
                        byte[] bArr2 = this.a;
                        eVar.a(bArr2, 0, bArr2, 0);
                        int i4 = this.b;
                        this.b = 0;
                        System.arraycopy(this.a, 0, bArr, i, i4);
                        i3 = i4;
                    } else {
                        throw new DataLengthException("data not block size aligned");
                    }
                }
                return i3;
            }
            throw new OutputLengthException("output buffer too short for doFinal()");
        } finally {
            h();
        }
    }

    public int b() {
        return this.d.b();
    }

    public int c(int i) {
        return i + this.b;
    }

    public int d(int i) {
        int i2;
        int i3;
        int i4 = i + this.b;
        if (!this.f) {
            i3 = this.a.length;
        } else if (this.c) {
            i2 = (i4 % this.a.length) - (this.d.b() + 2);
            return i4 - i2;
        } else {
            i3 = this.a.length;
        }
        i2 = i4 % i3;
        return i4 - i2;
    }

    public void e(boolean z, i iVar) throws IllegalArgumentException {
        this.c = z;
        h();
        this.d.init(z, iVar);
    }

    public int f(byte b2, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        byte[] bArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr2[i2] = b2;
        if (i3 != bArr2.length) {
            return 0;
        }
        int a2 = this.d.a(bArr2, 0, bArr, i);
        this.b = 0;
        return a2;
    }

    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        int i4;
        if (i2 >= 0) {
            int b2 = b();
            int d2 = d(i2);
            if (d2 <= 0 || d2 + i3 <= bArr2.length) {
                byte[] bArr3 = this.a;
                int length = bArr3.length;
                int i5 = this.b;
                int i6 = length - i5;
                if (i2 > i6) {
                    System.arraycopy(bArr, i, bArr3, i5, i6);
                    i4 = this.d.a(this.a, 0, bArr2, i3) + 0;
                    this.b = 0;
                    i2 -= i6;
                    i += i6;
                    while (i2 > this.a.length) {
                        i4 += this.d.a(bArr, i, bArr2, i3 + i4);
                        i2 -= b2;
                        i += b2;
                    }
                } else {
                    i4 = 0;
                }
                System.arraycopy(bArr, i, this.a, this.b, i2);
                int i7 = this.b + i2;
                this.b = i7;
                byte[] bArr4 = this.a;
                if (i7 != bArr4.length) {
                    return i4;
                }
                int a2 = i4 + this.d.a(bArr4, 0, bArr2, i3 + i4);
                this.b = 0;
                return a2;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    public void h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.b = 0;
                this.d.reset();
                return;
            }
        }
    }
}
