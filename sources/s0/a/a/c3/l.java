package s0.a.a.c3;

import i0.d.a.a.a;
import java.math.BigInteger;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;

public class l extends m {
    public BigInteger c;

    public l(BigInteger bigInteger) {
        this.c = bigInteger;
    }

    public r c() {
        return new k(this.c);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CRLNumber: ");
        P0.append(this.c);
        return P0.toString();
    }
}
