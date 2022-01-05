package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import m0.n.a.a;
import m0.r.t.a.r.m.v;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 extends Lambda implements a<Collection<? extends v>> {
    public final /* synthetic */ DeserializedClassDescriptor.DeserializedClassMemberScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        super(0);
        this.c = deserializedClassMemberScope;
    }

    public Object invoke() {
        DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.c;
        return deserializedClassMemberScope.g.f(deserializedClassMemberScope.j);
    }
}
