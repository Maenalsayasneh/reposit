package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.ServerDataSource;
import m0.n.b.i;

/* compiled from: LanguageRepo.kt */
public final class LanguageRepo {
    public final ServerDataSource a;

    public LanguageRepo(ServerDataSource serverDataSource) {
        i.e(serverDataSource, "fetcher");
        this.a = serverDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super com.clubhouse.android.data.models.remote.response.LanguagePreferencesResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.LanguageRepo$getAllLanguages$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.LanguageRepo$getAllLanguages$1 r0 = (com.clubhouse.android.data.repos.LanguageRepo$getAllLanguages$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.LanguageRepo$getAllLanguages$1 r0 = new com.clubhouse.android.data.repos.LanguageRepo$getAllLanguages$1
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
            com.clubhouse.android.data.network.ServerDataSource$getLanguagePreferences$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getLanguagePreferences$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.LanguageRepo.a(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.util.List<com.clubhouse.android.data.models.local.Language> r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.LanguageRepo$updateLanguages$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.LanguageRepo$updateLanguages$1 r0 = (com.clubhouse.android.data.repos.LanguageRepo$updateLanguages$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.LanguageRepo$updateLanguages$1 r0 = new com.clubhouse.android.data.repos.LanguageRepo$updateLanguages$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r6)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r4.a
            com.clubhouse.android.data.models.remote.request.LanguagePreferencesRequest r2 = new com.clubhouse.android.data.models.remote.request.LanguagePreferencesRequest
            r2.<init>(r5)
            r0.q = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$updateLanguagePreferences$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$updateLanguagePreferences$2
            r3 = 0
            r5.<init>(r6, r2, r3)
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            java.lang.Object r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.LanguageRepo.b(java.util.List, m0.l.c):java.lang.Object");
    }
}
