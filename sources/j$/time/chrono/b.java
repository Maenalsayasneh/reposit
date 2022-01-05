package j$.time.chrono;

import androidx.recyclerview.widget.RecyclerView;
import j$.time.g;
import j$.time.i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.d;
import j$.time.temporal.e;
import j$.time.temporal.f;
import j$.time.temporal.h;
import j$.time.temporal.j;
import j$.time.temporal.m;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;

public interface b extends Temporal, m, Comparable<b> {
    b A(long j, s sVar) {
        return c.o(h(), j == Long.MIN_VALUE ? a(RecyclerView.FOREVER_NS, sVar).a(1, sVar) : a(-j, sVar));
    }

    int J() {
        return O() ? 366 : 365;
    }

    d L(g gVar) {
        return e.p(this, gVar);
    }

    b N(o oVar) {
        return c.o(h(), ((i) oVar).a(this));
    }

    boolean O() {
        return h().C(g(j.YEAR));
    }

    int U(b bVar) {
        int compare = Long.compare(v(), bVar.v());
        return compare == 0 ? h().r(bVar.h()) : compare;
    }

    b a(long j, s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return c.o(h(), sVar.p(this, j));
        }
        throw new t("Unsupported unit: " + sVar);
    }

    b b(m mVar) {
        return c.o(h(), mVar.e(this));
    }

    b c(p pVar, long j) {
        if (!(pVar instanceof j)) {
            return c.o(h(), pVar.p(this, j));
        }
        throw new t("Unsupported field: " + pVar);
    }

    Object d(r rVar) {
        int i = q.a;
        if (rVar == f.a || rVar == j$.time.temporal.i.a || rVar == e.a || rVar == h.a) {
            return null;
        }
        return rVar == d.a ? h() : rVar == j$.time.temporal.g.a ? ChronoUnit.DAYS : rVar.a(this);
    }

    Temporal e(Temporal temporal) {
        return temporal.c(j.EPOCH_DAY, v());
    }

    boolean equals(Object obj);

    boolean f(p pVar) {
        return pVar instanceof j ? pVar.o() : pVar != null && pVar.V(this);
    }

    h h();

    int hashCode();

    long l(Temporal temporal, s sVar);

    String toString();

    long v() {
        return g(j.EPOCH_DAY);
    }
}
