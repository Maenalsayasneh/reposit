package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.k.b.r;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$getPropertyFieldAnnotations$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ MemberDeserializer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ProtoBuf$Property q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getPropertyFieldAnnotations$1(MemberDeserializer memberDeserializer, boolean z, ProtoBuf$Property protoBuf$Property) {
        super(0);
        this.c = memberDeserializer;
        this.d = z;
        this.q = protoBuf$Property;
    }

    public Object invoke() {
        List<T> list;
        MemberDeserializer memberDeserializer = this.c;
        r a = memberDeserializer.a(memberDeserializer.a.c);
        if (a == null) {
            list = null;
        } else {
            boolean z = this.d;
            MemberDeserializer memberDeserializer2 = this.c;
            ProtoBuf$Property protoBuf$Property = this.q;
            if (z) {
                list = g.v0(memberDeserializer2.a.a.e.i(a, protoBuf$Property));
            } else {
                list = g.v0(memberDeserializer2.a.a.e.g(a, protoBuf$Property));
            }
        }
        return list != null ? list : EmptyList.c;
    }
}
