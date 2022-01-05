package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import i0.h.a.a.i.s.h.c;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@AutoValue
public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a$a  reason: collision with other inner class name */
        public static abstract class C0089a {
            public abstract a a();

            public abstract C0089a b(long j);

            public abstract C0089a c(long j);
        }

        public static C0089a a() {
            c.b bVar = new c.b();
            Set<Flag> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.c = emptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<Flag> c();

        public abstract long d();
    }

    public abstract i0.h.a.a.i.u.a a();

    public long b(Priority priority, long j, int i) {
        long a2 = j - a().a();
        a aVar = c().get(priority);
        long b = aVar.b();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) b) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((b > 1 ? b : 2) * ((long) i2))))), a2), aVar.d());
    }

    public abstract Map<Priority, a> c();
}
