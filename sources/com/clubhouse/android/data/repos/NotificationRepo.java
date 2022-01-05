package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.a.a;
import m0.n.b.i;

/* compiled from: NotificationRepo.kt */
public final class NotificationRepo {
    public final ServerDataSource a;
    public final a b;

    public NotificationRepo(ServerDataSource serverDataSource, a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.a = serverDataSource;
        this.b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetSettingsResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.NotificationRepo$getSettings$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.NotificationRepo$getSettings$1 r0 = (com.clubhouse.android.data.repos.NotificationRepo$getSettings$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.NotificationRepo$getSettings$1 r0 = new com.clubhouse.android.data.repos.NotificationRepo$getSettings$1
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
            com.clubhouse.android.data.network.ServerDataSource r5 = r4.a
            r0.q = r3
            java.util.Objects.requireNonNull(r5)
            com.clubhouse.android.data.network.ServerDataSource$getSettings$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getSettings$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.a(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(boolean r18, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableBackchannel$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableBackchannel$1 r2 = (com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableBackchannel$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableBackchannel$1 r2 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableBackchannel$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.NotificationRepo r2 = (com.clubhouse.android.data.repos.NotificationRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            if (r18 == 0) goto L_0x003f
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.YES
            goto L_0x0041
        L_0x003f:
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.NO
        L_0x0041:
            r8 = r1
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r4 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 509(0x1fd, float:7.13E-43)
            r6 = r4
            r6.<init>((com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15, (int) r16)
            r2.c = r0
            r2.x = r5
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r2 = r0
        L_0x0060:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableBackchannel$2 r3 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableBackchannel$2
            r3.<init>(r2)
            r2 = 0
            com.clubhouse.android.shared.Result.c(r1, r2, r3, r5, r2)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.b(boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(boolean r18, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableOther$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableOther$1 r2 = (com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableOther$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableOther$1 r2 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableOther$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.NotificationRepo r2 = (com.clubhouse.android.data.repos.NotificationRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            if (r18 == 0) goto L_0x003f
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.YES
            goto L_0x0041
        L_0x003f:
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.NO
        L_0x0041:
            r10 = r1
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r4 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 503(0x1f7, float:7.05E-43)
            r6 = r4
            r6.<init>((com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15, (int) r16)
            r2.c = r0
            r2.x = r5
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r2 = r0
        L_0x0060:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableOther$2 r3 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableOther$2
            r3.<init>(r2)
            r2 = 0
            com.clubhouse.android.shared.Result.c(r1, r2, r3, r5, r2)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.c(boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(boolean r18, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableRoom$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableRoom$1 r2 = (com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableRoom$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableRoom$1 r2 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableRoom$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.NotificationRepo r2 = (com.clubhouse.android.data.repos.NotificationRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            if (r18 == 0) goto L_0x003f
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.YES
            goto L_0x0041
        L_0x003f:
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.NO
        L_0x0041:
            r7 = r1
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r4 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 510(0x1fe, float:7.15E-43)
            r6 = r4
            r6.<init>((com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15, (int) r16)
            r2.c = r0
            r2.x = r5
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r2 = r0
        L_0x0060:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableRoom$2 r3 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableRoom$2
            r3.<init>(r2)
            r2 = 0
            com.clubhouse.android.shared.Result.c(r1, r2, r3, r5, r2)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.d(boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(boolean r18, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableSendFewer$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableSendFewer$1 r2 = (com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableSendFewer$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableSendFewer$1 r2 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableSendFewer$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.NotificationRepo r2 = (com.clubhouse.android.data.repos.NotificationRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            if (r18 == 0) goto L_0x003f
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.YES
            goto L_0x0041
        L_0x003f:
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.NO
        L_0x0041:
            r11 = r1
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r4 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 495(0x1ef, float:6.94E-43)
            r6 = r4
            r6.<init>((com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15, (int) r16)
            r2.c = r0
            r2.x = r5
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r2 = r0
        L_0x0060:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableSendFewer$2 r3 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableSendFewer$2
            r3.<init>(r2)
            r2 = 0
            com.clubhouse.android.shared.Result.c(r1, r2, r3, r5, r2)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.e(boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(boolean r18, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableTrending$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableTrending$1 r2 = (com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableTrending$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableTrending$1 r2 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableTrending$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.NotificationRepo r2 = (com.clubhouse.android.data.repos.NotificationRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0060
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            if (r18 == 0) goto L_0x003f
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.YES
            goto L_0x0041
        L_0x003f:
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.NO
        L_0x0041:
            r9 = r1
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r4 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 507(0x1fb, float:7.1E-43)
            r6 = r4
            r6.<init>((com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15, (int) r16)
            r2.c = r0
            r2.x = r5
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r2 = r0
        L_0x0060:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableTrending$2 r3 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationEnableTrending$2
            r3.<init>(r2)
            r2 = 0
            com.clubhouse.android.shared.Result.c(r1, r2, r3, r5, r2)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.f(boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(com.clubhouse.android.data.models.local.notification.NotificationPause r18, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.NotificationRepo$updateNotificationPause$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationPause$1 r2 = (com.clubhouse.android.data.repos.NotificationRepo$updateNotificationPause$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationPause$1 r2 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationPause$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.NotificationRepo r2 = (com.clubhouse.android.data.repos.NotificationRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x005a
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r4 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 479(0x1df, float:6.71E-43)
            r6 = r4
            r12 = r18
            r6.<init>((com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15, (int) r16)
            r2.c = r0
            r2.x = r5
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L_0x0059
            return r3
        L_0x0059:
            r2 = r0
        L_0x005a:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationPause$2 r3 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationPause$2
            r3.<init>(r2)
            r2 = 0
            com.clubhouse.android.shared.Result.c(r1, r2, r3, r5, r2)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.g(com.clubhouse.android.data.models.local.notification.NotificationPause, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(boolean r18, java.lang.String r19, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.NotificationRepo$updateNotificationToken$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationToken$1 r2 = (com.clubhouse.android.data.repos.NotificationRepo$updateNotificationToken$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationToken$1 r2 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationToken$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.NotificationRepo r2 = (com.clubhouse.android.data.repos.NotificationRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0061
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            if (r18 == 0) goto L_0x0041
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r4 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.YES
            goto L_0x0043
        L_0x0041:
            com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r4 = com.clubhouse.android.data.models.local.notification.NotificationEnableSetting.NO
        L_0x0043:
            r14 = r4
            com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r4 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 319(0x13f, float:4.47E-43)
            r6 = r4
            r13 = r19
            r6.<init>((com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15, (int) r16)
            r2.c = r0
            r2.x = r5
            java.lang.Object r1 = r1.c(r4, r2)
            if (r1 != r3) goto L_0x0060
            return r3
        L_0x0060:
            r2 = r0
        L_0x0061:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.NotificationRepo$updateNotificationToken$2 r3 = new com.clubhouse.android.data.repos.NotificationRepo$updateNotificationToken$2
            r3.<init>(r2)
            r2 = 0
            com.clubhouse.android.shared.Result.c(r1, r2, r3, r5, r2)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.NotificationRepo.h(boolean, java.lang.String, m0.l.c):java.lang.Object");
    }
}
