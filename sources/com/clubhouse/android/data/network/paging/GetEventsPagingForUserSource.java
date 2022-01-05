package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.shared.auth.UserManager;
import i0.e.b.b3.c.c;
import m0.n.b.i;

/* compiled from: GetEventsPagingForUserSource.kt */
public final class GetEventsPagingForUserSource extends AbstractPagingSource<EventInClub> {
    public final ServerDataSource c;
    public UserManager d;
    public final i0.e.a.a e;
    public final c f;

    /* compiled from: GetEventsPagingForUserSource.kt */
    public interface a {
    }

    public GetEventsPagingForUserSource(ServerDataSource serverDataSource, UserManager userManager, i0.e.a.a aVar, c cVar) {
        i.e(serverDataSource, "fetcher");
        i.e(userManager, "userManager");
        i.e(aVar, "analytics");
        i.e(cVar, "eventCache");
        this.c = serverDataSource;
        this.d = userManager;
        this.e = aVar;
        this.f = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r11, int r12, m0.l.c<? super h0.u.x.b<java.lang.Integer, com.clubhouse.android.data.models.local.EventInClub>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$1 r0 = (com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$1 r0 = new com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r11 = r0.c
            com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource r11 = (com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource) r11
            i0.j.f.p.h.d4(r13)
            goto L_0x0060
        L_0x002b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0033:
            i0.j.f.p.h.d4(r13)
            com.clubhouse.android.shared.auth.UserManager r13 = r10.d
            java.lang.Integer r13 = r13.b()
            if (r13 != 0) goto L_0x0040
            r13 = 0
            goto L_0x0044
        L_0x0040:
            int r13 = r13.intValue()
        L_0x0044:
            r6 = r13
            com.clubhouse.android.data.network.ServerDataSource r13 = r10.c
            r0.c = r10
            r0.x = r3
            java.util.Objects.requireNonNull(r13)
            com.clubhouse.android.data.network.ServerDataSource$getEventsForUser$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getEventsForUser$2
            r9 = 0
            r4 = r2
            r5 = r13
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r13 = r13.a(r2, r0)
            if (r13 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r11 = r10
        L_0x0060:
            com.clubhouse.android.shared.Result r13 = (com.clubhouse.android.shared.Result) r13
            com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$response$1 r12 = new com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$response$1
            r12.<init>(r11)
            com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$response$2 r0 = new com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource$query$response$2
            r0.<init>(r11)
            r13.b(r12, r0)
            java.lang.Object r12 = r13.a()
            com.clubhouse.android.data.models.remote.response.GetEventsResponse r12 = (com.clubhouse.android.data.models.remote.response.GetEventsResponse) r12
            i0.e.b.b3.c.c r11 = r11.f
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r13 = r12.a
            r11.b(r13)
            h0.u.x$b$b r11 = new h0.u.x$b$b
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r13 = r12.a
            if (r13 != 0) goto L_0x0084
            kotlin.collections.EmptyList r13 = kotlin.collections.EmptyList.c
        L_0x0084:
            r0 = 0
            java.lang.Integer r12 = r12.c
            r11.<init>(r13, r0, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
