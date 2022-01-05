package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$supertypes$2 extends Lambda implements a<List<? extends KTypeImpl>> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.KClassImpl$Data r0 = r6.c
            m0.r.t.a.r.c.d r0 = r0.a()
            m0.r.t.a.r.m.j0 r0 = r0.i()
            java.lang.String r1 = "descriptor.typeConstructor"
            m0.n.b.i.d(r0, r1)
            java.util.Collection r0 = r0.b()
            java.lang.String r1 = "descriptor.typeConstructor.supertypes"
            m0.n.b.i.d(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r0.next()
            m0.r.t.a.r.m.v r2 = (m0.r.t.a.r.m.v) r2
            kotlin.reflect.jvm.internal.KTypeImpl r3 = new kotlin.reflect.jvm.internal.KTypeImpl
            java.lang.String r4 = "kotlinType"
            m0.n.b.i.d(r2, r4)
            kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1 r4 = new kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1
            r4.<init>(r2, r6)
            r3.<init>(r2, r4)
            r1.add(r3)
            goto L_0x0025
        L_0x0044:
            kotlin.reflect.jvm.internal.KClassImpl$Data r0 = r6.c
            m0.r.t.a.r.c.d r0 = r0.a()
            boolean r0 = m0.r.t.a.r.b.f.J(r0)
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r1.isEmpty()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0059
            goto L_0x008c
        L_0x0059:
            java.util.Iterator r0 = r1.iterator()
        L_0x005d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.KTypeImpl r4 = (kotlin.reflect.jvm.internal.KTypeImpl) r4
            m0.r.t.a.r.m.v r4 = r4.y
            m0.r.t.a.r.c.d r4 = m0.r.t.a.r.j.d.c(r4)
            java.lang.String r5 = "DescriptorUtils.getClassDescriptorForType(it.type)"
            m0.n.b.i.d(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r4.f()
            java.lang.String r5 = "DescriptorUtils.getClass…ptorForType(it.type).kind"
            m0.n.b.i.d(r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r4 == r5) goto L_0x0088
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r4 != r5) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r4 = r2
            goto L_0x0089
        L_0x0088:
            r4 = r3
        L_0x0089:
            if (r4 != 0) goto L_0x005d
            goto L_0x008d
        L_0x008c:
            r2 = r3
        L_0x008d:
            if (r2 == 0) goto L_0x00ac
            kotlin.reflect.jvm.internal.KTypeImpl r0 = new kotlin.reflect.jvm.internal.KTypeImpl
            kotlin.reflect.jvm.internal.KClassImpl$Data r2 = r6.c
            m0.r.t.a.r.c.d r2 = r2.a()
            m0.r.t.a.r.b.f r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r2)
            m0.r.t.a.r.m.a0 r2 = r2.f()
            java.lang.String r3 = "descriptor.builtIns.anyType"
            m0.n.b.i.d(r2, r3)
            kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$3 r3 = kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.AnonymousClass3.c
            r0.<init>(r2, r3)
            r1.add(r0)
        L_0x00ac:
            java.util.List r0 = m0.r.t.a.r.m.a1.a.G0(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.invoke():java.lang.Object");
    }
}
