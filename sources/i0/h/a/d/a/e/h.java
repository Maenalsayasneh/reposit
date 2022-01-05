package i0.h.a.d.a.e;

import android.os.IBinder;
import android.os.RemoteException;
import i0.h.a.d.a.j.m;

public final /* synthetic */ class h implements IBinder.DeathRecipient {
    public final p a;

    public h(p pVar) {
        this.a = pVar;
    }

    public final void binderDied() {
        p pVar = this.a;
        pVar.c.b(4, "reportBinderDeath", new Object[0]);
        k kVar = (k) pVar.i.get();
        if (kVar == null) {
            pVar.c.b(4, "%s : Binder has died.", new Object[]{pVar.d});
            for (g gVar : pVar.e) {
                m<?> mVar = gVar.c;
                if (mVar != null) {
                    mVar.a(new RemoteException(String.valueOf(pVar.d).concat(" : Binder has died.")));
                }
            }
            pVar.e.clear();
            return;
        }
        pVar.c.b(4, "calling onBinderDied", new Object[0]);
        kVar.a();
    }
}
