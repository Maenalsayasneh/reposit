package i0.h.c.j;

import i0.h.c.q.b;

/* compiled from: ComponentRuntime */
public final /* synthetic */ class k implements Runnable {
    public final v c;
    public final b d;

    public k(v vVar, b bVar) {
        this.c = vVar;
        this.d = bVar;
    }

    public void run() {
        v vVar = this.c;
        b bVar = this.d;
        int i = m.a;
        synchronized (vVar) {
            if (vVar.b == null) {
                vVar.a.add(bVar);
            } else {
                vVar.b.add(bVar.get());
            }
        }
    }
}
