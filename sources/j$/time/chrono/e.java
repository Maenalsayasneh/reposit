package j$.time.chrono;

import androidx.core.app.NotificationCompat;
import j$.com.android.tools.r8.a;
import j$.time.ZoneId;
import j$.time.chrono.b;
import j$.time.g;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.j;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.s;
import j$.time.temporal.u;
import java.io.Serializable;
import java.util.Objects;

final class e<D extends b> implements d<D>, Temporal, m, Serializable {
    private final transient b a;
    private final transient g b;

    private e(b bVar, g gVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(gVar, NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP);
        this.a = bVar;
        this.b = gVar;
    }

    private e B(long j) {
        return Y(this.a.a(j, (s) ChronoUnit.DAYS), this.b);
    }

    private e I(long j) {
        return V(this.a, 0, 0, 0, j);
    }

    private e V(b bVar, long j, long j2, long j3, long j4) {
        g b0;
        b bVar2 = bVar;
        if ((j | j2 | j3 | j4) == 0) {
            b0 = this.b;
        } else {
            long j5 = j / 24;
            long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
            long g02 = this.b.g0();
            long j7 = j6 + g02;
            long floorDiv = Math.floorDiv(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
            long floorMod = Math.floorMod(j7, 86400000000000L);
            b0 = floorMod == g02 ? this.b : g.b0(floorMod);
            bVar2 = bVar2.a(floorDiv, (s) ChronoUnit.DAYS);
        }
        return Y(bVar2, b0);
    }

    private e Y(Temporal temporal, g gVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == gVar) ? this : new e(c.o(bVar.h(), temporal), gVar);
    }

    static e o(h hVar, Temporal temporal) {
        e eVar = (e) temporal;
        if (hVar.equals(eVar.h())) {
            return eVar;
        }
        StringBuilder b2 = a.b("Chronology mismatch, required: ");
        b2.append(hVar.t());
        b2.append(", actual: ");
        b2.append(eVar.h().t());
        throw new ClassCastException(b2.toString());
    }

    static e p(b bVar, g gVar) {
        return new e(bVar, gVar);
    }

    public f H(ZoneId zoneId) {
        return g.p(this, zoneId, (k) null);
    }

    /* access modifiers changed from: package-private */
    public e P(long j) {
        return V(this.a, 0, 0, j, 0);
    }

    /* renamed from: Z */
    public e b(m mVar) {
        return mVar instanceof b ? Y((b) mVar, this.b) : mVar instanceof g ? Y(this.a, (g) mVar) : mVar instanceof e ? o(this.a.h(), (e) mVar) : o(this.a.h(), (e) mVar.e(this));
    }

    /* renamed from: a0 */
    public e c(p pVar, long j) {
        return pVar instanceof j ? ((j) pVar).k() ? Y(this.a, this.b.c(pVar, j)) : Y(this.a.c(pVar, j), this.b) : o(this.a.h(), pVar.p(this, j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return compareTo((d) obj) == 0;
        }
        return false;
    }

    public boolean f(p pVar) {
        if (!(pVar instanceof j)) {
            return pVar != null && pVar.V(this);
        }
        j jVar = (j) pVar;
        return jVar.o() || jVar.k();
    }

    public long g(p pVar) {
        return pVar instanceof j ? ((j) pVar).k() ? this.b.g(pVar) : this.a.g(pVar) : pVar.q(this);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public u i(p pVar) {
        return pVar instanceof j ? ((j) pVar).k() ? this.b.i(pVar) : this.a.i(pVar) : pVar.I(this);
    }

    public int j(p pVar) {
        return pVar instanceof j ? ((j) pVar).k() ? this.b.j(pVar) : this.a.j(pVar) : i(pVar).a(g(pVar), pVar);
    }

    public long l(Temporal temporal, s sVar) {
        long j;
        Objects.requireNonNull(temporal, "endExclusive");
        d S = h().S(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            Objects.requireNonNull(sVar, "unit");
            return sVar.between(this, S);
        } else if (sVar.k()) {
            j jVar = j.EPOCH_DAY;
            long g = S.g(jVar) - this.a.g(jVar);
            switch (((ChronoUnit) sVar).ordinal()) {
                case 0:
                    j = 86400000000000L;
                    break;
                case 1:
                    j = 86400000000L;
                    break;
                case 2:
                    j = 86400000;
                    break;
                case 3:
                    j = 86400;
                    break;
                case 4:
                    j = 1440;
                    break;
                case 5:
                    j = 24;
                    break;
                case 6:
                    j = 2;
                    break;
                default:
                    return Math.addExact(g, this.b.l(S.m(), sVar));
            }
            g = Math.multiplyExact(g, j);
            return Math.addExact(g, this.b.l(S.m(), sVar));
        } else {
            b n = S.n();
            if (S.m().compareTo(this.b) < 0) {
                n = n.A(1, ChronoUnit.DAYS);
            }
            return this.a.l(n, sVar);
        }
    }

    public g m() {
        return this.b;
    }

    public b n() {
        return this.a;
    }

    /* renamed from: q */
    public e a(long j, s sVar) {
        long j2 = j;
        s sVar2 = sVar;
        if (!(sVar2 instanceof ChronoUnit)) {
            return o(this.a.h(), sVar2.p(this, j2));
        }
        switch (((ChronoUnit) sVar2).ordinal()) {
            case 0:
                return I(j);
            case 1:
                return B(j2 / 86400000000L).I((j2 % 86400000000L) * 1000);
            case 2:
                return B(j2 / 86400000).I((j2 % 86400000) * 1000000);
            case 3:
                return V(this.a, 0, 0, j, 0);
            case 4:
                return V(this.a, 0, j, 0, 0);
            case 5:
                return V(this.a, j, 0, 0, 0);
            case 6:
                e B = B(j2 / 256);
                return B.V(B.a, (j2 % 256) * 12, 0, 0, 0);
            default:
                return Y(this.a.a(j2, sVar2), this.b);
        }
    }

    public String toString() {
        return this.a.toString() + 'T' + this.b.toString();
    }
}
