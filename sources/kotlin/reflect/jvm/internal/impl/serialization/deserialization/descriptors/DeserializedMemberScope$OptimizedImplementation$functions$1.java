package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.h.n;
import m0.r.t.a.r.m.a1.a;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$OptimizedImplementation$functions$1 extends Lambda implements l<d, Collection<? extends g0>> {
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$functions$1(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.c = optimizedImplementation;
    }

    public Object invoke(Object obj) {
        Collection<ProtoBuf$Function> collection;
        d dVar = (d) obj;
        i.e(dVar, "it");
        DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.c;
        Map<d, byte[]> map = optimizedImplementation.b;
        n<ProtoBuf$Function> nVar = ProtoBuf$Function.q;
        i.d(nVar, "PARSER");
        DeserializedMemberScope deserializedMemberScope = optimizedImplementation.j;
        byte[] bArr = map.get(dVar);
        if (bArr == null) {
            collection = null;
        } else {
            collection = SequencesKt___SequencesKt.j(a.D1(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(nVar, new ByteArrayInputStream(bArr), optimizedImplementation.j)));
        }
        if (collection == null) {
            collection = EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (ProtoBuf$Function protoBuf$Function : collection) {
            MemberDeserializer memberDeserializer = deserializedMemberScope.c.i;
            i.d(protoBuf$Function, "it");
            g0 i = memberDeserializer.i(protoBuf$Function);
            if (!deserializedMemberScope.r(i)) {
                i = null;
            }
            if (i != null) {
                arrayList.add(i);
            }
        }
        deserializedMemberScope.j(dVar, arrayList);
        return a.G0(arrayList);
    }
}
