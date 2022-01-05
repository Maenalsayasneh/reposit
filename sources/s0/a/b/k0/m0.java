package s0.a.b.k0;

import java.math.BigInteger;

public class m0 extends k0 {
    public BigInteger q;

    public m0(BigInteger bigInteger, l0 l0Var) {
        super(true, l0Var);
        this.q = bigInteger;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof m0) && ((m0) obj).q.equals(this.q)) {
            return super.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        return this.q.hashCode();
    }
}
