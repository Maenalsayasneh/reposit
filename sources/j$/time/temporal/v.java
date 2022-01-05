package j$.time.temporal;

import j$.time.c;
import j$.time.chrono.b;
import j$.time.chrono.h;
import j$.time.d;
import j$.time.format.k;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class v implements Serializable {
    private static final ConcurrentMap a = new ConcurrentHashMap(4, 0.75f, 2);
    public static final s b = k.d;
    private final d c;
    private final int d;
    /* access modifiers changed from: private */
    public final transient p e = a.g(this);
    private final transient p f = a.j(this);
    /* access modifiers changed from: private */
    public final transient p g;
    /* access modifiers changed from: private */
    public final transient p h;

    static class a implements p {
        private static final u a = u.i(1, 7);
        private static final u b = u.k(0, 1, 4, 6);
        private static final u c = u.k(0, 1, 52, 54);
        private static final u d = u.j(1, 52, 53);
        private final String e;
        private final v f;
        private final s g;
        private final s h;
        private final u i;

        private a(String str, v vVar, s sVar, s sVar2, u uVar) {
            this.e = str;
            this.f = vVar;
            this.g = sVar;
            this.h = sVar2;
            this.i = uVar;
        }

        private int a(int i2, int i3) {
            return ((i3 - 1) + (i2 + 7)) / 7;
        }

        private int b(l lVar) {
            return Math.floorMod(lVar.j(j.DAY_OF_WEEK) - this.f.e().k(), 7) + 1;
        }

        private int c(l lVar) {
            int b2 = b(lVar);
            int j = lVar.j(j.YEAR);
            j jVar = j.DAY_OF_YEAR;
            int j2 = lVar.j(jVar);
            int s = s(j2, b2);
            int a2 = a(s, j2);
            if (a2 == 0) {
                return j - 1;
            }
            return a2 >= a(s, this.f.f() + ((int) lVar.i(jVar).d())) ? j + 1 : j;
        }

        private long d(l lVar) {
            int b2 = b(lVar);
            int j = lVar.j(j.DAY_OF_MONTH);
            return (long) a(s(j, b2), j);
        }

        private int e(l lVar) {
            int b2 = b(lVar);
            j jVar = j.DAY_OF_YEAR;
            int j = lVar.j(jVar);
            int s = s(j, b2);
            int a2 = a(s, j);
            if (a2 == 0) {
                return e(h.E(lVar).u(lVar).A((long) j, ChronoUnit.DAYS));
            }
            if (a2 <= 50) {
                return a2;
            }
            int a3 = a(s, this.f.f() + ((int) lVar.i(jVar).d()));
            return a2 >= a3 ? (a2 - a3) + 1 : a2;
        }

        private long f(l lVar) {
            int b2 = b(lVar);
            int j = lVar.j(j.DAY_OF_YEAR);
            return (long) a(s(j, b2), j);
        }

        static a g(v vVar) {
            return new a("DayOfWeek", vVar, ChronoUnit.DAYS, ChronoUnit.WEEKS, a);
        }

        private b h(h hVar, int i2, int i3, int i4) {
            b F = hVar.F(i2, 1, 1);
            int s = s(1, b(F));
            int i5 = i4 - 1;
            return F.a((long) (((Math.min(i3, a(s, this.f.f() + F.J()) - 1) - 1) * 7) + i5 + (-s)), (s) ChronoUnit.DAYS);
        }

        static a i(v vVar) {
            return new a("WeekBasedYear", vVar, k.d, ChronoUnit.FOREVER, j.YEAR.B());
        }

        static a j(v vVar) {
            return new a("WeekOfMonth", vVar, ChronoUnit.WEEKS, ChronoUnit.MONTHS, b);
        }

        static a l(v vVar) {
            return new a("WeekOfWeekBasedYear", vVar, ChronoUnit.WEEKS, k.d, d);
        }

        static a m(v vVar) {
            return new a("WeekOfYear", vVar, ChronoUnit.WEEKS, ChronoUnit.YEARS, c);
        }

        private u n(l lVar, p pVar) {
            int s = s(lVar.j(pVar), b(lVar));
            u i2 = lVar.i(pVar);
            return u.i((long) a(s, (int) i2.e()), (long) a(s, (int) i2.d()));
        }

        private u r(l lVar) {
            j jVar = j.DAY_OF_YEAR;
            if (!lVar.f(jVar)) {
                return c;
            }
            int b2 = b(lVar);
            int j = lVar.j(jVar);
            int s = s(j, b2);
            int a2 = a(s, j);
            if (a2 == 0) {
                return r(h.E(lVar).u(lVar).A((long) (j + 7), ChronoUnit.DAYS));
            }
            int d2 = (int) lVar.i(jVar).d();
            int a3 = a(s, this.f.f() + d2);
            return a2 >= a3 ? r(h.E(lVar).u(lVar).a((long) ((d2 - j) + 1 + 7), (s) ChronoUnit.DAYS)) : u.i(1, (long) (a3 - 1));
        }

        private int s(int i2, int i3) {
            int floorMod = Math.floorMod(i2 - i3, 7);
            return floorMod + 1 > this.f.f() ? 7 - floorMod : -floorMod;
        }

        public u B() {
            return this.i;
        }

        public u I(l lVar) {
            s sVar = this.h;
            if (sVar == ChronoUnit.WEEKS) {
                return this.i;
            }
            if (sVar == ChronoUnit.MONTHS) {
                return n(lVar, j.DAY_OF_MONTH);
            }
            if (sVar == ChronoUnit.YEARS) {
                return n(lVar, j.DAY_OF_YEAR);
            }
            if (sVar == v.b) {
                return r(lVar);
            }
            if (sVar == ChronoUnit.FOREVER) {
                return j.YEAR.B();
            }
            StringBuilder b2 = j$.com.android.tools.r8.a.b("unreachable, rangeUnit: ");
            b2.append(this.h);
            b2.append(", this: ");
            b2.append(this);
            throw new IllegalStateException(b2.toString());
        }

        public l P(Map map, l lVar, k kVar) {
            b bVar;
            b bVar2;
            b bVar3;
            Map map2 = map;
            k kVar2 = kVar;
            long longValue = ((Long) map2.get(this)).longValue();
            int intExact = Math.toIntExact(longValue);
            s sVar = this.h;
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            if (sVar == chronoUnit) {
                map2.remove(this);
                map2.put(j.DAY_OF_WEEK, Long.valueOf((long) (Math.floorMod((this.i.a(longValue, this) - 1) + (this.f.e().k() - 1), 7) + 1)));
            } else {
                j jVar = j.DAY_OF_WEEK;
                if (map2.containsKey(jVar)) {
                    int floorMod = Math.floorMod(jVar.Y(((Long) map2.get(jVar)).longValue()) - this.f.e().k(), 7) + 1;
                    h E = h.E(lVar);
                    j jVar2 = j.YEAR;
                    if (map2.containsKey(jVar2)) {
                        int Y = jVar2.Y(((Long) map2.get(jVar2)).longValue());
                        s sVar2 = this.h;
                        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                        if (sVar2 == chronoUnit2) {
                            j jVar3 = j.MONTH_OF_YEAR;
                            if (map2.containsKey(jVar3)) {
                                long longValue2 = ((Long) map2.get(jVar3)).longValue();
                                long j = (long) intExact;
                                if (kVar2 == k.LENIENT) {
                                    b a2 = E.F(Y, 1, 1).a(Math.subtractExact(longValue2, 1), (s) chronoUnit2);
                                    bVar3 = a2.a(Math.addExact(Math.multiplyExact(Math.subtractExact(j, d(a2)), 7), (long) (floorMod - b(a2))), (s) ChronoUnit.DAYS);
                                } else {
                                    b F = E.F(Y, jVar3.Y(longValue2), 1);
                                    b a3 = F.a((long) ((((int) (((long) this.i.a(j, this)) - d(F))) * 7) + (floorMod - b(F))), (s) ChronoUnit.DAYS);
                                    if (kVar2 != k.STRICT || a3.g(jVar3) == longValue2) {
                                        bVar3 = a3;
                                    } else {
                                        throw new c("Strict mode rejected resolved date as it is in a different month");
                                    }
                                }
                                map2.remove(this);
                                map2.remove(jVar2);
                                map2.remove(jVar3);
                                map2.remove(jVar);
                                return bVar3;
                            }
                        }
                        if (this.h == ChronoUnit.YEARS) {
                            long j2 = (long) intExact;
                            b F2 = E.F(Y, 1, 1);
                            if (kVar2 == k.LENIENT) {
                                bVar2 = F2.a(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, f(F2)), 7), (long) (floorMod - b(F2))), (s) ChronoUnit.DAYS);
                            } else {
                                b a4 = F2.a((long) ((((int) (((long) this.i.a(j2, this)) - f(F2))) * 7) + (floorMod - b(F2))), (s) ChronoUnit.DAYS);
                                if (kVar2 != k.STRICT || a4.g(jVar2) == ((long) Y)) {
                                    bVar2 = a4;
                                } else {
                                    throw new c("Strict mode rejected resolved date as it is in a different year");
                                }
                            }
                            map2.remove(this);
                            map2.remove(jVar2);
                            map2.remove(jVar);
                            return bVar2;
                        }
                    } else {
                        s sVar3 = this.h;
                        if ((sVar3 == v.b || sVar3 == ChronoUnit.FOREVER) && map2.containsKey(this.f.h) && map2.containsKey(this.f.g)) {
                            int a5 = this.f.h.B().a(((Long) map2.get(this.f.h)).longValue(), this.f.h);
                            if (kVar2 == k.LENIENT) {
                                bVar = h(E, a5, 1, floorMod).a(Math.subtractExact(((Long) map2.get(this.f.g)).longValue(), 1), (s) chronoUnit);
                            } else {
                                b h2 = h(E, a5, this.f.g.B().a(((Long) map2.get(this.f.g)).longValue(), this.f.g), floorMod);
                                if (kVar2 != k.STRICT || c(h2) == a5) {
                                    bVar = h2;
                                } else {
                                    throw new c("Strict mode rejected resolved date as it is in a different week-based-year");
                                }
                            }
                            map2.remove(this);
                            map2.remove(this.f.h);
                            map2.remove(this.f.g);
                            map2.remove(jVar);
                            return bVar;
                        }
                    }
                }
            }
            return null;
        }

        public boolean V(l lVar) {
            j jVar;
            if (!lVar.f(j.DAY_OF_WEEK)) {
                return false;
            }
            s sVar = this.h;
            if (sVar == ChronoUnit.WEEKS) {
                return true;
            }
            if (sVar == ChronoUnit.MONTHS) {
                jVar = j.DAY_OF_MONTH;
            } else if (sVar == ChronoUnit.YEARS || sVar == v.b) {
                jVar = j.DAY_OF_YEAR;
            } else if (sVar != ChronoUnit.FOREVER) {
                return false;
            } else {
                jVar = j.YEAR;
            }
            return lVar.f(jVar);
        }

        public boolean k() {
            return false;
        }

        public boolean o() {
            return true;
        }

        public Temporal p(Temporal temporal, long j) {
            int a2 = this.i.a(j, this);
            int j2 = temporal.j(this);
            if (a2 == j2) {
                return temporal;
            }
            if (this.h != ChronoUnit.FOREVER) {
                return temporal.a((long) (a2 - j2), this.g);
            }
            int j3 = temporal.j(this.f.e);
            return h(h.E(temporal), (int) j, temporal.j(this.f.g), j3);
        }

        public long q(l lVar) {
            int i2;
            s sVar = this.h;
            if (sVar == ChronoUnit.WEEKS) {
                i2 = b(lVar);
            } else if (sVar == ChronoUnit.MONTHS) {
                return d(lVar);
            } else {
                if (sVar == ChronoUnit.YEARS) {
                    return f(lVar);
                }
                if (sVar == v.b) {
                    i2 = e(lVar);
                } else if (sVar == ChronoUnit.FOREVER) {
                    i2 = c(lVar);
                } else {
                    StringBuilder b2 = j$.com.android.tools.r8.a.b("unreachable, rangeUnit: ");
                    b2.append(this.h);
                    b2.append(", this: ");
                    b2.append(this);
                    throw new IllegalStateException(b2.toString());
                }
            }
            return (long) i2;
        }

        public String toString() {
            return this.e + "[" + this.f.toString() + "]";
        }
    }

    static {
        new v(d.MONDAY, 4);
        g(d.SUNDAY, 1);
    }

    private v(d dVar, int i) {
        a.m(this);
        this.g = a.l(this);
        this.h = a.i(this);
        Objects.requireNonNull(dVar, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.c = dVar;
        this.d = i;
    }

    public static v g(d dVar, int i) {
        String str = dVar.toString() + i;
        ConcurrentMap concurrentMap = a;
        v vVar = (v) concurrentMap.get(str);
        if (vVar != null) {
            return vVar;
        }
        concurrentMap.putIfAbsent(str, new v(dVar, i));
        return (v) concurrentMap.get(str);
    }

    public p d() {
        return this.e;
    }

    public d e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return hashCode() == obj.hashCode();
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public p h() {
        return this.h;
    }

    public int hashCode() {
        return (this.c.ordinal() * 7) + this.d;
    }

    public p i() {
        return this.f;
    }

    public p j() {
        return this.g;
    }

    public String toString() {
        StringBuilder b2 = j$.com.android.tools.r8.a.b("WeekFields[");
        b2.append(this.c);
        b2.append(',');
        b2.append(this.d);
        b2.append(']');
        return b2.toString();
    }
}
