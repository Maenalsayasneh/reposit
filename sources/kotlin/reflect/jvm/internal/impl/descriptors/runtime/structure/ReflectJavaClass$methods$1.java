package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.c.v0.b.h;

/* compiled from: ReflectJavaClass.kt */
public final class ReflectJavaClass$methods$1 extends Lambda implements l<Method, Boolean> {
    public final /* synthetic */ h c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectJavaClass$methods$1(h hVar) {
        super(1);
        this.c = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r5 == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r0 = r5.isSynthetic()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x0052
        L_0x000b:
            m0.r.t.a.r.c.v0.b.h r0 = r4.c
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0053
            m0.r.t.a.r.c.v0.b.h r0 = r4.c
            java.lang.String r3 = "method"
            m0.n.b.i.d(r5, r3)
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = r5.getName()
            java.lang.String r3 = "values"
            boolean r3 = m0.n.b.i.a(r0, r3)
            if (r3 == 0) goto L_0x0037
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.String r0 = "method.parameterTypes"
            m0.n.b.i.d(r5, r0)
            int r5 = r5.length
            if (r5 != 0) goto L_0x004e
            r5 = r1
            goto L_0x004f
        L_0x0037:
            java.lang.String r3 = "valueOf"
            boolean r0 = m0.n.b.i.a(r0, r3)
            if (r0 == 0) goto L_0x004e
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            boolean r5 = java.util.Arrays.equals(r5, r0)
            goto L_0x004f
        L_0x004e:
            r5 = r2
        L_0x004f:
            if (r5 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$1.invoke(java.lang.Object):java.lang.Object");
    }
}
