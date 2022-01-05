package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements l<MemberScope, Collection<? extends d>> {
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 c = new LazyJavaStaticClassScope$computePropertyNames$1$1();

    public LazyJavaStaticClassScope$computePropertyNames$1$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        MemberScope memberScope = (MemberScope) obj;
        i.e(memberScope, "it");
        return memberScope.d();
    }
}
