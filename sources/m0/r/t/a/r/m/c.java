package m0.r.t.a.r.m;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.x0.b;
import m0.r.t.a.r.m.z0.f;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.j;

/* compiled from: AbstractTypeChecker.kt */
public final class c {
    public static final boolean a(AbstractTypeCheckerContext abstractTypeCheckerContext, g gVar, AbstractTypeCheckerContext.a aVar) {
        i.e(abstractTypeCheckerContext, "<this>");
        i.e(gVar, "type");
        i.e(aVar, "supertypesPolicy");
        if (!((abstractTypeCheckerContext.D(gVar) && !h.p2((b) abstractTypeCheckerContext, gVar)) || abstractTypeCheckerContext.E(gVar))) {
            abstractTypeCheckerContext.C();
            ArrayDeque<g> arrayDeque = abstractTypeCheckerContext.c;
            i.c(arrayDeque);
            Set<g> set = abstractTypeCheckerContext.d;
            i.c(set);
            arrayDeque.push(gVar);
            while (!arrayDeque.isEmpty()) {
                if (set.size() <= 1000) {
                    g pop = arrayDeque.pop();
                    i.d(pop, "current");
                    if (set.add(pop)) {
                        b bVar = (b) abstractTypeCheckerContext;
                        AbstractTypeCheckerContext.a aVar2 = h.p2(bVar, pop) ? AbstractTypeCheckerContext.a.c.a : aVar;
                        if (!(!i.a(aVar2, AbstractTypeCheckerContext.a.c.a))) {
                            aVar2 = null;
                        }
                        if (aVar2 == null) {
                            continue;
                        } else {
                            for (f a : bVar.W(h.s4(bVar, pop))) {
                                g a2 = aVar2.a(abstractTypeCheckerContext, a);
                                if ((abstractTypeCheckerContext.D(a2) && !h.p2(bVar, a2)) || abstractTypeCheckerContext.E(a2)) {
                                    abstractTypeCheckerContext.A();
                                } else {
                                    arrayDeque.add(a2);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    StringBuilder W0 = a.W0("Too many supertypes for type: ", gVar, ". Supertypes = ");
                    W0.append(m0.j.g.E(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63));
                    throw new IllegalStateException(W0.toString().toString());
                }
            }
            abstractTypeCheckerContext.A();
            return false;
        }
        return true;
    }

    public static final boolean b(AbstractTypeCheckerContext abstractTypeCheckerContext, g gVar, j jVar) {
        i.e(abstractTypeCheckerContext, "this");
        i.e(gVar, "receiver");
        b bVar = (b) abstractTypeCheckerContext;
        if (h.r2(bVar, h.t4(abstractTypeCheckerContext, gVar)) && !h.s2(bVar, gVar)) {
            return true;
        }
        if (h.p2(bVar, gVar)) {
            return false;
        }
        if (abstractTypeCheckerContext.H()) {
            bVar.U(gVar);
        }
        return bVar.v(h.s4(bVar, gVar), jVar);
    }
}
