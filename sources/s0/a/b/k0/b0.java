package s0.a.b.k0;

import java.math.BigInteger;
import java.util.Objects;
import s0.a.e.b.c;

public class b0 extends z {
    public final BigInteger q;

    public b0(BigInteger bigInteger, w wVar) {
        super(true, wVar);
        Objects.requireNonNull(wVar);
        Objects.requireNonNull(bigInteger, "Scalar cannot be null");
        if (bigInteger.compareTo(c.b) < 0 || bigInteger.compareTo(wVar.j) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        this.q = bigInteger;
    }
}
