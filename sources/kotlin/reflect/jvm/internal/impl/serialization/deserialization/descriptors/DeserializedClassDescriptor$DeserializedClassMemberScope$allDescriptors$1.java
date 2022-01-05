package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import m0.n.a.a;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.j.u.d;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 extends Lambda implements a<Collection<? extends i>> {
    public final /* synthetic */ DeserializedClassDescriptor.DeserializedClassMemberScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        super(0);
        this.c = deserializedClassMemberScope;
    }

    public Object invoke() {
        DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.c;
        d dVar = d.m;
        Objects.requireNonNull(MemberScope.a);
        return deserializedClassMemberScope.i(dVar, MemberScope.Companion.b, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
    }
}
