package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.chrono.b;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.d;
import j$.time.temporal.e;
import j$.time.temporal.g;
import j$.time.temporal.h;
import j$.time.temporal.i;
import j$.time.temporal.j;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;

public interface f<D extends b> extends Temporal, Comparable<f<?>> {
    k D();

    f G(ZoneId zoneId);

    long Q() {
        return ((n().v() * 86400) + ((long) m().h0())) - ((long) D().V());
    }

    ZoneId T();

    f a(long j, s sVar);

    f b(m mVar) {
        return g.o(h(), mVar.e(this));
    }

    f c(p pVar, long j);

    Object d(r rVar) {
        int i = q.a;
        return (rVar == i.a || rVar == j$.time.temporal.f.a) ? T() : rVar == e.a ? D() : rVar == h.a ? m() : rVar == d.a ? h() : rVar == g.a ? ChronoUnit.NANOS : rVar.a(this);
    }

    long g(p pVar) {
        if (!(pVar instanceof j)) {
            return pVar.q(this);
        }
        int ordinal = ((j) pVar).ordinal();
        return ordinal != 28 ? ordinal != 29 ? z().g(pVar) : (long) D().V() : Q();
    }

    h h() {
        return n().h();
    }

    u i(p pVar) {
        return pVar instanceof j ? (pVar == j.INSTANT_SECONDS || pVar == j.OFFSET_SECONDS) ? pVar.B() : z().i(pVar) : pVar.I(this);
    }

    int j(p pVar) {
        if (!(pVar instanceof j)) {
            return super.j(pVar);
        }
        int ordinal = ((j) pVar).ordinal();
        if (ordinal != 28) {
            return ordinal != 29 ? z().j(pVar) : D().V();
        }
        throw new t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    j$.time.g m() {
        return z().m();
    }

    b n() {
        return z().n();
    }

    /* renamed from: y */
    int compareTo(f fVar) {
        int compare = Long.compare(Q(), fVar.Q());
        if (compare != 0) {
            return compare;
        }
        int V = m().V() - fVar.m().V();
        if (V != 0) {
            return V;
        }
        int W = z().compareTo(fVar.z());
        if (W != 0) {
            return W;
        }
        int compareTo = T().t().compareTo(fVar.T().t());
        return compareTo == 0 ? h().r(fVar.h()) : compareTo;
    }

    d z();
}
