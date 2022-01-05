package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import m0.n.a.a;
import m0.r.t.a.r.e.a.w.t;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class LazyJavaPackageFragmentProvider$getPackageFragment$1 extends Lambda implements a<LazyJavaPackageFragment> {
    public final /* synthetic */ LazyJavaPackageFragmentProvider c;
    public final /* synthetic */ t d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragmentProvider$getPackageFragment$1(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, t tVar) {
        super(0);
        this.c = lazyJavaPackageFragmentProvider;
        this.d = tVar;
    }

    public Object invoke() {
        return new LazyJavaPackageFragment(this.c.a, this.d);
    }
}
