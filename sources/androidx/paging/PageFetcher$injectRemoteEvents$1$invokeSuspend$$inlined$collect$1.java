package androidx.paging;

import h0.u.c0;
import h0.u.m;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1 implements e<PageEvent<Value>> {
    public final /* synthetic */ PageFetcher$injectRemoteEvents$1 c;
    public final /* synthetic */ c0 d;
    public final /* synthetic */ m q;

    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1(PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1, c0 c0Var, m mVar) {
        this.c = pageFetcher$injectRemoteEvents$1;
        this.d = c0Var;
        this.q = mVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r13, m0.l.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 == r5) goto L_0x0032
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0032:
            i0.j.f.p.h.d4(r14)
            goto L_0x00cf
        L_0x0037:
            i0.j.f.p.h.d4(r14)
            androidx.paging.PageEvent r13 = (androidx.paging.PageEvent) r13
            boolean r14 = r13 instanceof androidx.paging.PageEvent.Insert
            if (r14 == 0) goto L_0x0096
            h0.u.m r14 = r12.q
            androidx.paging.PageEvent$Insert r13 = (androidx.paging.PageEvent.Insert) r13
            h0.u.b r2 = r13.g
            h0.u.k r2 = r2.d
            androidx.paging.PageFetcher$injectRemoteEvents$1 r3 = r12.c
            h0.u.a0 r3 = r3.x
            n0.a.g2.z r3 = r3.getState()
            java.lang.Object r3 = r3.getValue()
            h0.u.k r3 = (h0.u.k) r3
            java.util.Objects.requireNonNull(r14)
            java.lang.String r4 = "sourceLoadStates"
            m0.n.b.i.e(r2, r4)
            r14.d = r2
            r14.e = r3
            r14.f()
            h0.u.c0 r14 = r12.d
            h0.u.m r2 = r12.q
            h0.u.b r11 = r2.e()
            androidx.paging.LoadType r7 = r13.c
            java.util.List<h0.u.f0<T>> r8 = r13.d
            int r9 = r13.e
            int r10 = r13.f
            java.util.Objects.requireNonNull(r13)
            java.lang.String r13 = "loadType"
            m0.n.b.i.e(r7, r13)
            java.lang.String r13 = "pages"
            m0.n.b.i.e(r8, r13)
            java.lang.String r13 = "combinedLoadStates"
            m0.n.b.i.e(r11, r13)
            androidx.paging.PageEvent$Insert r13 = new androidx.paging.PageEvent$Insert
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r0.d = r5
            java.lang.Object r13 = r14.t(r13, r0)
            if (r13 != r1) goto L_0x00cf
            return r1
        L_0x0096:
            boolean r14 = r13 instanceof androidx.paging.PageEvent.a
            if (r14 == 0) goto L_0x00b2
            h0.u.m r14 = r12.q
            r2 = r13
            androidx.paging.PageEvent$a r2 = (androidx.paging.PageEvent.a) r2
            androidx.paging.LoadType r2 = r2.a
            r3 = 0
            h0.u.j$c r5 = h0.u.j.c.c
            r14.d(r2, r3, r5)
            h0.u.c0 r14 = r12.d
            r0.d = r4
            java.lang.Object r13 = r14.t(r13, r0)
            if (r13 != r1) goto L_0x00cf
            return r1
        L_0x00b2:
            boolean r14 = r13 instanceof androidx.paging.PageEvent.b
            if (r14 == 0) goto L_0x00cf
            h0.u.m r14 = r12.q
            r2 = r13
            androidx.paging.PageEvent$b r2 = (androidx.paging.PageEvent.b) r2
            androidx.paging.LoadType r4 = r2.a
            boolean r5 = r2.b
            h0.u.j r2 = r2.c
            r14.d(r4, r5, r2)
            h0.u.c0 r14 = r12.d
            r0.d = r3
            java.lang.Object r13 = r14.t(r13, r0)
            if (r13 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            m0.i r13 = m0.i.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
