package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import m0.n.a.l;
import m0.r.t.a.q.d;

/* compiled from: KPropertyImpl.kt */
public final class KPropertyImplKt$computeCallerForAccessor$3 extends Lambda implements l<Field, d<? extends Field>> {
    public final /* synthetic */ KPropertyImpl.a c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$2 q;
    public final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$1 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImplKt$computeCallerForAccessor$3(KPropertyImpl.a aVar, boolean z, KPropertyImplKt$computeCallerForAccessor$2 kPropertyImplKt$computeCallerForAccessor$2, KPropertyImplKt$computeCallerForAccessor$1 kPropertyImplKt$computeCallerForAccessor$1) {
        super(1);
        this.c = aVar;
        this.d = z;
        this.q = kPropertyImplKt$computeCallerForAccessor$2;
        this.x = kPropertyImplKt$computeCallerForAccessor$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (m0.r.t.a.r.j.d.m(r1) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (m0.r.t.a.r.f.d.a.h.d(((m0.r.t.a.r.k.b.w.f) r0).t2) != false) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.r.t.a.q.d<java.lang.reflect.Field> invoke(java.lang.reflect.Field r5) {
        /*
            r4 = this;
            java.lang.String r0 = "field"
            m0.n.b.i.e(r5, r0)
            kotlin.reflect.jvm.internal.KPropertyImpl$a r0 = r4.c
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r0.t()
            m0.r.t.a.r.c.c0 r0 = r0.p()
            m0.r.t.a.r.c.i r1 = r0.b()
            java.lang.String r2 = "containingDeclaration"
            m0.n.b.i.d(r1, r2)
            boolean r2 = m0.r.t.a.r.j.d.p(r1)
            if (r2 != 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            m0.r.t.a.r.c.i r1 = r1.b()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            boolean r2 = m0.r.t.a.r.j.d.s(r1, r2)
            r3 = 1
            if (r2 != 0) goto L_0x0032
            boolean r1 = m0.r.t.a.r.j.d.m(r1)
            if (r1 == 0) goto L_0x0042
        L_0x0032:
            boolean r1 = r0 instanceof m0.r.t.a.r.k.b.w.f
            if (r1 == 0) goto L_0x0041
            m0.r.t.a.r.k.b.w.f r0 = (m0.r.t.a.r.k.b.w.f) r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r0.t2
            boolean r0 = m0.r.t.a.r.f.d.a.h.d(r0)
            if (r0 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 != 0) goto L_0x00a7
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x00a7
        L_0x004f:
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$1 r0 = r4.x
            boolean r0 = r0.invoke()
            if (r0 == 0) goto L_0x0091
            boolean r0 = r4.d
            if (r0 == 0) goto L_0x0071
            kotlin.reflect.jvm.internal.KPropertyImpl$a r0 = r4.c
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x006a
            m0.r.t.a.q.d$e$b r0 = new m0.r.t.a.q.d$e$b
            r0.<init>(r5)
            goto L_0x00ea
        L_0x006a:
            m0.r.t.a.q.d$e$d r0 = new m0.r.t.a.q.d$e$d
            r0.<init>(r5)
            goto L_0x00ea
        L_0x0071:
            kotlin.reflect.jvm.internal.KPropertyImpl$a r0 = r4.c
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x0085
            m0.r.t.a.q.d$f$b r0 = new m0.r.t.a.q.d$f$b
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2 r1 = r4.q
            boolean r1 = r1.invoke()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x0085:
            m0.r.t.a.q.d$f$d r0 = new m0.r.t.a.q.d$f$d
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2 r1 = r4.q
            boolean r1 = r1.invoke()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x0091:
            boolean r0 = r4.d
            if (r0 == 0) goto L_0x009b
            m0.r.t.a.q.d$e$e r0 = new m0.r.t.a.q.d$e$e
            r0.<init>(r5)
            goto L_0x00ea
        L_0x009b:
            m0.r.t.a.q.d$f$e r0 = new m0.r.t.a.q.d$f$e
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2 r1 = r4.q
            boolean r1 = r1.invoke()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x00a7:
            boolean r0 = r4.d
            if (r0 == 0) goto L_0x00c5
            kotlin.reflect.jvm.internal.KPropertyImpl$a r0 = r4.c
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x00bf
            m0.r.t.a.q.d$e$a r0 = new m0.r.t.a.q.d$e$a
            kotlin.reflect.jvm.internal.KPropertyImpl$a r1 = r4.c
            java.lang.Object r1 = i0.j.f.p.h.U0(r1)
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x00bf:
            m0.r.t.a.q.d$e$c r0 = new m0.r.t.a.q.d$e$c
            r0.<init>(r5)
            goto L_0x00ea
        L_0x00c5:
            kotlin.reflect.jvm.internal.KPropertyImpl$a r0 = r4.c
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x00df
            m0.r.t.a.q.d$f$a r0 = new m0.r.t.a.q.d$f$a
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2 r1 = r4.q
            boolean r1 = r1.invoke()
            kotlin.reflect.jvm.internal.KPropertyImpl$a r2 = r4.c
            java.lang.Object r2 = i0.j.f.p.h.U0(r2)
            r0.<init>(r5, r1, r2)
            goto L_0x00ea
        L_0x00df:
            m0.r.t.a.q.d$f$c r0 = new m0.r.t.a.q.d$f$c
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2 r1 = r4.q
            boolean r1 = r1.invoke()
            r0.<init>(r5, r1)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$3.invoke(java.lang.reflect.Field):m0.r.t.a.q.d");
    }
}
