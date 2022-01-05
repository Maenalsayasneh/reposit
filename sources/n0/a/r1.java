package n0.a;

import i0.j.f.p.h;
import m0.i;

/* compiled from: JobSupport.kt */
public final class r1<T> extends i1 {
    public final n<T> y;

    public r1(n<? super T> nVar) {
        this.y = nVar;
    }

    public void H(Throwable th) {
        Object a0 = J().a0();
        if (a0 instanceof z) {
            this.y.resumeWith(h.l0(((z) a0).b));
        } else {
            this.y.resumeWith(j1.a(a0));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        H((Throwable) obj);
        return i.a;
    }
}
