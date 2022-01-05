package androidx.paging;

import h0.u.h;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import n0.a.g2.e;

@c(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {109, 130}, m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements q<e<? super h>, Integer, m0.l.c<? super i>, Object> {
    public Object Y1;
    public int Z1;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public int q;
    public final /* synthetic */ PageFetcherSnapshot x;
    public final /* synthetic */ LoadType y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(m0.l.c cVar, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, cVar);
        this.x = pageFetcherSnapshot;
        this.y = loadType;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = (e) obj;
        m0.l.c cVar = (m0.l.c) obj3;
        m0.n.b.i.e(eVar, "$this$create");
        m0.n.b.i.e(cVar, "continuation");
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(cVar, this.x, this.y);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.c = eVar;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.d = obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: n0.a.g2.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.q
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002c
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            i0.j.f.p.h.d4(r11)
            goto L_0x00a7
        L_0x0012:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001a:
            int r1 = r10.Z1
            java.lang.Object r5 = r10.Y1
            n0.a.k2.b r5 = (n0.a.k2.b) r5
            java.lang.Object r6 = r10.d
            h0.u.r$a r6 = (h0.u.r.a) r6
            java.lang.Object r7 = r10.c
            n0.a.g2.e r7 = (n0.a.g2.e) r7
            i0.j.f.p.h.d4(r11)
            goto L_0x0053
        L_0x002c:
            i0.j.f.p.h.d4(r11)
            java.lang.Object r11 = r10.c
            r7 = r11
            n0.a.g2.e r7 = (n0.a.g2.e) r7
            java.lang.Object r11 = r10.d
            java.lang.Number r11 = (java.lang.Number) r11
            int r1 = r11.intValue()
            androidx.paging.PageFetcherSnapshot r11 = r10.x
            h0.u.r$a<Key, Value> r6 = r11.e
            n0.a.k2.b r5 = r6.a
            r10.c = r7
            r10.d = r6
            r10.Y1 = r5
            r10.Z1 = r1
            r10.q = r3
            java.lang.Object r11 = r5.a(r4, r10)
            if (r11 != r0) goto L_0x0053
            return r0
        L_0x0053:
            h0.u.r<Key, Value> r11 = r6.b     // Catch:{ all -> 0x00aa }
            h0.u.k r6 = r11.k     // Catch:{ all -> 0x00aa }
            androidx.paging.LoadType r8 = r10.y     // Catch:{ all -> 0x00aa }
            h0.u.j r6 = r6.b(r8)     // Catch:{ all -> 0x00aa }
            h0.u.j$c r8 = h0.u.j.c.b     // Catch:{ all -> 0x00aa }
            boolean r6 = m0.n.b.i.a(r6, r8)     // Catch:{ all -> 0x00aa }
            r8 = 0
            if (r6 == 0) goto L_0x0071
            h0.u.h[] r11 = new h0.u.h[r8]     // Catch:{ all -> 0x00aa }
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 r1 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1     // Catch:{ all -> 0x00aa }
            r1.<init>(r11)     // Catch:{ all -> 0x00aa }
            r5.b(r4)
            goto L_0x0098
        L_0x0071:
            h0.u.k r6 = r11.k     // Catch:{ all -> 0x00aa }
            androidx.paging.LoadType r9 = r10.y     // Catch:{ all -> 0x00aa }
            h0.u.j r6 = r6.b(r9)     // Catch:{ all -> 0x00aa }
            boolean r6 = r6 instanceof h0.u.j.a     // Catch:{ all -> 0x00aa }
            if (r6 != 0) goto L_0x0084
            androidx.paging.LoadType r6 = r10.y     // Catch:{ all -> 0x00aa }
            h0.u.j$c r9 = h0.u.j.c.c     // Catch:{ all -> 0x00aa }
            r11.j(r6, r9)     // Catch:{ all -> 0x00aa }
        L_0x0084:
            r5.b(r4)
            androidx.paging.PageFetcherSnapshot r11 = r10.x
            n0.a.g2.p<h0.u.h0> r11 = r11.a
            if (r1 != 0) goto L_0x008e
            r3 = r8
        L_0x008e:
            n0.a.g2.d r11 = m0.r.t.a.r.m.a1.a.i1(r11, r3)
            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1 r3 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1
            r3.<init>(r11, r1)
            r1 = r3
        L_0x0098:
            r10.c = r4
            r10.d = r4
            r10.Y1 = r4
            r10.q = r2
            java.lang.Object r11 = r1.collect(r7, r10)
            if (r11 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            m0.i r11 = m0.i.a
            return r11
        L_0x00aa:
            r11 = move-exception
            r5.b(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
