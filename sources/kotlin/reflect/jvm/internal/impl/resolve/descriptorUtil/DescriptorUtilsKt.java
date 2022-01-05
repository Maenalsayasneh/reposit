package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.b0;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.j.r.b;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.m.x0.j;
import m0.r.t.a.r.o.c;

/* compiled from: DescriptorUtils.kt */
public final class DescriptorUtilsKt {
    public static final /* synthetic */ int a = 0;

    /* compiled from: DescriptorUtils.kt */
    public static final class a implements c<o0> {
        public static final a a = new a();

        public Iterable a(Object obj) {
            Collection<o0> e = ((o0) obj).e();
            ArrayList arrayList = new ArrayList(h.K(e, 10));
            for (o0 a2 : e) {
                arrayList.add(a2.a());
            }
            return arrayList;
        }
    }

    static {
        i.d(d.g(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE), "identifier(\"value\")");
    }

    public static final boolean a(o0 o0Var) {
        i.e(o0Var, "<this>");
        Boolean d2 = m0.r.t.a.r.m.a1.a.d2(h.L2(o0Var), a.a, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.c);
        i.d(d2, "ifAny(\n        listOf(this),\n        { current -> current.overriddenDescriptors.map(ValueParameterDescriptor::getOriginal) },\n        ValueParameterDescriptor::declaresDefaultValue\n    )");
        return d2.booleanValue();
    }

    public static final g<?> b(m0.r.t.a.r.c.r0.c cVar) {
        i.e(cVar, "<this>");
        return (g) m0.j.g.v(cVar.a().values());
    }

    public static CallableMemberDescriptor c(CallableMemberDescriptor callableMemberDescriptor, boolean z, l lVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        i.e(callableMemberDescriptor, "<this>");
        i.e(lVar, "predicate");
        return (CallableMemberDescriptor) m0.r.t.a.r.m.a1.a.e1(h.L2(callableMemberDescriptor), new m0.r.t.a.r.j.r.a(z), new b(new Ref$ObjectRef(), lVar));
    }

    public static final m0.r.t.a.r.g.b d(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        m0.r.t.a.r.g.c i = i(iVar);
        if (!i.f()) {
            i = null;
        }
        if (i == null) {
            return null;
        }
        return i.i();
    }

    public static final m0.r.t.a.r.c.d e(m0.r.t.a.r.c.r0.c cVar) {
        i.e(cVar, "<this>");
        f c = cVar.getType().I0().c();
        if (c instanceof m0.r.t.a.r.c.d) {
            return (m0.r.t.a.r.c.d) c;
        }
        return null;
    }

    public static final m0.r.t.a.r.b.f f(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        return k(iVar).m();
    }

    public static final m0.r.t.a.r.g.a g(f fVar) {
        m0.r.t.a.r.c.i b;
        m0.r.t.a.r.g.a g;
        if (fVar == null || (b = fVar.b()) == null) {
            return null;
        }
        if (b instanceof v) {
            return new m0.r.t.a.r.g.a(((v) b).d(), fVar.getName());
        }
        if (!(b instanceof m0.r.t.a.r.c.g) || (g = g((f) b)) == null) {
            return null;
        }
        return g.d(fVar.getName());
    }

    public static final m0.r.t.a.r.g.b h(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        m0.r.t.a.r.g.b h = m0.r.t.a.r.j.d.h(iVar);
        if (h == null) {
            h = m0.r.t.a.r.j.d.i(iVar).i();
        }
        if (h != null) {
            i.d(h, "getFqNameSafe(this)");
            return h;
        }
        m0.r.t.a.r.j.d.a(4);
        throw null;
    }

    public static final m0.r.t.a.r.g.c i(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        m0.r.t.a.r.g.c g = m0.r.t.a.r.j.d.g(iVar);
        i.d(g, "getFqName(this)");
        return g;
    }

    public static final e j(u uVar) {
        e eVar;
        i.e(uVar, "<this>");
        j jVar = (j) uVar.D0(m0.r.t.a.r.m.x0.f.a);
        if (jVar == null) {
            eVar = null;
        } else {
            eVar = (e) jVar.a;
        }
        return eVar == null ? e.a.a : eVar;
    }

    public static final u k(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        u d = m0.r.t.a.r.j.d.d(iVar);
        i.d(d, "getContainingModule(this)");
        return d;
    }

    public static final m0.s.h<m0.r.t.a.r.c.i> l(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        i.e(iVar, "<this>");
        return SequencesKt___SequencesKt.c(m0.r.t.a.r.m.a1.a.C1(iVar, DescriptorUtilsKt$parentsWithSelf$1.c), 1);
    }

    public static final CallableMemberDescriptor m(CallableMemberDescriptor callableMemberDescriptor) {
        i.e(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof b0)) {
            return callableMemberDescriptor;
        }
        c0 x0 = ((b0) callableMemberDescriptor).x0();
        i.d(x0, "correspondingProperty");
        return x0;
    }
}
