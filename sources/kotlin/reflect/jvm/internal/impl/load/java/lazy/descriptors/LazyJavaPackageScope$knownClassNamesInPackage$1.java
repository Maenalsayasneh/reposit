package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.e.a.u.c;

/* compiled from: LazyJavaPackageScope.kt */
public final class LazyJavaPackageScope$knownClassNamesInPackage$1 extends Lambda implements a<Set<? extends String>> {
    public final /* synthetic */ c c;
    public final /* synthetic */ LazyJavaPackageScope d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$knownClassNamesInPackage$1(c cVar, LazyJavaPackageScope lazyJavaPackageScope) {
        super(0);
        this.c = cVar;
        this.d = lazyJavaPackageScope;
    }

    public Object invoke() {
        return this.c.a.b.c(this.d.o.y);
    }
}
