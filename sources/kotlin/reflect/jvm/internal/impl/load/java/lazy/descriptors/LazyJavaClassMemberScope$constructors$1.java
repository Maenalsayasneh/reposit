package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.e.a.s.d;
import m0.r.t.a.r.e.a.w.k;
import m0.r.t.a.r.e.a.w.q;
import m0.r.t.a.r.e.a.w.w;
import m0.r.t.a.r.e.a.w.x;
import m0.r.t.a.r.e.b.n;
import m0.r.t.a.r.m.v;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$constructors$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ LazyJavaClassMemberScope c;
    public final /* synthetic */ m0.r.t.a.r.e.a.u.c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, m0.r.t.a.r.e.a.u.c cVar) {
        super(0);
        this.c = lazyJavaClassMemberScope;
        this.d = cVar;
    }

    public Object invoke() {
        m0.r.t.a.r.e.a.t.c cVar;
        List list;
        ArrayList arrayList;
        m0.r.t.a.r.e.a.u.h.a aVar;
        Pair pair;
        boolean z;
        Collection<k> k = this.c.o.k();
        ArrayList arrayList2 = new ArrayList(k.size());
        for (k next : k) {
            LazyJavaClassMemberScope lazyJavaClassMemberScope = this.c;
            d dVar = lazyJavaClassMemberScope.n;
            m0.r.t.a.r.e.a.t.c U0 = m0.r.t.a.r.e.a.t.c.U0(dVar, h.z3(lazyJavaClassMemberScope.c, next), false, lazyJavaClassMemberScope.c.a.j.a(next));
            i.d(U0, "createJavaConstructor(\n            classDescriptor,\n            c.resolveAnnotations(constructor), /* isPrimary = */\n            false,\n            c.components.sourceElementFactory.source(constructor)\n        )");
            m0.r.t.a.r.e.a.u.c cVar2 = lazyJavaClassMemberScope.c;
            int size = dVar.t().size();
            i.e(cVar2, "<this>");
            i.e(U0, "containingDeclaration");
            i.e(next, "typeParameterOwner");
            m0.r.t.a.r.e.a.u.c E = h.E(cVar2, U0, next, size, cVar2.c);
            LazyJavaScope.b u = lazyJavaClassMemberScope.u(E, U0, next.h());
            List<m0> t = dVar.t();
            i.d(t, "classDescriptor.declaredTypeParameters");
            List<x> typeParameters = next.getTypeParameters();
            ArrayList arrayList3 = new ArrayList(h.K(typeParameters, 10));
            for (x a : typeParameters) {
                m0 a2 = E.b.a(a);
                i.c(a2);
                arrayList3.add(a2);
            }
            U0.T0(u.a, h.h4(next.getVisibility()), g.Z(t, arrayList3));
            U0.N0(false);
            U0.O0(u.b);
            U0.P0(dVar.q());
            ((d.a) E.a.g).b(next, U0);
            arrayList2.add(U0);
        }
        v vVar = null;
        if (this.c.o.r()) {
            LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.c;
            m0.r.t.a.r.c.d dVar2 = lazyJavaClassMemberScope2.n;
            Objects.requireNonNull(f.i);
            m0.r.t.a.r.e.a.t.c U02 = m0.r.t.a.r.e.a.t.c.U0(dVar2, f.a.b, true, lazyJavaClassMemberScope2.c.a.j.a(lazyJavaClassMemberScope2.o));
            i.d(U02, "createJavaConstructor(\n            classDescriptor, Annotations.EMPTY, /* isPrimary = */ true, c.components.sourceElementFactory.source(jClass)\n        )");
            Collection<m0.r.t.a.r.e.a.w.v> l = lazyJavaClassMemberScope2.o.l();
            ArrayList arrayList4 = new ArrayList(l.size());
            m0.r.t.a.r.e.a.u.h.a c2 = m0.r.t.a.r.e.a.u.h.c.c(TypeUsage.COMMON, false, (m0) null, 2);
            int i = 0;
            for (m0.r.t.a.r.e.a.w.v next2 : l) {
                int i2 = i + 1;
                v e = lazyJavaClassMemberScope2.c.e.e(next2.getType(), c2);
                v g = next2.g() ? lazyJavaClassMemberScope2.c.a.o.m().g(e) : vVar;
                Objects.requireNonNull(f.i);
                ValueParameterDescriptorImpl valueParameterDescriptorImpl = r11;
                ArrayList arrayList5 = arrayList4;
                ValueParameterDescriptorImpl valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(U02, (o0) null, i, f.a.b, next2.getName(), e, false, false, false, g, lazyJavaClassMemberScope2.c.a.j.a(next2));
                arrayList5.add(valueParameterDescriptorImpl);
                arrayList4 = arrayList5;
                i = i2;
                c2 = c2;
                vVar = null;
            }
            U02.O0(false);
            U02.S0(arrayList4, lazyJavaClassMemberScope2.K(dVar2));
            U02.N0(false);
            U02.P0(dVar2.q());
            int i3 = 2;
            String b = n.b(U02, false, false, 2);
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (i.a(n.b((c) it.next(), false, false, i3), b)) {
                        z = false;
                        break;
                    } else {
                        i3 = 2;
                    }
                }
            }
            z = true;
            if (z) {
                arrayList2.add(U02);
                ((d.a) this.d.a.g).b(this.c.o, U02);
            }
        }
        m0.r.t.a.r.e.a.u.c cVar3 = this.d;
        SignatureEnhancement signatureEnhancement = cVar3.a.r;
        LazyJavaClassMemberScope lazyJavaClassMemberScope3 = this.c;
        boolean isEmpty = arrayList2.isEmpty();
        List list2 = arrayList2;
        if (isEmpty) {
            boolean q = lazyJavaClassMemberScope3.o.q();
            if ((lazyJavaClassMemberScope3.o.G() || !lazyJavaClassMemberScope3.o.s()) && !q) {
                cVar = null;
            } else {
                m0.r.t.a.r.c.d dVar3 = lazyJavaClassMemberScope3.n;
                Objects.requireNonNull(f.i);
                m0.r.t.a.r.e.a.t.c U03 = m0.r.t.a.r.e.a.t.c.U0(dVar3, f.a.b, true, lazyJavaClassMemberScope3.c.a.j.a(lazyJavaClassMemberScope3.o));
                i.d(U03, "createJavaConstructor(\n            classDescriptor, Annotations.EMPTY, /* isPrimary = */ true, c.components.sourceElementFactory.source(jClass)\n        )");
                if (q) {
                    Collection<q> L = lazyJavaClassMemberScope3.o.L();
                    list = new ArrayList(L.size());
                    m0.r.t.a.r.e.a.u.h.a c3 = m0.r.t.a.r.e.a.u.h.c.c(TypeUsage.COMMON, true, (m0) null, 2);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (T next3 : L) {
                        if (i.a(((q) next3).getName(), m0.r.t.a.r.e.a.q.b)) {
                            arrayList6.add(next3);
                        } else {
                            arrayList7.add(next3);
                        }
                    }
                    arrayList6.size();
                    q qVar = (q) g.w(arrayList6);
                    if (qVar != null) {
                        w returnType = qVar.getReturnType();
                        if (returnType instanceof m0.r.t.a.r.e.a.w.f) {
                            m0.r.t.a.r.e.a.w.f fVar = (m0.r.t.a.r.e.a.w.f) returnType;
                            pair = new Pair(lazyJavaClassMemberScope3.c.e.c(fVar, c3, true), lazyJavaClassMemberScope3.c.e.e(fVar.n(), c3));
                        } else {
                            pair = new Pair(lazyJavaClassMemberScope3.c.e.e(returnType, c3), null);
                        }
                        arrayList = arrayList7;
                        aVar = c3;
                        lazyJavaClassMemberScope3.x(list, U03, 0, qVar, (v) pair.c, (v) pair.d);
                    } else {
                        arrayList = arrayList7;
                        aVar = c3;
                    }
                    int i4 = qVar != null ? 1 : 0;
                    Iterator it2 = arrayList.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        q qVar2 = (q) it2.next();
                        lazyJavaClassMemberScope3.x(list, U03, i5 + i4, qVar2, lazyJavaClassMemberScope3.c.e.e(qVar2.getReturnType(), aVar), (v) null);
                        i5++;
                    }
                } else {
                    list = Collections.emptyList();
                }
                U03.O0(false);
                U03.S0(list, lazyJavaClassMemberScope3.K(dVar3));
                U03.N0(true);
                U03.P0(dVar3.q());
                ((d.a) lazyJavaClassMemberScope3.c.a.g).b(lazyJavaClassMemberScope3.o, U03);
                cVar = U03;
            }
            list2 = g.L(cVar);
        }
        return g.v0(signatureEnhancement.a(cVar3, list2));
    }
}
