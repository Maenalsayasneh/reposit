package i0.h.a.b.m;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class v implements Runnable {
    public final /* synthetic */ g c;
    public final /* synthetic */ u d;

    public v(u uVar, g gVar) {
        this.d = uVar;
        this.c = gVar;
    }

    public final void run() {
        synchronized (this.d.b) {
            e<? super TResult> eVar = this.d.c;
            if (eVar != null) {
                eVar.onSuccess(this.c.j());
            }
        }
    }
}
