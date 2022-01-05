package i0.h.a.d.a.b;

import android.os.RemoteException;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.e.o0;
import i0.h.a.d.a.j.m;
import java.util.Map;

public final class c extends g {
    public final /* synthetic */ Map d;
    public final /* synthetic */ m q;
    public final /* synthetic */ n x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(n nVar, m mVar, Map map, m mVar2) {
        super(mVar);
        this.x = nVar;
        this.d = map;
        this.q = mVar2;
    }

    public final void a() {
        try {
            n nVar = this.x;
            ((o0) nVar.e.l).e0(nVar.c, n.b(this.d), new k(this.x, this.q));
        } catch (RemoteException e) {
            n.a.a(e, "syncPacks", new Object[0]);
            this.q.a(new RuntimeException(e));
        }
    }
}
