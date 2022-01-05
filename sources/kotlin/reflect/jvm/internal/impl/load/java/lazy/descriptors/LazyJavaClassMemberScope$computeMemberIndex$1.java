package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.p;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$computeMemberIndex$1 extends Lambda implements l<p, Boolean> {
    public static final LazyJavaClassMemberScope$computeMemberIndex$1 c = new LazyJavaClassMemberScope$computeMemberIndex$1();

    public LazyJavaClassMemberScope$computeMemberIndex$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        p pVar = (p) obj;
        i.e(pVar, "it");
        return Boolean.valueOf(!pVar.P());
    }
}
