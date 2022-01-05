package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.h.l;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$NoReorderImplementation$functionNames$2 extends Lambda implements a<Set<? extends d>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation c;
    public final /* synthetic */ DeserializedMemberScope d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$functionNames$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.c = noReorderImplementation;
        this.d = deserializedMemberScope;
    }

    public Object invoke() {
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.c;
        List<ProtoBuf$Function> list = noReorderImplementation.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DeserializedMemberScope deserializedMemberScope = noReorderImplementation.o;
        for (l lVar : list) {
            linkedHashSet.add(h.v1(deserializedMemberScope.c.b, ((ProtoBuf$Function) lVar).a2));
        }
        return g.d0(linkedHashSet, this.d.o());
    }
}
