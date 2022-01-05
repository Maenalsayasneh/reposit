package androidx.paging;

import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1 implements e<PageEvent<Value>> {
    public final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2 c;

    public PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2 r1) {
        this.c = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r5, m0.l.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r6)     // Catch:{ ClosedSendChannelException -> 0x0041 }
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r6)
            androidx.paging.PageEvent r5 = (androidx.paging.PageEvent) r5
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 r6 = r4.c     // Catch:{ ClosedSendChannelException -> 0x0041 }
            h0.u.c0 r6 = r2     // Catch:{ ClosedSendChannelException -> 0x0041 }
            r0.d = r3     // Catch:{ ClosedSendChannelException -> 0x0041 }
            java.lang.Object r5 = r6.t(r5, r0)     // Catch:{ ClosedSendChannelException -> 0x0041 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            m0.i r5 = m0.i.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
