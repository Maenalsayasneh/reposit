package i0.b.a.p0;

import java.util.Collections;

/* compiled from: PagedListModelCache.kt */
public final class d implements Runnable {
    public final /* synthetic */ f c;

    public d(f fVar) {
        this.c = fVar;
    }

    public final void run() {
        f fVar = this.c;
        synchronized (fVar) {
            Collections.fill(fVar.a, (Object) null);
        }
    }
}
