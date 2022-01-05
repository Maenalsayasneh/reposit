package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.data.network.paging.GetNotificationsPagingSource;
import i0.e.b.b3.c.a;
import java.util.List;
import java.util.Objects;
import m0.j.g;
import m0.n.b.i;
import n0.a.g2.q;

/* compiled from: ActivityRepo.kt */
public final class ActivityRepo {
    public final ServerDataSource a;
    public final GetNotificationsPagingSource.a b;
    public final a c;
    public final i0.e.a.a d;

    public ActivityRepo(ServerDataSource serverDataSource, GetNotificationsPagingSource.a aVar, a aVar2, i0.e.a.a aVar3) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "getNotificationsPagingSourceFactory");
        i.e(aVar2, "cache");
        i.e(aVar3, "analytics");
        this.a = serverDataSource;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super n0.a.g2.d<? extends java.util.List<com.clubhouse.android.data.models.local.notification.ActionableNotification>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ActivityRepo$getActionableNotifications$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ActivityRepo$getActionableNotifications$1 r0 = (com.clubhouse.android.data.repos.ActivityRepo$getActionableNotifications$1) r0
            int r1 = r0.Y1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y1 = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ActivityRepo$getActionableNotifications$1 r0 = new com.clubhouse.android.data.repos.ActivityRepo$getActionableNotifications$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.Y1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r1 = r0.q
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ActivityRepo r0 = (com.clubhouse.android.data.repos.ActivityRepo) r0
            i0.j.f.p.h.d4(r9)
            goto L_0x0065
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            i0.j.f.p.h.d4(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.clubhouse.android.data.network.ServerDataSource r5 = r8.a
            r0.c = r8
            r0.d = r2
            r0.q = r9
            r0.Y1 = r4
            java.util.Objects.requireNonNull(r5)
            com.clubhouse.android.data.network.ServerDataSource$getActionableNotifications$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$getActionableNotifications$2
            r6.<init>(r5, r3)
            java.lang.Object r0 = r5.a(r6, r0)
            if (r0 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0065:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.ActivityRepo$getActionableNotifications$2 r5 = new com.clubhouse.android.data.repos.ActivityRepo$getActionableNotifications$2
            r5.<init>(r0)
            com.clubhouse.android.shared.Result.c(r9, r3, r5, r4, r3)
            java.lang.Object r9 = r9.a()
            com.clubhouse.android.data.models.remote.response.ActionableNotificationsResponse r9 = (com.clubhouse.android.data.models.remote.response.ActionableNotificationsResponse) r9
            java.util.List<com.clubhouse.android.data.models.local.notification.ActionableNotification> r9 = r9.a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0080:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x00a4
            java.lang.Object r5 = r9.next()
            r6 = r5
            com.clubhouse.android.data.models.local.notification.ActionableNotification r6 = (com.clubhouse.android.data.models.local.notification.ActionableNotification) r6
            com.clubhouse.android.data.models.local.notification.ActionableNotificationType r6 = r6.d
            com.clubhouse.android.data.models.local.notification.ActionableNotificationType r7 = com.clubhouse.android.data.models.local.notification.ActionableNotificationType.UNKNOWN
            if (r6 == r7) goto L_0x0095
            r6 = r4
            goto L_0x0096
        L_0x0095:
            r6 = 0
        L_0x0096:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0080
            r3.add(r5)
            goto L_0x0080
        L_0x00a4:
            java.util.Iterator r9 = r3.iterator()
        L_0x00a8:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00c2
            java.lang.Object r3 = r9.next()
            com.clubhouse.android.data.models.local.notification.ActionableNotification r3 = (com.clubhouse.android.data.models.local.notification.ActionableNotification) r3
            com.clubhouse.android.data.models.local.notification.ActionableNotificationType r4 = r3.d
            com.clubhouse.android.data.models.local.notification.ActionableNotificationType r5 = com.clubhouse.android.data.models.local.notification.ActionableNotificationType.ON_CLUBHOUSE
            if (r4 != r5) goto L_0x00be
            r2.add(r3)
            goto L_0x00a8
        L_0x00be:
            r1.add(r3)
            goto L_0x00a8
        L_0x00c2:
            i0.e.b.b3.c.a r9 = r0.c
            java.util.Objects.requireNonNull(r9)
            java.lang.String r0 = "notifications"
            m0.n.b.i.e(r2, r0)
            n0.a.g2.q<java.util.List<com.clubhouse.android.data.models.local.notification.ActionableNotification>> r9 = r9.a
            r9.setValue(r2)
            n0.a.g2.f r9 = new n0.a.g2.f
            r9.<init>(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ActivityRepo.a(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$1 r0 = (com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$1 r0 = new com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.ActivityRepo r5 = (com.clubhouse.android.data.repos.ActivityRepo) r5
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.a
            com.clubhouse.android.data.models.remote.request.IgnoreActionableNotificationRequest r2 = new com.clubhouse.android.data.models.remote.request.IgnoreActionableNotificationRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$ignoreActionableNotification$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$ignoreActionableNotification$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$2 r6 = new com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$3 r0 = new com.clubhouse.android.data.repos.ActivityRepo$ignoreNotification$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ActivityRepo.b(long, m0.l.c):java.lang.Object");
    }

    public final void c(ActionableNotification actionableNotification) {
        i.e(actionableNotification, "notification");
        a aVar = this.c;
        Objects.requireNonNull(aVar);
        i.e(actionableNotification, "notification");
        q<List<ActionableNotification>> qVar = aVar.a;
        qVar.setValue(g.Q(qVar.getValue(), actionableNotification));
    }
}
