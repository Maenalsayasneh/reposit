package s0.a.b.k0;

import java.math.BigInteger;
import s0.a.b.i;

public class q0 implements i {
    public BigInteger c;
    public BigInteger d;
    public BigInteger q;

    public q0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.c = bigInteger;
        this.d = bigInteger2;
        this.q = bigInteger3;
    }

    public q0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, t0 t0Var) {
        this.q = bigInteger3;
        this.c = bigInteger;
        this.d = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (!q0Var.c.equals(this.c) || !q0Var.d.equals(this.d) || !q0Var.q.equals(this.q)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.c.hashCode() ^ this.d.hashCode()) ^ this.q.hashCode();
    }
}
