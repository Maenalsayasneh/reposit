package i0.h.a.b.m;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public final class s implements Runnable {
    public final /* synthetic */ g c;
    public final /* synthetic */ t d;

    public s(t tVar, g gVar) {
        this.d = tVar;
        this.c = gVar;
    }

    public final void run() {
        synchronized (this.d.b) {
            d dVar = this.d.c;
            if (dVar != null) {
                Exception i = this.c.i();
                Objects.requireNonNull(i, "null reference");
                dVar.a(i);
            }
        }
    }
}
