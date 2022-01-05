package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.n.a.l;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.e.a.s.e;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.q;
import m0.r.t.a.r.e.a.w.x;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.l.f;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.m.v;

/* compiled from: LazyJavaScope.kt */
public abstract class LazyJavaScope extends g {
    public static final /* synthetic */ k<Object>[] b;
    public final c c;
    public final LazyJavaScope d;
    public final h<Collection<i>> e;
    public final h<m0.r.t.a.r.e.a.u.g.a> f;
    public final f<d, Collection<g0>> g;
    public final m0.r.t.a.r.l.g<d, c0> h;
    public final f<d, Collection<g0>> i;
    public final h j;
    public final h k;
    public final h l;
    public final f<d, List<c0>> m;

    /* compiled from: LazyJavaScope.kt */
    public static final class a {
        public final v a;
        public final v b = null;
        public final List<o0> c;
        public final List<m0> d;
        public final boolean e;
        public final List<String> f;

        public a(v vVar, v vVar2, List<? extends o0> list, List<? extends m0> list2, boolean z, List<String> list3) {
            m0.n.b.i.e(vVar, "returnType");
            m0.n.b.i.e(list, "valueParameters");
            m0.n.b.i.e(list2, "typeParameters");
            m0.n.b.i.e(list3, "errors");
            this.a = vVar;
            this.c = list;
            this.d = list2;
            this.e = z;
            this.f = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m0.n.b.i.a(this.a, aVar.a) && m0.n.b.i.a(this.b, aVar.b) && m0.n.b.i.a(this.c, aVar.c) && m0.n.b.i.a(this.d, aVar.d) && this.e == aVar.e && m0.n.b.i.a(this.f, aVar.f);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            v vVar = this.b;
            int H = i0.d.a.a.a.H(this.d, i0.d.a.a.a.H(this.c, (hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31, 31), 31);
            boolean z = this.e;
            if (z) {
                z = true;
            }
            return this.f.hashCode() + ((H + (z ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("MethodSignatureData(returnType=");
            P0.append(this.a);
            P0.append(", receiverType=");
            P0.append(this.b);
            P0.append(", valueParameters=");
            P0.append(this.c);
            P0.append(", typeParameters=");
            P0.append(this.d);
            P0.append(", hasStableParameterNames=");
            P0.append(this.e);
            P0.append(", errors=");
            return i0.d.a.a.a.A0(P0, this.f, ')');
        }
    }

    /* compiled from: LazyJavaScope.kt */
    public static final class b {
        public final List<o0> a;
        public final boolean b;

        public b(List<? extends o0> list, boolean z) {
            m0.n.b.i.e(list, "descriptors");
            this.a = list;
            this.b = z;
        }
    }

    static {
        Class<LazyJavaScope> cls = LazyJavaScope.class;
        b = new k[]{m.c(new PropertyReference1Impl(m.a(cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), m.c(new PropertyReference1Impl(m.a(cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), m.c(new PropertyReference1Impl(m.a(cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public LazyJavaScope(c cVar, LazyJavaScope lazyJavaScope) {
        m0.n.b.i.e(cVar, "c");
        this.c = cVar;
        this.d = lazyJavaScope;
        this.e = cVar.a.a.c(new LazyJavaScope$allDescriptors$1(this), EmptyList.c);
        this.f = cVar.a.a.d(new LazyJavaScope$declaredMemberIndex$1(this));
        this.g = cVar.a.a.g(new LazyJavaScope$declaredFunctions$1(this));
        this.h = cVar.a.a.h(new LazyJavaScope$declaredField$1(this));
        this.i = cVar.a.a.g(new LazyJavaScope$functions$1(this));
        this.j = cVar.a.a.d(new LazyJavaScope$functionNamesLazy$2(this));
        this.k = cVar.a.a.d(new LazyJavaScope$propertyNamesLazy$2(this));
        this.l = cVar.a.a.d(new LazyJavaScope$classNamesLazy$2(this));
        this.m = cVar.a.a.g(new LazyJavaScope$properties$1(this));
    }

    public Collection<g0> a(d dVar, m0.r.t.a.r.d.a.b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        if (!b().contains(dVar)) {
            return EmptyList.c;
        }
        return (Collection) ((LockBasedStorageManager.m) this.i).invoke(dVar);
    }

    public Set<d> b() {
        return (Set) i0.j.f.p.h.K1(this.j, b[0]);
    }

    public Collection<c0> c(d dVar, m0.r.t.a.r.d.a.b bVar) {
        m0.n.b.i.e(dVar, "name");
        m0.n.b.i.e(bVar, "location");
        if (!d().contains(dVar)) {
            return EmptyList.c;
        }
        return (Collection) ((LockBasedStorageManager.m) this.m).invoke(dVar);
    }

    public Set<d> d() {
        return (Set) i0.j.f.p.h.K1(this.k, b[1]);
    }

    public Set<d> e() {
        return (Set) i0.j.f.p.h.K1(this.l, b[2]);
    }

    public Collection<i> g(m0.r.t.a.r.j.u.d dVar, l<? super d, Boolean> lVar) {
        m0.n.b.i.e(dVar, "kindFilter");
        m0.n.b.i.e(lVar, "nameFilter");
        return (Collection) this.e.invoke();
    }

    public abstract Set<d> h(m0.r.t.a.r.j.u.d dVar, l<? super d, Boolean> lVar);

    public abstract Set<d> i(m0.r.t.a.r.j.u.d dVar, l<? super d, Boolean> lVar);

    public void j(Collection<g0> collection, d dVar) {
        m0.n.b.i.e(collection, "result");
        m0.n.b.i.e(dVar, "name");
    }

    public abstract m0.r.t.a.r.e.a.u.g.a k();

    public final v l(q qVar, c cVar) {
        m0.n.b.i.e(qVar, "method");
        m0.n.b.i.e(cVar, "c");
        return cVar.e.e(qVar.getReturnType(), m0.r.t.a.r.e.a.u.h.c.c(TypeUsage.COMMON, qVar.O().q(), (m0) null, 2));
    }

    public abstract void m(Collection<g0> collection, d dVar);

    public abstract void n(d dVar, Collection<c0> collection);

    public abstract Set<d> o(m0.r.t.a.r.j.u.d dVar, l<? super d, Boolean> lVar);

    public abstract f0 p();

    public abstract i q();

    public boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        m0.n.b.i.e(javaMethodDescriptor, "<this>");
        return true;
    }

    public abstract a s(q qVar, List<? extends m0> list, v vVar, List<? extends o0> list2);

    public final JavaMethodDescriptor t(q qVar) {
        f0 f0Var;
        Map map;
        q qVar2 = qVar;
        m0.n.b.i.e(qVar2, "method");
        JavaMethodDescriptor V0 = JavaMethodDescriptor.V0(q(), i0.j.f.p.h.z3(this.c, qVar2), qVar.getName(), this.c.a.j.a(qVar2), ((m0.r.t.a.r.e.a.u.g.a) this.f.invoke()).b(qVar.getName()) != null && qVar.h().isEmpty());
        m0.n.b.i.d(V0, "createJavaMethod(\n            ownerDescriptor, annotations, method.name, c.components.sourceElementFactory.source(method),\n            declaredMemberIndex().findRecordComponentByName(method.name) != null && method.valueParameters.isEmpty()\n        )");
        c G = i0.j.f.p.h.G(this.c, V0, qVar2, 0, 4);
        List<x> typeParameters = qVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(typeParameters, 10));
        for (x a2 : typeParameters) {
            m0 a3 = G.b.a(a2);
            m0.n.b.i.c(a3);
            arrayList.add(a3);
        }
        b u = u(G, V0, qVar.h());
        a s = s(qVar2, arrayList, l(qVar2, G), u.a);
        v vVar = s.b;
        if (vVar == null) {
            f0Var = null;
        } else {
            Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
            f0Var = i0.j.f.p.h.k0(V0, vVar, f.a.b);
        }
        f0 p = p();
        List<m0> list = s.d;
        List<o0> list2 = s.c;
        v vVar2 = s.a;
        Modality a4 = Modality.Companion.a(false, qVar.isAbstract(), !qVar.isFinal());
        p h4 = i0.j.f.p.h.h4(qVar.getVisibility());
        if (s.b != null) {
            map = i0.j.f.p.h.S2(new Pair(JavaMethodDescriptor.w2, m0.j.g.u(u.a)));
        } else {
            map = m0.j.g.o();
        }
        V0.U0(f0Var, p, list, list2, vVar2, a4, h4, map);
        V0.W0(s.e, u.b);
        if (!(!s.f.isEmpty())) {
            return V0;
        }
        e eVar = G.a.e;
        List<String> list3 = s.f;
        Objects.requireNonNull((e.a) eVar);
        if (list3 == null) {
            e.a.a(6);
            throw null;
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return m0.n.b.i.k("Lazy scope for ", q());
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [m0.r.t.a.r.e.a.w.w] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.b u(m0.r.t.a.r.e.a.u.c r23, m0.r.t.a.r.c.r r24, java.util.List<? extends m0.r.t.a.r.e.a.w.z> r25) {
        /*
            r22 = this;
            r0 = r23
            r13 = r24
            java.lang.String r1 = "c"
            m0.n.b.i.e(r0, r1)
            java.lang.String r1 = "function"
            m0.n.b.i.e(r13, r1)
            java.lang.String r1 = "jValueParameters"
            r14 = r25
            m0.n.b.i.e(r14, r1)
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
            r15.<init>()
            java.lang.Iterable r1 = m0.j.g.E0(r25)
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            int r2 = i0.j.f.p.h.K(r1, r2)
            r12.<init>(r2)
            m0.j.m r1 = (m0.j.m) r1
            java.util.Iterator r16 = r1.iterator()
            r11 = 0
            r1 = r11
        L_0x0031:
            r2 = r16
            m0.j.n r2 = (m0.j.n) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0169
            java.lang.Object r2 = r2.next()
            m0.j.l r2 = (m0.j.l) r2
            int r4 = r2.a
            T r2 = r2.b
            m0.r.t.a.r.e.a.w.z r2 = (m0.r.t.a.r.e.a.w.z) r2
            m0.r.t.a.r.c.r0.f r5 = i0.j.f.p.h.z3(r0, r2)
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r3 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r6 = 3
            r7 = 0
            m0.r.t.a.r.e.a.u.h.a r3 = m0.r.t.a.r.e.a.u.h.c.c(r3, r11, r7, r6)
            m0.r.t.a.r.g.b r6 = m0.r.t.a.r.e.a.q.q
            java.lang.String r8 = "PARAMETER_NAME_FQ_NAME"
            m0.n.b.i.d(r6, r8)
            r8 = r5
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r8 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations) r8
            m0.r.t.a.r.c.r0.c r6 = r8.f(r6)
            if (r6 != 0) goto L_0x0065
            r6 = r7
            goto L_0x0069
        L_0x0065:
            m0.r.t.a.r.j.p.g r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.b(r6)
        L_0x0069:
            if (r6 != 0) goto L_0x006c
            goto L_0x0075
        L_0x006c:
            boolean r8 = r6 instanceof m0.r.t.a.r.j.p.s
            if (r8 != 0) goto L_0x0071
            r6 = r7
        L_0x0071:
            m0.r.t.a.r.j.p.s r6 = (m0.r.t.a.r.j.p.s) r6
            if (r6 != 0) goto L_0x0077
        L_0x0075:
            r6 = r7
            goto L_0x007b
        L_0x0077:
            T r6 = r6.a
            java.lang.String r6 = (java.lang.String) r6
        L_0x007b:
            boolean r8 = r2.g()
            r9 = 1
            if (r8 == 0) goto L_0x00b3
            m0.r.t.a.r.e.a.w.w r8 = r2.getType()
            boolean r10 = r8 instanceof m0.r.t.a.r.e.a.w.f
            if (r10 == 0) goto L_0x008d
            r7 = r8
            m0.r.t.a.r.e.a.w.f r7 = (m0.r.t.a.r.e.a.w.f) r7
        L_0x008d:
            if (r7 == 0) goto L_0x00a7
            m0.r.t.a.r.e.a.u.h.b r8 = r0.e
            m0.r.t.a.r.m.v r3 = r8.c(r7, r3, r9)
            m0.r.t.a.r.e.a.u.a r7 = r0.a
            m0.r.t.a.r.c.u r7 = r7.o
            m0.r.t.a.r.b.f r7 = r7.m()
            m0.r.t.a.r.m.v r7 = r7.g(r3)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r3, r7)
            goto L_0x00c2
        L_0x00a7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Vararg parameter should be an array: "
            java.lang.String r1 = m0.n.b.i.k(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00b3:
            m0.r.t.a.r.e.a.u.h.b r8 = r0.e
            m0.r.t.a.r.e.a.w.w r10 = r2.getType()
            m0.r.t.a.r.m.v r3 = r8.e(r10, r3)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r3, r7)
        L_0x00c2:
            A r3 = r8.c
            r7 = r3
            m0.r.t.a.r.m.v r7 = (m0.r.t.a.r.m.v) r7
            B r3 = r8.d
            r17 = r3
            m0.r.t.a.r.m.v r17 = (m0.r.t.a.r.m.v) r17
            r3 = r13
            m0.r.t.a.r.c.t0.k r3 = (m0.r.t.a.r.c.t0.k) r3
            m0.r.t.a.r.g.d r3 = r3.getName()
            java.lang.String r3 = r3.b()
            java.lang.String r8 = "equals"
            boolean r3 = m0.n.b.i.a(r3, r8)
            if (r3 == 0) goto L_0x00ff
            int r3 = r25.size()
            if (r3 != r9) goto L_0x00ff
            m0.r.t.a.r.e.a.u.a r3 = r0.a
            m0.r.t.a.r.c.u r3 = r3.o
            m0.r.t.a.r.b.f r3 = r3.m()
            m0.r.t.a.r.m.a0 r3 = r3.p()
            boolean r3 = m0.n.b.i.a(r3, r7)
            if (r3 == 0) goto L_0x00ff
            java.lang.String r3 = "other"
            m0.r.t.a.r.g.d r3 = m0.r.t.a.r.g.d.g(r3)
            goto L_0x0133
        L_0x00ff:
            if (r6 == 0) goto L_0x0117
            int r3 = r6.length()
            if (r3 <= 0) goto L_0x0109
            r3 = r9
            goto L_0x010a
        L_0x0109:
            r3 = r11
        L_0x010a:
            if (r3 == 0) goto L_0x0117
            boolean r3 = r15.add(r6)
            if (r3 == 0) goto L_0x0117
            m0.r.t.a.r.g.d r3 = m0.r.t.a.r.g.d.g(r6)
            goto L_0x0133
        L_0x0117:
            m0.r.t.a.r.g.d r3 = r2.getName()
            if (r3 != 0) goto L_0x011e
            r1 = r9
        L_0x011e:
            if (r3 != 0) goto L_0x0133
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "p"
            java.lang.String r3 = m0.n.b.i.k(r6, r3)
            m0.r.t.a.r.g.d r3 = m0.r.t.a.r.g.d.g(r3)
            java.lang.String r6 = "identifier(\"p$index\")"
            m0.n.b.i.d(r3, r6)
        L_0x0133:
            r18 = r1
            r6 = r3
            java.lang.String r1 = "if (function.name.asString() == \"equals\" &&\n                jValueParameters.size == 1 &&\n                c.module.builtIns.nullableAnyType == outType\n            ) {\n                // This is a hack to prevent numerous warnings on Kotlin classes that inherit Java classes: if you override \"equals\" in such\n                // class without this hack, you'll be warned that in the superclass the name is \"p0\" (regardless of the fact that it's\n                // \"other\" in Any)\n                // TODO: fix Java parameter name loading logic somehow (don't always load \"p0\", \"p1\", etc.)\n                Name.identifier(\"other\")\n            } else if (parameterName != null && parameterName.isNotEmpty() && usedNames.add(parameterName)) {\n                Name.identifier(parameterName)\n            } else {\n                // TODO: parameter names may be drawn from attached sources, which is slow; it's better to make them lazy\n                val javaName = javaParameter.name\n                if (javaName == null) synthesizedNames = true\n                javaName ?: Name.identifier(\"p$index\")\n            }"
            m0.n.b.i.d(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl r10 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl
            r3 = 0
            r8 = 0
            r9 = 0
            r19 = 0
            m0.r.t.a.r.e.a.u.a r1 = r0.a
            m0.r.t.a.r.e.a.v.b r1 = r1.j
            m0.r.t.a.r.e.a.v.a r20 = r1.a(r2)
            r1 = r10
            r2 = r24
            r21 = r10
            r10 = r19
            r19 = r11
            r11 = r17
            r0 = r12
            r12 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r21
            r0.add(r1)
            r12 = r0
            r1 = r18
            r11 = r19
            r0 = r23
            goto L_0x0031
        L_0x0169:
            r0 = r12
            java.util.List r0 = m0.j.g.v0(r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.u(m0.r.t.a.r.e.a.u.c, m0.r.t.a.r.c.r, java.util.List):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b");
    }
}
