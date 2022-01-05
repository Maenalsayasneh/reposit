package i0.h.a.a.i.s.h;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import i0.h.a.a.i.u.a;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_SchedulerConfig */
public final class b extends SchedulerConfig {
    public final a a;
    public final Map<Priority, SchedulerConfig.a> b;

    public b(a aVar, Map<Priority, SchedulerConfig.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.b = map;
    }

    public a a() {
        return this.a;
    }

    public Map<Priority, SchedulerConfig.a> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.a.equals(schedulerConfig.a()) || !this.b.equals(schedulerConfig.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SchedulerConfig{clock=");
        P0.append(this.a);
        P0.append(", values=");
        P0.append(this.b);
        P0.append("}");
        return P0.toString();
    }
}
