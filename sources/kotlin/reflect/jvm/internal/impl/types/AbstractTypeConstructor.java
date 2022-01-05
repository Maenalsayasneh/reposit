package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import m0.c;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: AbstractTypeConstructor.kt */
public abstract class AbstractTypeConstructor implements j0 {
    public final h<a> a;

    /* compiled from: AbstractTypeConstructor.kt */
    public final class ModuleViewTypeConstructor implements j0 {
        public final e a;
        public final c b;
        public final /* synthetic */ AbstractTypeConstructor c;

        public ModuleViewTypeConstructor(AbstractTypeConstructor abstractTypeConstructor, e eVar) {
            i.e(abstractTypeConstructor, "this$0");
            i.e(eVar, "kotlinTypeRefiner");
            this.c = abstractTypeConstructor;
            this.a = eVar;
            this.b = i0.j.f.p.h.G2(LazyThreadSafetyMode.PUBLICATION, new AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2(this, abstractTypeConstructor));
        }

        public j0 a(e eVar) {
            i.e(eVar, "kotlinTypeRefiner");
            return this.c.a(eVar);
        }

        public Collection b() {
            return (List) this.b.getValue();
        }

        public f c() {
            return this.c.c();
        }

        public boolean d() {
            return this.c.d();
        }

        public boolean equals(Object obj) {
            return this.c.equals(obj);
        }

        public List<m0> getParameters() {
            List<m0> parameters = this.c.getParameters();
            i.d(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public m0.r.t.a.r.b.f m() {
            m0.r.t.a.r.b.f m = this.c.m();
            i.d(m, "this@AbstractTypeConstructor.builtIns");
            return m;
        }

        public String toString() {
            return this.c.toString();
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    public static final class a {
        public final Collection<v> a;
        public List<? extends v> b = i0.j.f.p.h.L2(p.c);

        public a(Collection<? extends v> collection) {
            i.e(collection, "allSupertypes");
            this.a = collection;
        }
    }

    public AbstractTypeConstructor(l lVar) {
        i.e(lVar, "storageManager");
        this.a = lVar.f(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.c, new AbstractTypeConstructor$supertypes$3(this));
    }

    public static final Collection f(AbstractTypeConstructor abstractTypeConstructor, j0 j0Var, boolean z) {
        Objects.requireNonNull(abstractTypeConstructor);
        List<T> list = null;
        AbstractTypeConstructor abstractTypeConstructor2 = j0Var instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) j0Var : null;
        if (abstractTypeConstructor2 != null) {
            list = g.Z(((a) abstractTypeConstructor2.a.invoke()).a, abstractTypeConstructor2.i(z));
        }
        if (list != null) {
            return list;
        }
        Collection<v> b = j0Var.b();
        i.d(b, "supertypes");
        return b;
    }

    public j0 a(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return new ModuleViewTypeConstructor(this, eVar);
    }

    public abstract f c();

    public abstract Collection<v> g();

    public v h() {
        return null;
    }

    public Collection<v> i(boolean z) {
        return EmptyList.c;
    }

    public abstract k0 j();

    /* renamed from: k */
    public List<v> b() {
        return ((a) this.a.invoke()).b;
    }

    public List<v> l(List<v> list) {
        i.e(list, "supertypes");
        return list;
    }

    public void n(v vVar) {
        i.e(vVar, "type");
    }
}
