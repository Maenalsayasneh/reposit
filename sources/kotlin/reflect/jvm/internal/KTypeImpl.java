package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.n.b.j;
import m0.n.b.m;
import m0.r.e;
import m0.r.k;
import m0.r.p;
import m0.r.t.a.o;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.v;

/* compiled from: KTypeImpl.kt */
public final class KTypeImpl implements j {
    public static final /* synthetic */ k[] c;
    public final m0.r.t.a.j<Type> d;
    public final m0.r.t.a.j q;
    public final m0.r.t.a.j x;
    public final v y;

    static {
        Class<KTypeImpl> cls = KTypeImpl.class;
        c = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), m.c(new PropertyReference1Impl(m.a(cls), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public KTypeImpl(v vVar, a<? extends Type> aVar) {
        i.e(vVar, "type");
        this.y = vVar;
        m0.r.t.a.j<Type> jVar = null;
        m0.r.t.a.j<Type> jVar2 = !(aVar instanceof m0.r.t.a.j) ? null : aVar;
        if (jVar2 != null) {
            jVar = jVar2;
        } else if (aVar != null) {
            jVar = h.K2(aVar);
        }
        this.d = jVar;
        this.q = h.K2(new KTypeImpl$classifier$2(this));
        this.x = h.K2(new KTypeImpl$arguments$2(this, aVar));
    }

    public List<p> a() {
        m0.r.t.a.j jVar = this.x;
        k kVar = c[1];
        return (List) jVar.invoke();
    }

    public e c() {
        m0.r.t.a.j jVar = this.q;
        k kVar = c[0];
        return (e) jVar.invoke();
    }

    public boolean d() {
        return this.y.J0();
    }

    public boolean equals(Object obj) {
        return (obj instanceof KTypeImpl) && i.a(this.y, ((KTypeImpl) obj).y);
    }

    public final e h(v vVar) {
        v type;
        f c2 = vVar.I0().c();
        if (c2 instanceof d) {
            Class<?> h = o.h((d) c2);
            if (h == null) {
                return null;
            }
            if (h.isArray()) {
                m0 m0Var = (m0) g.l0(vVar.H0());
                if (m0Var == null || (type = m0Var.getType()) == null) {
                    return new KClassImpl(h);
                }
                i.d(type, "type.arguments.singleOrN…return KClassImpl(jClass)");
                e h2 = h(type);
                if (h2 != null) {
                    return new KClassImpl(ReflectClassUtilKt.a(h.l1(h.o1(h2))));
                }
                throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
            } else if (s0.g(vVar)) {
                return new KClassImpl(h);
            } else {
                List<m0.r.d<? extends Object>> list = ReflectClassUtilKt.a;
                i.e(h, "<this>");
                Class<?> cls = ReflectClassUtilKt.b.get(h);
                if (cls != null) {
                    h = cls;
                }
                return new KClassImpl(h);
            }
        } else if (c2 instanceof m0.r.t.a.r.c.m0) {
            return new KTypeParameterImpl((m0.r.t.a.h) null, (m0.r.t.a.r.c.m0) c2);
        } else {
            if (!(c2 instanceof l0)) {
                return null;
            }
            throw new NotImplementedError(i0.d.a.a.a.n0("An operation is not implemented: ", "Type alias classifiers are not yet supported"));
        }
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public Type i() {
        m0.r.t.a.j<Type> jVar = this.d;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }

    public String toString() {
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.b;
        return ReflectionObjectRenderer.e(this.y);
    }
}
