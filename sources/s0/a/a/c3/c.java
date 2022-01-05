package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.d;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class c extends m implements d {
    public e c;
    public r d;

    public c(u0 u0Var) {
        this.c = u0Var;
        this.d = new e1(false, 0, u0Var);
    }

    public c(x xVar) {
        this.c = xVar;
        this.d = xVar.c();
    }

    public static c s(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof u0) {
            return new c(u0.s(obj));
        }
        if (obj instanceof x) {
            return new c((x) obj);
        }
        if (obj instanceof z) {
            return new c(u0.s(s.C((z) obj, false)));
        }
        if (obj instanceof s) {
            return new c(x.s(obj));
        }
        throw new IllegalArgumentException(a.c0(obj, a.P0("unknown object in factory: ")));
    }

    public r c() {
        return this.d;
    }
}
