package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1 extends Lambda implements l<ProtoBuf$Type, ProtoBuf$Type> {
    public final /* synthetic */ TypeDeserializer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.c = typeDeserializer;
    }

    public Object invoke(Object obj) {
        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
        i.e(protoBuf$Type, "it");
        return h.Y2(protoBuf$Type, this.c.a.d);
    }
}
