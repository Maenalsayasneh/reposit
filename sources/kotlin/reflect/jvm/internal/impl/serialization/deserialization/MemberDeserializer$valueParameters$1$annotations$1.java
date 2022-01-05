package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.k.b.r;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$valueParameters$1$annotations$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ ProtoBuf$ValueParameter Y1;
    public final /* synthetic */ MemberDeserializer c;
    public final /* synthetic */ r d;
    public final /* synthetic */ l q;
    public final /* synthetic */ AnnotatedCallableKind x;
    public final /* synthetic */ int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$valueParameters$1$annotations$1(MemberDeserializer memberDeserializer, r rVar, l lVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        super(0);
        this.c = memberDeserializer;
        this.d = rVar;
        this.q = lVar;
        this.x = annotatedCallableKind;
        this.y = i;
        this.Y1 = protoBuf$ValueParameter;
    }

    public Object invoke() {
        return g.v0(this.c.a.a.e.b(this.d, this.q, this.x, this.y, this.Y1));
    }
}
