package h0.i.f;

import h0.i.b.d.h;
import h0.i.c.e;

/* compiled from: CallbackWithHandler */
public class b implements Runnable {
    public final /* synthetic */ m c;
    public final /* synthetic */ int d;

    public b(c cVar, m mVar, int i) {
        this.c = mVar;
        this.d = i;
    }

    public void run() {
        m mVar = this.c;
        int i = this.d;
        h.a aVar = ((e.a) mVar).a;
        if (aVar != null) {
            aVar.d(i);
        }
    }
}
