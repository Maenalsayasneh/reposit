package j$.time;

import androidx.core.app.NotificationCompat;
import j$.time.chrono.b;
import j$.time.chrono.d;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.c;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.u;
import java.io.Serializable;
import java.util.Objects;

public final class f implements Temporal, m, d<e>, Serializable {
    public static final f a = d0(e.a, g.a);
    public static final f b = d0(e.b, g.b);
    private final e c;
    private final g d;

    private f(e eVar, g gVar) {
        this.c = eVar;
        this.d = gVar;
    }

    public static f b0(int i, int i2, int i3, int i4, int i5) {
        return new f(e.c0(i, i2, i3), g.Z(i4, i5));
    }

    public static f c0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new f(e.c0(i, i2, i3), g.a0(i4, i5, i6, i7));
    }

    public static f d0(e eVar, g gVar) {
        Objects.requireNonNull(eVar, "date");
        Objects.requireNonNull(gVar, NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP);
        return new f(eVar, gVar);
    }

    public static f e0(long j, int i, k kVar) {
        Objects.requireNonNull(kVar, "offset");
        long j2 = (long) i;
        j.NANO_OF_SECOND.Z(j2);
        long V = j + ((long) kVar.V());
        return new f(e.d0(Math.floorDiv(V, 86400)), g.b0((((long) ((int) Math.floorMod(V, 86400))) * 1000000000) + j2));
    }

    private f k0(e eVar, long j, long j2, long j3, long j4, int i) {
        g b0;
        e eVar2 = eVar;
        if ((j | j2 | j3 | j4) == 0) {
            b0 = this.d;
        } else {
            long j5 = j / 24;
            long j6 = j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
            long j7 = (long) i;
            long j8 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
            long g02 = this.d.g0();
            long j9 = (j8 * j7) + g02;
            long floorDiv = Math.floorDiv(j9, 86400000000000L) + (j6 * j7);
            long floorMod = Math.floorMod(j9, 86400000000000L);
            b0 = floorMod == g02 ? this.d : g.b0(floorMod);
            eVar2 = eVar2.g0(floorDiv);
        }
        return m0(eVar2, b0);
    }

    private f m0(e eVar, g gVar) {
        return (this.c == eVar && this.d == gVar) ? this : new f(eVar, gVar);
    }

    private int o(f fVar) {
        int o = this.c.o(fVar.c);
        return o == 0 ? this.d.compareTo(fVar.d) : o;
    }

    public static f p(l lVar) {
        if (lVar instanceof f) {
            return (f) lVar;
        }
        if (lVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) lVar).Z();
        }
        if (lVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) lVar).B();
        }
        try {
            return new f(e.q(lVar), g.q(lVar));
        } catch (c e) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public int B() {
        return this.d.I();
    }

    public j$.time.chrono.f H(ZoneId zoneId) {
        return ZonedDateTime.I(this, zoneId, (k) null);
    }

    public int I() {
        return this.d.P();
    }

    public int P() {
        return this.d.V();
    }

    public int V() {
        return this.d.Y();
    }

    /* renamed from: W */
    public int compareTo(d dVar) {
        return dVar instanceof f ? o((f) dVar) : super.compareTo(dVar);
    }

    public int Y() {
        return this.c.Z();
    }

    public boolean Z(d dVar) {
        if (dVar instanceof f) {
            return o((f) dVar) > 0;
        }
        int i = (((e) n()).v() > dVar.n().v() ? 1 : (((e) n()).v() == dVar.n().v() ? 0 : -1));
        return i > 0 || (i == 0 && m().g0() > dVar.m().g0());
    }

    public boolean a0(d dVar) {
        if (dVar instanceof f) {
            return o((f) dVar) < 0;
        }
        int i = (((e) n()).v() > dVar.n().v() ? 1 : (((e) n()).v() == dVar.n().v() ? 0 : -1));
        return i < 0 || (i == 0 && m().g0() < dVar.m().g0());
    }

    public Object d(r rVar) {
        int i = q.a;
        return rVar == c.a ? this.c : super.d(rVar);
    }

    public Temporal e(Temporal temporal) {
        return super.e(temporal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.c.equals(fVar.c) && this.d.equals(fVar.d);
    }

    public boolean f(p pVar) {
        if (!(pVar instanceof j)) {
            return pVar != null && pVar.V(this);
        }
        j jVar = (j) pVar;
        return jVar.o() || jVar.k();
    }

    /* renamed from: f0 */
    public f a(long j, s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return (f) sVar.p(this, j);
        }
        switch (((ChronoUnit) sVar).ordinal()) {
            case 0:
                return i0(j);
            case 1:
                return g0(j / 86400000000L).i0((j % 86400000000L) * 1000);
            case 2:
                return g0(j / 86400000).i0((j % 86400000) * 1000000);
            case 3:
                return j0(j);
            case 4:
                return k0(this.c, 0, j, 0, 0, 1);
            case 5:
                return h0(j);
            case 6:
                return g0(j / 256).h0((j % 256) * 12);
            default:
                return m0(this.c.a(j, sVar), this.d);
        }
    }

    public long g(p pVar) {
        return pVar instanceof j ? ((j) pVar).k() ? this.d.g(pVar) : this.c.g(pVar) : pVar.q(this);
    }

    public f g0(long j) {
        return m0(this.c.g0(j), this.d);
    }

    public f h0(long j) {
        return k0(this.c, j, 0, 0, 0, 1);
    }

    public int hashCode() {
        return this.c.hashCode() ^ this.d.hashCode();
    }

    public u i(p pVar) {
        return pVar instanceof j ? ((j) pVar).k() ? this.d.i(pVar) : this.c.i(pVar) : pVar.I(this);
    }

    public f i0(long j) {
        return k0(this.c, 0, 0, 0, j, 1);
    }

    public int j(p pVar) {
        return pVar instanceof j ? ((j) pVar).k() ? this.d.j(pVar) : this.c.j(pVar) : super.j(pVar);
    }

    public f j0(long j) {
        return k0(this.c, 0, 0, j, 0, 1);
    }

    public long l(Temporal temporal, s sVar) {
        long j;
        long j2;
        long j3;
        long j4;
        f p = p(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, p);
        }
        if (sVar.k()) {
            long p2 = this.c.p(p.c);
            int i = (p2 > 0 ? 1 : (p2 == 0 ? 0 : -1));
            if (i == 0) {
                return this.d.l(p.d, sVar);
            }
            long g02 = p.d.g0() - this.d.g0();
            if (i > 0) {
                j2 = p2 - 1;
                j = g02 + 86400000000000L;
            } else {
                j2 = p2 + 1;
                j = g02 - 86400000000000L;
            }
            switch (((ChronoUnit) sVar).ordinal()) {
                case 0:
                    j2 = Math.multiplyExact(j2, 86400000000000L);
                    break;
                case 1:
                    j3 = Math.multiplyExact(j2, 86400000000L);
                    j4 = 1000;
                    break;
                case 2:
                    j3 = Math.multiplyExact(j2, 86400000);
                    j4 = 1000000;
                    break;
                case 3:
                    j3 = Math.multiplyExact(j2, 86400);
                    j4 = 1000000000;
                    break;
                case 4:
                    j3 = Math.multiplyExact(j2, 1440);
                    j4 = 60000000000L;
                    break;
                case 5:
                    j3 = Math.multiplyExact(j2, 24);
                    j4 = 3600000000000L;
                    break;
                case 6:
                    j3 = Math.multiplyExact(j2, 2);
                    j4 = 43200000000000L;
                    break;
            }
            j2 = j3;
            j /= j4;
            return Math.addExact(j2, j);
        }
        e eVar = p.c;
        e eVar2 = this.c;
        Objects.requireNonNull(eVar);
        boolean z = false;
        if (!(eVar2 instanceof e) ? eVar.v() > eVar2.v() : eVar.o(eVar2) > 0) {
            if (p.d.compareTo(this.d) < 0) {
                eVar = eVar.g0(-1);
                return this.c.l(eVar, sVar);
            }
        }
        e eVar3 = this.c;
        if (!(eVar3 instanceof e) ? eVar.v() < eVar3.v() : eVar.o(eVar3) < 0) {
            if (p.d.compareTo(this.d) > 0) {
                z = true;
            }
            if (z) {
                eVar = eVar.g0(1);
            }
        }
        return this.c.l(eVar, sVar);
    }

    public e l0() {
        return this.c;
    }

    public g m() {
        return this.d;
    }

    public b n() {
        return this.c;
    }

    /* renamed from: n0 */
    public f b(m mVar) {
        return mVar instanceof e ? m0((e) mVar, this.d) : mVar instanceof g ? m0(this.c, (g) mVar) : mVar instanceof f ? (f) mVar : (f) mVar.e(this);
    }

    /* renamed from: o0 */
    public f c(p pVar, long j) {
        return pVar instanceof j ? ((j) pVar).k() ? m0(this.c, this.d.c(pVar, j)) : m0(this.c.c(pVar, j), this.d) : (f) pVar.p(this, j);
    }

    public f p0(int i) {
        return m0(this.c.m0(i), this.d);
    }

    public int q() {
        return this.c.P();
    }

    public f q0(int i) {
        return m0(this.c, this.d.j0(i));
    }

    public f r0(int i) {
        return m0(this.c, this.d.k0(i));
    }

    public f s0(int i) {
        return m0(this.c.o0(i), this.d);
    }

    public f t0(int i) {
        return m0(this.c.p0(i), this.d);
    }

    public String toString() {
        return this.c.toString() + 'T' + this.d.toString();
    }
}
