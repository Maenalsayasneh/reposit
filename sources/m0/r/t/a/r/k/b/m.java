package m0.r.t.a.r.k.b;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import m0.n.b.i;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: FlexibleTypeDeserializer.kt */
public interface m {

    /* compiled from: FlexibleTypeDeserializer.kt */
    public static final class a implements m {
        public static final a a = new a();

        public v a(ProtoBuf$Type protoBuf$Type, String str, a0 a0Var, a0 a0Var2) {
            i.e(protoBuf$Type, "proto");
            i.e(str, "flexibleId");
            i.e(a0Var, "lowerBound");
            i.e(a0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    v a(ProtoBuf$Type protoBuf$Type, String str, a0 a0Var, a0 a0Var2);
}
