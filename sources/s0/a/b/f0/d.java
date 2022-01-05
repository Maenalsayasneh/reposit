package s0.a.b.f0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.k0.h;
import s0.a.e.b.v;
import s0.a.g.b;

public class d {
    public static final d a = null;
    public static final BigInteger b = BigInteger.valueOf(1);
    public static final BigInteger c = BigInteger.valueOf(2);

    public static BigInteger a(h hVar, SecureRandom secureRandom) {
        BigInteger f;
        BigInteger bit;
        int i = hVar.Y1;
        if (i != 0) {
            int i2 = i >>> 2;
            do {
                bit = b.e(i, secureRandom).setBit(i - 1);
            } while (v.c(bit) < i2);
            return bit;
        }
        BigInteger bigInteger = c;
        int i3 = hVar.y;
        BigInteger shiftLeft = i3 != 0 ? b.shiftLeft(i3 - 1) : bigInteger;
        BigInteger bigInteger2 = hVar.q;
        if (bigInteger2 == null) {
            bigInteger2 = hVar.d;
        }
        BigInteger subtract = bigInteger2.subtract(bigInteger);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            f = b.f(shiftLeft, subtract, secureRandom);
        } while (v.c(f) < bitLength);
        return f;
    }
}
