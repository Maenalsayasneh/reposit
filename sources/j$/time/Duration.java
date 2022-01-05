package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.j;
import j$.time.temporal.o;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

public final class Duration implements o, Comparable<Duration>, Serializable {
    public static final Duration a = new Duration(0, 0);
    private static final BigInteger b = BigInteger.valueOf(1000000000);
    private final long c;
    private final int d;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j, int i) {
        this.c = j;
        this.d = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return o(temporal.l(temporal2, ChronoUnit.NANOS));
        } catch (c | ArithmeticException unused) {
            long l = temporal.l(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j jVar = j.NANO_OF_SECOND;
                long g = temporal2.g(jVar) - temporal.g(jVar);
                int i = (l > 0 ? 1 : (l == 0 ? 0 : -1));
                if (i > 0 && g < 0) {
                    l++;
                } else if (i < 0 && g > 0) {
                    l--;
                }
                j = g;
            } catch (c unused2) {
            }
            return q(l, j);
        }
    }

    private static Duration k(long j, int i) {
        return (((long) i) | j) == 0 ? a : new Duration(j, i);
    }

    public static Duration o(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return k(j2, i);
    }

    public static Duration ofDays(long j) {
        return k(Math.multiplyExact(j, 86400), 0);
    }

    public static Duration ofHours(long j) {
        return k(Math.multiplyExact(j, 3600), 0);
    }

    public static Duration ofMinutes(long j) {
        return k(Math.multiplyExact(j, 60), 0);
    }

    public static Duration p(long j) {
        return k(j, 0);
    }

    public static Duration q(long j, long j2) {
        return k(Math.addExact(j, Math.floorDiv(j2, 1000000000)), (int) Math.floorMod(j2, 1000000000));
    }

    public Duration abs() {
        long j = this.c;
        if (!(j < 0)) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(j).add(BigDecimal.valueOf((long) this.d, 9)).multiply(BigDecimal.valueOf(-1)).movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(b);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return q(divideAndRemainder[0].longValue(), (long) divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    public int compareTo(Duration duration) {
        int compare = Long.compare(this.c, duration.c);
        return compare != 0 ? compare : this.d - duration.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.c == duration.c && this.d == duration.d;
    }

    public long getSeconds() {
        return this.c;
    }

    public int hashCode() {
        long j = this.c;
        return (this.d * 51) + ((int) (j ^ (j >>> 32)));
    }

    public long toDays() {
        return this.c / 86400;
    }

    public long toHours() {
        return this.c / 3600;
    }

    public long toMillis() {
        return Math.addExact(Math.multiplyExact(this.c, 1000), (long) (this.d / 1000000));
    }

    public long toMinutes() {
        return this.c / 60;
    }

    public String toString() {
        if (this == a) {
            return "PT0S";
        }
        long j = this.c;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.d == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.d <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.d > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - ((long) this.d));
            } else {
                sb.append(((long) this.d) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
