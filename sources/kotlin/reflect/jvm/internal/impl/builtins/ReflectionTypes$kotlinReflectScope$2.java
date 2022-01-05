package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.a;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.u;

/* compiled from: ReflectionTypes.kt */
public final class ReflectionTypes$kotlinReflectScope$2 extends Lambda implements a<MemberScope> {
    public final /* synthetic */ u c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTypes$kotlinReflectScope$2(u uVar) {
        super(0);
        this.c = uVar;
    }

    public Object invoke() {
        return this.c.M(g.i).o();
    }
}
