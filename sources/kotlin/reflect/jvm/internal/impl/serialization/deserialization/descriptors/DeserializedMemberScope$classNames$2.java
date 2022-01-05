package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.g.d;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$classNames$2 extends Lambda implements a<Set<? extends d>> {
    public final /* synthetic */ a<Collection<d>> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classNames$2(a<? extends Collection<d>> aVar) {
        super(0);
        this.c = aVar;
    }

    public Object invoke() {
        return g.D0(this.c.invoke());
    }
}
