package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.m.v0;

/* compiled from: AbstractTypeAliasDescriptor.kt */
public final class AbstractTypeAliasDescriptor$isInner$1 extends Lambda implements l<v0, Boolean> {
    public final /* synthetic */ AbstractTypeAliasDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.c = abstractTypeAliasDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (((r5 instanceof m0.r.t.a.r.c.m0) && !m0.n.b.i.a(((m0.r.t.a.r.c.m0) r5).b(), r0)) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            m0.r.t.a.r.m.v0 r5 = (m0.r.t.a.r.m.v0) r5
            java.lang.String r0 = "type"
            m0.n.b.i.d(r5, r0)
            boolean r0 = i0.j.f.p.h.h2(r5)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002f
            kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor r0 = r4.c
            m0.r.t.a.r.m.j0 r5 = r5.I0()
            m0.r.t.a.r.c.f r5 = r5.c()
            boolean r3 = r5 instanceof m0.r.t.a.r.c.m0
            if (r3 == 0) goto L_0x002b
            m0.r.t.a.r.c.m0 r5 = (m0.r.t.a.r.c.m0) r5
            m0.r.t.a.r.c.i r5 = r5.b()
            boolean r5 = m0.n.b.i.a(r5, r0)
            if (r5 != 0) goto L_0x002b
            r5 = r1
            goto L_0x002c
        L_0x002b:
            r5 = r2
        L_0x002c:
            if (r5 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$isInner$1.invoke(java.lang.Object):java.lang.Object");
    }
}
