package i0.h.c.p;

import android.util.Pair;
import i0.h.a.b.m.a;
import i0.h.a.b.m.g;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final /* synthetic */ class q implements a {
    public final r a;
    public final Pair b;

    public q(r rVar, Pair pair) {
        this.a = rVar;
        this.b = pair;
    }

    public Object a(g gVar) {
        r rVar = this.a;
        Pair pair = this.b;
        synchronized (rVar) {
            rVar.b.remove(pair);
        }
        return gVar;
    }
}
