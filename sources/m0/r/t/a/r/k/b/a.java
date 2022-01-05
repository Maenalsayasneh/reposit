package m0.r.t.a.r.k.b;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.k.b.r;
import m0.r.t.a.r.m.v;

/* compiled from: AnnotationAndConstantLoader.kt */
public interface a<A, C> {
    List<A> a(ProtoBuf$TypeParameter protoBuf$TypeParameter, c cVar);

    List<A> b(r rVar, l lVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter);

    List<A> c(r.a aVar);

    List<A> d(ProtoBuf$Type protoBuf$Type, c cVar);

    C e(r rVar, ProtoBuf$Property protoBuf$Property, v vVar);

    List<A> f(r rVar, ProtoBuf$EnumEntry protoBuf$EnumEntry);

    List<A> g(r rVar, ProtoBuf$Property protoBuf$Property);

    List<A> h(r rVar, l lVar, AnnotatedCallableKind annotatedCallableKind);

    List<A> i(r rVar, ProtoBuf$Property protoBuf$Property);

    List<A> j(r rVar, l lVar, AnnotatedCallableKind annotatedCallableKind);
}
