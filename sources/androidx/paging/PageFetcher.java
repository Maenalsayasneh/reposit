package androidx.paging;

import h0.u.g0;
import h0.u.h0;
import h0.u.v;
import h0.u.w;
import h0.u.x;
import h0.u.y;
import java.util.Objects;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.f;
import n0.a.g2.d;

/* compiled from: PageFetcher.kt */
public final class PageFetcher<Key, Value> {
    public final ConflatedEventBus<Boolean> a = new ConflatedEventBus<>((Object) null, 1, (f) null);
    public final ConflatedEventBus<i> b = new ConflatedEventBus<>((Object) null, 1, (f) null);
    public final d<w<Value>> c = g0.a.b.b.a.z0(new PageFetcher$flow$1(this, (c) null));
    public final l<c<? super x<Key, Value>>, Object> d;
    public final Key e;
    public final v f;

    /* compiled from: PageFetcher.kt */
    public static final class a<Key, Value> {
        public final PageFetcherSnapshot<Key, Value> a;
        public final y<Key, Value> b;

        public a(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, y<Key, Value> yVar) {
            m0.n.b.i.e(pageFetcherSnapshot, "snapshot");
            this.a = pageFetcherSnapshot;
            this.b = yVar;
        }
    }

    /* compiled from: PageFetcher.kt */
    public final class b<Key, Value> implements g0 {
        public final PageFetcherSnapshot<Key, Value> a;
        public final ConflatedEventBus<i> b;
        public final /* synthetic */ PageFetcher c;

        public b(PageFetcher pageFetcher, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, ConflatedEventBus<i> conflatedEventBus) {
            m0.n.b.i.e(pageFetcherSnapshot, "pageFetcherSnapshot");
            m0.n.b.i.e(conflatedEventBus, "retryEventBus");
            this.c = pageFetcher;
            this.a = pageFetcherSnapshot;
            this.b = conflatedEventBus;
        }

        public void a(h0 h0Var) {
            m0.n.b.i.e(h0Var, "viewportHint");
            PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = this.a;
            Objects.requireNonNull(pageFetcherSnapshot);
            m0.n.b.i.e(h0Var, "viewportHint");
            if (h0Var instanceof h0.a) {
                pageFetcherSnapshot.b = (h0.a) h0Var;
            }
            pageFetcherSnapshot.a.d(h0Var);
        }

        public void refresh() {
            this.c.a.send(Boolean.TRUE);
        }

        public void retry() {
            this.b.send(i.a);
        }
    }

    public PageFetcher(l lVar, Object obj, v vVar) {
        m0.n.b.i.e(lVar, "pagingSourceFactory");
        m0.n.b.i.e(vVar, "config");
        this.d = lVar;
        this.e = obj;
        this.f = vVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h0.u.x<Key, Value> r8, m0.l.c<? super h0.u.x<Key, Value>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.paging.PageFetcher$generateNewPagingSource$1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = (androidx.paging.PageFetcher$generateNewPagingSource$1) r0
            int r2 = r0.d
            r3 = r2 & r1
            if (r3 == 0) goto L_0x0013
            int r2 = r2 - r1
            r0.d = r2
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.d
            r4 = 1
            if (r3 == 0) goto L_0x0037
            if (r3 != r4) goto L_0x002f
            java.lang.Object r8 = r0.y
            h0.u.x r8 = (h0.u.x) r8
            java.lang.Object r0 = r0.x
            androidx.paging.PageFetcher r0 = (androidx.paging.PageFetcher) r0
            i0.j.f.p.h.d4(r9)
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            i0.j.f.p.h.d4(r9)
            m0.n.a.l<m0.l.c<? super h0.u.x<Key, Value>>, java.lang.Object> r9 = r7.d
            r0.x = r7
            r0.y = r8
            r0.d = r4
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r2) goto L_0x0049
            return r2
        L_0x0049:
            r0 = r7
        L_0x004a:
            h0.u.x r9 = (h0.u.x) r9
            boolean r2 = r9 instanceof androidx.paging.LegacyPagingSource
            r3 = 0
            if (r2 == 0) goto L_0x007f
            r2 = r9
            androidx.paging.LegacyPagingSource r2 = (androidx.paging.LegacyPagingSource) r2
            h0.u.v r5 = r0.f
            int r5 = r5.a
            int r6 = r2.c
            if (r6 == r1) goto L_0x0061
            if (r5 != r6) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r1 = r3
            goto L_0x0062
        L_0x0061:
            r1 = r4
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r2.c = r5
            goto L_0x007f
        L_0x0067:
            java.lang.String r8 = "Page size is already set to "
            java.lang.StringBuilder r8 = i0.d.a.a.a.P0(r8)
            int r9 = r2.c
            r0 = 46
            java.lang.String r8 = i0.d.a.a.a.s0(r8, r9, r0)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x007f:
            if (r9 == r8) goto L_0x0083
            r1 = r4
            goto L_0x0084
        L_0x0083:
            r1 = r3
        L_0x0084:
            if (r1 == 0) goto L_0x00c8
            androidx.paging.PageFetcher$generateNewPagingSource$3 r1 = new androidx.paging.PageFetcher$generateNewPagingSource$3
            r1.<init>(r0)
            java.util.Objects.requireNonNull(r9)
            java.lang.String r2 = "onInvalidatedCallback"
            m0.n.b.i.e(r1, r2)
            java.util.concurrent.CopyOnWriteArrayList<m0.n.a.a<m0.i>> r5 = r9.a
            r5.add(r1)
            if (r8 == 0) goto L_0x00a7
            androidx.paging.PageFetcher$generateNewPagingSource$4 r1 = new androidx.paging.PageFetcher$generateNewPagingSource$4
            r1.<init>(r0)
            m0.n.b.i.e(r1, r2)
            java.util.concurrent.CopyOnWriteArrayList<m0.n.a.a<m0.i>> r0 = r8.a
            r0.remove(r1)
        L_0x00a7:
            if (r8 == 0) goto L_0x00c7
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.b
            boolean r0 = r0.compareAndSet(r3, r4)
            if (r0 == 0) goto L_0x00c7
            java.util.concurrent.CopyOnWriteArrayList<m0.n.a.a<m0.i>> r8 = r8.a
            java.util.Iterator r8 = r8.iterator()
        L_0x00b7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r8.next()
            m0.n.a.a r0 = (m0.n.a.a) r0
            r0.invoke()
            goto L_0x00b7
        L_0x00c7:
            return r9
        L_0x00c8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.a(h0.u.x, m0.l.c):java.lang.Object");
    }
}
