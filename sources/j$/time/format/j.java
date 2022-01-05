package j$.time.format;

import j$.com.android.tools.r8.a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.c;
import j$.time.chrono.b;
import j$.time.chrono.f;
import j$.time.chrono.h;
import j$.time.e;
import j$.time.g;
import j$.time.i;
import j$.time.k;
import j$.time.temporal.d;
import j$.time.temporal.l;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

final class j implements l {
    final Map a = new HashMap();
    ZoneId b;
    h c;
    boolean d;
    private k e;
    private b f;
    private g g;
    i h = i.a;

    j() {
    }

    private void o(l lVar) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            p pVar = (p) entry.getKey();
            if (lVar.f(pVar)) {
                try {
                    long g2 = lVar.g(pVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (g2 == longValue) {
                        it.remove();
                    } else {
                        throw new c("Conflict found: Field " + pVar + " " + g2 + " differs from " + pVar + " " + longValue + " derived from " + lVar);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void q() {
        if (this.a.containsKey(j$.time.temporal.j.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId == null) {
                Long l = (Long) this.a.get(j$.time.temporal.j.OFFSET_SECONDS);
                if (l != null) {
                    zoneId = k.a0(l.intValue());
                } else {
                    return;
                }
            }
            r(zoneId);
        }
    }

    private void r(ZoneId zoneId) {
        Map map = this.a;
        j$.time.temporal.j jVar = j$.time.temporal.j.INSTANT_SECONDS;
        f x = this.c.x(Instant.V(((Long) map.remove(jVar)).longValue()), zoneId);
        w(x.n());
        x(jVar, j$.time.temporal.j.SECOND_OF_DAY, Long.valueOf((long) x.m().h0()));
    }

    private void s(long j, long j2, long j3, long j4) {
        g a0;
        i iVar;
        if (this.e == k.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000)), j4);
            a0 = g.b0(Math.floorMod(addExact, 86400000000000L));
            iVar = i.d((int) Math.floorDiv(addExact, 86400000000000L));
        } else {
            int Y = j$.time.temporal.j.MINUTE_OF_HOUR.Y(j2);
            int Y2 = j$.time.temporal.j.NANO_OF_SECOND.Y(j4);
            if (this.e == k.SMART && j == 24 && Y == 0 && j3 == 0 && Y2 == 0) {
                a0 = g.c;
                iVar = i.d(1);
            } else {
                a0 = g.a0(j$.time.temporal.j.HOUR_OF_DAY.Y(j), Y, j$.time.temporal.j.SECOND_OF_MINUTE.Y(j3), Y2);
                iVar = i.a;
            }
        }
        u(a0, iVar);
    }

    private void t() {
        Long l;
        j$.time.temporal.j jVar;
        Map map = this.a;
        j$.time.temporal.j jVar2 = j$.time.temporal.j.CLOCK_HOUR_OF_DAY;
        long j = 0;
        if (map.containsKey(jVar2)) {
            long longValue = ((Long) this.a.remove(jVar2)).longValue();
            k kVar = this.e;
            if (kVar == k.STRICT || (kVar == k.SMART && longValue != 0)) {
                jVar2.Z(longValue);
            }
            j$.time.temporal.j jVar3 = j$.time.temporal.j.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            x(jVar2, jVar3, Long.valueOf(longValue));
        }
        Map map2 = this.a;
        j$.time.temporal.j jVar4 = j$.time.temporal.j.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(jVar4)) {
            long longValue2 = ((Long) this.a.remove(jVar4)).longValue();
            k kVar2 = this.e;
            if (kVar2 == k.STRICT || (kVar2 == k.SMART && longValue2 != 0)) {
                jVar4.Z(longValue2);
            }
            j$.time.temporal.j jVar5 = j$.time.temporal.j.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j = longValue2;
            }
            x(jVar4, jVar5, Long.valueOf(j));
        }
        Map map3 = this.a;
        j$.time.temporal.j jVar6 = j$.time.temporal.j.AMPM_OF_DAY;
        if (map3.containsKey(jVar6)) {
            Map map4 = this.a;
            j$.time.temporal.j jVar7 = j$.time.temporal.j.HOUR_OF_AMPM;
            if (map4.containsKey(jVar7)) {
                long longValue3 = ((Long) this.a.remove(jVar6)).longValue();
                long longValue4 = ((Long) this.a.remove(jVar7)).longValue();
                if (this.e == k.LENIENT) {
                    jVar = j$.time.temporal.j.HOUR_OF_DAY;
                    l = Long.valueOf(Math.addExact(Math.multiplyExact(longValue3, 12), longValue4));
                } else {
                    jVar6.Z(longValue3);
                    jVar7.Z(longValue3);
                    jVar = j$.time.temporal.j.HOUR_OF_DAY;
                    l = Long.valueOf((longValue3 * 12) + longValue4);
                }
                x(jVar6, jVar, l);
            }
        }
        Map map5 = this.a;
        j$.time.temporal.j jVar8 = j$.time.temporal.j.NANO_OF_DAY;
        if (map5.containsKey(jVar8)) {
            long longValue5 = ((Long) this.a.remove(jVar8)).longValue();
            if (this.e != k.LENIENT) {
                jVar8.Z(longValue5);
            }
            x(jVar8, j$.time.temporal.j.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            x(jVar8, j$.time.temporal.j.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            x(jVar8, j$.time.temporal.j.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            x(jVar8, j$.time.temporal.j.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.a;
        j$.time.temporal.j jVar9 = j$.time.temporal.j.MICRO_OF_DAY;
        if (map6.containsKey(jVar9)) {
            long longValue6 = ((Long) this.a.remove(jVar9)).longValue();
            if (this.e != k.LENIENT) {
                jVar9.Z(longValue6);
            }
            x(jVar9, j$.time.temporal.j.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            x(jVar9, j$.time.temporal.j.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.a;
        j$.time.temporal.j jVar10 = j$.time.temporal.j.MILLI_OF_DAY;
        if (map7.containsKey(jVar10)) {
            long longValue7 = ((Long) this.a.remove(jVar10)).longValue();
            if (this.e != k.LENIENT) {
                jVar10.Z(longValue7);
            }
            x(jVar10, j$.time.temporal.j.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            x(jVar10, j$.time.temporal.j.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.a;
        j$.time.temporal.j jVar11 = j$.time.temporal.j.SECOND_OF_DAY;
        if (map8.containsKey(jVar11)) {
            long longValue8 = ((Long) this.a.remove(jVar11)).longValue();
            if (this.e != k.LENIENT) {
                jVar11.Z(longValue8);
            }
            x(jVar11, j$.time.temporal.j.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            x(jVar11, j$.time.temporal.j.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            x(jVar11, j$.time.temporal.j.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.a;
        j$.time.temporal.j jVar12 = j$.time.temporal.j.MINUTE_OF_DAY;
        if (map9.containsKey(jVar12)) {
            long longValue9 = ((Long) this.a.remove(jVar12)).longValue();
            if (this.e != k.LENIENT) {
                jVar12.Z(longValue9);
            }
            x(jVar12, j$.time.temporal.j.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            x(jVar12, j$.time.temporal.j.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.a;
        j$.time.temporal.j jVar13 = j$.time.temporal.j.NANO_OF_SECOND;
        if (map10.containsKey(jVar13)) {
            long longValue10 = ((Long) this.a.get(jVar13)).longValue();
            k kVar3 = this.e;
            k kVar4 = k.LENIENT;
            if (kVar3 != kVar4) {
                jVar13.Z(longValue10);
            }
            Map map11 = this.a;
            j$.time.temporal.j jVar14 = j$.time.temporal.j.MICRO_OF_SECOND;
            if (map11.containsKey(jVar14)) {
                long longValue11 = ((Long) this.a.remove(jVar14)).longValue();
                if (this.e != kVar4) {
                    jVar14.Z(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                x(jVar14, jVar13, Long.valueOf(longValue10));
            }
            Map map12 = this.a;
            j$.time.temporal.j jVar15 = j$.time.temporal.j.MILLI_OF_SECOND;
            if (map12.containsKey(jVar15)) {
                long longValue12 = ((Long) this.a.remove(jVar15)).longValue();
                if (this.e != kVar4) {
                    jVar15.Z(longValue12);
                }
                x(jVar15, jVar13, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        j$.time.temporal.j jVar16 = j$.time.temporal.j.HOUR_OF_DAY;
        if (map13.containsKey(jVar16)) {
            Map map14 = this.a;
            j$.time.temporal.j jVar17 = j$.time.temporal.j.MINUTE_OF_HOUR;
            if (map14.containsKey(jVar17)) {
                Map map15 = this.a;
                j$.time.temporal.j jVar18 = j$.time.temporal.j.SECOND_OF_MINUTE;
                if (map15.containsKey(jVar18) && this.a.containsKey(jVar13)) {
                    s(((Long) this.a.remove(jVar16)).longValue(), ((Long) this.a.remove(jVar17)).longValue(), ((Long) this.a.remove(jVar18)).longValue(), ((Long) this.a.remove(jVar13)).longValue());
                }
            }
        }
    }

    private void u(g gVar, i iVar) {
        g gVar2 = this.g;
        if (gVar2 == null) {
            this.g = gVar;
        } else if (!gVar2.equals(gVar)) {
            StringBuilder b2 = a.b("Conflict found: Fields resolved to different times: ");
            b2.append(this.g);
            b2.append(" ");
            b2.append(gVar);
            throw new c(b2.toString());
        } else if (!this.h.c() && !iVar.c() && !this.h.equals(iVar)) {
            StringBuilder b3 = a.b("Conflict found: Fields resolved to different excess periods: ");
            b3.append(this.h);
            b3.append(" ");
            b3.append(iVar);
            throw new c(b3.toString());
        }
        this.h = iVar;
    }

    private void w(b bVar) {
        b bVar2 = this.f;
        if (bVar2 != null) {
            if (bVar != null && !bVar2.equals(bVar)) {
                StringBuilder b2 = a.b("Conflict found: Fields resolved to two different dates: ");
                b2.append(this.f);
                b2.append(" ");
                b2.append(bVar);
                throw new c(b2.toString());
            }
        } else if (bVar == null) {
        } else {
            if (this.c.equals(bVar.h())) {
                this.f = bVar;
                return;
            }
            StringBuilder b3 = a.b("ChronoLocalDate must use the effective parsed chronology: ");
            b3.append(this.c);
            throw new c(b3.toString());
        }
    }

    private void x(p pVar, p pVar2, Long l) {
        Long l2 = (Long) this.a.put(pVar2, l);
        if (l2 != null && l2.longValue() != l.longValue()) {
            throw new c("Conflict found: " + pVar2 + " " + l2 + " differs from " + pVar2 + " " + l + " while resolving  " + pVar);
        }
    }

    public Object d(r rVar) {
        int i = q.a;
        if (rVar == j$.time.temporal.f.a) {
            return this.b;
        }
        if (rVar == d.a) {
            return this.c;
        }
        if (rVar == j$.time.temporal.c.a) {
            b bVar = this.f;
            if (bVar != null) {
                return e.q(bVar);
            }
            return null;
        } else if (rVar == j$.time.temporal.h.a) {
            return this.g;
        } else {
            if (rVar == j$.time.temporal.i.a || rVar == j$.time.temporal.e.a) {
                return rVar.a(this);
            }
            if (rVar == j$.time.temporal.g.a) {
                return null;
            }
            return rVar.a(this);
        }
    }

    public boolean f(p pVar) {
        if (this.a.containsKey(pVar)) {
            return true;
        }
        b bVar = this.f;
        if (bVar != null && bVar.f(pVar)) {
            return true;
        }
        g gVar = this.g;
        if (gVar == null || !gVar.f(pVar)) {
            return pVar != null && !(pVar instanceof j$.time.temporal.j) && pVar.V(this);
        }
        return true;
    }

    public long g(p pVar) {
        Objects.requireNonNull(pVar, "field");
        Long l = (Long) this.a.get(pVar);
        if (l != null) {
            return l.longValue();
        }
        b bVar = this.f;
        if (bVar != null && bVar.f(pVar)) {
            return this.f.g(pVar);
        }
        g gVar = this.g;
        if (gVar != null && gVar.f(pVar)) {
            return this.g.g(pVar);
        }
        if (!(pVar instanceof j$.time.temporal.j)) {
            return pVar.q(this);
        }
        throw new t("Unsupported field: " + pVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.temporal.l p(j$.time.format.k r19, java.util.Set r20) {
        /*
            r18 = this;
            r9 = r18
            r0 = r20
            if (r0 == 0) goto L_0x000f
            java.util.Map r1 = r9.a
            java.util.Set r1 = r1.keySet()
            r1.retainAll(r0)
        L_0x000f:
            r0 = r19
            r9.e = r0
            r18.q()
            j$.time.chrono.h r0 = r9.c
            java.util.Map r1 = r9.a
            j$.time.format.k r2 = r9.e
            j$.time.chrono.b r0 = r0.R(r1, r2)
            r9.w(r0)
            r18.t()
            java.util.Map r0 = r9.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00ef
            r0 = 0
        L_0x002f:
            r1 = 50
            if (r0 >= r1) goto L_0x00cf
            java.util.Map r2 = r9.a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00cf
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            j$.time.temporal.p r3 = (j$.time.temporal.p) r3
            java.util.Map r4 = r9.a
            j$.time.format.k r5 = r9.e
            j$.time.temporal.l r4 = r3.P(r4, r9, r5)
            if (r4 == 0) goto L_0x00c3
            boolean r1 = r4 instanceof j$.time.chrono.f
            if (r1 == 0) goto L_0x008e
            j$.time.chrono.f r4 = (j$.time.chrono.f) r4
            j$.time.ZoneId r1 = r9.b
            if (r1 != 0) goto L_0x006a
            j$.time.ZoneId r1 = r4.T()
            r9.b = r1
            goto L_0x0074
        L_0x006a:
            j$.time.ZoneId r2 = r4.T()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0079
        L_0x0074:
            j$.time.chrono.d r4 = r4.z()
            goto L_0x008e
        L_0x0079:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "ChronoZonedDateTime must use the effective parsed zone: "
            java.lang.StringBuilder r1 = j$.com.android.tools.r8.a.b(r1)
            j$.time.ZoneId r2 = r9.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            boolean r1 = r4 instanceof j$.time.chrono.d
            if (r1 == 0) goto L_0x00a5
            j$.time.chrono.d r4 = (j$.time.chrono.d) r4
            j$.time.g r1 = r4.m()
            j$.time.i r2 = j$.time.i.a
            r9.u(r1, r2)
            j$.time.chrono.b r1 = r4.n()
            r9.w(r1)
            goto L_0x00cb
        L_0x00a5:
            boolean r1 = r4 instanceof j$.time.chrono.b
            if (r1 == 0) goto L_0x00af
            j$.time.chrono.b r4 = (j$.time.chrono.b) r4
            r9.w(r4)
            goto L_0x00cb
        L_0x00af:
            boolean r1 = r4 instanceof j$.time.g
            if (r1 == 0) goto L_0x00bb
            j$.time.g r4 = (j$.time.g) r4
            j$.time.i r1 = j$.time.i.a
            r9.u(r4, r1)
            goto L_0x00cb
        L_0x00bb:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime"
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            java.util.Map r4 = r9.a
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L_0x003d
        L_0x00cb:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x00cf:
            if (r0 == r1) goto L_0x00e7
            if (r0 <= 0) goto L_0x00ef
            r18.q()
            j$.time.chrono.h r0 = r9.c
            java.util.Map r1 = r9.a
            j$.time.format.k r2 = r9.e
            j$.time.chrono.b r0 = r0.R(r1, r2)
            r9.w(r0)
            r18.t()
            goto L_0x00ef
        L_0x00e7:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "One of the parsed fields has an incorrectly implemented resolve method"
            r0.<init>(r1)
            throw r0
        L_0x00ef:
            j$.time.g r0 = r9.g
            r1 = 1000000(0xf4240, double:4.940656E-318)
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x01d9
            java.util.Map r0 = r9.a
            j$.time.temporal.j r3 = j$.time.temporal.j.MILLI_OF_SECOND
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0140
            java.util.Map r0 = r9.a
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            java.util.Map r0 = r9.a
            j$.time.temporal.j r6 = j$.time.temporal.j.MICRO_OF_SECOND
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0134
            long r4 = r4 * r10
            java.util.Map r0 = r9.a
            java.lang.Object r0 = r0.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = r0 % r10
            long r0 = r0 + r4
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r9.x(r3, r6, r2)
            java.util.Map r2 = r9.a
            r2.remove(r6)
            goto L_0x0156
        L_0x0134:
            java.util.Map r0 = r9.a
            j$.time.temporal.j r3 = j$.time.temporal.j.NANO_OF_SECOND
            long r4 = r4 * r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r2 = r0
            r0 = r1
            goto L_0x015f
        L_0x0140:
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.MICRO_OF_SECOND
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0162
            java.util.Map r0 = r9.a
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x0156:
            java.util.Map r2 = r9.a
            j$.time.temporal.j r3 = j$.time.temporal.j.NANO_OF_SECOND
            long r0 = r0 * r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x015f:
            r2.put(r3, r0)
        L_0x0162:
            java.util.Map r0 = r9.a
            j$.time.temporal.j r12 = j$.time.temporal.j.HOUR_OF_DAY
            java.lang.Object r0 = r0.get(r12)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x01d9
            java.util.Map r1 = r9.a
            j$.time.temporal.j r13 = j$.time.temporal.j.MINUTE_OF_HOUR
            java.lang.Object r1 = r1.get(r13)
            java.lang.Long r1 = (java.lang.Long) r1
            java.util.Map r2 = r9.a
            j$.time.temporal.j r14 = j$.time.temporal.j.SECOND_OF_MINUTE
            java.lang.Object r2 = r2.get(r14)
            java.lang.Long r2 = (java.lang.Long) r2
            java.util.Map r3 = r9.a
            j$.time.temporal.j r15 = j$.time.temporal.j.NANO_OF_SECOND
            java.lang.Object r3 = r3.get(r15)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r1 != 0) goto L_0x0192
            if (r2 != 0) goto L_0x021d
            if (r3 != 0) goto L_0x021d
        L_0x0192:
            if (r1 == 0) goto L_0x019a
            if (r2 != 0) goto L_0x019a
            if (r3 == 0) goto L_0x019a
            goto L_0x021d
        L_0x019a:
            if (r1 == 0) goto L_0x01a1
            long r4 = r1.longValue()
            goto L_0x01a3
        L_0x01a1:
            r4 = 0
        L_0x01a3:
            if (r2 == 0) goto L_0x01aa
            long r1 = r2.longValue()
            goto L_0x01ac
        L_0x01aa:
            r1 = 0
        L_0x01ac:
            r6 = r1
            if (r3 == 0) goto L_0x01b4
            long r1 = r3.longValue()
            goto L_0x01b6
        L_0x01b4:
            r1 = 0
        L_0x01b6:
            r16 = r1
            long r1 = r0.longValue()
            r0 = r18
            r3 = r4
            r5 = r6
            r7 = r16
            r0.s(r1, r3, r5, r7)
            java.util.Map r0 = r9.a
            r0.remove(r12)
            java.util.Map r0 = r9.a
            r0.remove(r13)
            java.util.Map r0 = r9.a
            r0.remove(r14)
            java.util.Map r0 = r9.a
            r0.remove(r15)
        L_0x01d9:
            j$.time.format.k r0 = r9.e
            j$.time.format.k r1 = j$.time.format.k.LENIENT
            if (r0 == r1) goto L_0x021d
            java.util.Map r0 = r9.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x021d
            java.util.Map r0 = r9.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01f1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x021d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            j$.time.temporal.p r2 = (j$.time.temporal.p) r2
            boolean r3 = r2 instanceof j$.time.temporal.j
            if (r3 == 0) goto L_0x01f1
            boolean r3 = r2.k()
            if (r3 == 0) goto L_0x01f1
            j$.time.temporal.j r2 = (j$.time.temporal.j) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r2.Z(r3)
            goto L_0x01f1
        L_0x021d:
            j$.time.chrono.b r0 = r9.f
            if (r0 == 0) goto L_0x0224
            r9.o(r0)
        L_0x0224:
            j$.time.g r0 = r9.g
            if (r0 == 0) goto L_0x0242
            r9.o(r0)
            j$.time.chrono.b r0 = r9.f
            if (r0 == 0) goto L_0x0242
            java.util.Map r0 = r9.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0242
            j$.time.chrono.b r0 = r9.f
            j$.time.g r1 = r9.g
            j$.time.chrono.d r0 = r0.L(r1)
            r9.o(r0)
        L_0x0242:
            j$.time.chrono.b r0 = r9.f
            if (r0 == 0) goto L_0x0260
            j$.time.g r0 = r9.g
            if (r0 == 0) goto L_0x0260
            j$.time.i r0 = r9.h
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0260
            j$.time.chrono.b r0 = r9.f
            j$.time.i r1 = r9.h
            j$.time.chrono.b r0 = r0.N(r1)
            r9.f = r0
            j$.time.i r0 = j$.time.i.a
            r9.h = r0
        L_0x0260:
            j$.time.g r0 = r9.g
            if (r0 != 0) goto L_0x02d6
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.INSTANT_SECONDS
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0282
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.SECOND_OF_DAY
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0282
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.SECOND_OF_MINUTE
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x02d6
        L_0x0282:
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.NANO_OF_SECOND
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x02b5
            java.util.Map r0 = r9.a
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            java.util.Map r2 = r9.a
            j$.time.temporal.j r3 = j$.time.temporal.j.MICRO_OF_SECOND
            long r4 = r0 / r10
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            java.util.Map r2 = r9.a
            j$.time.temporal.j r3 = j$.time.temporal.j.MILLI_OF_SECOND
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            goto L_0x02d6
        L_0x02b5:
            java.util.Map r0 = r9.a
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.put(r1, r4)
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.MICRO_OF_SECOND
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r0.put(r1, r4)
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.MILLI_OF_SECOND
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
        L_0x02d6:
            j$.time.chrono.b r0 = r9.f
            if (r0 == 0) goto L_0x031c
            j$.time.g r1 = r9.g
            if (r1 == 0) goto L_0x031c
            j$.time.ZoneId r2 = r9.b
            if (r2 == 0) goto L_0x02ed
            j$.time.chrono.d r0 = r0.L(r1)
            j$.time.ZoneId r1 = r9.b
            j$.time.chrono.f r0 = r0.H(r1)
            goto L_0x030d
        L_0x02ed:
            java.util.Map r0 = r9.a
            j$.time.temporal.j r1 = j$.time.temporal.j.OFFSET_SECONDS
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x031c
            int r0 = r0.intValue()
            j$.time.k r0 = j$.time.k.a0(r0)
            j$.time.chrono.b r1 = r9.f
            j$.time.g r2 = r9.g
            j$.time.chrono.d r1 = r1.L(r2)
            j$.time.chrono.f r0 = r1.H(r0)
        L_0x030d:
            j$.time.temporal.j r1 = j$.time.temporal.j.INSTANT_SECONDS
            long r2 = r0.g(r1)
            java.util.Map r0 = r9.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r1, r2)
        L_0x031c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.p(j$.time.format.k, java.util.Set):j$.time.temporal.l");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (!(this.f == null && this.g == null)) {
            sb.append(" resolved to ");
            b bVar = this.f;
            if (bVar != null) {
                sb.append(bVar);
                if (this.g != null) {
                    sb.append('T');
                }
            }
            sb.append(this.g);
        }
        return sb.toString();
    }
}
