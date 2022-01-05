package s0.a.d.e;

import java.security.spec.AlgorithmParameterSpec;
import s0.a.e.b.b0.c.h3;

public class p implements AlgorithmParameterSpec {
    public byte[] a;
    public byte[] b;
    public int c;
    public int d;
    public byte[] e;
    public boolean f;

    public p(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, bArr2, i, -1, (byte[]) null, false);
    }

    public p(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, false);
    }

    public p(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, boolean z) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.a = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.b = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.b = null;
        }
        this.c = i;
        this.d = i2;
        this.e = h3.I(bArr3);
        this.f = z;
    }

    public byte[] a() {
        return h3.I(this.a);
    }

    public byte[] b() {
        return h3.I(this.b);
    }

    public byte[] c() {
        return h3.I(this.e);
    }
}
