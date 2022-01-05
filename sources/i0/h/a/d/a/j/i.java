package i0.h.a.d.a.j;

public final class i implements Runnable {
    public final /* synthetic */ p c;
    public final /* synthetic */ j d;

    public i(j jVar, p pVar) {
        this.d = jVar;
        this.c = pVar;
    }

    public final void run() {
        synchronized (this.d.b) {
            c<? super ResultT> cVar = this.d.c;
            if (cVar != null) {
                cVar.onSuccess(this.c.h());
            }
        }
    }
}
