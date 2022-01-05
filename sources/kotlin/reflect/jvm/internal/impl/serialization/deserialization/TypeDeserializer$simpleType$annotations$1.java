package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.k.b.i;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer$simpleType$annotations$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ TypeDeserializer c;
    public final /* synthetic */ ProtoBuf$Type d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$simpleType$annotations$1(TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type) {
        super(0);
        this.c = typeDeserializer;
        this.d = protoBuf$Type;
    }

    public Object invoke() {
        i iVar = this.c.a;
        return iVar.a.e.d(this.d, iVar.b);
    }
}
