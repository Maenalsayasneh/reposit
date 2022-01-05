package kotlin.reflect.jvm.internal.impl.types.checker;

import i0.j.f.p.h;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import m0.c;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.j.o.a.b;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor implements b {
    public final m0 a;
    public a<? extends List<? extends v0>> b;
    public final NewCapturedTypeConstructor c;
    public final m0.r.t.a.r.c.m0 d;
    public final c e;

    public NewCapturedTypeConstructor(m0 m0Var, a<? extends List<? extends v0>> aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, m0.r.t.a.r.c.m0 m0Var2) {
        i.e(m0Var, "projection");
        this.a = m0Var;
        this.b = aVar;
        this.c = newCapturedTypeConstructor;
        this.d = m0Var2;
        this.e = h.G2(LazyThreadSafetyMode.PUBLICATION, new NewCapturedTypeConstructor$_supertypes$2(this));
    }

    public Collection b() {
        List list = (List) this.e.getValue();
        return list == null ? EmptyList.c : list;
    }

    public f c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public m0 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.a(NewCapturedTypeConstructor.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.c;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        if (newCapturedTypeConstructor2 == newCapturedTypeConstructor) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public NewCapturedTypeConstructor a(e eVar) {
        NewCapturedTypeConstructor$refine$1$1 newCapturedTypeConstructor$refine$1$1;
        i.e(eVar, "kotlinTypeRefiner");
        m0 a2 = this.a.a(eVar);
        i.d(a2, "projection.refine(kotlinTypeRefiner)");
        if (this.b == null) {
            newCapturedTypeConstructor$refine$1$1 = null;
        } else {
            newCapturedTypeConstructor$refine$1$1 = new NewCapturedTypeConstructor$refine$1$1(this, eVar);
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(a2, newCapturedTypeConstructor$refine$1$1, newCapturedTypeConstructor, this.d);
    }

    public List<m0.r.t.a.r.c.m0> getParameters() {
        return EmptyList.c;
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.c;
        return newCapturedTypeConstructor == null ? super.hashCode() : newCapturedTypeConstructor.hashCode();
    }

    public m0.r.t.a.r.b.f m() {
        v type = this.a.getType();
        i.d(type, "projection.type");
        return m0.r.t.a.r.m.a1.a.F1(type);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CapturedType(");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewCapturedTypeConstructor(m0 m0Var, a aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, m0.r.t.a.r.c.m0 m0Var2, int i) {
        this(m0Var, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : m0Var2);
    }
}
