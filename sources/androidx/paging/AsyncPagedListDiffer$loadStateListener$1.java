package androidx.paging;

import h0.u.j;
import h0.u.t;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.p;

/* compiled from: AsyncPagedListDiffer.kt */
public final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements p<LoadType, j, i> {
    public AsyncPagedListDiffer$loadStateListener$1(t.b bVar) {
        super(2, bVar, t.b.class, "onStateChanged", "onStateChanged(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    public Object invoke(Object obj, Object obj2) {
        LoadType loadType = (LoadType) obj;
        j jVar = (j) obj2;
        m0.n.b.i.e(loadType, "p1");
        m0.n.b.i.e(jVar, "p2");
        ((t.b) this.receiver).a(loadType, jVar);
        return i.a;
    }
}
