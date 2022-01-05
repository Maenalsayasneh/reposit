package com.clubhouse.android.data.network.paging;

import h0.u.x;
import h0.u.y;
import m0.l.c;
import m0.n.b.i;

/* compiled from: AbstractPagingSource.kt */
public abstract class AbstractPagingSource<T> extends x<Integer, T> {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object d(com.clubhouse.android.data.network.paging.AbstractPagingSource r4, h0.u.x.a r5, m0.l.c r6) {
        /*
            boolean r0 = r6 instanceof com.clubhouse.android.data.network.paging.AbstractPagingSource$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.network.paging.AbstractPagingSource$load$1 r0 = (com.clubhouse.android.data.network.paging.AbstractPagingSource$load$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.AbstractPagingSource$load$1 r0 = new com.clubhouse.android.data.network.paging.AbstractPagingSource$load$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r6)     // Catch:{ Exception -> 0x0027 }
            goto L_0x004d
        L_0x0027:
            r4 = move-exception
            goto L_0x0050
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r6)
            java.lang.Object r6 = r5.a()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L_0x003e
            r6 = r3
            goto L_0x0042
        L_0x003e:
            int r6 = r6.intValue()
        L_0x0042:
            int r5 = r5.a
            r0.q = r3     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r6 = r4.e(r6, r5, r0)     // Catch:{ Exception -> 0x0027 }
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            h0.u.x$b r6 = (h0.u.x.b) r6     // Catch:{ Exception -> 0x0027 }
            goto L_0x005a
        L_0x0050:
            v0.a.a$b r5 = v0.a.a.d
            r5.w(r4)
            h0.u.x$b$a r6 = new h0.u.x$b$a
            r6.<init>(r4)
        L_0x005a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.AbstractPagingSource.d(com.clubhouse.android.data.network.paging.AbstractPagingSource, h0.u.x$a, m0.l.c):java.lang.Object");
    }

    public Object b(y yVar) {
        i.e(yVar, "state");
        return 1;
    }

    public Object c(x.a<Integer> aVar, c<? super x.b<Integer, T>> cVar) {
        return d(this, aVar, cVar);
    }

    public abstract Object e(int i, int i2, c<? super x.b<Integer, T>> cVar) throws Exception;
}
