package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest;
import com.clubhouse.android.data.network.ServerDataSource;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.b3.b.e.j;
import m0.n.b.i;

/* compiled from: SearchClubsPagingSource.kt */
public final class SearchClubsPagingSource extends AbstractPagingSource<j> {
    public final FollowScopedSearchRequest c;
    public final ServerDataSource d;
    public final i0.e.a.a e;

    /* compiled from: SearchClubsPagingSource.kt */
    public interface a {
    }

    public SearchClubsPagingSource(FollowScopedSearchRequest followScopedSearchRequest, ServerDataSource serverDataSource, i0.e.a.a aVar) {
        i.e(followScopedSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.c = followScopedSearchRequest;
        this.d = serverDataSource;
        this.e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b A[LOOP:0: B:17:0x0075->B:19:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r11, int r12, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.j>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.clubhouse.android.data.network.paging.SearchClubsPagingSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.clubhouse.android.data.network.paging.SearchClubsPagingSource$query$1 r0 = (com.clubhouse.android.data.network.paging.SearchClubsPagingSource$query$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.SearchClubsPagingSource$query$1 r0 = new com.clubhouse.android.data.network.paging.SearchClubsPagingSource$query$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r11 = r0.c
            com.clubhouse.android.data.network.paging.SearchClubsPagingSource r11 = (com.clubhouse.android.data.network.paging.SearchClubsPagingSource) r11
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
            com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest r6 = r10.c
            r0.c = r10
            r0.x = r3
            java.util.Objects.requireNonNull(r13)
            com.clubhouse.android.data.network.ServerDataSource$searchClubs$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$searchClubs$2
            r9 = 0
            r4 = r2
            r5 = r13
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r13 = r13.a(r2, r0)
            if (r13 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r11 = r10
        L_0x0053:
            com.clubhouse.android.shared.Result r13 = (com.clubhouse.android.shared.Result) r13
            com.clubhouse.android.data.network.paging.SearchClubsPagingSource$query$response$1 r12 = new com.clubhouse.android.data.network.paging.SearchClubsPagingSource$query$response$1
            r12.<init>(r11)
            r11 = 0
            com.clubhouse.android.shared.Result.c(r13, r11, r12, r3, r11)
            java.lang.Object r12 = r13.a()
            com.clubhouse.android.data.models.remote.response.SearchClubsResponse r12 = (com.clubhouse.android.data.models.remote.response.SearchClubsResponse) r12
            java.util.List<com.clubhouse.android.data.models.local.club.ClubWithAdmin> r13 = r12.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = i0.j.f.p.h.K(r13, r1)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L_0x0075:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x008b
            java.lang.Object r1 = r13.next()
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r1 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r1
            i0.e.b.b3.b.e.e r2 = new i0.e.b.b3.b.e.e
            r3 = 6
            r2.<init>(r1, r11, r11, r3)
            r0.add(r2)
            goto L_0x0075
        L_0x008b:
            h0.u.x$b$b r13 = new h0.u.x$b$b
            java.lang.Integer r12 = r12.c
            r13.<init>(r0, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.SearchClubsPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
