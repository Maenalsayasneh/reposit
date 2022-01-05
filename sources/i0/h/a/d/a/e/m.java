package i0.h.a.d.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class m extends g {
    public final /* synthetic */ IBinder d;
    public final /* synthetic */ o q;

    public m(o oVar, IBinder iBinder) {
        this.q = oVar;
        this.d = iBinder;
    }

    public final void a() {
        p pVar = this.q.a;
        pVar.l = (IInterface) pVar.h.a(this.d);
        p pVar2 = this.q.a;
        pVar2.c.b(4, "linkToDeath", new Object[0]);
        try {
            pVar2.l.asBinder().linkToDeath(pVar2.j, 0);
        } catch (RemoteException e) {
            pVar2.c.a(e, "linkToDeath failed", new Object[0]);
        }
        p pVar3 = this.q.a;
        pVar3.f = false;
        for (g run : pVar3.e) {
            run.run();
        }
        this.q.a.e.clear();
    }
}
