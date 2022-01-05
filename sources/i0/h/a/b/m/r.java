package i0.h.a.b.m;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class r implements Runnable {
    public final /* synthetic */ g c;
    public final /* synthetic */ q d;

    public r(q qVar, g gVar) {
        this.d = qVar;
        this.c = gVar;
    }

    public final void run() {
        synchronized (this.d.b) {
            c<TResult> cVar = this.d.c;
            if (cVar != null) {
                cVar.onComplete(this.c);
            }
        }
    }
}
