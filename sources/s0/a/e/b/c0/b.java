package s0.a.e.b.c0;

import s0.a.e.b.h;
import s0.a.e.b.n;
import s0.a.e.b.o;

public final class b implements n {
    public final /* synthetic */ c a;
    public final /* synthetic */ h b;

    public b(c cVar, h hVar) {
        this.a = cVar;
        this.b = hVar;
    }

    public o a(o oVar) {
        a aVar = oVar instanceof a ? (a) oVar : null;
        c cVar = this.a;
        if ((aVar == null || aVar.a != cVar || aVar.b == null) ? false : true) {
            return aVar;
        }
        h a2 = cVar.a().a(this.b);
        a aVar2 = new a();
        aVar2.a = this.a;
        aVar2.b = a2;
        return aVar2;
    }
}
