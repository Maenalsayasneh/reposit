package i0.h.a.d.a.b;

import android.os.Bundle;
import android.os.RemoteException;
import i0.h.a.d.a.e.g;
import i0.h.a.d.a.e.o0;
import i0.h.a.d.a.j.m;

public final class f extends g {
    public final /* synthetic */ int d;
    public final /* synthetic */ m q;
    public final /* synthetic */ n x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(n nVar, m mVar, int i, m mVar2) {
        super(mVar);
        this.x = nVar;
        this.d = i;
        this.q = mVar2;
    }

    public final void a() {
        try {
            n nVar = this.x;
            String str = nVar.c;
            int i = this.d;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            ((o0) nVar.e.l).t(str, bundle, n.a(), new i(this.x, this.q, (int[]) null));
        } catch (RemoteException e) {
            n.a.a(e, "notifySessionFailed", new Object[0]);
        }
    }
}
