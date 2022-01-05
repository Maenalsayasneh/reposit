package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;

/* compiled from: GetRecentSpeakersPagingSource.kt */
public final class GetRecentSpeakersPagingSource extends AbstractPagingSource<m> {
    public final ServerDataSource c;

    /* compiled from: GetRecentSpeakersPagingSource.kt */
    public interface a {
    }

    public GetRecentSpeakersPagingSource(ServerDataSource serverDataSource, i0.e.a.a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.c = serverDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[LOOP:0: B:16:0x005f->B:18:0x0065, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r12, int r13, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.m>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource$query$1 r0 = (com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource$query$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource$query$1 r0 = new com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource$query$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            i0.j.f.p.h.d4(r14)
            goto L_0x0046
        L_0x0028:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0030:
            i0.j.f.p.h.d4(r14)
            com.clubhouse.android.data.network.ServerDataSource r14 = r11.c
            r0.q = r4
            java.util.Objects.requireNonNull(r14)
            com.clubhouse.android.data.network.ServerDataSource$getRecentSpeakers$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getRecentSpeakers$2
            r2.<init>(r14, r12, r13, r3)
            java.lang.Object r14 = r14.a(r2, r0)
            if (r14 != r1) goto L_0x0046
            return r1
        L_0x0046:
            com.clubhouse.android.shared.Result r14 = (com.clubhouse.android.shared.Result) r14
            java.lang.Object r12 = r14.a()
            com.clubhouse.android.data.models.remote.response.PaginatedUsersInListResponse r12 = (com.clubhouse.android.data.models.remote.response.PaginatedUsersInListResponse) r12
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r13 = r12.a
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = i0.j.f.p.h.K(r13, r0)
            r14.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L_0x005f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r13.next()
            r5 = r0
            com.clubhouse.android.data.models.local.user.UserInList r5 = (com.clubhouse.android.data.models.local.user.UserInList) r5
            i0.e.b.b3.b.e.m r0 = new i0.e.b.b3.b.e.m
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 30
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r14.add(r0)
            goto L_0x005f
        L_0x007c:
            java.lang.Integer r12 = r12.c
            h0.u.x$b$b r13 = new h0.u.x$b$b
            r13.<init>(r14, r3, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
