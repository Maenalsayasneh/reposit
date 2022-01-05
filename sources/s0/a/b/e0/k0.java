package s0.a.b.e0;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.i0.c;
import s0.a.b.j;
import s0.a.b.k0.c1;
import s0.a.b.k0.d1;
import s0.a.b.y;
import s0.a.e.b.b0.c.h3;

public class k0 implements y {
    public c a;
    public c1 b;
    public boolean c;
    public SecureRandom d;

    public k0(e eVar) {
        this.a = new c(eVar);
    }

    public byte[] a(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (!this.c) {
            int b2 = this.a.b();
            if (i2 >= b2 * 2) {
                byte[] bArr2 = new byte[i2];
                byte[] bArr3 = new byte[b2];
                boolean z = false;
                System.arraycopy(bArr, i, bArr2, 0, i2);
                System.arraycopy(bArr, i, bArr3, 0, b2);
                this.a.init(false, new c1(this.b.d, bArr3));
                for (int i3 = b2; i3 < i2; i3 += b2) {
                    this.a.a(bArr2, i3, bArr2, i3);
                }
                System.arraycopy(bArr2, i2 - b2, bArr3, 0, b2);
                this.a.init(false, new c1(this.b.d, bArr3));
                this.a.a(bArr2, 0, bArr2, 0);
                this.a.init(false, this.b);
                for (int i4 = 0; i4 < i2; i4 += b2) {
                    this.a.a(bArr2, i4, bArr2, i4);
                }
                int i5 = i2 - 4;
                boolean z2 = (bArr2[0] & 255) > i5;
                if (!z2) {
                    i5 = bArr2[0] & 255;
                }
                byte[] bArr4 = new byte[i5];
                System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
                int i6 = 0;
                byte b3 = 0;
                while (i6 != 3) {
                    int i7 = i6 + 1;
                    b3 |= bArr2[i6 + 4] ^ ((byte) (~bArr2[i7]));
                    i6 = i7;
                }
                h3.H(bArr2);
                if (b3 != 0) {
                    z = true;
                }
                if (!z2 && !z) {
                    return bArr4;
                }
                throw new InvalidCipherTextException("wrapped key corrupted");
            }
            throw new InvalidCipherTextException("input too short");
        }
        throw new IllegalStateException("not set for unwrapping");
    }

    public byte[] b(byte[] bArr, int i, int i2) {
        if (!this.c) {
            throw new IllegalStateException("not set for wrapping");
        } else if (i2 > 255 || i2 < 0) {
            throw new IllegalArgumentException("input must be from 0 to 255 bytes");
        } else {
            this.a.init(true, this.b);
            int b2 = this.a.b();
            int i3 = i2 + 4;
            int i4 = b2 * 2;
            if (i3 >= i4) {
                i4 = i3 % b2 == 0 ? i3 : ((i3 / b2) + 1) * b2;
            }
            byte[] bArr2 = new byte[i4];
            bArr2[0] = (byte) i2;
            System.arraycopy(bArr, i, bArr2, 4, i2);
            int length = bArr2.length - i3;
            byte[] bArr3 = new byte[length];
            this.d.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i3, length);
            bArr2[1] = (byte) (~bArr2[4]);
            bArr2[2] = (byte) (~bArr2[5]);
            bArr2[3] = (byte) (~bArr2[6]);
            for (int i5 = 0; i5 < bArr2.length; i5 += b2) {
                this.a.a(bArr2, i5, bArr2, i5);
            }
            for (int i6 = 0; i6 < bArr2.length; i6 += b2) {
                this.a.a(bArr2, i6, bArr2, i6);
            }
            return bArr2;
        }
    }

    public String getAlgorithmName() {
        return this.a.e.getAlgorithmName() + "/RFC3211Wrap";
    }

    public void init(boolean z, i iVar) {
        this.c = z;
        if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.d = d1Var.c;
            i iVar2 = d1Var.d;
            if (iVar2 instanceof c1) {
                this.b = (c1) iVar2;
                return;
            }
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        if (z) {
            this.d = j.a();
        }
        if (iVar instanceof c1) {
            this.b = (c1) iVar;
            return;
        }
        throw new IllegalArgumentException("RFC3211Wrap requires an IV");
    }
}
