package i0.h.a.d.a.b;

import android.os.RemoteException;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.e.o0;
import i0.h.a.d.a.j.m;

public final class d extends g {
    public final /* synthetic */ m Y1;
    public final /* synthetic */ n Z1;
    public final /* synthetic */ int d;
    public final /* synthetic */ String q;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(n nVar, m mVar, int i, String str, String str2, int i2, m mVar2) {
        super(mVar);
        this.Z1 = nVar;
        this.d = i;
        this.q = str;
        this.x = str2;
        this.y = i2;
        this.Y1 = mVar2;
    }

    public final void a() {
        try {
            n nVar = this.Z1;
            ((o0) nVar.e.l).h0(nVar.c, n.c(this.d, this.q, this.x, this.y), n.a(), new i(this.Z1, this.Y1, (char[]) null));
        } catch (RemoteException e) {
            n.a.a(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
