package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.k.b.r;
import m0.r.t.a.r.k.b.w.f;
import m0.r.t.a.r.m.v;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$loadProperty$3 extends Lambda implements a<g<?>> {
    public final /* synthetic */ MemberDeserializer c;
    public final /* synthetic */ ProtoBuf$Property d;
    public final /* synthetic */ f q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$loadProperty$3(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property, f fVar) {
        super(0);
        this.c = memberDeserializer;
        this.d = protoBuf$Property;
        this.q = fVar;
    }

    public Object invoke() {
        MemberDeserializer memberDeserializer = this.c;
        r a = memberDeserializer.a(memberDeserializer.a.c);
        i.c(a);
        m0.r.t.a.r.k.b.a<c, g<?>> aVar = this.c.a.a.e;
        ProtoBuf$Property protoBuf$Property = this.d;
        v returnType = this.q.getReturnType();
        i.d(returnType, "property.returnType");
        return aVar.e(a, protoBuf$Property, returnType);
    }
}
