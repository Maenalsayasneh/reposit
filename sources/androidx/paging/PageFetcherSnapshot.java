package androidx.paging;

import h0.u.b0;
import h0.u.g;
import h0.u.h;
import h0.u.h0;
import h0.u.j;
import h0.u.r;
import h0.u.v;
import h0.u.x;
import h0.u.y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import n0.a.f0;
import n0.a.f1;
import n0.a.f2.d;
import n0.a.g2.e;
import n0.a.g2.p;
import n0.a.g2.s;
import n0.a.g2.u;
import n0.a.x;

/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot<Key, Value> {
    public final p<h0> a;
    public h0.a b;
    public final AtomicBoolean c;
    public final d<PageEvent<Value>> d;
    public final r.a<Key, Value> e;
    public final x f;
    public final n0.a.g2.d<PageEvent<Value>> g;
    public final Key h;
    public final h0.u.x<Key, Value> i;
    public final v j;
    public final n0.a.g2.d<i> k;
    public final boolean l;
    public final b0<Key, Value> m;
    public final y<Key, Value> n;
    public final m0.n.a.a<i> o;

    /* compiled from: Collect.kt */
    public static final class a implements e<h> {
        public final /* synthetic */ PageFetcherSnapshot c;
        public final /* synthetic */ LoadType d;

        public a(PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
            this.c = pageFetcherSnapshot;
            this.d = loadType;
        }

        public Object emit(Object obj, c cVar) {
            Object e = this.c.e(this.d, (h) obj, cVar);
            if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return e;
            }
            return i.a;
        }
    }

    public PageFetcherSnapshot(Key key, h0.u.x<Key, Value> xVar, v vVar, n0.a.g2.d<i> dVar, boolean z, b0<Key, Value> b0Var, y<Key, Value> yVar, m0.n.a.a<i> aVar) {
        m0.n.b.i.e(xVar, "pagingSource");
        m0.n.b.i.e(vVar, "config");
        m0.n.b.i.e(dVar, "retryFlow");
        m0.n.b.i.e(aVar, "invalidate");
        this.h = key;
        this.i = xVar;
        this.j = vVar;
        this.k = dVar;
        this.l = z;
        this.m = b0Var;
        this.n = yVar;
        this.o = aVar;
        if (vVar.f == Integer.MIN_VALUE || xVar.a()) {
            this.a = u.b(1, 0, (BufferOverflow) null, 6);
            this.c = new AtomicBoolean(false);
            this.d = m0.r.t.a.r.m.a1.a.d(-2, (BufferOverflow) null, (l) null, 6);
            this.e = new r.a<>(vVar);
            x n2 = m0.r.t.a.r.m.a1.a.n((f1) null, 1, (Object) null);
            this.f = n2;
            PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this, (c) null);
            m0.n.b.i.e(n2, "controller");
            m0.n.b.i.e(pageFetcherSnapshot$pageEventFlow$1, "block");
            this.g = g0.a.b.b.a.z0(new CancelableChannelFlowKt$cancelableChannelFlow$1(n2, pageFetcherSnapshot$pageEventFlow$1, (c) null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    public static final void a(PageFetcherSnapshot pageFetcherSnapshot, f0 f0Var) {
        PageFetcherSnapshot pageFetcherSnapshot2 = pageFetcherSnapshot;
        if (pageFetcherSnapshot2.j.f != Integer.MIN_VALUE) {
            m0.r.t.a.r.m.a1.a.E2(f0Var, (m0.l.e) null, (CoroutineStart) null, new PageFetcherSnapshot$startConsumingHints$1(pageFetcherSnapshot2, (c) null), 3, (Object) null);
        }
        m0.r.t.a.r.m.a1.a.E2(f0Var, (m0.l.e) null, (CoroutineStart) null, new PageFetcherSnapshot$startConsumingHints$2(pageFetcherSnapshot2, (c) null), 3, (Object) null);
        m0.r.t.a.r.m.a1.a.E2(f0Var, (m0.l.e) null, (CoroutineStart) null, new PageFetcherSnapshot$startConsumingHints$3(pageFetcherSnapshot2, (c) null), 3, (Object) null);
    }

    public final Object b(n0.a.g2.d<Integer> dVar, LoadType loadType, c<? super i> cVar) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1((c) null, this, loadType);
        Object obj = g.a;
        m0.n.b.i.e(dVar, "$this$simpleTransformLatest");
        m0.n.b.i.e(pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1, "transform");
        n0.a.g2.d z0 = g0.a.b.b.a.z0(new FlowExtKt$simpleTransformLatest$1(dVar, pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1, (c) null));
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, (c) null);
        m0.n.b.i.e(z0, "$this$simpleRunningReduce");
        m0.n.b.i.e(pageFetcherSnapshot$collectAsGenerationalViewportHints$3, "operation");
        Object collect = m0.r.t.a.r.m.a1.a.d0(new s(new FlowExtKt$simpleRunningReduce$1(z0, pageFetcherSnapshot$collectAsGenerationalViewportHints$3, (c) null)), -1, (BufferOverflow) null, 2, (Object) null).collect(new a(this, loadType), cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(m0.l.c<? super h0.u.y<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$currentPagingState$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot$currentPagingState$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r1 = r0.Y1
            n0.a.k2.b r1 = (n0.a.k2.b) r1
            java.lang.Object r2 = r0.y
            h0.u.r$a r2 = (h0.u.r.a) r2
            java.lang.Object r0 = r0.x
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            i0.j.f.p.h.d4(r6)
            goto L_0x0054
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            i0.j.f.p.h.d4(r6)
            h0.u.r$a<Key, Value> r2 = r5.e
            n0.a.k2.b r6 = r2.a
            r0.x = r5
            r0.y = r2
            r0.Y1 = r6
            r0.d = r4
            java.lang.Object r0 = r6.a(r3, r0)
            if (r0 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r5
            r1 = r6
        L_0x0054:
            h0.u.r<Key, Value> r6 = r2.b     // Catch:{ all -> 0x0060 }
            h0.u.h0$a r0 = r0.b     // Catch:{ all -> 0x0060 }
            h0.u.y r6 = r6.a(r0)     // Catch:{ all -> 0x0060 }
            r1.b(r3)
            return r6
        L_0x0060:
            r6 = move-exception
            r1.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.c(m0.l.c):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023a, code lost:
        if ((r6 instanceof h0.u.x.b.a) == false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x023c, code lost:
        r5 = r7.e;
        r11 = r5.a;
        r0.x = r7;
        r0.y = r6;
        r0.Y1 = r5;
        r0.Z1 = r11;
        r0.d = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0250, code lost:
        if (r11.a((java.lang.Object) null, r0) != r1) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0252, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r2 = r5.b;
        r5 = new h0.u.j.a(((h0.u.x.b.a) r6).a);
        r6 = androidx.paging.LoadType.REFRESH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0264, code lost:
        if (r2.j(r6, r5) == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0266, code lost:
        r2 = r7.d;
        r7 = new androidx.paging.PageEvent.b(r6, false, r5);
        r0.x = r11;
        r0.y = null;
        r0.Y1 = null;
        r0.Z1 = null;
        r0.d = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027d, code lost:
        if (r2.t(r7, r0) != r1) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x027f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0280, code lost:
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0281, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0282, code lost:
        r11.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0286, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0287, code lost:
        r9 = r0;
        r0 = r11;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028a, code lost:
        r0.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028d, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0290, code lost:
        return m0.i.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r11 = r5.b;
        r5 = androidx.paging.LoadType.REFRESH;
        r0.x = r6;
        r0.y = r2;
        r0.Y1 = null;
        r0.d = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        if (r6.i(r11, r5, r0) != r1) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0105, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0106, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0107, code lost:
        r2.b((java.lang.Object) null);
        r11 = r5.f(androidx.paging.LoadType.REFRESH, r5.h);
        r2 = r5.i;
        r0.x = r5;
        r0.y = null;
        r0.d = 3;
        r11 = r2.c(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011f, code lost:
        if (r11 != r1) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0121, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0122, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        r6 = (h0.u.x.b) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0128, code lost:
        if ((r6 instanceof h0.u.x.b.C0069b) == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012a, code lost:
        r5 = r7.e;
        r2 = r5.a;
        r0.x = r7;
        r0.y = r6;
        r0.Y1 = r5;
        r0.Z1 = r2;
        r0.d = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013d, code lost:
        if (r2.a((java.lang.Object) null, r0) != r1) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r11 = java.lang.Boolean.valueOf(r5.b.g(0, androidx.paging.LoadType.REFRESH, (h0.u.x.b.C0069b) r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014f, code lost:
        r2.b((java.lang.Object) null);
        r2 = r11.booleanValue();
        r5 = r7.e;
        r3 = r5.a;
        r0.x = r7;
        r0.y = r6;
        r0.Y1 = r5;
        r0.Z1 = r3;
        r0.a2 = r2;
        r0.d = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016b, code lost:
        if (r3.a((java.lang.Object) null, r0) != r1) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r11 = r5.b;
        r11.j(androidx.paging.LoadType.REFRESH, h0.u.j.c.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017c, code lost:
        if (((h0.u.x.b.C0069b) r6).b != null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017e, code lost:
        r11.j(androidx.paging.LoadType.PREPEND, h0.u.j.c.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        if (((h0.u.x.b.C0069b) r6).c != null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018c, code lost:
        r11.j(androidx.paging.LoadType.APPEND, h0.u.j.c.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0196, code lost:
        if (r2 == false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0198, code lost:
        r3 = r7.e;
        r11 = r3.a;
        r0.x = r7;
        r0.y = r6;
        r0.Y1 = r3;
        r0.Z1 = r11;
        r0.d = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ab, code lost:
        if (r11.a((java.lang.Object) null, r0) != r1) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ad, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ae, code lost:
        r2 = r11;
        r5 = r6;
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r11 = r3.b;
        r3 = r6.d;
        r11 = r11.k((h0.u.x.b.C0069b) r5, androidx.paging.LoadType.REFRESH);
        r0.x = r6;
        r0.y = r5;
        r0.Y1 = r2;
        r0.Z1 = null;
        r0.d = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cd, code lost:
        if (r3.t(r11, r0) != r1) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cf, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d0, code lost:
        r3 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d2, code lost:
        r2.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01db, code lost:
        r3 = r6;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01df, code lost:
        if (r5.m == null) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e1, code lost:
        r11 = (h0.u.x.b.C0069b) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e6, code lost:
        if (r11.b == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ea, code lost:
        if (r11.c != null) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ec, code lost:
        r2 = r5.e;
        r11 = r2.a;
        r0.x = r5;
        r0.y = r3;
        r0.Y1 = r2;
        r0.Z1 = r11;
        r0.d = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0200, code lost:
        if (r11.a((java.lang.Object) null, r0) != r1) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0202, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0203, code lost:
        r1 = r11;
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r11 = r2.b.a(r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020d, code lost:
        r1.b((java.lang.Object) null);
        r3 = (h0.u.x.b.C0069b) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0214, code lost:
        if (r3.b != null) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0216, code lost:
        r0.m.a(androidx.paging.LoadType.PREPEND, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021f, code lost:
        if (r3.c != null) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0221, code lost:
        r0.m.a(androidx.paging.LoadType.APPEND, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0229, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x022a, code lost:
        r1.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022d, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022e, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022f, code lost:
        r3.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0232, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0233, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0234, code lost:
        r2.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0237, code lost:
        throw r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(m0.l.c<? super m0.i> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.paging.PageFetcherSnapshot$doInitialLoad$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.paging.PageFetcherSnapshot$doInitialLoad$1 r0 = (androidx.paging.PageFetcherSnapshot$doInitialLoad$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$doInitialLoad$1 r0 = new androidx.paging.PageFetcherSnapshot$doInitialLoad$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00b4;
                case 4: goto L_0x009f;
                case 5: goto L_0x0088;
                case 6: goto L_0x0073;
                case 7: goto L_0x0062;
                case 8: goto L_0x004d;
                case 9: goto L_0x0037;
                case 10: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x002b:
            java.lang.Object r0 = r0.x
            n0.a.k2.b r0 = (n0.a.k2.b) r0
            i0.j.f.p.h.d4(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x0281
        L_0x0034:
            r11 = move-exception
            goto L_0x028a
        L_0x0037:
            java.lang.Object r2 = r0.Z1
            n0.a.k2.b r2 = (n0.a.k2.b) r2
            java.lang.Object r5 = r0.Y1
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r6 = r0.y
            h0.u.x$b r6 = (h0.u.x.b) r6
            java.lang.Object r7 = r0.x
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            i0.j.f.p.h.d4(r11)
            r11 = r2
            goto L_0x0253
        L_0x004d:
            java.lang.Object r1 = r0.Z1
            n0.a.k2.b r1 = (n0.a.k2.b) r1
            java.lang.Object r2 = r0.Y1
            h0.u.r$a r2 = (h0.u.r.a) r2
            java.lang.Object r3 = r0.y
            h0.u.x$b r3 = (h0.u.x.b) r3
            java.lang.Object r0 = r0.x
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            i0.j.f.p.h.d4(r11)
            goto L_0x0205
        L_0x0062:
            java.lang.Object r2 = r0.Y1
            n0.a.k2.b r2 = (n0.a.k2.b) r2
            java.lang.Object r3 = r0.y
            h0.u.x$b r3 = (h0.u.x.b) r3
            java.lang.Object r5 = r0.x
            androidx.paging.PageFetcherSnapshot r5 = (androidx.paging.PageFetcherSnapshot) r5
            i0.j.f.p.h.d4(r11)     // Catch:{ all -> 0x01d6 }
            goto L_0x01d2
        L_0x0073:
            java.lang.Object r2 = r0.Z1
            n0.a.k2.b r2 = (n0.a.k2.b) r2
            java.lang.Object r3 = r0.Y1
            h0.u.r$a r3 = (h0.u.r.a) r3
            java.lang.Object r5 = r0.y
            h0.u.x$b r5 = (h0.u.x.b) r5
            java.lang.Object r6 = r0.x
            androidx.paging.PageFetcherSnapshot r6 = (androidx.paging.PageFetcherSnapshot) r6
            i0.j.f.p.h.d4(r11)
            goto L_0x01b1
        L_0x0088:
            boolean r2 = r0.a2
            java.lang.Object r3 = r0.Z1
            n0.a.k2.b r3 = (n0.a.k2.b) r3
            java.lang.Object r5 = r0.Y1
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r6 = r0.y
            h0.u.x$b r6 = (h0.u.x.b) r6
            java.lang.Object r7 = r0.x
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            i0.j.f.p.h.d4(r11)
            goto L_0x016e
        L_0x009f:
            java.lang.Object r2 = r0.Z1
            n0.a.k2.b r2 = (n0.a.k2.b) r2
            java.lang.Object r5 = r0.Y1
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r6 = r0.y
            h0.u.x$b r6 = (h0.u.x.b) r6
            java.lang.Object r7 = r0.x
            androidx.paging.PageFetcherSnapshot r7 = (androidx.paging.PageFetcherSnapshot) r7
            i0.j.f.p.h.d4(r11)
            goto L_0x0140
        L_0x00b4:
            java.lang.Object r2 = r0.x
            androidx.paging.PageFetcherSnapshot r2 = (androidx.paging.PageFetcherSnapshot) r2
            i0.j.f.p.h.d4(r11)
            r7 = r2
            goto L_0x0123
        L_0x00bd:
            java.lang.Object r2 = r0.y
            n0.a.k2.b r2 = (n0.a.k2.b) r2
            java.lang.Object r5 = r0.x
            androidx.paging.PageFetcherSnapshot r5 = (androidx.paging.PageFetcherSnapshot) r5
            i0.j.f.p.h.d4(r11)     // Catch:{ all -> 0x0291 }
            goto L_0x0107
        L_0x00c9:
            java.lang.Object r2 = r0.Y1
            n0.a.k2.b r2 = (n0.a.k2.b) r2
            java.lang.Object r5 = r0.y
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r6 = r0.x
            androidx.paging.PageFetcherSnapshot r6 = (androidx.paging.PageFetcherSnapshot) r6
            i0.j.f.p.h.d4(r11)
            goto L_0x00f2
        L_0x00d9:
            i0.j.f.p.h.d4(r11)
            h0.u.r$a<Key, Value> r5 = r10.e
            n0.a.k2.b r11 = r5.a
            r0.x = r10
            r0.y = r5
            r0.Y1 = r11
            r2 = 1
            r0.d = r2
            java.lang.Object r2 = r11.a(r4, r0)
            if (r2 != r1) goto L_0x00f0
            return r1
        L_0x00f0:
            r6 = r10
            r2 = r11
        L_0x00f2:
            h0.u.r<Key, Value> r11 = r5.b     // Catch:{ all -> 0x0291 }
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0291 }
            r0.x = r6     // Catch:{ all -> 0x0291 }
            r0.y = r2     // Catch:{ all -> 0x0291 }
            r0.Y1 = r4     // Catch:{ all -> 0x0291 }
            r7 = 2
            r0.d = r7     // Catch:{ all -> 0x0291 }
            java.lang.Object r11 = r6.i(r11, r5, r0)     // Catch:{ all -> 0x0291 }
            if (r11 != r1) goto L_0x0106
            return r1
        L_0x0106:
            r5 = r6
        L_0x0107:
            r2.b(r4)
            androidx.paging.LoadType r11 = androidx.paging.LoadType.REFRESH
            Key r2 = r5.h
            h0.u.x$a r11 = r5.f(r11, r2)
            h0.u.x<Key, Value> r2 = r5.i
            r0.x = r5
            r0.y = r4
            r6 = 3
            r0.d = r6
            java.lang.Object r11 = r2.c(r11, r0)
            if (r11 != r1) goto L_0x0122
            return r1
        L_0x0122:
            r7 = r5
        L_0x0123:
            r6 = r11
            h0.u.x$b r6 = (h0.u.x.b) r6
            boolean r11 = r6 instanceof h0.u.x.b.C0069b
            if (r11 == 0) goto L_0x0238
            h0.u.r$a<Key, Value> r5 = r7.e
            n0.a.k2.b r2 = r5.a
            r0.x = r7
            r0.y = r6
            r0.Y1 = r5
            r0.Z1 = r2
            r11 = 4
            r0.d = r11
            java.lang.Object r11 = r2.a(r4, r0)
            if (r11 != r1) goto L_0x0140
            return r1
        L_0x0140:
            h0.u.r<Key, Value> r11 = r5.b     // Catch:{ all -> 0x0233 }
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0233 }
            r8 = r6
            h0.u.x$b$b r8 = (h0.u.x.b.C0069b) r8     // Catch:{ all -> 0x0233 }
            boolean r11 = r11.g(r3, r5, r8)     // Catch:{ all -> 0x0233 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0233 }
            r2.b(r4)
            boolean r2 = r11.booleanValue()
            h0.u.r$a<Key, Value> r5 = r7.e
            n0.a.k2.b r3 = r5.a
            r0.x = r7
            r0.y = r6
            r0.Y1 = r5
            r0.Z1 = r3
            r0.a2 = r2
            r11 = 5
            r0.d = r11
            java.lang.Object r11 = r3.a(r4, r0)
            if (r11 != r1) goto L_0x016e
            return r1
        L_0x016e:
            h0.u.r<Key, Value> r11 = r5.b     // Catch:{ all -> 0x022e }
            androidx.paging.LoadType r5 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x022e }
            h0.u.j$c r8 = h0.u.j.c.c     // Catch:{ all -> 0x022e }
            r11.j(r5, r8)     // Catch:{ all -> 0x022e }
            r5 = r6
            h0.u.x$b$b r5 = (h0.u.x.b.C0069b) r5     // Catch:{ all -> 0x022e }
            Key r5 = r5.b     // Catch:{ all -> 0x022e }
            if (r5 != 0) goto L_0x0185
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND     // Catch:{ all -> 0x022e }
            h0.u.j$c r8 = h0.u.j.c.b     // Catch:{ all -> 0x022e }
            r11.j(r5, r8)     // Catch:{ all -> 0x022e }
        L_0x0185:
            r5 = r6
            h0.u.x$b$b r5 = (h0.u.x.b.C0069b) r5     // Catch:{ all -> 0x022e }
            Key r5 = r5.c     // Catch:{ all -> 0x022e }
            if (r5 != 0) goto L_0x0193
            androidx.paging.LoadType r5 = androidx.paging.LoadType.APPEND     // Catch:{ all -> 0x022e }
            h0.u.j$c r8 = h0.u.j.c.b     // Catch:{ all -> 0x022e }
            r11.j(r5, r8)     // Catch:{ all -> 0x022e }
        L_0x0193:
            r3.b(r4)
            if (r2 == 0) goto L_0x01db
            h0.u.r$a<Key, Value> r3 = r7.e
            n0.a.k2.b r11 = r3.a
            r0.x = r7
            r0.y = r6
            r0.Y1 = r3
            r0.Z1 = r11
            r2 = 6
            r0.d = r2
            java.lang.Object r2 = r11.a(r4, r0)
            if (r2 != r1) goto L_0x01ae
            return r1
        L_0x01ae:
            r2 = r11
            r5 = r6
            r6 = r7
        L_0x01b1:
            h0.u.r<Key, Value> r11 = r3.b     // Catch:{ all -> 0x01d6 }
            n0.a.f2.d<androidx.paging.PageEvent<Value>> r3 = r6.d     // Catch:{ all -> 0x01d6 }
            r7 = r5
            h0.u.x$b$b r7 = (h0.u.x.b.C0069b) r7     // Catch:{ all -> 0x01d6 }
            androidx.paging.LoadType r8 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x01d6 }
            androidx.paging.PageEvent r11 = r11.k(r7, r8)     // Catch:{ all -> 0x01d6 }
            r0.x = r6     // Catch:{ all -> 0x01d6 }
            r0.y = r5     // Catch:{ all -> 0x01d6 }
            r0.Y1 = r2     // Catch:{ all -> 0x01d6 }
            r0.Z1 = r4     // Catch:{ all -> 0x01d6 }
            r7 = 7
            r0.d = r7     // Catch:{ all -> 0x01d6 }
            java.lang.Object r11 = r3.t(r11, r0)     // Catch:{ all -> 0x01d6 }
            if (r11 != r1) goto L_0x01d0
            return r1
        L_0x01d0:
            r3 = r5
            r5 = r6
        L_0x01d2:
            r2.b(r4)
            goto L_0x01dd
        L_0x01d6:
            r11 = move-exception
            r2.b(r4)
            throw r11
        L_0x01db:
            r3 = r6
            r5 = r7
        L_0x01dd:
            h0.u.b0<Key, Value> r11 = r5.m
            if (r11 == 0) goto L_0x028e
            r11 = r3
            h0.u.x$b$b r11 = (h0.u.x.b.C0069b) r11
            Key r2 = r11.b
            if (r2 == 0) goto L_0x01ec
            Key r11 = r11.c
            if (r11 != 0) goto L_0x028e
        L_0x01ec:
            h0.u.r$a<Key, Value> r2 = r5.e
            n0.a.k2.b r11 = r2.a
            r0.x = r5
            r0.y = r3
            r0.Y1 = r2
            r0.Z1 = r11
            r6 = 8
            r0.d = r6
            java.lang.Object r0 = r11.a(r4, r0)
            if (r0 != r1) goto L_0x0203
            return r1
        L_0x0203:
            r1 = r11
            r0 = r5
        L_0x0205:
            h0.u.r<Key, Value> r11 = r2.b     // Catch:{ all -> 0x0229 }
            h0.u.h0$a r2 = r0.b     // Catch:{ all -> 0x0229 }
            h0.u.y r11 = r11.a(r2)     // Catch:{ all -> 0x0229 }
            r1.b(r4)
            h0.u.x$b$b r3 = (h0.u.x.b.C0069b) r3
            Key r1 = r3.b
            if (r1 != 0) goto L_0x021d
            h0.u.b0<Key, Value> r1 = r0.m
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            r1.a(r2, r11)
        L_0x021d:
            Key r1 = r3.c
            if (r1 != 0) goto L_0x028e
            h0.u.b0<Key, Value> r0 = r0.m
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            r0.a(r1, r11)
            goto L_0x028e
        L_0x0229:
            r11 = move-exception
            r1.b(r4)
            throw r11
        L_0x022e:
            r11 = move-exception
            r3.b(r4)
            throw r11
        L_0x0233:
            r11 = move-exception
            r2.b(r4)
            throw r11
        L_0x0238:
            boolean r11 = r6 instanceof h0.u.x.b.a
            if (r11 == 0) goto L_0x028e
            h0.u.r$a<Key, Value> r5 = r7.e
            n0.a.k2.b r11 = r5.a
            r0.x = r7
            r0.y = r6
            r0.Y1 = r5
            r0.Z1 = r11
            r2 = 9
            r0.d = r2
            java.lang.Object r2 = r11.a(r4, r0)
            if (r2 != r1) goto L_0x0253
            return r1
        L_0x0253:
            h0.u.r<Key, Value> r2 = r5.b     // Catch:{ all -> 0x0286 }
            h0.u.j$a r5 = new h0.u.j$a     // Catch:{ all -> 0x0286 }
            h0.u.x$b$a r6 = (h0.u.x.b.a) r6     // Catch:{ all -> 0x0286 }
            java.lang.Throwable r6 = r6.a     // Catch:{ all -> 0x0286 }
            r5.<init>(r6)     // Catch:{ all -> 0x0286 }
            androidx.paging.LoadType r6 = androidx.paging.LoadType.REFRESH     // Catch:{ all -> 0x0286 }
            boolean r2 = r2.j(r6, r5)     // Catch:{ all -> 0x0286 }
            if (r2 == 0) goto L_0x0282
            n0.a.f2.d<androidx.paging.PageEvent<Value>> r2 = r7.d     // Catch:{ all -> 0x0286 }
            androidx.paging.PageEvent$b r7 = new androidx.paging.PageEvent$b     // Catch:{ all -> 0x0286 }
            r7.<init>(r6, r3, r5)     // Catch:{ all -> 0x0286 }
            r0.x = r11     // Catch:{ all -> 0x0286 }
            r0.y = r4     // Catch:{ all -> 0x0286 }
            r0.Y1 = r4     // Catch:{ all -> 0x0286 }
            r0.Z1 = r4     // Catch:{ all -> 0x0286 }
            r3 = 10
            r0.d = r3     // Catch:{ all -> 0x0286 }
            java.lang.Object r0 = r2.t(r7, r0)     // Catch:{ all -> 0x0286 }
            if (r0 != r1) goto L_0x0280
            return r1
        L_0x0280:
            r0 = r11
        L_0x0281:
            r11 = r0
        L_0x0282:
            r11.b(r4)
            goto L_0x028e
        L_0x0286:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x028a:
            r0.b(r4)
            throw r11
        L_0x028e:
            m0.i r11 = m0.i.a
            return r11
        L_0x0291:
            r11 = move-exception
            r2.b(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.d(m0.l.c):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: h0.u.x$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: n0.a.k2.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03af, code lost:
        throw new java.lang.IllegalStateException(kotlin.text.StringsKt__IndentKt.Z(r2.toString(), (java.lang.String) null, 1).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03b0, code lost:
        r5 = r9.e;
        r7 = r5.a;
        r3.x = r9;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r11;
        r3.a2 = r10;
        r3.b2 = r0;
        r3.c2 = r8;
        r3.d2 = r2;
        r3.e2 = r5;
        r3.f2 = r7;
        r3.d = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03d0, code lost:
        if (r7.a((java.lang.Object) null, r3) != r4) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d2, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03d3, code lost:
        r14 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r0 = java.lang.Boolean.valueOf(r5.b.g(r12.a, r13, (h0.u.x.b.C0069b) r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03e4, code lost:
        r7.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03ec, code lost:
        if (r0.booleanValue() != false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03f0, code lost:
        r5 = (h0.u.x.b.C0069b) r2;
        r11.c = r5.a.size() + r11.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0400, code lost:
        if (r13 != androidx.paging.LoadType.PREPEND) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0404, code lost:
        if (r5.b == null) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0408, code lost:
        if (r13 != androidx.paging.LoadType.APPEND) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x040c, code lost:
        if (r5.c != null) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x040e, code lost:
        r9.c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0411, code lost:
        r0 = r9;
        r9 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0415, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0416, code lost:
        r7.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x041a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x041d, code lost:
        if ((r2 instanceof h0.u.x.b.a) == false) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x041f, code lost:
        r5 = r9.e;
        r0 = r5.a;
        r3.x = r9;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r2;
        r3.a2 = r5;
        r3.b2 = r0;
        r3.c2 = null;
        r3.d = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0439, code lost:
        if (r0.a((java.lang.Object) null, r3) != r4) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x043b, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x043c, code lost:
        r6 = r2;
        r2 = r4;
        r4 = r0;
        r0 = r3;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r5 = r5.b;
        r7 = new h0.u.j.a(((h0.u.x.b.a) r6).a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0450, code lost:
        if (r5.j(r3, r7) == false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0452, code lost:
        r6 = r9.d;
        r8 = new androidx.paging.PageEvent.b(r3, false, r7);
        r0.x = r3;
        r0.y = r12;
        r0.Y1 = r4;
        r0.Z1 = r5;
        r0.a2 = null;
        r0.b2 = null;
        r0.d = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x046e, code lost:
        if (r6.t(r8, r0) != r2) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0470, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0471, code lost:
        r0 = r5;
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0473, code lost:
        r12 = r5;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0475, code lost:
        r5.j.put(r3, r12.b);
        r0 = m0.i.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x047e, code lost:
        r4.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0482, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x048e, code lost:
        if (r13.ordinal() == 1) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0490, code lost:
        r5 = androidx.paging.LoadType.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0493, code lost:
        r5 = androidx.paging.LoadType.APPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0495, code lost:
        r7 = r5;
        r5 = r9.e;
        r14 = r5.a;
        r3.x = r9;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r11;
        r3.a2 = r10;
        r3.b2 = r0;
        r3.c2 = r8;
        r3.d2 = r2;
        r3.e2 = r7;
        r3.f2 = r5;
        r3.g2 = r14;
        r3.d = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04b9, code lost:
        if (r14.a((java.lang.Object) null, r3) != r4) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04bb, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04bc, code lost:
        r15 = r9;
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r0 = r5.b;
        r5 = r0.c(r7, r12.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04c6, code lost:
        if (r5 == null) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04c8, code lost:
        r0.b(r5);
        r7 = r15.d;
        r3.x = r15;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r11;
        r3.a2 = r10;
        r3.b2 = r9;
        r3.c2 = r8;
        r3.d2 = r2;
        r3.e2 = r14;
        r3.f2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04e1, code lost:
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r3.g2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r3.d = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04ee, code lost:
        if (r7.t(r5, r3) != r4) goto L_0x04f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04f0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04f1, code lost:
        r0 = r18;
        r7 = r2;
        r5 = r14;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04f6, code lost:
        r2 = r7;
        r7 = r8;
        r15 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04fa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04fd, code lost:
        r18 = r0;
        r7 = r8;
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r1 = r15.g(r0, r13, r12.a, r12.a(r13) + r11.c);
        r10.c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0510, code lost:
        if (r1 != null) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x051a, code lost:
        if ((r0.k.b(r13) instanceof h0.u.j.a) != false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x051e, code lost:
        if (r9.c == false) goto L_0x0523;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0520, code lost:
        r1 = h0.u.j.c.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0523, code lost:
        r1 = h0.u.j.c.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0525, code lost:
        r0.j(r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0528, code lost:
        r0 = r0.k((h0.u.x.b.C0069b) r2, r13);
        r1 = r15.d;
        r3.x = r15;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r11;
        r3.a2 = r10;
        r3.b2 = r9;
        r3.c2 = r7;
        r3.d2 = r2;
        r3.e2 = r5;
        r3.f2 = null;
        r3.g2 = null;
        r3.d = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0550, code lost:
        if (r1.t(r0, r3) != r4) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0552, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0553, code lost:
        r14 = r15;
        r16 = r2;
        r2 = null;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x055a, code lost:
        r5.b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x055f, code lost:
        if ((r7 instanceof h0.u.x.a.b) == false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0566, code lost:
        if (((h0.u.x.b.C0069b) r0).b != null) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0568, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x056a, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x056b, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x056e, code lost:
        if ((r7 instanceof h0.u.x.a.C0068a) == false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0574, code lost:
        if (((h0.u.x.b.C0069b) r0).c != null) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0576, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0578, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x057b, code lost:
        if (r14.m == null) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x057d, code lost:
        if (r5 != 0) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x057f, code lost:
        if (r0 == 0) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0581, code lost:
        r8 = r14.e;
        r7 = r8.a;
        r3.x = r14;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r11;
        r3.a2 = r10;
        r3.b2 = r9;
        r3.c2 = r8;
        r3.d2 = r7;
        r3.e2 = null;
        r3.h2 = r5;
        r3.i2 = r0;
        r3.d = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05a4, code lost:
        if (r7.a((java.lang.Object) null, r3) != r4) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05a6, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r1 = r8.b.a(r14.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05b3, code lost:
        if (r5 == 0) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05b5, code lost:
        r14.m.a(androidx.paging.LoadType.PREPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05bc, code lost:
        if (r0 == 0) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05be, code lost:
        r14.m.a(androidx.paging.LoadType.APPEND, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05c5, code lost:
        r0 = r9;
        r8 = r10;
        r9 = r11;
        r10 = r12;
        r11 = r13;
        r12 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05cd, code lost:
        r7.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05d2, code lost:
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05d8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05d9, code lost:
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05da, code lost:
        r14 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05db, code lost:
        r14.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05e2, code lost:
        return m0.i.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05e3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05e4, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05e5, code lost:
        r7.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05ef, code lost:
        throw new java.lang.IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05f1, code lost:
        r2.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05f5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r5 = r5.b;
        r11 = r0.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0225, code lost:
        if (r11 == 0) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0227, code lost:
        if (r11 == r9) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x022a, code lost:
        if (r11 == 2) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x022e, code lost:
        r9 = (r5.c + r8.b.d) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0237, code lost:
        if (r9 >= 0) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0239, code lost:
        r7.c = (r10.j.a * (-r9)) + r7.c;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0245, code lost:
        r11 = m0.j.g.y(r5.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x024b, code lost:
        if (r9 > r11) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x024d, code lost:
        r7.c += r5.b.get(r9).a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0260, code lost:
        if (r9 == r11) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0262, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0265, code lost:
        r9 = (r5.c + r8.b.c) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0274, code lost:
        if (r9 <= m0.j.g.y(r5.b)) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0276, code lost:
        r7.c = ((r9 - m0.j.g.y(r5.b)) * r10.j.a) + r7.c;
        r9 = m0.j.g.y(r5.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x028d, code lost:
        if (r9 < 0) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x028f, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0290, code lost:
        r7.c += r5.b.get(r11).a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02a3, code lost:
        if (r11 == r9) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02a5, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02a8, code lost:
        r2.b((java.lang.Object) null);
        r2 = new kotlin.jvm.internal.Ref$ObjectRef();
        r5 = r10.e;
        r9 = r5.a;
        r3.x = r10;
        r3.y = r0;
        r3.Y1 = r8;
        r3.Z1 = r7;
        r3.a2 = r2;
        r3.b2 = r5;
        r3.c2 = r9;
        r3.d2 = r2;
        r3.d = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02cd, code lost:
        if (r9.a((java.lang.Object) null, r3) != r4) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02cf, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02d0, code lost:
        r11 = r0;
        r0 = r2;
        r12 = r10;
        r10 = r8;
        r8 = r0;
        r16 = r7;
        r7 = r5;
        r5 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r2 = r7.b;
        r7 = r12.g(r2, r11, r10.a, r10.a(r11) + r9.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02ea, code lost:
        if (r7 == null) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02ec, code lost:
        r3.x = r12;
        r3.y = r11;
        r3.Y1 = r10;
        r3.Z1 = r9;
        r3.a2 = r8;
        r3.b2 = r5;
        r3.c2 = r7;
        r3.d2 = r0;
        r3.d = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0303, code lost:
        if (r12.i(r2, r11, r3) != r4) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0305, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0306, code lost:
        r16 = r7;
        r7 = r5;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x030b, code lost:
        r2 = r5;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x030e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x030f, code lost:
        r5.b((java.lang.Object) null);
        r0.c = r2;
        r0 = new kotlin.jvm.internal.Ref$BooleanRef();
        r0.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x031d, code lost:
        r2 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x031f, code lost:
        if (r2 == null) goto L_0x05e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0321, code lost:
        r2 = r12.f(r11, r2);
        r5 = r12.i;
        r3.x = r12;
        r3.y = r11;
        r3.Y1 = r10;
        r3.Z1 = r9;
        r3.a2 = r8;
        r3.b2 = r0;
        r3.c2 = r2;
        r3.d2 = null;
        r3.e2 = null;
        r3.d = 4;
        r5 = r5.c(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0341, code lost:
        if (r5 != r4) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0343, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0344, code lost:
        r13 = r11;
        r11 = r9;
        r9 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r2;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x034b, code lost:
        r2 = (h0.u.x.b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x034f, code lost:
        if ((r2 instanceof h0.u.x.b.C0069b) == false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0351, code lost:
        r5 = r13.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0356, code lost:
        if (r5 == 1) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0359, code lost:
        if (r5 != 2) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x035b, code lost:
        r5 = ((h0.u.x.b.C0069b) r2).c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0366, code lost:
        throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0367, code lost:
        r5 = ((h0.u.x.b.C0069b) r2).b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x036c, code lost:
        java.util.Objects.requireNonNull(r9.i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0379, code lost:
        if ((!m0.n.b.i.a(r5, r10.c)) != false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x037d, code lost:
        if (r13 != androidx.paging.LoadType.PREPEND) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x037f, code lost:
        r0 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0382, code lost:
        r0 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0384, code lost:
        r2 = i0.d.a.a.a.P0("The same value, ");
        r2.append(r10.c);
        r2.append(", was passed as the ");
        r2.append(r0);
        r2.append(" in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(androidx.paging.LoadType r18, h0.u.h r19, m0.l.c<? super m0.i> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.paging.PageFetcherSnapshot$doLoad$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.paging.PageFetcherSnapshot$doLoad$1 r3 = (androidx.paging.PageFetcherSnapshot$doLoad$1) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.d = r4
            goto L_0x001e
        L_0x0019:
            androidx.paging.PageFetcherSnapshot$doLoad$1 r3 = new androidx.paging.PageFetcherSnapshot$doLoad$1
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.d
            java.lang.String r6 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r5) {
                case 0: goto L_0x01ed;
                case 1: goto L_0x01ca;
                case 2: goto L_0x01a5;
                case 3: goto L_0x017f;
                case 4: goto L_0x0157;
                case 5: goto L_0x0128;
                case 6: goto L_0x0106;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00b8;
                case 9: goto L_0x008b;
                case 10: goto L_0x005a;
                case 11: goto L_0x0031;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            int r0 = r3.i2
            int r5 = r3.h2
            java.lang.Object r7 = r3.d2
            n0.a.k2.b r7 = (n0.a.k2.b) r7
            java.lang.Object r8 = r3.c2
            h0.u.r$a r8 = (h0.u.r.a) r8
            java.lang.Object r9 = r3.b2
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref$IntRef) r11
            java.lang.Object r12 = r3.Y1
            h0.u.h r12 = (h0.u.h) r12
            java.lang.Object r13 = r3.y
            androidx.paging.LoadType r13 = (androidx.paging.LoadType) r13
            java.lang.Object r14 = r3.x
            androidx.paging.PageFetcherSnapshot r14 = (androidx.paging.PageFetcherSnapshot) r14
            i0.j.f.p.h.d4(r2)
            goto L_0x05a7
        L_0x005a:
            java.lang.Object r0 = r3.e2
            r5 = r0
            n0.a.k2.b r5 = (n0.a.k2.b) r5
            java.lang.Object r0 = r3.d2
            h0.u.x$b r0 = (h0.u.x.b) r0
            java.lang.Object r7 = r3.c2
            h0.u.x$a r7 = (h0.u.x.a) r7
            java.lang.Object r8 = r3.b2
            kotlin.jvm.internal.Ref$BooleanRef r8 = (kotlin.jvm.internal.Ref$BooleanRef) r8
            java.lang.Object r9 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref$ObjectRef) r9
            java.lang.Object r10 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref$IntRef) r10
            java.lang.Object r11 = r3.Y1
            h0.u.h r11 = (h0.u.h) r11
            java.lang.Object r12 = r3.y
            androidx.paging.LoadType r12 = (androidx.paging.LoadType) r12
            java.lang.Object r13 = r3.x
            androidx.paging.PageFetcherSnapshot r13 = (androidx.paging.PageFetcherSnapshot) r13
            i0.j.f.p.h.d4(r2)     // Catch:{ all -> 0x05d6 }
            r2 = 0
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            goto L_0x055a
        L_0x008b:
            java.lang.Object r0 = r3.f2
            h0.u.r r0 = (h0.u.r) r0
            java.lang.Object r5 = r3.e2
            n0.a.k2.b r5 = (n0.a.k2.b) r5
            java.lang.Object r7 = r3.d2
            h0.u.x$b r7 = (h0.u.x.b) r7
            java.lang.Object r8 = r3.c2
            h0.u.x$a r8 = (h0.u.x.a) r8
            java.lang.Object r9 = r3.b2
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref$IntRef) r11
            java.lang.Object r12 = r3.Y1
            h0.u.h r12 = (h0.u.h) r12
            java.lang.Object r13 = r3.y
            androidx.paging.LoadType r13 = (androidx.paging.LoadType) r13
            java.lang.Object r14 = r3.x
            androidx.paging.PageFetcherSnapshot r14 = (androidx.paging.PageFetcherSnapshot) r14
            i0.j.f.p.h.d4(r2)     // Catch:{ all -> 0x05d6 }
            goto L_0x04f6
        L_0x00b8:
            java.lang.Object r0 = r3.g2
            n0.a.k2.b r0 = (n0.a.k2.b) r0
            java.lang.Object r5 = r3.f2
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r7 = r3.e2
            androidx.paging.LoadType r7 = (androidx.paging.LoadType) r7
            java.lang.Object r8 = r3.d2
            h0.u.x$b r8 = (h0.u.x.b) r8
            java.lang.Object r9 = r3.c2
            h0.u.x$a r9 = (h0.u.x.a) r9
            java.lang.Object r10 = r3.b2
            kotlin.jvm.internal.Ref$BooleanRef r10 = (kotlin.jvm.internal.Ref$BooleanRef) r10
            java.lang.Object r11 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref$ObjectRef) r11
            java.lang.Object r12 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r12 = (kotlin.jvm.internal.Ref$IntRef) r12
            java.lang.Object r13 = r3.Y1
            h0.u.h r13 = (h0.u.h) r13
            java.lang.Object r14 = r3.y
            androidx.paging.LoadType r14 = (androidx.paging.LoadType) r14
            java.lang.Object r15 = r3.x
            androidx.paging.PageFetcherSnapshot r15 = (androidx.paging.PageFetcherSnapshot) r15
            i0.j.f.p.h.d4(r2)
            r2 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r0
            goto L_0x04be
        L_0x00f1:
            java.lang.Object r0 = r3.Z1
            h0.u.r r0 = (h0.u.r) r0
            java.lang.Object r4 = r3.Y1
            n0.a.k2.b r4 = (n0.a.k2.b) r4
            java.lang.Object r5 = r3.y
            h0.u.h r5 = (h0.u.h) r5
            java.lang.Object r3 = r3.x
            androidx.paging.LoadType r3 = (androidx.paging.LoadType) r3
            i0.j.f.p.h.d4(r2)     // Catch:{ all -> 0x0483 }
            goto L_0x0473
        L_0x0106:
            java.lang.Object r0 = r3.b2
            n0.a.k2.b r0 = (n0.a.k2.b) r0
            java.lang.Object r5 = r3.a2
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r6 = r3.Z1
            h0.u.x$b r6 = (h0.u.x.b) r6
            java.lang.Object r7 = r3.Y1
            h0.u.h r7 = (h0.u.h) r7
            java.lang.Object r8 = r3.y
            androidx.paging.LoadType r8 = (androidx.paging.LoadType) r8
            java.lang.Object r9 = r3.x
            androidx.paging.PageFetcherSnapshot r9 = (androidx.paging.PageFetcherSnapshot) r9
            i0.j.f.p.h.d4(r2)
            r2 = r4
            r12 = r7
            r4 = r0
            r0 = r3
            r3 = r8
            goto L_0x0441
        L_0x0128:
            java.lang.Object r0 = r3.f2
            n0.a.k2.b r0 = (n0.a.k2.b) r0
            java.lang.Object r5 = r3.e2
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r7 = r3.d2
            h0.u.x$b r7 = (h0.u.x.b) r7
            java.lang.Object r8 = r3.c2
            h0.u.x$a r8 = (h0.u.x.a) r8
            java.lang.Object r9 = r3.b2
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref$BooleanRef) r9
            java.lang.Object r10 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref$ObjectRef) r10
            java.lang.Object r11 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref$IntRef) r11
            java.lang.Object r12 = r3.Y1
            h0.u.h r12 = (h0.u.h) r12
            java.lang.Object r13 = r3.y
            androidx.paging.LoadType r13 = (androidx.paging.LoadType) r13
            java.lang.Object r14 = r3.x
            androidx.paging.PageFetcherSnapshot r14 = (androidx.paging.PageFetcherSnapshot) r14
            i0.j.f.p.h.d4(r2)
            r2 = r7
            r7 = r0
            goto L_0x03d5
        L_0x0157:
            java.lang.Object r0 = r3.c2
            h0.u.x$a r0 = (h0.u.x.a) r0
            java.lang.Object r5 = r3.b2
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref$BooleanRef) r5
            java.lang.Object r7 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r8 = (kotlin.jvm.internal.Ref$IntRef) r8
            java.lang.Object r9 = r3.Y1
            h0.u.h r9 = (h0.u.h) r9
            java.lang.Object r10 = r3.y
            androidx.paging.LoadType r10 = (androidx.paging.LoadType) r10
            java.lang.Object r11 = r3.x
            androidx.paging.PageFetcherSnapshot r11 = (androidx.paging.PageFetcherSnapshot) r11
            i0.j.f.p.h.d4(r2)
            r12 = r9
            r13 = r10
            r9 = r11
            r10 = r7
            r11 = r8
            r8 = r0
            r0 = r5
            goto L_0x034b
        L_0x017f:
            java.lang.Object r0 = r3.d2
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r5 = r3.c2
            java.lang.Object r7 = r3.b2
            n0.a.k2.b r7 = (n0.a.k2.b) r7
            java.lang.Object r8 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref$IntRef) r9
            java.lang.Object r10 = r3.Y1
            h0.u.h r10 = (h0.u.h) r10
            java.lang.Object r11 = r3.y
            androidx.paging.LoadType r11 = (androidx.paging.LoadType) r11
            java.lang.Object r12 = r3.x
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            i0.j.f.p.h.d4(r2)     // Catch:{ all -> 0x01a2 }
            goto L_0x030b
        L_0x01a2:
            r0 = move-exception
            goto L_0x05e5
        L_0x01a5:
            java.lang.Object r0 = r3.d2
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            java.lang.Object r5 = r3.c2
            n0.a.k2.b r5 = (n0.a.k2.b) r5
            java.lang.Object r7 = r3.b2
            h0.u.r$a r7 = (h0.u.r.a) r7
            java.lang.Object r8 = r3.a2
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r9 = (kotlin.jvm.internal.Ref$IntRef) r9
            java.lang.Object r10 = r3.Y1
            h0.u.h r10 = (h0.u.h) r10
            java.lang.Object r11 = r3.y
            androidx.paging.LoadType r11 = (androidx.paging.LoadType) r11
            java.lang.Object r12 = r3.x
            androidx.paging.PageFetcherSnapshot r12 = (androidx.paging.PageFetcherSnapshot) r12
            i0.j.f.p.h.d4(r2)
            goto L_0x02db
        L_0x01ca:
            java.lang.Object r0 = r3.b2
            n0.a.k2.b r0 = (n0.a.k2.b) r0
            java.lang.Object r5 = r3.a2
            h0.u.r$a r5 = (h0.u.r.a) r5
            java.lang.Object r7 = r3.Z1
            kotlin.jvm.internal.Ref$IntRef r7 = (kotlin.jvm.internal.Ref$IntRef) r7
            java.lang.Object r8 = r3.Y1
            h0.u.h r8 = (h0.u.h) r8
            java.lang.Object r9 = r3.y
            androidx.paging.LoadType r9 = (androidx.paging.LoadType) r9
            java.lang.Object r10 = r3.x
            androidx.paging.PageFetcherSnapshot r10 = (androidx.paging.PageFetcherSnapshot) r10
            i0.j.f.p.h.d4(r2)
            r2 = 1
            r16 = r2
            r2 = r0
            r0 = r9
            r9 = r16
            goto L_0x021f
        L_0x01ed:
            i0.j.f.p.h.d4(r2)
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            if (r0 == r2) goto L_0x01f6
            r2 = 1
            goto L_0x01f7
        L_0x01f6:
            r2 = 0
        L_0x01f7:
            if (r2 == 0) goto L_0x05f6
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            r2 = 0
            r7.c = r2
            h0.u.r$a<Key, Value> r5 = r1.e
            n0.a.k2.b r2 = r5.a
            r3.x = r1
            r3.y = r0
            r8 = r19
            r3.Y1 = r8
            r3.Z1 = r7
            r3.a2 = r5
            r3.b2 = r2
            r9 = 1
            r3.d = r9
            r10 = 0
            java.lang.Object r10 = r2.a(r10, r3)
            if (r10 != r4) goto L_0x021e
            return r4
        L_0x021e:
            r10 = r1
        L_0x021f:
            h0.u.r<Key, Value> r5 = r5.b     // Catch:{ all -> 0x05f0 }
            int r11 = r0.ordinal()     // Catch:{ all -> 0x05f0 }
            if (r11 == 0) goto L_0x05ea
            if (r11 == r9) goto L_0x0265
            r9 = 2
            if (r11 == r9) goto L_0x022e
            goto L_0x02a8
        L_0x022e:
            int r9 = r5.c     // Catch:{ all -> 0x05f0 }
            h0.u.h0 r11 = r8.b     // Catch:{ all -> 0x05f0 }
            int r11 = r11.d     // Catch:{ all -> 0x05f0 }
            int r9 = r9 + r11
            int r9 = r9 + 1
            if (r9 >= 0) goto L_0x0245
            int r11 = r7.c     // Catch:{ all -> 0x05f0 }
            h0.u.v r12 = r10.j     // Catch:{ all -> 0x05f0 }
            int r12 = r12.a     // Catch:{ all -> 0x05f0 }
            int r9 = -r9
            int r12 = r12 * r9
            int r12 = r12 + r11
            r7.c = r12     // Catch:{ all -> 0x05f0 }
            r9 = 0
        L_0x0245:
            java.util.List<h0.u.x$b$b<Key, Value>> r11 = r5.b     // Catch:{ all -> 0x05f0 }
            int r11 = m0.j.g.y(r11)     // Catch:{ all -> 0x05f0 }
            if (r9 > r11) goto L_0x02a8
        L_0x024d:
            int r12 = r7.c     // Catch:{ all -> 0x05f0 }
            java.util.List<h0.u.x$b$b<Key, Value>> r13 = r5.b     // Catch:{ all -> 0x05f0 }
            java.lang.Object r13 = r13.get(r9)     // Catch:{ all -> 0x05f0 }
            h0.u.x$b$b r13 = (h0.u.x.b.C0069b) r13     // Catch:{ all -> 0x05f0 }
            java.util.List<Value> r13 = r13.a     // Catch:{ all -> 0x05f0 }
            int r13 = r13.size()     // Catch:{ all -> 0x05f0 }
            int r12 = r12 + r13
            r7.c = r12     // Catch:{ all -> 0x05f0 }
            if (r9 == r11) goto L_0x02a8
            int r9 = r9 + 1
            goto L_0x024d
        L_0x0265:
            int r9 = r5.c     // Catch:{ all -> 0x05f0 }
            h0.u.h0 r11 = r8.b     // Catch:{ all -> 0x05f0 }
            int r11 = r11.c     // Catch:{ all -> 0x05f0 }
            int r9 = r9 + r11
            int r9 = r9 + -1
            java.util.List<h0.u.x$b$b<Key, Value>> r11 = r5.b     // Catch:{ all -> 0x05f0 }
            int r11 = m0.j.g.y(r11)     // Catch:{ all -> 0x05f0 }
            if (r9 <= r11) goto L_0x028d
            int r11 = r7.c     // Catch:{ all -> 0x05f0 }
            h0.u.v r12 = r10.j     // Catch:{ all -> 0x05f0 }
            int r12 = r12.a     // Catch:{ all -> 0x05f0 }
            java.util.List<h0.u.x$b$b<Key, Value>> r13 = r5.b     // Catch:{ all -> 0x05f0 }
            int r13 = m0.j.g.y(r13)     // Catch:{ all -> 0x05f0 }
            int r9 = r9 - r13
            int r9 = r9 * r12
            int r9 = r9 + r11
            r7.c = r9     // Catch:{ all -> 0x05f0 }
            java.util.List<h0.u.x$b$b<Key, Value>> r9 = r5.b     // Catch:{ all -> 0x05f0 }
            int r9 = m0.j.g.y(r9)     // Catch:{ all -> 0x05f0 }
        L_0x028d:
            if (r9 < 0) goto L_0x02a8
            r11 = 0
        L_0x0290:
            int r12 = r7.c     // Catch:{ all -> 0x05f0 }
            java.util.List<h0.u.x$b$b<Key, Value>> r13 = r5.b     // Catch:{ all -> 0x05f0 }
            java.lang.Object r13 = r13.get(r11)     // Catch:{ all -> 0x05f0 }
            h0.u.x$b$b r13 = (h0.u.x.b.C0069b) r13     // Catch:{ all -> 0x05f0 }
            java.util.List<Value> r13 = r13.a     // Catch:{ all -> 0x05f0 }
            int r13 = r13.size()     // Catch:{ all -> 0x05f0 }
            int r12 = r12 + r13
            r7.c = r12     // Catch:{ all -> 0x05f0 }
            if (r11 == r9) goto L_0x02a8
            int r11 = r11 + 1
            goto L_0x0290
        L_0x02a8:
            r5 = 0
            r2.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            h0.u.r$a<Key, Value> r5 = r10.e
            n0.a.k2.b r9 = r5.a
            r3.x = r10
            r3.y = r0
            r3.Y1 = r8
            r3.Z1 = r7
            r3.a2 = r2
            r3.b2 = r5
            r3.c2 = r9
            r3.d2 = r2
            r11 = 2
            r3.d = r11
            r11 = 0
            java.lang.Object r11 = r9.a(r11, r3)
            if (r11 != r4) goto L_0x02d0
            return r4
        L_0x02d0:
            r11 = r0
            r0 = r2
            r12 = r10
            r10 = r8
            r8 = r0
            r16 = r7
            r7 = r5
            r5 = r9
            r9 = r16
        L_0x02db:
            h0.u.r<Key, Value> r2 = r7.b     // Catch:{ all -> 0x05e3 }
            int r7 = r10.a     // Catch:{ all -> 0x05e3 }
            int r13 = r10.a(r11)     // Catch:{ all -> 0x05e3 }
            int r14 = r9.c     // Catch:{ all -> 0x05e3 }
            int r13 = r13 + r14
            java.lang.Object r7 = r12.g(r2, r11, r7, r13)     // Catch:{ all -> 0x05e3 }
            if (r7 == 0) goto L_0x030e
            r3.x = r12     // Catch:{ all -> 0x05e3 }
            r3.y = r11     // Catch:{ all -> 0x05e3 }
            r3.Y1 = r10     // Catch:{ all -> 0x05e3 }
            r3.Z1 = r9     // Catch:{ all -> 0x05e3 }
            r3.a2 = r8     // Catch:{ all -> 0x05e3 }
            r3.b2 = r5     // Catch:{ all -> 0x05e3 }
            r3.c2 = r7     // Catch:{ all -> 0x05e3 }
            r3.d2 = r0     // Catch:{ all -> 0x05e3 }
            r13 = 3
            r3.d = r13     // Catch:{ all -> 0x05e3 }
            java.lang.Object r2 = r12.i(r2, r11, r3)     // Catch:{ all -> 0x05e3 }
            if (r2 != r4) goto L_0x0306
            return r4
        L_0x0306:
            r16 = r7
            r7 = r5
            r5 = r16
        L_0x030b:
            r2 = r5
            r5 = r7
            goto L_0x030f
        L_0x030e:
            r2 = 0
        L_0x030f:
            r7 = 0
            r5.b(r7)
            r0.c = r2
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            r2 = 0
            r0.c = r2
        L_0x031d:
            T r2 = r8.c
            if (r2 == 0) goto L_0x05e0
            h0.u.x$a r2 = r12.f(r11, r2)
            h0.u.x<Key, Value> r5 = r12.i
            r3.x = r12
            r3.y = r11
            r3.Y1 = r10
            r3.Z1 = r9
            r3.a2 = r8
            r3.b2 = r0
            r3.c2 = r2
            r7 = 0
            r3.d2 = r7
            r3.e2 = r7
            r7 = 4
            r3.d = r7
            java.lang.Object r5 = r5.c(r2, r3)
            if (r5 != r4) goto L_0x0344
            return r4
        L_0x0344:
            r13 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r5
        L_0x034b:
            h0.u.x$b r2 = (h0.u.x.b) r2
            boolean r5 = r2 instanceof h0.u.x.b.C0069b
            if (r5 == 0) goto L_0x041b
            int r5 = r13.ordinal()
            r7 = 1
            if (r5 == r7) goto L_0x0367
            r7 = 2
            if (r5 != r7) goto L_0x0361
            r5 = r2
            h0.u.x$b$b r5 = (h0.u.x.b.C0069b) r5
            Key r5 = r5.c
            goto L_0x036c
        L_0x0361:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L_0x0367:
            r5 = r2
            h0.u.x$b$b r5 = (h0.u.x.b.C0069b) r5
            Key r5 = r5.b
        L_0x036c:
            h0.u.x<Key, Value> r7 = r9.i
            java.util.Objects.requireNonNull(r7)
            T r7 = r10.c
            boolean r5 = m0.n.b.i.a(r5, r7)
            r5 = r5 ^ 1
            if (r5 != 0) goto L_0x03b0
            androidx.paging.LoadType r0 = androidx.paging.LoadType.PREPEND
            if (r13 != r0) goto L_0x0382
            java.lang.String r0 = "prevKey"
            goto L_0x0384
        L_0x0382:
            java.lang.String r0 = "nextKey"
        L_0x0384:
            java.lang.String r2 = "The same value, "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            T r3 = r10.c
            r2.append(r3)
            java.lang.String r3 = ", was passed as the "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 1
            r3 = 0
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.Z(r0, r3, r2)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x03b0:
            h0.u.r$a<Key, Value> r5 = r9.e
            n0.a.k2.b r7 = r5.a
            r3.x = r9
            r3.y = r13
            r3.Y1 = r12
            r3.Z1 = r11
            r3.a2 = r10
            r3.b2 = r0
            r3.c2 = r8
            r3.d2 = r2
            r3.e2 = r5
            r3.f2 = r7
            r14 = 5
            r3.d = r14
            r14 = 0
            java.lang.Object r14 = r7.a(r14, r3)
            if (r14 != r4) goto L_0x03d3
            return r4
        L_0x03d3:
            r14 = r9
            r9 = r0
        L_0x03d5:
            h0.u.r<Key, Value> r0 = r5.b     // Catch:{ all -> 0x0415 }
            int r5 = r12.a     // Catch:{ all -> 0x0415 }
            r15 = r2
            h0.u.x$b$b r15 = (h0.u.x.b.C0069b) r15     // Catch:{ all -> 0x0415 }
            boolean r0 = r0.g(r5, r13, r15)     // Catch:{ all -> 0x0415 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0415 }
            r5 = 0
            r7.b(r5)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x03f0
            goto L_0x05e0
        L_0x03f0:
            int r0 = r11.c
            r5 = r2
            h0.u.x$b$b r5 = (h0.u.x.b.C0069b) r5
            java.util.List<Value> r7 = r5.a
            int r7 = r7.size()
            int r7 = r7 + r0
            r11.c = r7
            androidx.paging.LoadType r0 = androidx.paging.LoadType.PREPEND
            if (r13 != r0) goto L_0x0406
            Key r0 = r5.b
            if (r0 == 0) goto L_0x040e
        L_0x0406:
            androidx.paging.LoadType r0 = androidx.paging.LoadType.APPEND
            if (r13 != r0) goto L_0x0411
            Key r0 = r5.c
            if (r0 != 0) goto L_0x0411
        L_0x040e:
            r0 = 1
            r9.c = r0
        L_0x0411:
            r0 = r9
            r9 = r14
            goto L_0x0489
        L_0x0415:
            r0 = move-exception
            r2 = 0
            r7.b(r2)
            throw r0
        L_0x041b:
            boolean r5 = r2 instanceof h0.u.x.b.a
            if (r5 == 0) goto L_0x0489
            h0.u.r$a<Key, Value> r5 = r9.e
            n0.a.k2.b r0 = r5.a
            r3.x = r9
            r3.y = r13
            r3.Y1 = r12
            r3.Z1 = r2
            r3.a2 = r5
            r3.b2 = r0
            r6 = 0
            r3.c2 = r6
            r7 = 6
            r3.d = r7
            java.lang.Object r6 = r0.a(r6, r3)
            if (r6 != r4) goto L_0x043c
            return r4
        L_0x043c:
            r6 = r2
            r2 = r4
            r4 = r0
            r0 = r3
            r3 = r13
        L_0x0441:
            h0.u.r<Key, Value> r5 = r5.b     // Catch:{ all -> 0x0483 }
            h0.u.j$a r7 = new h0.u.j$a     // Catch:{ all -> 0x0483 }
            h0.u.x$b$a r6 = (h0.u.x.b.a) r6     // Catch:{ all -> 0x0483 }
            java.lang.Throwable r6 = r6.a     // Catch:{ all -> 0x0483 }
            r7.<init>(r6)     // Catch:{ all -> 0x0483 }
            boolean r6 = r5.j(r3, r7)     // Catch:{ all -> 0x0483 }
            if (r6 == 0) goto L_0x0475
            n0.a.f2.d<androidx.paging.PageEvent<Value>> r6 = r9.d     // Catch:{ all -> 0x0483 }
            androidx.paging.PageEvent$b r8 = new androidx.paging.PageEvent$b     // Catch:{ all -> 0x0483 }
            r9 = 0
            r8.<init>(r3, r9, r7)     // Catch:{ all -> 0x0483 }
            r0.x = r3     // Catch:{ all -> 0x0483 }
            r0.y = r12     // Catch:{ all -> 0x0483 }
            r0.Y1 = r4     // Catch:{ all -> 0x0483 }
            r0.Z1 = r5     // Catch:{ all -> 0x0483 }
            r7 = 0
            r0.a2 = r7     // Catch:{ all -> 0x0483 }
            r0.b2 = r7     // Catch:{ all -> 0x0483 }
            r7 = 7
            r0.d = r7     // Catch:{ all -> 0x0483 }
            java.lang.Object r0 = r6.t(r8, r0)     // Catch:{ all -> 0x0483 }
            if (r0 != r2) goto L_0x0471
            return r2
        L_0x0471:
            r0 = r5
            r5 = r12
        L_0x0473:
            r12 = r5
            r5 = r0
        L_0x0475:
            java.util.Map<androidx.paging.LoadType, h0.u.h0> r0 = r5.j     // Catch:{ all -> 0x0483 }
            h0.u.h0 r2 = r12.b     // Catch:{ all -> 0x0483 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0483 }
            m0.i r0 = m0.i.a     // Catch:{ all -> 0x0483 }
            r2 = 0
            r4.b(r2)
            return r0
        L_0x0483:
            r0 = move-exception
            r2 = 0
            r4.b(r2)
            throw r0
        L_0x0489:
            int r5 = r13.ordinal()
            r7 = 1
            if (r5 == r7) goto L_0x0493
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND
            goto L_0x0495
        L_0x0493:
            androidx.paging.LoadType r5 = androidx.paging.LoadType.APPEND
        L_0x0495:
            r7 = r5
            h0.u.r$a<Key, Value> r5 = r9.e
            n0.a.k2.b r14 = r5.a
            r3.x = r9
            r3.y = r13
            r3.Y1 = r12
            r3.Z1 = r11
            r3.a2 = r10
            r3.b2 = r0
            r3.c2 = r8
            r3.d2 = r2
            r3.e2 = r7
            r3.f2 = r5
            r3.g2 = r14
            r15 = 8
            r3.d = r15
            r15 = 0
            java.lang.Object r15 = r14.a(r15, r3)
            if (r15 != r4) goto L_0x04bc
            return r4
        L_0x04bc:
            r15 = r9
            r9 = r0
        L_0x04be:
            h0.u.r<Key, Value> r0 = r5.b     // Catch:{ all -> 0x05d8 }
            h0.u.h0 r5 = r12.b     // Catch:{ all -> 0x05d8 }
            androidx.paging.PageEvent$a r5 = r0.c(r7, r5)     // Catch:{ all -> 0x05d8 }
            if (r5 == 0) goto L_0x04fd
            r0.b(r5)     // Catch:{ all -> 0x05d8 }
            n0.a.f2.d<androidx.paging.PageEvent<Value>> r7 = r15.d     // Catch:{ all -> 0x05d8 }
            r3.x = r15     // Catch:{ all -> 0x05d8 }
            r3.y = r13     // Catch:{ all -> 0x05d8 }
            r3.Y1 = r12     // Catch:{ all -> 0x05d8 }
            r3.Z1 = r11     // Catch:{ all -> 0x05d8 }
            r3.a2 = r10     // Catch:{ all -> 0x05d8 }
            r3.b2 = r9     // Catch:{ all -> 0x05d8 }
            r3.c2 = r8     // Catch:{ all -> 0x05d8 }
            r3.d2 = r2     // Catch:{ all -> 0x05d8 }
            r3.e2 = r14     // Catch:{ all -> 0x05d8 }
            r3.f2 = r0     // Catch:{ all -> 0x05d8 }
            r18 = r0
            r0 = 0
            r3.g2 = r0     // Catch:{ all -> 0x04fa }
            r0 = 9
            r3.d = r0     // Catch:{ all -> 0x05d8 }
            java.lang.Object r0 = r7.t(r5, r3)     // Catch:{ all -> 0x05d8 }
            if (r0 != r4) goto L_0x04f1
            return r4
        L_0x04f1:
            r0 = r18
            r7 = r2
            r5 = r14
            r14 = r15
        L_0x04f6:
            r2 = r7
            r7 = r8
            r15 = r14
            goto L_0x0501
        L_0x04fa:
            r0 = move-exception
            goto L_0x05db
        L_0x04fd:
            r18 = r0
            r7 = r8
            r5 = r14
        L_0x0501:
            int r8 = r12.a     // Catch:{ all -> 0x05d6 }
            int r14 = r12.a(r13)     // Catch:{ all -> 0x05d6 }
            int r1 = r11.c     // Catch:{ all -> 0x05d6 }
            int r14 = r14 + r1
            java.lang.Object r1 = r15.g(r0, r13, r8, r14)     // Catch:{ all -> 0x05d6 }
            r10.c = r1     // Catch:{ all -> 0x05d6 }
            if (r1 != 0) goto L_0x0528
            h0.u.k r1 = r0.k     // Catch:{ all -> 0x05d6 }
            h0.u.j r1 = r1.b(r13)     // Catch:{ all -> 0x05d6 }
            boolean r1 = r1 instanceof h0.u.j.a     // Catch:{ all -> 0x05d6 }
            if (r1 != 0) goto L_0x0528
            boolean r1 = r9.c     // Catch:{ all -> 0x05d6 }
            if (r1 == 0) goto L_0x0523
            h0.u.j$c r1 = h0.u.j.c.b     // Catch:{ all -> 0x05d6 }
            goto L_0x0525
        L_0x0523:
            h0.u.j$c r1 = h0.u.j.c.c     // Catch:{ all -> 0x05d6 }
        L_0x0525:
            r0.j(r13, r1)     // Catch:{ all -> 0x05d6 }
        L_0x0528:
            r1 = r2
            h0.u.x$b$b r1 = (h0.u.x.b.C0069b) r1     // Catch:{ all -> 0x05d6 }
            androidx.paging.PageEvent r0 = r0.k(r1, r13)     // Catch:{ all -> 0x05d6 }
            n0.a.f2.d<androidx.paging.PageEvent<Value>> r1 = r15.d     // Catch:{ all -> 0x05d6 }
            r3.x = r15     // Catch:{ all -> 0x05d6 }
            r3.y = r13     // Catch:{ all -> 0x05d6 }
            r3.Y1 = r12     // Catch:{ all -> 0x05d6 }
            r3.Z1 = r11     // Catch:{ all -> 0x05d6 }
            r3.a2 = r10     // Catch:{ all -> 0x05d6 }
            r3.b2 = r9     // Catch:{ all -> 0x05d6 }
            r3.c2 = r7     // Catch:{ all -> 0x05d6 }
            r3.d2 = r2     // Catch:{ all -> 0x05d6 }
            r3.e2 = r5     // Catch:{ all -> 0x05d6 }
            r8 = 0
            r3.f2 = r8     // Catch:{ all -> 0x05d6 }
            r3.g2 = r8     // Catch:{ all -> 0x05d6 }
            r8 = 10
            r3.d = r8     // Catch:{ all -> 0x05d6 }
            java.lang.Object r0 = r1.t(r0, r3)     // Catch:{ all -> 0x05d6 }
            if (r0 != r4) goto L_0x0553
            return r4
        L_0x0553:
            r0 = 0
            r14 = r15
            r16 = r2
            r2 = r0
            r0 = r16
        L_0x055a:
            r5.b(r2)
            boolean r1 = r7 instanceof h0.u.x.a.b
            if (r1 == 0) goto L_0x056a
            r1 = r0
            h0.u.x$b$b r1 = (h0.u.x.b.C0069b) r1
            Key r1 = r1.b
            if (r1 != 0) goto L_0x056a
            r1 = 1
            goto L_0x056b
        L_0x056a:
            r1 = 0
        L_0x056b:
            r5 = r1
            boolean r1 = r7 instanceof h0.u.x.a.C0068a
            if (r1 == 0) goto L_0x0578
            h0.u.x$b$b r0 = (h0.u.x.b.C0069b) r0
            Key r0 = r0.c
            if (r0 != 0) goto L_0x0578
            r0 = 1
            goto L_0x0579
        L_0x0578:
            r0 = 0
        L_0x0579:
            h0.u.b0<Key, Value> r1 = r14.m
            if (r1 == 0) goto L_0x05c5
            if (r5 != 0) goto L_0x0581
            if (r0 == 0) goto L_0x05c5
        L_0x0581:
            h0.u.r$a<Key, Value> r8 = r14.e
            n0.a.k2.b r7 = r8.a
            r3.x = r14
            r3.y = r13
            r3.Y1 = r12
            r3.Z1 = r11
            r3.a2 = r10
            r3.b2 = r9
            r3.c2 = r8
            r3.d2 = r7
            r1 = 0
            r3.e2 = r1
            r3.h2 = r5
            r3.i2 = r0
            r2 = 11
            r3.d = r2
            java.lang.Object r1 = r7.a(r1, r3)
            if (r1 != r4) goto L_0x05a7
            return r4
        L_0x05a7:
            h0.u.r<Key, Value> r1 = r8.b     // Catch:{ all -> 0x05cc }
            h0.u.h0$a r2 = r14.b     // Catch:{ all -> 0x05cc }
            h0.u.y r1 = r1.a(r2)     // Catch:{ all -> 0x05cc }
            r2 = 0
            r7.b(r2)
            if (r5 == 0) goto L_0x05bc
            h0.u.b0<Key, Value> r2 = r14.m
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND
            r2.a(r5, r1)
        L_0x05bc:
            if (r0 == 0) goto L_0x05c5
            h0.u.b0<Key, Value> r0 = r14.m
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
            r0.a(r2, r1)
        L_0x05c5:
            r0 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            goto L_0x05d2
        L_0x05cc:
            r0 = move-exception
            r1 = 0
            r7.b(r1)
            throw r0
        L_0x05d2:
            r1 = r17
            goto L_0x031d
        L_0x05d6:
            r0 = move-exception
            goto L_0x05da
        L_0x05d8:
            r0 = move-exception
            r5 = r14
        L_0x05da:
            r14 = r5
        L_0x05db:
            r1 = 0
            r14.b(r1)
            throw r0
        L_0x05e0:
            m0.i r0 = m0.i.a
            return r0
        L_0x05e3:
            r0 = move-exception
            r7 = r5
        L_0x05e5:
            r1 = 0
            r7.b(r1)
            throw r0
        L_0x05ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05f0 }
            r0.<init>(r6)     // Catch:{ all -> 0x05f0 }
            throw r0     // Catch:{ all -> 0x05f0 }
        L_0x05f0:
            r0 = move-exception
            r1 = 0
            r2.b(r1)
            throw r0
        L_0x05f6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.e(androidx.paging.LoadType, h0.u.h, m0.l.c):java.lang.Object");
    }

    public final x.a<Key> f(LoadType loadType, Key key) {
        int i2 = loadType == LoadType.REFRESH ? this.j.d : this.j.a;
        boolean z = this.j.c;
        m0.n.b.i.e(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return new x.a.c(key, i2, z);
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            } else if (key != null) {
                return new x.a.C0068a(key, i2, z);
            } else {
                throw new IllegalArgumentException("key cannot be null for append".toString());
            }
        } else if (key != null) {
            return new x.a.b(key, i2, z);
        } else {
            throw new IllegalArgumentException("key cannot be null for prepend".toString());
        }
    }

    public final Key g(r<Key, Value> rVar, LoadType loadType, int i2, int i3) {
        int i4;
        Objects.requireNonNull(rVar);
        m0.n.b.i.e(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i4 = rVar.f;
            } else if (ordinal == 2) {
                i4 = rVar.g;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (i2 != i4 || (rVar.k.b(loadType) instanceof j.a) || i3 >= this.j.b) {
                return null;
            }
            if (loadType == LoadType.PREPEND) {
                return ((x.b.C0069b) m0.j.g.u(rVar.b)).b;
            }
            return ((x.b.C0069b) m0.j.g.G(rVar.b)).c;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    public final Object h(LoadType loadType, h0 h0Var, c<? super i> cVar) {
        if (loadType.ordinal() != 0) {
            if (h0Var != null) {
                this.a.d(h0Var);
            } else {
                throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
        } else {
            Object d2 = d(cVar);
            if (d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return d2;
            }
        }
        return i.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(h0.u.r<Key, Value> r6, androidx.paging.LoadType r7, m0.l.c<? super m0.i> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.paging.PageFetcherSnapshot$setLoading$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.paging.PageFetcherSnapshot$setLoading$1 r0 = (androidx.paging.PageFetcherSnapshot$setLoading$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.PageFetcherSnapshot$setLoading$1 r0 = new androidx.paging.PageFetcherSnapshot$setLoading$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r8)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            i0.j.f.p.h.d4(r8)
            h0.u.j$b r8 = h0.u.j.b.b
            boolean r6 = r6.j(r7, r8)
            if (r6 == 0) goto L_0x004b
            n0.a.f2.d<androidx.paging.PageEvent<Value>> r6 = r5.d
            androidx.paging.PageEvent$b r2 = new androidx.paging.PageEvent$b
            r4 = 0
            r2.<init>(r7, r4, r8)
            r0.d = r3
            java.lang.Object r6 = r6.t(r2, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            m0.i r6 = m0.i.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.i(h0.u.r, androidx.paging.LoadType, m0.l.c):java.lang.Object");
    }
}
