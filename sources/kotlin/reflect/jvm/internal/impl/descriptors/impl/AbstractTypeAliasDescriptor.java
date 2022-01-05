package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.t0.l;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.k.b.w.h;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: AbstractTypeAliasDescriptor.kt */
public abstract class AbstractTypeAliasDescriptor extends l implements l0 {
    public List<? extends m0> Y1;
    public final a Z1 = new a(this);
    public final p y;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class a implements j0 {
        public final /* synthetic */ AbstractTypeAliasDescriptor a;

        public a(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
            this.a = abstractTypeAliasDescriptor;
        }

        public j0 a(e eVar) {
            i.e(eVar, "kotlinTypeRefiner");
            return this;
        }

        public Collection<v> b() {
            Collection<v> b = ((h) this.a).f0().I0().b();
            i.d(b, "declarationDescriptor.underlyingType.constructor.supertypes");
            return b;
        }

        public f c() {
            return this.a;
        }

        public boolean d() {
            return true;
        }

        public List<m0> getParameters() {
            List<? extends m0> list = ((h) this.a).j2;
            if (list != null) {
                return list;
            }
            i.m("typeConstructorParameters");
            throw null;
        }

        public m0.r.t.a.r.b.f m() {
            return DescriptorUtilsKt.f(this.a);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("[typealias ");
            P0.append(this.a.getName().b());
            P0.append(']');
            return P0.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor(m0.r.t.a.r.c.i iVar, m0.r.t.a.r.c.r0.f fVar, d dVar, h0 h0Var, p pVar) {
        super(iVar, fVar, dVar, h0Var);
        i.e(iVar, "containingDeclaration");
        i.e(fVar, "annotations");
        i.e(dVar, "name");
        i.e(h0Var, "sourceElement");
        i.e(pVar, "visibilityImpl");
        this.y = pVar;
    }

    public boolean A0() {
        return false;
    }

    public m0.r.t.a.r.c.l I() {
        return this;
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        i.e(kVar, "visitor");
        return kVar.e(this, d);
    }

    public boolean K() {
        return false;
    }

    public boolean L() {
        return s0.c(((h) this).f0(), new AbstractTypeAliasDescriptor$isInner$1(this));
    }

    public f a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public m0.r.t.a.r.c.i m51a() {
        return this;
    }

    public p getVisibility() {
        return this.y;
    }

    public j0 i() {
        return this.Z1;
    }

    public boolean isExternal() {
        return false;
    }

    public List<m0> t() {
        List<? extends m0> list = this.Y1;
        if (list != null) {
            return list;
        }
        i.m("declaredTypeParametersImpl");
        throw null;
    }

    public String toString() {
        return i.k("typealias ", getName().b());
    }
}
