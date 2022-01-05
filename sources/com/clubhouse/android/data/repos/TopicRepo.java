package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.ServerDataSource;
import m0.n.b.i;

/* compiled from: TopicRepo.kt */
public final class TopicRepo {
    public final ServerDataSource a;

    public TopicRepo(ServerDataSource serverDataSource) {
        i.e(serverDataSource, "fetcher");
        this.a = serverDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.clubhouse.android.data.models.local.Topic r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.TopicRepo$addUserTopic$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.TopicRepo$addUserTopic$1 r0 = (com.clubhouse.android.data.repos.TopicRepo$addUserTopic$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.TopicRepo$addUserTopic$1 r0 = new com.clubhouse.android.data.repos.TopicRepo$addUserTopic$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r8)
            goto L_0x004e
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.a
            com.clubhouse.android.data.models.remote.request.TopicRequest r2 = new com.clubhouse.android.data.models.remote.request.TopicRequest
            int r7 = r7.c
            r4 = 2
            r5 = 0
            r2.<init>((int) r7, (java.lang.Integer) r5, (int) r4)
            r0.q = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$addUserTopic$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$addUserTopic$2
            r7.<init>(r8, r2, r5)
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L_0x004e
            return r1
        L_0x004e:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.TopicRepo.a(com.clubhouse.android.data.models.local.Topic, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetAllTopicsResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.TopicRepo$getAllTopics$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.TopicRepo$getAllTopics$1 r0 = (com.clubhouse.android.data.repos.TopicRepo$getAllTopics$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.TopicRepo$getAllTopics$1 r0 = new com.clubhouse.android.data.repos.TopicRepo$getAllTopics$1
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
            com.clubhouse.android.data.network.ServerDataSource$getAllTopics$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getAllTopics$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.TopicRepo.b(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(com.clubhouse.android.data.models.local.Topic r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.TopicRepo$removeUserTopic$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.TopicRepo$removeUserTopic$1 r0 = (com.clubhouse.android.data.repos.TopicRepo$removeUserTopic$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.TopicRepo$removeUserTopic$1 r0 = new com.clubhouse.android.data.repos.TopicRepo$removeUserTopic$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r8)
            goto L_0x004e
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.a
            com.clubhouse.android.data.models.remote.request.TopicRequest r2 = new com.clubhouse.android.data.models.remote.request.TopicRequest
            int r7 = r7.c
            r4 = 2
            r5 = 0
            r2.<init>((int) r7, (java.lang.Integer) r5, (int) r4)
            r0.q = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$removeUserTopic$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$removeUserTopic$2
            r7.<init>(r8, r2, r5)
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L_0x004e
            return r1
        L_0x004e:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.TopicRepo.c(com.clubhouse.android.data.models.local.Topic, m0.l.c):java.lang.Object");
    }
}
