package n0.a.g2.d0;

import m0.l.c;
import m0.l.e;
import m0.l.f.a.b;

/* compiled from: ChannelFlow.kt */
public final class p<T> implements c<T>, b {
    public final c<T> c;
    public final e d;

    public p(c<? super T> cVar, e eVar) {
        this.c = cVar;
        this.d = eVar;
    }

    public b getCallerFrame() {
        c<T> cVar = this.c;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public e getContext() {
        return this.d;
    }

    public void resumeWith(Object obj) {
        this.c.resumeWith(obj);
    }
}
