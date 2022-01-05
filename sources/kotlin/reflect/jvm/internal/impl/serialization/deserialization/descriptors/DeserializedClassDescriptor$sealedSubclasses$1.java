package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.c.d;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor$sealedSubclasses$1 extends Lambda implements a<Collection<? extends d>> {
    public final /* synthetic */ DeserializedClassDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$sealedSubclasses$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.c = deserializedClassDescriptor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.LinkedHashSet} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = r7.c
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = r0.b2
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r1 == r2) goto L_0x000c
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.c
            goto L_0x0083
        L_0x000c:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r1 = r0.y
            java.util.List<java.lang.Integer> r1 = r1.m2
            java.lang.String r3 = "fqNames"
            m0.n.b.i.d(r1, r3)
            boolean r3 = r1.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0051
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0026:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r1.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            m0.r.t.a.r.k.b.i r4 = r0.e2
            m0.r.t.a.r.k.b.g r5 = r4.a
            m0.r.t.a.r.f.c.c r4 = r4.b
            java.lang.String r6 = "index"
            m0.n.b.i.d(r3, r6)
            int r3 = r3.intValue()
            m0.r.t.a.r.g.a r3 = i0.j.f.p.h.X0(r4, r3)
            m0.r.t.a.r.c.d r3 = r5.b(r3)
            if (r3 == 0) goto L_0x0026
            r2.add(r3)
            goto L_0x0026
        L_0x004f:
            r0 = r2
            goto L_0x0083
        L_0x0051:
            r1 = 0
            java.lang.String r3 = "sealedClass"
            m0.n.b.i.e(r0, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r0.j()
            if (r3 == r2) goto L_0x0060
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.c
            goto L_0x0083
        L_0x0060:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            m0.r.t.a.r.c.i r3 = r0.b()
            boolean r5 = r3 instanceof m0.r.t.a.r.c.v
            if (r5 == 0) goto L_0x0076
            m0.r.t.a.r.c.v r3 = (m0.r.t.a.r.c.v) r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r3 = r3.o()
            m0.r.t.a.r.j.a.a(r0, r2, r3, r1)
        L_0x0076:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r1 = r0.w0()
            java.lang.String r3 = "sealedClass.unsubstitutedInnerClassesScope"
            m0.n.b.i.d(r1, r3)
            m0.r.t.a.r.j.a.a(r0, r2, r1, r4)
            goto L_0x004f
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1.invoke():java.lang.Object");
    }
}
