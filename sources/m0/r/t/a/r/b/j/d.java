package m0.r.t.a.r.b.j;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.g;
import m0.j.l;
import m0.j.m;
import m0.r.t.a.r.b.e;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.d0;
import m0.r.t.a.r.c.t0.p;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: FunctionInvokeDescriptor.kt */
public final class d extends d0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(i iVar, d dVar, CallableMemberDescriptor.Kind kind, boolean z) {
        super(iVar, dVar, f.a.b, m0.r.t.a.r.n.i.g, kind, h0.a);
        Objects.requireNonNull(f.i);
        this.e2 = true;
        this.n2 = z;
        this.o2 = false;
    }

    public static final d V0(b bVar, boolean z) {
        String str;
        b bVar2 = bVar;
        m0.n.b.i.e(bVar2, "functionClass");
        List<m0> list = bVar2.f2;
        d dVar = new d(bVar2, (d) null, CallableMemberDescriptor.Kind.DECLARATION, z);
        f0 G0 = bVar.G0();
        EmptyList emptyList = EmptyList.c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((m0) next).l() != Variance.IN_VARIANCE) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            arrayList.add(next);
        }
        Iterable E0 = g.E0(arrayList);
        ArrayList arrayList2 = new ArrayList(h.K(E0, 10));
        Iterator it2 = ((m) E0).iterator();
        while (it2.hasNext()) {
            l lVar = (l) it2.next();
            int i = lVar.a;
            m0 m0Var = (m0) lVar.b;
            String b = m0Var.getName().b();
            m0.n.b.i.d(b, "typeParameter.name.asString()");
            if (m0.n.b.i.a(b, "T")) {
                str = "instance";
            } else if (m0.n.b.i.a(b, "E")) {
                str = "receiver";
            } else {
                str = b.toLowerCase();
                m0.n.b.i.d(str, "(this as java.lang.String).toLowerCase()");
            }
            Objects.requireNonNull(f.i);
            f fVar = f.a.b;
            m0.r.t.a.r.g.d g = m0.r.t.a.r.g.d.g(str);
            m0.n.b.i.d(g, "identifier(name)");
            a0 q = m0Var.q();
            m0.n.b.i.d(q, "typeParameter.defaultType");
            h0 h0Var = h0.a;
            m0.n.b.i.d(h0Var, "NO_SOURCE");
            ValueParameterDescriptorImpl valueParameterDescriptorImpl = r2;
            EmptyList emptyList2 = emptyList;
            ArrayList arrayList3 = arrayList2;
            ValueParameterDescriptorImpl valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(dVar, (o0) null, i, fVar, g, q, false, false, false, (v) null, h0Var);
            arrayList3.add(valueParameterDescriptorImpl);
            arrayList2 = arrayList3;
            emptyList = emptyList2;
        }
        dVar.K0((f0) null, G0, emptyList, arrayList2, ((m0) g.G(list)).q(), Modality.ABSTRACT, o.e);
        dVar.p2 = true;
        return dVar;
    }

    public p H0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, m0.r.t.a.r.g.d dVar, f fVar, h0 h0Var) {
        m0.n.b.i.e(iVar, "newOwner");
        m0.n.b.i.e(kind, "kind");
        m0.n.b.i.e(fVar, "annotations");
        m0.n.b.i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
        return new d(iVar, (d) rVar, kind, this.n2);
    }

    public r I0(p.c cVar) {
        boolean z;
        boolean z2;
        m0.r.t.a.r.g.d dVar;
        boolean z3;
        m0.n.b.i.e(cVar, "configuration");
        d dVar2 = (d) super.I0(cVar);
        if (dVar2 == null) {
            return null;
        }
        List<o0> h = dVar2.h();
        m0.n.b.i.d(h, "substituted.valueParameters");
        boolean z4 = false;
        if (!h.isEmpty()) {
            Iterator<T> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v type = ((o0) it.next()).getType();
                m0.n.b.i.d(type, "it.type");
                if (e.b(type) != null) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return dVar2;
        }
        List<o0> h2 = dVar2.h();
        m0.n.b.i.d(h2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(h.K(h2, 10));
        for (o0 type2 : h2) {
            v type3 = type2.getType();
            m0.n.b.i.d(type3, "it.type");
            arrayList.add(e.b(type3));
        }
        int size = dVar2.h().size() - arrayList.size();
        List<o0> h3 = dVar2.h();
        m0.n.b.i.d(h3, "valueParameters");
        ArrayList arrayList2 = new ArrayList(h.K(h3, 10));
        for (o0 o0Var : h3) {
            m0.r.t.a.r.g.d name = o0Var.getName();
            m0.n.b.i.d(name, "it.name");
            int g = o0Var.g();
            int i = g - size;
            if (i >= 0 && (dVar = (m0.r.t.a.r.g.d) arrayList.get(i)) != null) {
                name = dVar;
            }
            arrayList2.add(o0Var.C0(dVar2, name, g));
        }
        p.c L0 = dVar2.L0(TypeSubstitutor.a);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((m0.r.t.a.r.g.d) it2.next()) == null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z4 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        L0.u = Boolean.valueOf(z4);
        L0.g = arrayList2;
        L0.e = dVar2.a();
        m0.n.b.i.d(L0, "newCopyBuilder(TypeSubstitutor.EMPTY)\n                .setHasSynthesizedParameterNames(parameterNames.any { it == null })\n                .setValueParameters(newValueParameters)\n                .setOriginal(original)");
        r I0 = super.I0(L0);
        m0.n.b.i.c(I0);
        return I0;
    }

    public boolean O() {
        return false;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }
}
