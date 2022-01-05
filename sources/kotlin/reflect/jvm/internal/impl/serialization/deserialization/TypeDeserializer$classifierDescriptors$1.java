package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.g.a;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer$classifierDescriptors$1 extends Lambda implements l<Integer, f> {
    public final /* synthetic */ TypeDeserializer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$classifierDescriptors$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.c = typeDeserializer;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        TypeDeserializer typeDeserializer = this.c;
        a X0 = h.X0(typeDeserializer.a.b, intValue);
        if (X0.c) {
            return typeDeserializer.a.a.b(X0);
        }
        return h.E0(typeDeserializer.a.a.b, X0);
    }
}
