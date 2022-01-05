package m0.r.t.a.r.k.b;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import m0.r.t.a.r.f.c.a;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.f.c.g;
import m0.r.t.a.r.k.b.w.d;

/* compiled from: context.kt */
public final class i {
    public final g a;
    public final c b;
    public final m0.r.t.a.r.c.i c;
    public final e d;
    public final g e;
    public final a f;
    public final d g;
    public final TypeDeserializer h;
    public final MemberDeserializer i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x005c, code lost:
        r0 = r18.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(m0.r.t.a.r.k.b.g r12, m0.r.t.a.r.f.c.c r13, m0.r.t.a.r.c.i r14, m0.r.t.a.r.f.c.e r15, m0.r.t.a.r.f.c.g r16, m0.r.t.a.r.f.c.a r17, m0.r.t.a.r.k.b.w.d r18, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r19, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r20) {
        /*
            r11 = this;
            r8 = r11
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            java.lang.String r7 = "components"
            m0.n.b.i.e(r12, r7)
            java.lang.String r7 = "nameResolver"
            m0.n.b.i.e(r13, r7)
            java.lang.String r7 = "containingDeclaration"
            m0.n.b.i.e(r14, r7)
            java.lang.String r7 = "typeTable"
            m0.n.b.i.e(r15, r7)
            java.lang.String r7 = "versionRequirementTable"
            m0.n.b.i.e(r4, r7)
            java.lang.String r7 = "metadataVersion"
            m0.n.b.i.e(r5, r7)
            java.lang.String r7 = "typeParameters"
            r9 = r20
            m0.n.b.i.e(r9, r7)
            r11.<init>()
            r8.a = r0
            r8.b = r1
            r8.c = r2
            r8.d = r3
            r8.e = r4
            r8.f = r5
            r8.g = r6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r10 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer
            java.lang.String r0 = "Deserializer for \""
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            m0.r.t.a.r.g.d r1 = r14.getName()
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            if (r6 != 0) goto L_0x005c
            goto L_0x0062
        L_0x005c:
            java.lang.String r0 = r18.c()
            if (r0 != 0) goto L_0x0064
        L_0x0062:
            java.lang.String r0 = "[container not found]"
        L_0x0064:
            r5 = r0
            r6 = 0
            r7 = 32
            r0 = r10
            r1 = r11
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.h = r10
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer
            r0.<init>(r11)
            r8.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.k.b.i.<init>(m0.r.t.a.r.k.b.g, m0.r.t.a.r.f.c.c, m0.r.t.a.r.c.i, m0.r.t.a.r.f.c.e, m0.r.t.a.r.f.c.g, m0.r.t.a.r.f.c.a, m0.r.t.a.r.k.b.w.d, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer, java.util.List):void");
    }

    public static /* synthetic */ i b(i iVar, m0.r.t.a.r.c.i iVar2, List list, c cVar, e eVar, g gVar, a aVar, int i2) {
        a aVar2 = null;
        c cVar2 = (i2 & 4) != 0 ? iVar.b : null;
        e eVar2 = (i2 & 8) != 0 ? iVar.d : null;
        g gVar2 = (i2 & 16) != 0 ? iVar.e : null;
        if ((i2 & 32) != 0) {
            aVar2 = iVar.f;
        }
        return iVar.a(iVar2, list, cVar2, eVar2, gVar2, aVar2);
    }

    public final i a(m0.r.t.a.r.c.i iVar, List<ProtoBuf$TypeParameter> list, c cVar, e eVar, g gVar, a aVar) {
        g gVar2;
        a aVar2 = aVar;
        m0.r.t.a.r.c.i iVar2 = iVar;
        m0.n.b.i.e(iVar, "descriptor");
        List<ProtoBuf$TypeParameter> list2 = list;
        m0.n.b.i.e(list, "typeParameterProtos");
        m0.n.b.i.e(cVar, "nameResolver");
        m0.n.b.i.e(eVar, "typeTable");
        g gVar3 = gVar;
        m0.n.b.i.e(gVar3, "versionRequirementTable");
        m0.n.b.i.e(aVar2, "metadataVersion");
        g gVar4 = this.a;
        m0.n.b.i.e(aVar2, "version");
        m0.n.b.i.e(aVar2, "version");
        boolean z = true;
        if (aVar2.b != 1 || aVar2.c < 4) {
            z = false;
        }
        if (z) {
            gVar2 = gVar3;
        } else {
            gVar2 = this.e;
        }
        return new i(gVar4, cVar, iVar, eVar, gVar2, aVar, this.g, this.h, list);
    }
}
