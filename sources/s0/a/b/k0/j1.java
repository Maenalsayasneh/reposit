package s0.a.b.k0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.q;

public class j1 extends q {
    public BigInteger c;
    public int d;

    public j1(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            throw new IllegalArgumentException("key strength too small");
        } else if (bigInteger.testBit(0)) {
            this.c = bigInteger;
            this.d = i2;
        } else {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
    }
}
