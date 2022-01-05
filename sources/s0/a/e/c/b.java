package s0.a.e.c;

import java.math.BigInteger;

public abstract class b {
    public static final a a = new f(BigInteger.valueOf(2));
    public static final a b = new f(BigInteger.valueOf(3));

    public static e a(int[] iArr) {
        if (iArr[0] == 0) {
            int i = 1;
            while (i < iArr.length) {
                if (iArr[i] > iArr[i - 1]) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
                }
            }
            return new d(a, new c(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }
}
