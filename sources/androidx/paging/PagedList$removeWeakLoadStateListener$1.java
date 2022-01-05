package androidx.paging;

import h0.u.j;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: PagedList.kt */
public final class PagedList$removeWeakLoadStateListener$1 extends Lambda implements l<WeakReference<p<? super LoadType, ? super j, ? extends i>>, Boolean> {
    public final /* synthetic */ p c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedList$removeWeakLoadStateListener$1(p pVar) {
        super(1);
        this.c = pVar;
    }

    public Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        m0.n.b.i.e(weakReference, "it");
        return Boolean.valueOf(weakReference.get() == null || ((p) weakReference.get()) == this.c);
    }
}
