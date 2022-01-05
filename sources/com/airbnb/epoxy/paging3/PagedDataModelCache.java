package com.airbnb.epoxy.paging3;

import android.os.Handler;
import android.os.Looper;
import androidx.paging.AsyncPagingDataDiffer;
import h0.v.a.g;
import i0.b.a.t;
import java.util.ArrayList;
import kotlinx.coroutines.android.HandlerContext;
import m0.i;
import m0.n.a.p;
import n0.a.e2.a;
import n0.a.e2.b;

/* compiled from: PagedDataModelCache.kt */
public final class PagedDataModelCache<T> {
    public final ArrayList<t<?>> a = new ArrayList<>();
    public Integer b;
    public boolean c;
    public final PagedDataModelCache$updateCallback$1 d;
    public final a e;
    public final AsyncPagingDataDiffer<T> f;
    public final p<Integer, T, t<?>> g;
    public final m0.n.a.a<i> h;
    public final Handler i;

    public PagedDataModelCache(p<? super Integer, ? super T, ? extends t<?>> pVar, m0.n.a.a<i> aVar, g.e<T> eVar, Handler handler) {
        m0.n.b.i.e(pVar, "modelBuilder");
        m0.n.b.i.e(aVar, "rebuildCallback");
        m0.n.b.i.e(eVar, "itemDiffCallback");
        m0.n.b.i.e(handler, "modelBuildingHandler");
        this.g = pVar;
        this.h = aVar;
        this.i = handler;
        PagedDataModelCache$updateCallback$1 pagedDataModelCache$updateCallback$1 = new PagedDataModelCache$updateCallback$1(this);
        this.d = pagedDataModelCache$updateCallback$1;
        int i2 = b.a;
        HandlerContext handlerContext = new HandlerContext(handler, (String) null, false);
        this.e = handlerContext;
        this.f = new AsyncPagingDataDiffer<>(eVar, pagedDataModelCache$updateCallback$1, handlerContext, handlerContext);
    }

    public static final void a(PagedDataModelCache pagedDataModelCache) {
        if (!(pagedDataModelCache.c || m0.n.b.i.a(Looper.myLooper(), pagedDataModelCache.i.getLooper()))) {
            throw new IllegalArgumentException("The notify executor for your PagedList must use the same thread as the model building handler set in PagedListEpoxyController.modelBuildingHandler".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object b(h0.u.w<T> r7, m0.l.c<? super m0.i> r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r8 instanceof com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1 r0 = (com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1) r0     // Catch:{ all -> 0x0068 }
            int r1 = r0.d     // Catch:{ all -> 0x0068 }
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.d = r1     // Catch:{ all -> 0x0068 }
            goto L_0x0019
        L_0x0014:
            com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1 r0 = new com.airbnb.epoxy.paging3.PagedDataModelCache$submitData$1     // Catch:{ all -> 0x0068 }
            r0.<init>(r6, r8)     // Catch:{ all -> 0x0068 }
        L_0x0019:
            java.lang.Object r8 = r0.c     // Catch:{ all -> 0x0068 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0068 }
            int r2 = r0.d     // Catch:{ all -> 0x0068 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r7 = r0.x     // Catch:{ all -> 0x0068 }
            com.airbnb.epoxy.paging3.PagedDataModelCache r7 = (com.airbnb.epoxy.paging3.PagedDataModelCache) r7     // Catch:{ all -> 0x0068 }
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0068 }
            goto L_0x0062
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)     // Catch:{ all -> 0x0068 }
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x0035:
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0068 }
            r6.c = r4     // Catch:{ all -> 0x0068 }
            androidx.paging.AsyncPagingDataDiffer<T> r8 = r6.f     // Catch:{ all -> 0x0068 }
            r0.x = r6     // Catch:{ all -> 0x0068 }
            r0.d = r4     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicInteger r2 = r8.d     // Catch:{ all -> 0x0068 }
            r2.incrementAndGet()     // Catch:{ all -> 0x0068 }
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r8 = r8.c     // Catch:{ all -> 0x0068 }
            androidx.paging.SingleRunner r2 = r8.e     // Catch:{ all -> 0x0068 }
            androidx.paging.PagingDataDiffer$collectFrom$2 r4 = new androidx.paging.PagingDataDiffer$collectFrom$2     // Catch:{ all -> 0x0068 }
            r5 = 0
            r4.<init>(r8, r7, r5)     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = r2.a(r3, r4, r0)     // Catch:{ all -> 0x0068 }
            if (r7 != r1) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            m0.i r7 = m0.i.a     // Catch:{ all -> 0x0068 }
        L_0x0058:
            if (r7 != r1) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            m0.i r7 = m0.i.a     // Catch:{ all -> 0x0068 }
        L_0x005d:
            if (r7 != r1) goto L_0x0061
            monitor-exit(r6)
            return r1
        L_0x0061:
            r7 = r6
        L_0x0062:
            r7.c = r3     // Catch:{ all -> 0x0068 }
            m0.i r7 = m0.i.a     // Catch:{ all -> 0x0068 }
            monitor-exit(r6)
            return r7
        L_0x0068:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.paging3.PagedDataModelCache.b(h0.u.w, m0.l.c):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    public final void c(int i2) {
        if (this.f.c.a.e() > 0) {
            AsyncPagingDataDiffer<T> asyncPagingDataDiffer = this.f;
            int b2 = m0.q.i.b(i2, 0, asyncPagingDataDiffer.c.a.e() - 1);
            try {
                asyncPagingDataDiffer.b = true;
                asyncPagingDataDiffer.c.a(b2);
                asyncPagingDataDiffer.b = false;
            } catch (Throwable th) {
                asyncPagingDataDiffer.b = false;
                throw th;
            }
        }
    }
}
