package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.b;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.e;
import j$.time.temporal.f;
import j$.time.temporal.g;
import j$.time.temporal.h;
import j$.time.temporal.i;
import j$.time.temporal.j;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.util.Objects;

public interface d<D extends b> extends Temporal, m, Comparable<d<?>> {
    f H(ZoneId zoneId);

    Instant K(k kVar) {
        return Instant.Y(X(kVar), (long) m().V());
    }

    /* renamed from: W */
    int compareTo(d dVar) {
        int U = n().U(dVar.n());
        if (U != 0) {
            return U;
        }
        int o = m().compareTo(dVar.m());
        return o == 0 ? h().r(dVar.h()) : o;
    }

    long X(k kVar) {
        Objects.requireNonNull(kVar, "offset");
        return ((n().v() * 86400) + ((long) m().h0())) - ((long) kVar.V());
    }

    d a(long j, s sVar);

    d b(m mVar) {
        return e.o(h(), mVar.e(this));
    }

    d c(p pVar, long j);

    Object d(r rVar) {
        int i = q.a;
        if (rVar == f.a || rVar == i.a || rVar == e.a) {
            return null;
        }
        return rVar == h.a ? m() : rVar == j$.time.temporal.d.a ? h() : rVar == g.a ? ChronoUnit.NANOS : rVar.a(this);
    }

    Temporal e(Temporal temporal) {
        return temporal.c(j.EPOCH_DAY, n().v()).c(j.NANO_OF_DAY, m().g0());
    }

    h h() {
        return n().h();
    }

    j$.time.g m();

    b n();
}
