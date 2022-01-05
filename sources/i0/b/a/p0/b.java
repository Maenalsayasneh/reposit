package i0.b.a.p0;

import java.util.concurrent.Executor;
import m0.n.b.i;

/* compiled from: PagedListModelCache.kt */
public final class b implements Executor {
    public final /* synthetic */ f c;

    public b(f fVar) {
        this.c = fVar;
    }

    public final void execute(Runnable runnable) {
        i.e(runnable, "runnable");
        this.c.j.post(runnable);
    }
}
