package h0.g0.r;

import h0.g0.k;
import h0.g0.r.t.p.a;
import h0.q.y;

/* compiled from: OperationImpl */
public class c implements k {
    public final y<k.b> c = new y<>();
    public final a<k.b.c> d = new a<>();

    public c() {
        a(k.b);
    }

    public void a(k.b bVar) {
        this.c.postValue(bVar);
        if (bVar instanceof k.b.c) {
            this.d.j((k.b.c) bVar);
        } else if (bVar instanceof k.b.a) {
            this.d.k(((k.b.a) bVar).a);
        }
    }
}
