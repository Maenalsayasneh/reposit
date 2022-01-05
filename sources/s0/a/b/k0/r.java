package s0.a.b.k0;

import java.math.BigInteger;

public class r extends n {
    public static final BigInteger q = BigInteger.valueOf(1);
    public static final BigInteger x = BigInteger.valueOf(2);
    public BigInteger y;

    public r(BigInteger bigInteger, p pVar) {
        super(false, pVar);
        if (pVar != null) {
            BigInteger bigInteger2 = x;
            if (bigInteger2.compareTo(bigInteger) > 0 || pVar.q.subtract(bigInteger2).compareTo(bigInteger) < 0 || !q.equals(bigInteger.modPow(pVar.d, pVar.q))) {
                throw new IllegalArgumentException("y value does not appear to be in correct group");
            }
        }
        this.y = bigInteger;
    }
}
