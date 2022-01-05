package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.e.a.t.h;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: JavaAnnotationMapper.kt */
public class JavaAnnotationDescriptor implements c, h {
    public static final /* synthetic */ k<Object>[] a = {m.c(new PropertyReference1Impl(m.a(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    public final b b;
    public final h0 c;
    public final m0.r.t.a.r.l.h d;
    public final m0.r.t.a.r.e.a.w.b e;
    public final boolean f;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        r3 = r4.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JavaAnnotationDescriptor(m0.r.t.a.r.e.a.u.c r3, m0.r.t.a.r.e.a.w.a r4, m0.r.t.a.r.g.b r5) {
        /*
            r2 = this;
            java.lang.String r0 = "c"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "fqName"
            m0.n.b.i.e(r5, r0)
            r2.<init>()
            r2.b = r5
            r5 = 0
            if (r4 != 0) goto L_0x0014
            r0 = r5
            goto L_0x001c
        L_0x0014:
            m0.r.t.a.r.e.a.u.a r0 = r3.a
            m0.r.t.a.r.e.a.v.b r0 = r0.j
            m0.r.t.a.r.e.a.v.a r0 = r0.a(r4)
        L_0x001c:
            if (r0 != 0) goto L_0x0025
            m0.r.t.a.r.c.h0 r0 = m0.r.t.a.r.c.h0.a
            java.lang.String r1 = "NO_SOURCE"
            m0.n.b.i.d(r0, r1)
        L_0x0025:
            r2.c = r0
            m0.r.t.a.r.e.a.u.a r0 = r3.a
            m0.r.t.a.r.l.l r0 = r0.a
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2 r1 = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            r1.<init>(r3, r2)
            m0.r.t.a.r.l.h r3 = r0.d(r1)
            r2.d = r3
            if (r4 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            java.util.Collection r3 = r4.a()
            if (r3 != 0) goto L_0x0041
        L_0x003f:
            r3 = r5
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = m0.j.g.v(r3)
            m0.r.t.a.r.e.a.w.b r3 = (m0.r.t.a.r.e.a.w.b) r3
        L_0x0047:
            r2.e = r3
            if (r4 != 0) goto L_0x004c
            goto L_0x0054
        L_0x004c:
            boolean r3 = r4.i()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
        L_0x0054:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = m0.n.b.i.a(r5, r3)
            r2.f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor.<init>(m0.r.t.a.r.e.a.u.c, m0.r.t.a.r.e.a.w.a, m0.r.t.a.r.g.b):void");
    }

    public Map<d, g<?>> a() {
        return m0.j.g.o();
    }

    public b d() {
        return this.b;
    }

    public v getType() {
        return (a0) i0.j.f.p.h.K1(this.d, a[0]);
    }

    public boolean i() {
        return this.f;
    }

    public h0 r() {
        return this.c;
    }
}
