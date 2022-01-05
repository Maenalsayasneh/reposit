package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.a;
import m0.r.t.a.r.e.b.j;

/* compiled from: JvmPackageScope.kt */
public final class JvmPackageScope$kotlinScopes$2 extends Lambda implements a<MemberScope[]> {
    public final /* synthetic */ JvmPackageScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmPackageScope$kotlinScopes$2(JvmPackageScope jvmPackageScope) {
        super(0);
        this.c = jvmPackageScope;
    }

    public Object invoke() {
        Collection<j> values = this.c.d.B0().values();
        JvmPackageScope jvmPackageScope = this.c;
        ArrayList arrayList = new ArrayList();
        for (j a : values) {
            MemberScope a2 = jvmPackageScope.c.a.d.a(jvmPackageScope.d, a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        Object[] array = m0.r.t.a.r.m.a1.a.G2(arrayList).toArray(new MemberScope[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (MemberScope[]) array;
    }
}
