package m0.r.t.a.r.k.b;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.k.a;
import m0.r.t.a.r.k.b.r;
import m0.r.t.a.r.m.v;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
public final class b implements a<c, g<?>> {
    public final a a;
    public final c b;

    public b(u uVar, NotFoundClasses notFoundClasses, a aVar) {
        i.e(uVar, "module");
        i.e(notFoundClasses, "notFoundClasses");
        i.e(aVar, "protocol");
        this.a = aVar;
        this.b = new c(uVar, notFoundClasses);
    }

    public List<c> a(ProtoBuf$TypeParameter protoBuf$TypeParameter, m0.r.t.a.r.f.c.c cVar) {
        i.e(protoBuf$TypeParameter, "proto");
        i.e(cVar, "nameResolver");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$TypeParameter.m(this.a.l);
        if (iterable == null) {
            iterable = EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation a2 : iterable) {
            arrayList.add(this.b.a(a2, cVar));
        }
        return arrayList;
    }

    public List<c> b(r rVar, l lVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        i.e(rVar, "container");
        i.e(lVar, "callableProto");
        i.e(annotatedCallableKind, "kind");
        i.e(protoBuf$ValueParameter, "proto");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$ValueParameter.m(this.a.j);
        if (iterable == null) {
            iterable = EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation a2 : iterable) {
            arrayList.add(this.b.a(a2, rVar.a));
        }
        return arrayList;
    }

    public List<c> c(r.a aVar) {
        i.e(aVar, "container");
        Iterable<ProtoBuf$Annotation> iterable = (List) aVar.d.m(this.a.c);
        if (iterable == null) {
            iterable = EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation a2 : iterable) {
            arrayList.add(this.b.a(a2, aVar.a));
        }
        return arrayList;
    }

    public List<c> d(ProtoBuf$Type protoBuf$Type, m0.r.t.a.r.f.c.c cVar) {
        i.e(protoBuf$Type, "proto");
        i.e(cVar, "nameResolver");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$Type.m(this.a.k);
        if (iterable == null) {
            iterable = EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation a2 : iterable) {
            arrayList.add(this.b.a(a2, cVar));
        }
        return arrayList;
    }

    public Object e(r rVar, ProtoBuf$Property protoBuf$Property, v vVar) {
        i.e(rVar, "container");
        i.e(protoBuf$Property, "proto");
        i.e(vVar, "expectedType");
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) h.c1(protoBuf$Property, this.a.i);
        if (value == null) {
            return null;
        }
        return this.b.c(vVar, value, rVar.a);
    }

    public List<c> f(r rVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        i.e(rVar, "container");
        i.e(protoBuf$EnumEntry, "proto");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$EnumEntry.m(this.a.h);
        if (iterable == null) {
            iterable = EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation a2 : iterable) {
            arrayList.add(this.b.a(a2, rVar.a));
        }
        return arrayList;
    }

    public List<c> g(r rVar, ProtoBuf$Property protoBuf$Property) {
        i.e(rVar, "container");
        i.e(protoBuf$Property, "proto");
        return EmptyList.c;
    }

    public List<c> h(r rVar, l lVar, AnnotatedCallableKind annotatedCallableKind) {
        i.e(rVar, "container");
        i.e(lVar, "proto");
        i.e(annotatedCallableKind, "kind");
        return EmptyList.c;
    }

    public List<c> i(r rVar, ProtoBuf$Property protoBuf$Property) {
        i.e(rVar, "container");
        i.e(protoBuf$Property, "proto");
        return EmptyList.c;
    }

    public List<c> j(r rVar, l lVar, AnnotatedCallableKind annotatedCallableKind) {
        Iterable<ProtoBuf$Annotation> iterable;
        i.e(rVar, "container");
        i.e(lVar, "proto");
        i.e(annotatedCallableKind, "kind");
        if (lVar instanceof ProtoBuf$Constructor) {
            iterable = (List) ((ProtoBuf$Constructor) lVar).m(this.a.b);
        } else if (lVar instanceof ProtoBuf$Function) {
            iterable = (List) ((ProtoBuf$Function) lVar).m(this.a.d);
        } else if (lVar instanceof ProtoBuf$Property) {
            int ordinal = annotatedCallableKind.ordinal();
            if (ordinal == 1) {
                iterable = (List) ((ProtoBuf$Property) lVar).m(this.a.e);
            } else if (ordinal == 2) {
                iterable = (List) ((ProtoBuf$Property) lVar).m(this.a.f);
            } else if (ordinal == 3) {
                iterable = (List) ((ProtoBuf$Property) lVar).m(this.a.g);
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(i.k("Unknown message: ", lVar).toString());
        }
        if (iterable == null) {
            iterable = EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation a2 : iterable) {
            arrayList.add(this.b.a(a2, rVar.a));
        }
        return arrayList;
    }
}
