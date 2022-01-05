package m0.r.t.a.r.k.b;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import m0.n.b.i;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.c.w;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;

/* compiled from: DeserializedClassDataFinder.kt */
public final class j implements e {
    public final w a;

    public j(w wVar) {
        i.e(wVar, "packageFragmentProvider");
        this.a = wVar;
    }

    public d a(a aVar) {
        d a2;
        i.e(aVar, "classId");
        w wVar = this.a;
        b h = aVar.h();
        i.d(h, "classId.packageFqName");
        Iterator it = ((ArrayList) h.Z2(wVar, h)).iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if ((vVar instanceof k) && (a2 = ((k) vVar).B0().a(aVar)) != null) {
                return a2;
            }
        }
        return null;
    }
}
