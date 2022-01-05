package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Objects;

public abstract class h extends r {
    public n c;
    public k d;
    public r q;
    public int x;
    public r y;

    public h(f fVar) {
        int i = 0;
        r B = B(fVar, 0);
        if (B instanceof n) {
            this.c = (n) B;
            B = B(fVar, 1);
            i = 1;
        }
        if (B instanceof k) {
            this.d = (k) B;
            i++;
            B = B(fVar, i);
        }
        if (!(B instanceof z)) {
            this.q = B;
            i++;
            B = B(fVar, i);
        }
        if (fVar.c != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (B instanceof z) {
            z zVar = (z) B;
            C(zVar.c);
            this.y = zVar.C();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    public r A() {
        return new l1(this.c, this.d, this.q, this.x, this.y);
    }

    public final r B(f fVar, int i) {
        if (fVar.c > i) {
            return fVar.c(i).c();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    public final void C(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(a.e0("invalid encoding value: ", i));
        }
        this.x = i;
    }

    public int hashCode() {
        n nVar = this.c;
        int hashCode = nVar != null ? nVar.hashCode() : 0;
        k kVar = this.d;
        if (kVar != null) {
            hashCode ^= kVar.hashCode();
        }
        r rVar = this.q;
        if (rVar != null) {
            hashCode ^= rVar.hashCode();
        }
        return hashCode ^ this.y.hashCode();
    }

    public boolean s(r rVar) {
        r rVar2;
        k kVar;
        n nVar;
        if (!(rVar instanceof h)) {
            return false;
        }
        if (this == rVar) {
            return true;
        }
        h hVar = (h) rVar;
        n nVar2 = this.c;
        if (nVar2 != null && ((nVar = hVar.c) == null || !nVar.w(nVar2))) {
            return false;
        }
        k kVar2 = this.d;
        if (kVar2 != null && ((kVar = hVar.d) == null || !kVar.w(kVar2))) {
            return false;
        }
        r rVar3 = this.q;
        if (rVar3 == null || ((rVar2 = hVar.q) != null && rVar2.w(rVar3))) {
            return this.y.w(hVar.y);
        }
        return false;
    }

    public int u() throws IOException {
        return getEncoded().length;
    }

    public boolean y() {
        return true;
    }

    public r z() {
        return new p0(this.c, this.d, this.q, this.x, this.y);
    }

    public h(n nVar, k kVar, r rVar, int i, r rVar2) {
        this.c = nVar;
        this.d = kVar;
        this.q = rVar;
        C(i);
        Objects.requireNonNull(rVar2);
        this.y = rVar2;
    }
}
