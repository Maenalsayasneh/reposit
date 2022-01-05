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
import s0.a.b.n;
import s0.a.b.y;
import s0.a.e.b.b0.c.h3;

public class f0 implements y {
    public static final byte[] a = {74, -35, -94, 44, 121, -24, 33, 5};
    public c b;
    public i c;
    public c1 d;
    public byte[] e;
    public boolean f;
    public SecureRandom g;
    public n h = new v();
    public byte[] i = new byte[20];

    public byte[] a(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (this.f) {
            throw new IllegalStateException("Not set for unwrapping");
        } else if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        } else if (i3 % this.b.b() == 0) {
            this.b.init(false, new c1(this.c, a));
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            for (int i4 = 0; i4 < i3 / this.b.b(); i4++) {
                int b2 = this.b.b() * i4;
                this.b.a(bArr2, b2, bArr2, b2);
            }
            byte[] bArr3 = new byte[i3];
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                bArr3[i5] = bArr2[i3 - i6];
                i5 = i6;
            }
            byte[] bArr4 = new byte[8];
            this.e = bArr4;
            int i7 = i3 - 8;
            byte[] bArr5 = new byte[i7];
            System.arraycopy(bArr3, 0, bArr4, 0, 8);
            System.arraycopy(bArr3, 8, bArr5, 0, i7);
            c1 c1Var = new c1(this.c, this.e);
            this.d = c1Var;
            this.b.init(false, c1Var);
            byte[] bArr6 = new byte[i7];
            System.arraycopy(bArr5, 0, bArr6, 0, i7);
            for (int i8 = 0; i8 < i7 / this.b.b(); i8++) {
                int b3 = this.b.b() * i8;
                this.b.a(bArr6, b3, bArr6, b3);
            }
            int i9 = i7 - 8;
            byte[] bArr7 = new byte[i9];
            byte[] bArr8 = new byte[8];
            System.arraycopy(bArr6, 0, bArr7, 0, i9);
            System.arraycopy(bArr6, i9, bArr8, 0, 8);
            if (!h3.U(c(bArr7), bArr8)) {
                throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
            } else if (i9 - ((bArr7[0] & 255) + 1) <= 7) {
                byte b4 = bArr7[0];
                byte[] bArr9 = new byte[b4];
                System.arraycopy(bArr7, 1, bArr9, 0, b4);
                return bArr9;
            } else {
                StringBuilder P0 = a.P0("too many pad bytes (");
                P0.append(i9 - ((bArr7[0] & 255) + 1));
                P0.append(")");
                throw new InvalidCipherTextException(P0.toString());
            }
        } else {
            StringBuilder P02 = a.P0("Ciphertext not multiple of ");
            P02.append(this.b.b());
            throw new InvalidCipherTextException(P02.toString());
        }
    }

    public byte[] b(byte[] bArr, int i2, int i3) {
        if (this.f) {
            int i4 = i3 + 1;
            int i5 = i4 % 8;
            int i6 = i5 != 0 ? (8 - i5) + i4 : i4;
            byte[] bArr2 = new byte[i6];
            bArr2[0] = (byte) i3;
            System.arraycopy(bArr, i2, bArr2, 1, i3);
            int i7 = (i6 - i3) - 1;
            byte[] bArr3 = new byte[i7];
            if (i7 > 0) {
                this.g.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i4, i7);
            }
            byte[] c2 = c(bArr2);
            int length = c2.length + i6;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr2, 0, bArr4, 0, i6);
            System.arraycopy(c2, 0, bArr4, i6, c2.length);
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr4, 0, bArr5, 0, length);
            int b2 = length / this.b.b();
            if (length % this.b.b() == 0) {
                this.b.init(true, this.d);
                for (int i8 = 0; i8 < b2; i8++) {
                    int b3 = this.b.b() * i8;
                    this.b.a(bArr5, b3, bArr5, b3);
                }
                byte[] bArr6 = this.e;
                int length2 = bArr6.length + length;
                byte[] bArr7 = new byte[length2];
                System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                System.arraycopy(bArr5, 0, bArr7, this.e.length, length);
                byte[] bArr8 = new byte[length2];
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = i9 + 1;
                    bArr8[i9] = bArr7[length2 - i10];
                    i9 = i10;
                }
                this.b.init(true, new c1(this.c, a));
                for (int i11 = 0; i11 < b2 + 1; i11++) {
                    int b4 = this.b.b() * i11;
                    this.b.a(bArr8, b4, bArr8, b4);
                }
                return bArr8;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.h.update(bArr, 0, bArr.length);
        this.h.doFinal(this.i, 0);
        System.arraycopy(this.i, 0, bArr2, 0, 8);
        return bArr2;
    }

    public String getAlgorithmName() {
        return "RC2";
    }

    public void init(boolean z, i iVar) {
        this.f = z;
        this.b = new c(new e0());
        if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.g = d1Var.c;
            iVar = d1Var.d;
        } else {
            this.g = j.a();
        }
        if (iVar instanceof c1) {
            c1 c1Var = (c1) iVar;
            this.d = c1Var;
            byte[] bArr = c1Var.c;
            this.e = bArr;
            this.c = c1Var.d;
            if (!this.f) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            } else if (bArr == null || bArr.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        } else {
            this.c = iVar;
            if (this.f) {
                byte[] bArr2 = new byte[8];
                this.e = bArr2;
                this.g.nextBytes(bArr2);
                this.d = new c1(this.c, this.e);
            }
        }
    }
}
