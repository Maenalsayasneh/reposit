package kotlin.reflect.jvm;

import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.g0;

/* compiled from: reflectLambda.kt */
public final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements p<MemberDeserializer, ProtoBuf$Function, g0> {
    public static final ReflectLambdaKt$reflect$descriptor$1 c = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    public final String getName() {
        return "loadFunction";
    }

    public final f getOwner() {
        return m.a(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    public Object invoke(Object obj, Object obj2) {
        MemberDeserializer memberDeserializer = (MemberDeserializer) obj;
        ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) obj2;
        i.e(memberDeserializer, "p1");
        i.e(protoBuf$Function, "p2");
        return memberDeserializer.i(protoBuf$Function);
    }
}
