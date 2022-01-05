package i0.h.a.b.c.g.j;

import i0.h.a.b.c.g.a;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class v implements Runnable {
    public final /* synthetic */ u c;

    public v(u uVar) {
        this.c = uVar;
    }

    public final void run() {
        a.f fVar = this.c.a.b;
        fVar.c(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
