package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import m0.j.g;
import m0.n.a.a;
import m0.n.a.l;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1 extends Lambda implements a<Set<? extends d>> {
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors) {
        super(0);
        this.c = enumEntryClassDescriptors;
    }

    public Object invoke() {
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.c;
        Objects.requireNonNull(enumEntryClassDescriptors);
        HashSet hashSet = new HashSet();
        for (v o : enumEntryClassDescriptors.d.g2.b()) {
            for (i iVar : h.Y0(o.o(), (m0.r.t.a.r.j.u.d) null, (l) null, 3, (Object) null)) {
                if ((iVar instanceof g0) || (iVar instanceof c0)) {
                    hashSet.add(iVar.getName());
                }
            }
        }
        List<ProtoBuf$Function> list = enumEntryClassDescriptors.d.y.i2;
        m0.n.b.i.d(list, "classProto.functionList");
        DeserializedClassDescriptor deserializedClassDescriptor = enumEntryClassDescriptors.d;
        for (ProtoBuf$Function protoBuf$Function : list) {
            hashSet.add(h.v1(deserializedClassDescriptor.e2.b, protoBuf$Function.a2));
        }
        List<ProtoBuf$Property> list2 = enumEntryClassDescriptors.d.y.j2;
        m0.n.b.i.d(list2, "classProto.propertyList");
        DeserializedClassDescriptor deserializedClassDescriptor2 = enumEntryClassDescriptors.d;
        for (ProtoBuf$Property protoBuf$Property : list2) {
            hashSet.add(h.v1(deserializedClassDescriptor2.e2.b, protoBuf$Property.a2));
        }
        return g.d0(hashSet, hashSet);
    }
}
