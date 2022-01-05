package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.b;
import j$.time.c;
import j$.time.e;
import j$.time.f;
import j$.time.format.k;
import j$.time.h;
import j$.time.temporal.l;
import java.io.Serializable;
import java.util.Map;

public final class j extends a implements Serializable {
    public static final j a = new j();

    private j() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r11 > 0) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.chrono.b B(java.util.Map r10, j$.time.format.k r11) {
        /*
            r9 = this;
            j$.time.temporal.j r0 = j$.time.temporal.j.YEAR_OF_ERA
            java.lang.Object r1 = r10.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x009a
            j$.time.format.k r2 = j$.time.format.k.LENIENT
            if (r11 == r2) goto L_0x0015
            long r2 = r1.longValue()
            r0.Z(r2)
        L_0x0015:
            j$.time.temporal.j r2 = j$.time.temporal.j.ERA
            java.lang.Object r2 = r10.remove(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L_0x005e
            j$.time.temporal.j r2 = j$.time.temporal.j.YEAR
            java.lang.Object r7 = r10.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            j$.time.format.k r8 = j$.time.format.k.STRICT
            if (r11 != r8) goto L_0x0042
            if (r7 == 0) goto L_0x003e
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            long r0 = r1.longValue()
            if (r11 <= 0) goto L_0x0051
            goto L_0x005a
        L_0x003e:
            r10.put(r0, r1)
            goto L_0x00af
        L_0x0042:
            if (r7 == 0) goto L_0x0056
            long r7 = r7.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            long r0 = r1.longValue()
        L_0x0051:
            long r0 = java.lang.Math.subtractExact(r5, r0)
            goto L_0x005a
        L_0x0056:
            long r0 = r1.longValue()
        L_0x005a:
            r9.k(r10, r2, r0)
            goto L_0x00af
        L_0x005e:
            long r7 = r2.longValue()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x006d
            j$.time.temporal.j r11 = j$.time.temporal.j.YEAR
            long r0 = r1.longValue()
            goto L_0x007f
        L_0x006d:
            long r7 = r2.longValue()
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 != 0) goto L_0x0083
            j$.time.temporal.j r11 = j$.time.temporal.j.YEAR
            long r0 = r1.longValue()
            long r0 = java.lang.Math.subtractExact(r5, r0)
        L_0x007f:
            r9.k(r10, r11, r0)
            goto L_0x00af
        L_0x0083:
            j$.time.c r10 = new j$.time.c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid value for era: "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x009a:
            j$.time.temporal.j r11 = j$.time.temporal.j.ERA
            boolean r0 = r10.containsKey(r11)
            if (r0 == 0) goto L_0x00af
            java.lang.Object r10 = r10.get(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            r11.Z(r0)
        L_0x00af:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.j.B(java.util.Map, j$.time.format.k):j$.time.chrono.b");
    }

    public boolean C(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public b F(int i, int i2, int i3) {
        return e.c0(i, i2, i3);
    }

    public i I(int i) {
        if (i == 0) {
            return k.BCE;
        }
        if (i == 1) {
            return k.CE;
        }
        throw new c("Invalid era: " + i);
    }

    public b M() {
        return e.q(e.b0(b.d()));
    }

    public int P(i iVar, int i) {
        if (iVar instanceof k) {
            return iVar == k.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public b R(Map map, k kVar) {
        return (e) super.R(map, kVar);
    }

    public d S(l lVar) {
        return f.p(lVar);
    }

    /* access modifiers changed from: package-private */
    public void p(Map map, k kVar) {
        j$.time.temporal.j jVar = j$.time.temporal.j.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(jVar);
        if (l != null) {
            if (kVar != k.LENIENT) {
                jVar.Z(l.longValue());
            }
            k(map, j$.time.temporal.j.MONTH_OF_YEAR, Math.floorMod(l.longValue(), 12) + 1);
            k(map, j$.time.temporal.j.YEAR, Math.floorDiv(l.longValue(), 12));
        }
    }

    /* access modifiers changed from: package-private */
    public b q(Map map, k kVar) {
        int i;
        j$.time.temporal.j jVar = j$.time.temporal.j.YEAR;
        int Y = jVar.Y(((Long) map.remove(jVar)).longValue());
        boolean z = true;
        if (kVar == k.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.j.MONTH_OF_YEAR)).longValue(), 1);
            return e.c0(Y, 1, 1).h0(subtractExact).g0(Math.subtractExact(((Long) map.remove(j$.time.temporal.j.DAY_OF_MONTH)).longValue(), 1));
        }
        j$.time.temporal.j jVar2 = j$.time.temporal.j.MONTH_OF_YEAR;
        int Y2 = jVar2.Y(((Long) map.remove(jVar2)).longValue());
        j$.time.temporal.j jVar3 = j$.time.temporal.j.DAY_OF_MONTH;
        int Y3 = jVar3.Y(((Long) map.remove(jVar3)).longValue());
        if (kVar == k.SMART) {
            if (Y2 == 4 || Y2 == 6 || Y2 == 9 || Y2 == 11) {
                i = 30;
            } else if (Y2 == 2) {
                h hVar = h.FEBRUARY;
                long j = (long) Y;
                int i2 = j$.time.j.a;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                i = hVar.p(z);
            }
            Y3 = Math.min(Y3, i);
        }
        return e.c0(Y, Y2, Y3);
    }

    public b s(b bVar) {
        return e.q(e.b0(bVar));
    }

    public String t() {
        return "ISO";
    }

    public b u(l lVar) {
        return e.q(lVar);
    }

    public f w(l lVar) {
        return ZonedDateTime.p(lVar);
    }

    public f x(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.q(instant, zoneId);
    }
}
