package i0.n.c.a.b;

import m0.n.b.i;
import q0.e0;
import q0.h0.h.g;
import q0.x;

/* compiled from: AuthorizationInterceptor.kt */
public final class b implements x {
    public final c a;

    public b(c cVar) {
        i.e(cVar, "authorizationMethod");
        this.a = cVar;
    }

    public e0 intercept(x.a aVar) {
        i.e(aVar, "chain");
        g gVar = (g) aVar;
        return gVar.a(this.a.a(gVar.f));
    }
}
