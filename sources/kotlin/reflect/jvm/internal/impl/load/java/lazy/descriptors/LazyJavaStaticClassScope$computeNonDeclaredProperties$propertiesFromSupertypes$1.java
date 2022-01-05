package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.g.d;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 extends Lambda implements l<MemberScope, Collection<? extends c0>> {
    public final /* synthetic */ d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(d dVar) {
        super(1);
        this.c = dVar;
    }

    public Object invoke(Object obj) {
        MemberScope memberScope = (MemberScope) obj;
        i.e(memberScope, "it");
        return memberScope.c(this.c, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }
}
