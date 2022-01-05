package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.b.b3.b.e.j;
import m0.n.b.i;

/* compiled from: GetMutualFollowsPagingSource.kt */
public final class GetMutualFollowsPagingSource extends AbstractPagingSource<j> {
    public final int c;
    public final ServerDataSource d;
    public final i0.e.a.a e;

    /* compiled from: GetMutualFollowsPagingSource.kt */
    public interface a {
    }

    public GetMutualFollowsPagingSource(int i, ServerDataSource serverDataSource, i0.e.a.a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.c = i;
        this.d = serverDataSource;
        this.e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f A[LOOP:0: B:17:0x0079->B:19:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r10, int r11, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.j>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$1 r0 = (com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$1 r0 = new com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r10 = r0.c
            com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource r10 = (com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource) r10
            i0.j.f.p.h.d4(r12)
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            i0.j.f.p.h.d4(r12)
            com.clubhouse.android.data.network.ServerDataSource r12 = r9.d
            int r4 = r9.c
            r0.c = r9
            r0.x = r3
            java.util.Objects.requireNonNull(r12)
            com.clubhouse.android.data.network.ServerDataSource$getMutualFollows$2 r8 = new com.clubhouse.android.data.network.ServerDataSource$getMutualFollows$2
            r7 = 0
            r2 = r8
            r3 = r12
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r12 = r12.a(r8, r0)
            if (r12 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r10 = r9
        L_0x0053:
            com.clubhouse.android.shared.Result r12 = (com.clubhouse.android.shared.Result) r12
            com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$response$1 r11 = new com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$response$1
            r11.<init>(r10)
            com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$response$2 r0 = new com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource$query$response$2
            r0.<init>(r10)
            r12.b(r11, r0)
            java.lang.Object r10 = r12.a()
            com.clubhouse.android.data.models.remote.response.GetMutualFollowsResponse r10 = (com.clubhouse.android.data.models.remote.response.GetMutualFollowsResponse) r10
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r11 = r10.a
            java.util.ArrayList r12 = new java.util.ArrayList
            r0 = 10
            int r0 = i0.j.f.p.h.K(r11, r0)
            r12.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0079:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r11.next()
            r2 = r0
            com.clubhouse.android.data.models.local.user.UserInList r2 = (com.clubhouse.android.data.models.local.user.UserInList) r2
            i0.e.b.b3.b.e.m r0 = new i0.e.b.b3.b.e.m
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.add(r0)
            goto L_0x0079
        L_0x0096:
            r11 = 0
            java.lang.Integer r10 = r10.c
            h0.u.x$b$b r0 = new h0.u.x$b$b
            r0.<init>(r12, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
