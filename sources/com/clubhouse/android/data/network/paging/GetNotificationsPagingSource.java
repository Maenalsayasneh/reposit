package com.clubhouse.android.data.network.paging;

import android.content.Context;
import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.b.b3.b.e.i;

/* compiled from: GetNotificationsPagingSource.kt */
public final class GetNotificationsPagingSource extends AbstractPagingSource<i> {
    public final ServerDataSource c;
    public final i0.e.a.a d;
    public final Context e;

    /* compiled from: GetNotificationsPagingSource.kt */
    public interface a {
    }

    public GetNotificationsPagingSource(ServerDataSource serverDataSource, i0.e.a.a aVar, Context context) {
        m0.n.b.i.e(serverDataSource, "fetcher");
        m0.n.b.i.e(aVar, "analytics");
        m0.n.b.i.e(context, "context");
        this.c = serverDataSource;
        this.d = aVar;
        this.e = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0094 A[EDGE_INSN: B:86:0x0094->B:25:0x0094 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r23, int r24, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.i>> r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof com.clubhouse.android.data.network.paging.GetNotificationsPagingSource$query$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.network.paging.GetNotificationsPagingSource$query$1 r2 = (com.clubhouse.android.data.network.paging.GetNotificationsPagingSource$query$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.network.paging.GetNotificationsPagingSource$query$1 r2 = new com.clubhouse.android.data.network.paging.GetNotificationsPagingSource$query$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0038
            if (r4 != r6) goto L_0x0030
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.network.paging.GetNotificationsPagingSource r2 = (com.clubhouse.android.data.network.paging.GetNotificationsPagingSource) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0051
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            i0.j.f.p.h.d4(r1)
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.c
            r2.c = r0
            r2.x = r6
            java.util.Objects.requireNonNull(r1)
            com.clubhouse.android.data.network.ServerDataSource$getNotifications$2 r4 = new com.clubhouse.android.data.network.ServerDataSource$getNotifications$2
            r4.<init>(r1, r5)
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r3) goto L_0x0050
            return r3
        L_0x0050:
            r2 = r0
        L_0x0051:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.network.paging.GetNotificationsPagingSource$query$response$1 r3 = new com.clubhouse.android.data.network.paging.GetNotificationsPagingSource$query$response$1
            r3.<init>(r2)
            com.clubhouse.android.shared.Result.c(r1, r5, r3, r6, r5)
            java.lang.Object r1 = r1.a()
            com.clubhouse.android.data.models.remote.response.PaginatedNotificationsResponse r1 = (com.clubhouse.android.data.models.remote.response.PaginatedNotificationsResponse) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List<com.clubhouse.android.data.models.local.notification.Notification> r4 = r1.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0071:
            boolean r8 = r4.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x0094
            java.lang.Object r8 = r4.next()
            r10 = r8
            com.clubhouse.android.data.models.local.notification.Notification r10 = (com.clubhouse.android.data.models.local.notification.Notification) r10
            com.clubhouse.android.data.models.local.notification.NotificationType r10 = r10.b
            com.clubhouse.android.data.models.local.notification.NotificationType r11 = com.clubhouse.android.data.models.local.notification.NotificationType.UNKNOWN
            if (r10 == r11) goto L_0x0086
            r9 = r6
        L_0x0086:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0071
            r7.add(r8)
            goto L_0x0071
        L_0x0094:
            java.util.Iterator r4 = r7.iterator()
        L_0x0098:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x01c2
            java.lang.Object r7 = r4.next()
            com.clubhouse.android.data.models.local.notification.Notification r7 = (com.clubhouse.android.data.models.local.notification.Notification) r7
            com.clubhouse.android.data.models.local.user.BasicUser r8 = r7.f
            if (r8 == 0) goto L_0x00b3
            i0.e.b.b3.a.a.e.p r10 = new i0.e.b.b3.a.a.e.p
            r10.<init>(r8)
            java.lang.String r11 = r8.x
            java.lang.String r8 = r8.d
            goto L_0x013c
        L_0x00b3:
            java.util.List<com.clubhouse.android.data.models.local.user.BasicUser> r8 = r7.k
            if (r8 == 0) goto L_0x00c0
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r8 = r9
            goto L_0x00c1
        L_0x00c0:
            r8 = r6
        L_0x00c1:
            if (r8 != 0) goto L_0x012d
            java.util.List<com.clubhouse.android.data.models.local.user.BasicUser> r8 = r7.k
            java.lang.Object r8 = m0.j.g.u(r8)
            com.clubhouse.android.data.models.local.user.BasicUser r8 = (com.clubhouse.android.data.models.local.user.BasicUser) r8
            i0.e.b.b3.a.a.e.p r10 = new i0.e.b.b3.a.a.e.p
            r10.<init>(r8)
            java.lang.String r11 = r8.x
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.List<com.clubhouse.android.data.models.local.user.BasicUser> r12 = r7.k
            java.util.Iterator r12 = r12.iterator()
        L_0x00dd:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00f4
            java.lang.Object r13 = r12.next()
            com.clubhouse.android.data.models.local.user.BasicUser r13 = (com.clubhouse.android.data.models.local.user.BasicUser) r13
            java.lang.String r13 = r13.d
            r8.append(r13)
            java.lang.String r13 = ", "
            r8.append(r13)
            goto L_0x00dd
        L_0x00f4:
            java.lang.Integer r12 = r7.l
            if (r12 != 0) goto L_0x00fd
            java.lang.String r8 = r8.toString()
            goto L_0x013c
        L_0x00fd:
            int r12 = r12.intValue()
            java.util.List<com.clubhouse.android.data.models.local.user.BasicUser> r13 = r7.k
            int r13 = r13.size()
            int r12 = r12 - r13
            if (r12 <= 0) goto L_0x0127
            android.content.Context r13 = r2.e
            android.content.res.Resources r13 = r13.getResources()
            int r14 = com.clubhouse.android.data.R.plurals.follow_overflow
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r12)
            r15[r9] = r6
            java.lang.String r6 = r13.getQuantityString(r14, r12, r15)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            goto L_0x012b
        L_0x0127:
            java.lang.String r6 = r8.toString()
        L_0x012b:
            r8 = r6
            goto L_0x013c
        L_0x012d:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r6 = r7.i
            if (r6 == 0) goto L_0x0142
            i0.e.b.b3.a.a.e.c r10 = new i0.e.b.b3.a.a.e.c
            int r8 = r6.x
            r10.<init>(r8)
            java.lang.String r11 = r6.d2
            java.lang.String r8 = r6.y
        L_0x013c:
            r17 = r8
            r14 = r10
            r16 = r11
            goto L_0x0147
        L_0x0142:
            r14 = r5
            r16 = r14
            r17 = r16
        L_0x0147:
            java.lang.String r6 = r7.h
            if (r6 == 0) goto L_0x0151
            i0.e.b.b3.a.a.e.o r8 = new i0.e.b.b3.a.a.e.o
            r8.<init>(r6)
            goto L_0x019c
        L_0x0151:
            com.clubhouse.android.data.models.local.notification.NotificationType r6 = r7.b
            com.clubhouse.android.data.models.local.notification.NotificationType r8 = com.clubhouse.android.data.models.local.notification.NotificationType.FOLLOW_US_ON_TWITTER
            if (r6 != r8) goto L_0x015a
            i0.e.b.b3.a.a.e.n r6 = i0.e.b.b3.a.a.e.n.a
            goto L_0x016c
        L_0x015a:
            com.clubhouse.android.data.models.local.notification.NotificationType r8 = com.clubhouse.android.data.models.local.notification.NotificationType.FOLLOWS_YOU_STACKED
            if (r6 != r8) goto L_0x0166
            i0.e.b.b3.a.a.e.f r6 = new i0.e.b.b3.a.a.e.f
            long r10 = r7.a
            r6.<init>(r10)
            goto L_0x016c
        L_0x0166:
            com.clubhouse.android.data.models.local.notification.NotificationType r8 = com.clubhouse.android.data.models.local.notification.NotificationType.DIRECT_PAYMENT_RECEIVED
            if (r6 != r8) goto L_0x016f
            i0.e.b.b3.a.a.e.m r6 = i0.e.b.b3.a.a.e.m.a
        L_0x016c:
            r21 = r6
            goto L_0x01a1
        L_0x016f:
            java.lang.String r6 = r7.g
            if (r6 == 0) goto L_0x0179
            i0.e.b.b3.a.a.e.b r8 = new i0.e.b.b3.a.a.e.b
            r8.<init>(r6)
            goto L_0x019c
        L_0x0179:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r6 = r7.i
            if (r6 == 0) goto L_0x0185
            i0.e.b.b3.a.a.e.d r8 = new i0.e.b.b3.a.a.e.d
            int r6 = r6.x
            r8.<init>(r6)
            goto L_0x019c
        L_0x0185:
            java.lang.Integer r6 = r7.j
            if (r6 == 0) goto L_0x0193
            i0.e.b.b3.a.a.e.e r8 = new i0.e.b.b3.a.a.e.e
            int r6 = r6.intValue()
            r8.<init>(r6)
            goto L_0x019c
        L_0x0193:
            com.clubhouse.android.data.models.local.user.BasicUser r6 = r7.f
            if (r6 == 0) goto L_0x019f
            i0.e.b.b3.a.a.e.q r8 = new i0.e.b.b3.a.a.e.q
            r8.<init>(r6)
        L_0x019c:
            r21 = r8
            goto L_0x01a1
        L_0x019f:
            r21 = r5
        L_0x01a1:
            i0.e.b.b3.b.e.i r6 = new i0.e.b.b3.b.e.i
            long r10 = r7.a
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r10)
            com.clubhouse.android.data.models.local.notification.NotificationType r15 = r7.b
            java.lang.String r8 = r7.d
            j$.time.OffsetDateTime r10 = r7.c
            java.lang.Boolean r7 = r7.e
            r12 = r6
            r18 = r8
            r19 = r10
            r20 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.add(r6)
            r6 = 1
            goto L_0x0098
        L_0x01c2:
            h0.u.x$b$b r2 = new h0.u.x$b$b
            java.lang.Integer r1 = r1.d
            r2.<init>(r3, r5, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.GetNotificationsPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
