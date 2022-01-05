package i0.h.a.d.a.e;

public final class n extends g {
    public final /* synthetic */ o d;

    public n(o oVar) {
        this.d = oVar;
    }

    public final void a() {
        p pVar = this.d.a;
        pVar.c.b(4, "unlinkToDeath", new Object[0]);
        pVar.l.asBinder().unlinkToDeath(pVar.j, 0);
        p pVar2 = this.d.a;
        pVar2.l = null;
        pVar2.f = false;
    }
}
