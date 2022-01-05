package n0.a;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobSupport;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.j2.b;
import n0.a.j2.c;

/* compiled from: CompletableDeferred.kt */
public final class w<T> extends JobSupport implements v<T>, b<T> {
    public w(f1 f1Var) {
        super(true);
        d0(f1Var);
    }

    public boolean G(Throwable th) {
        return f0(new z(th, false, 2));
    }

    public boolean H(T t) {
        return f0(t);
    }

    public <R> void d(c<? super R> cVar, p<? super T, ? super m0.l.c<? super R>, ? extends Object> pVar) {
        Object a0;
        do {
            a0 = a0();
            if (!cVar.i()) {
                if (!(a0 instanceof a1)) {
                    if (!cVar.e()) {
                        return;
                    }
                    if (a0 instanceof z) {
                        cVar.m(((z) a0).b);
                        return;
                    } else {
                        a.J3(pVar, j1.a(a0), cVar.j());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (n0(a0) != 0);
        cVar.q(q(false, true, new u1(cVar, pVar)));
    }

    public T i() {
        Object a0 = a0();
        if (!(!(a0 instanceof a1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(a0 instanceof z)) {
            return j1.a(a0);
        } else {
            throw ((z) a0).b;
        }
    }

    public Object w(m0.l.c<? super T> cVar) {
        Object a0;
        do {
            a0 = a0();
            if (!(a0 instanceof a1)) {
                if (!(a0 instanceof z)) {
                    return j1.a(a0);
                }
                throw ((z) a0).b;
            }
        } while (n0(a0) < 0);
        JobSupport.a aVar = new JobSupport.a(h.b2(cVar), this);
        aVar.q();
        aVar.p(new p0(q(false, true, new r1(aVar))));
        Object o = aVar.o();
        if (o == CoroutineSingletons.COROUTINE_SUSPENDED) {
            i.e(cVar, "frame");
        }
        return o;
    }
}
