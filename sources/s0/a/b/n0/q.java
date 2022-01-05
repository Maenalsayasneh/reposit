package s0.a.b.n0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.g.b;

public class q implements b {
    public static final BigInteger a = BigInteger.valueOf(0);
    public BigInteger b;
    public SecureRandom c;

    public BigInteger a() {
        int bitLength = this.b.bitLength();
        while (true) {
            BigInteger e = b.e(bitLength, this.c);
            if (!e.equals(a) && e.compareTo(this.b) < 0) {
                return e;
            }
        }
    }

    public boolean b() {
        return false;
    }

    public void c(BigInteger bigInteger, SecureRandom secureRandom) {
        this.b = bigInteger;
        this.c = secureRandom;
    }

    public void d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }
}
