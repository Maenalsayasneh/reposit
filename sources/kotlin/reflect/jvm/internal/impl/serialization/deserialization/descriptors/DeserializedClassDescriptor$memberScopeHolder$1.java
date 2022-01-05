package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.m.x0.e;

/* compiled from: DeserializedClassDescriptor.kt */
public /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements l<e, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1, deserializedClassDescriptor);
    }

    public final String getName() {
        return "<init>";
    }

    public final f getOwner() {
        return m.a(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    public Object invoke(Object obj) {
        e eVar = (e) obj;
        i.e(eVar, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, eVar);
    }
}
