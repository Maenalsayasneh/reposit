package m0.r.t.a.r.f.d.a;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.f.c.b;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.f.d.a.e;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.h.l;

/* compiled from: JvmProtoBufUtil.kt */
public final class h {
    public static final h a = new h();
    public static final e b;

    static {
        e eVar = new e();
        eVar.a(JvmProtoBuf.a);
        eVar.a(JvmProtoBuf.b);
        eVar.a(JvmProtoBuf.c);
        eVar.a(JvmProtoBuf.d);
        eVar.a(JvmProtoBuf.e);
        eVar.a(JvmProtoBuf.f);
        eVar.a(JvmProtoBuf.g);
        eVar.a(JvmProtoBuf.h);
        eVar.a(JvmProtoBuf.i);
        eVar.a(JvmProtoBuf.j);
        eVar.a(JvmProtoBuf.k);
        eVar.a(JvmProtoBuf.l);
        eVar.a(JvmProtoBuf.m);
        eVar.a(JvmProtoBuf.n);
        i.d(eVar, "newInstance().apply(JvmProtoBuf::registerAllExtensions)");
        b = eVar;
    }

    public static final boolean d(ProtoBuf$Property protoBuf$Property) {
        i.e(protoBuf$Property, "proto");
        d dVar = d.a;
        b.C0265b bVar = d.b;
        Object m = protoBuf$Property.m(JvmProtoBuf.e);
        i.d(m, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean f = bVar.d(((Number) m).intValue());
        i.d(f, "JvmFlags.IS_MOVED_FROM_INTERFACE_COMPANION.get(proto.getExtension(JvmProtoBuf.flags))");
        return f.booleanValue();
    }

    public static final Pair<g, ProtoBuf$Class> f(String[] strArr, String[] strArr2) {
        i.e(strArr, MessageExtension.FIELD_DATA);
        i.e(strArr2, "strings");
        byte[] a2 = a.a(strArr);
        i.d(a2, "decodeBytes(data)");
        i.e(a2, "bytes");
        i.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2);
        e eVar = b;
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) ((m0.r.t.a.r.h.b) JvmProtoBuf.StringTableTypes.d).c(byteArrayInputStream, eVar);
        i.d(stringTableTypes, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        g gVar = new g(stringTableTypes, strArr2);
        m0.r.t.a.r.h.b bVar = (m0.r.t.a.r.h.b) ProtoBuf$Class.q;
        l d = bVar.d(byteArrayInputStream, eVar);
        bVar.b(d);
        return new Pair<>(gVar, (ProtoBuf$Class) d);
    }

    public static final Pair<g, ProtoBuf$Package> g(String[] strArr, String[] strArr2) {
        i.e(strArr, MessageExtension.FIELD_DATA);
        i.e(strArr2, "strings");
        byte[] a2 = a.a(strArr);
        i.d(a2, "decodeBytes(data)");
        i.e(a2, "bytes");
        i.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2);
        e eVar = b;
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) ((m0.r.t.a.r.h.b) JvmProtoBuf.StringTableTypes.d).c(byteArrayInputStream, eVar);
        i.d(stringTableTypes, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        g gVar = new g(stringTableTypes, strArr2);
        m0.r.t.a.r.h.b bVar = (m0.r.t.a.r.h.b) ProtoBuf$Package.q;
        l d = bVar.d(byteArrayInputStream, eVar);
        bVar.b(d);
        return new Pair<>(gVar, (ProtoBuf$Package) d);
    }

    public final e.b a(ProtoBuf$Constructor protoBuf$Constructor, c cVar, m0.r.t.a.r.f.c.e eVar) {
        String str;
        i.e(protoBuf$Constructor, "proto");
        i.e(cVar, "nameResolver");
        i.e(eVar, "typeTable");
        GeneratedMessageLite.e<ProtoBuf$Constructor, JvmProtoBuf.JvmMethodSignature> eVar2 = JvmProtoBuf.a;
        i.d(eVar2, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) i0.j.f.p.h.c1(protoBuf$Constructor, eVar2);
        String b2 = (jvmMethodSignature == null || !jvmMethodSignature.l()) ? "<init>" : cVar.b(jvmMethodSignature.y);
        if (jvmMethodSignature == null || !jvmMethodSignature.i()) {
            List<ProtoBuf$ValueParameter> list = protoBuf$Constructor.Z1;
            i.d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                i.d(protoBuf$ValueParameter, "it");
                String e = e(i0.j.f.p.h.r4(protoBuf$ValueParameter, eVar), cVar);
                if (e == null) {
                    return null;
                }
                arrayList.add(e);
            }
            str = g.E(arrayList, "", "(", ")V", 0, (CharSequence) null, (m0.n.a.l) null, 56);
        } else {
            str = cVar.b(jvmMethodSignature.Y1);
        }
        return new e.b(b2, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.f.d.a.e.a b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r7, m0.r.t.a.r.f.c.c r8, m0.r.t.a.r.f.c.e r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "proto"
            m0.n.b.i.e(r7, r0)
            java.lang.String r0 = "nameResolver"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "typeTable"
            m0.n.b.i.e(r9, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.d
            java.lang.String r1 = "propertySignature"
            m0.n.b.i.d(r0, r1)
            java.lang.Object r0 = i0.j.f.p.h.c1(r7, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 != 0) goto L_0x0020
            return r1
        L_0x0020:
            int r2 = r0.x
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 != r3) goto L_0x0029
            r2 = r3
            goto L_0x002a
        L_0x0029:
            r2 = r4
        L_0x002a:
            if (r2 == 0) goto L_0x002f
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.y
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 != 0) goto L_0x0035
            if (r10 == 0) goto L_0x0035
            return r1
        L_0x0035:
            if (r0 == 0) goto L_0x0044
            int r10 = r0.x
            r10 = r10 & r3
            if (r10 != r3) goto L_0x003e
            r10 = r3
            goto L_0x003f
        L_0x003e:
            r10 = r4
        L_0x003f:
            if (r10 == 0) goto L_0x0044
            int r10 = r0.y
            goto L_0x0046
        L_0x0044:
            int r10 = r7.a2
        L_0x0046:
            if (r0 == 0) goto L_0x0059
            int r2 = r0.x
            r5 = 2
            r2 = r2 & r5
            if (r2 != r5) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r3 = r4
        L_0x0050:
            if (r3 == 0) goto L_0x0059
            int r7 = r0.Y1
            java.lang.String r7 = r8.b(r7)
            goto L_0x0064
        L_0x0059:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = i0.j.f.p.h.F3(r7, r9)
            java.lang.String r7 = r6.e(r7, r8)
            if (r7 != 0) goto L_0x0064
            return r1
        L_0x0064:
            m0.r.t.a.r.f.d.a.e$a r9 = new m0.r.t.a.r.f.d.a.e$a
            java.lang.String r8 = r8.b(r10)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.f.d.a.h.b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, m0.r.t.a.r.f.c.c, m0.r.t.a.r.f.c.e, boolean):m0.r.t.a.r.f.d.a.e$a");
    }

    public final e.b c(ProtoBuf$Function protoBuf$Function, c cVar, m0.r.t.a.r.f.c.e eVar) {
        int i;
        String str;
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        c cVar2 = cVar;
        m0.r.t.a.r.f.c.e eVar2 = eVar;
        i.e(protoBuf$Function2, "proto");
        i.e(cVar2, "nameResolver");
        i.e(eVar2, "typeTable");
        GeneratedMessageLite.e<ProtoBuf$Function, JvmProtoBuf.JvmMethodSignature> eVar3 = JvmProtoBuf.b;
        i.d(eVar3, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) i0.j.f.p.h.c1(protoBuf$Function2, eVar3);
        if (jvmMethodSignature == null || !jvmMethodSignature.l()) {
            i = protoBuf$Function2.a2;
        } else {
            i = jvmMethodSignature.y;
        }
        if (jvmMethodSignature == null || !jvmMethodSignature.i()) {
            List L = g.L(i0.j.f.p.h.o3(protoBuf$Function2, eVar2));
            List<ProtoBuf$ValueParameter> list = protoBuf$Function2.g2;
            i.d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : list) {
                i.d(protoBuf$ValueParameter, "it");
                arrayList.add(i0.j.f.p.h.r4(protoBuf$ValueParameter, eVar2));
            }
            List Z = g.Z(L, arrayList);
            ArrayList arrayList2 = new ArrayList(i0.j.f.p.h.K(Z, 10));
            Iterator it = ((ArrayList) Z).iterator();
            while (it.hasNext()) {
                String e = e((ProtoBuf$Type) it.next(), cVar2);
                if (e == null) {
                    return null;
                }
                arrayList2.add(e);
            }
            String e2 = e(i0.j.f.p.h.E3(protoBuf$Function2, eVar2), cVar2);
            if (e2 == null) {
                return null;
            }
            str = i.k(g.E(arrayList2, "", "(", ")", 0, (CharSequence) null, (m0.n.a.l) null, 56), e2);
        } else {
            str = cVar2.b(jvmMethodSignature.Y1);
        }
        return new e.b(cVar2.b(i), str);
    }

    public final String e(ProtoBuf$Type protoBuf$Type, c cVar) {
        if (!protoBuf$Type.y()) {
            return null;
        }
        b bVar = b.a;
        return b.b(cVar.a(protoBuf$Type.d2));
    }
}
