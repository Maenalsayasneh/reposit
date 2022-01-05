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
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.g.d;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$NoReorderImplementation$allProperties$2 extends Lambda implements a<List<? extends c0>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$allProperties$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.c = noReorderImplementation;
    }

    public Object invoke() {
        List list = (List) h.K1(this.c.f, DeserializedMemberScope.NoReorderImplementation.a[1]);
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.c;
        Set<d> p = noReorderImplementation.o.p();
        ArrayList arrayList = new ArrayList();
        for (d dVar : p) {
            DeserializedMemberScope deserializedMemberScope = noReorderImplementation.o;
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (List) h.K1(noReorderImplementation.f, DeserializedMemberScope.NoReorderImplementation.a[1])) {
                if (i.a(((m0.r.t.a.r.c.i) next).getName(), dVar)) {
                    arrayList2.add(next);
                }
            }
            int size = arrayList2.size();
            deserializedMemberScope.k(dVar, arrayList2);
            g.b(arrayList, arrayList2.subList(size, arrayList2.size()));
        }
        return g.Z(list, arrayList);
    }
}
