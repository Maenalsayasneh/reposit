package s0.a.b.e0;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
import s0.a.b.a;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k0.d1;
import s0.a.b.k0.k0;
import s0.a.b.k0.m0;
import s0.a.b.k0.n0;
import s0.a.g.b;

public class t implements a {
    public static final BigInteger a = BigInteger.valueOf(0);
    public static final BigInteger b = BigInteger.valueOf(1);
    public static final BigInteger c = BigInteger.valueOf(2);
    public k0 d;
    public SecureRandom e;
    public boolean f;
    public int g;

    public int a() {
        return this.f ? (this.g - 1) / 8 : ((this.g + 7) / 8) * 2;
    }

    public byte[] b(byte[] bArr, int i, int i2) {
        BigInteger e2;
        if (this.d != null) {
            if (i2 <= (this.f ? ((this.g - 1) + 7) / 8 : a())) {
                k0 k0Var = this.d;
                BigInteger bigInteger = k0Var.d.d;
                if (k0Var instanceof m0) {
                    int i3 = i2 / 2;
                    byte[] bArr2 = new byte[i3];
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    System.arraycopy(bArr, i + i3, bArr3, 0, i3);
                    return b.c(new BigInteger(1, bArr2).modPow(bigInteger.subtract(b).subtract(((m0) this.d).q), bigInteger).multiply(new BigInteger(1, bArr3)).mod(bigInteger));
                }
                if (!(i == 0 && i2 == bArr.length)) {
                    byte[] bArr4 = new byte[i2];
                    System.arraycopy(bArr, i, bArr4, 0, i2);
                    bArr = bArr4;
                }
                BigInteger bigInteger2 = new BigInteger(1, bArr);
                if (bigInteger2.compareTo(bigInteger) < 0) {
                    n0 n0Var = (n0) this.d;
                    int bitLength = bigInteger.bitLength();
                    while (true) {
                        e2 = b.e(bitLength, this.e);
                        if (!e2.equals(a) && e2.compareTo(bigInteger.subtract(c)) <= 0) {
                            break;
                        }
                    }
                    BigInteger modPow = this.d.d.c.modPow(e2, bigInteger);
                    BigInteger mod = bigInteger2.multiply(n0Var.q.modPow(e2, bigInteger)).mod(bigInteger);
                    byte[] byteArray = modPow.toByteArray();
                    byte[] byteArray2 = mod.toByteArray();
                    int c2 = c();
                    byte[] bArr5 = new byte[c2];
                    int i4 = c2 / 2;
                    if (byteArray.length > i4) {
                        System.arraycopy(byteArray, 1, bArr5, i4 - (byteArray.length - 1), byteArray.length - 1);
                    } else {
                        System.arraycopy(byteArray, 0, bArr5, i4 - byteArray.length, byteArray.length);
                    }
                    if (byteArray2.length > i4) {
                        System.arraycopy(byteArray2, 1, bArr5, c2 - (byteArray2.length - 1), byteArray2.length - 1);
                    } else {
                        System.arraycopy(byteArray2, 0, bArr5, c2 - byteArray2.length, byteArray2.length);
                    }
                    return bArr5;
                }
                throw new DataLengthException("input too large for ElGamal cipher.\n");
            }
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        throw new IllegalStateException("ElGamal engine not initialised");
    }

    public int c() {
        return this.f ? ((this.g + 7) / 8) * 2 : (this.g - 1) / 8;
    }

    public void init(boolean z, i iVar) {
        SecureRandom secureRandom;
        if (iVar instanceof d1) {
            d1 d1Var = (d1) iVar;
            this.d = (k0) d1Var.d;
            secureRandom = d1Var.c;
        } else {
            this.d = (k0) iVar;
            secureRandom = j.a();
        }
        this.e = secureRandom;
        this.f = z;
        this.g = this.d.d.d.bitLength();
        if (z) {
            if (!(this.d instanceof n0)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.d instanceof m0)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }
}
