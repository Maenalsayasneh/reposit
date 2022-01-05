package androidx.paging;

import h0.u.t;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: PagedList.kt */
public final class PagedList$removeWeakCallback$1 extends Lambda implements l<WeakReference<t.a>, Boolean> {
    public final /* synthetic */ t.a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedList$removeWeakCallback$1(t.a aVar) {
        super(1);
        this.c = aVar;
    }

    public Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        i.e(weakReference, "it");
        return Boolean.valueOf(weakReference.get() == null || ((t.a) weakReference.get()) == this.c);
    }
}
