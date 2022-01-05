package n0.a;

import kotlinx.coroutines.JobSupport;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

/* compiled from: AbstractCoroutine.kt */
public abstract class d<T> extends JobSupport implements f1, c<T>, f0 {
    public final e d;

    public d(e eVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            d0((f1) eVar.get(f1.a.c));
        }
        this.d = eVar.plus(this);
    }

    public e C() {
        return this.d;
    }

    public String Q() {
        return i.k(getClass().getSimpleName(), " was cancelled");
    }

    public boolean a() {
        return super.a();
    }

    public final void c0(Throwable th) {
        a.b2(this.d, th);
    }

    public final e getContext() {
        return this.d;
    }

    public String h0() {
        boolean z = c0.a;
        return super.h0();
    }

    public final void k0(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            u0(zVar.b, zVar.a());
            return;
        }
        v0(obj);
    }

    public final void resumeWith(Object obj) {
        Object g02 = g0(a.f4(obj, (l) null, 1));
        if (g02 != j1.b) {
            t0(g02);
        }
    }

    public void t0(Object obj) {
        D(obj);
    }

    public void u0(Throwable th, boolean z) {
    }

    public void v0(T t) {
    }
}
