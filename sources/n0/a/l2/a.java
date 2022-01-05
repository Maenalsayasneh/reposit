package n0.a.l2;

import i0.h.a.b.m.c;
import i0.h.a.b.m.g;
import i0.j.f.p.h;
import n0.a.m;

/* compiled from: Tasks.kt */
public final class a<TResult> implements c {
    public final /* synthetic */ m<T> c;

    public a(m<? super T> mVar) {
        this.c = mVar;
    }

    public final void onComplete(g<T> gVar) {
        Exception i = gVar.i();
        if (i != null) {
            this.c.resumeWith(h.l0(i));
        } else if (gVar.l()) {
            this.c.I((Throwable) null);
        } else {
            this.c.resumeWith(gVar.j());
        }
    }
}
