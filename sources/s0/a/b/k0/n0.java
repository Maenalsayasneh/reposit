package s0.a.b.k0;

import java.math.BigInteger;

public class n0 extends k0 {
    public BigInteger q;

    public n0(BigInteger bigInteger, l0 l0Var) {
        super(false, l0Var);
        this.q = bigInteger;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof n0) && ((n0) obj).q.equals(this.q) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.q.hashCode() ^ super.hashCode();
    }
}
