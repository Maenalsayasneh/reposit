package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.n.a.a;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.h.l;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$NoReorderImplementation$declaredFunctions$2 extends Lambda implements a<List<? extends g0>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$declaredFunctions$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.c = noReorderImplementation;
    }

    public Object invoke() {
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.c;
        List<ProtoBuf$Function> list = noReorderImplementation.b;
        DeserializedMemberScope deserializedMemberScope = noReorderImplementation.o;
        ArrayList arrayList = new ArrayList();
        for (l lVar : list) {
            g0 i = deserializedMemberScope.c.i.i((ProtoBuf$Function) lVar);
            if (!deserializedMemberScope.r(i)) {
                i = null;
            }
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
