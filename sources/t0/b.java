package t0;

import java.io.IOException;
import t0.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ i.b.a c;
    public final /* synthetic */ f d;
    public final /* synthetic */ v q;

    public /* synthetic */ b(i.b.a aVar, f fVar, v vVar) {
        this.c = aVar;
        this.d = fVar;
        this.q = vVar;
    }

    public final void run() {
        i.b.a aVar = this.c;
        f fVar = this.d;
        v vVar = this.q;
        if (i.b.this.d.isCanceled()) {
            fVar.onFailure(i.b.this, new IOException("Canceled"));
        } else {
            fVar.onResponse(i.b.this, vVar);
        }
    }
}
