package androidx.paging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", l = {142, 180}, m = "invokeSuspend")
/* compiled from: PagingDataDiffer.kt */
public final class PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public Object d;
    public int q;
    public final /* synthetic */ PageEvent x;
    public final /* synthetic */ PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1(PageEvent pageEvent, m0.l.c cVar, PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1) {
        super(2, cVar);
        this.x = pageEvent;
        this.y = pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1(this.x, cVar, this.y);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1(this.x, cVar, this.y).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.q
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            i0.j.f.p.h.d4(r14)
            goto L_0x0116
        L_0x0012:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001a:
            java.lang.Object r0 = r13.d
            kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref$BooleanRef) r0
            java.lang.Object r1 = r13.c
            h0.u.s r1 = (h0.u.s) r1
            i0.j.f.p.h.d4(r14)
            goto L_0x0075
        L_0x0026:
            i0.j.f.p.h.d4(r14)
            androidx.paging.PageEvent r14 = r13.x
            boolean r1 = r14 instanceof androidx.paging.PageEvent.Insert
            if (r1 == 0) goto L_0x00ff
            androidx.paging.PageEvent$Insert r14 = (androidx.paging.PageEvent.Insert) r14
            androidx.paging.LoadType r14 = r14.c
            androidx.paging.LoadType r1 = androidx.paging.LoadType.REFRESH
            if (r14 != r1) goto L_0x00ff
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            r14.f = r4
            h0.u.s r1 = new h0.u.s
            androidx.paging.PageEvent r14 = r13.x
            androidx.paging.PageEvent$Insert r14 = (androidx.paging.PageEvent.Insert) r14
            r1.<init>(r14)
            kotlin.jvm.internal.Ref$BooleanRef r14 = new kotlin.jvm.internal.Ref$BooleanRef
            r14.<init>()
            r14.c = r4
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r4 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r4 = r4.c
            androidx.paging.PagingDataDiffer r5 = r4.d
            h0.u.s<T> r6 = r5.a
            androidx.paging.PageEvent r4 = r13.x
            androidx.paging.PageEvent$Insert r4 = (androidx.paging.PageEvent.Insert) r4
            h0.u.b r8 = r4.g
            int r9 = r5.g
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1$1 r10 = new androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1$1
            r10.<init>(r13, r1, r14)
            r13.c = r1
            r13.d = r14
            r13.q = r3
            r7 = r1
            r11 = r13
            java.lang.Object r3 = r5.b(r6, r7, r8, r9, r10, r11)
            if (r3 != r0) goto L_0x0073
            return r0
        L_0x0073:
            r0 = r14
            r14 = r3
        L_0x0075:
            java.lang.Integer r14 = (java.lang.Integer) r14
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x00f3
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.c
            androidx.paging.PagingDataDiffer r0 = r0.d
            androidx.paging.PageEvent r3 = r13.x
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent.Insert) r3
            h0.u.b r3 = r3.g
            h0.u.m r4 = r0.c
            h0.u.b r4 = r4.e()
            boolean r4 = m0.n.b.i.a(r4, r3)
            if (r4 == 0) goto L_0x0094
            goto L_0x00af
        L_0x0094:
            h0.u.m r4 = r0.c
            r4.c(r3)
            java.util.concurrent.CopyOnWriteArrayList<m0.n.a.l<h0.u.b, m0.i>> r0 = r0.d
            java.util.Iterator r0 = r0.iterator()
        L_0x009f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00af
            java.lang.Object r4 = r0.next()
            m0.n.a.l r4 = (m0.n.a.l) r4
            r4.invoke(r3)
            goto L_0x009f
        L_0x00af:
            if (r14 != 0) goto L_0x00d0
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            h0.u.g0 r14 = r14.b
            if (r14 == 0) goto L_0x0372
            int r0 = r1.d
            h0.u.h0$b r3 = new h0.u.h0$b
            int r0 = r0 / r2
            int r2 = r1.i()
            int r1 = r1.j()
            r3.<init>(r0, r0, r2, r1)
            r14.a(r3)
            goto L_0x0372
        L_0x00d0:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.c
            androidx.paging.PagingDataDiffer r0 = r0.d
            int r2 = r14.intValue()
            r0.g = r2
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.c
            androidx.paging.PagingDataDiffer r0 = r0.d
            h0.u.g0 r0 = r0.b
            if (r0 == 0) goto L_0x0372
            int r14 = r14.intValue()
            h0.u.h0$a r14 = r1.f(r14)
            r0.a(r14)
            goto L_0x0372
        L_0x00f3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106"
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x00ff:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r14 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r14
            androidx.paging.AsyncPagingDataDiffer r14 = r14.l
            boolean r14 = r14.b
            if (r14 == 0) goto L_0x0116
            r13.q = r2
            java.lang.Object r14 = n0.a.i.c(r13)
            if (r14 != r0) goto L_0x0116
            return r0
        L_0x0116:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            h0.u.s<T> r0 = r14.a
            androidx.paging.PageEvent r1 = r13.x
            androidx.paging.PagingDataDiffer$a r14 = r14.h
            java.util.Objects.requireNonNull(r0)
            java.lang.String r5 = "pageEvent"
            m0.n.b.i.e(r1, r5)
            java.lang.String r5 = "callback"
            m0.n.b.i.e(r14, r5)
            boolean r5 = r1 instanceof androidx.paging.PageEvent.Insert
            if (r5 == 0) goto L_0x020a
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent.Insert) r1
            java.util.List<h0.u.f0<T>> r5 = r1.d
            int r5 = r0.h(r5)
            int r6 = r0.e()
            androidx.paging.LoadType r7 = r1.c
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x0204
            if (r7 == r3) goto L_0x0192
            if (r7 == r2) goto L_0x014d
            goto L_0x01c5
        L_0x014d:
            int r2 = r0.f
            int r2 = java.lang.Math.min(r2, r5)
            int r7 = r0.e
            int r8 = r0.d
            int r7 = r7 + r8
            int r8 = r5 - r2
            int r9 = r7 + r2
            java.util.List<h0.u.f0<T>> r10 = r0.c
            int r11 = r10.size()
            java.util.List<h0.u.f0<T>> r12 = r1.d
            r10.addAll(r11, r12)
            int r10 = r0.d
            int r10 = r10 + r5
            r0.d = r10
            int r5 = r1.f
            r0.f = r5
            r14.b(r7, r2)
            r14.c(r9, r8)
            int r2 = r0.e()
            int r2 = r2 - r6
            int r2 = r2 - r8
            if (r2 <= 0) goto L_0x0187
            int r0 = r0.e()
            int r0 = r0 - r2
            r14.c(r0, r2)
            goto L_0x01c5
        L_0x0187:
            if (r2 >= 0) goto L_0x01c5
            int r0 = r0.e()
            int r2 = -r2
            r14.d(r0, r2)
            goto L_0x01c5
        L_0x0192:
            int r2 = r0.e
            int r2 = java.lang.Math.min(r2, r5)
            int r7 = r0.e
            int r7 = r7 - r2
            int r8 = r5 - r2
            java.util.List<h0.u.f0<T>> r9 = r0.c
            java.util.List<h0.u.f0<T>> r10 = r1.d
            r9.addAll(r4, r10)
            int r9 = r0.d
            int r9 = r9 + r5
            r0.d = r9
            int r5 = r1.e
            r0.e = r5
            r14.b(r7, r2)
            r14.c(r4, r8)
            int r0 = r0.e()
            int r0 = r0 - r6
            int r0 = r0 - r8
            if (r0 <= 0) goto L_0x01bf
            r14.c(r4, r0)
            goto L_0x01c5
        L_0x01bf:
            if (r0 >= 0) goto L_0x01c5
            int r0 = -r0
            r14.d(r4, r0)
        L_0x01c5:
            h0.u.b r0 = r1.g
            androidx.paging.PagePresenter$insertPage$1 r1 = new androidx.paging.PagePresenter$insertPage$1
            r1.<init>(r14)
            java.util.Objects.requireNonNull(r0)
            java.lang.String r14 = "op"
            m0.n.b.i.e(r1, r14)
            h0.u.k r14 = r0.d
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            h0.u.j r5 = r14.c
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r1.invoke(r2, r6, r5)
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND
            h0.u.j r7 = r14.d
            r1.invoke(r5, r6, r7)
            androidx.paging.LoadType r7 = androidx.paging.LoadType.APPEND
            h0.u.j r14 = r14.e
            r1.invoke(r7, r6, r14)
            h0.u.k r14 = r0.e
            if (r14 == 0) goto L_0x02b0
            h0.u.j r0 = r14.c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r1.invoke(r2, r6, r0)
            h0.u.j r0 = r14.d
            r1.invoke(r5, r6, r0)
            h0.u.j r14 = r14.e
            r1.invoke(r7, r6, r14)
            goto L_0x02b0
        L_0x0204:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L_0x020a:
            boolean r2 = r1 instanceof androidx.paging.PageEvent.a
            if (r2 == 0) goto L_0x02a1
            androidx.paging.PageEvent$a r1 = (androidx.paging.PageEvent.a) r1
            int r2 = r0.e()
            androidx.paging.LoadType r5 = r1.a
            androidx.paging.LoadType r6 = androidx.paging.LoadType.PREPEND
            if (r5 != r6) goto L_0x0256
            int r5 = r0.e
            int r7 = r1.b
            m0.q.e r8 = new m0.q.e
            int r9 = r1.c
            r8.<init>(r7, r9)
            int r7 = r0.g(r8)
            int r8 = r0.d
            int r8 = r8 - r7
            r0.d = r8
            int r7 = r1.d
            r0.e = r7
            int r0 = r0.e()
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x023d
            r14.c(r4, r0)
            goto L_0x0243
        L_0x023d:
            if (r0 >= 0) goto L_0x0243
            int r2 = -r0
            r14.d(r4, r2)
        L_0x0243:
            int r5 = r5 + r0
            int r0 = java.lang.Math.max(r4, r5)
            int r1 = r1.d
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0250
            r14.b(r0, r1)
        L_0x0250:
            h0.u.j$c r0 = h0.u.j.c.c
            r14.a(r6, r4, r0)
            goto L_0x02b0
        L_0x0256:
            int r5 = r0.f
            int r6 = r1.b
            m0.q.e r7 = new m0.q.e
            int r8 = r1.c
            r7.<init>(r6, r8)
            int r6 = r0.g(r7)
            int r7 = r0.d
            int r7 = r7 - r6
            r0.d = r7
            int r6 = r1.d
            r0.f = r6
            int r6 = r0.e()
            int r6 = r6 - r2
            if (r6 <= 0) goto L_0x0279
            r14.c(r2, r6)
            goto L_0x0280
        L_0x0279:
            if (r6 >= 0) goto L_0x0280
            int r2 = r2 + r6
            int r7 = -r6
            r14.d(r2, r7)
        L_0x0280:
            if (r6 >= 0) goto L_0x0288
            int r2 = -r6
            int r2 = java.lang.Math.min(r5, r2)
            goto L_0x0289
        L_0x0288:
            r2 = r4
        L_0x0289:
            int r6 = r1.d
            int r5 = r5 - r2
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x0299
            int r0 = r0.e()
            int r1 = r1.d
            int r0 = r0 - r1
            r14.b(r0, r6)
        L_0x0299:
            androidx.paging.LoadType r0 = androidx.paging.LoadType.APPEND
            h0.u.j$c r1 = h0.u.j.c.c
            r14.a(r0, r4, r1)
            goto L_0x02b0
        L_0x02a1:
            boolean r0 = r1 instanceof androidx.paging.PageEvent.b
            if (r0 == 0) goto L_0x02b0
            androidx.paging.PageEvent$b r1 = (androidx.paging.PageEvent.b) r1
            androidx.paging.LoadType r0 = r1.a
            boolean r2 = r1.b
            h0.u.j r1 = r1.c
            r14.a(r0, r2, r1)
        L_0x02b0:
            androidx.paging.PageEvent r14 = r13.x
            boolean r14 = r14 instanceof androidx.paging.PageEvent.a
            if (r14 == 0) goto L_0x02be
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            r14.f = r4
        L_0x02be:
            androidx.paging.PageEvent r14 = r13.x
            boolean r0 = r14 instanceof androidx.paging.PageEvent.Insert
            if (r0 == 0) goto L_0x0372
            androidx.paging.PageEvent$Insert r14 = (androidx.paging.PageEvent.Insert) r14
            h0.u.b r0 = r14.g
            h0.u.j r1 = r0.b
            boolean r1 = r1.a
            h0.u.j r0 = r0.c
            boolean r0 = r0.a
            androidx.paging.LoadType r2 = r14.c
            androidx.paging.LoadType r5 = androidx.paging.LoadType.PREPEND
            if (r2 != r5) goto L_0x02d8
            if (r1 != 0) goto L_0x02df
        L_0x02d8:
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            if (r2 != r1) goto L_0x02e1
            if (r0 != 0) goto L_0x02df
            goto L_0x02e1
        L_0x02df:
            r0 = r4
            goto L_0x02e2
        L_0x02e1:
            r0 = r3
        L_0x02e2:
            java.util.List<h0.u.f0<T>> r14 = r14.d
            boolean r1 = r14 instanceof java.util.Collection
            if (r1 == 0) goto L_0x02ef
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x02ef
            goto L_0x0311
        L_0x02ef:
            java.util.Iterator r14 = r14.iterator()
        L_0x02f3:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0311
            java.lang.Object r1 = r14.next()
            h0.u.f0 r1 = (h0.u.f0) r1
            java.util.List<T> r1 = r1.d
            boolean r1 = r1.isEmpty()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x02f3
            r14 = r4
            goto L_0x0312
        L_0x0311:
            r14 = r3
        L_0x0312:
            if (r0 != 0) goto L_0x031d
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            r14.f = r4
            goto L_0x0372
        L_0x031d:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.c
            androidx.paging.PagingDataDiffer r0 = r0.d
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0329
            if (r14 == 0) goto L_0x0372
        L_0x0329:
            if (r14 != 0) goto L_0x0352
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            int r14 = r14.g
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.c
            androidx.paging.PagingDataDiffer r0 = r0.d
            h0.u.s<T> r1 = r0.a
            int r1 = r1.e
            if (r14 < r1) goto L_0x0352
            int r14 = r0.g
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r0 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r0 = r0.c
            androidx.paging.PagingDataDiffer r0 = r0.d
            h0.u.s<T> r0 = r0.a
            int r1 = r0.e
            int r0 = r0.d
            int r1 = r1 + r0
            if (r14 <= r1) goto L_0x0351
            goto L_0x0352
        L_0x0351:
            r3 = r4
        L_0x0352:
            if (r3 == 0) goto L_0x036a
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            h0.u.g0 r0 = r14.b
            if (r0 == 0) goto L_0x0372
            h0.u.s<T> r1 = r14.a
            int r14 = r14.g
            h0.u.h0$a r14 = r1.f(r14)
            r0.a(r14)
            goto L_0x0372
        L_0x036a:
            androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 r14 = r13.y
            androidx.paging.PagingDataDiffer$collectFrom$2 r14 = r14.c
            androidx.paging.PagingDataDiffer r14 = r14.d
            r14.f = r4
        L_0x0372:
            m0.i r14 = m0.i.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
