package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.k.b.w.d;

/* compiled from: DeserializedPackageFragmentImpl.kt */
public final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements l<a, h0> {
    public final /* synthetic */ DeserializedPackageFragmentImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.c = deserializedPackageFragmentImpl;
    }

    public Object invoke(Object obj) {
        i.e((a) obj, "it");
        d dVar = this.c.a2;
        if (dVar != null) {
            return dVar;
        }
        h0 h0Var = h0.a;
        i.d(h0Var, "NO_SOURCE");
        return h0Var;
    }
}
