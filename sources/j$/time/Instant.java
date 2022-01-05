package j$.time;

import androidx.core.app.NotificationManagerCompat;
import j$.time.b;
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

public final class Instant implements Temporal, m, Comparable<Instant>, Serializable {
    public static final Instant a = new Instant(0, 0);
    private final long b;
    private final int c;

    static {
        Y(-31557014167219200L, 0);
        Y(31556889864403199L, 999999999);
    }

    private Instant(long j, int i) {
        this.b = j;
        this.c = i;
    }

    private long I(Instant instant) {
        return Math.addExact(Math.multiplyExact(Math.subtractExact(instant.b, this.b), 1000000000), (long) (instant.c - this.c));
    }

    public static Instant P(long j) {
        return p(Math.floorDiv(j, 1000), ((int) Math.floorMod(j, 1000)) * 1000000);
    }

    public static Instant V(long j) {
        return p(j, 0);
    }

    public static Instant Y(long j, long j2) {
        return p(Math.addExact(j, Math.floorDiv(j2, 1000000000)), (int) Math.floorMod(j2, 1000000000));
    }

    private Instant Z(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return Y(Math.addExact(Math.addExact(this.b, j), j2 / 1000000000), ((long) this.c) + (j2 % 1000000000));
    }

    private long b0(Instant instant) {
        long subtractExact = Math.subtractExact(instant.b, this.b);
        long j = (long) (instant.c - this.c);
        int i = (subtractExact > 0 ? 1 : (subtractExact == 0 ? 0 : -1));
        return (i <= 0 || j >= 0) ? (i >= 0 || j <= 0) ? subtractExact : subtractExact + 1 : subtractExact - 1;
    }

    public static Instant now() {
        return new b.a(k.d).b();
    }

    private static Instant p(long j, int i) {
        if ((((long) i) | j) == 0) {
            return a;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new c("Instant exceeds minimum or maximum instant");
    }

    public static Instant q(l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        Objects.requireNonNull(lVar, "temporal");
        try {
            return Y(lVar.g(j.INSTANT_SECONDS), (long) lVar.j(j.NANO_OF_SECOND));
        } catch (c e) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public int B() {
        return this.c;
    }

    public Temporal a(long j, s sVar) {
        long j2;
        if (!(sVar instanceof ChronoUnit)) {
            return (Instant) sVar.p(this, j);
        }
        switch (((ChronoUnit) sVar).ordinal()) {
            case 0:
                return Z(0, j);
            case 1:
                return Z(j / 1000000, (j % 1000000) * 1000);
            case 2:
                return Z(j / 1000, (j % 1000) * 1000000);
            case 3:
                return Z(j, 0);
            case 4:
                j2 = 60;
                break;
            case 5:
                j2 = 3600;
                break;
            case 6:
                j2 = 43200;
                break;
            case 7:
                j2 = 86400;
                break;
            default:
                throw new t("Unsupported unit: " + sVar);
        }
        return a0(Math.multiplyExact(j, j2));
    }

    public Instant a0(long j) {
        return Z(j, 0);
    }

    public Temporal b(m mVar) {
        return (Instant) mVar.e(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r3 != r2.c) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r4 = r2.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r3 != r2.c) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.temporal.Temporal c(j$.time.temporal.p r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof j$.time.temporal.j
            if (r0 == 0) goto L_0x0063
            r0 = r3
            j$.time.temporal.j r0 = (j$.time.temporal.j) r0
            r0.Z(r4)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0054
            r1 = 2
            if (r0 == r1) goto L_0x004c
            r1 = 4
            if (r0 == r1) goto L_0x0040
            r1 = 28
            if (r0 != r1) goto L_0x0029
            long r0 = r2.b
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0027
            int r3 = r2.c
        L_0x0022:
            j$.time.Instant r3 = p(r4, r3)
            goto L_0x0069
        L_0x0027:
            r3 = r2
            goto L_0x0069
        L_0x0029:
            j$.time.temporal.t r4 = new j$.time.temporal.t
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported field: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x0040:
            int r3 = (int) r4
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.c
            if (r3 == r4) goto L_0x0027
        L_0x0049:
            long r4 = r2.b
            goto L_0x0022
        L_0x004c:
            int r3 = (int) r4
            int r3 = r3 * 1000
            int r4 = r2.c
            if (r3 == r4) goto L_0x0027
            goto L_0x0049
        L_0x0054:
            int r3 = r2.c
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0027
            long r0 = r2.b
            int r3 = (int) r4
            j$.time.Instant r3 = p(r0, r3)
            goto L_0x0069
        L_0x0063:
            j$.time.temporal.Temporal r3 = r3.p(r2, r4)
            j$.time.Instant r3 = (j$.time.Instant) r3
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.c(j$.time.temporal.p, long):j$.time.temporal.Temporal");
    }

    public int compareTo(Object obj) {
        Instant instant = (Instant) obj;
        int compare = Long.compare(this.b, instant.b);
        return compare != 0 ? compare : this.c - instant.c;
    }

    public Object d(r rVar) {
        int i = q.a;
        if (rVar == g.a) {
            return ChronoUnit.NANOS;
        }
        if (rVar == d.a || rVar == f.a || rVar == i.a || rVar == e.a || rVar == c.a || rVar == h.a) {
            return null;
        }
        return rVar.a(this);
    }

    public Temporal e(Temporal temporal) {
        return temporal.c(j.INSTANT_SECONDS, this.b).c(j.NANO_OF_SECOND, (long) this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.b == instant.b && this.c == instant.c;
    }

    public boolean f(p pVar) {
        return pVar instanceof j ? pVar == j.INSTANT_SECONDS || pVar == j.NANO_OF_SECOND || pVar == j.MICRO_OF_SECOND || pVar == j.MILLI_OF_SECOND : pVar != null && pVar.V(this);
    }

    public long g(p pVar) {
        int i;
        if (!(pVar instanceof j)) {
            return pVar.q(this);
        }
        int ordinal = ((j) pVar).ordinal();
        if (ordinal == 0) {
            i = this.c;
        } else if (ordinal == 2) {
            i = this.c / 1000;
        } else if (ordinal == 4) {
            i = this.c / 1000000;
        } else if (ordinal == 28) {
            return this.b;
        } else {
            throw new t("Unsupported field: " + pVar);
        }
        return (long) i;
    }

    public long getEpochSecond() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        return (this.c * 51) + ((int) (j ^ (j >>> 32)));
    }

    public u i(p pVar) {
        return super.i(pVar);
    }

    public int j(p pVar) {
        if (!(pVar instanceof j)) {
            return super.i(pVar).a(pVar.q(this), pVar);
        }
        int ordinal = ((j) pVar).ordinal();
        if (ordinal == 0) {
            return this.c;
        }
        if (ordinal == 2) {
            return this.c / 1000;
        }
        if (ordinal == 4) {
            return this.c / 1000000;
        }
        if (ordinal == 28) {
            j.INSTANT_SECONDS.Y(this.b);
        }
        throw new t("Unsupported field: " + pVar);
    }

    public long l(Temporal temporal, s sVar) {
        Instant q = q(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, q);
        }
        switch (((ChronoUnit) sVar).ordinal()) {
            case 0:
                return I(q);
            case 1:
                return I(q) / 1000;
            case 2:
                return Math.subtractExact(q.toEpochMilli(), toEpochMilli());
            case 3:
                return b0(q);
            case 4:
                return b0(q) / 60;
            case 5:
                return b0(q) / 3600;
            case 6:
                return b0(q) / 43200;
            case 7:
                return b0(q) / 86400;
            default:
                throw new t("Unsupported unit: " + sVar);
        }
    }

    public int o(Instant instant) {
        int compare = Long.compare(this.b, instant.b);
        return compare != 0 ? compare : this.c - instant.c;
    }

    public long toEpochMilli() {
        long multiplyExact;
        int i;
        long j = this.b;
        if (j >= 0 || this.c <= 0) {
            multiplyExact = Math.multiplyExact(j, 1000);
            i = this.c / 1000000;
        } else {
            multiplyExact = Math.multiplyExact(j + 1, 1000);
            i = (this.c / 1000000) + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        }
        return Math.addExact(multiplyExact, (long) i);
    }

    public String toString() {
        return DateTimeFormatter.c.a(this);
    }
}
