package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Objects;

public abstract class z extends r implements e, v1 {
    public final int c;
    public final boolean d;
    public final e q;

    public z(boolean z, int i, e eVar) {
        Objects.requireNonNull(eVar, "'obj' cannot be null");
        this.c = i;
        this.d = z || (eVar instanceof d);
        this.q = eVar;
    }

    public static z B(Object obj) {
        if (obj == null || (obj instanceof z)) {
            return (z) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return B(r.x((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(a.V(e, a.P0("failed to construct tagged object from byte[]: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("unknown object in getInstance: ")));
        }
    }

    public r A() {
        return new s1(this.d, this.c, this.q);
    }

    public r C() {
        return this.q.c();
    }

    public int hashCode() {
        return (this.c ^ (this.d ? 15 : 240)) ^ this.q.c().hashCode();
    }

    public r j() {
        return this;
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof z)) {
            return false;
        }
        z zVar = (z) rVar;
        if (this.c != zVar.c || this.d != zVar.d) {
            return false;
        }
        r c2 = this.q.c();
        r c3 = zVar.q.c();
        return c2 == c3 || c2.s(c3);
    }

    public String toString() {
        StringBuilder P0 = a.P0("[");
        P0.append(this.c);
        P0.append("]");
        P0.append(this.q);
        return P0.toString();
    }

    public r z() {
        return new e1(this.d, this.c, this.q);
    }
}
