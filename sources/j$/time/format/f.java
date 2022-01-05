package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.b;
import j$.time.chrono.h;
import j$.time.temporal.d;
import j$.time.temporal.g;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.u;

class f implements l {
    final /* synthetic */ b a;
    final /* synthetic */ l b;
    final /* synthetic */ h c;
    final /* synthetic */ ZoneId d;

    f(b bVar, l lVar, h hVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = lVar;
        this.c = hVar;
        this.d = zoneId;
    }

    public Object d(r rVar) {
        int i = q.a;
        return rVar == d.a ? this.c : rVar == j$.time.temporal.f.a ? this.d : rVar == g.a ? this.b.d(rVar) : rVar.a(this);
    }

    public boolean f(p pVar) {
        return (this.a == null || !pVar.o()) ? this.b.f(pVar) : this.a.f(pVar);
    }

    public long g(p pVar) {
        return ((this.a == null || !pVar.o()) ? this.b : this.a).g(pVar);
    }

    public u i(p pVar) {
        return ((this.a == null || !pVar.o()) ? this.b : this.a).i(pVar);
    }
}
