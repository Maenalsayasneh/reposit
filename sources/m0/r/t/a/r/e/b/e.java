package m0.r.t.a.r.e.b;

import i0.d.a.a.a;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.r.t.a.r.c.i0;
import m0.r.t.a.r.j.s.b;
import m0.r.t.a.r.k.b.w.d;

/* compiled from: JvmPackagePartSource.kt */
public final class e implements d {
    public final b b;
    public final b c;
    public final j d;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(m0.r.t.a.r.e.b.j r5, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6, m0.r.t.a.r.f.c.c r7, m0.r.t.a.r.k.b.n<m0.r.t.a.r.f.d.a.f> r8, boolean r9, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r10) {
        /*
            r4 = this;
            java.lang.String r8 = "kotlinClass"
            m0.n.b.i.e(r5, r8)
            java.lang.String r8 = "packageProto"
            m0.n.b.i.e(r6, r8)
            java.lang.String r9 = "nameResolver"
            m0.n.b.i.e(r7, r9)
            java.lang.String r0 = "abiStability"
            m0.n.b.i.e(r10, r0)
            m0.r.t.a.r.g.a r1 = r5.e()
            m0.r.t.a.r.j.s.b r1 = m0.r.t.a.r.j.s.b.b(r1)
            java.lang.String r2 = "byClassId(kotlinClass.classId)"
            m0.n.b.i.d(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = r5.a()
            java.lang.String r2 = r2.a()
            if (r2 != 0) goto L_0x002c
            goto L_0x003c
        L_0x002c:
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 == 0) goto L_0x003c
            m0.r.t.a.r.j.s.b r2 = m0.r.t.a.r.j.s.b.d(r2)
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            java.lang.String r3 = "className"
            m0.n.b.i.e(r1, r3)
            m0.n.b.i.e(r6, r8)
            m0.n.b.i.e(r7, r9)
            m0.n.b.i.e(r10, r0)
            r4.<init>()
            r4.b = r1
            r4.c = r2
            r4.d = r5
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.m
            java.lang.String r8 = "packageModuleName"
            m0.n.b.i.d(r5, r8)
            java.lang.Object r5 = i0.j.f.p.h.c1(r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            int r5 = r5.intValue()
            m0.r.t.a.r.f.d.a.g r7 = (m0.r.t.a.r.f.d.a.g) r7
            r7.b(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.e.b.e.<init>(m0.r.t.a.r.e.b.j, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, m0.r.t.a.r.f.c.c, m0.r.t.a.r.k.b.n, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability):void");
    }

    public i0 a() {
        i0 i0Var = i0.a;
        i.d(i0Var, "NO_SOURCE_FILE");
        return i0Var;
    }

    public String c() {
        StringBuilder P0 = a.P0("Class '");
        P0.append(d().b().b());
        P0.append('\'');
        return P0.toString();
    }

    public final m0.r.t.a.r.g.a d() {
        m0.r.t.a.r.g.b bVar;
        b bVar2 = this.b;
        int lastIndexOf = bVar2.a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            bVar = m0.r.t.a.r.g.b.a;
            if (bVar == null) {
                b.a(7);
                throw null;
            }
        } else {
            bVar = new m0.r.t.a.r.g.b(bVar2.a.substring(0, lastIndexOf).replace('/', '.'));
        }
        return new m0.r.t.a.r.g.a(bVar, e());
    }

    public final m0.r.t.a.r.g.d e() {
        String e = this.b.e();
        i.d(e, "className.internalName");
        m0.r.t.a.r.g.d g = m0.r.t.a.r.g.d.g(StringsKt__IndentKt.P(e, '/', (String) null, 2));
        i.d(g, "identifier(className.internalName.substringAfterLast('/'))");
        return g;
    }

    public String toString() {
        return e.class.getSimpleName() + ": " + this.b;
    }
}
