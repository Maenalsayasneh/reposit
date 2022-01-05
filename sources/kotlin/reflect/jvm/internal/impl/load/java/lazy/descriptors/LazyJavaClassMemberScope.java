package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.a0;
import m0.r.t.a.r.c.t0.b0;
import m0.r.t.a.r.e.a.b;
import m0.r.t.a.r.e.a.m;
import m0.r.t.a.r.e.a.p;
import m0.r.t.a.r.e.a.s.d;
import m0.r.t.a.r.e.a.s.e;
import m0.r.t.a.r.e.a.t.e;
import m0.r.t.a.r.e.a.u.g.a;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.n;
import m0.r.t.a.r.e.a.w.q;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.o.j;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    public final d n;
    public final g o;
    public final boolean p;
    public final h<List<c>> q;
    public final h<Set<m0.r.t.a.r.g.d>> r;
    public final h<Map<m0.r.t.a.r.g.d, n>> s;
    public final m0.r.t.a.r.l.g<m0.r.t.a.r.g.d, m0.r.t.a.r.c.t0.h> t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(m0.r.t.a.r.e.a.u.c cVar, d dVar, g gVar, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(cVar, lazyJavaClassMemberScope);
        i.e(cVar, "c");
        i.e(dVar, "ownerDescriptor");
        i.e(gVar, "jClass");
        this.n = dVar;
        this.o = gVar;
        this.p = z;
        this.q = cVar.a.a.d(new LazyJavaClassMemberScope$constructors$1(this, cVar));
        this.r = cVar.a.a.d(new LazyJavaClassMemberScope$nestedClassIndex$1(this));
        this.s = cVar.a.a.d(new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.t = cVar.a.a.h(new LazyJavaClassMemberScope$nestedClasses$1(this, cVar));
    }

    public static final Collection v(LazyJavaClassMemberScope lazyJavaClassMemberScope, m0.r.t.a.r.g.d dVar) {
        Collection<q> f = ((a) lazyJavaClassMemberScope.f.invoke()).f(dVar);
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(f, 10));
        for (q t2 : f) {
            arrayList.add(lazyJavaClassMemberScope.t(t2));
        }
        return arrayList;
    }

    public static final Collection w(LazyJavaClassMemberScope lazyJavaClassMemberScope, m0.r.t.a.r.g.d dVar) {
        Set<g0> L = lazyJavaClassMemberScope.L(dVar);
        ArrayList arrayList = new ArrayList();
        for (T next : L) {
            g0 g0Var = (g0) next;
            i.e(g0Var, "<this>");
            boolean z = true;
            if (!(i0.j.f.p.h.x1(g0Var) != null)) {
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.m;
                if (BuiltinMethodsWithSpecialGenericSignature.a(g0Var) == null) {
                    z = false;
                }
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void A(Set<? extends c0> set, Collection<c0> collection, Set<c0> set2, l<? super m0.r.t.a.r.g.d, ? extends Collection<? extends g0>> lVar) {
        g0 g0Var;
        a0 a0Var;
        b0 b0Var;
        l<? super m0.r.t.a.r.g.d, ? extends Collection<? extends g0>> lVar2 = lVar;
        for (c0 c0Var : set) {
            e eVar = null;
            if (E(c0Var, lVar2)) {
                g0 I = I(c0Var, lVar2);
                i.c(I);
                if (c0Var.i0()) {
                    g0Var = J(c0Var, lVar2);
                    i.c(g0Var);
                } else {
                    g0Var = null;
                }
                if (g0Var != null) {
                    g0Var.j();
                    I.j();
                }
                e eVar2 = new e(this.n, I, g0Var, c0Var);
                v returnType = I.getReturnType();
                i.c(returnType);
                eVar2.L0(returnType, EmptyList.c, p(), (f0) null);
                a0 n02 = i0.j.f.p.h.n0(eVar2, I.getAnnotations(), false, false, false, I.r());
                n02.e2 = I;
                n02.J0(eVar2.getType());
                i.d(n02, "createGetter(\n            propertyDescriptor, getterMethod.annotations, /* isDefault = */false,\n            /* isExternal = */ false, /* isInline = */ false, getterMethod.source\n        ).apply {\n            initialSignatureDescriptor = getterMethod\n            initialize(propertyDescriptor.type)\n        }");
                if (g0Var != null) {
                    List<o0> h = g0Var.h();
                    i.d(h, "setterMethod.valueParameters");
                    o0 o0Var = (o0) m0.j.g.w(h);
                    if (o0Var != null) {
                        a0Var = n02;
                        b0Var = i0.j.f.p.h.r0(eVar2, g0Var.getAnnotations(), o0Var.getAnnotations(), false, false, false, g0Var.getVisibility(), g0Var.r());
                        b0Var.e2 = g0Var;
                    } else {
                        throw new AssertionError(i.k("No parameter found for ", g0Var));
                    }
                } else {
                    a0Var = n02;
                    b0Var = null;
                }
                eVar2.o2 = a0Var;
                eVar2.p2 = b0Var;
                eVar2.r2 = null;
                eVar2.s2 = null;
                eVar = eVar2;
            }
            Collection<c0> collection2 = collection;
            if (eVar != null) {
                collection2.add(eVar);
                if (set2 != null) {
                    ((j) set2).add(c0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<v> B() {
        if (!this.p) {
            return this.c.a.u.c().f(this.n);
        }
        Collection<v> b = this.n.i().b();
        i.d(b, "ownerDescriptor.typeConstructor.supertypes");
        return b;
    }

    public final g0 C(g0 g0Var, m0.r.t.a.r.c.a aVar, Collection<? extends g0> collection) {
        boolean z;
        boolean z2 = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g0 g0Var2 = (g0) it.next();
                if (i.a(g0Var, g0Var2) || g0Var2.c0() != null || !F(g0Var2, aVar)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return g0Var;
        }
        g0 g0Var3 = (g0) g0Var.s().m().build();
        i.c(g0Var3);
        return g0Var3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (m0.r.t.a.r.b.h.a(r3, r5.c.a.t.c()) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.c.g0 D(m0.r.t.a.r.c.g0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.h()
            java.lang.String r1 = "valueParameters"
            m0.n.b.i.d(r0, r1)
            java.lang.Object r0 = m0.j.g.I(r0)
            m0.r.t.a.r.c.o0 r0 = (m0.r.t.a.r.c.o0) r0
            r2 = 0
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r0 = r2
            goto L_0x004b
        L_0x0014:
            m0.r.t.a.r.m.v r3 = r0.getType()
            m0.r.t.a.r.m.j0 r3 = r3.I0()
            m0.r.t.a.r.c.f r3 = r3.c()
            if (r3 != 0) goto L_0x0024
            r3 = r2
            goto L_0x0028
        L_0x0024:
            m0.r.t.a.r.g.c r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.i(r3)
        L_0x0028:
            if (r3 != 0) goto L_0x002c
        L_0x002a:
            r3 = r2
            goto L_0x003b
        L_0x002c:
            boolean r4 = r3.f()
            if (r4 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            if (r3 != 0) goto L_0x0037
            goto L_0x002a
        L_0x0037:
            m0.r.t.a.r.g.b r3 = r3.i()
        L_0x003b:
            m0.r.t.a.r.e.a.u.c r4 = r5.c
            m0.r.t.a.r.e.a.u.a r4 = r4.a
            m0.r.t.a.r.e.a.u.b r4 = r4.t
            boolean r4 = r4.c()
            boolean r3 = m0.r.t.a.r.b.h.a(r3, r4)
            if (r3 == 0) goto L_0x0012
        L_0x004b:
            if (r0 != 0) goto L_0x004e
            return r2
        L_0x004e:
            m0.r.t.a.r.c.r$a r2 = r6.s()
            java.util.List r6 = r6.h()
            m0.n.b.i.d(r6, r1)
            r1 = 1
            java.util.List r6 = m0.j.g.m(r6, r1)
            m0.r.t.a.r.c.r$a r6 = r2.a(r6)
            m0.r.t.a.r.m.v r0 = r0.getType()
            java.util.List r0 = r0.H0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            m0.r.t.a.r.m.m0 r0 = (m0.r.t.a.r.m.m0) r0
            m0.r.t.a.r.m.v r0 = r0.getType()
            m0.r.t.a.r.c.r$a r6 = r6.e(r0)
            m0.r.t.a.r.c.r r6 = r6.build()
            m0.r.t.a.r.c.g0 r6 = (m0.r.t.a.r.c.g0) r6
            r0 = r6
            m0.r.t.a.r.c.t0.d0 r0 = (m0.r.t.a.r.c.t0.d0) r0
            if (r0 != 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r0.n2 = r1
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.D(m0.r.t.a.r.c.g0):m0.r.t.a.r.c.g0");
    }

    public final boolean E(c0 c0Var, l<? super m0.r.t.a.r.g.d, ? extends Collection<? extends g0>> lVar) {
        if (i0.j.f.p.h.n2(c0Var)) {
            return false;
        }
        g0 I = I(c0Var, lVar);
        g0 J = J(c0Var, lVar);
        if (I == null) {
            return false;
        }
        if (!c0Var.i0()) {
            return true;
        }
        if (J == null || J.j() != I.j()) {
            return false;
        }
        return true;
    }

    public final boolean F(m0.r.t.a.r.c.a aVar, m0.r.t.a.r.c.a aVar2) {
        OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.b.n(aVar2, aVar, true).c();
        i.d(c, "DEFAULT.isOverridableByWithoutExternalConditions(superDescriptor, this, true).result");
        if (c != OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE || m0.r.t.a.r.e.a.n.c(aVar2, aVar)) {
            return false;
        }
        return true;
    }

    public final boolean G(g0 g0Var, r rVar) {
        b bVar = b.m;
        i.e(g0Var, "<this>");
        if (i.a(g0Var.getName().b(), "removeAt") && i.a(m0.r.t.a.r.e.b.n.c(g0Var), SpecialGenericSignatures.h.b)) {
            rVar = rVar.a();
        }
        i.d(rVar, "if (superDescriptor.isRemoveAtByIndex) subDescriptor.original else subDescriptor");
        return F(rVar, g0Var);
    }

    public final g0 H(c0 c0Var, String str, l<? super m0.r.t.a.r.g.d, ? extends Collection<? extends g0>> lVar) {
        g0 g0Var;
        m0.r.t.a.r.g.d g = m0.r.t.a.r.g.d.g(str);
        i.d(g, "identifier(getterName)");
        Iterator it = ((Iterable) lVar.invoke(g)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.h().size() == 0) {
                m0.r.t.a.r.m.x0.d dVar = m0.r.t.a.r.m.x0.d.a;
                v returnType = g0Var2.getReturnType();
                if (returnType == null ? false : dVar.d(returnType, c0Var.getType())) {
                    g0Var = g0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    public final g0 I(c0 c0Var, l<? super m0.r.t.a.r.g.d, ? extends Collection<? extends g0>> lVar) {
        d0 getter = c0Var.getGetter();
        String str = null;
        d0 d0Var = getter == null ? null : (d0) i0.j.f.p.h.x1(getter);
        if (d0Var != null) {
            str = ClassicBuiltinSpecialProperties.a.a(d0Var);
        }
        if (str != null && !i0.j.f.p.h.Q1(this.n, d0Var)) {
            return H(c0Var, str, lVar);
        }
        p pVar = p.a;
        String b = c0Var.getName().b();
        i.d(b, "name.asString()");
        return H(c0Var, p.a(b), lVar);
    }

    public final g0 J(c0 c0Var, l<? super m0.r.t.a.r.g.d, ? extends Collection<? extends g0>> lVar) {
        g0 g0Var;
        v returnType;
        p pVar = p.a;
        String b = c0Var.getName().b();
        i.d(b, "name.asString()");
        m0.r.t.a.r.g.d g = m0.r.t.a.r.g.d.g(p.b(b));
        i.d(g, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator it = ((Iterable) lVar.invoke(g)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.h().size() == 1 && (returnType = g0Var2.getReturnType()) != null && f.N(returnType)) {
                m0.r.t.a.r.m.x0.d dVar = m0.r.t.a.r.m.x0.d.a;
                List<o0> h = g0Var2.h();
                i.d(h, "descriptor.valueParameters");
                if (dVar.b(((o0) m0.j.g.j0(h)).getType(), c0Var.getType())) {
                    g0Var = g0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    public final m0.r.t.a.r.c.p K(d dVar) {
        m0.r.t.a.r.c.p visibility = dVar.getVisibility();
        i.d(visibility, "classDescriptor.visibility");
        if (!i.a(visibility, m.b)) {
            return visibility;
        }
        m0.r.t.a.r.c.p pVar = m.c;
        i.d(pVar, "PROTECTED_AND_PACKAGE");
        return pVar;
    }

    public final Set<g0> L(m0.r.t.a.r.g.d dVar) {
        Collection<v> B = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (v o2 : B) {
            m0.j.g.b(linkedHashSet, o2.o().a(dVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    public final Set<c0> M(m0.r.t.a.r.g.d dVar) {
        Collection<v> B = B();
        ArrayList arrayList = new ArrayList();
        for (v o2 : B) {
            Collection<? extends c0> c = o2.o().c(dVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(i0.j.f.p.h.K(c, 10));
            for (c0 add : c) {
                arrayList2.add(add);
            }
            m0.j.g.b(arrayList, arrayList2);
        }
        return m0.j.g.D0(arrayList);
    }

    public final boolean N(g0 g0Var, r rVar) {
        String b = m0.r.t.a.r.e.b.n.b(g0Var, false, false, 2);
        r a = rVar.a();
        i.d(a, "builtinWithErasedParameters.original");
        if (!i.a(b, m0.r.t.a.r.e.b.n.b(a, false, false, 2)) || F(g0Var, rVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        if (kotlin.text.StringsKt__IndentKt.J(r3, "set", false, 2) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x00eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O(m0.r.t.a.r.c.g0 r12) {
        /*
            r11 = this;
            m0.r.t.a.r.g.d r0 = r12.getName()
            java.lang.String r1 = "function.name"
            m0.n.b.i.d(r0, r1)
            java.lang.String r1 = "name"
            m0.n.b.i.e(r0, r1)
            java.lang.String r2 = r0.b()
            java.lang.String r3 = "name.asString()"
            m0.n.b.i.d(r2, r3)
            m0.r.t.a.r.e.a.p r3 = m0.r.t.a.r.e.a.p.a
            m0.n.b.i.e(r2, r1)
            java.lang.String r3 = "get"
            r4 = 0
            r5 = 2
            boolean r6 = kotlin.text.StringsKt__IndentKt.J(r2, r3, r4, r5)
            java.lang.String r7 = "is"
            r8 = 1
            if (r6 != 0) goto L_0x0032
            boolean r6 = kotlin.text.StringsKt__IndentKt.J(r2, r7, r4, r5)
            if (r6 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r6 = r4
            goto L_0x0033
        L_0x0032:
            r6 = r8
        L_0x0033:
            java.lang.String r9 = "methodName"
            java.lang.String r10 = "set"
            if (r6 == 0) goto L_0x0050
            m0.n.b.i.e(r0, r9)
            r2 = 0
            r6 = 12
            m0.r.t.a.r.g.d r3 = i0.j.f.p.h.k3(r0, r3, r4, r2, r6)
            if (r3 != 0) goto L_0x004b
            r3 = 8
            m0.r.t.a.r.g.d r3 = i0.j.f.p.h.k3(r0, r7, r4, r2, r3)
        L_0x004b:
            java.util.List r0 = m0.j.g.L(r3)
            goto L_0x0082
        L_0x0050:
            m0.n.b.i.e(r2, r1)
            boolean r2 = kotlin.text.StringsKt__IndentKt.J(r2, r10, r4, r5)
            if (r2 == 0) goto L_0x006f
            m0.n.b.i.e(r0, r9)
            m0.r.t.a.r.g.d[] r2 = new m0.r.t.a.r.g.d[r5]
            m0.r.t.a.r.g.d r3 = i0.j.f.p.h.j3(r0, r4)
            r2[r4] = r3
            m0.r.t.a.r.g.d r0 = i0.j.f.p.h.j3(r0, r8)
            r2[r8] = r0
            java.util.List r0 = m0.j.g.M(r2)
            goto L_0x0082
        L_0x006f:
            m0.r.t.a.r.e.a.c r2 = m0.r.t.a.r.e.a.c.a
            java.lang.String r2 = "name1"
            m0.n.b.i.e(r0, r2)
            java.util.Map<m0.r.t.a.r.g.d, java.util.List<m0.r.t.a.r.g.d>> r2 = m0.r.t.a.r.e.a.c.c
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0082
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.c
        L_0x0082:
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x008e
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x008e
            goto L_0x00f2
        L_0x008e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0092:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f2
            java.lang.Object r2 = r0.next()
            m0.r.t.a.r.g.d r2 = (m0.r.t.a.r.g.d) r2
            java.util.Set r2 = r11.M(r2)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x00ad
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00ad
            goto L_0x00ed
        L_0x00ad:
            java.util.Iterator r2 = r2.iterator()
        L_0x00b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ed
            java.lang.Object r3 = r2.next()
            m0.r.t.a.r.c.c0 r3 = (m0.r.t.a.r.c.c0) r3
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 r6 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
            r6.<init>(r12, r11)
            boolean r6 = r11.E(r3, r6)
            if (r6 == 0) goto L_0x00e8
            boolean r3 = r3.i0()
            if (r3 != 0) goto L_0x00e6
            m0.r.t.a.r.e.a.p r3 = m0.r.t.a.r.e.a.p.a
            m0.r.t.a.r.g.d r3 = r12.getName()
            java.lang.String r3 = r3.b()
            java.lang.String r6 = "function.name.asString()"
            m0.n.b.i.d(r3, r6)
            m0.n.b.i.e(r3, r1)
            boolean r3 = kotlin.text.StringsKt__IndentKt.J(r3, r10, r4, r5)
            if (r3 != 0) goto L_0x00e8
        L_0x00e6:
            r3 = r8
            goto L_0x00e9
        L_0x00e8:
            r3 = r4
        L_0x00e9:
            if (r3 == 0) goto L_0x00b1
            r2 = r8
            goto L_0x00ee
        L_0x00ed:
            r2 = r4
        L_0x00ee:
            if (r2 == 0) goto L_0x0092
            r0 = r8
            goto L_0x00f3
        L_0x00f2:
            r0 = r4
        L_0x00f3:
            if (r0 == 0) goto L_0x00f6
            return r4
        L_0x00f6:
            m0.r.t.a.r.e.a.b r0 = m0.r.t.a.r.e.a.b.m
            m0.r.t.a.r.g.d r0 = r12.getName()
            m0.n.b.i.d(r0, r1)
            m0.n.b.i.e(r0, r1)
            java.util.Map<m0.r.t.a.r.g.d, java.util.List<m0.r.t.a.r.g.d>> r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.l
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x010e
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.c
        L_0x010e:
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x011a
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x011a
            goto L_0x0199
        L_0x011a:
            java.util.Iterator r0 = r0.iterator()
        L_0x011e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0199
            java.lang.Object r2 = r0.next()
            m0.r.t.a.r.g.d r2 = (m0.r.t.a.r.g.d) r2
            java.util.Set r3 = r11.L(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0137:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0158
            java.lang.Object r6 = r3.next()
            r7 = r6
            m0.r.t.a.r.c.g0 r7 = (m0.r.t.a.r.c.g0) r7
            java.lang.String r9 = "<this>"
            m0.n.b.i.e(r7, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r7 = i0.j.f.p.h.x1(r7)
            if (r7 == 0) goto L_0x0151
            r7 = r8
            goto L_0x0152
        L_0x0151:
            r7 = r4
        L_0x0152:
            if (r7 == 0) goto L_0x0137
            r5.add(r6)
            goto L_0x0137
        L_0x0158:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x015f
            goto L_0x0194
        L_0x015f:
            m0.r.t.a.r.c.r$a r3 = r12.s()
            r3.p(r2)
            r3.q()
            r3.d()
            m0.r.t.a.r.c.r r2 = r3.build()
            m0.r.t.a.r.c.g0 r2 = (m0.r.t.a.r.c.g0) r2
            m0.n.b.i.c(r2)
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x017c
            goto L_0x0194
        L_0x017c:
            java.util.Iterator r3 = r5.iterator()
        L_0x0180:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0194
            java.lang.Object r5 = r3.next()
            m0.r.t.a.r.c.g0 r5 = (m0.r.t.a.r.c.g0) r5
            boolean r5 = r11.G(r5, r2)
            if (r5 == 0) goto L_0x0180
            r2 = r8
            goto L_0x0195
        L_0x0194:
            r2 = r4
        L_0x0195:
            if (r2 == 0) goto L_0x011e
            r0 = r8
            goto L_0x019a
        L_0x0199:
            r0 = r4
        L_0x019a:
            if (r0 != 0) goto L_0x023a
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m
            m0.r.t.a.r.g.d r2 = r12.getName()
            m0.n.b.i.d(r2, r1)
            boolean r0 = r0.b(r2)
            if (r0 != 0) goto L_0x01ac
            goto L_0x01f7
        L_0x01ac:
            m0.r.t.a.r.g.d r0 = r12.getName()
            m0.n.b.i.d(r0, r1)
            java.util.Set r0 = r11.L(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x01c0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01d8
            java.lang.Object r3 = r0.next()
            m0.r.t.a.r.c.g0 r3 = (m0.r.t.a.r.c.g0) r3
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r5 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m
            m0.r.t.a.r.c.r r3 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.a(r3)
            if (r3 == 0) goto L_0x01c0
            r2.add(r3)
            goto L_0x01c0
        L_0x01d8:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01df
            goto L_0x01f7
        L_0x01df:
            java.util.Iterator r0 = r2.iterator()
        L_0x01e3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01f7
            java.lang.Object r2 = r0.next()
            m0.r.t.a.r.c.r r2 = (m0.r.t.a.r.c.r) r2
            boolean r2 = r11.N(r12, r2)
            if (r2 == 0) goto L_0x01e3
            r0 = r8
            goto L_0x01f8
        L_0x01f7:
            r0 = r4
        L_0x01f8:
            if (r0 != 0) goto L_0x023a
            m0.r.t.a.r.c.g0 r0 = r11.D(r12)
            if (r0 != 0) goto L_0x0201
            goto L_0x0236
        L_0x0201:
            m0.r.t.a.r.g.d r12 = r12.getName()
            m0.n.b.i.d(r12, r1)
            java.util.Set r12 = r11.L(r12)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0213
            goto L_0x0236
        L_0x0213:
            java.util.Iterator r12 = r12.iterator()
        L_0x0217:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0236
            java.lang.Object r1 = r12.next()
            m0.r.t.a.r.c.g0 r1 = (m0.r.t.a.r.c.g0) r1
            boolean r2 = r1.isSuspend()
            if (r2 == 0) goto L_0x0231
            boolean r1 = r11.F(r0, r1)
            if (r1 == 0) goto L_0x0231
            r1 = r8
            goto L_0x0232
        L_0x0231:
            r1 = r4
        L_0x0232:
            if (r1 == 0) goto L_0x0217
            r12 = r8
            goto L_0x0237
        L_0x0236:
            r12 = r4
        L_0x0237:
            if (r12 != 0) goto L_0x023a
            r4 = r8
        L_0x023a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.O(m0.r.t.a.r.c.g0):boolean");
    }

    public void P(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        i0.j.f.p.h.p3(this.c.a.n, bVar, this.n, dVar);
    }

    public Collection<g0> a(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        P(dVar, bVar);
        return super.a(dVar, bVar);
    }

    public Collection<c0> c(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        P(dVar, bVar);
        return super.c(dVar, bVar);
    }

    public m0.r.t.a.r.c.f f(m0.r.t.a.r.g.d dVar, m0.r.t.a.r.d.a.b bVar) {
        m0.r.t.a.r.l.g<m0.r.t.a.r.g.d, m0.r.t.a.r.c.t0.h> gVar;
        i.e(dVar, "name");
        i.e(bVar, "location");
        P(dVar, bVar);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.d;
        m0.r.t.a.r.c.t0.h hVar = null;
        if (!(lazyJavaClassMemberScope == null || (gVar = lazyJavaClassMemberScope.t) == null)) {
            hVar = gVar.invoke(dVar);
        }
        return hVar == null ? this.t.invoke(dVar) : hVar;
    }

    public Set<m0.r.t.a.r.g.d> h(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        return m0.j.g.d0((Set) this.r.invoke(), ((Map) this.s.invoke()).keySet());
    }

    public Set i(m0.r.t.a.r.j.u.d dVar, l lVar) {
        i.e(dVar, "kindFilter");
        Collection<v> b = this.n.i().b();
        i.d(b, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (v o2 : b) {
            m0.j.g.b(linkedHashSet, o2.o().b());
        }
        linkedHashSet.addAll(((a) this.f.invoke()).a());
        linkedHashSet.addAll(((a) this.f.invoke()).d());
        linkedHashSet.addAll(h(dVar, lVar));
        return linkedHashSet;
    }

    public void j(Collection<g0> collection, m0.r.t.a.r.g.d dVar) {
        boolean z;
        Collection<g0> collection2 = collection;
        m0.r.t.a.r.g.d dVar2 = dVar;
        i.e(collection2, "result");
        i.e(dVar2, "name");
        if (this.o.r() && ((a) this.f.invoke()).b(dVar2) != null) {
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((g0) it.next()).h().isEmpty()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                m0.r.t.a.r.e.a.w.v b = ((a) this.f.invoke()).b(dVar2);
                i.c(b);
                JavaMethodDescriptor V0 = JavaMethodDescriptor.V0(this.n, i0.j.f.p.h.z3(this.c, b), b.getName(), this.c.a.j.a(b), true);
                i.d(V0, "createJavaMethod(\n            ownerDescriptor, annotations, recordComponent.name, c.components.sourceElementFactory.source(recordComponent), true\n        )");
                v e = this.c.e.e(b.getType(), m0.r.t.a.r.e.a.u.h.c.c(TypeUsage.COMMON, false, (m0) null, 2));
                f0 p2 = p();
                EmptyList emptyList = EmptyList.c;
                V0.U0((f0) null, p2, emptyList, emptyList, e, Modality.Companion.a(false, false, true), o.e, (Map<? extends a.C0250a<?>, ?>) null);
                V0.W0(false, false);
                Objects.requireNonNull((d.a) this.c.a.g);
                collection2.add(V0);
            }
        }
    }

    public m0.r.t.a.r.e.a.u.g.a k() {
        return new ClassDeclaredMemberIndex(this.o, LazyJavaClassMemberScope$computeMemberIndex$1.c);
    }

    public void m(Collection<g0> collection, m0.r.t.a.r.g.d dVar) {
        boolean z;
        i.e(collection, "result");
        i.e(dVar, "name");
        Set<g0> L = L(dVar);
        b bVar = b.m;
        i.e(dVar, "<this>");
        if (!SpecialGenericSignatures.k.contains(dVar) && !BuiltinMethodsWithSpecialGenericSignature.m.b(dVar)) {
            if (!L.isEmpty()) {
                Iterator<T> it = L.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((r) it.next()).isSuspend()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (T next : L) {
                    if (O((g0) next)) {
                        arrayList.add(next);
                    }
                }
                y(collection, dVar, arrayList, false);
                return;
            }
        }
        j a = j.b.a();
        Collection<D> C3 = i0.j.f.p.h.C3(dVar, L, EmptyList.c, this.n, m0.r.t.a.r.k.b.l.a, this.c.a.u.a());
        i.d(C3, "resolveOverridesForNonStaticMembers(\n            name, functionsFromSupertypes, emptyList(), ownerDescriptor, ErrorReporter.DO_NOTHING,\n            c.components.kotlinTypeChecker.overridingUtil\n        )");
        m0.r.t.a.r.g.d dVar2 = dVar;
        Collection<g0> collection2 = collection;
        Collection<D> collection3 = C3;
        z(dVar2, collection2, collection3, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        z(dVar2, collection2, collection3, a, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : L) {
            if (O((g0) next2)) {
                arrayList2.add(next2);
            }
        }
        y(collection, dVar, m0.j.g.Z(arrayList2, a), true);
    }

    public void n(m0.r.t.a.r.g.d dVar, Collection<c0> collection) {
        q qVar;
        i.e(dVar, "name");
        i.e(collection, "result");
        if (this.o.q() && (qVar = (q) m0.j.g.k0(((m0.r.t.a.r.e.a.u.g.a) this.f.invoke()).f(dVar))) != null) {
            Modality modality = Modality.FINAL;
            m0.r.t.a.r.e.a.t.f M0 = m0.r.t.a.r.e.a.t.f.M0(this.n, i0.j.f.p.h.z3(this.c, qVar), modality, i0.j.f.p.h.h4(qVar.getVisibility()), false, qVar.getName(), this.c.a.j.a(qVar), false);
            i.d(M0, "create(\n            ownerDescriptor, annotations, modality, method.visibility.toDescriptorVisibility(),\n            /* isVar = */ false, method.name, c.components.sourceElementFactory.source(method),\n            /* isStaticFinal = */ false\n        )");
            Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
            a0 g02 = i0.j.f.p.h.g0(M0, f.a.b);
            i.d(g02, "createDefaultGetter(propertyDescriptor, Annotations.EMPTY)");
            M0.o2 = g02;
            M0.p2 = null;
            M0.r2 = null;
            M0.s2 = null;
            v l = l(qVar, i0.j.f.p.h.G(this.c, M0, qVar, 0, 4));
            M0.L0(l, EmptyList.c, p(), (f0) null);
            g02.f2 = l;
            collection.add(M0);
        }
        Set<c0> M = M(dVar);
        if (!M.isEmpty()) {
            j a = j.b.a();
            j a2 = j.b.a();
            A(M, collection, a, new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
            A(m0.j.g.S(M, a), a2, (Set<c0>) null, new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
            Set<T> d0 = m0.j.g.d0(M, a2);
            m0.r.t.a.r.c.d dVar2 = this.n;
            m0.r.t.a.r.e.a.u.a aVar = this.c.a;
            Collection<D> C3 = i0.j.f.p.h.C3(dVar, d0, collection, dVar2, aVar.f, aVar.u.a());
            i.d(C3, "resolveOverridesForNonStaticMembers(\n                name,\n                propertiesFromSupertypes + propertiesOverridesFromSuperTypes,\n                result,\n                ownerDescriptor,\n                c.components.errorReporter,\n                c.components.kotlinTypeChecker.overridingUtil\n            )");
            collection.addAll(C3);
        }
    }

    public Set<m0.r.t.a.r.g.d> o(m0.r.t.a.r.j.u.d dVar, l<? super m0.r.t.a.r.g.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        if (this.o.q()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((m0.r.t.a.r.e.a.u.g.a) this.f.invoke()).e());
        Collection<v> b = this.n.i().b();
        i.d(b, "ownerDescriptor.typeConstructor.supertypes");
        for (v o2 : b) {
            m0.j.g.b(linkedHashSet, o2.o().d());
        }
        return linkedHashSet;
    }

    public f0 p() {
        m0.r.t.a.r.c.d dVar = this.n;
        int i = m0.r.t.a.r.j.d.a;
        if (dVar != null) {
            return dVar.G0();
        }
        m0.r.t.a.r.j.d.a(0);
        throw null;
    }

    public m0.r.t.a.r.c.i q() {
        return this.n;
    }

    public boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        i.e(javaMethodDescriptor, "<this>");
        if (this.o.q()) {
            return false;
        }
        return O(javaMethodDescriptor);
    }

    public LazyJavaScope.a s(q qVar, List<? extends m0> list, v vVar, List<? extends o0> list2) {
        i.e(qVar, "method");
        i.e(list, "methodTypeParameters");
        i.e(vVar, "returnType");
        i.e(list2, "valueParameters");
        m0.r.t.a.r.e.a.s.e eVar = this.c.a.e;
        m0.r.t.a.r.c.d dVar = this.n;
        Objects.requireNonNull((e.a) eVar);
        if (dVar != null) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                i.d(vVar, "propagated.returnType");
                i.d(list2, "propagated.valueParameters");
                i.d(list, "propagated.typeParameters");
                i.d(emptyList, "propagated.errors");
                return new LazyJavaScope.a(vVar, (v) null, list2, list, false, emptyList);
            }
            e.b.a(3);
            throw null;
        }
        e.a.a(1);
        throw null;
    }

    public String toString() {
        return i.k("Lazy Java member scope for ", this.o.d());
    }

    public final void x(List<o0> list, m0.r.t.a.r.c.h hVar, int i, q qVar, v vVar, v vVar2) {
        v vVar3;
        Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
        m0.r.t.a.r.c.r0.f fVar = f.a.b;
        m0.r.t.a.r.g.d name = qVar.getName();
        v i2 = s0.i(vVar);
        i.d(i2, "makeNotNullable(returnType)");
        boolean K = qVar.K();
        if (vVar2 == null) {
            vVar3 = null;
        } else {
            vVar3 = s0.i(vVar2);
        }
        List<o0> list2 = list;
        list.add(new ValueParameterDescriptorImpl(hVar, (o0) null, i, fVar, name, i2, K, false, false, vVar3, this.c.a.j.a(qVar)));
    }

    public final void y(Collection<g0> collection, m0.r.t.a.r.g.d dVar, Collection<? extends g0> collection2, boolean z) {
        m0.r.t.a.r.c.d dVar2 = this.n;
        m0.r.t.a.r.e.a.u.a aVar = this.c.a;
        Collection<D> C3 = i0.j.f.p.h.C3(dVar, collection2, collection, dVar2, aVar.f, aVar.u.a());
        i.d(C3, "resolveOverridesForNonStaticMembers(\n            name, functionsFromSupertypes, result, ownerDescriptor, c.components.errorReporter,\n            c.components.kotlinTypeChecker.overridingUtil\n        )");
        if (!z) {
            collection.addAll(C3);
            return;
        }
        List<T> Z = m0.j.g.Z(collection, C3);
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(C3, 10));
        for (D d : C3) {
            g0 g0Var = (g0) i0.j.f.p.h.y1(d);
            if (g0Var == null) {
                i.d(d, "resolvedOverride");
            } else {
                i.d(d, "resolvedOverride");
                d = C(d, g0Var, Z);
            }
            arrayList.add(d);
        }
        collection.addAll(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(m0.r.t.a.r.g.d r17, java.util.Collection<? extends m0.r.t.a.r.c.g0> r18, java.util.Collection<? extends m0.r.t.a.r.c.g0> r19, java.util.Collection<m0.r.t.a.r.c.g0> r20, m0.n.a.l<? super m0.r.t.a.r.g.d, ? extends java.util.Collection<? extends m0.r.t.a.r.c.g0>> r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r20
            r3 = r21
            java.util.Iterator r4 = r19.iterator()
        L_0x000c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0156
            java.lang.Object r5 = r4.next()
            m0.r.t.a.r.c.g0 r5 = (m0.r.t.a.r.c.g0) r5
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = i0.j.f.p.h.x1(r5)
            m0.r.t.a.r.c.g0 r6 = (m0.r.t.a.r.c.g0) r6
            if (r6 != 0) goto L_0x0023
        L_0x0020:
            r10 = r17
            goto L_0x006c
        L_0x0023:
            java.lang.String r8 = i0.j.f.p.h.q1(r6)
            m0.n.b.i.c(r8)
            m0.r.t.a.r.g.d r8 = m0.r.t.a.r.g.d.g(r8)
            java.lang.String r9 = "identifier(nameInJava)"
            m0.n.b.i.d(r8, r9)
            java.lang.Object r8 = r3.invoke(r8)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x003d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0020
            java.lang.Object r9 = r8.next()
            m0.r.t.a.r.c.g0 r9 = (m0.r.t.a.r.c.g0) r9
            m0.r.t.a.r.c.r$a r9 = r9.s()
            r10 = r17
            r9.p(r10)
            r9.q()
            r9.d()
            m0.r.t.a.r.c.r r9 = r9.build()
            m0.r.t.a.r.c.g0 r9 = (m0.r.t.a.r.c.g0) r9
            m0.n.b.i.c(r9)
            boolean r11 = r0.G(r6, r9)
            if (r11 == 0) goto L_0x003d
            m0.r.t.a.r.c.g0 r6 = r0.C(r9, r6, r1)
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            m0.r.t.a.r.m.a1.a.N(r2, r6)
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r6 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m
            m0.r.t.a.r.c.r r6 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.a(r5)
            if (r6 != 0) goto L_0x007a
            goto L_0x010f
        L_0x007a:
            m0.r.t.a.r.g.d r8 = r6.getName()
            java.lang.String r9 = "overridden.name"
            m0.n.b.i.d(r8, r9)
            java.lang.Object r8 = r3.invoke(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x008d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00a1
            java.lang.Object r9 = r8.next()
            r11 = r9
            m0.r.t.a.r.c.g0 r11 = (m0.r.t.a.r.c.g0) r11
            boolean r11 = r0.N(r11, r6)
            if (r11 == 0) goto L_0x008d
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            m0.r.t.a.r.c.g0 r9 = (m0.r.t.a.r.c.g0) r9
            if (r9 != 0) goto L_0x00a8
            r7 = 0
            goto L_0x0102
        L_0x00a8:
            m0.r.t.a.r.c.r$a r8 = r9.s()
            java.util.List r11 = r6.h()
            java.lang.String r12 = "overridden.valueParameters"
            m0.n.b.i.d(r11, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = i0.j.f.p.h.K(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L_0x00c4:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00e6
            java.lang.Object r13 = r11.next()
            m0.r.t.a.r.c.o0 r13 = (m0.r.t.a.r.c.o0) r13
            m0.r.t.a.r.e.a.t.j r14 = new m0.r.t.a.r.e.a.t.j
            m0.r.t.a.r.m.v r15 = r13.getType()
            java.lang.String r7 = "it.type"
            m0.n.b.i.d(r15, r7)
            boolean r7 = r13.s0()
            r14.<init>(r15, r7)
            r12.add(r14)
            goto L_0x00c4
        L_0x00e6:
            java.util.List r7 = r9.h()
            java.lang.String r9 = "override.valueParameters"
            m0.n.b.i.d(r7, r9)
            java.util.List r7 = i0.j.f.p.h.Z(r12, r7, r6)
            r8.a(r7)
            r8.q()
            r8.d()
            m0.r.t.a.r.c.r r7 = r8.build()
            m0.r.t.a.r.c.g0 r7 = (m0.r.t.a.r.c.g0) r7
        L_0x0102:
            if (r7 != 0) goto L_0x0105
            goto L_0x010f
        L_0x0105:
            boolean r8 = r0.O(r7)
            if (r8 == 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r7 = 0
        L_0x010d:
            if (r7 != 0) goto L_0x0111
        L_0x010f:
            r6 = 0
            goto L_0x0115
        L_0x0111:
            m0.r.t.a.r.c.g0 r6 = r0.C(r7, r6, r1)
        L_0x0115:
            m0.r.t.a.r.m.a1.a.N(r2, r6)
            boolean r6 = r5.isSuspend()
            if (r6 != 0) goto L_0x011f
            goto L_0x0150
        L_0x011f:
            m0.r.t.a.r.g.d r6 = r5.getName()
            java.lang.String r7 = "descriptor.name"
            m0.n.b.i.d(r6, r7)
            java.lang.Object r6 = r3.invoke(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0132:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0150
            java.lang.Object r7 = r6.next()
            m0.r.t.a.r.c.g0 r7 = (m0.r.t.a.r.c.g0) r7
            m0.r.t.a.r.c.g0 r7 = r0.D(r7)
            if (r7 != 0) goto L_0x0145
            goto L_0x014c
        L_0x0145:
            boolean r8 = r0.F(r7, r5)
            if (r8 == 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            r7 = 0
        L_0x014d:
            if (r7 == 0) goto L_0x0132
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            m0.r.t.a.r.m.a1.a.N(r2, r7)
            goto L_0x000c
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.z(m0.r.t.a.r.g.d, java.util.Collection, java.util.Collection, java.util.Collection, m0.n.a.l):void");
    }
}
