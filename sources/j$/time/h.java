package j$.time;

import j$.time.chrono.j;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.d;
import j$.time.temporal.g;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.t;
import j$.time.temporal.u;

public enum h implements l, m {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final h[] a = null;

    static {
        a = values();
    }

    public static h q(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new c("Invalid value for MonthOfYear: " + i);
    }

    public h B(long j) {
        return a[((((int) (j % 12)) + 12) + ordinal()) % 12];
    }

    public Object d(r rVar) {
        int i = q.a;
        return rVar == d.a ? j.a : rVar == g.a ? ChronoUnit.MONTHS : super.d(rVar);
    }

    public Temporal e(Temporal temporal) {
        if (j$.time.chrono.h.E(temporal).equals(j.a)) {
            return temporal.c(j$.time.temporal.j.MONTH_OF_YEAR, (long) k());
        }
        throw new c("Adjustment only supported on ISO date-time");
    }

    public boolean f(p pVar) {
        return pVar instanceof j$.time.temporal.j ? pVar == j$.time.temporal.j.MONTH_OF_YEAR : pVar != null && pVar.V(this);
    }

    public long g(p pVar) {
        if (pVar == j$.time.temporal.j.MONTH_OF_YEAR) {
            return (long) k();
        }
        if (!(pVar instanceof j$.time.temporal.j)) {
            return pVar.q(this);
        }
        throw new t("Unsupported field: " + pVar);
    }

    public u i(p pVar) {
        return pVar == j$.time.temporal.j.MONTH_OF_YEAR ? pVar.B() : super.i(pVar);
    }

    public int j(p pVar) {
        return pVar == j$.time.temporal.j.MONTH_OF_YEAR ? k() : super.j(pVar);
    }

    public int k() {
        return ordinal() + 1;
    }

    public int o(boolean z) {
        int i;
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                i = 60;
                break;
            case 3:
                i = 91;
                break;
            case 4:
                i = 121;
                break;
            case 5:
                i = 152;
                break;
            case 6:
                i = 182;
                break;
            case 7:
                i = 213;
                break;
            case 8:
                i = 244;
                break;
            case 9:
                i = 274;
                break;
            case 10:
                i = 305;
                break;
            default:
                i = 335;
                break;
        }
        return (z ? 1 : 0) + i;
    }

    public int p(boolean z) {
        int ordinal = ordinal();
        return ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : z ? 29 : 28;
    }
}
