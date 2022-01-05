package m0.r.t.a.r.m;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.r.t.a.r.m.x0.e;

/* compiled from: ErrorType.kt */
public final class u0 extends o {
    public final String Z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(String str, j0 j0Var, MemberScope memberScope, List<? extends m0> list, boolean z) {
        super(j0Var, memberScope, list, z, (String) null, 16);
        i.e(str, "presentableName");
        i.e(j0Var, "constructor");
        i.e(memberScope, "memberScope");
        i.e(list, "arguments");
        this.Z1 = str;
    }

    public v K0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public v0 N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: P0 */
    public a0 M0(boolean z) {
        return new u0(this.Z1, this.d, this.q, this.x, z);
    }

    public String R0() {
        return this.Z1;
    }

    public o S0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }
}
