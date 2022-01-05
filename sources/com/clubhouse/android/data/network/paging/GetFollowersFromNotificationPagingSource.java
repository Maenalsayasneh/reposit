package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.b.b3.b.e.j;
import m0.n.b.i;

/* compiled from: GetFollowersFromNotificationPagingSource.kt */
public final class GetFollowersFromNotificationPagingSource extends AbstractPagingSource<j> {
    public final long c;
    public final ServerDataSource d;
    public final i0.e.a.a e;

    /* compiled from: GetFollowersFromNotificationPagingSource.kt */
    public interface a {
    }

    public GetFollowersFromNotificationPagingSource(long j, ServerDataSource serverDataSource, i0.e.a.a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.c = j;
        this.d = serverDataSource;
        this.e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f A[LOOP:0: B:17:0x0079->B:19:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r11, int r12, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.j>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$1 r0 = (com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$1 r0 = new com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r11 = r0.c
            com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource r11 = (com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource) r11
            i0.j.f.p.h.d4(r13)
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0033:
            i0.j.f.p.h.d4(r13)
            com.clubhouse.android.data.network.ServerDataSource r13 = r10.d
            long r4 = r10.c
            r0.c = r10
            r0.x = r3
            java.util.Objects.requireNonNull(r13)
            com.clubhouse.android.data.network.ServerDataSource$getFollowersFromNotification$2 r9 = new com.clubhouse.android.data.network.ServerDataSource$getFollowersFromNotification$2
            r8 = 0
            r2 = r9
            r3 = r13
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r6, r7, r8)
            java.lang.Object r13 = r13.a(r9, r0)
            if (r13 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r11 = r10
        L_0x0053:
            com.clubhouse.android.shared.Result r13 = (com.clubhouse.android.shared.Result) r13
            com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$response$1 r12 = new com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$response$1
            r12.<init>(r11)
            com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$response$2 r0 = new com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource$query$response$2
            r0.<init>(r11)
            r13.b(r12, r0)
            java.lang.Object r11 = r13.a()
            com.clubhouse.android.data.models.remote.response.GetFollowersResponse r11 = (com.clubhouse.android.data.models.remote.response.GetFollowersResponse) r11
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r12 = r11.a
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = i0.j.f.p.h.K(r12, r0)
            r13.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0079:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r12.next()
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
            r13.add(r0)
            goto L_0x0079
        L_0x0096:
            r12 = 0
            java.lang.Integer r11 = r11.c
            h0.u.x$b$b r0 = new h0.u.x$b$b
            r0.<init>(r13, r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
