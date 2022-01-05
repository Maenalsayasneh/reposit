package s0.a.a.c3;

import i0.d.a.a.a;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import s0.a.a.b1;
import s0.a.a.c;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class w0 extends m {
    public static final n c = new n("2.5.29.56");
    public Hashtable d = new Hashtable();
    public Vector q = new Vector();

    static {
        new n("2.5.29.9");
        new n("2.5.29.14");
        new n("2.5.29.15");
        new n("2.5.29.16");
        new n("2.5.29.17");
        new n("2.5.29.18");
        new n("2.5.29.19");
        new n("2.5.29.20");
        new n("2.5.29.21");
        new n("2.5.29.23");
        new n("2.5.29.24");
        new n("2.5.29.27");
        new n("2.5.29.28");
        new n("2.5.29.29");
        new n("2.5.29.30");
        new n("2.5.29.31");
        new n("2.5.29.32");
        new n("2.5.29.33");
        new n("2.5.29.35");
        new n("2.5.29.36");
        new n("2.5.29.37");
        new n("2.5.29.46");
        new n("2.5.29.54");
        new n("1.3.6.1.5.5.7.1.1");
        new n("1.3.6.1.5.5.7.1.11");
        new n("1.3.6.1.5.5.7.1.12");
        new n("1.3.6.1.5.5.7.1.2");
        new n("1.3.6.1.5.5.7.1.3");
        new n("1.3.6.1.5.5.7.1.4");
        new n("2.5.29.55");
    }

    public w0(s sVar) {
        Enumeration E = sVar.E();
        while (E.hasMoreElements()) {
            s B = s.B(E.nextElement());
            if (B.size() == 3) {
                this.d.put(B.D(0), new v0(c.C(B.D(1)), o.B(B.D(2))));
            } else if (B.size() == 2) {
                this.d.put(B.D(0), new v0(false, o.B(B.D(1))));
            } else {
                throw new IllegalArgumentException(a.K0(B, a.P0("Bad sequence size: ")));
            }
            this.q.addElement(B.D(0));
        }
    }

    public static w0 s(Object obj) {
        if (obj == null || (obj instanceof w0)) {
            return (w0) obj;
        }
        if (obj instanceof s) {
            return new w0((s) obj);
        }
        if (obj instanceof v) {
            return new w0((s) ((v) obj).c());
        }
        if (obj instanceof z) {
            return s(((z) obj).C());
        }
        throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
    }

    public r c() {
        f fVar = new f(this.q.size());
        Enumeration elements = this.q.elements();
        while (elements.hasMoreElements()) {
            f fVar2 = new f(3);
            n nVar = (n) elements.nextElement();
            v0 v0Var = (v0) this.d.get(nVar);
            fVar2.a(nVar);
            if (v0Var.c) {
                fVar2.a(c.d);
            }
            fVar2.a(v0Var.d);
            fVar.a(new b1(fVar2));
        }
        return new b1(fVar);
    }
}
