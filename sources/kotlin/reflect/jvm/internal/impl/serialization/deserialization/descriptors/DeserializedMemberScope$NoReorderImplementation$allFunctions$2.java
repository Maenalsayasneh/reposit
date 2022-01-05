package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$NoReorderImplementation$allFunctions$2 extends Lambda implements a<List<? extends g0>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$allFunctions$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.c = noReorderImplementation;
    }

    public Object invoke() {
        List list = (List) h.K1(this.c.e, DeserializedMemberScope.NoReorderImplementation.a[0]);
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.c;
        Set<d> o = noReorderImplementation.o.o();
        ArrayList arrayList = new ArrayList();
        for (d dVar : o) {
            DeserializedMemberScope deserializedMemberScope = noReorderImplementation.o;
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (List) h.K1(noReorderImplementation.e, DeserializedMemberScope.NoReorderImplementation.a[0])) {
                if (i.a(((m0.r.t.a.r.c.i) next).getName(), dVar)) {
                    arrayList2.add(next);
                }
            }
            int size = arrayList2.size();
            deserializedMemberScope.j(dVar, arrayList2);
            g.b(arrayList, arrayList2.subList(size, arrayList2.size()));
        }
        return g.Z(list, arrayList);
    }
}
