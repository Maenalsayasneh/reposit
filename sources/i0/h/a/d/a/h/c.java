package i0.h.a.d.a.h;

import android.os.RemoteException;
import i0.h.a.d.a.c.a;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.j.m;

public final class c extends g {
    public final /* synthetic */ m d;
    public final /* synthetic */ e q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar, m mVar, m mVar2) {
        super(mVar);
        this.q = eVar;
        this.d = mVar2;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [i0.h.a.d.a.h.d, i0.h.a.d.a.e.e] */
    public final void a() {
        try {
            e eVar = this.q;
            eVar.b.l.N(eVar.c, a.a("review"), new d(this.q, this.d));
        } catch (RemoteException e) {
            e.a.a(e, "error requesting in-app review for %s", this.q.c);
            this.d.a(new RuntimeException(e));
        }
    }
}
