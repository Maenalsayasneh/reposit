package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 extends Lambda implements l<ProtoBuf$Type, Integer> {
    public static final TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 c = new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2();

    public TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
        i.e(protoBuf$Type, "it");
        return Integer.valueOf(protoBuf$Type.Y1.size());
    }
}
