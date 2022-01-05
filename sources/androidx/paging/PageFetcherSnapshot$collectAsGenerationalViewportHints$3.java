package androidx.paging;

import h0.u.h;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.l.f.a.c;
import m0.n.a.q;
import m0.n.b.i;

@c(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements q<h, h, m0.l.c<? super h>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ LoadType q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, m0.l.c cVar) {
        super(3, cVar);
        this.q = loadType;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        h hVar2 = (h) obj2;
        m0.l.c cVar = (m0.l.c) obj3;
        i.e(hVar, "previous");
        i.e(hVar2, "next");
        i.e(cVar, "continuation");
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.q, cVar);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.c = hVar;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.d = hVar2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(m0.i.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r2.a < r3.a) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r2.b < r3.b) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if ((r2 instanceof h0.u.h0.a) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            i0.j.f.p.h.d4(r9)
            java.lang.Object r9 = r8.c
            h0.u.h r9 = (h0.u.h) r9
            java.lang.Object r0 = r8.d
            h0.u.h r0 = (h0.u.h) r0
            androidx.paging.LoadType r1 = r8.q
            java.lang.String r2 = "$this$shouldPrioritizeOver"
            m0.n.b.i.e(r0, r2)
            java.lang.String r2 = "previous"
            m0.n.b.i.e(r9, r2)
            java.lang.String r2 = "loadType"
            m0.n.b.i.e(r1, r2)
            int r2 = r0.a
            int r3 = r9.a
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0027
            goto L_0x0063
        L_0x0027:
            h0.u.h0 r2 = r9.b
            boolean r3 = r2 instanceof h0.u.h0.b
            if (r3 == 0) goto L_0x0034
            h0.u.h0 r3 = r0.b
            boolean r3 = r3 instanceof h0.u.h0.a
            if (r3 == 0) goto L_0x0034
            goto L_0x0063
        L_0x0034:
            h0.u.h0 r3 = r0.b
            boolean r6 = r3 instanceof h0.u.h0.b
            if (r6 == 0) goto L_0x003f
            boolean r6 = r2 instanceof h0.u.h0.a
            if (r6 == 0) goto L_0x003f
            goto L_0x0064
        L_0x003f:
            int r6 = r3.c
            int r7 = r2.c
            if (r6 == r7) goto L_0x0046
            goto L_0x0063
        L_0x0046:
            int r6 = r3.d
            int r7 = r2.d
            if (r6 == r7) goto L_0x004d
            goto L_0x0063
        L_0x004d:
            androidx.paging.LoadType r6 = androidx.paging.LoadType.PREPEND
            if (r1 != r6) goto L_0x0058
            int r6 = r2.a
            int r7 = r3.a
            if (r6 >= r7) goto L_0x0058
            goto L_0x0064
        L_0x0058:
            androidx.paging.LoadType r6 = androidx.paging.LoadType.APPEND
            if (r1 != r6) goto L_0x0063
            int r1 = r2.b
            int r2 = r3.b
            if (r1 >= r2) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r4 = r5
        L_0x0064:
            if (r4 == 0) goto L_0x0067
            r9 = r0
        L_0x0067:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
