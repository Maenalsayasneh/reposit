package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource;
import i0.e.a.a;
import m0.n.b.i;

/* compiled from: PaymentsRepo.kt */
public final class PaymentsRepo {
    public final ServerDataSource a;
    public final GetRecentPaymentsPagingSource.a b;
    public final a c;

    public PaymentsRepo(ServerDataSource serverDataSource, GetRecentPaymentsPagingSource.a aVar, a aVar2) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "getRecentPaymentsPagingSourceFactory");
        i.e(aVar2, "analytics");
        this.a = serverDataSource;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r5, java.lang.String r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$1 r0 = (com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$1 r0 = new com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.PaymentsRepo r5 = (com.clubhouse.android.data.repos.PaymentsRepo) r5
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
            com.clubhouse.android.data.models.remote.request.AcknowledgePaymentRequest r2 = new com.clubhouse.android.data.models.remote.request.AcknowledgePaymentRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$acknowledgePayment$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$acknowledgePayment$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$2 r6 = new com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$3 r0 = new com.clubhouse.android.data.repos.PaymentsRepo$acknowledgePayment$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.PaymentsRepo.a(int, java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$1 r0 = (com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$1 r0 = new com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.PaymentsRepo r0 = (com.clubhouse.android.data.repos.PaymentsRepo) r0
            i0.j.f.p.h.d4(r5)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r5)
            com.clubhouse.android.data.network.ServerDataSource r5 = r4.a
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r5)
            com.clubhouse.android.data.network.ServerDataSource$registerForDirectPayment$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$registerForDirectPayment$2
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r4
        L_0x004d:
            com.clubhouse.android.shared.Result r5 = (com.clubhouse.android.shared.Result) r5
            com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$2 r1 = new com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$2
            r1.<init>(r0)
            com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$3 r2 = new com.clubhouse.android.data.repos.PaymentsRepo$registerForDirectPayment$3
            r2.<init>(r0)
            r5.b(r1, r2)
            java.lang.Object r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.PaymentsRepo.b(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(int r5, java.lang.String r6, int r7, java.lang.String r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.SendDirectPaymentResponse> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$1 r0 = (com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$1 r0 = new com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$1
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.PaymentsRepo r5 = (com.clubhouse.android.data.repos.PaymentsRepo) r5
            i0.j.f.p.h.d4(r9)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r4.a
            com.clubhouse.android.data.models.remote.request.SendDirectPaymentRequest r2 = new com.clubhouse.android.data.models.remote.request.SendDirectPaymentRequest
            r2.<init>(r5, r7, r6, r8)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$sendDirectPayment$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$sendDirectPayment$2
            r6 = 0
            r5.<init>(r9, r2, r6)
            java.lang.Object r9 = r9.a(r5, r0)
            if (r9 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$2 r6 = new com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$3 r7 = new com.clubhouse.android.data.repos.PaymentsRepo$sendDirectPayment$3
            r7.<init>(r5)
            r9.b(r6, r7)
            java.lang.Object r5 = r9.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.PaymentsRepo.c(int, java.lang.String, int, java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(boolean r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$1 r0 = (com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$1 r0 = new com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.PaymentsRepo r5 = (com.clubhouse.android.data.repos.PaymentsRepo) r5
            i0.j.f.p.h.d4(r6)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r4.a
            com.clubhouse.android.data.models.remote.request.UpdateReceivingPaymentsEnabledRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateReceivingPaymentsEnabledRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$updateReceivingPaymentsEnabled$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$updateReceivingPaymentsEnabled$2
            r3 = 0
            r5.<init>(r6, r2, r3)
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$2 r0 = new com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$2
            r0.<init>(r5)
            com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$3 r1 = new com.clubhouse.android.data.repos.PaymentsRepo$updateReceivingPaymentsEnabled$3
            r1.<init>(r5)
            r6.b(r0, r1)
            java.lang.Object r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.PaymentsRepo.d(boolean, m0.l.c):java.lang.Object");
    }
}
