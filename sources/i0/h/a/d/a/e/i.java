package i0.h.a.d.a.e;

import com.google.android.play.core.internal.ar;
import i0.h.a.d.a.j.m;

public final class i extends g {
    public final /* synthetic */ g d;
    public final /* synthetic */ p q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(p pVar, m mVar, g gVar) {
        super(mVar);
        this.q = pVar;
        this.d = gVar;
    }

    public final void a() {
        p pVar = this.q;
        g gVar = this.d;
        if (pVar.l == null && !pVar.f) {
            pVar.c.b(4, "Initiate binding to the service.", new Object[0]);
            pVar.e.add(gVar);
            o oVar = new o(pVar);
            pVar.k = oVar;
            pVar.f = true;
            if (!pVar.b.bindService(pVar.g, oVar, 1)) {
                pVar.c.b(4, "Failed to bind to the service.", new Object[0]);
                pVar.f = false;
                for (g gVar2 : pVar.e) {
                    m<?> mVar = gVar2.c;
                    if (mVar != null) {
                        mVar.a(new ar());
                    }
                }
                pVar.e.clear();
            }
        } else if (pVar.f) {
            pVar.c.b(4, "Waiting to bind to the service.", new Object[0]);
            pVar.e.add(gVar);
        } else {
            gVar.run();
        }
    }
}
