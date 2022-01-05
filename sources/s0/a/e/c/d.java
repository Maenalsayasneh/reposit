package s0.a.e.c;

import java.math.BigInteger;

public class d implements e {
    public final a a;
    public final c b;

    public d(a aVar, c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public c a() {
        return this.b;
    }

    public int b() {
        return this.b.a() * this.a.b();
    }

    public BigInteger c() {
        return this.a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 16);
    }
}
