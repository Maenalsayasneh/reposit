package i0.h.a.b.b;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class i implements Runnable {
    public final g c;

    public i(g gVar) {
        this.c = gVar;
    }

    public final void run() {
        g gVar = this.c;
        synchronized (gVar) {
            if (gVar.a == 1) {
                gVar.a(1, "Timed out while binding");
            }
        }
    }
}
