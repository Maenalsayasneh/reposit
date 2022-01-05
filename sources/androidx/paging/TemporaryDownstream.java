package androidx.paging;

import kotlinx.coroutines.channels.BufferOverflow;
import m0.j.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.d;

/* compiled from: CachedPageEventFlow.kt */
public final class TemporaryDownstream<T> {
    public final d<l<PageEvent<T>>> a = a.d(Integer.MAX_VALUE, (BufferOverflow) null, (m0.n.a.l) null, 6);

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.j.l<? extends androidx.paging.PageEvent<T>> r5, m0.l.c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.TemporaryDownstream$send$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.paging.TemporaryDownstream$send$1 r0 = (androidx.paging.TemporaryDownstream$send$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.TemporaryDownstream$send$1 r0 = new androidx.paging.TemporaryDownstream$send$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r6)     // Catch:{ ClosedSendChannelException -> 0x003d }
            goto L_0x003e
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r6)
            n0.a.f2.d<m0.j.l<androidx.paging.PageEvent<T>>> r6 = r4.a     // Catch:{ ClosedSendChannelException -> 0x003d }
            r0.d = r3     // Catch:{ ClosedSendChannelException -> 0x003d }
            java.lang.Object r5 = r6.t(r5, r0)     // Catch:{ ClosedSendChannelException -> 0x003d }
            if (r5 != r1) goto L_0x003e
            return r1
        L_0x003d:
            r3 = 0
        L_0x003e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.TemporaryDownstream.a(m0.j.l, m0.l.c):java.lang.Object");
    }
}
