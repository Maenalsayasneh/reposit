package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.e.a.q;
import m0.r.t.a.r.e.a.t.h;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.b;
import m0.r.t.a.r.e.a.w.e;
import m0.r.t.a.r.e.a.w.o;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.j.p.o;
import m0.r.t.a.r.l.i;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class LazyJavaAnnotationDescriptor implements c, h {
    public static final /* synthetic */ k<Object>[] a;
    public final m0.r.t.a.r.e.a.u.c b;
    public final a c;
    public final i d;
    public final m0.r.t.a.r.l.h e;
    public final m0.r.t.a.r.e.a.v.a f;
    public final m0.r.t.a.r.l.h g;
    public final boolean h;
    public final boolean i;

    static {
        Class<LazyJavaAnnotationDescriptor> cls = LazyJavaAnnotationDescriptor.class;
        a = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), m.c(new PropertyReference1Impl(m.a(cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), m.c(new PropertyReference1Impl(m.a(cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public LazyJavaAnnotationDescriptor(m0.r.t.a.r.e.a.u.c cVar, a aVar, boolean z) {
        m0.n.b.i.e(cVar, "c");
        m0.n.b.i.e(aVar, "javaAnnotation");
        this.b = cVar;
        this.c = aVar;
        this.d = cVar.a.a.e(new LazyJavaAnnotationDescriptor$fqName$2(this));
        this.e = cVar.a.a.d(new LazyJavaAnnotationDescriptor$type$2(this));
        this.f = cVar.a.j.a(aVar);
        this.g = cVar.a.a.d(new LazyJavaAnnotationDescriptor$allValueArguments$2(this));
        this.h = aVar.i();
        this.i = aVar.t() || z;
    }

    public Map<d, g<?>> a() {
        return (Map) i0.j.f.p.h.K1(this.g, a[2]);
    }

    public final g<?> b(b bVar) {
        g<?> gVar;
        v vVar = null;
        if (bVar instanceof o) {
            return ConstantValueFactory.b(((o) bVar).getValue());
        }
        if (bVar instanceof m0.r.t.a.r.e.a.w.m) {
            m0.r.t.a.r.e.a.w.m mVar = (m0.r.t.a.r.e.a.w.m) bVar;
            m0.r.t.a.r.g.a b2 = mVar.b();
            d d2 = mVar.d();
            if (b2 == null || d2 == null) {
                return null;
            }
            return new m0.r.t.a.r.j.p.i(b2, d2);
        }
        if (bVar instanceof e) {
            d name = bVar.getName();
            if (name == null) {
                name = q.b;
            }
            m0.n.b.i.d(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            List<b> e2 = ((e) bVar).e();
            a0 a0Var = (a0) i0.j.f.p.h.K1(this.e, a[1]);
            m0.n.b.i.d(a0Var, "type");
            if (i0.j.f.p.h.h2(a0Var)) {
                return null;
            }
            m0.r.t.a.r.c.d e3 = DescriptorUtilsKt.e(this);
            m0.n.b.i.c(e3);
            o0 O0 = i0.j.f.p.h.O0(name, e3);
            if (O0 != null) {
                vVar = O0.getType();
            }
            if (vVar == null) {
                vVar = this.b.a.o.m().h(Variance.INVARIANT, p.d("Unknown array element type"));
            }
            m0.n.b.i.d(vVar, "DescriptorResolverUtils.getAnnotationParameterByName(argumentName, annotationClass!!)?.type\n            // Try to load annotation arguments even if the annotation class is not found\n                ?: c.components.module.builtIns.getArrayType(\n                    Variance.INVARIANT,\n                    ErrorUtils.createErrorType(\"Unknown array element type\")\n                )");
            ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(e2, 10));
            for (b b3 : e2) {
                Object b4 = b(b3);
                if (b4 == null) {
                    b4 = new m0.r.t.a.r.j.p.q();
                }
                arrayList.add(b4);
            }
            m0.n.b.i.e(arrayList, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            m0.n.b.i.e(vVar, "type");
            gVar = new m0.r.t.a.r.j.p.b(arrayList, new ConstantValueFactory$createArrayValue$1(vVar));
        } else if (bVar instanceof m0.r.t.a.r.e.a.w.c) {
            return new m0.r.t.a.r.j.p.a(new LazyJavaAnnotationDescriptor(this.b, ((m0.r.t.a.r.e.a.w.c) bVar).a(), false));
        } else if (!(bVar instanceof m0.r.t.a.r.e.a.w.h)) {
            return null;
        } else {
            v e4 = this.b.e.e(((m0.r.t.a.r.e.a.w.h) bVar).c(), m0.r.t.a.r.e.a.u.h.c.c(TypeUsage.COMMON, false, (m0) null, 3));
            m0.n.b.i.e(e4, "argumentType");
            if (i0.j.f.p.h.h2(e4)) {
                return null;
            }
            v vVar2 = e4;
            int i2 = 0;
            while (f.z(vVar2)) {
                vVar2 = ((m0.r.t.a.r.m.m0) m0.j.g.j0(vVar2.H0())).getType();
                m0.n.b.i.d(vVar2, "type.arguments.single().type");
                i2++;
            }
            m0.r.t.a.r.c.f c2 = vVar2.I0().c();
            if (c2 instanceof m0.r.t.a.r.c.d) {
                m0.r.t.a.r.g.a g2 = DescriptorUtilsKt.g(c2);
                if (g2 == null) {
                    return new m0.r.t.a.r.j.p.o((o.a) new o.a.C0271a(e4));
                }
                gVar = new m0.r.t.a.r.j.p.o(g2, i2);
            } else if (!(c2 instanceof m0)) {
                return null;
            } else {
                m0.r.t.a.r.g.a l = m0.r.t.a.r.g.a.l(g.a.b.i());
                m0.n.b.i.d(l, "topLevel(StandardNames.FqNames.any.toSafe())");
                gVar = new m0.r.t.a.r.j.p.o(l, 0);
            }
        }
        return gVar;
    }

    public m0.r.t.a.r.g.b d() {
        i iVar = this.d;
        k<Object> kVar = a[0];
        m0.n.b.i.e(iVar, "<this>");
        m0.n.b.i.e(kVar, "p");
        return (m0.r.t.a.r.g.b) iVar.invoke();
    }

    public v getType() {
        return (a0) i0.j.f.p.h.K1(this.e, a[1]);
    }

    public boolean i() {
        return this.h;
    }

    public h0 r() {
        return this.f;
    }

    public String toString() {
        return DescriptorRenderer.s(DescriptorRenderer.a, this, (AnnotationUseSiteTarget) null, 2, (Object) null);
    }
}
