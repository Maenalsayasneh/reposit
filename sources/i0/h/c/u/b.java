package i0.h.c.u;

import i0.h.c.j.e;
import i0.h.c.j.g;
import i0.h.c.j.z;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher */
public final /* synthetic */ class b implements g {
    public static final b a = new b();

    public Object a(e eVar) {
        Set<e> d = ((z) eVar).d(e.class);
        d dVar = d.a;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = d.a;
                if (dVar == null) {
                    dVar = new d();
                    d.a = dVar;
                }
            }
        }
        return new c(d, dVar);
    }
}
