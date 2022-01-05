package h0.g0.r.q;

import android.content.Context;
import h0.g0.i;
import h0.g0.r.q.e.b;
import h0.g0.r.q.e.c;
import h0.g0.r.q.e.e;
import h0.g0.r.q.e.f;
import h0.g0.r.q.e.g;
import h0.g0.r.q.e.h;
import h0.g0.r.s.o;
import h0.g0.r.t.q.a;

/* compiled from: WorkConstraintsTracker */
public class d implements c.a {
    public static final String a = i.e("WorkConstraintsTracker");
    public final c b;
    public final c<?>[] c;
    public final Object d = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = cVar;
        this.c = new c[]{new h0.g0.r.q.e.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new h0.g0.r.q.e.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    public boolean a(String str) {
        synchronized (this.d) {
            for (c<?> cVar : this.c) {
                T t = cVar.b;
                if (t != null && cVar.c(t) && cVar.a.contains(str)) {
                    i.c().a(a, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(Iterable<o> iterable) {
        synchronized (this.d) {
            for (c<?> cVar : this.c) {
                if (cVar.d != null) {
                    cVar.d = null;
                    cVar.e((c.a) null, cVar.b);
                }
            }
            for (c<?> d2 : this.c) {
                d2.d(iterable);
            }
            for (c<?> cVar2 : this.c) {
                if (cVar2.d != this) {
                    cVar2.d = this;
                    cVar2.e(this, cVar2.b);
                }
            }
        }
    }

    public void c() {
        synchronized (this.d) {
            for (c<?> cVar : this.c) {
                if (!cVar.a.isEmpty()) {
                    cVar.a.clear();
                    cVar.c.b(cVar);
                }
            }
        }
    }
}
