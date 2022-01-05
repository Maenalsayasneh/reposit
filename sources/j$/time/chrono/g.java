package j$.time.chrono;

import j$.com.android.tools.r8.a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.b;
import j$.time.f;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.j;
import j$.time.temporal.p;
import j$.time.temporal.s;
import java.io.Serializable;
import java.util.Objects;

final class g<D extends b> implements f<D>, Serializable {
    private final transient e a;
    private final transient k b;
    private final transient ZoneId c;

    private g(e eVar, k kVar, ZoneId zoneId) {
        Objects.requireNonNull(eVar, "dateTime");
        this.a = eVar;
        this.b = kVar;
        this.c = zoneId;
    }

    static g o(h hVar, Temporal temporal) {
        g gVar = (g) temporal;
        if (hVar.equals(gVar.h())) {
            return gVar;
        }
        StringBuilder b2 = a.b("Chronology mismatch, required: ");
        b2.append(hVar.t());
        b2.append(", actual: ");
        b2.append(gVar.h().t());
        throw new ClassCastException(b2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r2.contains(r8) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static j$.time.chrono.f p(j$.time.chrono.e r6, j$.time.ZoneId r7, j$.time.k r8) {
        /*
            java.lang.String r0 = "zone"
            java.util.Objects.requireNonNull(r7, r0)
            boolean r0 = r7 instanceof j$.time.k
            if (r0 == 0) goto L_0x0012
            j$.time.chrono.g r8 = new j$.time.chrono.g
            r0 = r7
            j$.time.k r0 = (j$.time.k) r0
            r8.<init>(r6, r0, r7)
            return r8
        L_0x0012:
            j$.time.zone.c r0 = r7.p()
            j$.time.f r1 = j$.time.f.p(r6)
            java.util.List r2 = r0.g(r1)
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L_0x0027
            goto L_0x004b
        L_0x0027:
            int r3 = r2.size()
            if (r3 != 0) goto L_0x0042
            j$.time.zone.a r8 = r0.f(r1)
            j$.time.Duration r0 = r8.p()
            long r0 = r0.getSeconds()
            j$.time.chrono.e r6 = r6.P(r0)
            j$.time.k r8 = r8.q()
            goto L_0x0051
        L_0x0042:
            if (r8 == 0) goto L_0x004b
            boolean r0 = r2.contains(r8)
            if (r0 == 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            java.lang.Object r8 = r2.get(r5)
            j$.time.k r8 = (j$.time.k) r8
        L_0x0051:
            java.lang.String r0 = "offset"
            java.util.Objects.requireNonNull(r8, r0)
            j$.time.chrono.g r0 = new j$.time.chrono.g
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.g.p(j$.time.chrono.e, j$.time.ZoneId, j$.time.k):j$.time.chrono.f");
    }

    static g q(h hVar, Instant instant, ZoneId zoneId) {
        k d = zoneId.p().d(instant);
        Objects.requireNonNull(d, "offset");
        return new g((e) hVar.S(f.e0(instant.getEpochSecond(), instant.B(), d)), d, zoneId);
    }

    public k D() {
        return this.b;
    }

    public f G(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return q(h(), this.a.K(this.b), zoneId);
    }

    public ZoneId T() {
        return this.c;
    }

    public f a(long j, s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return o(h(), sVar.p(this, j));
        }
        return o(h(), this.a.a(j, sVar).e(this));
    }

    public f c(p pVar, long j) {
        if (!(pVar instanceof j)) {
            return o(h(), pVar.p(this, j));
        }
        j jVar = (j) pVar;
        int ordinal = jVar.ordinal();
        if (ordinal == 28) {
            return a(j - Q(), (s) ChronoUnit.SECONDS);
        }
        if (ordinal != 29) {
            return p(this.a.c(pVar, j), this.c, this.b);
        }
        return q(h(), this.a.K(k.a0(jVar.Y(j))), this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return compareTo((f) obj) == 0;
        }
        return false;
    }

    public boolean f(p pVar) {
        return (pVar instanceof j) || (pVar != null && pVar.V(this));
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public long l(Temporal temporal, s sVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        f w = h().w(temporal);
        if (sVar instanceof ChronoUnit) {
            return this.a.l(w.G(this.b).z(), sVar);
        }
        Objects.requireNonNull(sVar, "unit");
        return sVar.between(this, w);
    }

    public String toString() {
        String str = this.a.toString() + this.b.toString();
        if (this.b == this.c) {
            return str;
        }
        return str + '[' + this.c.toString() + ']';
    }

    public d z() {
        return this.a;
    }
}
