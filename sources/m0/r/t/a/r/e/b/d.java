package m0.r.t.a.r.e.b;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.n.b.i;
import m0.r.t.a.r.k.b.m;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class d implements m {
    public static final d a = new d();

    public v a(ProtoBuf$Type protoBuf$Type, String str, a0 a0Var, a0 a0Var2) {
        i.e(protoBuf$Type, "proto");
        i.e(str, "flexibleId");
        i.e(a0Var, "lowerBound");
        i.e(a0Var2, "upperBound");
        if (!i.a(str, "kotlin.jvm.PlatformType")) {
            a0 d = p.d("Error java flexible type with id: " + str + ". (" + a0Var + ".." + a0Var2 + ')');
            i.d(d, "createErrorType(\"Error java flexible type with id: $flexibleId. ($lowerBound..$upperBound)\")");
            return d;
        } else if (protoBuf$Type.n(JvmProtoBuf.g)) {
            return new RawTypeImpl(a0Var, a0Var2);
        } else {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            return KotlinTypeFactory.c(a0Var, a0Var2);
        }
    }
}
