package m0.r.t.a.r.e.b;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i0;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
public final class k implements h0 {
    public final LazyJavaPackageFragment b;

    public k(LazyJavaPackageFragment lazyJavaPackageFragment) {
        i.e(lazyJavaPackageFragment, "packageFragment");
        this.b = lazyJavaPackageFragment;
    }

    public i0 a() {
        i0 i0Var = i0.a;
        i.d(i0Var, "NO_SOURCE_FILE");
        return i0Var;
    }

    public String toString() {
        return this.b + ": " + this.b.B0().keySet();
    }
}
