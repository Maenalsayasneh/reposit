package j$.time.chrono;

import j$.com.android.tools.r8.a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.b;
import j$.time.c;
import j$.time.e;
import j$.time.format.k;
import j$.time.g;
import j$.time.temporal.d;
import j$.time.temporal.l;
import j$.time.temporal.q;
import java.util.Map;
import java.util.Objects;

public interface h extends Comparable<h> {
    static h E(l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        int i = q.a;
        h hVar = (h) lVar.d(d.a);
        return hVar != null ? hVar : j.a;
    }

    boolean C(long j);

    b F(int i, int i2, int i3);

    b M() {
        return s(b.d());
    }

    b R(Map map, k kVar);

    d S(l lVar) {
        try {
            return u(lVar).L(g.q(lVar));
        } catch (c e) {
            StringBuilder b = a.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            b.append(lVar.getClass());
            throw new c(b.toString(), e);
        }
    }

    boolean equals(Object obj);

    int r(h hVar);

    b s(b bVar) {
        return u(e.b0(bVar));
    }

    String t();

    b u(l lVar);

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        return j$.time.chrono.g.p(j$.time.chrono.e.o(r3, S(r4)), r0, (j$.time.k) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    j$.time.chrono.f w(j$.time.temporal.l r4) {
        /*
            r3 = this;
            j$.time.ZoneId r0 = j$.time.ZoneId.o(r4)     // Catch:{ c -> 0x001b }
            j$.time.Instant r1 = j$.time.Instant.q(r4)     // Catch:{ c -> 0x000d }
            j$.time.chrono.f r4 = r3.x(r1, r0)     // Catch:{ c -> 0x000d }
            return r4
        L_0x000d:
            j$.time.chrono.d r1 = r3.S(r4)     // Catch:{ c -> 0x001b }
            j$.time.chrono.e r1 = j$.time.chrono.e.o(r3, r1)     // Catch:{ c -> 0x001b }
            r2 = 0
            j$.time.chrono.f r4 = j$.time.chrono.g.p(r1, r0, r2)     // Catch:{ c -> 0x001b }
            return r4
        L_0x001b:
            r0 = move-exception
            j$.time.c r1 = new j$.time.c
            java.lang.String r2 = "Unable to obtain ChronoZonedDateTime from TemporalAccessor: "
            java.lang.StringBuilder r2 = j$.com.android.tools.r8.a.b(r2)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.h.w(j$.time.temporal.l):j$.time.chrono.f");
    }

    f x(Instant instant, ZoneId zoneId) {
        return g.q(this, instant, zoneId);
    }
}
