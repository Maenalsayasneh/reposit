package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.g;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.u;

public enum d implements l, m {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final d[] a = null;

    static {
        a = values();
    }

    public static d o(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new c("Invalid value for DayOfWeek: " + i);
    }

    public Object d(r rVar) {
        int i = q.a;
        return rVar == g.a ? ChronoUnit.DAYS : super.d(rVar);
    }

    public Temporal e(Temporal temporal) {
        return temporal.c(j.DAY_OF_WEEK, (long) k());
    }

    public boolean f(p pVar) {
        return pVar instanceof j ? pVar == j.DAY_OF_WEEK : pVar != null && pVar.V(this);
    }

    public long g(p pVar) {
        if (pVar == j.DAY_OF_WEEK) {
            return (long) k();
        }
        if (!(pVar instanceof j)) {
            return pVar.q(this);
        }
        throw new t("Unsupported field: " + pVar);
    }

    public u i(p pVar) {
        return pVar == j.DAY_OF_WEEK ? pVar.B() : super.i(pVar);
    }

    public int j(p pVar) {
        return pVar == j.DAY_OF_WEEK ? k() : super.j(pVar);
    }

    public int k() {
        return ordinal() + 1;
    }

    public d p(long j) {
        return a[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }
}
