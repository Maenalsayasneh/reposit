package i0.h.a.a.i.s;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import i0.h.a.a.i.s.h.b;
import i0.h.a.a.i.s.h.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import l0.a.a;

/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class f implements a {
    public final a<i0.h.a.a.i.u.a> a;

    public f(a<i0.h.a.a.i.u.a> aVar) {
        this.a = aVar;
    }

    public Object get() {
        i0.h.a.a.i.u.a aVar = this.a.get();
        HashMap hashMap = new HashMap();
        Priority priority = Priority.DEFAULT;
        SchedulerConfig.a.C0089a a2 = SchedulerConfig.a.a();
        a2.b(30000);
        a2.c(86400000);
        hashMap.put(priority, a2.a());
        Priority priority2 = Priority.HIGHEST;
        SchedulerConfig.a.C0089a a3 = SchedulerConfig.a.a();
        a3.b(1000);
        a3.c(86400000);
        hashMap.put(priority2, a3.a());
        Priority priority3 = Priority.VERY_LOW;
        SchedulerConfig.a.C0089a a4 = SchedulerConfig.a.a();
        a4.b(86400000);
        a4.c(86400000);
        Set<SchedulerConfig.Flag> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new SchedulerConfig.Flag[]{SchedulerConfig.Flag.NETWORK_UNMETERED, SchedulerConfig.Flag.DEVICE_IDLE})));
        c.b bVar = (c.b) a4;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        bVar.c = unmodifiableSet;
        hashMap.put(priority3, bVar.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        int size = hashMap.keySet().size();
        Priority.values();
        if (size >= 3) {
            new HashMap();
            return new b(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
