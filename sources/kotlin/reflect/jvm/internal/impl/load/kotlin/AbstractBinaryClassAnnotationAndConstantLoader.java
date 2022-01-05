package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.text.StringsKt__IndentKt;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.e.b.i;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.e.b.m;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.f.d.a.e;
import m0.r.t.a.r.j.p.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.j.p.p;
import m0.r.t.a.r.j.p.t;
import m0.r.t.a.r.j.p.u;
import m0.r.t.a.r.j.p.w;
import m0.r.t.a.r.k.b.r;
import m0.r.t.a.r.l.f;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.v;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> implements m0.r.t.a.r.k.b.a<A, C> {
    public final i a;
    public final f<j, a<A, C>> b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class a<A, C> {
        public final Map<m, List<A>> a;
        public final Map<m, C> b;

        public a(Map<m, ? extends List<? extends A>> map, Map<m, ? extends C> map2) {
            m0.n.b.i.e(map, "memberAnnotations");
            m0.n.b.i.e(map2, "propertyConstants");
            this.a = map;
            this.b = map2;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class b implements j.c {
        public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> a;
        public final /* synthetic */ ArrayList<A> b;

        public b(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader, ArrayList<A> arrayList) {
            this.a = abstractBinaryClassAnnotationAndConstantLoader;
            this.b = arrayList;
        }

        public void a() {
        }

        public j.a b(m0.r.t.a.r.g.a aVar, h0 h0Var) {
            m0.n.b.i.e(aVar, "classId");
            m0.n.b.i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
            return AbstractBinaryClassAnnotationAndConstantLoader.k(this.a, aVar, h0Var, this.b);
        }
    }

    public AbstractBinaryClassAnnotationAndConstantLoader(l lVar, i iVar) {
        m0.n.b.i.e(lVar, "storageManager");
        m0.n.b.i.e(iVar, "kotlinClassFinder");
        this.a = iVar;
        this.b = lVar.g(new AbstractBinaryClassAnnotationAndConstantLoader$storage$1(this));
    }

    public static final j.a k(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, m0.r.t.a.r.g.a aVar, h0 h0Var, List list) {
        Objects.requireNonNull(abstractBinaryClassAnnotationAndConstantLoader);
        m0.r.t.a.r.a aVar2 = m0.r.t.a.r.a.a;
        if (m0.r.t.a.r.a.b.contains(aVar)) {
            return null;
        }
        return abstractBinaryClassAnnotationAndConstantLoader.s(aVar, h0Var, list);
    }

    public static /* synthetic */ List m(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, r rVar, m mVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        return abstractBinaryClassAnnotationAndConstantLoader.l(rVar, mVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
    }

    public static /* synthetic */ m o(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, m0.r.t.a.r.h.l lVar, c cVar, e eVar, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return abstractBinaryClassAnnotationAndConstantLoader.n(lVar, cVar, eVar, annotatedCallableKind, z);
    }

    public static /* synthetic */ m q(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ProtoBuf$Property protoBuf$Property, c cVar, e eVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        return abstractBinaryClassAnnotationAndConstantLoader.p(protoBuf$Property, cVar, eVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
    }

    public List<A> a(ProtoBuf$TypeParameter protoBuf$TypeParameter, c cVar) {
        m0.n.b.i.e(protoBuf$TypeParameter, "proto");
        m0.n.b.i.e(cVar, "nameResolver");
        Object m = protoBuf$TypeParameter.m(JvmProtoBuf.h);
        m0.n.b.i.d(m, "proto.getExtension(JvmProtoBuf.typeParameterAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) m;
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            m0.n.b.i.d(protoBuf$Annotation, "it");
            m0.n.b.i.e(protoBuf$Annotation, "proto");
            m0.n.b.i.e(cVar, "nameResolver");
            arrayList.add(((m0.r.t.a.r.e.b.b) this).e.a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r11.h != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (i0.j.f.p.h.R1((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r11) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (i0.j.f.p.h.S1((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property) r11) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<A> b(m0.r.t.a.r.k.b.r r10, m0.r.t.a.r.h.l r11, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, int r13, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r14) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            m0.n.b.i.e(r10, r0)
            java.lang.String r0 = "callableProto"
            m0.n.b.i.e(r11, r0)
            java.lang.String r0 = "kind"
            m0.n.b.i.e(r12, r0)
            java.lang.String r0 = "proto"
            m0.n.b.i.e(r14, r0)
            m0.r.t.a.r.f.c.c r3 = r10.a
            m0.r.t.a.r.f.c.e r4 = r10.b
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r11
            r5 = r12
            m0.r.t.a.r.e.b.m r12 = o(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto L_0x0079
            boolean r14 = r11 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L_0x0034
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r11
            boolean r11 = i0.j.f.p.h.R1(r11)
            if (r11 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0034:
            boolean r14 = r11 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property
            if (r14 == 0) goto L_0x0041
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property) r11
            boolean r11 = i0.j.f.p.h.S1(r11)
            if (r11 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0041:
            boolean r14 = r11 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor
            if (r14 == 0) goto L_0x0069
            r11 = r10
            m0.r.t.a.r.k.b.r$a r11 = (m0.r.t.a.r.k.b.r.a) r11
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r14 = r11.g
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.Kind.ENUM_CLASS
            if (r14 != r2) goto L_0x0050
            r0 = 2
            goto L_0x0056
        L_0x0050:
            boolean r11 = r11.h
            if (r11 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = r1
        L_0x0056:
            int r13 = r13 + r0
            m0.r.t.a.r.e.b.m r2 = m0.r.t.a.r.e.b.m.e(r12, r13)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 60
            r8 = 0
            r0 = r9
            r1 = r10
            java.util.List r10 = m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L_0x0069:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.Class r11 = r11.getClass()
            java.lang.String r12 = "Unsupported message: "
            java.lang.String r11 = m0.n.b.i.k(r12, r11)
            r10.<init>(r11)
            throw r10
        L_0x0079:
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.b(m0.r.t.a.r.k.b.r, m0.r.t.a.r.h.l, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, int, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter):java.util.List");
    }

    public List<A> c(r.a aVar) {
        m0.n.b.i.e(aVar, "container");
        j u = u(aVar);
        if (u != null) {
            ArrayList arrayList = new ArrayList(1);
            b bVar = new b(this, arrayList);
            m0.n.b.i.e(u, "kotlinClass");
            u.b(bVar, (byte[]) null);
            return arrayList;
        }
        m0.r.t.a.r.g.b b2 = aVar.f.b();
        m0.n.b.i.d(b2, "classId.asSingleFqName()");
        throw new IllegalStateException(m0.n.b.i.k("Class for loading annotations is not found: ", b2).toString());
    }

    public List<A> d(ProtoBuf$Type protoBuf$Type, c cVar) {
        m0.n.b.i.e(protoBuf$Type, "proto");
        m0.n.b.i.e(cVar, "nameResolver");
        Object m = protoBuf$Type.m(JvmProtoBuf.f);
        m0.n.b.i.d(m, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) m;
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            m0.n.b.i.d(protoBuf$Annotation, "it");
            m0.n.b.i.e(protoBuf$Annotation, "proto");
            m0.n.b.i.e(cVar, "nameResolver");
            arrayList.add(((m0.r.t.a.r.e.b.b) this).e.a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    public C e(r rVar, ProtoBuf$Property protoBuf$Property, v vVar) {
        C c;
        C vVar2;
        m0.n.b.i.e(rVar, "container");
        m0.n.b.i.e(protoBuf$Property, "proto");
        m0.n.b.i.e(vVar, "expectedType");
        Boolean f = m0.r.t.a.r.f.c.b.z.d(protoBuf$Property.Y1);
        m0.r.t.a.r.f.d.a.h hVar = m0.r.t.a.r.f.d.a.h.a;
        j r = r(rVar, true, true, f, m0.r.t.a.r.f.d.a.h.d(protoBuf$Property));
        if (r == null) {
            r = rVar instanceof r.a ? u((r.a) rVar) : null;
        }
        if (r == null) {
            return null;
        }
        m0.r.t.a.r.f.d.a.f fVar = r.a().b;
        DeserializedDescriptorResolver.a aVar = DeserializedDescriptorResolver.a;
        m0.r.t.a.r.f.d.a.f fVar2 = DeserializedDescriptorResolver.f;
        Objects.requireNonNull(fVar);
        m0.n.b.i.e(fVar2, "version");
        m n = n(protoBuf$Property, rVar.a, rVar.b, AnnotatedCallableKind.PROPERTY, fVar.a(fVar2.b, fVar2.c, fVar2.d));
        if (n == null || (c = ((a) ((LockBasedStorageManager.m) this.b).invoke(r)).b.get(n)) == null) {
            return null;
        }
        m0.r.t.a.r.b.i iVar = m0.r.t.a.r.b.i.a;
        if (!m0.r.t.a.r.b.i.a(vVar)) {
            return c;
        }
        C c2 = (g) c;
        m0.n.b.i.e(c2, "constant");
        if (c2 instanceof d) {
            vVar2 = new t(((Number) ((d) c2).a).byteValue());
        } else if (c2 instanceof m0.r.t.a.r.j.p.r) {
            vVar2 = new w(((Number) ((m0.r.t.a.r.j.p.r) c2).a).shortValue());
        } else if (c2 instanceof m0.r.t.a.r.j.p.l) {
            vVar2 = new u(((Number) ((m0.r.t.a.r.j.p.l) c2).a).intValue());
        } else if (!(c2 instanceof p)) {
            return c2;
        } else {
            vVar2 = new m0.r.t.a.r.j.p.v(((Number) ((p) c2).a).longValue());
        }
        return vVar2;
    }

    public List<A> f(r rVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        m0.n.b.i.e(rVar, "container");
        m0.n.b.i.e(protoBuf$EnumEntry, "proto");
        String b2 = rVar.a.b(protoBuf$EnumEntry.Y1);
        m0.r.t.a.r.f.d.a.b bVar = m0.r.t.a.r.f.d.a.b.a;
        String c = ((r.a) rVar).f.c();
        m0.n.b.i.d(c, "container as ProtoContainer.Class).classId.asString()");
        return m(this, rVar, m.a(b2, m0.r.t.a.r.f.d.a.b.b(c)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List<A> g(r rVar, ProtoBuf$Property protoBuf$Property) {
        m0.n.b.i.e(rVar, "container");
        m0.n.b.i.e(protoBuf$Property, "proto");
        return t(rVar, protoBuf$Property, PropertyRelatedElement.BACKING_FIELD);
    }

    public List<A> h(r rVar, m0.r.t.a.r.h.l lVar, AnnotatedCallableKind annotatedCallableKind) {
        m0.n.b.i.e(rVar, "container");
        m0.n.b.i.e(lVar, "proto");
        m0.n.b.i.e(annotatedCallableKind, "kind");
        m o = o(this, lVar, rVar.a, rVar.b, annotatedCallableKind, false, 16, (Object) null);
        if (o == null) {
            return EmptyList.c;
        }
        return m(this, rVar, m.e(o, 0), false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List<A> i(r rVar, ProtoBuf$Property protoBuf$Property) {
        m0.n.b.i.e(rVar, "container");
        m0.n.b.i.e(protoBuf$Property, "proto");
        return t(rVar, protoBuf$Property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    public List<A> j(r rVar, m0.r.t.a.r.h.l lVar, AnnotatedCallableKind annotatedCallableKind) {
        m0.n.b.i.e(rVar, "container");
        m0.n.b.i.e(lVar, "proto");
        m0.n.b.i.e(annotatedCallableKind, "kind");
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return t(rVar, (ProtoBuf$Property) lVar, PropertyRelatedElement.PROPERTY);
        }
        m o = o(this, lVar, rVar.a, rVar.b, annotatedCallableKind, false, 16, (Object) null);
        if (o == null) {
            return EmptyList.c;
        }
        return m(this, rVar, o, false, false, (Boolean) null, false, 60, (Object) null);
    }

    public final List<A> l(r rVar, m mVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        j r = r(rVar, z, z2, bool, z3);
        if (r == null) {
            r = rVar instanceof r.a ? u((r.a) rVar) : null;
        }
        if (r == null) {
            return EmptyList.c;
        }
        List<A> list = ((a) ((LockBasedStorageManager.m) this.b).invoke(r)).a.get(mVar);
        return list == null ? EmptyList.c : list;
    }

    public final m n(m0.r.t.a.r.h.l lVar, c cVar, e eVar, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        if (lVar instanceof ProtoBuf$Constructor) {
            e.b a2 = m0.r.t.a.r.f.d.a.h.a.a((ProtoBuf$Constructor) lVar, cVar, eVar);
            if (a2 == null) {
                return null;
            }
            return m.b(a2);
        } else if (lVar instanceof ProtoBuf$Function) {
            e.b c = m0.r.t.a.r.f.d.a.h.a.c((ProtoBuf$Function) lVar, cVar, eVar);
            if (c == null) {
                return null;
            }
            return m.b(c);
        } else if (!(lVar instanceof ProtoBuf$Property)) {
            return null;
        } else {
            GeneratedMessageLite.e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar2 = JvmProtoBuf.d;
            m0.n.b.i.d(eVar2, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) h.c1((GeneratedMessageLite.ExtendableMessage) lVar, eVar2);
            if (jvmPropertySignature == null) {
                return null;
            }
            int ordinal = annotatedCallableKind.ordinal();
            if (ordinal == 1) {
                return p((ProtoBuf$Property) lVar, cVar, eVar, true, true, z);
            } else if (ordinal != 2) {
                if (ordinal != 3 || !jvmPropertySignature.l()) {
                    return null;
                }
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.a2;
                m0.n.b.i.d(jvmMethodSignature, "signature.setter");
                return m.c(cVar, jvmMethodSignature);
            } else if (!jvmPropertySignature.i()) {
                return null;
            } else {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature2 = jvmPropertySignature.Z1;
                m0.n.b.i.d(jvmMethodSignature2, "signature.getter");
                return m.c(cVar, jvmMethodSignature2);
            }
        }
    }

    public final m p(ProtoBuf$Property protoBuf$Property, c cVar, m0.r.t.a.r.f.c.e eVar, boolean z, boolean z2, boolean z3) {
        GeneratedMessageLite.e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar2 = JvmProtoBuf.d;
        m0.n.b.i.d(eVar2, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) h.c1(protoBuf$Property, eVar2);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            e.a b2 = m0.r.t.a.r.f.d.a.h.a.b(protoBuf$Property, cVar, eVar, z3);
            if (b2 == null) {
                return null;
            }
            return m.b(b2);
        }
        if (z2) {
            if ((jvmPropertySignature.x & 2) == 2) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.Y1;
                m0.n.b.i.d(jvmMethodSignature, "signature.syntheticMethod");
                return m.c(cVar, jvmMethodSignature);
            }
        }
        return null;
    }

    public final j r(r rVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        r.a aVar;
        ProtoBuf$Class.Kind kind;
        m0.r.t.a.r.j.s.b bVar;
        if (z) {
            if (bool != null) {
                if (rVar instanceof r.a) {
                    r.a aVar2 = (r.a) rVar;
                    if (aVar2.g == ProtoBuf$Class.Kind.INTERFACE) {
                        i iVar = this.a;
                        m0.r.t.a.r.g.a d = aVar2.f.d(m0.r.t.a.r.g.d.g("DefaultImpls"));
                        m0.n.b.i.d(d, "container.classId.createNestedClassId(Name.identifier(JvmAbi.DEFAULT_IMPLS_CLASS_NAME))");
                        return h.F0(iVar, d);
                    }
                }
                if (bool.booleanValue() && (rVar instanceof r.b)) {
                    h0 h0Var = rVar.c;
                    m0.r.t.a.r.e.b.e eVar = h0Var instanceof m0.r.t.a.r.e.b.e ? (m0.r.t.a.r.e.b.e) h0Var : null;
                    if (eVar == null) {
                        bVar = null;
                    } else {
                        bVar = eVar.c;
                    }
                    if (bVar != null) {
                        i iVar2 = this.a;
                        String e = bVar.e();
                        m0.n.b.i.d(e, "facadeClassName.internalName");
                        m0.r.t.a.r.g.a l = m0.r.t.a.r.g.a.l(new m0.r.t.a.r.g.b(StringsKt__IndentKt.A(e, '/', '.', false, 4)));
                        m0.n.b.i.d(l, "topLevel(FqName(facadeClassName.internalName.replace('/', '.')))");
                        return h.F0(iVar2, l);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + rVar + ')').toString());
            }
        }
        if (z2 && (rVar instanceof r.a)) {
            r.a aVar3 = (r.a) rVar;
            if (aVar3.g == ProtoBuf$Class.Kind.COMPANION_OBJECT && (aVar = aVar3.e) != null && ((kind = aVar.g) == ProtoBuf$Class.Kind.CLASS || kind == ProtoBuf$Class.Kind.ENUM_CLASS || (z3 && (kind == ProtoBuf$Class.Kind.INTERFACE || kind == ProtoBuf$Class.Kind.ANNOTATION_CLASS)))) {
                return u(aVar);
            }
        }
        if (rVar instanceof r.b) {
            h0 h0Var2 = rVar.c;
            if (h0Var2 instanceof m0.r.t.a.r.e.b.e) {
                Objects.requireNonNull(h0Var2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                m0.r.t.a.r.e.b.e eVar2 = (m0.r.t.a.r.e.b.e) h0Var2;
                j jVar = eVar2.d;
                return jVar == null ? h.F0(this.a, eVar2.d()) : jVar;
            }
        }
        return null;
    }

    public abstract j.a s(m0.r.t.a.r.g.a aVar, h0 h0Var, List<A> list);

    public final List<A> t(r rVar, ProtoBuf$Property protoBuf$Property, PropertyRelatedElement propertyRelatedElement) {
        r rVar2 = rVar;
        PropertyRelatedElement propertyRelatedElement2 = propertyRelatedElement;
        boolean E = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.z, protoBuf$Property.Y1, "IS_CONST.get(proto.flags)");
        m0.r.t.a.r.f.d.a.h hVar = m0.r.t.a.r.f.d.a.h.a;
        boolean d = m0.r.t.a.r.f.d.a.h.d(protoBuf$Property);
        if (propertyRelatedElement2 == PropertyRelatedElement.PROPERTY) {
            m q = q(this, protoBuf$Property, rVar2.a, rVar2.b, false, true, false, 40, (Object) null);
            if (q == null) {
                return EmptyList.c;
            }
            return m(this, rVar, q, true, false, Boolean.valueOf(E), d, 8, (Object) null);
        }
        m q2 = q(this, protoBuf$Property, rVar2.a, rVar2.b, true, false, false, 48, (Object) null);
        if (q2 == null) {
            return EmptyList.c;
        }
        boolean z = false;
        boolean d2 = StringsKt__IndentKt.d(q2.a, "$delegate", false, 2);
        if (propertyRelatedElement2 == PropertyRelatedElement.DELEGATE_FIELD) {
            z = true;
        }
        if (d2 != z) {
            return EmptyList.c;
        }
        return l(rVar, q2, true, true, Boolean.valueOf(E), d);
    }

    public final j u(r.a aVar) {
        h0 h0Var = aVar.c;
        m0.r.t.a.r.e.b.l lVar = h0Var instanceof m0.r.t.a.r.e.b.l ? (m0.r.t.a.r.e.b.l) h0Var : null;
        if (lVar == null) {
            return null;
        }
        return lVar.b;
    }
}
