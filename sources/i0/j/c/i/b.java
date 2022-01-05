package i0.j.c.i;

import i0.j.c.g.a;
import k0.b.y.d;

/* compiled from: ExternalScreenRecordHelper */
public class b implements d<a> {
    public final /* synthetic */ String c;
    public final /* synthetic */ c d;

    public b(c cVar, String str) {
        this.d = cVar;
        this.c = str;
    }

    public void b(Object obj) throws Exception {
        a aVar = (a) obj;
        if (this.c.equalsIgnoreCase(aVar.a)) {
            this.d.b = aVar.b;
        }
    }
}
