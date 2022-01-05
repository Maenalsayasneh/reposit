package m0.r.t.a.r.c.v0.b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$2;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$2;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$2;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$2;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.n.b.i;
import m0.n.b.p;
import m0.r.t.a.r.c.q0;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.j;
import m0.r.t.a.r.e.a.w.v;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaClass.kt */
public final class h extends l implements e, r, g {
    public final Class<?> a;

    public h(Class<?> cls) {
        i.e(cls, "klass");
        this.a = cls;
    }

    public Collection B() {
        Field[] declaredFields = this.a.getDeclaredFields();
        i.d(declaredFields, "klass.declaredFields");
        return SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.g(SequencesKt___SequencesKt.e(i0.j.f.p.h.w(declaredFields), ReflectJavaClass$fields$1.c), ReflectJavaClass$fields$2.c));
    }

    public int C() {
        return this.a.getModifiers();
    }

    public boolean D() {
        return false;
    }

    public boolean G() {
        return this.a.isInterface();
    }

    public LightClassOriginKind H() {
        return null;
    }

    public Collection J() {
        Class[] declaredClasses = this.a.getDeclaredClasses();
        i.d(declaredClasses, "klass.declaredClasses");
        return SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.h(SequencesKt___SequencesKt.e(i0.j.f.p.h.w(declaredClasses), ReflectJavaClass$innerClassNames$1.c), ReflectJavaClass$innerClassNames$2.c));
    }

    public Collection L() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        i.d(declaredMethods, "klass.declaredMethods");
        return SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.g(SequencesKt___SequencesKt.d(i0.j.f.p.h.w(declaredMethods), new ReflectJavaClass$methods$1(this)), ReflectJavaClass$methods$2.c));
    }

    public Collection<j> M() {
        return EmptyList.c;
    }

    public boolean P() {
        i.e(this, "this");
        return Modifier.isStatic(C());
    }

    public Collection<j> b() {
        Type type = Object.class;
        if (i.a(this.a, type)) {
            return EmptyList.c;
        }
        p pVar = new p(2);
        Type genericSuperclass = this.a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        pVar.a.add(type);
        Type[] genericInterfaces = this.a.getGenericInterfaces();
        i.d(genericInterfaces, "klass.genericInterfaces");
        pVar.a(genericInterfaces);
        List<Type> K = m0.j.g.K(pVar.a.toArray(new Type[pVar.b()]));
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(K, 10));
        for (Type jVar : K) {
            arrayList.add(new j(jVar));
        }
        return arrayList;
    }

    public b d() {
        b b = ReflectClassUtilKt.b(this.a).b();
        i.d(b, "klass.classId.asSingleFqName()");
        return b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && i.a(this.a, ((h) obj).a);
    }

    public a f(b bVar) {
        return i0.j.f.p.h.B0(this, bVar);
    }

    public Collection getAnnotations() {
        return i0.j.f.p.h.P0(this);
    }

    public d getName() {
        d g = d.g(this.a.getSimpleName());
        i.d(g, "identifier(klass.simpleName)");
        return g;
    }

    public List<v> getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        i.d(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable vVar : typeParameters) {
            arrayList.add(new v(vVar));
        }
        return arrayList;
    }

    public q0 getVisibility() {
        return i0.j.f.p.h.N1(this);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAbstract() {
        i.e(this, "this");
        return Modifier.isAbstract(C());
    }

    public boolean isFinal() {
        i.e(this, "this");
        return Modifier.isFinal(C());
    }

    public g j() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        return new h(declaringClass);
    }

    public Collection k() {
        Constructor[] declaredConstructors = this.a.getDeclaredConstructors();
        i.d(declaredConstructors, "klass.declaredConstructors");
        return SequencesKt___SequencesKt.j(SequencesKt___SequencesKt.g(SequencesKt___SequencesKt.e(i0.j.f.p.h.w(declaredConstructors), ReflectJavaClass$constructors$1.c), ReflectJavaClass$constructors$2.c));
    }

    public Collection<v> l() {
        return EmptyList.c;
    }

    public boolean m() {
        i0.j.f.p.h.e2(this);
        return false;
    }

    public boolean q() {
        return this.a.isAnnotation();
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        i0.d.a.a.a.p(h.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public AnnotatedElement u() {
        return this.a;
    }

    public boolean z() {
        return this.a.isEnum();
    }
}
