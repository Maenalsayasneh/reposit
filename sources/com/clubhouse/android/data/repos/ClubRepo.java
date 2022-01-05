package com.clubhouse.android.data.repos;

import android.content.Context;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource;
import com.clubhouse.android.data.network.paging.GetClubMembersPagingSource;
import com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource;
import com.clubhouse.android.data.network.paging.SearchClubsPagingSource;
import com.clubhouse.android.shared.auth.UserManager;
import h0.u.u;
import h0.u.v;
import h0.u.w;
import i0.e.a.a;
import i0.e.b.b3.b.e.f;
import i0.e.b.b3.c.b;
import java.util.Map;
import m0.l.c;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.d;

/* compiled from: ClubRepo.kt */
public final class ClubRepo {
    public final f0 a;
    public final Context b;
    public final ServerDataSource c;
    public final UserRepo d;
    public final EventRepo e;
    public final UserManager f;
    public final a g;
    public final b h;
    public final GetClubMembersPagingSource.a i;
    public final SearchClubMembersPagingSource.a j;
    public final SearchClubsPagingSource.a k;

    public ClubRepo(f0 f0Var, Context context, ServerDataSource serverDataSource, UserRepo userRepo, EventRepo eventRepo, UserManager userManager, a aVar, b bVar, GetClubMembersPagingSource.a aVar2, SearchClubMembersPagingSource.a aVar3, SearchClubsPagingSource.a aVar4) {
        i.e(f0Var, "coroutineScope");
        i.e(context, "context");
        i.e(serverDataSource, "fetcher");
        i.e(userRepo, "userRepo");
        i.e(eventRepo, "eventRepo");
        i.e(userManager, "userManager");
        i.e(aVar, "analytics");
        i.e(bVar, "clubCache");
        i.e(aVar2, "getClubMembersPagingSourceFactory");
        i.e(aVar3, "searchClubMembersPagingSourceFactory");
        i.e(aVar4, "searchClubsPagingSource");
        this.a = f0Var;
        this.b = context;
        this.c = serverDataSource;
        this.d = userRepo;
        this.e = eventRepo;
        this.f = userManager;
        this.g = aVar;
        this.h = bVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = aVar4;
    }

    public static /* synthetic */ Object o(ClubRepo clubRepo, int i2, String str, SourceLocation sourceLocation, Map map, c cVar, int i3) {
        return clubRepo.n(i2, (i3 & 2) != 0 ? null : str, sourceLocation, (i3 & 8) != 0 ? null : map, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(int r5, boolean r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ClubRepo$updateIsMembershipOpen$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ClubRepo$updateIsMembershipOpen$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updateIsMembershipOpen$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updateIsMembershipOpen$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateIsMembershipOpen$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r7)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.c
            com.clubhouse.android.data.models.remote.request.UpdateIsMembershipOpenRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateIsMembershipOpenRequest
            r2.<init>(r5, r6)
            r0.q = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$updateIsMembershipOpen$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$updateIsMembershipOpen$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.A(int, boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(int r5, boolean r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r5 = r0.d
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r6 = (com.clubhouse.android.data.repos.ClubRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.c
            com.clubhouse.android.data.models.remote.request.UpdateIsMembershipPrivateRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateIsMembershipPrivateRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$updateIsMembershipPrivate$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$updateIsMembershipPrivate$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r6 = r4
        L_0x0056:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$2 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$3 r1 = new com.clubhouse.android.data.repos.ClubRepo$updateMemberPrivacy$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.B(int, boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(int r7, android.net.Uri r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$updatePhoto$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$updatePhoto$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updatePhoto$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updatePhoto$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updatePhoto$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r7 = (com.clubhouse.android.data.repos.ClubRepo) r7
            i0.j.f.p.h.d4(r9)
            goto L_0x007f
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            i0.j.f.p.h.d4(r9)
            q0.z$a r9 = new q0.z$a
            r2 = 0
            r9.<init>(r2, r3)
            q0.y r4 = q0.z.c
            r9.d(r4)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r4 = "club_id"
            r9.a(r4, r7)
            i0.e.b.b3.b.d r7 = new i0.e.b.b3.b.d
            android.content.Context r4 = r6.b
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "context.contentResolver"
            m0.n.b.i.d(r4, r5)
            r7.<init>(r4, r8)
            java.lang.String r8 = "file"
            java.lang.String r4 = "image.jpg"
            q0.z$c r7 = q0.z.c.b(r8, r4, r7)
            r9.b(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r6.c
            q0.z r8 = r9.c()
            r0.c = r6
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$updatePhoto$4 r9 = new com.clubhouse.android.data.network.ServerDataSource$updatePhoto$4
            r9.<init>(r7, r8, r2)
            java.lang.Object r9 = r7.a(r9, r0)
            if (r9 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r7 = r6
        L_0x007f:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.ClubRepo$updatePhoto$2 r8 = new com.clubhouse.android.data.repos.ClubRepo$updatePhoto$2
            r8.<init>(r7)
            com.clubhouse.android.data.repos.ClubRepo$updatePhoto$3 r0 = new com.clubhouse.android.data.repos.ClubRepo$updatePhoto$3
            r0.<init>(r7)
            r9.b(r8, r0)
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.C(int, android.net.Uri, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r7 = r0.d
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r0 = (com.clubhouse.android.data.repos.ClubRepo) r0
            i0.j.f.p.h.d4(r8)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.c
            com.clubhouse.android.data.models.remote.request.AcceptClubMemberInviteRequest r2 = new com.clubhouse.android.data.models.remote.request.AcceptClubMemberInviteRequest
            r4 = 2
            r5 = 0
            r2.<init>((int) r7, (java.lang.Integer) r5, (int) r4)
            r0.c = r6
            r0.d = r7
            r0.y = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$acceptClubMemberInvite$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$acceptClubMemberInvite$2
            r3.<init>(r8, r2, r5)
            java.lang.Object r8 = r8.a(r3, r0)
            if (r8 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r6
        L_0x0057:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$2 r1 = new com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$2
            r1.<init>(r0, r7)
            com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$3 r2 = new com.clubhouse.android.data.repos.ClubRepo$acceptClubInvite$3
            r2.<init>(r0, r7)
            r8.b(r1, r2)
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.a(int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r7, int r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r7 = r0.d
            java.lang.Object r8 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r8 = (com.clubhouse.android.data.repos.ClubRepo) r8
            i0.j.f.p.h.d4(r9)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.c
            com.clubhouse.android.data.models.remote.request.ClubUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubUserRequest
            r4 = 4
            r5 = 0
            r2.<init>((int) r7, (int) r8, (java.lang.String) r5, (int) r4)
            r0.c = r6
            r0.d = r7
            r0.y = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$addClubAdmin$2 r8 = new com.clubhouse.android.data.network.ServerDataSource$addClubAdmin$2
            r8.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r8 = r6
        L_0x0057:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$2 r0 = new com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$2
            r0.<init>(r8, r7)
            com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$3 r1 = new com.clubhouse.android.data.repos.ClubRepo$addClubAdmin$3
            r1.<init>(r8, r7)
            r9.b(r0, r1)
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.b(int, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(int r7, int r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$addClubLeader$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$addClubLeader$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$addClubLeader$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$addClubLeader$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$addClubLeader$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r9)
            goto L_0x004c
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.c
            com.clubhouse.android.data.models.remote.request.ClubUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubUserRequest
            r4 = 4
            r5 = 0
            r2.<init>((int) r7, (int) r8, (java.lang.String) r5, (int) r4)
            r0.q = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$addClubLeader$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$addClubLeader$2
            r7.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.c(int, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(int r5, int r6, java.lang.String r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ClubRepo$addClubMember$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ClubRepo$addClubMember$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$addClubMember$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$addClubMember$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$addClubMember$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r5 = r0.d
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r6 = (com.clubhouse.android.data.repos.ClubRepo) r6
            i0.j.f.p.h.d4(r8)
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r4.c
            com.clubhouse.android.data.models.remote.request.ClubUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubUserRequest
            r2.<init>(r5, r6, r7)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$addClubMember$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$addClubMember$2
            r7 = 0
            r6.<init>(r8, r2, r7)
            java.lang.Object r8 = r8.a(r6, r0)
            if (r8 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r6 = r4
        L_0x0056:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ClubRepo$addClubMember$2 r7 = new com.clubhouse.android.data.repos.ClubRepo$addClubMember$2
            r7.<init>(r6, r5)
            com.clubhouse.android.data.repos.ClubRepo$addClubMember$3 r0 = new com.clubhouse.android.data.repos.ClubRepo$addClubMember$3
            r0.<init>(r6, r5)
            r8.b(r7, r0)
            java.lang.Object r5 = r8.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.d(int, int, java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(int r11, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.clubhouse.android.data.repos.ClubRepo$approveAllClubNominations$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.clubhouse.android.data.repos.ClubRepo$approveAllClubNominations$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$approveAllClubNominations$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$approveAllClubNominations$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$approveAllClubNominations$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r12)
            goto L_0x0056
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            i0.j.f.p.h.d4(r12)
            com.clubhouse.android.data.network.ServerDataSource r12 = r10.c
            com.clubhouse.android.data.models.remote.request.GetClubRequest r2 = new com.clubhouse.android.data.models.remote.request.GetClubRequest
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r11)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 14
            r4 = r2
            r4.<init>((java.lang.Integer) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.Map) r8, (int) r9)
            r0.q = r3
            java.util.Objects.requireNonNull(r12)
            com.clubhouse.android.data.network.ServerDataSource$approveAllClubNominations$2 r11 = new com.clubhouse.android.data.network.ServerDataSource$approveAllClubNominations$2
            r3 = 0
            r11.<init>(r12, r2, r3)
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto L_0x0056
            return r1
        L_0x0056:
            com.clubhouse.android.shared.Result r12 = (com.clubhouse.android.shared.Result) r12
            java.lang.Object r11 = r12.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.e(int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(int r5, int r6, java.lang.Integer r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ClubRepo$approveClubNomination$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ClubRepo$approveClubNomination$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$approveClubNomination$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$approveClubNomination$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$approveClubNomination$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r8)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r4.c
            com.clubhouse.android.data.models.remote.request.ClubNominationRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubNominationRequest
            r2.<init>(r5, r6, r7)
            r0.q = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$approveClubNomination$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$approveClubNomination$2
            r6 = 0
            r5.<init>(r8, r2, r6)
            java.lang.Object r8 = r8.a(r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            java.lang.Object r5 = r8.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.f(int, int, java.lang.Integer, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.ClubRepo$canCreateClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.ClubRepo$canCreateClub$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$canCreateClub$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$canCreateClub$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$canCreateClub$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r5)
            com.clubhouse.android.data.network.ServerDataSource r5 = r4.c
            r0.q = r3
            java.util.Objects.requireNonNull(r5)
            com.clubhouse.android.data.network.ServerDataSource$canCreateClub$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$canCreateClub$2
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            com.clubhouse.android.shared.Result r5 = (com.clubhouse.android.shared.Result) r5
            java.lang.Object r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.g(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r6, java.lang.String r7, java.util.List<java.lang.Integer> r8, boolean r9, boolean r10, boolean r11, boolean r12, android.net.Uri r13, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetCreateClubResponse> r14) {
        /*
            r5 = this;
            boolean r0 = r14 instanceof com.clubhouse.android.data.repos.ClubRepo$createClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.clubhouse.android.data.repos.ClubRepo$createClub$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$createClub$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$createClub$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$createClub$1
            r0.<init>(r5, r14)
        L_0x0018:
            java.lang.Object r14 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r6 = (com.clubhouse.android.data.repos.ClubRepo) r6
            i0.j.f.p.h.d4(r14)
            goto L_0x00d6
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r14)
            q0.z$a r14 = new q0.z$a
            r2 = 0
            r14.<init>(r2, r3)
            q0.y r4 = q0.z.c
            r14.d(r4)
            java.lang.String r4 = "name"
            r14.a(r4, r6)
            java.lang.String r6 = "description"
            r14.a(r6, r7)
            java.lang.String r6 = java.lang.String.valueOf(r9)
            java.lang.String r6 = kotlin.text.StringsKt__IndentKt.a(r6)
            java.lang.String r7 = "is_community"
            r14.a(r7, r6)
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.String r6 = kotlin.text.StringsKt__IndentKt.a(r6)
            java.lang.String r7 = "is_membership_open"
            r14.a(r7, r6)
            java.lang.String r6 = java.lang.String.valueOf(r11)
            java.lang.String r6 = kotlin.text.StringsKt__IndentKt.a(r6)
            java.lang.String r7 = "is_membership_private"
            r14.a(r7, r6)
            java.lang.String r6 = java.lang.String.valueOf(r12)
            java.lang.String r6 = kotlin.text.StringsKt__IndentKt.a(r6)
            java.lang.String r7 = "is_ask_to_join_allowed"
            r14.a(r7, r6)
            java.util.Iterator r6 = r8.iterator()
        L_0x0084:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x009e
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "topic_ids[]"
            r14.a(r8, r7)
            goto L_0x0084
        L_0x009e:
            if (r13 != 0) goto L_0x00a1
            goto L_0x00bc
        L_0x00a1:
            i0.e.b.b3.b.d r6 = new i0.e.b.b3.b.d
            android.content.Context r7 = r5.b
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.lang.String r8 = "context.contentResolver"
            m0.n.b.i.d(r7, r8)
            r6.<init>(r7, r13)
            java.lang.String r7 = "file"
            java.lang.String r8 = "image.jpg"
            q0.z$c r6 = q0.z.c.b(r7, r8, r6)
            r14.b(r6)
        L_0x00bc:
            com.clubhouse.android.data.network.ServerDataSource r6 = r5.c
            q0.z r7 = r14.c()
            r0.c = r5
            r0.x = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$createClub$2 r8 = new com.clubhouse.android.data.network.ServerDataSource$createClub$2
            r8.<init>(r6, r7, r2)
            java.lang.Object r14 = r6.a(r8, r0)
            if (r14 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r6 = r5
        L_0x00d6:
            com.clubhouse.android.shared.Result r14 = (com.clubhouse.android.shared.Result) r14
            com.clubhouse.android.data.repos.ClubRepo$createClub$2 r7 = new com.clubhouse.android.data.repos.ClubRepo$createClub$2
            r7.<init>(r6)
            com.clubhouse.android.data.repos.ClubRepo$createClub$3 r8 = new com.clubhouse.android.data.repos.ClubRepo$createClub$3
            r8.<init>(r6)
            r14.b(r7, r8)
            java.lang.Object r6 = r14.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.h(java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, android.net.Uri, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(int r7, int r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$deleteClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$deleteClub$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$deleteClub$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$deleteClub$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$deleteClub$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r7 = r0.d
            java.lang.Object r8 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r8 = (com.clubhouse.android.data.repos.ClubRepo) r8
            i0.j.f.p.h.d4(r9)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.c
            com.clubhouse.android.data.models.remote.request.ClubUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubUserRequest
            r4 = 4
            r5 = 0
            r2.<init>((int) r7, (int) r8, (java.lang.String) r5, (int) r4)
            r0.c = r6
            r0.d = r7
            r0.y = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$deleteClub$2 r8 = new com.clubhouse.android.data.network.ServerDataSource$deleteClub$2
            r8.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r8 = r6
        L_0x0057:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.ClubRepo$deleteClub$2 r0 = new com.clubhouse.android.data.repos.ClubRepo$deleteClub$2
            r0.<init>(r8, r7)
            com.clubhouse.android.data.repos.ClubRepo$deleteClub$3 r1 = new com.clubhouse.android.data.repos.ClubRepo$deleteClub$3
            r1.<init>(r8, r7)
            r9.b(r0, r1)
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.i(int, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetClubResponse> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.clubhouse.android.data.repos.ClubRepo$getClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.clubhouse.android.data.repos.ClubRepo$getClub$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$getClub$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$getClub$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$getClub$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r6 = r0.d
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r7 = (com.clubhouse.android.data.repos.ClubRepo) r7
            i0.j.f.p.h.d4(r10)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            i0.j.f.p.h.d4(r10)
            com.clubhouse.android.data.network.ServerDataSource r10 = r5.c
            com.clubhouse.android.data.models.remote.request.GetClubRequest r2 = new com.clubhouse.android.data.models.remote.request.GetClubRequest
            r2.<init>(r6, r7, r8, r9)
            r0.c = r5
            r0.d = r6
            r0.y = r4
            java.util.Objects.requireNonNull(r10)
            com.clubhouse.android.data.network.ServerDataSource$getClub$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$getClub$2
            r7.<init>(r10, r2, r3)
            java.lang.Object r10 = r10.a(r7, r0)
            if (r10 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r7 = r5
        L_0x0058:
            com.clubhouse.android.shared.Result r10 = (com.clubhouse.android.shared.Result) r10
            com.clubhouse.android.data.repos.ClubRepo$getClub$2 r8 = new com.clubhouse.android.data.repos.ClubRepo$getClub$2
            r8.<init>(r7, r6)
            com.clubhouse.android.shared.Result.c(r10, r3, r8, r4, r3)
            java.lang.Object r6 = r10.a()
            r8 = r6
            com.clubhouse.android.data.models.remote.response.GetClubResponse r8 = (com.clubhouse.android.data.models.remote.response.GetClubResponse) r8
            i0.e.b.b3.c.b r7 = r7.h
            java.util.Objects.requireNonNull(r7)
            java.lang.String r9 = "clubInfo"
            m0.n.b.i.e(r8, r9)
            boolean r9 = r8.d
            if (r9 != 0) goto L_0x008a
            boolean r9 = r8.x
            if (r9 != 0) goto L_0x008a
            boolean r9 = r8.q
            if (r9 == 0) goto L_0x0080
            goto L_0x008a
        L_0x0080:
            boolean r9 = r8.Y1
            if (r9 == 0) goto L_0x0087
            com.clubhouse.android.data.repos.ClubMembership r9 = com.clubhouse.android.data.repos.ClubMembership.PendingApproval
            goto L_0x008c
        L_0x0087:
            com.clubhouse.android.data.repos.ClubMembership r9 = com.clubhouse.android.data.repos.ClubMembership.None
            goto L_0x008c
        L_0x008a:
            com.clubhouse.android.data.repos.ClubMembership r9 = com.clubhouse.android.data.repos.ClubMembership.Joined
        L_0x008c:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r8 = r8.c
            int r8 = r8.x
            r7.a(r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.j(java.lang.Integer, java.lang.String, java.lang.String, java.util.Map, m0.l.c):java.lang.Object");
    }

    public final d<w<f>> k(int i2) {
        return new EntityAwarePagingDataSource(this.e, this.d, this.h, this.f, this.a, new u(new v(50, 5, false, 50, 0, 0, 52), (Object) null, new ClubRepo$getClubMembers$1(this, i2), 2)).e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(int r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetClubNominationsResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.ClubRepo$getClubNominations$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.ClubRepo$getClubNominations$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$getClubNominations$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$getClubNominations$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$getClubNominations$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r6)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r4.c
            com.clubhouse.android.data.models.remote.request.GetClubNominationsRequest r2 = new com.clubhouse.android.data.models.remote.request.GetClubNominationsRequest
            r2.<init>(r5)
            r0.q = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$getClubNominations$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$getClubNominations$2
            r3 = 0
            r5.<init>(r6, r2, r3)
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            java.lang.Object r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.l(int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(boolean r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetClubsResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ClubRepo$getClubs$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ClubRepo$getClubs$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$getClubs$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$getClubs$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$getClubs$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r6 = (com.clubhouse.android.data.repos.ClubRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r5.c
            com.clubhouse.android.data.models.remote.request.GetClubsRequest r2 = new com.clubhouse.android.data.models.remote.request.GetClubsRequest
            r2.<init>(r6)
            r0.c = r5
            r0.x = r4
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$getClubs$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$getClubs$2
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r6 = r5
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ClubRepo$getClubs$2 r0 = new com.clubhouse.android.data.repos.ClubRepo$getClubs$2
            r0.<init>(r6)
            com.clubhouse.android.shared.Result.c(r7, r3, r0, r4, r3)
            java.lang.Object r7 = r7.a()
            r0 = r7
            com.clubhouse.android.data.models.remote.response.GetClubsResponse r0 = (com.clubhouse.android.data.models.remote.response.GetClubsResponse) r0
            i0.e.b.b3.c.b r6 = r6.h
            java.util.List<com.clubhouse.android.data.models.local.club.ClubWithAdmin> r0 = r0.c
            r6.b(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.m(boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(int r7, java.lang.String r8, com.clubhouse.android.data.models.local.user.SourceLocation r9, java.util.Map<java.lang.String, ? extends java.lang.Object> r10, m0.l.c<? super com.clubhouse.android.data.models.remote.response.JoinClubResponse> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.clubhouse.android.data.repos.ClubRepo$joinClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.clubhouse.android.data.repos.ClubRepo$joinClub$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$joinClub$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$joinClub$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$joinClub$1
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            int r7 = r0.d
            java.lang.Object r8 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r8 = (com.clubhouse.android.data.repos.ClubRepo) r8
            i0.j.f.p.h.d4(r11)
            goto L_0x005b
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            i0.j.f.p.h.d4(r11)
            com.clubhouse.android.data.network.ServerDataSource r11 = r6.c
            com.clubhouse.android.data.models.remote.request.JoinClubRequest r2 = new com.clubhouse.android.data.models.remote.request.JoinClubRequest
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r7)
            r2.<init>(r5, r8, r9, r10)
            r0.c = r6
            r0.d = r7
            r0.y = r4
            java.util.Objects.requireNonNull(r11)
            com.clubhouse.android.data.network.ServerDataSource$joinClub$2 r8 = new com.clubhouse.android.data.network.ServerDataSource$joinClub$2
            r8.<init>(r11, r2, r3)
            java.lang.Object r11 = r11.a(r8, r0)
            if (r11 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r8 = r6
        L_0x005b:
            com.clubhouse.android.shared.Result r11 = (com.clubhouse.android.shared.Result) r11
            com.clubhouse.android.data.repos.ClubRepo$joinClub$2 r9 = new com.clubhouse.android.data.repos.ClubRepo$joinClub$2
            r9.<init>(r8, r7)
            com.clubhouse.android.shared.Result.c(r11, r3, r9, r4, r3)
            java.lang.Object r9 = r11.a()
            r10 = r9
            com.clubhouse.android.data.models.remote.response.JoinClubResponse r10 = (com.clubhouse.android.data.models.remote.response.JoinClubResponse) r10
            i0.e.b.b3.c.b r8 = r8.h
            java.lang.Boolean r10 = r10.c
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r10 = m0.n.b.i.a(r10, r11)
            if (r10 == 0) goto L_0x007b
            com.clubhouse.android.data.repos.ClubMembership r10 = com.clubhouse.android.data.repos.ClubMembership.PendingApproval
            goto L_0x007d
        L_0x007b:
            com.clubhouse.android.data.repos.ClubMembership r10 = com.clubhouse.android.data.repos.ClubMembership.Joined
        L_0x007d:
            r8.a(r7, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.n(int, java.lang.String, com.clubhouse.android.data.models.local.user.SourceLocation, java.util.Map, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(int r11, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.clubhouse.android.data.repos.ClubRepo$rejectAllClubNominations$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.clubhouse.android.data.repos.ClubRepo$rejectAllClubNominations$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$rejectAllClubNominations$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$rejectAllClubNominations$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$rejectAllClubNominations$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r12)
            goto L_0x0056
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            i0.j.f.p.h.d4(r12)
            com.clubhouse.android.data.network.ServerDataSource r12 = r10.c
            com.clubhouse.android.data.models.remote.request.GetClubRequest r2 = new com.clubhouse.android.data.models.remote.request.GetClubRequest
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r11)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 14
            r4 = r2
            r4.<init>((java.lang.Integer) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.Map) r8, (int) r9)
            r0.q = r3
            java.util.Objects.requireNonNull(r12)
            com.clubhouse.android.data.network.ServerDataSource$rejectAllClubNominations$2 r11 = new com.clubhouse.android.data.network.ServerDataSource$rejectAllClubNominations$2
            r3 = 0
            r11.<init>(r12, r2, r3)
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto L_0x0056
            return r1
        L_0x0056:
            com.clubhouse.android.shared.Result r12 = (com.clubhouse.android.shared.Result) r12
            java.lang.Object r11 = r12.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.p(int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(int r5, int r6, java.lang.Integer r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r8)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r4.c
            com.clubhouse.android.data.models.remote.request.ClubNominationRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubNominationRequest
            r2.<init>(r5, r6, r7)
            r0.q = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$rejectClubNomination$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$rejectClubNomination$2
            r6 = 0
            r5.<init>(r8, r2, r6)
            java.lang.Object r8 = r8.a(r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            java.lang.Object r5 = r8.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.q(int, int, java.lang.Integer, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(int r7, int r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$2 r0 = (com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$2) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$2 r0 = new com.clubhouse.android.data.repos.ClubRepo$rejectClubNomination$2
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r9)
            goto L_0x004c
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.c
            com.clubhouse.android.data.models.remote.request.ClubNominationRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubNominationRequest
            r4 = 4
            r5 = 0
            r2.<init>((int) r7, (int) r8, (java.lang.Integer) r5, (int) r4)
            r0.q = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$rejectClubNomination$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$rejectClubNomination$2
            r7.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.r(int, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(int r7, int r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r7 = r0.d
            java.lang.Object r8 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r8 = (com.clubhouse.android.data.repos.ClubRepo) r8
            i0.j.f.p.h.d4(r9)
            goto L_0x0057
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.c
            com.clubhouse.android.data.models.remote.request.ClubUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubUserRequest
            r4 = 4
            r5 = 0
            r2.<init>((int) r7, (int) r8, (java.lang.String) r5, (int) r4)
            r0.c = r6
            r0.d = r7
            r0.y = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$removeClubAdmin$2 r8 = new com.clubhouse.android.data.network.ServerDataSource$removeClubAdmin$2
            r8.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r8 = r6
        L_0x0057:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$2 r0 = new com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$2
            r0.<init>(r8, r7)
            com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$3 r1 = new com.clubhouse.android.data.repos.ClubRepo$removeClubAdmin$3
            r1.<init>(r8, r7)
            r9.b(r0, r1)
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.s(int, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(int r7, int r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$removeClubLeader$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$removeClubLeader$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$removeClubLeader$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$removeClubLeader$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$removeClubLeader$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r9)
            goto L_0x004c
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.c
            com.clubhouse.android.data.models.remote.request.ClubUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubUserRequest
            r4 = 4
            r5 = 0
            r2.<init>((int) r7, (int) r8, (java.lang.String) r5, (int) r4)
            r0.q = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$removeClubLeader$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$removeClubLeader$2
            r7.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.t(int, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(int r7, int r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ClubRepo$removeClubMember$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ClubRepo$removeClubMember$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$removeClubMember$1) r0
            int r1 = r0.Y1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y1 = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$removeClubMember$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$removeClubMember$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.Y1
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r8 = r0.q
            int r7 = r0.d
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r0 = (com.clubhouse.android.data.repos.ClubRepo) r0
            i0.j.f.p.h.d4(r9)
            goto L_0x005b
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.c
            com.clubhouse.android.data.models.remote.request.ClubUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ClubUserRequest
            r4 = 4
            r5 = 0
            r2.<init>((int) r7, (int) r8, (java.lang.String) r5, (int) r4)
            r0.c = r6
            r0.d = r7
            r0.q = r8
            r0.Y1 = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$removeClubMember$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$removeClubMember$2
            r3.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r3, r0)
            if (r9 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0 = r6
        L_0x005b:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.ClubRepo$removeClubMember$2 r1 = new com.clubhouse.android.data.repos.ClubRepo$removeClubMember$2
            r1.<init>(r0, r7)
            com.clubhouse.android.data.repos.ClubRepo$removeClubMember$3 r2 = new com.clubhouse.android.data.repos.ClubRepo$removeClubMember$3
            r2.<init>(r0, r7)
            r9.b(r1, r2)
            java.lang.Object r9 = r9.a()
            r1 = r9
            com.clubhouse.android.data.models.remote.response.EmptySuccessResponse r1 = (com.clubhouse.android.data.models.remote.response.EmptySuccessResponse) r1
            com.clubhouse.android.shared.auth.UserManager r1 = r0.f
            java.lang.Integer r1 = r1.b()
            if (r1 != 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            int r1 = r1.intValue()
            if (r8 != r1) goto L_0x0087
            i0.e.b.b3.c.b r8 = r0.h
            com.clubhouse.android.data.repos.ClubMembership r0 = com.clubhouse.android.data.repos.ClubMembership.None
            r8.a(r7, r0)
        L_0x0087:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.u(int, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(int r5, java.lang.String r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r5 = (com.clubhouse.android.data.repos.ClubRepo) r5
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.c
            com.clubhouse.android.data.models.remote.request.UpdateClubDescriptionRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateClubDescriptionRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$updateClubDescription$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$updateClubDescription$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$2 r6 = new com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$3 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateClubDescription$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.v(int, java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(int r5, java.util.List<com.clubhouse.android.data.models.local.club.ClubRule> r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ClubRepo$updateClubRules$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ClubRepo$updateClubRules$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updateClubRules$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updateClubRules$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateClubRules$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r5 = (com.clubhouse.android.data.repos.ClubRepo) r5
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.c
            com.clubhouse.android.data.models.remote.request.UpdateClubRulesRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateClubRulesRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$updateClubRules$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$updateClubRules$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ClubRepo$updateClubRules$2 r6 = new com.clubhouse.android.data.repos.ClubRepo$updateClubRules$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.ClubRepo$updateClubRules$3 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateClubRules$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.w(int, java.util.List, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(int r6, java.util.List<java.lang.Integer> r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ClubRepo$updateClubTopics$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ClubRepo$updateClubTopics$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updateClubTopics$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updateClubTopics$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateClubTopics$1
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
            com.clubhouse.android.data.repos.ClubRepo r6 = (com.clubhouse.android.data.repos.ClubRepo) r6
            i0.j.f.p.h.d4(r8)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r5.c
            com.clubhouse.android.data.models.remote.request.UpdateClubTopicsRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateClubTopicsRequest
            r2.<init>(r6, r7)
            r0.c = r5
            r0.x = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$updateClubTopics$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$updateClubTopics$2
            r6.<init>(r8, r2, r3)
            java.lang.Object r8 = r8.a(r6, r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r6 = r5
        L_0x0052:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ClubRepo$updateClubTopics$2 r7 = new com.clubhouse.android.data.repos.ClubRepo$updateClubTopics$2
            r7.<init>(r6)
            com.clubhouse.android.shared.Result.c(r8, r3, r7, r4, r3)
            java.lang.Object r6 = r8.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.x(int, java.util.List, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(int r5, boolean r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ClubRepo$updateIsAskToJoinAllowed$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ClubRepo$updateIsAskToJoinAllowed$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updateIsAskToJoinAllowed$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updateIsAskToJoinAllowed$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateIsAskToJoinAllowed$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r7)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.c
            com.clubhouse.android.data.models.remote.request.UpdateIsAskToJoinAllowedRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateIsAskToJoinAllowedRequest
            r2.<init>(r5, r6)
            r0.q = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$updateIsAskToJoinAllowed$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$updateIsAskToJoinAllowed$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.y(int, boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(int r5, boolean r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$1 r0 = (com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$1 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r5 = r0.d
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ClubRepo r6 = (com.clubhouse.android.data.repos.ClubRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.c
            com.clubhouse.android.data.models.remote.request.UpdateIsCommunityRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateIsCommunityRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$updateIsCommunity$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$updateIsCommunity$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r6 = r4
        L_0x0056:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$2 r0 = new com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$3 r1 = new com.clubhouse.android.data.repos.ClubRepo$updateIsCommunity$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ClubRepo.z(int, boolean, m0.l.c):java.lang.Object");
    }
}
