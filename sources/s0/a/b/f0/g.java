package s0.a.b.f0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.v;
import s0.a.g.b;

public class g {
    public static final BigInteger a = BigInteger.valueOf(1);
    public static final BigInteger b = BigInteger.valueOf(2);

    public static BigInteger[] a(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger g = b.g(i3, 2, secureRandom);
            BigInteger add = g.shiftLeft(1).add(a);
            if (add.isProbablePrime(i2) && ((i2 <= 2 || g.isProbablePrime(i2 - 2)) && v.c(add) >= i4)) {
                return new BigInteger[]{add, g};
            }
        }
    }

    public static BigInteger b(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger subtract = bigInteger.subtract(b);
        do {
            BigInteger bigInteger2 = b;
            modPow = b.f(bigInteger2, subtract, secureRandom).modPow(bigInteger2, bigInteger);
        } while (modPow.equals(a));
        return modPow;
    }
}
