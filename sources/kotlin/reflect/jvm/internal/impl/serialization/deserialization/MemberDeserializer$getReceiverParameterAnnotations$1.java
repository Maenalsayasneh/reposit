package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.k.b.r;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$getReceiverParameterAnnotations$1 extends Lambda implements a<List<? extends c>> {
    public final /* synthetic */ MemberDeserializer c;
    public final /* synthetic */ l d;
    public final /* synthetic */ AnnotatedCallableKind q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getReceiverParameterAnnotations$1(MemberDeserializer memberDeserializer, l lVar, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.c = memberDeserializer;
        this.d = lVar;
        this.q = annotatedCallableKind;
    }

    public Object invoke() {
        List<c> list;
        MemberDeserializer memberDeserializer = this.c;
        r a = memberDeserializer.a(memberDeserializer.a.c);
        if (a == null) {
            list = null;
        } else {
            list = this.c.a.a.e.h(a, this.d, this.q);
        }
        return list != null ? list : EmptyList.c;
    }
}
