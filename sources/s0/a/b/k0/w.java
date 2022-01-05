package s0.a.b.k0;

import i0.h.a.b.h.f.n;
import java.math.BigInteger;
import java.util.Objects;
import m0.r.t.a.r.m.a1.a;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.h;

public class w implements c {
    public final e g;
    public final byte[] h;
    public final h i;
    public final BigInteger j;
    public final BigInteger k;
    public BigInteger l;

    public w(e eVar, h hVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, hVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public w(e eVar, h hVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.l = null;
        Objects.requireNonNull(eVar, "curve");
        Objects.requireNonNull(bigInteger, n.a);
        this.g = eVar;
        this.i = b(eVar, hVar);
        this.j = bigInteger;
        this.k = bigInteger2;
        this.h = h3.I(bArr);
    }

    public static h b(e eVar, h hVar) {
        Objects.requireNonNull(hVar, "Point cannot be null");
        h q = a.n2(eVar, hVar).q();
        if (q.m()) {
            throw new IllegalArgumentException("Point at infinity");
        } else if (q.l(false, true)) {
            return q;
        } else {
            throw new IllegalArgumentException("Point not on curve");
        }
    }

    public byte[] a() {
        return h3.I(this.h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.g.j(wVar.g) && this.i.c(wVar.i) && this.j.equals(wVar.j);
    }

    public int hashCode() {
        return ((((this.g.hashCode() ^ 1028) * 257) ^ this.i.hashCode()) * 257) ^ this.j.hashCode();
    }
}
