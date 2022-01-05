package s0.a.e;

import java.math.BigInteger;

public abstract class a {
    public static final BigInteger a = BigInteger.valueOf(1);
    public static final BigInteger b = BigInteger.valueOf(2);

    static {
        BigInteger.valueOf(3);
    }

    public static void a(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException(i0.d.a.a.a.o0("'", str, "' must be non-null and >= 2"));
        }
    }
}
