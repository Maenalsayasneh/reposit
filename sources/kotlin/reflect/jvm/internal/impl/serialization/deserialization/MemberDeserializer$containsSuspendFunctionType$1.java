package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.PropertyReference1;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.b.e;
import m0.r.t.a.r.m.v;

/* compiled from: MemberDeserializer.kt */
public /* synthetic */ class MemberDeserializer$containsSuspendFunctionType$1 extends PropertyReference1 {
    public static final MemberDeserializer$containsSuspendFunctionType$1 c = new MemberDeserializer$containsSuspendFunctionType$1();

    public Object get(Object obj) {
        return Boolean.valueOf(e.h((v) obj));
    }

    public String getName() {
        return "isSuspendFunctionType";
    }

    public f getOwner() {
        return m.a.c(e.class, "deserialization");
    }

    public String getSignature() {
        return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}
