package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.shared.preferences.Key;
import i0.e.a.a;
import i0.e.b.f3.k.b;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m0.n.b.i;

/* compiled from: InviteRepo.kt */
public final class InviteRepo {
    public final ServerDataSource a;
    public final b b;
    public final a c;

    public InviteRepo(ServerDataSource serverDataSource, b bVar, a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(bVar, "userPrefs");
        i.e(aVar, "analytics");
        this.a = serverDataSource;
        this.b = bVar;
        this.c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List<com.clubhouse.android.data.models.local.Contact> r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetSuggestedInvitesResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$1 r0 = (com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$1 r0 = new com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r8 = r0.d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.InviteRepo r0 = (com.clubhouse.android.data.repos.InviteRepo) r0
            i0.j.f.p.h.d4(r9)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            i0.j.f.p.h.d4(r9)
            boolean r9 = r7.c()
            if (r9 == 0) goto L_0x004e
            i0.e.b.f3.k.b r2 = r7.b
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Objects.requireNonNull(r2)
            com.clubhouse.android.shared.preferences.Key r6 = com.clubhouse.android.shared.preferences.Key.LAST_CONTACTS_SYNC_TIME
            r2.h(r6, r4)
        L_0x004e:
            com.clubhouse.android.data.network.ServerDataSource r2 = r7.a
            com.clubhouse.android.data.models.remote.request.UploadContactsRequest r4 = new com.clubhouse.android.data.models.remote.request.UploadContactsRequest
            r5 = 0
            r4.<init>((java.lang.String) r5, (boolean) r9, (java.util.List) r8, (int) r3)
            r0.c = r7
            r0.d = r8
            r0.y = r3
            java.util.Objects.requireNonNull(r2)
            com.clubhouse.android.data.network.ServerDataSource$getSuggestedInvites$2 r9 = new com.clubhouse.android.data.network.ServerDataSource$getSuggestedInvites$2
            r9.<init>(r2, r4, r5)
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r0 = r7
        L_0x006c:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$2 r1 = new com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$2
            r1.<init>(r0, r8)
            com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$3 r8 = new com.clubhouse.android.data.repos.InviteRepo$getSuggestedInvites$3
            r8.<init>(r0)
            r9.b(r1, r8)
            java.lang.Object r8 = r9.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.InviteRepo.a(java.util.List, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r7, java.lang.String r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.InviteRepo$inviteToApp$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.InviteRepo$inviteToApp$1 r0 = (com.clubhouse.android.data.repos.InviteRepo$inviteToApp$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.InviteRepo$inviteToApp$1 r0 = new com.clubhouse.android.data.repos.InviteRepo$inviteToApp$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.InviteRepo r7 = (com.clubhouse.android.data.repos.InviteRepo) r7
            i0.j.f.p.h.d4(r9)
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r6.a
            com.clubhouse.android.data.models.remote.request.InviteToAppRequest r2 = new com.clubhouse.android.data.models.remote.request.InviteToAppRequest
            r4 = 4
            r5 = 0
            r2.<init>((java.lang.String) r8, (java.lang.String) r7, (java.lang.String) r5, (int) r4)
            r0.c = r6
            r0.x = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$inviteToApp$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$inviteToApp$2
            r7.<init>(r9, r2, r5)
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r7 = r6
        L_0x0053:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.InviteRepo$inviteToApp$2 r8 = new com.clubhouse.android.data.repos.InviteRepo$inviteToApp$2
            r8.<init>(r7)
            com.clubhouse.android.data.repos.InviteRepo$inviteToApp$3 r0 = new com.clubhouse.android.data.repos.InviteRepo$inviteToApp$3
            r0.<init>(r7)
            r9.b(r8, r0)
            java.lang.Object r7 = r9.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.InviteRepo.b(java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public final boolean c() {
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = this.b;
        Objects.requireNonNull(bVar);
        return currentTimeMillis - bVar.b(Key.LAST_CONTACTS_SYNC_TIME, 0) > TimeUnit.DAYS.toMillis(1);
    }
}
