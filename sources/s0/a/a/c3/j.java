package s0.a.a.c3;

import i0.d.a.a.a;
import java.io.IOException;
import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.c;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class j extends m {
    public c c = c.c;
    public k d = null;

    public j(s sVar) {
        if (sVar.size() == 0) {
            this.c = null;
            this.d = null;
            return;
        }
        if (sVar.D(0) instanceof c) {
            this.c = c.C(sVar.D(0));
        } else {
            this.c = null;
            this.d = k.B(sVar.D(0));
        }
        if (sVar.size() <= 1) {
            return;
        }
        if (this.c != null) {
            this.d = k.B(sVar.D(1));
            return;
        }
        throw new IllegalArgumentException("wrong sequence in constructor");
    }

    public static j s(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            n nVar = v0.a;
            try {
                return s(r.x(v0Var.d.c));
            } catch (IOException e) {
                throw new IllegalArgumentException("can't convert extension: " + e);
            }
        } else if (obj != null) {
            return new j(s.B(obj));
        } else {
            return null;
        }
    }

    public r c() {
        f fVar = new f(2);
        c cVar = this.c;
        if (cVar != null) {
            fVar.a(cVar);
        }
        k kVar = this.d;
        if (kVar != null) {
            fVar.a(kVar);
        }
        return new b1(fVar);
    }

    public BigInteger t() {
        k kVar = this.d;
        if (kVar != null) {
            return kVar.E();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb;
        if (this.d == null) {
            sb = a.P0("BasicConstraints: isCa(");
            sb.append(u());
            sb.append(")");
        } else {
            sb = a.P0("BasicConstraints: isCa(");
            sb.append(u());
            sb.append("), pathLenConstraint = ");
            sb.append(this.d.E());
        }
        return sb.toString();
    }

    public boolean u() {
        c cVar = this.c;
        return cVar != null && cVar.E();
    }
}
