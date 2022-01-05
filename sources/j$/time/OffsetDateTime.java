package j$.time;

import androidx.recyclerview.widget.RecyclerView;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.c;
import j$.time.temporal.d;
import j$.time.temporal.e;
import j$.time.temporal.f;
import j$.time.temporal.g;
import j$.time.temporal.h;
import j$.time.temporal.i;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import java.io.Serializable;
import java.util.Objects;

public final class OffsetDateTime implements Temporal, m, Comparable<OffsetDateTime>, Serializable {
    private final f a;
    private final k b;

    static {
        new OffsetDateTime(f.a, k.f);
        new OffsetDateTime(f.b, k.e);
    }

    private OffsetDateTime(f fVar, k kVar) {
        Objects.requireNonNull(fVar, "dateTime");
        this.a = fVar;
        Objects.requireNonNull(kVar, "offset");
        this.b = kVar;
    }

    private OffsetDateTime I(f fVar, k kVar) {
        return (this.a != fVar || !this.b.equals(kVar)) ? new OffsetDateTime(fVar, kVar) : this;
    }

    public static OffsetDateTime now() {
        b d = b.d();
        Instant b2 = d.b();
        return q(b2, d.a().p().d(b2));
    }

    public static OffsetDateTime o(l lVar) {
        if (lVar instanceof OffsetDateTime) {
            return (OffsetDateTime) lVar;
        }
        try {
            k P = k.P(lVar);
            int i = q.a;
            e eVar = (e) lVar.d(c.a);
            g gVar = (g) lVar.d(h.a);
            if (eVar == null || gVar == null) {
                return q(Instant.q(lVar), P);
            }
            return new OffsetDateTime(f.d0(eVar, gVar), P);
        } catch (c e) {
            throw new c("Unable to obtain OffsetDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public static OffsetDateTime p(f fVar, k kVar) {
        return new OffsetDateTime(fVar, kVar);
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.b;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.f(charSequence, a.a);
    }

    public static OffsetDateTime q(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        k d = j$.time.zone.c.j((k) zoneId).d(instant);
        return new OffsetDateTime(f.e0(instant.getEpochSecond(), instant.B(), d), d);
    }

    public f B() {
        return this.a;
    }

    public k D() {
        return this.b;
    }

    public long Q() {
        return this.a.X(this.b);
    }

    public Temporal a(long j, s sVar) {
        return sVar instanceof ChronoUnit ? I(this.a.a(j, sVar), this.b) : (OffsetDateTime) sVar.p(this, j);
    }

    public ZonedDateTime atZoneSameInstant(ZoneId zoneId) {
        return ZonedDateTime.B(this.a, this.b, zoneId);
    }

    public Temporal b(m mVar) {
        if ((mVar instanceof e) || (mVar instanceof g) || (mVar instanceof f)) {
            return I(this.a.b(mVar), this.b);
        }
        if (mVar instanceof Instant) {
            return q((Instant) mVar, this.b);
        }
        if (mVar instanceof k) {
            return I(this.a, (k) mVar);
        }
        boolean z = mVar instanceof OffsetDateTime;
        Object obj = mVar;
        if (!z) {
            obj = mVar.e(this);
        }
        return (OffsetDateTime) obj;
    }

    public Temporal c(p pVar, long j) {
        k kVar;
        f fVar;
        if (!(pVar instanceof j)) {
            return (OffsetDateTime) pVar.p(this, j);
        }
        j jVar = (j) pVar;
        int ordinal = jVar.ordinal();
        if (ordinal == 28) {
            return q(Instant.Y(j, (long) this.a.P()), this.b);
        }
        if (ordinal != 29) {
            fVar = this.a.c(pVar, j);
            kVar = this.b;
        } else {
            fVar = this.a;
            kVar = k.a0(jVar.Y(j));
        }
        return I(fVar, kVar);
    }

    public int compareTo(OffsetDateTime offsetDateTime) {
        int i;
        if (this.b.equals(offsetDateTime.b)) {
            i = this.a.compareTo(offsetDateTime.a);
        } else {
            i = Long.compare(Q(), offsetDateTime.Q());
            if (i == 0) {
                i = m().V() - offsetDateTime.m().V();
            }
        }
        return i == 0 ? this.a.compareTo(offsetDateTime.a) : i;
    }

    public Object d(r rVar) {
        int i = q.a;
        if (rVar == e.a || rVar == i.a) {
            return this.b;
        }
        if (rVar == f.a) {
            return null;
        }
        if (rVar == c.a) {
            return this.a.l0();
        }
        if (rVar == h.a) {
            return m();
        }
        if (rVar == d.a) {
            return j$.time.chrono.j.a;
        }
        return rVar == g.a ? ChronoUnit.NANOS : rVar.a(this);
    }

    public Temporal e(Temporal temporal) {
        return temporal.c(j.EPOCH_DAY, this.a.l0().v()).c(j.NANO_OF_DAY, m().g0()).c(j.OFFSET_SECONDS, (long) this.b.V());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b);
    }

    public boolean f(p pVar) {
        return (pVar instanceof j) || (pVar != null && pVar.V(this));
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
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

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
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
        OffsetDateTime o = o(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, o);
        }
        k kVar = this.b;
        if (!kVar.equals(o.b)) {
            o = new OffsetDateTime(o.a.j0((long) (kVar.V() - o.b.V())), kVar);
        }
        return this.a.l(o.a, sVar);
    }

    public g m() {
        return this.a.m();
    }

    public OffsetDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(RecyclerView.FOREVER_NS).plusDays(1) : plusDays(-j);
    }

    public OffsetDateTime plusDays(long j) {
        return I(this.a.g0(j), this.b);
    }

    public OffsetDateTime plusHours(long j) {
        return I(this.a.h0(j), this.b);
    }

    public Instant toInstant() {
        return this.a.K(this.b);
    }

    public String toString() {
        return this.a.toString() + this.b.toString();
    }

    public OffsetDateTime withDayOfMonth(int i) {
        return I(this.a.p0(i), this.b);
    }

    public OffsetDateTime withHour(int i) {
        return I(this.a.q0(i), this.b);
    }

    public OffsetDateTime withMinute(int i) {
        return I(this.a.r0(i), this.b);
    }

    public OffsetDateTime withMonth(int i) {
        return I(this.a.s0(i), this.b);
    }

    public OffsetDateTime withYear(int i) {
        return I(this.a.t0(i), this.b);
    }
}
