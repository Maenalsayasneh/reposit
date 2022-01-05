package n0.a;

import kotlinx.coroutines.JobSupport;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;

/* compiled from: JobSupport.kt */
public final class u1<T, R> extends i1 {
    public final p<T, c<? super R>, Object> Y1;
    public final n0.a.j2.c<R> y;

    public u1(n0.a.j2.c<? super R> cVar, p<? super T, ? super c<? super R>, ? extends Object> pVar) {
        this.y = cVar;
        this.Y1 = pVar;
    }

    public void H(Throwable th) {
        if (this.y.e()) {
            JobSupport J = J();
            n0.a.j2.c<R> cVar = this.y;
            p<T, c<? super R>, Object> pVar = this.Y1;
            Object a0 = J.a0();
            if (a0 instanceof z) {
                cVar.m(((z) a0).b);
            } else {
                a.I3(pVar, j1.a(a0), cVar.j(), (l) null, 4);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        H((Throwable) obj);
        return i.a;
    }
}
