package i0.h.a.b.m;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class o implements Runnable {
    public final /* synthetic */ p c;

    public o(p pVar) {
        this.c = pVar;
    }

    public final void run() {
        synchronized (this.c.b) {
            b bVar = this.c.c;
            if (bVar != null) {
                bVar.c();
            }
        }
    }
}
