package m0.r.t.a.r.j;

import i0.j.f.p.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.l;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.m.v;

/* compiled from: SealedClassInheritorsProvider.kt */
public final class a extends n {
    public static final a a = new a();

    public static final void a(d dVar, LinkedHashSet<d> linkedHashSet, MemberScope memberScope, boolean z) {
        boolean z2;
        for (i iVar : h.Y0(memberScope, m0.r.t.a.r.j.u.d.o, (l) null, 2, (Object) null)) {
            if (iVar instanceof d) {
                d dVar2 = (d) iVar;
                int i = d.a;
                if (dVar2 != null) {
                    Iterator<v> it = dVar2.i().b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (d.u(it.next(), dVar.a())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        linkedHashSet.add(iVar);
                    }
                    if (z) {
                        MemberScope w0 = dVar2.w0();
                        m0.n.b.i.d(w0, "descriptor.unsubstitutedInnerClassesScope");
                        a(dVar, linkedHashSet, w0, z);
                    }
                } else {
                    d.a(24);
                    throw null;
                }
            }
        }
    }
}
