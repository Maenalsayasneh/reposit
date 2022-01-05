package i0.h.a.b.d;

import i0.h.a.b.d.a;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class f implements e<T> {
    public final /* synthetic */ a a;

    public f(a aVar) {
        this.a = aVar;
    }

    public final void a(T t) {
        a aVar = this.a;
        aVar.a = t;
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            ((a.C0135a) it.next()).a(this.a.a);
        }
        this.a.c.clear();
        this.a.b = null;
    }
}
