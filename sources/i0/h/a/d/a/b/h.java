package i0.h.a.d.a.b;

import android.os.RemoteException;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.e.o0;
import i0.h.a.d.a.j.m;

public final class h extends g {
    public final /* synthetic */ m d;
    public final /* synthetic */ n q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(n nVar, m mVar, m mVar2) {
        super(mVar);
        this.q = nVar;
        this.d = mVar2;
    }

    public final void a() {
        try {
            n nVar = this.q;
            ((o0) nVar.f.l).C(nVar.c, n.a(), new l(this.q, this.d));
        } catch (RemoteException e) {
            n.a.a(e, "keepAlive", new Object[0]);
        }
    }
}
