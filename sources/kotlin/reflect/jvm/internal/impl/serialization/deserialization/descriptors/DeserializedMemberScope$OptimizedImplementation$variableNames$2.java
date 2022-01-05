package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.g.d;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$OptimizedImplementation$variableNames$2 extends Lambda implements a<Set<? extends d>> {
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation c;
    public final /* synthetic */ DeserializedMemberScope d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$variableNames$2(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.c = optimizedImplementation;
        this.d = deserializedMemberScope;
    }

    public Object invoke() {
        return g.d0(this.c.c.keySet(), this.d.p());
    }
}
