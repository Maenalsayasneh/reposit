package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import com.clubhouse.android.shared.auth.UserManager;
import i0.e.a.a;
import m0.n.b.i;

/* compiled from: UserProfileDataSource.kt */
public final class UserProfileDataSource extends RefreshableDataSource<GetProfileResponse> {
    public final ServerDataSource e;
    public UserManager f;
    public final a g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserProfileDataSource(ServerDataSource serverDataSource, UserManager userManager, a aVar) {
        super(0);
        i.e(serverDataSource, "fetcher");
        i.e(userManager, "userManager");
        i.e(aVar, "analytics");
        this.e = serverDataSource;
        this.f = userManager;
        this.g = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetProfileResponse> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.network.UserProfileDataSource$makeRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.network.UserProfileDataSource$makeRequest$1 r0 = (com.clubhouse.android.data.network.UserProfileDataSource$makeRequest$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.UserProfileDataSource$makeRequest$1 r0 = new com.clubhouse.android.data.network.UserProfileDataSource$makeRequest$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r1 = r0.d
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.network.UserProfileDataSource r0 = (com.clubhouse.android.data.network.UserProfileDataSource) r0
            i0.j.f.p.h.d4(r8)
            goto L_0x0061
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0038:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.shared.auth.UserManager r8 = r7.f
            java.lang.Integer r8 = r8.b()
            com.clubhouse.android.data.network.ServerDataSource r2 = r7.e
            com.clubhouse.android.data.models.remote.request.UserRequest r5 = new com.clubhouse.android.data.models.remote.request.UserRequest
            r6 = 6
            r5.<init>((java.lang.Integer) r8, (java.lang.String) r4, (java.util.Map) r4, (int) r6)
            r0.c = r7
            r0.d = r8
            r0.y = r3
            java.util.Objects.requireNonNull(r2)
            com.clubhouse.android.data.network.ServerDataSource$getProfile$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$getProfile$2
            r6.<init>(r2, r5, r4)
            java.lang.Object r0 = r2.a(r6, r0)
            if (r0 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0061:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.network.UserProfileDataSource$makeRequest$2 r2 = new com.clubhouse.android.data.network.UserProfileDataSource$makeRequest$2
            r2.<init>(r0, r1)
            com.clubhouse.android.shared.Result.c(r8, r4, r2, r3, r4)
            java.lang.Object r8 = r8.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.UserProfileDataSource.c(m0.l.c):java.lang.Object");
    }
}
