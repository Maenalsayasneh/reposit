package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.g.d;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2 extends Lambda implements a<Map<d, ? extends l0>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.c = noReorderImplementation;
    }

    public Object invoke() {
        List list = (List) h.K1(this.c.g, DeserializedMemberScope.NoReorderImplementation.a[2]);
        int R2 = h.R2(h.K(list, 10));
        if (R2 < 16) {
            R2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
        for (Object next : list) {
            d name = ((l0) next).getName();
            i.d(name, "it.name");
            linkedHashMap.put(name, next);
        }
        return linkedHashMap;
    }
}
