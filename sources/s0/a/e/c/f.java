package s0.a.e.c;

import java.math.BigInteger;

public class f implements a {
    public final BigInteger a;

    public f(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    public int b() {
        return 1;
    }

    public BigInteger c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.a.equals(((f) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
