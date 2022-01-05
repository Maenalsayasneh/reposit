package m0.r.t.a.r.m;

import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.x0.e;

/* compiled from: ErrorType.kt */
public class o extends a0 {
    public final String Y1;
    public final j0 d;
    public final MemberScope q;
    public final List<m0> x;
    public final boolean y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(j0 j0Var, MemberScope memberScope) {
        this(j0Var, memberScope, (List) null, false, (String) null, 28);
        i.e(j0Var, "constructor");
        i.e(memberScope, "memberScope");
    }

    public o(j0 j0Var, MemberScope memberScope, List<m0> list, boolean z, String str, int i) {
        list = (i & 4) != 0 ? EmptyList.c : list;
        z = (i & 8) != 0 ? false : z;
        String str2 = (i & 16) != 0 ? "???" : null;
        i.e(j0Var, "constructor");
        i.e(memberScope, "memberScope");
        i.e(list, "arguments");
        i.e(str2, "presentableName");
        this.d = j0Var;
        this.q = memberScope;
        this.x = list;
        this.y = z;
        this.Y1 = str2;
    }

    public List<m0> H0() {
        return this.x;
    }

    public j0 I0() {
        return this.d;
    }

    public boolean J0() {
        return this.y;
    }

    public v0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return this;
    }

    public a0 P0(boolean z) {
        return new o(this.d, this.q, this.x, z, (String) null, 16);
    }

    public a0 Q0(f fVar) {
        i.e(fVar, "newAnnotations");
        return this;
    }

    public String R0() {
        return this.Y1;
    }

    /* renamed from: S0 */
    public o N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public f getAnnotations() {
        Objects.requireNonNull(f.i);
        return f.a.b;
    }

    public MemberScope o() {
        return this.q;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        if (this.x.isEmpty()) {
            str = "";
        } else {
            str = g.D(this.x, ", ", "<", ">", -1, "...", (l) null);
        }
        sb.append(str);
        return sb.toString();
    }
}
