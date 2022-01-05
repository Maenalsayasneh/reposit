package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.c;
import j$.time.temporal.d;
import j$.time.temporal.e;
import j$.time.temporal.f;
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

public final class g implements Temporal, m, Comparable<g>, Serializable {
    public static final g a;
    public static final g b = new g(23, 59, 59, 999999999);
    public static final g c;
    private static final g[] d = new g[24];
    private final byte e;
    private final byte f;
    private final byte g;
    private final int h;

    static {
        int i = 0;
        while (true) {
            g[] gVarArr = d;
            if (i < gVarArr.length) {
                gVarArr[i] = new g(i, 0, 0, 0);
                i++;
            } else {
                c = gVarArr[0];
                g gVar = gVarArr[12];
                a = gVarArr[0];
                return;
            }
        }
    }

    private g(int i, int i2, int i3, int i4) {
        this.e = (byte) i;
        this.f = (byte) i2;
        this.g = (byte) i3;
        this.h = i4;
    }

    private int B(p pVar) {
        switch (((j) pVar).ordinal()) {
            case 0:
                return this.h;
            case 1:
                throw new t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 2:
                return this.h / 1000;
            case 3:
                throw new t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 4:
                return this.h / 1000000;
            case 5:
                return (int) (g0() / 1000000);
            case 6:
                return this.g;
            case 7:
                return h0();
            case 8:
                return this.f;
            case 9:
                return (this.e * 60) + this.f;
            case 10:
                return this.e % 12;
            case 11:
                int i = this.e % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 12:
                return this.e;
            case 13:
                byte b2 = this.e;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 14:
                return this.e / 12;
            default:
                throw new t("Unsupported field: " + pVar);
        }
    }

    public static g Z(int i, int i2) {
        j.HOUR_OF_DAY.Z((long) i);
        if (i2 == 0) {
            return d[i];
        }
        j.MINUTE_OF_HOUR.Z((long) i2);
        return new g(i, i2, 0, 0);
    }

    public static g a0(int i, int i2, int i3, int i4) {
        j.HOUR_OF_DAY.Z((long) i);
        j.MINUTE_OF_HOUR.Z((long) i2);
        j.SECOND_OF_MINUTE.Z((long) i3);
        j.NANO_OF_SECOND.Z((long) i4);
        return p(i, i2, i3, i4);
    }

    public static g b0(long j) {
        j.NANO_OF_DAY.Z(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return p(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    private static g p(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? d[i] : new g(i, i2, i3, i4);
    }

    public static g q(l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        int i = q.a;
        g gVar = (g) lVar.d(h.a);
        if (gVar != null) {
            return gVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public int I() {
        return this.e;
    }

    public int P() {
        return this.f;
    }

    public int V() {
        return this.h;
    }

    public int Y() {
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r3 = r3 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return c0(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.temporal.Temporal a(long r3, j$.time.temporal.s r5) {
        /*
            r2 = this;
            boolean r0 = r5 instanceof j$.time.temporal.ChronoUnit
            if (r0 == 0) goto L_0x0050
            r0 = r5
            j$.time.temporal.ChronoUnit r0 = (j$.time.temporal.ChronoUnit) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0042;
                case 2: goto L_0x003a;
                case 3: goto L_0x0035;
                case 4: goto L_0x0030;
                case 5: goto L_0x002b;
                case 6: goto L_0x0025;
                default: goto L_0x000e;
            }
        L_0x000e:
            j$.time.temporal.t r3 = new j$.time.temporal.t
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unsupported unit: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0025:
            r0 = 2
            long r3 = r3 % r0
            r0 = 12
            long r3 = r3 * r0
        L_0x002b:
            j$.time.g r3 = r2.c0(r3)
            goto L_0x0056
        L_0x0030:
            j$.time.g r3 = r2.d0(r3)
            goto L_0x0056
        L_0x0035:
            j$.time.g r3 = r2.f0(r3)
            goto L_0x0056
        L_0x003a:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 % r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x004a
        L_0x0042:
            r0 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r3 = r3 % r0
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x004a:
            long r3 = r3 * r0
        L_0x004b:
            j$.time.g r3 = r2.e0(r3)
            goto L_0x0056
        L_0x0050:
            j$.time.temporal.Temporal r3 = r5.p(r2, r3)
            j$.time.g r3 = (j$.time.g) r3
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.g.a(long, j$.time.temporal.s):j$.time.temporal.Temporal");
    }

    public Temporal b(m mVar) {
        boolean z = mVar instanceof g;
        Object obj = mVar;
        if (!z) {
            obj = mVar.e(this);
        }
        return (g) obj;
    }

    public g c0(long j) {
        return j == 0 ? this : p(((((int) (j % 24)) + this.e) + 24) % 24, this.f, this.g, this.h);
    }

    public Object d(r rVar) {
        int i = q.a;
        if (rVar == d.a || rVar == f.a || rVar == i.a || rVar == e.a) {
            return null;
        }
        if (rVar == h.a) {
            return this;
        }
        if (rVar == c.a) {
            return null;
        }
        return rVar == j$.time.temporal.g.a ? ChronoUnit.NANOS : rVar.a(this);
    }

    public g d0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.e * 60) + this.f;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : p(i2 / 60, i2 % 60, this.g, this.h);
    }

    public Temporal e(Temporal temporal) {
        return temporal.c(j.NANO_OF_DAY, g0());
    }

    public g e0(long j) {
        if (j == 0) {
            return this;
        }
        long g02 = g0();
        long j2 = (((j % 86400000000000L) + g02) + 86400000000000L) % 86400000000000L;
        return g02 == j2 ? this : p((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.h == gVar.h;
    }

    public boolean f(p pVar) {
        return pVar instanceof j ? pVar.k() : pVar != null && pVar.V(this);
    }

    public g f0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f * 60) + (this.e * 3600) + this.g;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : p(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.h);
    }

    public long g(p pVar) {
        return pVar instanceof j ? pVar == j.NANO_OF_DAY ? g0() : pVar == j.MICRO_OF_DAY ? g0() / 1000 : (long) B(pVar) : pVar.q(this);
    }

    public long g0() {
        return (((long) this.g) * 1000000000) + (((long) this.f) * 60000000000L) + (((long) this.e) * 3600000000000L) + ((long) this.h);
    }

    public int h0() {
        return (this.f * 60) + (this.e * 3600) + this.g;
    }

    public int hashCode() {
        long g02 = g0();
        return (int) (g02 ^ (g02 >>> 32));
    }

    public u i(p pVar) {
        return super.i(pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r7 = r7 - ((long) (r5.e % 12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r7 = r7 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return j0((int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return c0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return l0(r6);
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.g c(j$.time.temporal.p r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j$.time.temporal.j
            if (r0 == 0) goto L_0x00a6
            r0 = r6
            j$.time.temporal.j r0 = (j$.time.temporal.j) r0
            r0.Z(r7)
            int r0 = r0.ordinal()
            r1 = 0
            r3 = 12
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x009b;
                case 2: goto L_0x0097;
                case 3: goto L_0x0093;
                case 4: goto L_0x008d;
                case 5: goto L_0x0089;
                case 6: goto L_0x0071;
                case 7: goto L_0x0066;
                case 8: goto L_0x0060;
                case 9: goto L_0x0052;
                case 10: goto L_0x0047;
                case 11: goto L_0x0042;
                case 12: goto L_0x003b;
                case 13: goto L_0x0034;
                case 14: goto L_0x002c;
                default: goto L_0x0015;
            }
        L_0x0015:
            j$.time.temporal.t r7 = new j$.time.temporal.t
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unsupported field: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L_0x002c:
            byte r6 = r5.e
            int r6 = r6 / 12
            long r0 = (long) r6
            long r7 = r7 - r0
            long r7 = r7 * r3
            goto L_0x004d
        L_0x0034:
            r3 = 24
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x003b
            r7 = r1
        L_0x003b:
            int r6 = (int) r7
            j$.time.g r6 = r5.j0(r6)
            goto L_0x00ac
        L_0x0042:
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r7 = r1
        L_0x0047:
            byte r6 = r5.e
            int r6 = r6 % 12
            long r0 = (long) r6
            long r7 = r7 - r0
        L_0x004d:
            j$.time.g r6 = r5.c0(r7)
            goto L_0x00ac
        L_0x0052:
            byte r6 = r5.e
            int r6 = r6 * 60
            byte r0 = r5.f
            int r6 = r6 + r0
            long r0 = (long) r6
            long r7 = r7 - r0
            j$.time.g r6 = r5.d0(r7)
            goto L_0x00ac
        L_0x0060:
            int r6 = (int) r7
            j$.time.g r6 = r5.k0(r6)
            goto L_0x00ac
        L_0x0066:
            int r6 = r5.h0()
            long r0 = (long) r6
            long r7 = r7 - r0
            j$.time.g r6 = r5.f0(r7)
            goto L_0x00ac
        L_0x0071:
            int r6 = (int) r7
            byte r7 = r5.g
            if (r7 != r6) goto L_0x0078
            r6 = r5
            goto L_0x00ac
        L_0x0078:
            j$.time.temporal.j r7 = j$.time.temporal.j.SECOND_OF_MINUTE
            long r0 = (long) r6
            r7.Z(r0)
            byte r7 = r5.e
            byte r8 = r5.f
            int r0 = r5.h
            j$.time.g r6 = p(r7, r8, r6, r0)
            goto L_0x00ac
        L_0x0089:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x0095
        L_0x008d:
            int r6 = (int) r7
            r7 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = r6 * r7
            goto L_0x00a1
        L_0x0093:
            r0 = 1000(0x3e8, double:4.94E-321)
        L_0x0095:
            long r7 = r7 * r0
            goto L_0x009b
        L_0x0097:
            int r6 = (int) r7
            int r6 = r6 * 1000
            goto L_0x00a1
        L_0x009b:
            j$.time.g r6 = b0(r7)
            goto L_0x00ac
        L_0x00a0:
            int r6 = (int) r7
        L_0x00a1:
            j$.time.g r6 = r5.l0(r6)
            goto L_0x00ac
        L_0x00a6:
            j$.time.temporal.Temporal r6 = r6.p(r5, r7)
            j$.time.g r6 = (j$.time.g) r6
        L_0x00ac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.g.c(j$.time.temporal.p, long):j$.time.g");
    }

    public int j(p pVar) {
        return pVar instanceof j ? B(pVar) : super.j(pVar);
    }

    public g j0(int i) {
        if (this.e == i) {
            return this;
        }
        j.HOUR_OF_DAY.Z((long) i);
        return p(i, this.f, this.g, this.h);
    }

    public g k0(int i) {
        if (this.f == i) {
            return this;
        }
        j.MINUTE_OF_HOUR.Z((long) i);
        return p(this.e, i, this.g, this.h);
    }

    public long l(Temporal temporal, s sVar) {
        long j;
        g q = q(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, q);
        }
        long g02 = q.g0() - g0();
        switch (((ChronoUnit) sVar).ordinal()) {
            case 0:
                return g02;
            case 1:
                j = 1000;
                break;
            case 2:
                j = 1000000;
                break;
            case 3:
                j = 1000000000;
                break;
            case 4:
                j = 60000000000L;
                break;
            case 5:
                j = 3600000000000L;
                break;
            case 6:
                j = 43200000000000L;
                break;
            default:
                throw new t("Unsupported unit: " + sVar);
        }
        return g02 / j;
    }

    public g l0(int i) {
        if (this.h == i) {
            return this;
        }
        j.NANO_OF_SECOND.Z((long) i);
        return p(this.e, this.f, this.g, i);
    }

    /* renamed from: o */
    public int compareTo(g gVar) {
        int compare = Integer.compare(this.e, gVar.e);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f, gVar.f);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.g, gVar.g);
        return compare3 == 0 ? Integer.compare(this.h, gVar.h) : compare3;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.e;
        byte b3 = this.f;
        byte b4 = this.g;
        int i2 = this.h;
        sb.append(b2 < 10 ? "0" : "");
        sb.append(b2);
        String str = ":0";
        sb.append(b3 < 10 ? str : ":");
        sb.append(b3);
        if (b4 > 0 || i2 > 0) {
            if (b4 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b4);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }
}
