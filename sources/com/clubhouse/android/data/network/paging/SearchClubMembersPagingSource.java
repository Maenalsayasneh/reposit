package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.models.remote.request.ClubMemberSearchRequest;
import com.clubhouse.android.data.network.ServerDataSource;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.b3.b.e.f;
import m0.n.b.i;

/* compiled from: SearchClubMembersPagingSource.kt */
public final class SearchClubMembersPagingSource extends AbstractPagingSource<f> {
    public final ClubMemberSearchRequest c;
    public final ServerDataSource d;

    /* compiled from: SearchClubMembersPagingSource.kt */
    public interface a {
    }

    public SearchClubMembersPagingSource(ClubMemberSearchRequest clubMemberSearchRequest, ServerDataSource serverDataSource) {
        i.e(clubMemberSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(serverDataSource, "fetcher");
        this.c = clubMemberSearchRequest;
        this.d = serverDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b A[LOOP:0: B:16:0x0065->B:18:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r10, int r11, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.f>> r12) {
        /*
            r9 = this;
            boolean r10 = r12 instanceof com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource$query$1
            if (r10 == 0) goto L_0x0013
            r10 = r12
            com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource$query$1 r10 = (com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource$query$1) r10
            int r11 = r10.q
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r11 & r0
            if (r1 == 0) goto L_0x0013
            int r11 = r11 - r0
            r10.q = r11
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource$query$1 r10 = new com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource$query$1
            r10.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r11 = r10.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r10.q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x0028
            i0.j.f.p.h.d4(r11)
            goto L_0x004c
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            i0.j.f.p.h.d4(r11)
            com.clubhouse.android.data.network.ServerDataSource r11 = r9.d
            com.clubhouse.android.data.models.remote.request.ClubMemberSearchRequest r0 = r9.c
            int r3 = r0.a
            java.lang.String r0 = r0.b
            r10.q = r1
            java.util.Objects.requireNonNull(r11)
            com.clubhouse.android.data.network.ServerDataSource$searchClubMembers$2 r1 = new com.clubhouse.android.data.network.ServerDataSource$searchClubMembers$2
            r1.<init>(r11, r3, r0, r2)
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r12) goto L_0x004c
            return r12
        L_0x004c:
            com.clubhouse.android.shared.Result r11 = (com.clubhouse.android.shared.Result) r11
            java.lang.Object r10 = r11.a()
            com.clubhouse.android.data.models.remote.response.UsersInClubResponse r10 = (com.clubhouse.android.data.models.remote.response.UsersInClubResponse) r10
            java.util.List<com.clubhouse.android.data.models.local.user.UserInClub> r10 = r10.a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = i0.j.f.p.h.K(r10, r12)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x0065:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0081
            java.lang.Object r12 = r10.next()
            r4 = r12
            com.clubhouse.android.data.models.local.user.UserInClub r4 = (com.clubhouse.android.data.models.local.user.UserInClub) r4
            i0.e.b.b3.b.e.f r12 = new i0.e.b.b3.b.e.f
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r11.add(r12)
            goto L_0x0065
        L_0x0081:
            h0.u.x$b$b r10 = new h0.u.x$b$b
            r10.<init>(r11, r2, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
