package androidx.paging;

import androidx.paging.PageFetcher$injectRemoteEvents$1;
import h0.u.k;
import kotlin.jvm.internal.Ref$ObjectRef;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 implements e<k> {
    public final /* synthetic */ PageFetcher$injectRemoteEvents$1.AnonymousClass2 c;
    public final /* synthetic */ Ref$ObjectRef d;

    public PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1(PageFetcher$injectRemoteEvents$1.AnonymousClass2 r1, Ref$ObjectRef ref$ObjectRef) {
        this.c = r1;
        this.d = ref$ObjectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.lang.Object r9, m0.l.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1 r0 = (androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1 r0 = new androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r9 = r0.y
            h0.u.k r9 = (h0.u.k) r9
            java.lang.Object r0 = r0.x
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 r0 = (androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) r0
            i0.j.f.p.h.d4(r10)
            goto L_0x00ea
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            java.lang.Object r9 = r0.y
            h0.u.k r9 = (h0.u.k) r9
            java.lang.Object r2 = r0.x
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) r2
            i0.j.f.p.h.d4(r10)
            goto L_0x00ba
        L_0x004a:
            java.lang.Object r9 = r0.y
            h0.u.k r9 = (h0.u.k) r9
            java.lang.Object r2 = r0.x
            androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 r2 = (androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1) r2
            i0.j.f.p.h.d4(r10)
            goto L_0x008b
        L_0x0056:
            i0.j.f.p.h.d4(r10)
            h0.u.k r9 = (h0.u.k) r9
            kotlin.jvm.internal.Ref$ObjectRef r10 = r8.d
            T r10 = r10.c
            h0.u.k r10 = (h0.u.k) r10
            h0.u.j r10 = r10.c
            h0.u.j r2 = r9.c
            boolean r10 = m0.n.b.i.a(r10, r2)
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x008a
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r8.c
            h0.u.m r10 = r1
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            h0.u.j r6 = r9.c
            r10.d(r2, r5, r6)
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r8.c
            androidx.paging.PageFetcher$injectRemoteEvents$1$1 r10 = r3
            h0.u.j r6 = r9.c
            r0.x = r8
            r0.y = r9
            r0.d = r5
            java.lang.Object r10 = r10.invoke(r2, r6, r0)
            if (r10 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r2 = r8
        L_0x008b:
            kotlin.jvm.internal.Ref$ObjectRef r10 = r2.d
            T r10 = r10.c
            h0.u.k r10 = (h0.u.k) r10
            h0.u.j r10 = r10.d
            h0.u.j r6 = r9.d
            boolean r10 = m0.n.b.i.a(r10, r6)
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x00ba
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.c
            h0.u.m r10 = r1
            androidx.paging.LoadType r6 = androidx.paging.LoadType.PREPEND
            h0.u.j r7 = r9.d
            r10.d(r6, r5, r7)
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.c
            androidx.paging.PageFetcher$injectRemoteEvents$1$1 r10 = r3
            h0.u.j r7 = r9.d
            r0.x = r2
            r0.y = r9
            r0.d = r4
            java.lang.Object r10 = r10.invoke(r6, r7, r0)
            if (r10 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            kotlin.jvm.internal.Ref$ObjectRef r10 = r2.d
            T r10 = r10.c
            h0.u.k r10 = (h0.u.k) r10
            h0.u.j r10 = r10.e
            h0.u.j r4 = r9.e
            boolean r10 = m0.n.b.i.a(r10, r4)
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x00eb
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.c
            h0.u.m r10 = r1
            androidx.paging.LoadType r4 = androidx.paging.LoadType.APPEND
            h0.u.j r6 = r9.e
            r10.d(r4, r5, r6)
            androidx.paging.PageFetcher$injectRemoteEvents$1$2 r10 = r2.c
            androidx.paging.PageFetcher$injectRemoteEvents$1$1 r10 = r3
            h0.u.j r5 = r9.e
            r0.x = r2
            r0.y = r9
            r0.d = r3
            java.lang.Object r10 = r10.invoke(r4, r5, r0)
            if (r10 != r1) goto L_0x00e9
            return r1
        L_0x00e9:
            r0 = r2
        L_0x00ea:
            r2 = r0
        L_0x00eb:
            kotlin.jvm.internal.Ref$ObjectRef r10 = r2.d
            r10.c = r9
            m0.i r9 = m0.i.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1.emit(java.lang.Object, m0.l.c):java.lang.Object");
    }
}
