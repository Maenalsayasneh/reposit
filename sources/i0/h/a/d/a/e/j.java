package i0.h.a.d.a.e;

public final class j extends g {
    public final /* synthetic */ p d;

    public j(p pVar) {
        this.d = pVar;
    }

    public final void a() {
        p pVar = this.d;
        if (pVar.l != null) {
            pVar.c.b(4, "Unbind from service.", new Object[0]);
            p pVar2 = this.d;
            pVar2.b.unbindService(pVar2.k);
            p pVar3 = this.d;
            pVar3.f = false;
            pVar3.l = null;
            pVar3.k = null;
        }
    }
}
