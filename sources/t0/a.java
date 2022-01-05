package t0;

import t0.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ i.b.a c;
    public final /* synthetic */ f d;
    public final /* synthetic */ Throwable q;

    public /* synthetic */ a(i.b.a aVar, f fVar, Throwable th) {
        this.c = aVar;
        this.d = fVar;
        this.q = th;
    }

    public final void run() {
        i.b.a aVar = this.c;
        this.d.onFailure(i.b.this, this.q);
    }
}
