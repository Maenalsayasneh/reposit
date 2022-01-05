package s0.a.b.k0;

import java.math.BigInteger;

public class i extends e {
    public BigInteger q;

    public i(BigInteger bigInteger, h hVar) {
        super(true, hVar);
        this.q = bigInteger;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof i) && ((i) obj).q.equals(this.q) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.q.hashCode() ^ super.hashCode();
    }
}
