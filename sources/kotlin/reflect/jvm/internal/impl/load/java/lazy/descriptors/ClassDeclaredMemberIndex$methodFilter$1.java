package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.e.a.w.q;

/* compiled from: DeclaredMemberIndex.kt */
public final class ClassDeclaredMemberIndex$methodFilter$1 extends Lambda implements l<q, Boolean> {
    public final /* synthetic */ ClassDeclaredMemberIndex c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassDeclaredMemberIndex$methodFilter$1(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        super(1);
        this.c = classDeclaredMemberIndex;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r0.equals("toString") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6 = r6.h().isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r6 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            m0.r.t.a.r.e.a.w.q r6 = (m0.r.t.a.r.e.a.w.q) r6
            java.lang.String r0 = "m"
            m0.n.b.i.e(r6, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex r0 = r5.c
            m0.n.a.l<m0.r.t.a.r.e.a.w.p, java.lang.Boolean> r0 = r0.b
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r6, r0)
            m0.r.t.a.r.e.a.w.g r0 = r6.O()
            boolean r0 = r0.G()
            if (r0 == 0) goto L_0x00a7
            m0.r.t.a.r.g.d r0 = r6.getName()
            java.lang.String r0 = r0.b()
            int r3 = r0.hashCode()
            r4 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r3 == r4) goto L_0x0091
            r4 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r3 == r4) goto L_0x004d
            r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r3 == r4) goto L_0x0044
            goto L_0x0099
        L_0x0044:
            java.lang.String r3 = "hashCode"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x009b
            goto L_0x0099
        L_0x004d:
            java.lang.String r3 = "equals"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0056
            goto L_0x0099
        L_0x0056:
            java.util.List r6 = r6.h()
            java.lang.Object r6 = m0.j.g.l0(r6)
            m0.r.t.a.r.e.a.w.z r6 = (m0.r.t.a.r.e.a.w.z) r6
            r0 = 0
            if (r6 != 0) goto L_0x0065
            r6 = r0
            goto L_0x0069
        L_0x0065:
            m0.r.t.a.r.e.a.w.w r6 = r6.getType()
        L_0x0069:
            boolean r3 = r6 instanceof m0.r.t.a.r.e.a.w.j
            if (r3 == 0) goto L_0x0070
            r0 = r6
            m0.r.t.a.r.e.a.w.j r0 = (m0.r.t.a.r.e.a.w.j) r0
        L_0x0070:
            if (r0 != 0) goto L_0x0073
            goto L_0x0099
        L_0x0073:
            m0.r.t.a.r.e.a.w.i r6 = r0.c()
            boolean r0 = r6 instanceof m0.r.t.a.r.e.a.w.g
            if (r0 == 0) goto L_0x0099
            m0.r.t.a.r.e.a.w.g r6 = (m0.r.t.a.r.e.a.w.g) r6
            m0.r.t.a.r.g.b r6 = r6.d()
            if (r6 == 0) goto L_0x0099
            java.lang.String r6 = r6.b()
            java.lang.String r0 = "java.lang.Object"
            boolean r6 = m0.n.b.i.a(r6, r0)
            if (r6 == 0) goto L_0x0099
            r6 = r1
            goto L_0x00a3
        L_0x0091:
            java.lang.String r3 = "toString"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x009b
        L_0x0099:
            r6 = r2
            goto L_0x00a3
        L_0x009b:
            java.util.List r6 = r6.h()
            boolean r6 = r6.isEmpty()
        L_0x00a3:
            if (r6 == 0) goto L_0x00a7
            r6 = r1
            goto L_0x00a8
        L_0x00a7:
            r6 = r2
        L_0x00a8:
            if (r6 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r1 = r2
        L_0x00ac:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1.invoke(java.lang.Object):java.lang.Object");
    }
}
