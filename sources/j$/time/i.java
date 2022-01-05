package j$.time;

import j$.com.android.tools.r8.a;
import j$.time.chrono.h;
import j$.time.chrono.j;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.d;
import j$.time.temporal.o;
import j$.time.temporal.s;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

public final class i implements o, Serializable {
    public static final i a = new i(0, 0, 0);
    private final int b;
    private final int c;
    private final int d;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(new s[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS}));
    }

    private i(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static i d(int i) {
        return (0 | i) == 0 ? a : new i(0, 0, i);
    }

    public Temporal a(Temporal temporal) {
        h hVar = (h) temporal.d(d.a);
        if (hVar == null || j.a.equals(hVar)) {
            int i = this.c;
            if (i == 0) {
                int i2 = this.b;
                if (i2 != 0) {
                    temporal = temporal.a((long) i2, ChronoUnit.YEARS);
                }
            } else {
                long j = (((long) this.b) * 12) + ((long) i);
                if (j != 0) {
                    temporal = temporal.a(j, ChronoUnit.MONTHS);
                }
            }
            int i3 = this.d;
            return i3 != 0 ? temporal.a((long) i3, ChronoUnit.DAYS) : temporal;
        }
        StringBuilder b2 = a.b("Chronology mismatch, expected: ISO, actual: ");
        b2.append(hVar.t());
        throw new c(b2.toString());
    }

    public int b() {
        return this.d;
    }

    public boolean c() {
        return this == a;
    }

    public long e() {
        return (((long) this.b) * 12) + ((long) this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.b == iVar.b && this.c == iVar.c && this.d == iVar.d;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.d, 16) + Integer.rotateLeft(this.c, 8) + this.b;
    }

    public String toString() {
        if (this == a) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
