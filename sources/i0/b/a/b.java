package i0.b.a;

import h0.v.a.g;
import i0.b.a.c;
import java.util.List;

/* compiled from: AsyncEpoxyDiffer */
public class b implements Runnable {
    public final /* synthetic */ c.b c;
    public final /* synthetic */ int d;
    public final /* synthetic */ List q;
    public final /* synthetic */ List x;
    public final /* synthetic */ c y;

    public b(c cVar, c.b bVar, int i, List list, List list2) {
        this.y = cVar;
        this.c = bVar;
        this.d = i;
        this.q = list;
        this.x = list2;
    }

    public void run() {
        g.d a = g.a(this.c, true);
        c cVar = this.y;
        int i = this.d;
        List list = this.q;
        cVar.b(i, list, new l(this.x, list, a));
    }
}
