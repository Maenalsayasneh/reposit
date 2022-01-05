package s0.a.b.k0;

import java.security.SecureRandom;
import s0.a.b.b0.a0;
import s0.a.e.b.e0.a;

public final class e0 extends b {
    public final byte[] d;
    public f0 q;

    public e0(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.d = bArr;
        byte[] bArr2 = a.a;
        secureRandom.nextBytes(bArr);
    }

    public e0(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    public f0 a() {
        f0 f0Var;
        synchronized (this.d) {
            if (this.q == null) {
                byte[] bArr = new byte[32];
                byte[] bArr2 = this.d;
                byte[] bArr3 = a.a;
                a0 a0Var = new a0();
                byte[] bArr4 = new byte[64];
                a0Var.update(bArr2, 0, 32);
                a0Var.doFinal(bArr4, 0);
                byte[] bArr5 = new byte[32];
                a.s(bArr4, 0, bArr5);
                a.v(bArr5, bArr, 0);
                this.q = new f0(bArr, 0);
            }
            f0Var = this.q;
        }
        return f0Var;
    }

    public void b(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        int i5 = i;
        byte[] bArr4 = new byte[32];
        System.arraycopy(a().d, 0, bArr4, 0, 32);
        if (i5 == 0) {
            int i6 = i3;
            a.k(this.d, 0, bArr4, 0, (byte[]) null, (byte) 0, bArr2, i2, i3, bArr3, i4);
        } else if (i5 == 1) {
            int i7 = i3;
            a.k(this.d, 0, bArr4, 0, (byte[]) null, (byte) 0, bArr2, i2, i3, bArr3, i4);
        } else if (i5 != 2) {
            throw new IllegalArgumentException("algorithm");
        } else if (64 == i3) {
            a.k(this.d, 0, bArr4, 0, (byte[]) null, (byte) 1, bArr2, i2, 64, bArr3, i4);
        } else {
            throw new IllegalArgumentException("msgLen");
        }
    }
}
