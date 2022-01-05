package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.g.d;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$classifierNamesLazy$2 extends Lambda implements a<Set<? extends d>> {
    public final /* synthetic */ DeserializedMemberScope c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classifierNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.c = deserializedMemberScope;
    }

    public Object invoke() {
        Set<d> n = this.c.n();
        if (n == null) {
            return null;
        }
        return g.d0(g.d0(this.c.m(), this.c.d.e()), n);
    }
}
