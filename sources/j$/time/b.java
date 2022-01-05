package j$.time;

import java.io.Serializable;

public abstract class b {

    static final class a extends b implements Serializable {
        private final ZoneId a;

        a(ZoneId zoneId) {
            this.a = zoneId;
        }

        public ZoneId a() {
            return this.a;
        }

        public Instant b() {
            return Instant.P(System.currentTimeMillis());
        }

        public long c() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + 1;
        }

        public String toString() {
            StringBuilder b = j$.com.android.tools.r8.a.b("SystemClock[");
            b.append(this.a);
            b.append("]");
            return b.toString();
        }
    }

    protected b() {
    }

    public static b d() {
        return new a(ZoneId.systemDefault());
    }

    public static b e() {
        return new a(k.d);
    }

    public abstract ZoneId a();

    public abstract Instant b();

    public abstract long c();
}
