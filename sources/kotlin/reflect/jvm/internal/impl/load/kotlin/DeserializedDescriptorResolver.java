package kotlin.reflect.jvm.internal.impl.load.kotlin;

import i0.j.f.p.h;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.e.b.l;
import m0.r.t.a.r.k.b.d;
import m0.r.t.a.r.k.b.n;
import m0.r.t.a.r.k.b.w.e;

/* compiled from: DeserializedDescriptorResolver.kt */
public final class DeserializedDescriptorResolver {
    public static final a a = new a((f) null);
    public static final Set<KotlinClassHeader.Kind> b = h.N3(KotlinClassHeader.Kind.CLASS);
    public static final Set<KotlinClassHeader.Kind> c = g.h0(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
    public static final m0.r.t.a.r.f.d.a.f d = new m0.r.t.a.r.f.d.a.f(1, 1, 2);
    public static final m0.r.t.a.r.f.d.a.f e = new m0.r.t.a.r.f.d.a.f(1, 1, 11);
    public static final m0.r.t.a.r.f.d.a.f f = new m0.r.t.a.r.f.d.a.f(1, 1, 13);
    public m0.r.t.a.r.k.b.g g;

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    public final MemberScope a(v vVar, j jVar) {
        String[] strArr;
        Pair<m0.r.t.a.r.f.d.a.g, ProtoBuf$Package> pair;
        i.e(vVar, "descriptor");
        i.e(jVar, "kotlinClass");
        String[] g2 = g(jVar, c);
        if (g2 == null || (strArr = jVar.a().e) == null) {
            return null;
        }
        try {
            m0.r.t.a.r.f.d.a.h hVar = m0.r.t.a.r.f.d.a.h.a;
            pair = m0.r.t.a.r.f.d.a.h.g(g2, strArr);
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalStateException(i.k("Could not read data from ", jVar.getLocation()), e2);
        } catch (Throwable th) {
            if (c().c.d() || jVar.a().b.c()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) pair.d;
        m0.r.t.a.r.f.d.a.g gVar = (m0.r.t.a.r.f.d.a.g) pair.c;
        return new e(vVar, protoBuf$Package, gVar, jVar.a().b, new m0.r.t.a.r.e.b.e(jVar, protoBuf$Package, gVar, d(jVar), e(jVar), b(jVar)), c(), DeserializedDescriptorResolver$createKotlinPackagePartScope$2.c);
    }

    public final DeserializedContainerAbiStability b(j jVar) {
        if (c().c.b()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        KotlinClassHeader a2 = jVar.a();
        boolean z = true;
        if (a2.b(a2.g, 64) && !a2.b(a2.g, 32)) {
            return DeserializedContainerAbiStability.FIR_UNSTABLE;
        }
        KotlinClassHeader a3 = jVar.a();
        if (!a3.b(a3.g, 16) || a3.b(a3.g, 32)) {
            z = false;
        }
        if (z) {
            return DeserializedContainerAbiStability.IR_UNSTABLE;
        }
        return DeserializedContainerAbiStability.STABLE;
    }

    public final m0.r.t.a.r.k.b.g c() {
        m0.r.t.a.r.k.b.g gVar = this.g;
        if (gVar != null) {
            return gVar;
        }
        i.m("components");
        throw null;
    }

    public final n<m0.r.t.a.r.f.d.a.f> d(j jVar) {
        if (c().c.d() || jVar.a().b.c()) {
            return null;
        }
        return new n<>(jVar.a().b, m0.r.t.a.r.f.d.a.f.f, jVar.getLocation(), jVar.e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(m0.r.t.a.r.e.b.j r6) {
        /*
            r5 = this;
            m0.r.t.a.r.k.b.g r0 = r5.c()
            m0.r.t.a.r.k.b.h r0 = r0.c
            boolean r0 = r0.e()
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x0029
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r6.a()
            int r4 = r0.g
            boolean r0 = r0.b(r4, r2)
            if (r0 != 0) goto L_0x0056
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r6.a()
            m0.r.t.a.r.f.d.a.f r0 = r0.b
            m0.r.t.a.r.f.d.a.f r4 = d
            boolean r0 = m0.n.b.i.a(r0, r4)
            if (r0 != 0) goto L_0x0056
        L_0x0029:
            m0.r.t.a.r.k.b.g r0 = r5.c()
            m0.r.t.a.r.k.b.h r0 = r0.c
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0051
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r6.a()
            int r4 = r0.g
            boolean r0 = r0.b(r4, r2)
            if (r0 == 0) goto L_0x0051
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r6 = r6.a()
            m0.r.t.a.r.f.d.a.f r6 = r6.b
            m0.r.t.a.r.f.d.a.f r0 = e
            boolean r6 = m0.n.b.i.a(r6, r0)
            if (r6 == 0) goto L_0x0051
            r6 = r1
            goto L_0x0052
        L_0x0051:
            r6 = r3
        L_0x0052:
            if (r6 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = r3
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.e(m0.r.t.a.r.e.b.j):boolean");
    }

    public final d f(j jVar) {
        String[] strArr;
        Pair<m0.r.t.a.r.f.d.a.g, ProtoBuf$Class> pair;
        i.e(jVar, "kotlinClass");
        String[] g2 = g(jVar, b);
        if (g2 == null || (strArr = jVar.a().e) == null) {
            return null;
        }
        try {
            m0.r.t.a.r.f.d.a.h hVar = m0.r.t.a.r.f.d.a.h.a;
            pair = m0.r.t.a.r.f.d.a.h.f(g2, strArr);
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalStateException(i.k("Could not read data from ", jVar.getLocation()), e2);
        } catch (Throwable th) {
            if (c().c.d() || jVar.a().b.c()) {
                throw th;
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new d((m0.r.t.a.r.f.d.a.g) pair.c, (ProtoBuf$Class) pair.d, jVar.a().b, new l(jVar, d(jVar), e(jVar), b(jVar)));
    }

    public final String[] g(j jVar, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader a2 = jVar.a();
        String[] strArr = a2.c;
        if (strArr == null) {
            strArr = a2.d;
        }
        if (strArr != null && set.contains(a2.a)) {
            return strArr;
        }
        return null;
    }
}
