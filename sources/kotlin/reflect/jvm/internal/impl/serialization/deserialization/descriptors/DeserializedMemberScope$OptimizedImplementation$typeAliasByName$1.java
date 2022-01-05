package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.h.b;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1 extends Lambda implements l<d, l0> {
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.c = optimizedImplementation;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "it");
        DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.c;
        byte[] bArr = optimizedImplementation.d.get(dVar);
        if (bArr == null) {
            return null;
        }
        ProtoBuf$TypeAlias protoBuf$TypeAlias = (ProtoBuf$TypeAlias) ((b) ProtoBuf$TypeAlias.q).c(new ByteArrayInputStream(bArr), optimizedImplementation.j.c.a.p);
        if (protoBuf$TypeAlias == null) {
            return null;
        }
        return optimizedImplementation.j.c.i.k(protoBuf$TypeAlias);
    }
}
