package m0.r.t.a.r.e.a.u.g;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceTypeParameterBounds$1$1;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.c;
import m0.r.t.a.r.e.a.w.j;
import m0.r.t.a.r.e.a.w.x;
import m0.r.t.a.r.e.a.x.k;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.v;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class e extends c {
    public final m0.r.t.a.r.e.a.u.c d2;
    public final x e2;
    public final LazyJavaAnnotations f2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(m0.r.t.a.r.e.a.u.c cVar, x xVar, int i, i iVar) {
        super(cVar.a.a, iVar, xVar.getName(), Variance.INVARIANT, false, i, h0.a, cVar.a.m);
        m0.n.b.i.e(cVar, "c");
        m0.n.b.i.e(xVar, "javaTypeParameter");
        m0.n.b.i.e(iVar, "containingDeclaration");
        this.d2 = cVar;
        this.e2 = xVar;
        this.f2 = new LazyJavaAnnotations(cVar, xVar, false);
    }

    public List<v> B0(List<? extends v> list) {
        m0.n.b.i.e(list, "bounds");
        m0.r.t.a.r.e.a.u.c cVar = this.d2;
        SignatureEnhancement signatureEnhancement = cVar.a.r;
        Objects.requireNonNull(signatureEnhancement);
        m0.n.b.i.e(this, "typeParameter");
        m0.n.b.i.e(list, "bounds");
        m0.n.b.i.e(cVar, "context");
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (v vVar : list) {
            if (!a.K0(vVar, SignatureEnhancement$enhanceTypeParameterBounds$1$1.c)) {
                vVar = new SignatureEnhancement.SignatureParts(signatureEnhancement, this, vVar, EmptyList.c, false, cVar, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, true).b((k) null).a;
            }
            arrayList.add(vVar);
        }
        return arrayList;
    }

    public void H0(v vVar) {
        m0.n.b.i.e(vVar, "type");
    }

    public List<v> I0() {
        Collection<j> upperBounds = this.e2.getUpperBounds();
        if (upperBounds.isEmpty()) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            a0 f = this.d2.a.o.m().f();
            m0.n.b.i.d(f, "c.module.builtIns.anyType");
            a0 p = this.d2.a.o.m().p();
            m0.n.b.i.d(p, "c.module.builtIns.nullableAnyType");
            return h.L2(KotlinTypeFactory.c(f, p));
        }
        ArrayList arrayList = new ArrayList(h.K(upperBounds, 10));
        for (j e : upperBounds) {
            arrayList.add(this.d2.e.e(e, m0.r.t.a.r.e.a.u.h.c.c(TypeUsage.COMMON, false, this, 1)));
        }
        return arrayList;
    }

    public f getAnnotations() {
        return this.f2;
    }
}
