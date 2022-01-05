package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.t0.n;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.k.b.w.a;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 extends Lambda implements l<d, m0.r.t.a.r.c.d> {
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors c;
    public final /* synthetic */ DeserializedClassDescriptor d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors, DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1);
        this.c = enumEntryClassDescriptors;
        this.d = deserializedClassDescriptor;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "name");
        ProtoBuf$EnumEntry protoBuf$EnumEntry = this.c.a.get(dVar);
        if (protoBuf$EnumEntry == null) {
            return null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = this.d;
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.c;
        return n.H0(deserializedClassDescriptor.e2.a.a, deserializedClassDescriptor, dVar, enumEntryClassDescriptors.c, new a(deserializedClassDescriptor.e2.a.a, new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1(deserializedClassDescriptor, protoBuf$EnumEntry)), h0.a);
    }
}
