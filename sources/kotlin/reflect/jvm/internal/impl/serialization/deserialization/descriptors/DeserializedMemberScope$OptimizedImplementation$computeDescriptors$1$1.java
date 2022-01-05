package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.h.b;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.n;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 extends Lambda implements a<M> {
    public final /* synthetic */ n<M> c;
    public final /* synthetic */ ByteArrayInputStream d;
    public final /* synthetic */ DeserializedMemberScope q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(n<M> nVar, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.c = nVar;
        this.d = byteArrayInputStream;
        this.q = deserializedMemberScope;
    }

    public Object invoke() {
        return (l) ((b) this.c).c(this.d, this.q.c.a.p);
    }
}
