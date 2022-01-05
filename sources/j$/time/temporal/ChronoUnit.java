package j$.time.temporal;

import androidx.recyclerview.widget.RecyclerView;
import j$.time.Duration;

public enum ChronoUnit implements s {
    NANOS("Nanos", Duration.o(1)),
    MICROS("Micros", Duration.o(1000)),
    MILLIS("Millis", Duration.o(1000000)),
    SECONDS("Seconds", Duration.p(1)),
    MINUTES("Minutes", Duration.p(60)),
    HOURS("Hours", Duration.p(3600)),
    HALF_DAYS("HalfDays", Duration.p(43200)),
    DAYS("Days", Duration.p(86400)),
    WEEKS("Weeks", Duration.p(604800)),
    MONTHS("Months", Duration.p(2629746)),
    YEARS("Years", Duration.p(31556952)),
    DECADES("Decades", Duration.p(315569520)),
    CENTURIES("Centuries", Duration.p(3155695200L)),
    MILLENNIA("Millennia", Duration.p(31556952000L)),
    ERAS("Eras", Duration.p(31556952000000000L)),
    FOREVER("Forever", Duration.q(RecyclerView.FOREVER_NS, 999999999));
    
    private final String b;

    private ChronoUnit(String str, Duration duration) {
        this.b = str;
    }

    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.l(temporal2, this);
    }

    public boolean k() {
        return compareTo(DAYS) < 0;
    }

    public boolean o() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public Temporal p(Temporal temporal, long j) {
        return temporal.a(j, this);
    }

    public String toString() {
        return this.b;
    }
}
