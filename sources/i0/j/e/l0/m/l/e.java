package i0.j.e.l0.m.l;

import i0.j.e.l0.m.l.c;
import i0.j.e.l0.m.l.h;

/* compiled from: MicRecorder */
public class e implements Runnable {
    public final /* synthetic */ d c;
    public final /* synthetic */ Exception d;
    public final /* synthetic */ h.a q;

    public e(h.a aVar, d dVar, Exception exc) {
        this.q = aVar;
        this.c = dVar;
        this.d = exc;
    }

    public void run() {
        c.b bVar = this.q.a;
        if (bVar != null) {
            bVar.a(this.c, this.d);
        }
    }
}
