package i0.h.a.d.a.j;

public final class e implements Runnable {
    public final /* synthetic */ p c;
    public final /* synthetic */ f d;

    public e(f fVar, p pVar) {
        this.d = fVar;
        this.c = pVar;
    }

    public final void run() {
        synchronized (this.d.b) {
            a<ResultT> aVar = this.d.c;
            if (aVar != null) {
                aVar.a(this.c);
            }
        }
    }
}
