package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$_javaField$1 extends Lambda implements a<Field> {
    public final /* synthetic */ KPropertyImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$_javaField$1(KPropertyImpl kPropertyImpl) {
        super(0);
        this.c = kPropertyImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r5 != false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3 A[SYNTHETIC, Splitter:B:38:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            m0.r.t.a.n r0 = m0.r.t.a.n.b
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r8.c
            m0.r.t.a.r.c.c0 r0 = r0.p()
            m0.r.t.a.c r0 = m0.r.t.a.n.c(r0)
            boolean r1 = r0 instanceof m0.r.t.a.c.C0244c
            r2 = 0
            if (r1 == 0) goto L_0x00c2
            m0.r.t.a.c$c r0 = (m0.r.t.a.c.C0244c) r0
            m0.r.t.a.r.c.c0 r1 = r0.b
            m0.r.t.a.r.f.d.a.h r3 = m0.r.t.a.r.f.d.a.h.a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = r0.c
            m0.r.t.a.r.f.c.c r5 = r0.e
            m0.r.t.a.r.f.c.e r6 = r0.f
            r7 = 1
            m0.r.t.a.r.f.d.a.e$a r3 = r3.b(r4, r5, r6, r7)
            if (r3 == 0) goto L_0x00d4
            r4 = 0
            if (r1 == 0) goto L_0x00be
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = r1.f()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r5 != r6) goto L_0x0030
            goto L_0x0081
        L_0x0030:
            m0.r.t.a.r.c.i r5 = r1.b()
            if (r5 == 0) goto L_0x00ba
            boolean r6 = m0.r.t.a.r.j.d.p(r5)
            if (r6 == 0) goto L_0x0052
            m0.r.t.a.r.c.i r6 = r5.b()
            boolean r6 = m0.r.t.a.r.j.d.o(r6)
            if (r6 == 0) goto L_0x0052
            m0.r.t.a.r.c.d r5 = (m0.r.t.a.r.c.d) r5
            m0.r.t.a.r.b.b r6 = m0.r.t.a.r.b.b.a
            boolean r5 = i0.j.f.p.h.o2(r6, r5)
            if (r5 != 0) goto L_0x0052
            r5 = r7
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            if (r5 == 0) goto L_0x0056
            goto L_0x0082
        L_0x0056:
            m0.r.t.a.r.c.i r5 = r1.b()
            boolean r5 = m0.r.t.a.r.j.d.p(r5)
            if (r5 == 0) goto L_0x0081
            m0.r.t.a.r.c.q r5 = r1.p0()
            if (r5 == 0) goto L_0x0074
            m0.r.t.a.r.c.r0.f r5 = r5.getAnnotations()
            m0.r.t.a.r.g.b r6 = m0.r.t.a.r.e.a.p.b
            boolean r5 = r5.n(r6)
            if (r5 == 0) goto L_0x0074
            r5 = r7
            goto L_0x007e
        L_0x0074:
            m0.r.t.a.r.c.r0.f r5 = r1.getAnnotations()
            m0.r.t.a.r.g.b r6 = m0.r.t.a.r.e.a.p.b
            boolean r5 = r5.n(r6)
        L_0x007e:
            if (r5 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r7 = r4
        L_0x0082:
            if (r7 != 0) goto L_0x00a5
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r0.c
            boolean r0 = m0.r.t.a.r.f.d.a.h.d(r0)
            if (r0 == 0) goto L_0x008d
            goto L_0x00a5
        L_0x008d:
            m0.r.t.a.r.c.i r0 = r1.b()
            boolean r1 = r0 instanceof m0.r.t.a.r.c.d
            if (r1 == 0) goto L_0x009c
            m0.r.t.a.r.c.d r0 = (m0.r.t.a.r.c.d) r0
            java.lang.Class r0 = m0.r.t.a.o.h(r0)
            goto L_0x00b1
        L_0x009c:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r8.c
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.a2
            java.lang.Class r0 = r0.h()
            goto L_0x00b1
        L_0x00a5:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r8.c
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.a2
            java.lang.Class r0 = r0.h()
            java.lang.Class r0 = r0.getEnclosingClass()
        L_0x00b1:
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = r3.a     // Catch:{ NoSuchFieldException -> 0x00d4 }
            java.lang.reflect.Field r2 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x00d4 }
            goto L_0x00d4
        L_0x00ba:
            i0.j.f.p.h.b(r7)
            throw r2
        L_0x00be:
            i0.j.f.p.h.b(r4)
            throw r2
        L_0x00c2:
            boolean r1 = r0 instanceof m0.r.t.a.c.a
            if (r1 == 0) goto L_0x00cb
            m0.r.t.a.c$a r0 = (m0.r.t.a.c.a) r0
            java.lang.reflect.Field r2 = r0.a
            goto L_0x00d4
        L_0x00cb:
            boolean r1 = r0 instanceof m0.r.t.a.c.b
            if (r1 == 0) goto L_0x00d0
            goto L_0x00d4
        L_0x00d0:
            boolean r0 = r0 instanceof m0.r.t.a.c.d
            if (r0 == 0) goto L_0x00d5
        L_0x00d4:
            return r2
        L_0x00d5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1.invoke():java.lang.Object");
    }
}
