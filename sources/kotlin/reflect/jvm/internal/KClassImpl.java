package kotlin.reflect.jvm.internal;

import i0.d.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.t.a.f;
import m0.r.t.a.h;
import m0.r.t.a.j;
import m0.r.t.a.k;
import m0.r.t.a.n;
import m0.r.t.a.o;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.g.b;

/* compiled from: KClassImpl.kt */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements d<T>, f, h {
    public static final /* synthetic */ int q = 0;
    public final k<KClassImpl<T>.Data> x;
    public final Class<T> y;

    /* compiled from: KClassImpl.kt */
    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ m0.r.k[] d;
        public final j e = i0.j.f.p.h.K2(new KClassImpl$Data$descriptor$2(this));
        public final j f;
        public final j g;
        public final j h;
        public final j i;
        public final j j;
        public final j k;
        public final j l;
        public final j m;

        /* compiled from: kotlin-style lambda group */
        public static final class a extends Lambda implements m0.n.a.a<Collection<? extends KCallableImpl<?>>> {
            public final /* synthetic */ int c;
            public final /* synthetic */ Object d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i, Object obj) {
                super(0);
                this.c = i;
                this.d = obj;
            }

            public final Object invoke() {
                int i = this.c;
                if (i == 0) {
                    KClassImpl kClassImpl = KClassImpl.this;
                    return kClassImpl.q(kClassImpl.B(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                } else if (i == 1) {
                    KClassImpl kClassImpl2 = KClassImpl.this;
                    return kClassImpl2.q(kClassImpl2.C(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
                } else if (i == 2) {
                    KClassImpl kClassImpl3 = KClassImpl.this;
                    return kClassImpl3.q(kClassImpl3.B(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                } else if (i == 3) {
                    KClassImpl kClassImpl4 = KClassImpl.this;
                    return kClassImpl4.q(kClassImpl4.C(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
                } else {
                    throw null;
                }
            }
        }

        /* compiled from: kotlin-style lambda group */
        public static final class b extends Lambda implements m0.n.a.a<List<? extends KCallableImpl<?>>> {
            public final /* synthetic */ int c;
            public final /* synthetic */ Object d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(int i, Object obj) {
                super(0);
                this.c = i;
                this.d = obj;
            }

            public final Object invoke() {
                int i = this.c;
                if (i == 0) {
                    j jVar = ((Data) this.d).l;
                    m0.r.k[] kVarArr = Data.d;
                    m0.r.k kVar = kVarArr[14];
                    j jVar2 = ((Data) this.d).m;
                    m0.r.k kVar2 = kVarArr[15];
                    return g.Z((Collection) jVar.invoke(), (Collection) jVar2.invoke());
                } else if (i == 1) {
                    j jVar3 = ((Data) this.d).h;
                    m0.r.k[] kVarArr2 = Data.d;
                    m0.r.k kVar3 = kVarArr2[10];
                    j jVar4 = ((Data) this.d).j;
                    m0.r.k kVar4 = kVarArr2[12];
                    return g.Z((Collection) jVar3.invoke(), (Collection) jVar4.invoke());
                } else if (i == 2) {
                    j jVar5 = ((Data) this.d).i;
                    m0.r.k[] kVarArr3 = Data.d;
                    m0.r.k kVar5 = kVarArr3[11];
                    j jVar6 = ((Data) this.d).k;
                    m0.r.k kVar6 = kVarArr3[13];
                    return g.Z((Collection) jVar5.invoke(), (Collection) jVar6.invoke());
                } else if (i == 3) {
                    j jVar7 = ((Data) this.d).h;
                    m0.r.k[] kVarArr4 = Data.d;
                    m0.r.k kVar7 = kVarArr4[10];
                    j jVar8 = ((Data) this.d).i;
                    m0.r.k kVar8 = kVarArr4[11];
                    return g.Z((Collection) jVar7.invoke(), (Collection) jVar8.invoke());
                } else {
                    throw null;
                }
            }
        }

        /* compiled from: kotlin-style lambda group */
        public static final class c extends Lambda implements m0.n.a.a<String> {
            public final /* synthetic */ int c;
            public final /* synthetic */ Object d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(int i, Object obj) {
                super(0);
                this.c = i;
                this.d = obj;
            }

            public final Object invoke() {
                String str;
                int i = this.c;
                if (i != 0) {
                    if (i != 1) {
                        throw null;
                    } else if (KClassImpl.this.y.isAnonymousClass()) {
                        return null;
                    } else {
                        m0.r.t.a.r.g.a z = KClassImpl.this.z();
                        if (z.c) {
                            Class<T> cls = KClassImpl.this.y;
                            String simpleName = cls.getSimpleName();
                            Method enclosingMethod = cls.getEnclosingMethod();
                            if (enclosingMethod != null) {
                                i.d(simpleName, "name");
                                str = StringsKt__IndentKt.N(simpleName, enclosingMethod.getName() + "$", (String) null, 2);
                            } else {
                                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                                if (enclosingConstructor != null) {
                                    i.d(simpleName, "name");
                                    str = StringsKt__IndentKt.N(simpleName, enclosingConstructor.getName() + "$", (String) null, 2);
                                } else {
                                    i.d(simpleName, "name");
                                    str = StringsKt__IndentKt.M(simpleName, '$', (String) null, 2);
                                }
                            }
                        } else {
                            str = z.j().b();
                            i.d(str, "classId.shortClassName.asString()");
                        }
                        return str;
                    }
                } else if (KClassImpl.this.y.isAnonymousClass()) {
                    return null;
                } else {
                    m0.r.t.a.r.g.a z2 = KClassImpl.this.z();
                    if (z2.c) {
                        return null;
                    }
                    return z2.b().b();
                }
            }
        }

        static {
            Class<Data> cls = Data.class;
            d = new m0.r.k[]{m.c(new PropertyReference1Impl(m.a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), m.c(new PropertyReference1Impl(m.a(cls), "annotations", "getAnnotations()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "simpleName", "getSimpleName()Ljava/lang/String;")), m.c(new PropertyReference1Impl(m.a(cls), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), m.c(new PropertyReference1Impl(m.a(cls), "constructors", "getConstructors()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), m.c(new PropertyReference1Impl(m.a(cls), "typeParameters", "getTypeParameters()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "supertypes", "getSupertypes()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), m.c(new PropertyReference1Impl(m.a(cls), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), m.c(new PropertyReference1Impl(m.a(cls), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            super();
            i0.j.f.p.h.K2(new KClassImpl$Data$annotations$2(this));
            this.f = i0.j.f.p.h.K2(new c(1, this));
            this.g = i0.j.f.p.h.K2(new c(0, this));
            i0.j.f.p.h.K2(new KClassImpl$Data$constructors$2(this));
            i0.j.f.p.h.K2(new KClassImpl$Data$nestedClasses$2(this));
            new k(new KClassImpl$Data$objectInstance$2(this));
            i0.j.f.p.h.K2(new KClassImpl$Data$typeParameters$2(this));
            i0.j.f.p.h.K2(new KClassImpl$Data$supertypes$2(this));
            i0.j.f.p.h.K2(new KClassImpl$Data$sealedSubclasses$2(this));
            this.h = i0.j.f.p.h.K2(new a(0, this));
            this.i = i0.j.f.p.h.K2(new a(1, this));
            this.j = i0.j.f.p.h.K2(new a(2, this));
            this.k = i0.j.f.p.h.K2(new a(3, this));
            this.l = i0.j.f.p.h.K2(new b(1, this));
            this.m = i0.j.f.p.h.K2(new b(2, this));
            i0.j.f.p.h.K2(new b(3, this));
            i0.j.f.p.h.K2(new b(0, this));
        }

        public final m0.r.t.a.r.c.d a() {
            j jVar = this.e;
            m0.r.k kVar = d[0];
            return (m0.r.t.a.r.c.d) jVar.invoke();
        }
    }

    public KClassImpl(Class<T> cls) {
        i.e(cls, "jClass");
        this.y = cls;
        k<KClassImpl<T>.Data> I2 = i0.j.f.p.h.I2(new KClassImpl$data$1(this));
        i.d(I2, "ReflectProperties.lazy { Data() }");
        this.x = I2;
    }

    /* renamed from: A */
    public m0.r.t.a.r.c.d getDescriptor() {
        return this.x.invoke().a();
    }

    public final MemberScope B() {
        return getDescriptor().q().o();
    }

    public final MemberScope C() {
        MemberScope Q = getDescriptor().Q();
        i.d(Q, "descriptor.staticScope");
        return Q;
    }

    public String b() {
        j jVar = this.x.invoke().g;
        m0.r.k kVar = Data.d[3];
        return (String) jVar.invoke();
    }

    public String e() {
        j jVar = this.x.invoke().f;
        m0.r.k kVar = Data.d[2];
        return (String) jVar.invoke();
    }

    public boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && i.a(i0.j.f.p.h.m1(this), i0.j.f.p.h.m1((d) obj));
    }

    public Class<T> h() {
        return this.y;
    }

    public int hashCode() {
        return i0.j.f.p.h.m1(this).hashCode();
    }

    public Collection<m0.r.t.a.r.c.h> n() {
        m0.r.t.a.r.c.d A = getDescriptor();
        if (A.f() == ClassKind.INTERFACE || A.f() == ClassKind.OBJECT) {
            return EmptyList.c;
        }
        Collection<c> k = A.k();
        i.d(k, "descriptor.constructors");
        return k;
    }

    public Collection<r> o(m0.r.t.a.r.g.d dVar) {
        i.e(dVar, "name");
        MemberScope B = B();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return g.Z(B.a(dVar, noLookupLocation), C().a(dVar, noLookupLocation));
    }

    public c0 p(int i) {
        Class<?> declaringClass;
        if (!i.a(this.y.getSimpleName(), "DefaultImpls") || (declaringClass = this.y.getDeclaringClass()) == null || !declaringClass.isInterface()) {
            m0.r.t.a.r.c.d A = getDescriptor();
            if (!(A instanceof DeserializedClassDescriptor)) {
                A = null;
            }
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) A;
            if (deserializedClassDescriptor == null) {
                return null;
            }
            ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.y;
            GeneratedMessageLite.e<ProtoBuf$Class, List<ProtoBuf$Property>> eVar = JvmProtoBuf.j;
            i.d(eVar, "JvmProtoBuf.classLocalVariable");
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) i0.j.f.p.h.d1(protoBuf$Class, eVar, i);
            if (protoBuf$Property == null) {
                return null;
            }
            Class<T> cls = this.y;
            m0.r.t.a.r.k.b.i iVar = deserializedClassDescriptor.e2;
            return (c0) o.d(cls, protoBuf$Property, iVar.b, iVar.d, deserializedClassDescriptor.Y1, KClassImpl$getLocalProperty$2$1$1.c);
        }
        d<?> r1 = i0.j.f.p.h.r1(declaringClass);
        Objects.requireNonNull(r1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        return ((KClassImpl) r1).p(i);
    }

    public Collection<c0> s(m0.r.t.a.r.g.d dVar) {
        i.e(dVar, "name");
        MemberScope B = B();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return g.Z(B.c(dVar, noLookupLocation), C().c(dVar, noLookupLocation));
    }

    public String toString() {
        String str;
        StringBuilder P0 = a.P0("class ");
        m0.r.t.a.r.g.a z = z();
        b h = z.h();
        i.d(h, "classId.packageFqName");
        if (h.d()) {
            str = "";
        } else {
            str = h.b() + ".";
        }
        String b = z.i().b();
        i.d(b, "classId.relativeClassName.asString()");
        P0.append(str + StringsKt__IndentKt.A(b, '.', '$', false, 4));
        return P0.toString();
    }

    public final m0.r.t.a.r.g.a z() {
        m0.r.t.a.r.g.a g;
        n nVar = n.b;
        Class<T> cls = this.y;
        i.e(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            i.d(componentType, "klass.componentType");
            PrimitiveType a = n.a(componentType);
            if (a != null) {
                return new m0.r.t.a.r.g.a(m0.r.t.a.r.b.g.l, a.getArrayTypeName());
            }
            m0.r.t.a.r.g.a l = m0.r.t.a.r.g.a.l(g.a.h.i());
            i.d(l, "ClassId.topLevel(Standar…s.FqNames.array.toSafe())");
            return l;
        } else if (i.a(cls, Void.TYPE)) {
            return n.a;
        } else {
            PrimitiveType a2 = n.a(cls);
            if (a2 != null) {
                g = new m0.r.t.a.r.g.a(m0.r.t.a.r.b.g.l, a2.getTypeName());
            } else {
                m0.r.t.a.r.g.a b = ReflectClassUtilKt.b(cls);
                if (b.c) {
                    return b;
                }
                m0.r.t.a.r.b.k.c cVar = m0.r.t.a.r.b.k.c.a;
                b b2 = b.b();
                i.d(b2, "classId.asSingleFqName()");
                g = cVar.g(b2);
                if (g == null) {
                    return b;
                }
            }
            return g;
        }
    }
}
