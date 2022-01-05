package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.a.a;
import m0.n.b.i;

/* compiled from: UpdatesRepo.kt */
public final class UpdatesRepo {
    public final ServerDataSource a;
    public final a b;

    public UpdatesRepo(ServerDataSource serverDataSource, a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.a = serverDataSource;
        this.b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super com.clubhouse.android.data.models.remote.response.CheckForUpdateResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.UpdatesRepo$checkForUpdates$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.UpdatesRepo$checkForUpdates$1 r0 = (com.clubhouse.android.data.repos.UpdatesRepo$checkForUpdates$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.UpdatesRepo$checkForUpdates$1 r0 = new com.clubhouse.android.data.repos.UpdatesRepo$checkForUpdates$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.UpdatesRepo r0 = (com.clubhouse.android.data.repos.UpdatesRepo) r0
            i0.j.f.p.h.d4(r6)
            goto L_0x004d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r5.a
            r0.c = r5
            r0.x = r4
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$checkForUpdate$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$checkForUpdate$2
            r2.<init>(r6, r3)
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
        L_0x004d:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            com.clubhouse.android.data.repos.UpdatesRepo$checkForUpdates$2 r1 = new com.clubhouse.android.data.repos.UpdatesRepo$checkForUpdates$2
            r1.<init>(r0)
            com.clubhouse.android.shared.Result.c(r6, r3, r1, r4, r3)
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.UpdatesRepo.a(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r5, int r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.UpdatesRepo$getReleaseNotes$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.UpdatesRepo$getReleaseNotes$1 r0 = (com.clubhouse.android.data.repos.UpdatesRepo$getReleaseNotes$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.UpdatesRepo$getReleaseNotes$1 r0 = new com.clubhouse.android.data.repos.UpdatesRepo$getReleaseNotes$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r7)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.a
            com.clubhouse.android.data.models.remote.request.ReleaseNotesRequest r2 = new com.clubhouse.android.data.models.remote.request.ReleaseNotesRequest
            r2.<init>(r5, r6)
            r0.q = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$getReleaseNotes$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$getReleaseNotes$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.UpdatesRepo.b(int, int, m0.l.c):java.lang.Object");
    }
}
