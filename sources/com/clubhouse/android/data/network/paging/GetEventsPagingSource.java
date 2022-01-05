package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.b.b3.c.c;
import m0.n.b.i;

/* compiled from: GetEventsPagingSource.kt */
public final class GetEventsPagingSource extends AbstractPagingSource<EventInClub> {
    public final ServerDataSource c;
    public final i0.e.a.a d;
    public final c e;

    /* compiled from: GetEventsPagingSource.kt */
    public interface a {
    }

    public GetEventsPagingSource(ServerDataSource serverDataSource, i0.e.a.a aVar, c cVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        i.e(cVar, "eventCache");
        this.c = serverDataSource;
        this.d = aVar;
        this.e = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r6, int r7, m0.l.c<? super h0.u.x.b<java.lang.Integer, com.clubhouse.android.data.models.local.EventInClub>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$1 r0 = (com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$1 r0 = new com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$1
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
            com.clubhouse.android.data.network.paging.GetEventsPagingSource r6 = (com.clubhouse.android.data.network.paging.GetEventsPagingSource) r6
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
            com.clubhouse.android.data.network.ServerDataSource$getEvents$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getEvents$2
            r2.<init>(r8, r6, r7, r3)
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r6 = r5
        L_0x004d:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$response$1 r7 = new com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$response$1
            r7.<init>(r6)
            com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$response$2 r0 = new com.clubhouse.android.data.network.paging.GetEventsPagingSource$query$response$2
            r0.<init>(r6)
            r8.b(r7, r0)
            java.lang.Object r7 = r8.a()
            com.clubhouse.android.data.models.remote.response.GetEventsResponse r7 = (com.clubhouse.android.data.models.remote.response.GetEventsResponse) r7
            i0.e.b.b3.c.c r6 = r6.e
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r8 = r7.a
            r6.b(r8)
            h0.u.x$b$b r6 = new h0.u.x$b$b
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r8 = r7.a
            if (r8 != 0) goto L_0x0071
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.c
        L_0x0071:
            java.lang.Integer r7 = r7.c
            r6.<init>(r8, r3, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.GetEventsPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
