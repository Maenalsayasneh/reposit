package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.c;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class IntegerLiteralTypeConstructor implements j0 {
    public final long a;
    public final u b;
    public final Set<v> c;
    public final a0 d = KotlinTypeFactory.d(f.a.b, this, false);
    public final c e = h.H2(new IntegerLiteralTypeConstructor$supertypes$2(this));

    public IntegerLiteralTypeConstructor(long j, u uVar, Set<? extends v> set) {
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        Objects.requireNonNull(f.i);
        this.a = j;
        this.b = uVar;
        this.c = set;
    }

    public j0 a(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public Collection<v> b() {
        return (List) this.e.getValue();
    }

    public m0.r.t.a.r.c.f c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public final boolean f(j0 j0Var) {
        i.e(j0Var, "constructor");
        Set<v> set = this.c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (v I0 : set) {
                if (i.a(I0.I0(), j0Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<m0> getParameters() {
        return EmptyList.c;
    }

    public m0.r.t.a.r.b.f m() {
        return this.b.m();
    }

    public String toString() {
        StringBuilder N0 = a.N0('[');
        N0.append(g.E(this.c, InstabugDbContract.COMMA_SEP, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, IntegerLiteralTypeConstructor$valueToString$1.c, 30));
        N0.append(']');
        return i.k("IntegerLiteralType", N0.toString());
    }
}
