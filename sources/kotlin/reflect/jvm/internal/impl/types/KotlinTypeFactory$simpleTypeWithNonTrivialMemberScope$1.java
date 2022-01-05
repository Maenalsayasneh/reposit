package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: KotlinTypeFactory.kt */
public final class KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1 extends Lambda implements l<e, a0> {
    public final /* synthetic */ j0 c;
    public final /* synthetic */ List<m0> d;
    public final /* synthetic */ f q;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ MemberScope y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(KotlinTypeFactory kotlinTypeFactory, j0 j0Var, List<? extends m0> list, f fVar, boolean z, MemberScope memberScope) {
        super(1);
        this.c = j0Var;
        this.d = list;
        this.q = fVar;
        this.x = z;
        this.y = memberScope;
    }

    public Object invoke(Object obj) {
        e eVar = (e) obj;
        i.e(eVar, "kotlinTypeRefiner");
        KotlinTypeFactory.a a = KotlinTypeFactory.a(KotlinTypeFactory.a, this.c, eVar, this.d);
        if (a == null) {
            return null;
        }
        a0 a0Var = a.a;
        if (a0Var != null) {
            return a0Var;
        }
        f fVar = this.q;
        j0 j0Var = a.b;
        i.c(j0Var);
        return KotlinTypeFactory.h(fVar, j0Var, this.d, this.x, this.y);
    }
}
