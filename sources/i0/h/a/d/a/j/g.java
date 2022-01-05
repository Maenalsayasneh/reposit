package i0.h.a.d.a.j;

public final class g implements Runnable {
    public final /* synthetic */ p c;
    public final /* synthetic */ h d;

    public g(h hVar, p pVar) {
        this.d = hVar;
        this.c = pVar;
    }

    public final void run() {
        synchronized (this.d.b) {
            b bVar = this.d.c;
            if (bVar != null) {
                bVar.a(this.c.g());
            }
        }
    }
}
