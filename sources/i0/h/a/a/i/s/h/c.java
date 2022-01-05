package i0.h.a.a.i.s.h;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
public final class c extends SchedulerConfig.a {
    public final long a;
    public final long b;
    public final Set<SchedulerConfig.Flag> c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    public static final class b extends SchedulerConfig.a.C0089a {
        public Long a;
        public Long b;
        public Set<SchedulerConfig.Flag> c;

        public SchedulerConfig.a a() {
            String str = this.a == null ? " delta" : "";
            if (this.b == null) {
                str = i0.d.a.a.a.n0(str, " maxAllowedDelay");
            }
            if (this.c == null) {
                str = i0.d.a.a.a.n0(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.a.longValue(), this.b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str));
        }

        public SchedulerConfig.a.C0089a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public SchedulerConfig.a.C0089a c(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public c(long j, long j2, Set set, a aVar) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public long b() {
        return this.a;
    }

    public Set<SchedulerConfig.Flag> c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.a)) {
            return false;
        }
        SchedulerConfig.a aVar = (SchedulerConfig.a) obj;
        if (this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ConfigValue{delta=");
        P0.append(this.a);
        P0.append(", maxAllowedDelay=");
        P0.append(this.b);
        P0.append(", flags=");
        P0.append(this.c);
        P0.append("}");
        return P0.toString();
    }
}
