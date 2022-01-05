package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.response.MeResponse;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import i0.e.a.a;
import m0.n.b.i;

/* compiled from: MeDataSource.kt */
public final class MeDataSource extends RefreshableDataSource<MeResponse> {
    public final ServerDataSource e;
    public final DeviceSharedPreferences f;
    public final a g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeDataSource(ServerDataSource serverDataSource, DeviceSharedPreferences deviceSharedPreferences, a aVar) {
        super(0);
        i.e(serverDataSource, "fetcher");
        i.e(deviceSharedPreferences, "devicePreferences");
        i.e(aVar, "analytics");
        this.e = serverDataSource;
        this.f = deviceSharedPreferences;
        this.g = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(m0.l.c<? super com.clubhouse.android.data.models.remote.response.MeResponse> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.clubhouse.android.data.network.MeDataSource$makeRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.clubhouse.android.data.network.MeDataSource$makeRequest$1 r0 = (com.clubhouse.android.data.network.MeDataSource$makeRequest$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.MeDataSource$makeRequest$1 r0 = new com.clubhouse.android.data.network.MeDataSource$makeRequest$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            long r1 = r0.d
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.network.MeDataSource r0 = (com.clubhouse.android.data.network.MeDataSource) r0
            i0.j.f.p.h.d4(r10)
            goto L_0x006c
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0036:
            i0.j.f.p.h.d4(r10)
            long r5 = java.lang.System.currentTimeMillis()
            com.clubhouse.android.data.network.ServerDataSource r10 = r9.e
            com.clubhouse.android.data.models.remote.request.MeRequest r2 = new com.clubhouse.android.data.models.remote.request.MeRequest
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()
            java.lang.String r7 = r7.getID()
            java.lang.String r8 = "getDefault().id"
            m0.n.b.i.d(r7, r8)
            com.clubhouse.android.shared.preferences.DeviceSharedPreferences r8 = r9.f
            java.lang.String r8 = r8.d
            r2.<init>(r4, r7, r4, r8)
            r0.c = r9
            r0.d = r5
            r0.y = r4
            java.util.Objects.requireNonNull(r10)
            com.clubhouse.android.data.network.ServerDataSource$me$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$me$2
            r7.<init>(r10, r2, r3)
            java.lang.Object r10 = r10.a(r7, r0)
            if (r10 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r0 = r9
            r1 = r5
        L_0x006c:
            com.clubhouse.android.shared.Result r10 = (com.clubhouse.android.shared.Result) r10
            com.clubhouse.android.data.network.MeDataSource$makeRequest$2 r5 = new com.clubhouse.android.data.network.MeDataSource$makeRequest$2
            r5.<init>(r0, r1)
            com.clubhouse.android.shared.Result.c(r10, r3, r5, r4, r3)
            java.lang.Object r10 = r10.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.MeDataSource.c(m0.l.c):java.lang.Object");
    }
}
