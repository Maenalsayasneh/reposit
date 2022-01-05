package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import m0.n.a.a;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$companionObjectDescriptor$1 extends Lambda implements a<d> {
    public final /* synthetic */ DeserializedClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$companionObjectDescriptor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.c = deserializedClassDescriptor;
    }

    public Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.c;
        ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.y;
        if (!((protoBuf$Class.y & 4) == 4)) {
            return null;
        }
        f f = deserializedClassDescriptor.h2.b(deserializedClassDescriptor.e2.a.q.c()).f(h.v1(deserializedClassDescriptor.e2.b, protoBuf$Class.a2), NoLookupLocation.FROM_DESERIALIZATION);
        if (f instanceof d) {
            return (d) f;
        }
        return null;
    }
}
