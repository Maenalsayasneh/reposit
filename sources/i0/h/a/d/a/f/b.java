package i0.h.a.d.a.f;

import i0.j.f.p.h;
import m0.n.b.i;
import n0.a.m;

/* compiled from: TaskUtils.kt */
public final class b implements i0.h.a.d.a.j.b {
    public final /* synthetic */ m a;

    public b(m mVar) {
        this.a = mVar;
    }

    public final void a(Exception exc) {
        m mVar = this.a;
        i.b(exc, "exception");
        mVar.resumeWith(h.l0(exc));
    }
}
