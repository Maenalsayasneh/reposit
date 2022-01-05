package s0.a.b.k0;

import java.math.BigInteger;
import s0.a.b.i;
import s0.a.g.g;

public class h implements i {
    public int Y1;
    public l Z1;
    public BigInteger c;
    public BigInteger d;
    public BigInteger q;
    public BigInteger x;
    public int y;

    public h(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, (BigInteger) null, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, (BigInteger) null, (i != 0 && i < 160) ? i : 160, i, (BigInteger) null, (l) null);
    }

    public h(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, l lVar) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            } else if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i <= bigInteger.bitLength() || g.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            this.c = bigInteger2;
            this.d = bigInteger;
            this.q = bigInteger3;
            this.y = i;
            this.Y1 = i2;
            this.x = bigInteger4;
            this.Z1 = lVar;
            return;
        }
        throw new IllegalArgumentException("unsafe p value so small specific l required");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        BigInteger bigInteger = this.q;
        if (bigInteger != null) {
            if (!bigInteger.equals(hVar.q)) {
                return false;
            }
        } else if (hVar.q != null) {
            return false;
        }
        if (!hVar.d.equals(this.d) || !hVar.c.equals(this.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode() ^ this.c.hashCode();
        BigInteger bigInteger = this.q;
        return hashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}
