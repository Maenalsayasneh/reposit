package com.clubhouse.android.data.network;

import com.clubhouse.android.core.storage.Store;
import i0.e.b.b3.b.a;
import java.util.concurrent.TimeUnit;
import m0.l.c;
import m0.n.b.i;
import n0.a.g2.d;
import n0.a.g2.o;

/* compiled from: BuddyListDataSource.kt */
public final class BuddyListDataSource extends RefreshableDataSource<a> {
    public final ServerDataSource e;
    public final i0.e.a.a f;
    public final Store<Integer, i0.e.b.b3.a.a.f.a> g;
    public final d<a> h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListDataSource(ServerDataSource serverDataSource, i0.e.a.a aVar, Store<Integer, i0.e.b.b3.a.a.f.a> store) {
        super(TimeUnit.MINUTES.toMillis(5));
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        i.e(store, "userPresenceStore");
        this.e = serverDataSource;
        this.f = aVar;
        this.g = store;
        this.h = new o(this.d, store.d, new BuddyListDataSource$responseFlow$1((c<? super BuddyListDataSource$responseFlow$1>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074 A[LOOP:0: B:17:0x006e->B:19:0x0074, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(m0.l.c<? super i0.e.b.b3.b.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.network.BuddyListDataSource$makeRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.network.BuddyListDataSource$makeRequest$1 r0 = (com.clubhouse.android.data.network.BuddyListDataSource$makeRequest$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.BuddyListDataSource$makeRequest$1 r0 = new com.clubhouse.android.data.network.BuddyListDataSource$makeRequest$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.network.BuddyListDataSource r0 = (com.clubhouse.android.data.network.BuddyListDataSource) r0
            i0.j.f.p.h.d4(r7)
            goto L_0x004d
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r6.e
            r0.c = r6
            r0.x = r4
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$getOnlineFriends$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getOnlineFriends$2
            r2.<init>(r7, r3)
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r6
        L_0x004d:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.network.BuddyListDataSource$makeRequest$response$1 r1 = new com.clubhouse.android.data.network.BuddyListDataSource$makeRequest$response$1
            r1.<init>(r0)
            com.clubhouse.android.shared.Result.c(r7, r3, r1, r4, r3)
            java.lang.Object r7 = r7.a()
            com.clubhouse.android.data.models.remote.response.GetOnlineFriendsResponse r7 = (com.clubhouse.android.data.models.remote.response.GetOnlineFriendsResponse) r7
            java.util.List<com.clubhouse.android.data.models.local.user.UserInStatus> r1 = r7.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = i0.j.f.p.h.K(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x008f
            java.lang.Object r3 = r1.next()
            com.clubhouse.android.data.models.local.user.UserInStatus r3 = (com.clubhouse.android.data.models.local.user.UserInStatus) r3
            com.clubhouse.android.core.storage.Store<java.lang.Integer, i0.e.b.b3.a.a.f.a> r4 = r0.g
            java.lang.Integer r5 = r3.getId()
            int r5 = r5.intValue()
            java.lang.Integer r3 = r3.x
            i0.e.b.b3.a.a.f.b.a(r4, r5, r3)
            m0.i r3 = m0.i.a
            r2.add(r3)
            goto L_0x006e
        L_0x008f:
            i0.e.b.b3.b.a r0 = new i0.e.b.b3.b.a
            java.util.List<com.clubhouse.android.data.models.local.club.ClubInStatus> r1 = r7.a
            java.util.List<com.clubhouse.android.data.models.local.user.UserInStatus> r7 = r7.b
            r2 = 0
            r3 = 4
            r0.<init>(r1, r7, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.BuddyListDataSource.c(m0.l.c):java.lang.Object");
    }
}
