package androidx.paging;

import h0.u.j;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;

/* compiled from: PagedList.kt */
public final class PagedList$addWeakLoadStateListener$1 extends Lambda implements l<WeakReference<p<? super LoadType, ? super j, ? extends i>>, Boolean> {
    public static final PagedList$addWeakLoadStateListener$1 c = new PagedList$addWeakLoadStateListener$1();

    public PagedList$addWeakLoadStateListener$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        m0.n.b.i.e(weakReference, "it");
        return Boolean.valueOf(weakReference.get() == null);
    }
}
