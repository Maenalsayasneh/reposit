package i0.h.a.a.i.s;

import com.google.android.datatransport.runtime.EventInternal;
import i0.h.a.a.g;
import i0.h.a.a.i.h;
import i0.h.a.a.i.m;
import i0.h.a.a.i.p.e;
import i0.h.a.a.i.s.h.q;
import i0.h.a.a.i.t.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler */
public class c implements e {
    public static final Logger a = Logger.getLogger(m.class.getName());
    public final q b;
    public final Executor c;
    public final e d;
    public final i0.h.a.a.i.s.i.c e;
    public final a f;

    public c(Executor executor, e eVar, q qVar, i0.h.a.a.i.s.i.c cVar, a aVar) {
        this.c = executor;
        this.d = eVar;
        this.b = qVar;
        this.e = cVar;
        this.f = aVar;
    }

    public void a(h hVar, EventInternal eventInternal, g gVar) {
        this.c.execute(new a(this, hVar, gVar, eventInternal));
    }
}
