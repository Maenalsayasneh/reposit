package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.f.c.b;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$constructors$1 extends Lambda implements a<Collection<? extends c>> {
    public final /* synthetic */ DeserializedClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$constructors$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.c = deserializedClassDescriptor;
    }

    public Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.c;
        List<ProtoBuf$Constructor> list = deserializedClassDescriptor.y.h2;
        i.d(list, "classProto.constructorList");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (i0.d.a.a.a.E(b.l, ((ProtoBuf$Constructor) next).Y1, "IS_SECONDARY.get(it.flags)")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) it.next();
            MemberDeserializer memberDeserializer = deserializedClassDescriptor.e2.i;
            i.d(protoBuf$Constructor, "it");
            arrayList2.add(memberDeserializer.h(protoBuf$Constructor, false));
        }
        return g.Z(g.Z(arrayList2, g.L(deserializedClassDescriptor.P())), deserializedClassDescriptor.e2.a.n.a(deserializedClassDescriptor));
    }
}
