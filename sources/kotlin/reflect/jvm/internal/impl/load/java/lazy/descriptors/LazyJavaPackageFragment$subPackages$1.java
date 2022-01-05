package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.g.b;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment$subPackages$1 extends Lambda implements a<List<? extends b>> {
    public final /* synthetic */ LazyJavaPackageFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$subPackages$1(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.c = lazyJavaPackageFragment;
    }

    public Object invoke() {
        Collection<t> y = this.c.Z1.y();
        ArrayList arrayList = new ArrayList(h.K(y, 10));
        for (t d : y) {
            arrayList.add(d.d());
        }
        return arrayList;
    }
}
