package j$.time.temporal;

import j$.time.Duration;
import j$.time.chrono.h;
import j$.time.chrono.j;
import j$.time.e;
import java.util.Map;

public final class k {
    public static final p a = b.QUARTER_OF_YEAR;
    public static final p b = b.WEEK_OF_WEEK_BASED_YEAR;
    public static final p c = b.WEEK_BASED_YEAR;
    public static final s d = c.WEEK_BASED_YEARS;

    private enum b implements p {
        DAY_OF_QUARTER {
            public u B() {
                return u.j(1, 90, 92);
            }

            public u I(l lVar) {
                if (V(lVar)) {
                    long g = lVar.g(b.QUARTER_OF_YEAR);
                    if (g != 1) {
                        return g == 2 ? u.i(1, 91) : (g == 3 || g == 4) ? u.i(1, 92) : B();
                    }
                    return j.a.C(lVar.g(j.YEAR)) ? u.i(1, 91) : u.i(1, 90);
                }
                throw new t("Unsupported field: DayOfQuarter");
            }

            public l P(Map map, l lVar, j$.time.format.k kVar) {
                e eVar;
                long j;
                j jVar = j.YEAR;
                Long l = (Long) map.get(jVar);
                b bVar = b.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(bVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int Y = jVar.Y(l.longValue());
                long longValue = ((Long) map.get(b.DAY_OF_QUARTER)).longValue();
                b.Z(lVar);
                if (kVar == j$.time.format.k.LENIENT) {
                    eVar = e.c0(Y, 1, 1).h0(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1), 3));
                    j = Math.subtractExact(longValue, 1);
                } else {
                    eVar = e.c0(Y, ((bVar.B().a(l2.longValue(), bVar) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        (kVar == j$.time.format.k.STRICT ? I(eVar) : B()).b(longValue, this);
                    }
                    j = longValue - 1;
                }
                map.remove(this);
                map.remove(jVar);
                map.remove(bVar);
                return eVar.g0(j);
            }

            public boolean V(l lVar) {
                return lVar.f(j.DAY_OF_YEAR) && lVar.f(j.MONTH_OF_YEAR) && lVar.f(j.YEAR) && h.E(lVar).equals(j.a);
            }

            public Temporal p(Temporal temporal, long j) {
                long q = q(temporal);
                B().b(j, this);
                j jVar = j.DAY_OF_YEAR;
                return temporal.c(jVar, (j - q) + temporal.g(jVar));
            }

            public long q(l lVar) {
                if (V(lVar)) {
                    return (long) (lVar.j(j.DAY_OF_YEAR) - b.a[((lVar.j(j.MONTH_OF_YEAR) - 1) / 3) + (j.a.C(lVar.g(j.YEAR)) ? 4 : 0)]);
                }
                throw new t("Unsupported field: DayOfQuarter");
            }

            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR {
            public u B() {
                return u.i(1, 4);
            }

            public boolean V(l lVar) {
                return lVar.f(j.MONTH_OF_YEAR) && h.E(lVar).equals(j.a);
            }

            public Temporal p(Temporal temporal, long j) {
                long q = q(temporal);
                B().b(j, this);
                j jVar = j.MONTH_OF_YEAR;
                return temporal.c(jVar, ((j - q) * 3) + temporal.g(jVar));
            }

            public long q(l lVar) {
                if (V(lVar)) {
                    return (lVar.g(j.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new t("Unsupported field: QuarterOfYear");
            }

            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR {
            public u B() {
                return u.j(1, 52, 53);
            }

            public u I(l lVar) {
                if (V(lVar)) {
                    return b.a0(e.q(lVar));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            public l P(Map map, l lVar, j$.time.format.k kVar) {
                e eVar;
                long j;
                e i02;
                long j2;
                Map map2 = map;
                j$.time.format.k kVar2 = kVar;
                b bVar = b.WEEK_BASED_YEAR;
                Long l = (Long) map2.get(bVar);
                j jVar = j.DAY_OF_WEEK;
                Long l2 = (Long) map2.get(jVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int a = bVar.B().a(l.longValue(), bVar);
                long longValue = ((Long) map2.get(b.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                b.Z(lVar);
                e c0 = e.c0(a, 1, 4);
                if (kVar2 == j$.time.format.k.LENIENT) {
                    long longValue2 = l2.longValue();
                    if (longValue2 > 7) {
                        j2 = longValue2 - 1;
                        i02 = c0.i0(j2 / 7);
                    } else {
                        j = 1;
                        if (longValue2 < 1) {
                            i02 = c0.i0(Math.subtractExact(longValue2, 7) / 7);
                            j2 = longValue2 + 6;
                        }
                        eVar = c0.i0(Math.subtractExact(longValue, j)).c(jVar, longValue2);
                    }
                    c0 = i02;
                    j = 1;
                    longValue2 = (j2 % 7) + 1;
                    eVar = c0.i0(Math.subtractExact(longValue, j)).c(jVar, longValue2);
                } else {
                    int Y = jVar.Y(l2.longValue());
                    if (longValue < 1 || longValue > 52) {
                        (kVar2 == j$.time.format.k.STRICT ? b.a0(c0) : B()).b(longValue, this);
                    }
                    eVar = c0.i0(longValue - 1).c(jVar, (long) Y);
                }
                map2.remove(this);
                map2.remove(bVar);
                map2.remove(jVar);
                return eVar;
            }

            public boolean V(l lVar) {
                return lVar.f(j.EPOCH_DAY) && h.E(lVar).equals(j.a);
            }

            public Temporal p(Temporal temporal, long j) {
                B().b(j, this);
                return temporal.a(Math.subtractExact(j, q(temporal)), ChronoUnit.WEEKS);
            }

            public long q(l lVar) {
                if (V(lVar)) {
                    return (long) b.b0(e.q(lVar));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR {
            public u B() {
                return j.YEAR.B();
            }

            public boolean V(l lVar) {
                return lVar.f(j.EPOCH_DAY) && h.E(lVar).equals(j.a);
            }

            public Temporal p(Temporal temporal, long j) {
                if (V(temporal)) {
                    int a = B().a(j, b.WEEK_BASED_YEAR);
                    e q = e.q(temporal);
                    j jVar = j.DAY_OF_WEEK;
                    int j2 = q.j(jVar);
                    int b0 = b.b0(q);
                    if (b0 == 53 && b.f0(a) == 52) {
                        b0 = 52;
                    }
                    e c0 = e.c0(a, 1, 4);
                    return temporal.b(c0.g0((long) (((b0 - 1) * 7) + (j2 - c0.j(jVar)))));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            public long q(l lVar) {
                if (V(lVar)) {
                    return (long) b.e0(e.q(lVar));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            public String toString() {
                return "WeekBasedYear";
            }
        };
        
        /* access modifiers changed from: private */
        public static final int[] a = null;

        static {
            a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        b(a aVar) {
        }

        static void Z(l lVar) {
            if (!h.E(lVar).equals(j.a)) {
                throw new j$.time.c("Resolve requires IsoChronology");
            }
        }

        static u a0(e eVar) {
            return u.i(1, (long) f0(e0(eVar)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            if ((r0 == -3 || (r0 == -2 && r5.O())) == false) goto L_0x005a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int b0(j$.time.e r5) {
            /*
                j$.time.d r0 = r5.I()
                int r0 = r0.ordinal()
                int r1 = r5.P()
                r2 = 1
                int r1 = r1 - r2
                int r0 = 3 - r0
                int r0 = r0 + r1
                int r3 = r0 / 7
                int r3 = r3 * 7
                int r0 = r0 - r3
                r3 = -3
                int r0 = r0 + r3
                if (r0 >= r3) goto L_0x001c
                int r0 = r0 + 7
            L_0x001c:
                if (r1 >= r0) goto L_0x003f
                r0 = 180(0xb4, float:2.52E-43)
                j$.time.e r5 = r5.n0(r0)
                r0 = -1
                j$.time.e r5 = r5.j0(r0)
                int r5 = e0(r5)
                int r5 = f0(r5)
                long r0 = (long) r5
                r2 = 1
                j$.time.temporal.u r5 = j$.time.temporal.u.i(r2, r0)
                long r0 = r5.d()
                int r5 = (int) r0
                goto L_0x005b
            L_0x003f:
                int r1 = r1 - r0
                int r1 = r1 / 7
                int r1 = r1 + r2
                r4 = 53
                if (r1 != r4) goto L_0x0059
                if (r0 == r3) goto L_0x0055
                r3 = -2
                if (r0 != r3) goto L_0x0053
                boolean r5 = r5.O()
                if (r5 == 0) goto L_0x0053
                goto L_0x0055
            L_0x0053:
                r5 = 0
                goto L_0x0056
            L_0x0055:
                r5 = r2
            L_0x0056:
                if (r5 != 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r2 = r1
            L_0x005a:
                r5 = r2
            L_0x005b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.temporal.k.b.b0(j$.time.e):int");
        }

        /* access modifiers changed from: private */
        public static int e0(e eVar) {
            int Z = eVar.Z();
            int P = eVar.P();
            if (P <= 3) {
                return P - eVar.I().ordinal() < -2 ? Z - 1 : Z;
            }
            if (P < 363) {
                return Z;
            }
            return ((P - 363) - (eVar.O() ? 1 : 0)) - eVar.I().ordinal() >= 0 ? Z + 1 : Z;
        }

        /* access modifiers changed from: private */
        public static int f0(int i) {
            e c0 = e.c0(i, 1, 1);
            if (c0.I() != j$.time.d.THURSDAY) {
                return (c0.I() != j$.time.d.WEDNESDAY || !c0.O()) ? 52 : 53;
            }
            return 53;
        }

        public u I(l lVar) {
            return B();
        }

        public boolean k() {
            return false;
        }

        public boolean o() {
            return true;
        }
    }

    private enum c implements s {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.p(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.p(7889238));
        
        private final String b;

        private c(String str, Duration duration) {
            this.b = str;
        }

        public long between(Temporal temporal, Temporal temporal2) {
            if (temporal.getClass() != temporal2.getClass()) {
                return temporal.l(temporal2, this);
            }
            int ordinal = ordinal();
            if (ordinal == 0) {
                p pVar = k.c;
                return Math.subtractExact(temporal2.g(pVar), temporal.g(pVar));
            } else if (ordinal == 1) {
                return temporal.l(temporal2, ChronoUnit.MONTHS) / 3;
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public boolean k() {
            return false;
        }

        public boolean o() {
            return true;
        }

        public Temporal p(Temporal temporal, long j) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                p pVar = k.c;
                return temporal.c(pVar, Math.addExact((long) temporal.j(pVar), j));
            } else if (ordinal == 1) {
                return temporal.a(j / 256, ChronoUnit.YEARS).a((j % 256) * 3, ChronoUnit.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public String toString() {
            return this.b;
        }
    }

    static {
        b bVar = b.DAY_OF_QUARTER;
        c cVar = c.QUARTER_YEARS;
    }
}
