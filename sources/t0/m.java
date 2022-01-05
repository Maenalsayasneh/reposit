package t0;

import i0.j.f.p.h;
import m0.l.c;

/* compiled from: KotlinExtensions.kt */
public final class m implements Runnable {
    public final /* synthetic */ c c;
    public final /* synthetic */ Exception d;

    public m(c cVar, Exception exc) {
        this.c = cVar;
        this.d = exc;
    }

    public final void run() {
        h.b2(this.c).resumeWith(h.l0(this.d));
    }
}
