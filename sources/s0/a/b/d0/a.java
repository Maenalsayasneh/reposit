package s0.a.b.d0;

import java.math.BigInteger;
import org.bouncycastle.crypto.InvalidCipherTextException;
import s0.a.b.i;
import s0.a.b.k0.d1;
import s0.a.b.k0.k1;

public class a implements s0.a.b.a {
    public static final BigInteger a = BigInteger.valueOf(16);
    public static final BigInteger b = BigInteger.valueOf(6);
    public static byte[] c = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    public static byte[] d = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};
    public s0.a.b.a e;
    public boolean f;
    public int g;
    public int h = 0;
    public BigInteger i;

    public a(s0.a.b.a aVar) {
        this.e = aVar;
    }

    public int a() {
        int a2 = this.e.a();
        return this.f ? (a2 + 1) / 2 : a2;
    }

    public byte[] b(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (!this.f) {
            return d(bArr, i2, i3);
        }
        int i4 = this.g;
        int i5 = (i4 + 7) / 8;
        byte[] bArr2 = new byte[i5];
        int i6 = 1;
        int i7 = this.h + 1;
        int i8 = (i4 + 13) / 16;
        int i9 = 0;
        while (i9 < i8) {
            if (i9 > i8 - i3) {
                int i10 = i8 - i9;
                System.arraycopy(bArr, (i2 + i3) - i10, bArr2, i5 - i8, i10);
            } else {
                System.arraycopy(bArr, i2, bArr2, i5 - (i9 + i3), i3);
            }
            i9 += i3;
        }
        for (int i11 = i5 - (i8 * 2); i11 != i5; i11 += 2) {
            byte b2 = bArr2[(i11 / 2) + (i5 - i8)];
            byte[] bArr3 = c;
            bArr2[i11] = (byte) (bArr3[b2 & 15] | (bArr3[(b2 & 255) >>> 4] << 4));
            bArr2[i11 + 1] = b2;
        }
        int i12 = i5 - (i3 * 2);
        bArr2[i12] = (byte) (bArr2[i12] ^ i7);
        int i13 = i5 - 1;
        bArr2[i13] = (byte) ((bArr2[i13] << 4) | 6);
        int i14 = 8 - ((this.g - 1) % 8);
        if (i14 != 8) {
            bArr2[0] = (byte) (bArr2[0] & (255 >>> i14));
            bArr2[0] = (byte) ((128 >>> i14) | bArr2[0]);
            i6 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.e.b(bArr2, i6, i5 - i6);
    }

    public int c() {
        int c2 = this.e.c();
        return this.f ? c2 : (c2 + 1) / 2;
    }

    public final byte[] d(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        byte[] b2 = this.e.b(bArr, i2, i3);
        int i4 = (this.g + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, b2);
        BigInteger bigInteger2 = a;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = b;
        if (!mod.equals(bigInteger3)) {
            if (this.i.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                bigInteger = this.i.subtract(bigInteger);
            } else {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray, 1, bArr2, 0, length);
            byteArray = bArr2;
        }
        if ((byteArray[byteArray.length - 1] & 15) == 6) {
            byteArray[byteArray.length - 1] = (byte) (((byteArray[byteArray.length - 1] & 255) >>> 4) | (d[(byteArray[byteArray.length - 2] & 255) >> 4] << 4));
            byte[] bArr3 = c;
            byteArray[0] = (byte) (bArr3[byteArray[1] & 15] | (bArr3[(byteArray[1] & 255) >>> 4] << 4));
            int i5 = 0;
            boolean z = false;
            byte b3 = 1;
            for (int length2 = byteArray.length - 1; length2 >= byteArray.length - (i4 * 2); length2 -= 2) {
                byte[] bArr4 = c;
                byte b4 = bArr4[byteArray[length2] & 15] | (bArr4[(byteArray[length2] & 255) >>> 4] << 4);
                int i6 = length2 - 1;
                if (((byteArray[i6] ^ b4) & 255) != 0) {
                    if (!z) {
                        b3 = (byteArray[i6] ^ b4) & 255;
                        z = true;
                        i5 = i6;
                    } else {
                        throw new InvalidCipherTextException("invalid tsums in block");
                    }
                }
            }
            byteArray[i5] = 0;
            int length3 = (byteArray.length - i5) / 2;
            byte[] bArr5 = new byte[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                bArr5[i7] = byteArray[(i7 * 2) + i5 + 1];
            }
            this.h = b3 - 1;
            return bArr5;
        }
        throw new InvalidCipherTextException("invalid forcing byte in block");
    }

    public void init(boolean z, i iVar) {
        k1 k1Var = iVar instanceof d1 ? (k1) ((d1) iVar).d : (k1) iVar;
        this.e.init(z, iVar);
        BigInteger bigInteger = k1Var.x;
        this.i = bigInteger;
        this.g = bigInteger.bitLength();
        this.f = z;
    }
}
