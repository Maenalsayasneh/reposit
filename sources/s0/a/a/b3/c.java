package s0.a.a.b3;

import java.util.Enumeration;
import java.util.Objects;
import s0.a.a.b1;
import s0.a.a.b3.e.a;
import s0.a.a.d;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class c extends m implements d {
    public static d c = s0.a.a.b3.e.c.N;
    public b1 Y1;
    public boolean d;
    public int q;
    public d x;
    public b[] y;

    public c(String str) {
        d dVar = c;
        b[] b = dVar.b(str);
        this.x = c;
        b[] bVarArr = (b[]) b.clone();
        this.y = bVarArr;
        this.Y1 = new b1((e[]) bVarArr);
        this.x = dVar;
    }

    public c(d dVar, c cVar) {
        this.x = dVar;
        this.y = cVar.y;
        this.Y1 = cVar.Y1;
    }

    public c(d dVar, b[] bVarArr) {
        this.x = dVar;
        b[] bVarArr2 = (b[]) bVarArr.clone();
        this.y = bVarArr2;
        this.Y1 = new b1((e[]) bVarArr2);
    }

    public static c s(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj == null) {
            return null;
        }
        return new c(c, s.B(obj));
    }

    public static c t(d dVar, Object obj) {
        if (obj instanceof c) {
            return new c(dVar, (c) obj);
        }
        if (obj != null) {
            return new c(dVar, s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.Y1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) && !(obj instanceof s)) {
            return false;
        }
        if (this.Y1.w(((e) obj).c())) {
            return true;
        }
        try {
            return this.x.a(this, new c(c, s.B(((e) obj).c())));
        } catch (Exception unused) {
            return false;
        }
    }

    public int hashCode() {
        if (this.d) {
            return this.q;
        }
        this.d = true;
        Objects.requireNonNull((a) this.x);
        b[] u = u();
        int i = 0;
        for (int i2 = 0; i2 != u.length; i2++) {
            if (u[i2].c.c.length > 1) {
                a[] u2 = u[i2].u();
                for (int i3 = 0; i3 != u2.length; i3++) {
                    i = (i ^ u2[i3].c.hashCode()) ^ m0.r.t.a.r.m.a1.a.r0(u2[i3].d).hashCode();
                }
            } else {
                i = (i ^ u[i2].s().c.hashCode()) ^ m0.r.t.a.r.m.a1.a.r0(u[i2].s().d).hashCode();
            }
        }
        this.q = i;
        return i;
    }

    public String toString() {
        return this.x.d(this);
    }

    public b[] u() {
        return (b[]) this.y.clone();
    }

    public c(d dVar, s sVar) {
        b1 b1Var;
        this.x = dVar;
        this.y = new b[sVar.size()];
        Enumeration E = sVar.E();
        int i = 0;
        boolean z = true;
        while (E.hasMoreElements()) {
            Object nextElement = E.nextElement();
            b t = b.t(nextElement);
            z &= t == nextElement;
            this.y[i] = t;
            i++;
        }
        if (z) {
            b1Var = (b1) sVar.z();
        } else {
            b1Var = new b1((e[]) this.y);
        }
        this.Y1 = b1Var;
    }
}
