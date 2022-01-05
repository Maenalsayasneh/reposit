package i0.b.a.p0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.airbnb.epoxy.paging3.PagedListModelCache$updateCallback$1;
import h0.v.a.c;
import h0.v.a.g;
import i0.b.a.t;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import m0.i;
import m0.n.a.a;
import m0.n.a.p;

/* compiled from: PagedListModelCache.kt */
public final class f<T> {
    public final ArrayList<t<?>> a;
    public Integer b;
    public boolean c;
    public final PagedListModelCache$updateCallback$1 d;
    @SuppressLint({"RestrictedApi"})
    public final c e;
    public final p<Integer, T, t<?>> f;
    public final a<i> g;
    public final g.e<T> h;
    public final Executor i = null;
    public final Handler j;

    public f(p pVar, a aVar, g.e eVar, Executor executor, Handler handler, int i2) {
        int i3 = i2 & 8;
        m0.n.b.i.e(pVar, "modelBuilder");
        m0.n.b.i.e(aVar, "rebuildCallback");
        m0.n.b.i.e(eVar, "itemDiffCallback");
        m0.n.b.i.e(handler, "modelBuildingHandler");
        this.f = pVar;
        this.g = aVar;
        this.h = eVar;
        this.j = handler;
        this.a = new ArrayList<>();
        PagedListModelCache$updateCallback$1 pagedListModelCache$updateCallback$1 = new PagedListModelCache$updateCallback$1(this);
        this.d = pagedListModelCache$updateCallback$1;
        c.a aVar2 = new c.a(eVar);
        aVar2.c = new b(this);
        if (aVar2.d == null) {
            synchronized (c.a.a) {
                if (c.a.b == null) {
                    c.a.b = Executors.newFixedThreadPool(2);
                }
            }
            aVar2.d = c.a.b;
        }
        c cVar = new c(aVar2.c, aVar2.d, eVar);
        m0.n.b.i.d(cVar, "AsyncDifferConfig.Builde…      }\n        }.build()");
        this.e = new c(this, pagedListModelCache$updateCallback$1, cVar);
    }

    public static final void a(f fVar) {
        if (!(fVar.c || m0.n.b.i.a(Looper.myLooper(), fVar.j.getLooper()))) {
            throw new IllegalArgumentException("The notify executor for your PagedList must use the same thread as the model building handler set in PagedListEpoxyController.modelBuildingHandler".toString());
        }
    }
}
