package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.f.c.b;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$primaryConstructor$1 extends Lambda implements a<c> {
    public final /* synthetic */ DeserializedClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$primaryConstructor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.c = deserializedClassDescriptor;
    }

    public Object invoke() {
        T t;
        DeserializedClassDescriptor deserializedClassDescriptor = this.c;
        if (deserializedClassDescriptor.d2.isSingleton()) {
            m0.r.t.a.r.j.c cVar = new m0.r.t.a.r.j.c(deserializedClassDescriptor, h0.a, false);
            cVar.P0(deserializedClassDescriptor.q());
            return cVar;
        }
        List<ProtoBuf$Constructor> list = deserializedClassDescriptor.y.h2;
        i.d(list, "classProto.constructorList");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!b.l.d(((ProtoBuf$Constructor) t).Y1).booleanValue()) {
                break;
            }
        }
        ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) t;
        if (protoBuf$Constructor == null) {
            return null;
        }
        return deserializedClassDescriptor.e2.i.h(protoBuf$Constructor, true);
    }
}
