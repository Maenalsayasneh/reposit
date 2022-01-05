package j$.time;

import j$.time.chrono.b;
import j$.time.chrono.d;
import j$.time.chrono.f;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.zone.a;
import j$.time.zone.c;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class ZonedDateTime implements Temporal, f<e>, Serializable {
    private final f a;
    private final k b;
    private final ZoneId c;

    private ZonedDateTime(f fVar, k kVar, ZoneId zoneId) {
        this.a = fVar;
        this.b = kVar;
        this.c = zoneId;
    }

    public static ZonedDateTime B(f fVar, k kVar, ZoneId zoneId) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(kVar, "offset");
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.p().g(fVar).contains(kVar) ? new ZonedDateTime(fVar, kVar, zoneId) : o(fVar.X(kVar), fVar.P(), zoneId);
    }

    public static ZonedDateTime I(f fVar, ZoneId zoneId, k kVar) {
        Object obj;
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof k) {
            return new ZonedDateTime(fVar, (k) zoneId, zoneId);
        }
        c p = zoneId.p();
        List g = p.g(fVar);
        if (g.size() == 1) {
            obj = g.get(0);
        } else {
            if (g.size() == 0) {
                a f = p.f(fVar);
                fVar = fVar.j0(f.p().getSeconds());
                kVar = f.q();
            } else if (kVar == null || !g.contains(kVar)) {
                obj = (k) g.get(0);
                Objects.requireNonNull(obj, "offset");
            }
            return new ZonedDateTime(fVar, kVar, zoneId);
        }
        kVar = (k) obj;
        return new ZonedDateTime(fVar, kVar, zoneId);
    }

    private ZonedDateTime V(f fVar) {
        return I(fVar, this.c, this.b);
    }

    private ZonedDateTime Y(k kVar) {
        return (kVar.equals(this.b) || !this.c.p().g(this.a).contains(kVar)) ? this : new ZonedDateTime(this.a, kVar, this.c);
    }

    private static ZonedDateTime o(long j, int i, ZoneId zoneId) {
        k d = zoneId.p().d(Instant.Y(j, (long) i));
        return new ZonedDateTime(f.e0(j, i, d), d, zoneId);
    }

    public static ZonedDateTime p(l lVar) {
        if (lVar instanceof ZonedDateTime) {
            return (ZonedDateTime) lVar;
        }
        try {
            ZoneId o = ZoneId.o(lVar);
            j jVar = j.INSTANT_SECONDS;
            if (lVar.f(jVar)) {
                return o(lVar.g(jVar), lVar.j(j.NANO_OF_SECOND), o);
            }
            return I(f.d0(e.q(lVar), g.q(lVar)), o, (k) null);
        } catch (c e) {
            throw new c("Unable to obtain ZonedDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public static ZonedDateTime q(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return o(instant.getEpochSecond(), instant.B(), zoneId);
    }

    public k D() {
        return this.b;
    }

    /* renamed from: P */
    public ZonedDateTime a(long j, s sVar) {
        if (sVar instanceof ChronoUnit) {
            return sVar.o() ? V(this.a.a(j, sVar)) : B(this.a.a(j, sVar), this.b, this.c);
        }
        return (ZonedDateTime) sVar.p(this, j);
    }

    public ZoneId T() {
        return this.c;
    }

    public f Z() {
        return this.a;
    }

    /* renamed from: a0 */
    public ZonedDateTime b(m mVar) {
        if (mVar instanceof e) {
            return I(f.d0((e) mVar, this.a.m()), this.c, this.b);
        }
        if (mVar instanceof g) {
            return I(f.d0(this.a.l0(), (g) mVar), this.c, this.b);
        }
        if (mVar instanceof f) {
            return V((f) mVar);
        }
        if (mVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) mVar;
            return I(offsetDateTime.B(), this.c, offsetDateTime.D());
        } else if (!(mVar instanceof Instant)) {
            return mVar instanceof k ? Y((k) mVar) : (ZonedDateTime) mVar.e(this);
        } else {
            Instant instant = (Instant) mVar;
            return o(instant.getEpochSecond(), instant.B(), this.c);
        }
    }

    /* renamed from: b0 */
    public ZonedDateTime c(p pVar, long j) {
        if (!(pVar instanceof j)) {
            return (ZonedDateTime) pVar.p(this, j);
        }
        j jVar = (j) pVar;
        int ordinal = jVar.ordinal();
        if (ordinal != 28) {
            return ordinal != 29 ? V(this.a.c(pVar, j)) : Y(k.a0(jVar.Y(j)));
        }
        return o(j, this.a.P(), this.c);
    }

    /* renamed from: c0 */
    public ZonedDateTime G(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : o(this.a.X(this.b), this.a.P(), zoneId);
    }

    public Object d(r rVar) {
        int i = q.a;
        if (rVar == j$.time.temporal.c.a) {
            return this.a.l0();
        }
        return super.d(rVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c);
    }

    public boolean f(p pVar) {
        return (pVar instanceof j) || (pVar != null && pVar.V(this));
    }

    public long g(p pVar) {
        if (!(pVar instanceof j)) {
            return pVar.q(this);
        }
        int ordinal = ((j) pVar).ordinal();
        if (ordinal == 28) {
            return Q();
        }
        if (ordinal != 29) {
            return this.a.g(pVar);
        }
        return (long) this.b.V();
    }

    public int getDayOfYear() {
        return this.a.q();
    }

    public int getHour() {
        return this.a.B();
    }

    public int getMinute() {
        return this.a.I();
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public u i(p pVar) {
        return pVar instanceof j ? (pVar == j.INSTANT_SECONDS || pVar == j.OFFSET_SECONDS) ? pVar.B() : this.a.i(pVar) : pVar.I(this);
    }

    public int j(p pVar) {
        if (!(pVar instanceof j)) {
            return super.j(pVar);
        }
        int ordinal = ((j) pVar).ordinal();
        if (ordinal == 28) {
            throw new t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        } else if (ordinal != 29) {
            return this.a.j(pVar);
        } else {
            return this.b.V();
        }
    }

    public long l(Temporal temporal, s sVar) {
        ZonedDateTime p = p(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, p);
        }
        ZonedDateTime c0 = p.G(this.c);
        return sVar.o() ? this.a.l(c0.a, sVar) : toOffsetDateTime().l(c0.toOffsetDateTime(), sVar);
    }

    public g m() {
        return this.a.m();
    }

    public b n() {
        return this.a.l0();
    }

    public OffsetDateTime toOffsetDateTime() {
        return OffsetDateTime.p(this.a, this.b);
    }

    public String toString() {
        String str = this.a.toString() + this.b.toString();
        if (this.b == this.c) {
            return str;
        }
        return str + '[' + this.c.toString() + ']';
    }

    public ZonedDateTime withHour(int i) {
        return I(this.a.q0(i), this.c, this.b);
    }

    public ZonedDateTime withMinute(int i) {
        return I(this.a.r0(i), this.c, this.b);
    }

    public d z() {
        return this.a;
    }
}
