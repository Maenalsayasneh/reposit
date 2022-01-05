package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.j.g;
import m0.n.a.l;
import m0.r.t.a.r.b.e;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.k.b.i;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer {
    public final i a;
    public final TypeDeserializer b;
    public final String c;
    public final String d;
    public boolean e;
    public final l<Integer, f> f;
    public final l<Integer, f> g;
    public final Map<Integer, m0> h;

    public TypeDeserializer(i iVar, TypeDeserializer typeDeserializer, List list, String str, String str2, boolean z, int i) {
        Map<Integer, m0> map;
        int i2 = 0;
        z = (i & 32) != 0 ? false : z;
        m0.n.b.i.e(iVar, "c");
        m0.n.b.i.e(list, "typeParameterProtos");
        m0.n.b.i.e(str, "debugName");
        m0.n.b.i.e(str2, "containerPresentableName");
        this.a = iVar;
        this.b = typeDeserializer;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = iVar.a.a.h(new TypeDeserializer$classifierDescriptors$1(this));
        this.g = iVar.a.a.h(new TypeDeserializer$typeAliasDescriptors$1(this));
        if (list.isEmpty()) {
            map = g.o();
        } else {
            map = new LinkedHashMap<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProtoBuf$TypeParameter protoBuf$TypeParameter = (ProtoBuf$TypeParameter) it.next();
                map.put(Integer.valueOf(protoBuf$TypeParameter.Y1), new DeserializedTypeParameterDescriptor(this.a, protoBuf$TypeParameter, i2));
                i2++;
            }
        }
        this.h = map;
    }

    public static final List<ProtoBuf$Type.Argument> e(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf$Type.Argument> list = protoBuf$Type.Y1;
        m0.n.b.i.d(list, "argumentList");
        ProtoBuf$Type Y2 = h.Y2(protoBuf$Type, typeDeserializer.a.d);
        Iterable e2 = Y2 == null ? null : e(Y2, typeDeserializer);
        if (e2 == null) {
            e2 = EmptyList.c;
        }
        return g.Z(list, e2);
    }

    public static final d g(TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type, int i) {
        a X0 = h.X0(typeDeserializer.a.b, i);
        List k = SequencesKt___SequencesKt.k(SequencesKt___SequencesKt.g(m0.r.t.a.r.m.a1.a.C1(protoBuf$Type, new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(typeDeserializer)), TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2.c));
        int b2 = SequencesKt___SequencesKt.b(m0.r.t.a.r.m.a1.a.C1(X0, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.c));
        while (true) {
            ArrayList arrayList = (ArrayList) k;
            if (arrayList.size() >= b2) {
                return typeDeserializer.a.a.l.a(X0, k);
            }
            arrayList.add(0);
        }
    }

    public final a0 a(int i) {
        if (h.X0(this.a.b, i).c) {
            return this.a.a.g.a();
        }
        return null;
    }

    public final a0 b(v vVar, v vVar2) {
        m0.r.t.a.r.b.f F1 = m0.r.t.a.r.m.a1.a.F1(vVar);
        m0.r.t.a.r.c.r0.f annotations = vVar.getAnnotations();
        v d2 = e.d(vVar);
        List<T> m = g.m(e.f(vVar), 1);
        ArrayList arrayList = new ArrayList(h.K(m, 10));
        for (T type : m) {
            arrayList.add(type.getType());
        }
        return e.a(F1, annotations, d2, arrayList, (List<m0.r.t.a.r.g.d>) null, vVar2, true).M0(vVar.J0());
    }

    public final List<m0> c() {
        return g.v0(this.h.values());
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x037c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.r.m.a0 d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "proto"
            m0.n.b.i.e(r1, r2)
            boolean r2 = r17.y()
            r3 = 0
            if (r2 == 0) goto L_0x0017
            int r2 = r1.d2
            m0.r.t.a.r.m.a0 r2 = r0.a(r2)
            goto L_0x0025
        L_0x0017:
            boolean r2 = r17.C()
            if (r2 == 0) goto L_0x0024
            int r2 = r1.g2
            m0.r.t.a.r.m.a0 r2 = r0.a(r2)
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            if (r2 == 0) goto L_0x0028
            return r2
        L_0x0028:
            boolean r2 = r17.y()
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0051
            m0.n.a.l<java.lang.Integer, m0.r.t.a.r.c.f> r2 = r0.f
            int r6 = r1.d2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r2.invoke(r6)
            m0.r.t.a.r.c.f r2 = (m0.r.t.a.r.c.f) r2
            if (r2 != 0) goto L_0x0046
            int r2 = r1.d2
            m0.r.t.a.r.c.d r2 = g(r0, r1, r2)
        L_0x0046:
            m0.r.t.a.r.m.j0 r2 = r2.i()
            java.lang.String r6 = "classifierDescriptors(proto.className) ?: notFoundClass(proto.className)).typeConstructor"
            m0.n.b.i.d(r2, r6)
            goto L_0x012c
        L_0x0051:
            int r2 = r1.y
            r6 = r2 & 32
            r7 = 32
            if (r6 != r7) goto L_0x005b
            r6 = r5
            goto L_0x005c
        L_0x005b:
            r6 = r4
        L_0x005c:
            if (r6 == 0) goto L_0x008f
            int r2 = r1.e2
            m0.r.t.a.r.m.j0 r2 = r0.h(r2)
            if (r2 != 0) goto L_0x012c
            java.lang.String r2 = "Unknown type parameter "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            int r6 = r1.e2
            r2.append(r6)
            java.lang.String r6 = ". Please try recompiling module containing \""
            r2.append(r6)
            java.lang.String r6 = r0.d
            r2.append(r6)
            r6 = 34
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            m0.r.t.a.r.m.j0 r2 = m0.r.t.a.r.m.p.e(r2)
            java.lang.String r6 = "createErrorTypeConstructor(\n                        \"Unknown type parameter ${proto.typeParameter}. Please try recompiling module containing \\\"$containerPresentableName\\\"\"\n                    )"
            m0.n.b.i.d(r2, r6)
            goto L_0x012c
        L_0x008f:
            r6 = 64
            r2 = r2 & r6
            if (r2 != r6) goto L_0x0096
            r2 = r5
            goto L_0x0097
        L_0x0096:
            r2 = r4
        L_0x0097:
            if (r2 == 0) goto L_0x00fb
            m0.r.t.a.r.k.b.i r2 = r0.a
            m0.r.t.a.r.c.i r6 = r2.c
            m0.r.t.a.r.f.c.c r2 = r2.b
            int r7 = r1.f2
            java.lang.String r2 = r2.b(r7)
            java.util.List r7 = r16.c()
            java.util.Iterator r7 = r7.iterator()
        L_0x00ad:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00c9
            java.lang.Object r8 = r7.next()
            r9 = r8
            m0.r.t.a.r.c.m0 r9 = (m0.r.t.a.r.c.m0) r9
            m0.r.t.a.r.g.d r9 = r9.getName()
            java.lang.String r9 = r9.b()
            boolean r9 = m0.n.b.i.a(r9, r2)
            if (r9 == 0) goto L_0x00ad
            goto L_0x00ca
        L_0x00c9:
            r8 = r3
        L_0x00ca:
            m0.r.t.a.r.c.m0 r8 = (m0.r.t.a.r.c.m0) r8
            if (r8 != 0) goto L_0x00d0
            r7 = r3
            goto L_0x00d4
        L_0x00d0:
            m0.r.t.a.r.m.j0 r7 = r8.i()
        L_0x00d4:
            if (r7 != 0) goto L_0x00f4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Deserialized type parameter "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = " in "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r2 = r7.toString()
            m0.r.t.a.r.m.j0 r2 = m0.r.t.a.r.m.p.e(r2)
            goto L_0x00f5
        L_0x00f4:
            r2 = r7
        L_0x00f5:
            java.lang.String r6 = "{\n                val container = c.containingDeclaration\n                val name = c.nameResolver.getString(proto.typeParameterName)\n                val parameter = ownTypeParameters.find { it.name.asString() == name }\n                parameter?.typeConstructor ?: ErrorUtils.createErrorTypeConstructor(\"Deserialized type parameter $name in $container\")\n            }"
            m0.n.b.i.d(r2, r6)
            goto L_0x012c
        L_0x00fb:
            boolean r2 = r17.C()
            if (r2 == 0) goto L_0x0121
            m0.n.a.l<java.lang.Integer, m0.r.t.a.r.c.f> r2 = r0.g
            int r6 = r1.g2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r2.invoke(r6)
            m0.r.t.a.r.c.f r2 = (m0.r.t.a.r.c.f) r2
            if (r2 != 0) goto L_0x0117
            int r2 = r1.g2
            m0.r.t.a.r.c.d r2 = g(r0, r1, r2)
        L_0x0117:
            m0.r.t.a.r.m.j0 r2 = r2.i()
            java.lang.String r6 = "typeAliasDescriptors(proto.typeAliasName) ?: notFoundClass(proto.typeAliasName)).typeConstructor"
            m0.n.b.i.d(r2, r6)
            goto L_0x012c
        L_0x0121:
            java.lang.String r2 = "Unknown type"
            m0.r.t.a.r.m.j0 r2 = m0.r.t.a.r.m.p.e(r2)
            java.lang.String r6 = "createErrorTypeConstructor(\"Unknown type\")"
            m0.n.b.i.d(r2, r6)
        L_0x012c:
            m0.r.t.a.r.c.f r6 = r2.c()
            boolean r6 = m0.r.t.a.r.m.p.j(r6)
            if (r6 == 0) goto L_0x0144
            java.lang.String r1 = r2.toString()
            m0.r.t.a.r.m.a0 r1 = m0.r.t.a.r.m.p.h(r1, r2)
            java.lang.String r2 = "createErrorTypeWithCustomConstructor(constructor.toString(), constructor)"
            m0.n.b.i.d(r1, r2)
            return r1
        L_0x0144:
            m0.r.t.a.r.k.b.w.a r6 = new m0.r.t.a.r.k.b.w.a
            m0.r.t.a.r.k.b.i r7 = r0.a
            m0.r.t.a.r.k.b.g r7 = r7.a
            m0.r.t.a.r.l.l r7 = r7.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1 r8 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            r8.<init>(r0, r1)
            r6.<init>(r7, r8)
            java.util.List r7 = e(r1, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = i0.j.f.p.h.K(r7, r9)
            r8.<init>(r9)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r7 = r7.iterator()
            r9 = r4
        L_0x016a:
            boolean r10 = r7.hasNext()
            java.lang.String r13 = "typeTable"
            java.lang.String r14 = "<this>"
            if (r10 == 0) goto L_0x0228
            java.lang.Object r10 = r7.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x0224
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.Argument) r10
            java.util.List r12 = r2.getParameters()
            java.lang.String r15 = "constructor.parameters"
            m0.n.b.i.d(r12, r15)
            java.lang.Object r9 = m0.j.g.z(r12, r9)
            m0.r.t.a.r.c.m0 r9 = (m0.r.t.a.r.c.m0) r9
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r12 = r10.y
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection r15 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR
            if (r12 != r15) goto L_0x01ae
            if (r9 != 0) goto L_0x01a6
            m0.r.t.a.r.m.e0 r9 = new m0.r.t.a.r.m.e0
            m0.r.t.a.r.k.b.i r10 = r0.a
            m0.r.t.a.r.k.b.g r10 = r10.a
            m0.r.t.a.r.c.u r10 = r10.b
            m0.r.t.a.r.b.f r10 = r10.m()
            r9.<init>(r10)
            goto L_0x021e
        L_0x01a6:
            kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl r10 = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl
            r10.<init>(r9)
            r9 = r10
            goto L_0x021e
        L_0x01ae:
            java.lang.String r9 = "typeArgumentProto.projection"
            m0.n.b.i.d(r12, r9)
            java.lang.String r9 = "projection"
            m0.n.b.i.e(r12, r9)
            int r9 = r12.ordinal()
            if (r9 == 0) goto L_0x01de
            if (r9 == r5) goto L_0x01db
            r15 = 2
            if (r9 == r15) goto L_0x01d8
            r1 = 3
            if (r9 == r1) goto L_0x01cc
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x01cc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Only IN, OUT and INV are supported. Actual argument: "
            java.lang.String r2 = m0.n.b.i.k(r2, r12)
            r1.<init>(r2)
            throw r1
        L_0x01d8:
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            goto L_0x01e0
        L_0x01db:
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L_0x01e0
        L_0x01de:
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L_0x01e0:
            m0.r.t.a.r.k.b.i r12 = r0.a
            m0.r.t.a.r.f.c.e r12 = r12.d
            m0.n.b.i.e(r10, r14)
            m0.n.b.i.e(r12, r13)
            boolean r13 = r10.i()
            if (r13 == 0) goto L_0x01f3
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = r10.Y1
            goto L_0x0206
        L_0x01f3:
            int r13 = r10.x
            r14 = 4
            r13 = r13 & r14
            if (r13 != r14) goto L_0x01fb
            r13 = r5
            goto L_0x01fc
        L_0x01fb:
            r13 = r4
        L_0x01fc:
            if (r13 == 0) goto L_0x0205
            int r10 = r10.Z1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = r12.a(r10)
            goto L_0x0206
        L_0x0205:
            r10 = r3
        L_0x0206:
            if (r10 != 0) goto L_0x0214
            m0.r.t.a.r.m.o0 r9 = new m0.r.t.a.r.m.o0
            java.lang.String r10 = "No type recorded"
            m0.r.t.a.r.m.a0 r10 = m0.r.t.a.r.m.p.d(r10)
            r9.<init>(r10)
            goto L_0x021e
        L_0x0214:
            m0.r.t.a.r.m.o0 r12 = new m0.r.t.a.r.m.o0
            m0.r.t.a.r.m.v r10 = r0.f(r10)
            r12.<init>(r9, r10)
            r9 = r12
        L_0x021e:
            r8.add(r9)
            r9 = r11
            goto L_0x016a
        L_0x0224:
            m0.j.g.r0()
            throw r3
        L_0x0228:
            java.util.List r15 = m0.j.g.v0(r8)
            m0.r.t.a.r.c.f r7 = r2.c()
            if (r18 == 0) goto L_0x0267
            boolean r8 = r7 instanceof m0.r.t.a.r.c.l0
            if (r8 == 0) goto L_0x0267
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            m0.r.t.a.r.c.l0 r7 = (m0.r.t.a.r.c.l0) r7
            m0.r.t.a.r.m.a0 r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.b(r7, r15)
            m0.n.b.i.e(r2, r14)
            boolean r7 = m0.r.t.a.r.m.s0.g(r2)
            if (r7 != 0) goto L_0x024e
            boolean r7 = r1.Z1
            if (r7 == 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r7 = r4
            goto L_0x024f
        L_0x024e:
            r7 = r5
        L_0x024f:
            m0.r.t.a.r.m.a0 r7 = r2.M0(r7)
            m0.r.t.a.r.c.r0.f$a r8 = m0.r.t.a.r.c.r0.f.i
            m0.r.t.a.r.c.r0.f r2 = r2.getAnnotations()
            java.util.List r2 = m0.j.g.X(r6, r2)
            m0.r.t.a.r.c.r0.f r2 = r8.a(r2)
            m0.r.t.a.r.m.a0 r2 = r7.Q0(r2)
            goto L_0x038c
        L_0x0267:
            m0.r.t.a.r.f.c.b$b r7 = m0.r.t.a.r.f.c.b.a
            int r8 = r1.l2
            java.lang.String r9 = "SUSPEND_TYPE.get(proto.flags)"
            boolean r7 = i0.d.a.a.a.E(r7, r8, r9)
            if (r7 == 0) goto L_0x037e
            boolean r10 = r1.Z1
            java.util.List r7 = r2.getParameters()
            int r7 = r7.size()
            int r8 = r15.size()
            int r7 = r7 - r8
            if (r7 == 0) goto L_0x02af
            if (r7 == r5) goto L_0x0288
            goto L_0x02f6
        L_0x0288:
            int r7 = r15.size()
            int r7 = r7 - r5
            if (r7 < 0) goto L_0x02f6
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r8 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            m0.r.t.a.r.b.f r8 = r2.m()
            m0.r.t.a.r.c.d r7 = r8.w(r7)
            m0.r.t.a.r.m.j0 r7 = r7.i()
            java.lang.String r8 = "functionTypeConstructor.builtIns.getSuspendFunction(arity).typeConstructor"
            m0.n.b.i.d(r7, r8)
            r11 = 0
            r12 = 16
            r8 = r15
            r9 = r10
            r10 = r11
            r11 = r12
            m0.r.t.a.r.m.a0 r6 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.g(r6, r7, r8, r9, r10, r11)
            goto L_0x036a
        L_0x02af:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r7 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            r11 = 0
            r12 = 16
            r7 = r6
            r8 = r2
            r9 = r15
            m0.r.t.a.r.m.a0 r6 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.g(r7, r8, r9, r10, r11, r12)
            m0.n.b.i.e(r6, r14)
            m0.r.t.a.r.m.j0 r7 = r6.I0()
            m0.r.t.a.r.c.f r7 = r7.c()
            if (r7 != 0) goto L_0x02ca
            r7 = r3
            goto L_0x02ce
        L_0x02ca:
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r7 = m0.r.t.a.r.b.e.c(r7)
        L_0x02ce:
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind r8 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Function
            if (r7 != r8) goto L_0x02d4
            r7 = r5
            goto L_0x02d5
        L_0x02d4:
            r7 = r4
        L_0x02d5:
            if (r7 != 0) goto L_0x02d8
            goto L_0x02f6
        L_0x02d8:
            m0.r.t.a.r.k.b.i r7 = r0.a
            m0.r.t.a.r.k.b.g r7 = r7.a
            m0.r.t.a.r.k.b.h r7 = r7.c
            boolean r7 = r7.g()
            java.util.List r8 = m0.r.t.a.r.b.e.f(r6)
            java.lang.Object r8 = m0.j.g.I(r8)
            m0.r.t.a.r.m.m0 r8 = (m0.r.t.a.r.m.m0) r8
            if (r8 != 0) goto L_0x02f0
            r8 = r3
            goto L_0x02f4
        L_0x02f0:
            m0.r.t.a.r.m.v r8 = r8.getType()
        L_0x02f4:
            if (r8 != 0) goto L_0x02f9
        L_0x02f6:
            r6 = r3
            goto L_0x036a
        L_0x02f9:
            m0.r.t.a.r.m.j0 r9 = r8.I0()
            m0.r.t.a.r.c.f r9 = r9.c()
            if (r9 != 0) goto L_0x0305
            r9 = r3
            goto L_0x0309
        L_0x0305:
            m0.r.t.a.r.g.b r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.h(r9)
        L_0x0309:
            java.util.List r10 = r8.H0()
            int r10 = r10.size()
            if (r10 != r5) goto L_0x036a
            boolean r10 = m0.r.t.a.r.b.h.a(r9, r5)
            if (r10 != 0) goto L_0x0320
            boolean r10 = m0.r.t.a.r.b.h.a(r9, r4)
            if (r10 != 0) goto L_0x0320
            goto L_0x036a
        L_0x0320:
            java.util.List r8 = r8.H0()
            java.lang.Object r8 = m0.j.g.j0(r8)
            m0.r.t.a.r.m.m0 r8 = (m0.r.t.a.r.m.m0) r8
            m0.r.t.a.r.m.v r8 = r8.getType()
            java.lang.String r10 = "continuationArgumentType.arguments.single().type"
            m0.n.b.i.d(r8, r10)
            m0.r.t.a.r.k.b.i r10 = r0.a
            m0.r.t.a.r.c.i r10 = r10.c
            boolean r11 = r10 instanceof m0.r.t.a.r.c.a
            if (r11 != 0) goto L_0x033c
            r10 = r3
        L_0x033c:
            m0.r.t.a.r.c.a r10 = (m0.r.t.a.r.c.a) r10
            if (r10 != 0) goto L_0x0342
            r10 = r3
            goto L_0x0346
        L_0x0342:
            m0.r.t.a.r.g.b r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.d(r10)
        L_0x0346:
            m0.r.t.a.r.g.b r11 = m0.r.t.a.r.k.b.u.a
            boolean r10 = m0.n.b.i.a(r10, r11)
            if (r10 == 0) goto L_0x0353
            m0.r.t.a.r.m.a0 r6 = r0.b(r6, r8)
            goto L_0x036a
        L_0x0353:
            boolean r10 = r0.e
            if (r10 != 0) goto L_0x0363
            if (r7 == 0) goto L_0x0361
            r7 = r7 ^ r5
            boolean r7 = m0.r.t.a.r.b.h.a(r9, r7)
            if (r7 == 0) goto L_0x0361
            goto L_0x0363
        L_0x0361:
            r7 = r4
            goto L_0x0364
        L_0x0363:
            r7 = r5
        L_0x0364:
            r0.e = r7
            m0.r.t.a.r.m.a0 r6 = r0.b(r6, r8)
        L_0x036a:
            if (r6 != 0) goto L_0x037c
            java.lang.String r6 = "Bad suspend function in metadata with constructor: "
            java.lang.String r2 = m0.n.b.i.k(r6, r2)
            m0.r.t.a.r.m.a0 r2 = m0.r.t.a.r.m.p.g(r2, r15)
            java.lang.String r6 = "createErrorTypeWithArguments(\n            \"Bad suspend function in metadata with constructor: $functionTypeConstructor\",\n            arguments\n        )"
            m0.n.b.i.d(r2, r6)
            goto L_0x038c
        L_0x037c:
            r2 = r6
            goto L_0x038c
        L_0x037e:
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r7 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.a
            boolean r10 = r1.Z1
            r11 = 0
            r12 = 16
            r7 = r6
            r8 = r2
            r9 = r15
            m0.r.t.a.r.m.a0 r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.g(r7, r8, r9, r10, r11, r12)
        L_0x038c:
            m0.r.t.a.r.k.b.i r6 = r0.a
            m0.r.t.a.r.f.c.e r6 = r6.d
            m0.n.b.i.e(r1, r14)
            m0.n.b.i.e(r6, r13)
            boolean r7 = r17.x()
            if (r7 == 0) goto L_0x039f
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = r1.j2
            goto L_0x03b0
        L_0x039f:
            int r7 = r1.y
            r8 = 2048(0x800, float:2.87E-42)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x03a7
            goto L_0x03a8
        L_0x03a7:
            r5 = r4
        L_0x03a8:
            if (r5 == 0) goto L_0x03b0
            int r3 = r1.k2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = r6.a(r3)
        L_0x03b0:
            if (r3 != 0) goto L_0x03b3
            goto L_0x03bb
        L_0x03b3:
            m0.r.t.a.r.m.a0 r3 = r0.d(r3, r4)
            m0.r.t.a.r.m.a0 r2 = m0.r.t.a.r.m.d0.e(r2, r3)
        L_0x03bb:
            boolean r3 = r17.y()
            if (r3 == 0) goto L_0x03d6
            m0.r.t.a.r.k.b.i r3 = r0.a
            m0.r.t.a.r.f.c.c r3 = r3.b
            int r1 = r1.d2
            m0.r.t.a.r.g.a r1 = i0.j.f.p.h.X0(r3, r1)
            m0.r.t.a.r.k.b.i r3 = r0.a
            m0.r.t.a.r.k.b.g r3 = r3.a
            m0.r.t.a.r.c.s0.e r3 = r3.s
            m0.r.t.a.r.m.a0 r1 = r3.a(r1, r2)
            return r1
        L_0x03d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, boolean):m0.r.t.a.r.m.a0");
    }

    public final v f(ProtoBuf$Type protoBuf$Type) {
        ProtoBuf$Type protoBuf$Type2;
        m0.n.b.i.e(protoBuf$Type, "proto");
        boolean z = false;
        if (!((protoBuf$Type.y & 2) == 2)) {
            return d(protoBuf$Type, true);
        }
        String b2 = this.a.b.b(protoBuf$Type.a2);
        a0 d2 = d(protoBuf$Type, true);
        m0.r.t.a.r.f.c.e eVar = this.a.d;
        m0.n.b.i.e(protoBuf$Type, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        if (protoBuf$Type.z()) {
            protoBuf$Type2 = protoBuf$Type.b2;
        } else {
            if ((protoBuf$Type.y & 8) == 8) {
                z = true;
            }
            protoBuf$Type2 = z ? eVar.a(protoBuf$Type.c2) : null;
        }
        m0.n.b.i.c(protoBuf$Type2);
        return this.a.a.j.a(protoBuf$Type, b2, d2, d(protoBuf$Type2, true));
    }

    public final j0 h(int i) {
        m0 m0Var = this.h.get(Integer.valueOf(i));
        j0 i2 = m0Var == null ? null : m0Var.i();
        if (i2 != null) {
            return i2;
        }
        TypeDeserializer typeDeserializer = this.b;
        if (typeDeserializer == null) {
            return null;
        }
        return typeDeserializer.h(i);
    }

    public String toString() {
        String str = this.c;
        TypeDeserializer typeDeserializer = this.b;
        return m0.n.b.i.k(str, typeDeserializer == null ? "" : m0.n.b.i.k(". Child of ", typeDeserializer.c));
    }
}
