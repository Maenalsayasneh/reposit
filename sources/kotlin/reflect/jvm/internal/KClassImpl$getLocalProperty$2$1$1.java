package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.c0;

/* compiled from: KClassImpl.kt */
public final /* synthetic */ class KClassImpl$getLocalProperty$2$1$1 extends FunctionReference implements p<MemberDeserializer, ProtoBuf$Property, c0> {
    public static final KClassImpl$getLocalProperty$2$1$1 c = new KClassImpl$getLocalProperty$2$1$1();

    public KClassImpl$getLocalProperty$2$1$1() {
        super(2);
    }

    public final String getName() {
        return "loadProperty";
    }

    public final f getOwner() {
        return m.a(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    public Object invoke(Object obj, Object obj2) {
        MemberDeserializer memberDeserializer = (MemberDeserializer) obj;
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) obj2;
        i.e(memberDeserializer, "p1");
        i.e(protoBuf$Property, "p2");
        return memberDeserializer.j(protoBuf$Property);
    }
}
