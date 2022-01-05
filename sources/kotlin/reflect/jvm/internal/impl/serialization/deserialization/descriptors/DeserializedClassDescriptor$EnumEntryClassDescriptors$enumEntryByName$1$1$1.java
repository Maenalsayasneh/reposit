package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.c;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ DeserializedClassDescriptor c;
    public final /* synthetic */ ProtoBuf$EnumEntry d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        super(0);
        this.c = deserializedClassDescriptor;
        this.d = protoBuf$EnumEntry;
    }

    public Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.c;
        return g.v0(deserializedClassDescriptor.e2.a.e.f(deserializedClassDescriptor.o2, this.d));
    }
}
