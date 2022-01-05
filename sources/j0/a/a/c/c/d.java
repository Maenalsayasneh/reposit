package j0.a.a.c.c;

import i0.e.b.y2;
import j0.a.b.b;

/* compiled from: ApplicationComponentManager */
public final class d implements b<Object> {
    public volatile Object c;
    public final Object d = new Object();
    public final e q;

    public d(e eVar) {
        this.q = eVar;
    }

    public Object U() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = ((y2.a) this.q).a();
                }
            }
        }
        return this.c;
    }
}
