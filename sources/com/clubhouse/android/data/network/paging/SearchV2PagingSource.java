package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.models.remote.request.SearchV2Request;
import com.clubhouse.android.data.network.ServerDataSource;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.c.b;
import m0.n.b.i;

/* compiled from: SearchV2PagingSource.kt */
public final class SearchV2PagingSource extends AbstractPagingSource<j> {
    public final SearchV2Request c;
    public final ServerDataSource d;
    public final b e;

    /* compiled from: SearchV2PagingSource.kt */
    public interface a {
    }

    public SearchV2PagingSource(SearchV2Request searchV2Request, ServerDataSource serverDataSource, b bVar) {
        i.e(searchV2Request, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(serverDataSource, "fetcher");
        i.e(bVar, "clubCache");
        this.c = searchV2Request;
        this.d = serverDataSource;
        this.e = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: i0.e.b.b3.b.e.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: i0.e.b.b3.b.e.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: i0.e.b.b3.b.e.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: i0.e.b.b3.b.e.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: i0.e.b.b3.b.e.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: i0.e.b.b3.b.e.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: i0.e.b.b3.b.e.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: i0.e.b.b3.b.e.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: i0.e.b.b3.b.e.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r26, int r27, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.j>> r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            boolean r2 = r1 instanceof com.clubhouse.android.data.network.paging.SearchV2PagingSource$query$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.network.paging.SearchV2PagingSource$query$1 r2 = (com.clubhouse.android.data.network.paging.SearchV2PagingSource$query$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.network.paging.SearchV2PagingSource$query$1 r2 = new com.clubhouse.android.data.network.paging.SearchV2PagingSource$query$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.network.paging.SearchV2PagingSource r2 = (com.clubhouse.android.data.network.paging.SearchV2PagingSource) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.d
            com.clubhouse.android.data.models.remote.request.SearchV2Request r6 = r0.c
            r2.c = r0
            r2.x = r5
            java.util.Objects.requireNonNull(r1)
            com.clubhouse.android.data.network.ServerDataSource$search$2 r10 = new com.clubhouse.android.data.network.ServerDataSource$search$2
            r9 = 0
            r4 = r10
            r5 = r1
            r7 = r26
            r8 = r27
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.a(r10, r2)
            if (r1 != r3) goto L_0x0058
            return r3
        L_0x0058:
            r2 = r0
        L_0x0059:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            java.lang.Object r1 = r1.a()
            com.clubhouse.android.data.models.remote.response.PaginatedSearchItemsResponse r1 = (com.clubhouse.android.data.models.remote.response.PaginatedSearchItemsResponse) r1
            java.util.List<com.clubhouse.android.data.models.local.SearchItem> r3 = r1.a
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = i0.j.f.p.h.K(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0072:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0128
            java.lang.Object r5 = r3.next()
            com.clubhouse.android.data.models.local.SearchItem r5 = (com.clubhouse.android.data.models.local.SearchItem) r5
            java.lang.String r7 = "<this>"
            m0.n.b.i.e(r5, r7)
            com.clubhouse.android.data.models.local.user.UserInList r9 = r5.a
            if (r9 == 0) goto L_0x0099
            i0.e.b.b3.b.e.m r6 = new i0.e.b.b3.b.e.m
            r10 = 0
            r11 = 0
            r12 = 0
            java.util.Map<java.lang.String, java.lang.Object> r13 = r5.f
            r14 = 14
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r26 = r3
            goto L_0x0117
        L_0x0099:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r7 = r5.b
            if (r7 == 0) goto L_0x00aa
            i0.e.b.b3.b.e.e r8 = new i0.e.b.b3.b.e.e
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f
            r9 = 2
            r8.<init>(r7, r6, r5, r9)
            r26 = r3
            r6 = r8
            goto L_0x0117
        L_0x00aa:
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r6 = r5.c
            if (r6 == 0) goto L_0x00fc
            i0.e.b.b3.b.e.c r7 = new i0.e.b.b3.b.e.c
            java.util.Map<java.lang.String, java.lang.Object> r14 = r5.f
            java.util.List<com.clubhouse.android.data.models.local.user.UserInFeed> r8 = r6.c
            r9 = r8
            int r10 = r6.d
            int r11 = r6.q
            java.lang.Boolean r12 = r6.x
            java.lang.Boolean r13 = r6.y
            int r15 = r6.Z1
            java.lang.String r0 = r6.a2
            r16 = r0
            r26 = r3
            java.lang.String r3 = r6.b2
            r17 = r3
            boolean r3 = r6.c2
            r18 = r3
            boolean r3 = r6.d2
            r19 = r3
            com.clubhouse.android.data.models.local.user.BasicUser r3 = r6.e2
            r20 = r3
            com.clubhouse.android.data.models.local.user.BasicUser r3 = r6.f2
            r21 = r3
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r3 = r6.g2
            r22 = r3
            java.lang.String r3 = r6.h2
            r23 = r3
            int r3 = r6.i2
            r24 = r3
            java.lang.String r3 = "users"
            m0.n.b.i.e(r8, r3)
            java.lang.String r3 = "channel"
            m0.n.b.i.e(r0, r3)
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r0 = new com.clubhouse.android.data.models.local.channel.ChannelInFeed
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f
            r7.<init>(r0, r3)
            r6 = r7
            goto L_0x0117
        L_0x00fc:
            r26 = r3
            com.clubhouse.android.data.models.local.EventInClub r0 = r5.d
            if (r0 == 0) goto L_0x010b
            i0.e.b.b3.b.e.g r3 = new i0.e.b.b3.b.e.g
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f
            r3.<init>(r0, r5)
        L_0x0109:
            r6 = r3
            goto L_0x0117
        L_0x010b:
            com.clubhouse.android.data.models.local.explore.SearchQuery r0 = r5.e
            if (r0 == 0) goto L_0x0120
            i0.e.b.b3.b.e.l r3 = new i0.e.b.b3.b.e.l
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f
            r3.<init>(r0, r5)
            goto L_0x0109
        L_0x0117:
            r4.add(r6)
            r0 = r25
            r3 = r26
            goto L_0x0072
        L_0x0120:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "search item without an entity"
            r0.<init>(r1)
            throw r0
        L_0x0128:
            i0.e.b.b3.c.b r0 = r2.e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r4.iterator()
        L_0x0133:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r3.next()
            i0.e.b.b3.b.e.j r5 = (i0.e.b.b3.b.e.j) r5
            boolean r7 = r5 instanceof i0.e.b.b3.b.e.e
            if (r7 == 0) goto L_0x0146
            i0.e.b.b3.b.e.e r5 = (i0.e.b.b3.b.e.e) r5
            goto L_0x0147
        L_0x0146:
            r5 = r6
        L_0x0147:
            if (r5 != 0) goto L_0x014b
            r5 = r6
            goto L_0x014d
        L_0x014b:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r5 = r5.b
        L_0x014d:
            if (r5 == 0) goto L_0x0133
            r2.add(r5)
            goto L_0x0133
        L_0x0153:
            r0.b(r2)
            h0.u.x$b$b r0 = new h0.u.x$b$b
            java.lang.Integer r1 = r1.c
            r0.<init>(r4, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.SearchV2PagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
