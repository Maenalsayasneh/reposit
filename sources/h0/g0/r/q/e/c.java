package h0.g0.r.q.e;

import h0.g0.i;
import h0.g0.r.q.f.d;
import h0.g0.r.s.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController */
public abstract class c<T> implements h0.g0.r.q.a<T> {
    public final List<String> a = new ArrayList();
    public T b;
    public d<T> c;
    public a d;

    /* compiled from: ConstraintController */
    public interface a {
    }

    public c(d<T> dVar) {
        this.c = dVar;
    }

    public void a(T t) {
        this.b = t;
        e(this.d, t);
    }

    public abstract boolean b(o oVar);

    public abstract boolean c(T t);

    public void d(Iterable<o> iterable) {
        this.a.clear();
        for (o next : iterable) {
            if (b(next)) {
                this.a.add(next.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            d<T> dVar = this.c;
            synchronized (dVar.d) {
                if (dVar.e.add(this)) {
                    if (dVar.e.size() == 1) {
                        dVar.f = dVar.a();
                        i.c().a(d.a, String.format("%s: initial state = %s", new Object[]{dVar.getClass().getSimpleName(), dVar.f}), new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f);
                }
            }
        }
        e(this.d, this.b);
    }

    public final void e(a aVar, T t) {
        if (!this.a.isEmpty() && aVar != null) {
            if (t == null || c(t)) {
                List<String> list = this.a;
                h0.g0.r.q.d dVar = (h0.g0.r.q.d) aVar;
                synchronized (dVar.d) {
                    h0.g0.r.q.c cVar = dVar.b;
                    if (cVar != null) {
                        cVar.b(list);
                    }
                }
                return;
            }
            List<String> list2 = this.a;
            h0.g0.r.q.d dVar2 = (h0.g0.r.q.d) aVar;
            synchronized (dVar2.d) {
                ArrayList arrayList = new ArrayList();
                for (String next : list2) {
                    if (dVar2.a(next)) {
                        i.c().a(h0.g0.r.q.d.a, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                        arrayList.add(next);
                    }
                }
                h0.g0.r.q.c cVar2 = dVar2.b;
                if (cVar2 != null) {
                    cVar2.f(arrayList);
                }
            }
        }
    }
}
