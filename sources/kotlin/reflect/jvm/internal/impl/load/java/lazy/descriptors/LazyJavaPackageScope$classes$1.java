package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import m0.n.a.l;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.e.a.i;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.b.i;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;

/* compiled from: LazyJavaPackageScope.kt */
public final class LazyJavaPackageScope$classes$1 extends Lambda implements l<LazyJavaPackageScope.a, d> {
    public final /* synthetic */ LazyJavaPackageScope c;
    public final /* synthetic */ c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, c cVar) {
        super(1);
        this.c = lazyJavaPackageScope;
        this.d = cVar;
    }

    public Object invoke(Object obj) {
        i.a aVar;
        j jVar;
        a aVar2;
        Object obj2;
        LightClassOriginKind lightClassOriginKind;
        b bVar;
        d dVar;
        LazyJavaPackageScope.a aVar3 = (LazyJavaPackageScope.a) obj;
        m0.n.b.i.e(aVar3, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        a aVar4 = new a(this.c.o.y, aVar3.a);
        g gVar = aVar3.b;
        if (gVar != null) {
            aVar = this.d.a.c.a(gVar);
        } else {
            aVar = this.d.a.c.c(aVar4);
        }
        j jVar2 = null;
        if (aVar == null) {
            jVar = null;
        } else {
            jVar = aVar.a();
        }
        if (jVar == null) {
            aVar2 = null;
        } else {
            aVar2 = jVar.e();
        }
        if (aVar2 != null && (aVar2.k() || aVar2.c)) {
            return null;
        }
        LazyJavaPackageScope lazyJavaPackageScope = this.c;
        Objects.requireNonNull(lazyJavaPackageScope);
        if (jVar == null) {
            obj2 = LazyJavaPackageScope.b.C0238b.a;
        } else if (jVar.a().a == KotlinClassHeader.Kind.CLASS) {
            DeserializedDescriptorResolver deserializedDescriptorResolver = lazyJavaPackageScope.c.a.d;
            Objects.requireNonNull(deserializedDescriptorResolver);
            m0.n.b.i.e(jVar, "kotlinClass");
            m0.r.t.a.r.k.b.d f = deserializedDescriptorResolver.f(jVar);
            if (f == null) {
                dVar = null;
            } else {
                ClassDeserializer classDeserializer = deserializedDescriptorResolver.c().t;
                a e = jVar.e();
                Objects.requireNonNull(classDeserializer);
                m0.n.b.i.e(e, "classId");
                dVar = classDeserializer.d.invoke(new ClassDeserializer.a(e, f));
            }
            obj2 = dVar != null ? new LazyJavaPackageScope.b.a(dVar) : LazyJavaPackageScope.b.C0238b.a;
        } else {
            obj2 = LazyJavaPackageScope.b.c.a;
        }
        if (obj2 instanceof LazyJavaPackageScope.b.a) {
            return ((LazyJavaPackageScope.b.a) obj2).a;
        }
        if (obj2 instanceof LazyJavaPackageScope.b.c) {
            return null;
        }
        if (obj2 instanceof LazyJavaPackageScope.b.C0238b) {
            g gVar2 = aVar3.b;
            if (gVar2 == null) {
                m0.r.t.a.r.e.a.i iVar = this.d.a.b;
                if (aVar != null) {
                    if (!(aVar instanceof i.a.C0262a)) {
                        aVar = null;
                    }
                    i.a.C0262a aVar5 = (i.a.C0262a) aVar;
                }
                gVar2 = iVar.a(new i.a(aVar4, (byte[]) null, (g) null, 4));
            }
            if (gVar2 == null) {
                lightClassOriginKind = null;
            } else {
                lightClassOriginKind = gVar2.H();
            }
            if (lightClassOriginKind == LightClassOriginKind.BINARY) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                sb.append(gVar2);
                sb.append("\nClassId: ");
                sb.append(aVar4);
                sb.append("\nfindKotlinClass(JavaClass) = ");
                m0.r.t.a.r.e.b.i iVar2 = this.d.a.c;
                m0.n.b.i.e(iVar2, "<this>");
                m0.n.b.i.e(gVar2, "javaClass");
                i.a a = iVar2.a(gVar2);
                if (a != null) {
                    jVar2 = a.a();
                }
                sb.append(jVar2);
                sb.append("\nfindKotlinClass(ClassId) = ");
                sb.append(h.F0(this.d.a.c, aVar4));
                sb.append(10);
                throw new IllegalStateException(sb.toString());
            }
            if (gVar2 == null) {
                bVar = null;
            } else {
                bVar = gVar2.d();
            }
            if (bVar == null || bVar.d() || !m0.n.b.i.a(bVar.e(), this.c.o.y)) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.d, this.c.o, gVar2, (d) null);
            this.d.a.s.a(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        throw new NoWhenBranchMatchedException();
    }
}
