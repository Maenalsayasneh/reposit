package s0.a.a.c3;

import i0.d.a.a.a;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class v extends m {
    public Hashtable c = new Hashtable();
    public Vector d = new Vector();

    public v(s sVar) {
        Enumeration E = sVar.E();
        while (E.hasMoreElements()) {
            Object nextElement = E.nextElement();
            n nVar = u.c;
            u uVar = nextElement instanceof u ? (u) nextElement : nextElement != null ? new u(s.B(nextElement)) : null;
            if (!this.c.containsKey(uVar.o2)) {
                this.c.put(uVar.o2, uVar);
                this.d.addElement(uVar.o2);
            } else {
                StringBuilder P0 = a.P0("repeated extension found: ");
                P0.append(uVar.o2);
                throw new IllegalArgumentException(P0.toString());
            }
        }
    }

    public static v t(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj != null) {
            return new v(s.B(obj));
        }
        return null;
    }

    public static v u(z zVar, boolean z) {
        return t(s.C(zVar, z));
    }

    public r c() {
        f fVar = new f(this.d.size());
        Enumeration elements = this.d.elements();
        while (elements.hasMoreElements()) {
            fVar.a((u) this.c.get((n) elements.nextElement()));
        }
        return new b1(fVar);
    }

    public u s(n nVar) {
        return (u) this.c.get(nVar);
    }

    public Enumeration v() {
        return this.d.elements();
    }
}
