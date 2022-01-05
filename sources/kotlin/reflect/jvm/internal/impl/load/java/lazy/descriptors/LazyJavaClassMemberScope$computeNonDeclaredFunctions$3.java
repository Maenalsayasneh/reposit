package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaClassMemberScope.kt */
public /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReference implements l<d, Collection<? extends g0>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1, lazyJavaClassMemberScope);
    }

    public final String getName() {
        return "searchMethodsByNameWithoutBuiltinMagic";
    }

    public final f getOwner() {
        return m.a(LazyJavaClassMemberScope.class);
    }

    public final String getSignature() {
        return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "p0");
        return LazyJavaClassMemberScope.v((LazyJavaClassMemberScope) this.receiver, dVar);
    }
}
