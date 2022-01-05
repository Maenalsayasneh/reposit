package m0.r.t.a.r.b.j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.s0.b;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.l.l;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class a implements b {
    public final l a;
    public final u b;

    public a(l lVar, u uVar) {
        i.e(lVar, "storageManager");
        i.e(uVar, "module");
        this.a = lVar;
        this.b = uVar;
    }

    public Collection<d> a(m0.r.t.a.r.g.b bVar) {
        i.e(bVar, "packageFqName");
        return EmptySet.c;
    }

    public boolean b(m0.r.t.a.r.g.b bVar, m0.r.t.a.r.g.d dVar) {
        i.e(bVar, "packageFqName");
        i.e(dVar, "name");
        String b2 = dVar.b();
        i.d(b2, "name.asString()");
        if ((StringsKt__IndentKt.J(b2, "Function", false, 2) || StringsKt__IndentKt.J(b2, "KFunction", false, 2) || StringsKt__IndentKt.J(b2, "SuspendFunction", false, 2) || StringsKt__IndentKt.J(b2, "KSuspendFunction", false, 2)) && FunctionClassKind.Companion.a(b2, bVar) != null) {
            return true;
        }
        return false;
    }

    public d c(m0.r.t.a.r.g.a aVar) {
        i.e(aVar, "classId");
        if (aVar.c || aVar.k()) {
            return null;
        }
        String b2 = aVar.i().b();
        i.d(b2, "classId.relativeClassName.asString()");
        if (!StringsKt__IndentKt.d(b2, "Function", false, 2)) {
            return null;
        }
        m0.r.t.a.r.g.b h = aVar.h();
        i.d(h, "classId.packageFqName");
        FunctionClassKind.a.C0236a a2 = FunctionClassKind.Companion.a(b2, h);
        if (a2 == null) {
            return null;
        }
        FunctionClassKind functionClassKind = a2.a;
        int i = a2.b;
        List<v> F = this.b.M(h).F();
        ArrayList arrayList = new ArrayList();
        for (T next : F) {
            if (next instanceof m0.r.t.a.r.b.a) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (next2 instanceof m0.r.t.a.r.b.d) {
                arrayList2.add(next2);
            }
        }
        v vVar = (m0.r.t.a.r.b.d) g.w(arrayList2);
        if (vVar == null) {
            vVar = (m0.r.t.a.r.b.a) g.u(arrayList);
        }
        return new b(this.a, vVar, functionClassKind, i);
    }
}
