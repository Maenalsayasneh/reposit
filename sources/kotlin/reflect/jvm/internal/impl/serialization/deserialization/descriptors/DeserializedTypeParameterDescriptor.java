package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.c;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.k.b.i;
import m0.r.t.a.r.k.b.w.a;
import m0.r.t.a.r.m.v;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class DeserializedTypeParameterDescriptor extends c {
    public final i d2;
    public final ProtoBuf$TypeParameter e2;
    public final a f2;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializedTypeParameterDescriptor(m0.r.t.a.r.k.b.i r11, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            m0.n.b.i.e(r11, r0)
            java.lang.String r0 = "proto"
            m0.n.b.i.e(r12, r0)
            m0.r.t.a.r.k.b.g r0 = r11.a
            m0.r.t.a.r.l.l r2 = r0.a
            m0.r.t.a.r.c.i r3 = r11.c
            m0.r.t.a.r.f.c.c r0 = r11.b
            int r1 = r12.Z1
            m0.r.t.a.r.g.d r4 = i0.j.f.p.h.v1(r0, r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance r0 = r12.b2
            java.lang.String r1 = "proto.variance"
            m0.n.b.i.d(r0, r1)
            java.lang.String r1 = "variance"
            m0.n.b.i.e(r0, r1)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x003c
            r1 = 1
            if (r0 == r1) goto L_0x0039
            r1 = 2
            if (r0 != r1) goto L_0x0033
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            goto L_0x003e
        L_0x0033:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x0039:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L_0x003e
        L_0x003c:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L_0x003e:
            r5 = r0
            boolean r6 = r12.a2
            m0.r.t.a.r.c.h0 r8 = m0.r.t.a.r.c.h0.a
            m0.r.t.a.r.c.k0$a r9 = m0.r.t.a.r.c.k0.a.a
            r1 = r10
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.d2 = r11
            r10.e2 = r12
            m0.r.t.a.r.k.b.w.a r12 = new m0.r.t.a.r.k.b.w.a
            m0.r.t.a.r.k.b.g r11 = r11.a
            m0.r.t.a.r.l.l r11 = r11.a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1 r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            r13.<init>(r10)
            r12.<init>(r11, r13)
            r10.f2 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>(m0.r.t.a.r.k.b.i, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, int):void");
    }

    public void H0(v vVar) {
        m0.n.b.i.e(vVar, "type");
        throw new IllegalStateException(m0.n.b.i.k("There should be no cycles for deserialized type parameters, but found for: ", this));
    }

    public List<v> I0() {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = this.e2;
        e eVar = this.d2.d;
        m0.n.b.i.e(protoBuf$TypeParameter, "<this>");
        m0.n.b.i.e(eVar, "typeTable");
        List<ProtoBuf$Type> list = protoBuf$TypeParameter.c2;
        boolean z = !list.isEmpty();
        ArrayList arrayList = list;
        if (!z) {
            arrayList = null;
        }
        ArrayList<ProtoBuf$Type> arrayList2 = arrayList;
        if (arrayList == null) {
            List<Integer> list2 = protoBuf$TypeParameter.d2;
            m0.n.b.i.d(list2, "upperBoundIdList");
            ArrayList arrayList3 = new ArrayList(h.K(list2, 10));
            for (Integer num : list2) {
                m0.n.b.i.d(num, "it");
                arrayList3.add(eVar.a(num.intValue()));
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2.isEmpty()) {
            return h.L2(DescriptorUtilsKt.f(this).m());
        }
        TypeDeserializer typeDeserializer = this.d2.h;
        ArrayList arrayList4 = new ArrayList(h.K(arrayList2, 10));
        for (ProtoBuf$Type f : arrayList2) {
            arrayList4.add(typeDeserializer.f(f));
        }
        return arrayList4;
    }

    public f getAnnotations() {
        return this.f2;
    }
}
