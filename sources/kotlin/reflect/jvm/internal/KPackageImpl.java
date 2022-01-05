package kotlin.reflect.jvm.internal;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.j;
import m0.r.t.a.k;
import m0.r.t.a.o;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.v0.a.e;
import m0.r.t.a.r.f.d.a.f;
import m0.r.t.a.r.f.d.a.g;
import m0.r.t.a.r.g.d;

/* compiled from: KPackageImpl.kt */
public final class KPackageImpl extends KDeclarationContainerImpl {
    public final k<Data> q;
    public final Class<?> x;

    /* compiled from: KPackageImpl.kt */
    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ m0.r.k[] d;
        public final j e = h.K2(new KPackageImpl$Data$kotlinClass$2(this));
        public final j f = h.K2(new KPackageImpl$Data$scope$2(this));
        public final k g = h.I2(new KPackageImpl$Data$multifileFacade$2(this));
        public final k h = h.I2(new KPackageImpl$Data$metadata$2(this));

        static {
            Class<Data> cls = Data.class;
            d = new m0.r.k[]{m.c(new PropertyReference1Impl(m.a(cls), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), m.c(new PropertyReference1Impl(m.a(cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), m.c(new PropertyReference1Impl(m.a(cls), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), m.c(new PropertyReference1Impl(m.a(cls), "metadata", "getMetadata()Lkotlin/Triple;")), m.c(new PropertyReference1Impl(m.a(cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            super();
            h.K2(new KPackageImpl$Data$members$2(this));
        }

        public static final e a(Data data) {
            j jVar = data.e;
            m0.r.k kVar = d[0];
            return (e) jVar.invoke();
        }
    }

    public KPackageImpl(Class<?> cls, String str) {
        i.e(cls, "jClass");
        this.x = cls;
        k<Data> I2 = h.I2(new KPackageImpl$data$1(this));
        i.d(I2, "ReflectProperties.lazy { Data() }");
        this.q = I2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof KPackageImpl) && i.a(this.x, ((KPackageImpl) obj).x);
    }

    public Class<?> h() {
        return this.x;
    }

    public int hashCode() {
        return this.x.hashCode();
    }

    public Collection<m0.r.t.a.r.c.h> n() {
        return EmptyList.c;
    }

    public Collection<r> o(d dVar) {
        i.e(dVar, "name");
        return z().a(dVar, NoLookupLocation.FROM_REFLECTION);
    }

    public c0 p(int i) {
        k kVar = this.q.invoke().h;
        m0.r.k kVar2 = Data.d[3];
        Triple triple = (Triple) kVar.invoke();
        if (triple != null) {
            g gVar = (g) triple.c;
            ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) triple.d;
            f fVar = (f) triple.q;
            GeneratedMessageLite.e<ProtoBuf$Package, List<ProtoBuf$Property>> eVar = JvmProtoBuf.n;
            i.d(eVar, "JvmProtoBuf.packageLocalVariable");
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) h.d1(protoBuf$Package, eVar, i);
            if (protoBuf$Property != null) {
                Class<?> cls = this.x;
                ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Package.b2;
                i.d(protoBuf$TypeTable, "packageProto.typeTable");
                return (c0) o.d(cls, protoBuf$Property, gVar, new m0.r.t.a.r.f.c.e(protoBuf$TypeTable), fVar, KPackageImpl$getLocalProperty$1$1$1.c);
            }
        }
        return null;
    }

    public Class<?> r() {
        k kVar = this.q.invoke().g;
        m0.r.k kVar2 = Data.d[2];
        Class<?> cls = (Class) kVar.invoke();
        return cls != null ? cls : this.x;
    }

    public Collection<c0> s(d dVar) {
        i.e(dVar, "name");
        return z().c(dVar, NoLookupLocation.FROM_REFLECTION);
    }

    public String toString() {
        StringBuilder P0 = a.P0("file class ");
        P0.append(ReflectClassUtilKt.b(this.x).b());
        return P0.toString();
    }

    public final MemberScope z() {
        j jVar = this.q.invoke().f;
        m0.r.k kVar = Data.d[1];
        return (MemberScope) jVar.invoke();
    }
}
