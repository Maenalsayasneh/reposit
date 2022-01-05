package s0.a.b.e0;

import i0.d.a.a.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.b0.v;
import s0.a.b.i;
import s0.a.b.i0.c;
import s0.a.b.j;
import s0.a.b.k0.c1;
import s0.a.b.k0.d1;
import s0.a.b.k0.y0;
import s0.a.b.n;
import s0.a.b.y;
import s0.a.e.b.b0.c.h3;

public class q implements y {
    public static final byte[] a = {74, -35, -94, 44, 121, -24, 33, 5};
    public c b;
    public y0 c;
    public c1 d;
    public byte[] e;
    public boolean f;
    public n g = new v();
    public byte[] h = new byte[20];

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            bArr2[i] = bArr[bArr.length - i2];
            i = i2;
        }
        return bArr2;
    }

    public byte[] a(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f) {
            throw new IllegalStateException("Not set for unwrapping");
        } else if (bArr != null) {
            int b2 = this.b.b();
            if (i2 % b2 == 0) {
                this.b.init(false, new c1(this.c, a));
                byte[] bArr2 = new byte[i2];
                for (int i3 = 0; i3 != i2; i3 += b2) {
                    this.b.a(bArr, i + i3, bArr2, i3);
                }
                byte[] d2 = d(bArr2);
                byte[] bArr3 = new byte[8];
                this.e = bArr3;
                int length = d2.length - 8;
                byte[] bArr4 = new byte[length];
                System.arraycopy(d2, 0, bArr3, 0, 8);
                System.arraycopy(d2, 8, bArr4, 0, d2.length - 8);
                c1 c1Var = new c1(this.c, this.e);
                this.d = c1Var;
                this.b.init(false, c1Var);
                byte[] bArr5 = new byte[length];
                for (int i4 = 0; i4 != length; i4 += b2) {
                    this.b.a(bArr4, i4, bArr5, i4);
                }
                int i5 = length - 8;
                byte[] bArr6 = new byte[i5];
                byte[] bArr7 = new byte[8];
                System.arraycopy(bArr5, 0, bArr6, 0, i5);
                System.arraycopy(bArr5, i5, bArr7, 0, 8);
                if (h3.U(c(bArr6), bArr7)) {
                    return bArr6;
                }
                throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
            }
            throw new InvalidCipherTextException(a.e0("Ciphertext not multiple of ", b2));
        } else {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
    }

    public byte[] b(byte[] bArr, int i, int i2) {
        if (this.f) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            byte[] c2 = c(bArr2);
            int length = c2.length + i2;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            System.arraycopy(c2, 0, bArr3, i2, c2.length);
            int b2 = this.b.b();
            if (length % b2 == 0) {
                this.b.init(true, this.d);
                byte[] bArr4 = new byte[length];
                for (int i3 = 0; i3 != length; i3 += b2) {
                    this.b.a(bArr3, i3, bArr4, i3);
                }
                byte[] bArr5 = this.e;
                byte[] bArr6 = new byte[(bArr5.length + length)];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                System.arraycopy(bArr4, 0, bArr6, this.e.length, length);
                byte[] d2 = d(bArr6);
                this.b.init(true, new c1(this.c, a));
                for (int i4 = 0; i4 != d2.length; i4 += b2) {
                    this.b.a(d2, i4, d2, i4);
                }
                return d2;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.g.update(bArr, 0, bArr.length);
        this.g.doFinal(this.h, 0);
        System.arraycopy(this.h, 0, bArr2, 0, 8);
        return bArr2;
    }

    public String getAlgorithmName() {
        return "DESede";
    }

    public void init(boolean z, i iVar) {
        SecureRandom secureRandom;
        this.f = z;
        this.b = new c(new p());
        if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            i iVar2 = d1Var.d;
            SecureRandom secureRandom2 = d1Var.c;
            iVar = iVar2;
            secureRandom = secureRandom2;
        } else {
            secureRandom = j.a();
        }
        if (iVar instanceof y0) {
            this.c = (y0) iVar;
            if (this.f) {
                byte[] bArr = new byte[8];
                this.e = bArr;
                secureRandom.nextBytes(bArr);
                this.d = new c1(this.c, this.e);
            }
        } else if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.d = c1Var;
            byte[] bArr2 = c1Var.c;
            this.e = bArr2;
            this.c = (y0) c1Var.d;
            if (!this.f) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            } else if (bArr2 == null || bArr2.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }
}
