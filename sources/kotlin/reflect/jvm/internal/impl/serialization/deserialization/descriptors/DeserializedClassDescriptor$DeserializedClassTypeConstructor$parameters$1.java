package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.m0;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1 extends Lambda implements a<List<? extends m0>> {
    public final /* synthetic */ DeserializedClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.c = deserializedClassDescriptor;
    }

    public Object invoke() {
        return h.O(this.c);
    }
}
