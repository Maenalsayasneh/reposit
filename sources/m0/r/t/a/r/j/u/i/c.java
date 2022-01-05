package m0.r.t.a.r.j.u.i;

import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: ImplicitClassReceiver.kt */
public class c implements d, f {
    public final d a;
    public final d b;

    public c(d dVar, c cVar) {
        i.e(dVar, "classDescriptor");
        this.a = dVar;
        this.b = dVar;
    }

    public boolean equals(Object obj) {
        d dVar = this.a;
        d dVar2 = null;
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar != null) {
            dVar2 = cVar.a;
        }
        return i.a(dVar, dVar2);
    }

    public v getType() {
        a0 q = this.a.q();
        i.d(q, "classDescriptor.defaultType");
        return q;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final d p() {
        return this.a;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Class{");
        a0 q = this.a.q();
        i.d(q, "classDescriptor.defaultType");
        P0.append(q);
        P0.append('}');
        return P0.toString();
    }
}
