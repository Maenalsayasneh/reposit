package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.b.b3.b.e.k;
import m0.n.b.i;

/* compiled from: GetRecentPaymentsPagingSource.kt */
public final class GetRecentPaymentsPagingSource extends AbstractPagingSource<k> {
    public final ServerDataSource c;
    public final i0.e.a.a d;

    /* compiled from: GetRecentPaymentsPagingSource.kt */
    public interface a {
    }

    public GetRecentPaymentsPagingSource(ServerDataSource serverDataSource, i0.e.a.a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.c = serverDataSource;
        this.d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079 A[LOOP:0: B:17:0x0073->B:19:0x0079, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r6, int r7, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.k>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$1 r0 = (com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$1 r0 = new com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource r6 = (com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource) r6
            i0.j.f.p.h.d4(r8)
            goto L_0x004d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r5.c
            r0.c = r5
            r0.x = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$getRecentPayments$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getRecentPayments$2
            r2.<init>(r8, r6, r7, r3)
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r6 = r5
        L_0x004d:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$response$1 r7 = new com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$response$1
            r7.<init>(r6)
            com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$response$2 r0 = new com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource$query$response$2
            r0.<init>(r6)
            r8.b(r7, r0)
            java.lang.Object r6 = r8.a()
            com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse r6 = (com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse) r6
            java.util.List<com.clubhouse.android.data.models.local.payment.RecentPayment> r7 = r6.a
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = i0.j.f.p.h.K(r7, r0)
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L_0x0073:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()
            com.clubhouse.android.data.models.local.payment.RecentPayment r0 = (com.clubhouse.android.data.models.local.payment.RecentPayment) r0
            i0.e.b.b3.b.e.k r1 = new i0.e.b.b3.b.e.k
            r1.<init>(r0)
            r8.add(r1)
            goto L_0x0073
        L_0x0088:
            h0.u.x$b$b r7 = new h0.u.x$b$b
            java.lang.Integer r6 = r6.c
            r7.<init>(r8, r3, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
