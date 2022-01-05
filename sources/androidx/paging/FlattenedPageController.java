package androidx.paging;

import h0.u.f;
import java.util.List;
import kotlin.collections.EmptyList;
import n0.a.k2.b;
import n0.a.k2.d;

/* compiled from: CachedPageEventFlow.kt */
public final class FlattenedPageController<T> {
    public final f<T> a = new f<>();
    public List<TemporaryDownstream<T>> b = EmptyList.c;
    public final b c = d.a(false, 1);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[Catch:{ all -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super androidx.paging.TemporaryDownstream<T>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.paging.FlattenedPageController$createTemporaryDownstream$1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.paging.FlattenedPageController$createTemporaryDownstream$1 r0 = (androidx.paging.FlattenedPageController$createTemporaryDownstream$1) r0
            int r2 = r0.d
            r3 = r2 & r1
            if (r3 == 0) goto L_0x0013
            int r2 = r2 - r1
            r0.d = r2
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlattenedPageController$createTemporaryDownstream$1 r0 = new androidx.paging.FlattenedPageController$createTemporaryDownstream$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.d
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0052
            if (r3 == r6) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            int r3 = r0.a2
            java.lang.Object r6 = r0.Z1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.Y1
            androidx.paging.TemporaryDownstream r7 = (androidx.paging.TemporaryDownstream) r7
            java.lang.Object r8 = r0.y
            androidx.paging.TemporaryDownstream r8 = (androidx.paging.TemporaryDownstream) r8
            java.lang.Object r9 = r0.x
            n0.a.k2.b r9 = (n0.a.k2.b) r9
            i0.j.f.p.h.d4(r13)     // Catch:{ all -> 0x00b1 }
            goto L_0x0079
        L_0x003d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0045:
            java.lang.Object r3 = r0.y
            n0.a.k2.b r3 = (n0.a.k2.b) r3
            java.lang.Object r6 = r0.x
            androidx.paging.FlattenedPageController r6 = (androidx.paging.FlattenedPageController) r6
            i0.j.f.p.h.d4(r13)
            r9 = r3
            goto L_0x0066
        L_0x0052:
            i0.j.f.p.h.d4(r13)
            n0.a.k2.b r13 = r12.c
            r0.x = r12
            r0.y = r13
            r0.d = r6
            java.lang.Object r3 = r13.a(r5, r0)
            if (r3 != r2) goto L_0x0064
            return r2
        L_0x0064:
            r6 = r12
            r9 = r13
        L_0x0066:
            androidx.paging.TemporaryDownstream r7 = new androidx.paging.TemporaryDownstream     // Catch:{ all -> 0x00b1 }
            r7.<init>()     // Catch:{ all -> 0x00b1 }
            h0.u.f<T> r13 = r6.a     // Catch:{ all -> 0x00b1 }
            java.util.List r13 = r13.b()     // Catch:{ all -> 0x00b1 }
            r3 = 0
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x00b1 }
            java.util.Iterator r6 = r13.iterator()     // Catch:{ all -> 0x00b1 }
            r8 = r7
        L_0x0079:
            boolean r13 = r6.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r13 == 0) goto L_0x00b3
            java.lang.Object r13 = r6.next()     // Catch:{ all -> 0x00b1 }
            int r10 = r3 + 1
            if (r3 < 0) goto L_0x00ad
            java.lang.Integer r11 = new java.lang.Integer     // Catch:{ all -> 0x00b1 }
            r11.<init>(r3)     // Catch:{ all -> 0x00b1 }
            androidx.paging.PageEvent r13 = (androidx.paging.PageEvent) r13     // Catch:{ all -> 0x00b1 }
            int r3 = r11.intValue()     // Catch:{ all -> 0x00b1 }
            m0.j.l r11 = new m0.j.l     // Catch:{ all -> 0x00b1 }
            int r3 = r3 + r1
            r11.<init>(r3, r13)     // Catch:{ all -> 0x00b1 }
            r0.x = r9     // Catch:{ all -> 0x00b1 }
            r0.y = r8     // Catch:{ all -> 0x00b1 }
            r0.Y1 = r7     // Catch:{ all -> 0x00b1 }
            r0.Z1 = r6     // Catch:{ all -> 0x00b1 }
            r0.a2 = r10     // Catch:{ all -> 0x00b1 }
            r0.d = r4     // Catch:{ all -> 0x00b1 }
            java.lang.Object r13 = r7.a(r11, r0)     // Catch:{ all -> 0x00b1 }
            if (r13 != r2) goto L_0x00ab
            return r2
        L_0x00ab:
            r3 = r10
            goto L_0x0079
        L_0x00ad:
            m0.j.g.r0()     // Catch:{ all -> 0x00b1 }
            throw r5     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r13 = move-exception
            goto L_0x00b7
        L_0x00b3:
            r9.b(r5)
            return r8
        L_0x00b7:
            r9.b(r5)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.a(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(m0.j.l<? extends androidx.paging.PageEvent<T>> r10, m0.l.c<? super m0.i> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.paging.FlattenedPageController$record$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController$record$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005f
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r10 = r0.b2
            java.lang.Object r2 = r0.a2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.Z1
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r6 = r0.Y1
            androidx.paging.FlattenedPageController r6 = (androidx.paging.FlattenedPageController) r6
            java.lang.Object r7 = r0.y
            n0.a.k2.b r7 = (n0.a.k2.b) r7
            java.lang.Object r8 = r0.x
            m0.j.l r8 = (m0.j.l) r8
            i0.j.f.p.h.d4(r11)     // Catch:{ all -> 0x0042 }
            goto L_0x00af
        L_0x0042:
            r10 = move-exception
            goto L_0x00cd
        L_0x0045:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004d:
            java.lang.Object r10 = r0.Y1
            n0.a.k2.b r10 = (n0.a.k2.b) r10
            java.lang.Object r2 = r0.y
            m0.j.l r2 = (m0.j.l) r2
            java.lang.Object r4 = r0.x
            androidx.paging.FlattenedPageController r4 = (androidx.paging.FlattenedPageController) r4
            i0.j.f.p.h.d4(r11)
            r7 = r10
            r10 = r2
            goto L_0x0075
        L_0x005f:
            i0.j.f.p.h.d4(r11)
            n0.a.k2.b r11 = r9.c
            r0.x = r9
            r0.y = r10
            r0.Y1 = r11
            r0.d = r4
            java.lang.Object r2 = r11.a(r5, r0)
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r4 = r9
            r7 = r11
        L_0x0075:
            h0.u.f<T> r11 = r4.a     // Catch:{ all -> 0x0042 }
            T r2 = r10.b     // Catch:{ all -> 0x0042 }
            androidx.paging.PageEvent r2 = (androidx.paging.PageEvent) r2     // Catch:{ all -> 0x0042 }
            r11.a(r2)     // Catch:{ all -> 0x0042 }
            java.util.List<androidx.paging.TemporaryDownstream<T>> r11 = r4.b     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0042 }
            r8 = r10
            r6 = r4
            r4 = r2
            r2 = r11
        L_0x008d:
            boolean r10 = r2.hasNext()     // Catch:{ all -> 0x0042 }
            if (r10 == 0) goto L_0x00c3
            java.lang.Object r10 = r2.next()     // Catch:{ all -> 0x0042 }
            r11 = r10
            androidx.paging.TemporaryDownstream r11 = (androidx.paging.TemporaryDownstream) r11     // Catch:{ all -> 0x0042 }
            r0.x = r8     // Catch:{ all -> 0x0042 }
            r0.y = r7     // Catch:{ all -> 0x0042 }
            r0.Y1 = r6     // Catch:{ all -> 0x0042 }
            r0.Z1 = r4     // Catch:{ all -> 0x0042 }
            r0.a2 = r2     // Catch:{ all -> 0x0042 }
            r0.b2 = r10     // Catch:{ all -> 0x0042 }
            r0.d = r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r11 = r11.a(r8, r0)     // Catch:{ all -> 0x0042 }
            if (r11 != r1) goto L_0x00af
            return r1
        L_0x00af:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0042 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0042 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0042 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r11 == 0) goto L_0x008d
            r4.add(r10)     // Catch:{ all -> 0x0042 }
            goto L_0x008d
        L_0x00c3:
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0042 }
            r6.b = r4     // Catch:{ all -> 0x0042 }
            m0.i r10 = m0.i.a     // Catch:{ all -> 0x0042 }
            r7.b(r5)
            return r10
        L_0x00cd:
            r7.b(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.b(m0.j.l, m0.l.c):java.lang.Object");
    }
}
