package s0.a.b.k0;

import java.math.BigInteger;
import s0.a.b.i;

public class p implements i {
    public BigInteger c;
    public BigInteger d;
    public BigInteger q;
    public s x;

    public p(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.c = bigInteger3;
        this.q = bigInteger;
        this.d = bigInteger2;
    }

    public p(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, s sVar) {
        this.c = bigInteger3;
        this.q = bigInteger;
        this.d = bigInteger2;
        this.x = sVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!pVar.q.equals(this.q) || !pVar.d.equals(this.d) || !pVar.c.equals(this.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.q.hashCode() ^ this.d.hashCode()) ^ this.c.hashCode();
    }
}
