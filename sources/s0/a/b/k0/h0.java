package s0.a.b.k0;

import java.security.SecureRandom;
import s0.a.b.b0.c0;
import s0.a.b.b0.l;
import s0.a.b.z;
import s0.a.e.b.e0.b;

public final class h0 extends b {
    public final byte[] d;
    public i0 q;

    public h0(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.d = bArr;
        byte[] bArr2 = b.a;
        secureRandom.nextBytes(bArr);
    }

    public h0(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.d = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 57);
    }

    public i0 a() {
        i0 i0Var;
        synchronized (this.d) {
            if (this.q == null) {
                byte[] bArr = new byte[57];
                byte[] bArr2 = this.d;
                z b = b.b();
                byte[] bArr3 = new byte[114];
                ((l) b).update(bArr2, 0, 57);
                ((c0) b).b(bArr3, 0, 114);
                byte[] bArr4 = new byte[57];
                b.s(bArr3, 0, bArr4);
                b.v(bArr4, bArr, 0);
                this.q = new i0(bArr, 0);
            }
            i0Var = this.q;
        }
        return i0Var;
    }

    public void b(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        int i5 = i;
        byte[] bArr4 = new byte[57];
        System.arraycopy(a().d, 0, bArr4, 0, 57);
        if (i5 == 0) {
            int i6 = i3;
            b.l(this.d, 0, bArr4, 0, bArr, (byte) 0, bArr2, i2, i3, bArr3, i4);
        } else if (i5 != 1) {
            throw new IllegalArgumentException("algorithm");
        } else if (64 == i3) {
            b.l(this.d, 0, bArr4, 0, bArr, (byte) 1, bArr2, i2, 64, bArr3, i4);
        } else {
            throw new IllegalArgumentException("msgLen");
        }
    }
}
