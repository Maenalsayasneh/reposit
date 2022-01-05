package i0.b.a.p0;

import java.util.List;

/* compiled from: PagedListModelCache.kt */
public final class e implements Runnable {
    public final /* synthetic */ f c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List q;

    public e(f fVar, List list, List list2) {
        this.c = fVar;
        this.d = list;
        this.q = list2;
    }

    public final void run() {
        f fVar = this.c;
        List list = this.d;
        List list2 = this.q;
        synchronized (fVar) {
            if (fVar.e.a() == list) {
                fVar.a.clear();
                fVar.a.addAll(list2);
            }
        }
    }
}
