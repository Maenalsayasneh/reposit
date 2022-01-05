package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.n.a.a;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.h.l;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$NoReorderImplementation$declaredProperties$2 extends Lambda implements a<List<? extends c0>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$declaredProperties$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.c = noReorderImplementation;
    }

    public Object invoke() {
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.c;
        List<ProtoBuf$Property> list = noReorderImplementation.c;
        DeserializedMemberScope deserializedMemberScope = noReorderImplementation.o;
        ArrayList arrayList = new ArrayList();
        for (l lVar : list) {
            arrayList.add(deserializedMemberScope.c.i.j((ProtoBuf$Property) lVar));
        }
        return arrayList;
    }
}
