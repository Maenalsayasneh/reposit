package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.k.b.i;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class DeserializedTypeParameterDescriptor$annotations$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ DeserializedTypeParameterDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedTypeParameterDescriptor$annotations$1(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        super(0);
        this.c = deserializedTypeParameterDescriptor;
    }

    public Object invoke() {
        DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = this.c;
        i iVar = deserializedTypeParameterDescriptor.d2;
        return g.v0(iVar.a.e.a(deserializedTypeParameterDescriptor.e2, iVar.b));
    }
}
