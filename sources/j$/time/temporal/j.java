package j$.time.temporal;

import androidx.recyclerview.widget.RecyclerView;

public enum j implements p {
    NANO_OF_SECOND("NanoOfSecond", r4, r17, u.i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r4, r27, u.i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r4, r17, u.i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r4, r27, u.i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r4, r17, u.i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r4, r27, u.i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r17, r32, u.i(0, 59), "second"),
    SECOND_OF_DAY("SecondOfDay", r17, r5, u.i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r32, r13, u.i(0, 59), "minute"),
    MINUTE_OF_DAY("MinuteOfDay", r32, r5, u.i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r13, r16, u.i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r4, r16, u.i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r13, r24, u.i(0, 23), "hour"),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r4, r27, u.i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r16, r24, u.i(0, 1), "dayperiod"),
    DAY_OF_WEEK("DayOfWeek", r23, r38, u.i(1, 7), "weekday"),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r4, r5, u.i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r4, r5, u.i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r23, r15, u.j(1, 28, 31), "day"),
    DAY_OF_YEAR("DayOfYear", r4, r42, u.j(1, 365, 366)),
    EPOCH_DAY("EpochDay", r4, r44, u.i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r4, r15, u.j(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r4, r42, u.i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r15, r42, u.i(1, 12), "month"),
    PROLEPTIC_MONTH("ProlepticMonth", r15, r44, u.i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r42, r5, u.j(1, 999999999, 1000000000)),
    YEAR("Year", r42, r24, u.i(-999999999, 999999999), "year"),
    ERA("Era", ChronoUnit.ERAS, r24, u.i(0, 1), "era"),
    INSTANT_SECONDS("InstantSeconds", r4, r5, u.i(Long.MIN_VALUE, RecyclerView.FOREVER_NS)),
    OFFSET_SECONDS("OffsetSeconds", r4, r5, u.i(-64800, 64800));
    
    private final String b;
    private final s c;
    private final s d;
    private final u e;

    private j(String str, s sVar, s sVar2, u uVar) {
        this.b = str;
        this.c = sVar;
        this.d = sVar2;
        this.e = uVar;
    }

    private j(String str, s sVar, s sVar2, u uVar, String str2) {
        this.b = str;
        this.c = sVar;
        this.d = sVar2;
        this.e = uVar;
    }

    public u B() {
        return this.e;
    }

    public u I(l lVar) {
        return lVar.i(this);
    }

    public boolean V(l lVar) {
        return lVar.f(this);
    }

    public int Y(long j) {
        return this.e.a(j, this);
    }

    public long Z(long j) {
        this.e.b(j, this);
        return j;
    }

    public boolean k() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public boolean o() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public Temporal p(Temporal temporal, long j) {
        return temporal.c(this, j);
    }

    public long q(l lVar) {
        return lVar.g(this);
    }

    public String toString() {
        return this.b;
    }
}
