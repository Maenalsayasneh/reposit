package i0.j.e.v0.e.j;

import i0.j.e.t0.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k0.b.y.e;

/* compiled from: AttributesRepository */
public class o implements e<List<g>, List<g>> {
    public final /* synthetic */ String c;
    public final /* synthetic */ q d;

    public o(q qVar, String str) {
        this.d = qVar;
        this.c = str;
    }

    public Object apply(Object obj) throws Exception {
        q qVar = this.d;
        String str = this.c;
        Objects.requireNonNull(qVar);
        ArrayList arrayList = new ArrayList();
        for (g gVar : (List) obj) {
            arrayList.add(new g(gVar.b, gVar.c, str, false, 1, (g.a) null));
        }
        return arrayList;
    }
}
