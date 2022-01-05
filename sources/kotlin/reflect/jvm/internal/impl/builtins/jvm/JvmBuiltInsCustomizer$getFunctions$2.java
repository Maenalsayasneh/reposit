package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$getFunctions$2 extends Lambda implements l<MemberScope, Collection<? extends g0>> {
    public final /* synthetic */ d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getFunctions$2(d dVar) {
        super(1);
        this.c = dVar;
    }

    public Object invoke(Object obj) {
        MemberScope memberScope = (MemberScope) obj;
        i.e(memberScope, "it");
        return memberScope.a(this.c, NoLookupLocation.FROM_BUILTINS);
    }
}
