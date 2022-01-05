package m0.r.t.a.r.e.b;

import java.util.Collection;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.m.v;

/* compiled from: methodSignatureMapping.kt */
public final class r implements q<f> {
    public static final r a = new r();

    public Object a(d dVar) {
        i.e(dVar, "classDescriptor");
        return null;
    }

    public String b(d dVar) {
        i.e(this, "this");
        i.e(dVar, "classDescriptor");
        return null;
    }

    public v c(Collection<? extends v> collection) {
        i.e(collection, "types");
        throw new AssertionError(i.k("There should be no intersection type in existing descriptors, but found: ", g.E(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63)));
    }

    public String d(d dVar) {
        i.e(dVar, "classDescriptor");
        return null;
    }

    public v e(v vVar) {
        i.e(this, "this");
        i.e(vVar, "kotlinType");
        return null;
    }

    public boolean f() {
        i.e(this, "this");
        return true;
    }

    public void g(v vVar, d dVar) {
        i.e(vVar, "kotlinType");
        i.e(dVar, "descriptor");
    }
}
