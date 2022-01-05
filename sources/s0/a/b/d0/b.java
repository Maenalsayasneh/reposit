package s0.a.b.d0;

import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.a;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k0.d1;
import s0.a.b.n;

public class b implements a {
    public byte[] a;
    public n b;
    public a c;
    public SecureRandom d;
    public boolean e;

    public b(a aVar, n nVar, n nVar2, byte[] bArr) {
        this.c = aVar;
        this.b = nVar2;
        this.a = new byte[nVar.getDigestSize()];
        nVar.reset();
        if (bArr != null) {
            nVar.update(bArr, 0, bArr.length);
        }
        nVar.doFinal(this.a, 0);
    }

    public int a() {
        int a2 = this.c.a();
        return this.e ? (a2 - 1) - (this.a.length * 2) : a2;
    }

    public byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        if (!this.e) {
            byte[] b2 = this.c.b(bArr, i, i2);
            int c2 = this.c.c();
            byte[] bArr4 = new byte[c2];
            boolean z = c2 < (this.a.length * 2) + 1;
            if (b2.length <= c2) {
                System.arraycopy(b2, 0, bArr4, c2 - b2.length, b2.length);
            } else {
                System.arraycopy(b2, 0, bArr4, 0, c2);
                z = true;
            }
            byte[] bArr5 = this.a;
            byte[] e2 = e(bArr4, bArr5.length, c2 - bArr5.length, bArr5.length);
            int i3 = 0;
            while (true) {
                bArr2 = this.a;
                if (i3 == bArr2.length) {
                    break;
                }
                bArr4[i3] = (byte) (bArr4[i3] ^ e2[i3]);
                i3++;
            }
            byte[] e3 = e(bArr4, 0, bArr2.length, c2 - bArr2.length);
            for (int length = this.a.length; length != c2; length++) {
                bArr4[length] = (byte) (bArr4[length] ^ e3[length - this.a.length]);
            }
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                bArr3 = this.a;
                if (i4 == bArr3.length) {
                    break;
                }
                if (bArr3[i4] != bArr4[bArr3.length + i4]) {
                    z2 = true;
                }
                i4++;
            }
            int i5 = c2;
            for (int length2 = bArr3.length * 2; length2 != c2; length2++) {
                if ((bArr4[length2] != 0) && (i5 == c2)) {
                    i5 = length2;
                }
            }
            boolean z3 = i5 > c2 + -1;
            boolean z4 = bArr4[i5] != 1;
            int i6 = i5 + 1;
            if (!(z3 | z4) && !(z | z2)) {
                int i7 = c2 - i6;
                byte[] bArr6 = new byte[i7];
                System.arraycopy(bArr4, i6, bArr6, 0, i7);
                Arrays.fill(bArr4, (byte) 0);
                return bArr6;
            }
            Arrays.fill(bArr4, (byte) 0);
            throw new InvalidCipherTextException("data wrong");
        } else if (i2 <= a()) {
            int length3 = (this.a.length * 2) + a() + 1;
            byte[] bArr7 = new byte[length3];
            int i8 = length3 - i2;
            System.arraycopy(bArr, i, bArr7, i8, i2);
            bArr7[i8 - 1] = 1;
            byte[] bArr8 = this.a;
            System.arraycopy(bArr8, 0, bArr7, bArr8.length, bArr8.length);
            int length4 = this.a.length;
            byte[] bArr9 = new byte[length4];
            this.d.nextBytes(bArr9);
            byte[] e4 = e(bArr9, 0, length4, length3 - this.a.length);
            for (int length5 = this.a.length; length5 != length3; length5++) {
                bArr7[length5] = (byte) (bArr7[length5] ^ e4[length5 - this.a.length]);
            }
            System.arraycopy(bArr9, 0, bArr7, 0, this.a.length);
            byte[] bArr10 = this.a;
            byte[] e5 = e(bArr7, bArr10.length, length3 - bArr10.length, bArr10.length);
            for (int i9 = 0; i9 != this.a.length; i9++) {
                bArr7[i9] = (byte) (bArr7[i9] ^ e5[i9]);
            }
            return this.c.b(bArr7, 0, length3);
        } else {
            throw new DataLengthException("input data too long");
        }
    }

    public int c() {
        int c2 = this.c.c();
        return this.e ? c2 : (c2 - 1) - (this.a.length * 2);
    }

    public final void d(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 0);
    }

    public final byte[] e(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        int digestSize = this.b.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.b.reset();
        int i4 = 0;
        while (i4 < i3 / digestSize) {
            d(i4, bArr4);
            this.b.update(bArr, i, i2);
            this.b.update(bArr4, 0, 4);
            this.b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i4 * digestSize, digestSize);
            i4++;
        }
        int i5 = digestSize * i4;
        if (i5 < i3) {
            d(i4, bArr4);
            this.b.update(bArr, i, i2);
            this.b.update(bArr4, 0, 4);
            this.b.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
        }
        return bArr2;
    }

    public void init(boolean z, i iVar) {
        SecureRandom secureRandom;
        if (iVar instanceof d1) {
            secureRandom = ((d1) iVar).c;
        } else {
            secureRandom = j.a();
        }
        this.d = secureRandom;
        this.c.init(z, iVar);
        this.e = z;
    }
}
