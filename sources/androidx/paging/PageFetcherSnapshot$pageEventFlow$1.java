package androidx.paging;

import h0.u.c0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {595, 160, 607}, m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements p<c0<PageEvent<Value>>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PageFetcherSnapshot Y1;
    public /* synthetic */ Object c;
    public Object d;
    public Object q;
    public Object x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot pageFetcherSnapshot, m0.l.c cVar) {
        super(2, cVar);
        this.Y1 = pageFetcherSnapshot;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.Y1, cVar);
        pageFetcherSnapshot$pageEventFlow$1.c = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.Y1, cVar);
        pageFetcherSnapshot$pageEventFlow$1.c = obj;
        return pageFetcherSnapshot$pageEventFlow$1.invokeSuspend(i.a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r5) goto L_0x0035
            if (r2 == r4) goto L_0x002c
            if (r2 != r3) goto L_0x0024
            java.lang.Object r0 = r1.q
            n0.a.k2.b r0 = (n0.a.k2.b) r0
            java.lang.Object r2 = r1.d
            h0.u.r$a r2 = (h0.u.r.a) r2
            java.lang.Object r3 = r1.c
            h0.u.c0 r3 = (h0.u.c0) r3
            i0.j.f.p.h.d4(r19)
            r5 = r0
            goto L_0x00f3
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x002c:
            java.lang.Object r2 = r1.c
            h0.u.c0 r2 = (h0.u.c0) r2
            i0.j.f.p.h.d4(r19)
            goto L_0x00dc
        L_0x0035:
            java.lang.Object r2 = r1.x
            n0.a.k2.b r2 = (n0.a.k2.b) r2
            java.lang.Object r5 = r1.q
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r7 = r1.d
            h0.u.b0 r7 = (h0.u.b0) r7
            java.lang.Object r8 = r1.c
            h0.u.c0 r8 = (h0.u.c0) r8
            i0.j.f.p.h.d4(r19)
            goto L_0x00b3
        L_0x004a:
            i0.j.f.p.h.d4(r19)
            java.lang.Object r2 = r1.c
            h0.u.c0 r2 = (h0.u.c0) r2
            androidx.paging.PageFetcherSnapshot r7 = r1.Y1
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.c
            r13 = 0
            boolean r7 = r7.compareAndSet(r13, r5)
            if (r7 == 0) goto L_0x0111
            r14 = 0
            r15 = 0
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 r10 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2
            r10.<init>(r1, r2, r6)
            r16 = 3
            r17 = 0
            r8 = 0
            r9 = 0
            r11 = 3
            r12 = 0
            r7 = r2
            m0.r.t.a.r.m.a1.a.E2(r7, r8, r9, r10, r11, r12)
            r7 = 6
            n0.a.f2.d r13 = m0.r.t.a.r.m.a1.a.d(r13, r6, r6, r7)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 r10 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3
            r10.<init>(r1, r13, r6)
            r7 = r2
            m0.r.t.a.r.m.a1.a.E2(r7, r8, r9, r10, r11, r12)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 r10 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4
            r10.<init>(r1, r13, r6)
            r8 = r14
            r9 = r15
            r11 = r16
            r12 = r17
            m0.r.t.a.r.m.a1.a.E2(r7, r8, r9, r10, r11, r12)
            androidx.paging.PageFetcherSnapshot r7 = r1.Y1
            boolean r8 = r7.l
            if (r8 == 0) goto L_0x00c9
            h0.u.b0<Key, Value> r8 = r7.m
            if (r8 == 0) goto L_0x00c9
            h0.u.y<Key, Value> r9 = r7.n
            if (r9 == 0) goto L_0x009a
            goto L_0x00be
        L_0x009a:
            h0.u.r$a<Key, Value> r7 = r7.e
            n0.a.k2.b r9 = r7.a
            r1.c = r2
            r1.d = r8
            r1.q = r7
            r1.x = r9
            r1.y = r5
            java.lang.Object r5 = r9.a(r6, r1)
            if (r5 != r0) goto L_0x00af
            return r0
        L_0x00af:
            r5 = r7
            r7 = r8
            r8 = r2
            r2 = r9
        L_0x00b3:
            h0.u.r<Key, Value> r5 = r5.b     // Catch:{ all -> 0x00c4 }
            h0.u.y r9 = r5.a(r6)     // Catch:{ all -> 0x00c4 }
            r2.b(r6)
            r2 = r8
            r8 = r7
        L_0x00be:
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH
            r8.a(r5, r9)
            goto L_0x00c9
        L_0x00c4:
            r0 = move-exception
            r2.b(r6)
            throw r0
        L_0x00c9:
            androidx.paging.PageFetcherSnapshot r5 = r1.Y1
            r1.c = r2
            r1.d = r6
            r1.q = r6
            r1.x = r6
            r1.y = r4
            java.lang.Object r4 = r5.d(r1)
            if (r4 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            androidx.paging.PageFetcherSnapshot r4 = r1.Y1
            h0.u.r$a<Key, Value> r4 = r4.e
            n0.a.k2.b r5 = r4.a
            r1.c = r2
            r1.d = r4
            r1.q = r5
            r1.y = r3
            java.lang.Object r3 = r5.a(r6, r1)
            if (r3 != r0) goto L_0x00f1
            return r0
        L_0x00f1:
            r3 = r2
            r2 = r4
        L_0x00f3:
            h0.u.r<Key, Value> r0 = r2.b     // Catch:{ all -> 0x010c }
            h0.u.k r0 = r0.k     // Catch:{ all -> 0x010c }
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x010c }
            h0.u.j r0 = r0.b(r2)     // Catch:{ all -> 0x010c }
            r5.b(r6)
            boolean r0 = r0 instanceof h0.u.j.a
            if (r0 != 0) goto L_0x0109
            androidx.paging.PageFetcherSnapshot r0 = r1.Y1
            androidx.paging.PageFetcherSnapshot.a(r0, r3)
        L_0x0109:
            m0.i r0 = m0.i.a
            return r0
        L_0x010c:
            r0 = move-exception
            r5.b(r6)
            throw r0
        L_0x0111:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
