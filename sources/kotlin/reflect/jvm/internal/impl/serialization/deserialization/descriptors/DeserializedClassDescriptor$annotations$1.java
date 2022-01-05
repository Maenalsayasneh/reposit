package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.c;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$annotations$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ DeserializedClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$annotations$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.c = deserializedClassDescriptor;
    }

    public Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.c;
        return g.v0(deserializedClassDescriptor.e2.a.e.c(deserializedClassDescriptor.o2));
    }
}
