package i0.h.a.d.a.a;

import android.os.RemoteException;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.j.m;

public final class l extends g {
    public final /* synthetic */ String d;
    public final /* synthetic */ m q;
    public final /* synthetic */ n x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(n nVar, m mVar, String str, m mVar2) {
        super(mVar);
        this.x = nVar;
        this.d = str;
        this.q = mVar2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [i0.h.a.d.a.a.m, i0.h.a.d.a.e.l0] */
    public final void a() {
        try {
            n nVar = this.x;
            nVar.c.l.w(nVar.d, n.a(nVar, this.d), new m(this.x, this.q, this.d));
        } catch (RemoteException e) {
            n.a.a(e, "requestUpdateInfo(%s)", this.d);
            this.q.a(new RuntimeException(e));
        }
    }
}
