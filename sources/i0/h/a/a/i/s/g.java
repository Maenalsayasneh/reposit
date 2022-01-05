package i0.h.a.a.i.s;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import i0.h.a.a.i.s.h.d;
import i0.h.a.a.i.s.i.c;
import l0.a.a;

/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class g implements a {
    public final a<Context> a;
    public final a<c> b;
    public final a<SchedulerConfig> c;
    public final a<i0.h.a.a.i.u.a> d;

    public g(a<Context> aVar, a<c> aVar2, a<SchedulerConfig> aVar3, a<i0.h.a.a.i.u.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public Object get() {
        i0.h.a.a.i.u.a aVar = this.d.get();
        return new d(this.a.get(), this.b.get(), this.c.get());
    }
}
