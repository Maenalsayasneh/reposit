package s0.a.a.c3;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import s0.a.a.a0;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.i;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class n0 extends m {
    public s Y1;
    public v Z1;
    public k c;
    public b d;
    public s0.a.a.b3.c q;
    public t0 x;
    public t0 y;

    public static class b extends m {
        public s c;
        public v d;

        public b(s sVar) {
            if (sVar.size() < 2 || sVar.size() > 3) {
                throw new IllegalArgumentException(i0.d.a.a.a.K0(sVar, i0.d.a.a.a.P0("Bad sequence size: ")));
            }
            this.c = sVar;
        }

        public static b t(Object obj) {
            if (obj instanceof b) {
                return (b) obj;
            }
            if (obj != null) {
                return new b(s.B(obj));
            }
            return null;
        }

        public r c() {
            return this.c;
        }

        public v s() {
            if (this.d == null && this.c.size() == 3) {
                this.d = v.t(this.c.D(2));
            }
            return this.d;
        }

        public k u() {
            return k.B(this.c.D(0));
        }

        public boolean v() {
            return this.c.size() == 3;
        }
    }

    public class c implements Enumeration {
        public c(n0 n0Var, a aVar) {
        }

        public boolean hasMoreElements() {
            return false;
        }

        public Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    public class d implements Enumeration {
        public final Enumeration a;

        public d(n0 n0Var, Enumeration enumeration) {
            this.a = enumeration;
        }

        public boolean hasMoreElements() {
            return this.a.hasMoreElements();
        }

        public Object nextElement() {
            return b.t(this.a.nextElement());
        }
    }

    public n0(s sVar) {
        if (sVar.size() < 3 || sVar.size() > 7) {
            throw new IllegalArgumentException(i0.d.a.a.a.K0(sVar, i0.d.a.a.a.P0("Bad sequence size: ")));
        }
        int i = 0;
        if (sVar.D(0) instanceof k) {
            this.c = k.B(sVar.D(0));
            i = 1;
        } else {
            this.c = null;
        }
        int i2 = i + 1;
        this.d = b.s(sVar.D(i));
        int i3 = i2 + 1;
        this.q = s0.a.a.b3.c.s(sVar.D(i2));
        int i4 = i3 + 1;
        this.x = t0.t(sVar.D(i3));
        if (i4 < sVar.size() && ((sVar.D(i4) instanceof a0) || (sVar.D(i4) instanceof i) || (sVar.D(i4) instanceof t0))) {
            this.y = t0.t(sVar.D(i4));
            i4++;
        }
        if (i4 < sVar.size() && !(sVar.D(i4) instanceof z)) {
            this.Y1 = s.B(sVar.D(i4));
            i4++;
        }
        if (i4 < sVar.size() && (sVar.D(i4) instanceof z)) {
            this.Z1 = v.t(s.C((z) sVar.D(i4), true));
        }
    }

    public r c() {
        f fVar = new f(7);
        k kVar = this.c;
        if (kVar != null) {
            fVar.a(kVar);
        }
        fVar.a(this.d);
        fVar.a(this.q);
        fVar.a(this.x);
        t0 t0Var = this.y;
        if (t0Var != null) {
            fVar.a(t0Var);
        }
        s sVar = this.Y1;
        if (sVar != null) {
            fVar.a(sVar);
        }
        v vVar = this.Z1;
        if (vVar != null) {
            fVar.a(new e1(0, vVar));
        }
        return new b1(fVar);
    }
}
