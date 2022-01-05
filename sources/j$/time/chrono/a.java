package j$.time.chrono;

import j$.time.c;
import j$.time.d;
import j$.time.e;
import j$.time.format.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.j;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.time.temporal.p;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a implements h {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    protected a() {
    }

    /* access modifiers changed from: package-private */
    public b B(Map map, k kVar) {
        long j;
        i iVar;
        j jVar = j.YEAR_OF_ERA;
        Long l = (Long) map.remove(jVar);
        if (l != null) {
            j jVar2 = j.ERA;
            Long l2 = (Long) map.remove(jVar2);
            int a = kVar != k.LENIENT ? jVar.B().a(l.longValue(), jVar) : Math.toIntExact(l.longValue());
            if (l2 != null) {
                j jVar3 = (j) this;
                k(map, j.YEAR, (long) jVar3.P(jVar3.I(jVar2.B().a(l2.longValue(), jVar2)), a));
                return null;
            }
            j jVar4 = j.YEAR;
            if (map.containsKey(jVar4)) {
                iVar = e.e0(jVar4.B().a(((Long) map.get(jVar4)).longValue(), jVar4), 1).V();
            } else if (kVar == k.STRICT) {
                map.put(jVar, l);
                return null;
            } else {
                List asList = Arrays.asList(k.values());
                if (asList.isEmpty()) {
                    j = (long) a;
                    k(map, jVar4, j);
                    return null;
                }
                iVar = (i) asList.get(asList.size() - 1);
            }
            j = (long) ((j) this).P(iVar, a);
            k(map, jVar4, j);
            return null;
        }
        j jVar5 = j.ERA;
        if (!map.containsKey(jVar5)) {
            return null;
        }
        jVar5.B().b(((Long) map.get(jVar5)).longValue(), jVar5);
        return null;
    }

    public b R(Map map, k kVar) {
        Map map2 = map;
        k kVar2 = kVar;
        j jVar = j.EPOCH_DAY;
        if (map2.containsKey(jVar)) {
            return e.d0(((Long) map2.remove(jVar)).longValue());
        }
        p(map, kVar);
        b B = B(map, kVar);
        if (B != null) {
            return B;
        }
        j jVar2 = j.YEAR;
        if (!map2.containsKey(jVar2)) {
            return null;
        }
        j jVar3 = j.MONTH_OF_YEAR;
        if (map2.containsKey(jVar3)) {
            if (map2.containsKey(j.DAY_OF_MONTH)) {
                return q(map, kVar);
            }
            j jVar4 = j.ALIGNED_WEEK_OF_MONTH;
            if (map2.containsKey(jVar4)) {
                j jVar5 = j.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map2.containsKey(jVar5)) {
                    int a = jVar2.B().a(((Long) map2.remove(jVar2)).longValue(), jVar2);
                    if (kVar2 == k.LENIENT) {
                        long subtractExact = Math.subtractExact(((Long) map2.remove(jVar3)).longValue(), 1);
                        long subtractExact2 = Math.subtractExact(((Long) map2.remove(jVar4)).longValue(), 1);
                        return e.c0(a, 1, 1).a(subtractExact, ChronoUnit.MONTHS).a(subtractExact2, ChronoUnit.WEEKS).a(Math.subtractExact(((Long) map2.remove(jVar5)).longValue(), 1), ChronoUnit.DAYS);
                    }
                    int a2 = jVar3.B().a(((Long) map2.remove(jVar3)).longValue(), jVar3);
                    int a3 = jVar4.B().a(((Long) map2.remove(jVar4)).longValue(), jVar4);
                    e f0 = e.c0(a, a2, 1).a((long) ((jVar5.B().a(((Long) map2.remove(jVar5)).longValue(), jVar5) - 1) + ((a3 - 1) * 7)), ChronoUnit.DAYS);
                    if (kVar2 != k.STRICT || f0.j(jVar3) == a2) {
                        return f0;
                    }
                    throw new c("Strict mode rejected resolved date as it is in a different month");
                }
                j jVar6 = j.DAY_OF_WEEK;
                if (map2.containsKey(jVar6)) {
                    int a4 = jVar2.B().a(((Long) map2.remove(jVar2)).longValue(), jVar2);
                    if (kVar2 == k.LENIENT) {
                        return o(e.c0(a4, 1, 1), Math.subtractExact(((Long) map2.remove(jVar3)).longValue(), 1), Math.subtractExact(((Long) map2.remove(jVar4)).longValue(), 1), Math.subtractExact(((Long) map2.remove(jVar6)).longValue(), 1));
                    }
                    int a5 = jVar3.B().a(((Long) map2.remove(jVar3)).longValue(), jVar3);
                    b b = e.c0(a4, a5, 1).a((long) ((jVar4.B().a(((Long) map2.remove(jVar4)).longValue(), jVar4) - 1) * 7), ChronoUnit.DAYS).b(n.a(d.o(jVar6.B().a(((Long) map2.remove(jVar6)).longValue(), jVar6))));
                    if (kVar2 != k.STRICT || ((e) b).j(jVar3) == a5) {
                        return b;
                    }
                    throw new c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j jVar7 = j.DAY_OF_YEAR;
        if (map2.containsKey(jVar7)) {
            int a6 = jVar2.B().a(((Long) map2.remove(jVar2)).longValue(), jVar2);
            if (kVar2 != k.LENIENT) {
                return e.e0(a6, jVar7.B().a(((Long) map2.remove(jVar7)).longValue(), jVar7));
            }
            return e.e0(a6, 1).a(Math.subtractExact(((Long) map2.remove(jVar7)).longValue(), 1), ChronoUnit.DAYS);
        }
        j jVar8 = j.ALIGNED_WEEK_OF_YEAR;
        if (!map2.containsKey(jVar8)) {
            return null;
        }
        j jVar9 = j.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map2.containsKey(jVar9)) {
            int a7 = jVar2.B().a(((Long) map2.remove(jVar2)).longValue(), jVar2);
            if (kVar2 == k.LENIENT) {
                long subtractExact3 = Math.subtractExact(((Long) map2.remove(jVar8)).longValue(), 1);
                return e.e0(a7, 1).a(subtractExact3, ChronoUnit.WEEKS).a(Math.subtractExact(((Long) map2.remove(jVar9)).longValue(), 1), ChronoUnit.DAYS);
            }
            int a8 = jVar8.B().a(((Long) map2.remove(jVar8)).longValue(), jVar8);
            e f02 = e.e0(a7, 1).a((long) ((jVar9.B().a(((Long) map2.remove(jVar9)).longValue(), jVar9) - 1) + ((a8 - 1) * 7)), ChronoUnit.DAYS);
            if (kVar2 != k.STRICT || f02.j(jVar2) == a7) {
                return f02;
            }
            throw new c("Strict mode rejected resolved date as it is in a different year");
        }
        j jVar10 = j.DAY_OF_WEEK;
        if (!map2.containsKey(jVar10)) {
            return null;
        }
        int a9 = jVar2.B().a(((Long) map2.remove(jVar2)).longValue(), jVar2);
        if (kVar2 == k.LENIENT) {
            return o(e.e0(a9, 1), 0, Math.subtractExact(((Long) map2.remove(jVar8)).longValue(), 1), Math.subtractExact(((Long) map2.remove(jVar10)).longValue(), 1));
        }
        b b2 = e.e0(a9, 1).a((long) ((jVar8.B().a(((Long) map2.remove(jVar8)).longValue(), jVar8) - 1) * 7), ChronoUnit.DAYS).b(n.a(d.o(jVar10.B().a(((Long) map2.remove(jVar10)).longValue(), jVar10))));
        if (kVar2 != k.STRICT || ((e) b2).j(jVar2) == a9) {
            return b2;
        }
        throw new c("Strict mode rejected resolved date as it is in a different year");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return compareTo((a) obj) == 0;
        }
        return false;
    }

    public int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    /* access modifiers changed from: package-private */
    public void k(Map map, j jVar, long j) {
        Long l = (Long) map.get(jVar);
        if (l == null || l.longValue() == j) {
            map.put(jVar, Long.valueOf(j));
            return;
        }
        throw new c("Conflict found: " + jVar + " " + l + " differs from " + jVar + " " + j);
    }

    /* access modifiers changed from: package-private */
    public b o(b bVar, long j, long j2, long j3) {
        long j4;
        e f0 = ((e) bVar).a(j, ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        e f02 = f0.a(j2, chronoUnit);
        if (j3 > 7) {
            j4 = j3 - 1;
            f02 = f02.a(j4 / 7, chronoUnit);
        } else {
            if (j3 < 1) {
                f02 = f02.a(Math.subtractExact(j3, 7) / 7, chronoUnit);
                j4 = j3 + 6;
            }
            return f02.b(n.a(d.o((int) j3)));
        }
        j3 = (j4 % 7) + 1;
        return f02.b(n.a(d.o((int) j3)));
    }

    /* access modifiers changed from: package-private */
    public void p(Map map, k kVar) {
        j jVar = j.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(jVar);
        if (l != null) {
            if (kVar != k.LENIENT) {
                jVar.Z(l.longValue());
            }
            b c = M().c((p) j.DAY_OF_MONTH, 1).c((p) jVar, l.longValue());
            j jVar2 = j.MONTH_OF_YEAR;
            k(map, jVar2, (long) c.j(jVar2));
            j jVar3 = j.YEAR;
            k(map, jVar3, (long) c.j(jVar3));
        }
    }

    /* access modifiers changed from: package-private */
    public b q(Map map, k kVar) {
        j jVar = j.YEAR;
        int a = jVar.B().a(((Long) map.remove(jVar)).longValue(), jVar);
        if (kVar == k.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(j.MONTH_OF_YEAR)).longValue(), 1);
            return e.c0(a, 1, 1).a(subtractExact, ChronoUnit.MONTHS).a(Math.subtractExact(((Long) map.remove(j.DAY_OF_MONTH)).longValue(), 1), ChronoUnit.DAYS);
        }
        j jVar2 = j.MONTH_OF_YEAR;
        int a2 = jVar2.B().a(((Long) map.remove(jVar2)).longValue(), jVar2);
        j jVar3 = j.DAY_OF_MONTH;
        int a3 = jVar3.B().a(((Long) map.remove(jVar3)).longValue(), jVar3);
        if (kVar != k.SMART) {
            return e.c0(a, a2, a3);
        }
        try {
            return e.c0(a, a2, a3);
        } catch (c unused) {
            return e.c0(a, a2, 1).b((m) j$.time.temporal.a.a);
        }
    }

    /* renamed from: r */
    public int compareTo(h hVar) {
        return "ISO".compareTo(hVar.t());
    }

    public String toString() {
        return "ISO";
    }
}
