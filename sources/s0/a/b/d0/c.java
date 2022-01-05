package s0.a.b.d0;

import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.a;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k0.b;
import s0.a.b.k0.d1;
import s0.a.g.g;

public class c implements a {
    public SecureRandom a;
    public a b;
    public boolean c;
    public boolean d;
    public boolean e;
    public byte[] f;

    public c(a aVar) {
        this.b = aVar;
        this.e = !g.c("org.bouncycastle.pkcs1.not_strict", true) ? !g.c("org.bouncycastle.pkcs1.strict", false) : false;
    }

    public int a() {
        int a2 = this.b.a();
        return this.c ? a2 - 10 : a2;
    }

    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int i3 = -1;
        boolean z = true;
        if (!this.c) {
            byte[] b2 = this.b.b(bArr, i, i2);
            boolean z2 = this.e & (b2.length != this.b.c());
            if (b2.length < c()) {
                b2 = this.f;
            }
            byte b3 = b2[0];
            boolean z3 = !this.d ? b3 != 1 : b3 != 2;
            boolean z4 = false;
            int i4 = -1;
            for (int i5 = 1; i5 != b2.length; i5++) {
                byte b4 = b2[i5];
                if ((b4 == 0) && (i4 < 0)) {
                    i4 = i5;
                }
                z4 |= (b4 != -1) & (b3 == 1) & (i4 < 0);
            }
            if (!z4) {
                i3 = i4;
            }
            int i6 = i3 + 1;
            if (i6 >= 10) {
                z = false;
            }
            if (z3 || z) {
                Arrays.fill(b2, (byte) 0);
                throw new InvalidCipherTextException("block incorrect");
            } else if (!z2) {
                int length = b2.length - i6;
                byte[] bArr2 = new byte[length];
                System.arraycopy(b2, i6, bArr2, 0, length);
                return bArr2;
            } else {
                Arrays.fill(b2, (byte) 0);
                throw new InvalidCipherTextException("block incorrect size");
            }
        } else if (i2 <= a()) {
            int a2 = this.b.a();
            byte[] bArr3 = new byte[a2];
            if (this.d) {
                bArr3[0] = 1;
                for (int i7 = 1; i7 != (a2 - i2) - 1; i7++) {
                    bArr3[i7] = -1;
                }
            } else {
                this.a.nextBytes(bArr3);
                bArr3[0] = 2;
                for (int i8 = 1; i8 != (a2 - i2) - 1; i8++) {
                    while (bArr3[i8] == 0) {
                        bArr3[i8] = (byte) this.a.nextInt();
                    }
                }
            }
            int i9 = a2 - i2;
            bArr3[i9 - 1] = 0;
            System.arraycopy(bArr, i, bArr3, i9, i2);
            return this.b.b(bArr3, 0, a2);
        } else {
            throw new IllegalArgumentException("input data too large");
        }
    }

    public int c() {
        int c2 = this.b.c();
        return this.c ? c2 : c2 - 10;
    }

    public void init(boolean z, i iVar) {
        b bVar;
        if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.a = d1Var.c;
            bVar = (b) d1Var.d;
        } else {
            bVar = (b) iVar;
            if (!bVar.c && z) {
                this.a = j.a();
            }
        }
        this.b.init(z, iVar);
        this.d = bVar.c;
        this.c = z;
        this.f = new byte[this.b.c()];
    }
}
