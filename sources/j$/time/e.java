package j$.time;

import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import j$.com.android.tools.r8.a;
import j$.time.chrono.b;
import j$.time.chrono.d;
import j$.time.chrono.h;
import j$.time.chrono.i;
import j$.time.chrono.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.c;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import j$.time.temporal.t;
import j$.time.temporal.u;
import java.io.Serializable;
import java.util.Objects;

public final class e implements Temporal, m, b, Serializable {
    public static final e a = c0(-999999999, 1, 1);
    public static final e b = c0(999999999, 12, 31);
    private final int c;
    private final short d;
    private final short e;

    private e(int i, int i2, int i3) {
        this.c = i;
        this.d = (short) i2;
        this.e = (short) i3;
    }

    private int B(p pVar) {
        switch (((j) pVar).ordinal()) {
            case 15:
                return I().k();
            case 16:
                return ((this.e - 1) % 7) + 1;
            case 17:
                return ((P() - 1) % 7) + 1;
            case 18:
                return this.e;
            case 19:
                return P();
            case 20:
                throw new t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 21:
                return ((this.e - 1) / 7) + 1;
            case 22:
                return ((P() - 1) / 7) + 1;
            case 23:
                return this.d;
            case 24:
                throw new t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 25:
                int i = this.c;
                return i >= 1 ? i : 1 - i;
            case 26:
                return this.c;
            case 27:
                return this.c >= 1 ? 1 : 0;
            default:
                throw new t("Unsupported field: " + pVar);
        }
    }

    private long Y() {
        return ((((long) this.c) * 12) + ((long) this.d)) - 1;
    }

    private long a0(e eVar) {
        return (((eVar.Y() * 32) + ((long) eVar.e)) - ((Y() * 32) + ((long) this.e))) / 32;
    }

    public static e b0(b bVar) {
        Instant b2 = bVar.b();
        return d0(Math.floorDiv(b2.getEpochSecond() + ((long) bVar.a().p().d(b2).V()), 86400));
    }

    public static e c0(int i, int i2, int i3) {
        long j = (long) i;
        j.YEAR.Z(j);
        j.MONTH_OF_YEAR.Z((long) i2);
        j.DAY_OF_MONTH.Z((long) i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.j.a.C(j)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                StringBuilder b2 = a.b("Invalid date '");
                b2.append(h.q(i2).name());
                b2.append(" ");
                b2.append(i3);
                b2.append("'");
                throw new c(b2.toString());
            }
        }
        return new e(i, i2, i3);
    }

    public static e d0(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new e(j.YEAR.Y(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static e e0(int i, int i2) {
        long j = (long) i;
        j.YEAR.Z(j);
        j.DAY_OF_YEAR.Z((long) i2);
        boolean C = j$.time.chrono.j.a.C(j);
        if (i2 != 366 || C) {
            h q = h.q(((i2 - 1) / 31) + 1);
            if (i2 > (q.p(C) + q.o(C)) - 1) {
                q = q.B(1);
            }
            return new e(i, q.k(), (i2 - q.o(C)) + 1);
        }
        throw new c("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    private static e k0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new e(i, i2, i3);
        }
        i4 = j$.time.chrono.j.a.C((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new e(i, i2, i3);
    }

    public static e q(l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        int i = q.a;
        e eVar = (e) lVar.d(c.a);
        if (eVar != null) {
            return eVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public b A(long j, s sVar) {
        return j == Long.MIN_VALUE ? a(RecyclerView.FOREVER_NS, sVar).a(1, sVar) : a(-j, sVar);
    }

    public d I() {
        return d.o(((int) Math.floorMod(v() + 3, 7)) + 1);
    }

    public int J() {
        return O() ? 366 : 365;
    }

    public d L(g gVar) {
        return f.d0(this, gVar);
    }

    public b N(o oVar) {
        if (oVar instanceof i) {
            i iVar = (i) oVar;
            return h0(iVar.e()).g0((long) iVar.b());
        }
        Objects.requireNonNull(oVar, "amountToAdd");
        return (e) ((i) oVar).a(this);
    }

    public boolean O() {
        return j$.time.chrono.j.a.C((long) this.c);
    }

    public int P() {
        return (h.q(this.d).o(O()) + this.e) - 1;
    }

    public int U(b bVar) {
        return bVar instanceof e ? o((e) bVar) : super.U(bVar);
    }

    public i V() {
        return this.c >= 1 ? k.CE : k.BCE;
    }

    public int Z() {
        return this.c;
    }

    public b b(m mVar) {
        boolean z = mVar instanceof e;
        Object obj = mVar;
        if (!z) {
            obj = mVar.e(this);
        }
        return (e) obj;
    }

    public int compareTo(Object obj) {
        b bVar = (b) obj;
        return bVar instanceof e ? o((e) bVar) : super.U(bVar);
    }

    public Object d(r rVar) {
        int i = q.a;
        return rVar == c.a ? this : super.d(rVar);
    }

    public Temporal e(Temporal temporal) {
        return super.e(temporal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return o((e) obj) == 0;
        }
        return false;
    }

    public boolean f(p pVar) {
        return super.f(pVar);
    }

    /* renamed from: f0 */
    public e a(long j, s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return (e) sVar.p(this, j);
        }
        switch (((ChronoUnit) sVar).ordinal()) {
            case 7:
                return g0(j);
            case 8:
                return i0(j);
            case 9:
                return h0(j);
            case 10:
                return j0(j);
            case 11:
                return j0(Math.multiplyExact(j, 10));
            case 12:
                return j0(Math.multiplyExact(j, 100));
            case 13:
                return j0(Math.multiplyExact(j, 1000));
            case 14:
                j jVar = j.ERA;
                return c(jVar, Math.addExact(g(jVar), j));
            default:
                throw new t("Unsupported unit: " + sVar);
        }
    }

    public long g(p pVar) {
        return pVar instanceof j ? pVar == j.EPOCH_DAY ? v() : pVar == j.PROLEPTIC_MONTH ? Y() : (long) B(pVar) : pVar.q(this);
    }

    public e g0(long j) {
        return j == 0 ? this : d0(Math.addExact(v(), j));
    }

    public h h() {
        return j$.time.chrono.j.a;
    }

    public e h0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.c) * 12) + ((long) (this.d - 1)) + j;
        return k0(j.YEAR.Y(Math.floorDiv(j2, 12)), ((int) Math.floorMod(j2, 12)) + 1, this.e);
    }

    public int hashCode() {
        int i = this.c;
        return (((i << 11) + (this.d << 6)) + this.e) ^ (i & -2048);
    }

    public u i(p pVar) {
        int i;
        if (!(pVar instanceof j)) {
            return pVar.I(this);
        }
        j jVar = (j) pVar;
        if (jVar.o()) {
            int ordinal = jVar.ordinal();
            if (ordinal == 18) {
                short s = this.d;
                i = s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : O() ? 29 : 28;
            } else if (ordinal == 19) {
                i = O() ? 366 : 365;
            } else if (ordinal == 21) {
                return u.i(1, (h.q(this.d) != h.FEBRUARY || O()) ? 5 : 4);
            } else if (ordinal != 25) {
                return pVar.B();
            } else {
                return u.i(1, this.c <= 0 ? 1000000000 : 999999999);
            }
            return u.i(1, (long) i);
        }
        throw new t("Unsupported field: " + pVar);
    }

    public e i0(long j) {
        return g0(Math.multiplyExact(j, 7));
    }

    public int j(p pVar) {
        return pVar instanceof j ? B(pVar) : super.j(pVar);
    }

    public e j0(long j) {
        return j == 0 ? this : k0(j.YEAR.Y(((long) this.c) + j), this.d, this.e);
    }

    public long l(Temporal temporal, s sVar) {
        long p;
        long j;
        e q = q(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, q);
        }
        switch (((ChronoUnit) sVar).ordinal()) {
            case 7:
                return p(q);
            case 8:
                p = p(q);
                j = 7;
                break;
            case 9:
                return a0(q);
            case 10:
                p = a0(q);
                j = 12;
                break;
            case 11:
                p = a0(q);
                j = 120;
                break;
            case 12:
                p = a0(q);
                j = 1200;
                break;
            case 13:
                p = a0(q);
                j = 12000;
                break;
            case 14:
                j jVar = j.ERA;
                return q.g(jVar) - g(jVar);
            default:
                throw new t("Unsupported unit: " + sVar);
        }
        return p / j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r0 = g(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return p0((int) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return g0(r6 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return i0(r6 - g(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return r4;
     */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.e c(j$.time.temporal.p r5, long r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof j$.time.temporal.j
            if (r0 == 0) goto L_0x00ab
            r0 = r5
            j$.time.temporal.j r0 = (j$.time.temporal.j) r0
            r0.Z(r6)
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 15: goto L_0x0067;
                case 16: goto L_0x0060;
                case 17: goto L_0x005d;
                case 18: goto L_0x009c;
                case 19: goto L_0x008c;
                case 20: goto L_0x0058;
                case 21: goto L_0x0080;
                case 22: goto L_0x0055;
                case 23: goto L_0x004f;
                case 24: goto L_0x0044;
                case 25: goto L_0x0076;
                case 26: goto L_0x003d;
                case 27: goto L_0x0029;
                default: goto L_0x0012;
            }
        L_0x0012:
            j$.time.temporal.t r6 = new j$.time.temporal.t
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unsupported field: "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x0029:
            j$.time.temporal.j r5 = j$.time.temporal.j.ERA
            long r2 = r4.g(r5)
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            r5 = r4
            goto L_0x003c
        L_0x0035:
            int r5 = r4.c
            int r1 = r1 - r5
            j$.time.e r5 = r4.p0(r1)
        L_0x003c:
            return r5
        L_0x003d:
            int r5 = (int) r6
            j$.time.e r5 = r4.p0(r5)
            goto L_0x00b1
        L_0x0044:
            long r0 = r4.Y()
            long r6 = r6 - r0
            j$.time.e r5 = r4.h0(r6)
            goto L_0x00b1
        L_0x004f:
            int r5 = (int) r6
            j$.time.e r5 = r4.o0(r5)
            goto L_0x00b1
        L_0x0055:
            j$.time.temporal.j r5 = j$.time.temporal.j.ALIGNED_WEEK_OF_YEAR
            goto L_0x0082
        L_0x0058:
            j$.time.e r5 = d0(r6)
            goto L_0x00b1
        L_0x005d:
            j$.time.temporal.j r5 = j$.time.temporal.j.ALIGNED_DAY_OF_WEEK_IN_YEAR
            goto L_0x0062
        L_0x0060:
            j$.time.temporal.j r5 = j$.time.temporal.j.ALIGNED_DAY_OF_WEEK_IN_MONTH
        L_0x0062:
            long r0 = r4.g(r5)
            goto L_0x0070
        L_0x0067:
            j$.time.d r5 = r4.I()
            int r5 = r5.k()
            long r0 = (long) r5
        L_0x0070:
            long r6 = r6 - r0
            j$.time.e r5 = r4.g0(r6)
            goto L_0x00b1
        L_0x0076:
            int r5 = r4.c
            if (r5 < r1) goto L_0x007b
            goto L_0x003d
        L_0x007b:
            r0 = 1
            long r6 = r0 - r6
            goto L_0x003d
        L_0x0080:
            j$.time.temporal.j r5 = j$.time.temporal.j.ALIGNED_WEEK_OF_MONTH
        L_0x0082:
            long r0 = r4.g(r5)
            long r6 = r6 - r0
            j$.time.e r5 = r4.i0(r6)
            goto L_0x00b1
        L_0x008c:
            int r5 = (int) r6
            int r6 = r4.P()
            if (r6 != r5) goto L_0x0095
        L_0x0093:
            r5 = r4
            goto L_0x00b1
        L_0x0095:
            int r6 = r4.c
            j$.time.e r5 = e0(r6, r5)
            goto L_0x00b1
        L_0x009c:
            int r5 = (int) r6
            short r6 = r4.e
            if (r6 != r5) goto L_0x00a2
            goto L_0x0093
        L_0x00a2:
            int r6 = r4.c
            short r7 = r4.d
            j$.time.e r5 = c0(r6, r7, r5)
            goto L_0x00b1
        L_0x00ab:
            j$.time.temporal.Temporal r5 = r5.p(r4, r6)
            j$.time.e r5 = (j$.time.e) r5
        L_0x00b1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.e.c(j$.time.temporal.p, long):j$.time.e");
    }

    public e m0(int i) {
        return this.e == i ? this : c0(this.c, this.d, i);
    }

    public e n0(int i) {
        return P() == i ? this : e0(this.c, i);
    }

    /* access modifiers changed from: package-private */
    public int o(e eVar) {
        int i = this.c - eVar.c;
        if (i != 0) {
            return i;
        }
        int i2 = this.d - eVar.d;
        return i2 == 0 ? this.e - eVar.e : i2;
    }

    public e o0(int i) {
        if (this.d == i) {
            return this;
        }
        j.MONTH_OF_YEAR.Z((long) i);
        return k0(this.c, i, this.e);
    }

    /* access modifiers changed from: package-private */
    public long p(e eVar) {
        return eVar.v() - v();
    }

    public e p0(int i) {
        if (this.c == i) {
            return this;
        }
        j.YEAR.Z((long) i);
        return k0(i, this.d, this.e);
    }

    public String toString() {
        int i;
        int i2 = this.c;
        short s = this.d;
        short s2 = this.e;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    public long v() {
        long j;
        long j2 = (long) this.c;
        long j3 = (long) this.d;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.e - 1));
        if (j3 > 2) {
            j5--;
            if (!O()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: b  reason: collision with other method in class */
    public Temporal m61b(m mVar) {
        boolean z = mVar instanceof e;
        Object obj = mVar;
        if (!z) {
            obj = mVar.e(this);
        }
        return (e) obj;
    }
}
