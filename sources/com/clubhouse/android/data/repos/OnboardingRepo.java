package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.OnboardingDestination;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse;
import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.data.safetynet.SafetyNetClient;
import com.clubhouse.android.shared.auth.AccessCredential;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.android.user.model.UserSelf;
import i0.e.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import m0.j.g;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.q;

/* compiled from: OnboardingRepo.kt */
public final class OnboardingRepo {
    public final ServerDataSource a;
    public final UserManager b;
    public final a c;
    public final SafetyNetClient d;
    public final q<OnboardingState> e = a0.a(new OnboardingState((List) null, (List) null, (List) null, (List) null, 15));
    public List<? extends SourceLocation> f;
    public int g;
    public boolean h;
    public boolean i;
    public Boolean j;

    public OnboardingRepo(ServerDataSource serverDataSource, UserManager userManager, a aVar, SafetyNetClient safetyNetClient) {
        i.e(serverDataSource, "fetcher");
        i.e(userManager, "userManager");
        i.e(aVar, "analytics");
        i.e(safetyNetClient, "safetyNetClient");
        this.a = serverDataSource;
        this.b = userManager;
        this.c = aVar;
        this.d = safetyNetClient;
        Objects.requireNonNull(OnboardingDestination.Companion);
        this.f = OnboardingDestination.DEFAULT_SEQUENCE;
        this.g = 40;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, java.lang.String r19, m0.l.c<? super com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.OnboardingRepo$attestAndBuildValidationRequest$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.OnboardingRepo$attestAndBuildValidationRequest$1 r2 = (com.clubhouse.android.data.repos.OnboardingRepo$attestAndBuildValidationRequest$1) r2
            int r3 = r2.b2
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.b2 = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.OnboardingRepo$attestAndBuildValidationRequest$1 r2 = new com.clubhouse.android.data.repos.OnboardingRepo$attestAndBuildValidationRequest$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z1
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.b2
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0065
            if (r4 == r6) goto L_0x004c
            if (r4 != r5) goto L_0x0044
            java.lang.Object r3 = r2.y
            i0.e.b.b3.d.a r3 = (i0.e.b.b3.d.a) r3
            java.lang.Object r4 = r2.x
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.q
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.OnboardingRepo r2 = (com.clubhouse.android.data.repos.OnboardingRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x00e6
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            boolean r4 = r2.Y1
            java.lang.Object r6 = r2.x
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r2.q
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.c
            com.clubhouse.android.data.repos.OnboardingRepo r10 = (com.clubhouse.android.data.repos.OnboardingRepo) r10
            i0.j.f.p.h.d4(r1)
            r15 = r9
            r9 = r8
            r8 = r15
            goto L_0x008e
        L_0x0065:
            i0.j.f.p.h.d4(r1)
            com.clubhouse.android.data.safetynet.SafetyNetClient r1 = r0.d
            int r4 = r1.j
            if (r4 != 0) goto L_0x0070
            r4 = r6
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 == 0) goto L_0x0091
            r2.c = r0
            r8 = r17
            r2.d = r8
            r9 = r18
            r2.q = r9
            r10 = r19
            r2.x = r10
            r2.Y1 = r4
            r2.b2 = r6
            java.lang.Object r1 = r1.a(r2)
            if (r1 != r3) goto L_0x008c
            return r3
        L_0x008c:
            r6 = r10
            r10 = r0
        L_0x008e:
            i0.e.b.b3.d.a r1 = (i0.e.b.b3.d.a) r1
            goto L_0x009a
        L_0x0091:
            r8 = r17
            r9 = r18
            r10 = r19
            r1 = r7
            r6 = r10
            r10 = r0
        L_0x009a:
            if (r4 != 0) goto L_0x00a6
            i0.e.a.a r4 = r10.c
            com.clubhouse.analytics.AmplitudeAnalytics r4 = (com.clubhouse.analytics.AmplitudeAnalytics) r4
            java.lang.String r11 = "Token-SafetyNetShouldNotBeUsedInBuild-Error"
            r4.a(r11)
            goto L_0x00b3
        L_0x00a6:
            if (r4 == 0) goto L_0x00b3
            if (r1 != 0) goto L_0x00b3
            i0.e.a.a r4 = r10.c
            com.clubhouse.analytics.AmplitudeAnalytics r4 = (com.clubhouse.analytics.AmplitudeAnalytics) r4
            java.lang.String r11 = "Token-SafetyNetAttestationNullInBuild-Error"
            r4.a(r11)
        L_0x00b3:
            java.lang.Boolean r4 = r10.j
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r4 = m0.n.b.i.a(r4, r11)
            if (r4 == 0) goto L_0x00ee
            com.clubhouse.android.data.safetynet.SafetyNetClient r4 = r10.d
            r2.c = r10
            r2.d = r8
            r2.q = r9
            r2.x = r6
            r2.y = r1
            r2.b2 = r5
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.recaptcha.RecaptchaActionType r5 = new com.google.android.gms.recaptcha.RecaptchaActionType
            com.clubhouse.android.data.safetynet.RecaptchaCustomAction r11 = com.clubhouse.android.data.safetynet.RecaptchaCustomAction.Auth
            java.lang.String r11 = r11.getAction()
            r5.<init>(r11)
            java.lang.Object r2 = r4.b(r5, r2)
            if (r2 != r3) goto L_0x00e0
            return r3
        L_0x00e0:
            r3 = r1
            r1 = r2
            r4 = r6
            r6 = r8
            r5 = r9
            r2 = r10
        L_0x00e6:
            java.lang.String r1 = (java.lang.String) r1
            r14 = r1
            r10 = r2
            r1 = r3
            r11 = r4
            r9 = r5
            goto L_0x00f1
        L_0x00ee:
            r11 = r6
            r14 = r7
            r6 = r8
        L_0x00f1:
            java.lang.Boolean r2 = r10.j
            if (r2 != 0) goto L_0x00ff
            i0.e.a.a r2 = r10.c
            com.clubhouse.analytics.AmplitudeAnalytics r2 = (com.clubhouse.analytics.AmplitudeAnalytics) r2
            java.lang.String r3 = "Token-SendRcTokenNullInBuild-Error"
            r2.a(r3)
            goto L_0x0112
        L_0x00ff:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = m0.n.b.i.a(r2, r3)
            if (r2 == 0) goto L_0x0112
            if (r14 != 0) goto L_0x0112
            i0.e.a.a r2 = r10.c
            com.clubhouse.analytics.AmplitudeAnalytics r2 = (com.clubhouse.analytics.AmplitudeAnalytics) r2
            java.lang.String r3 = "Token-RecaptchaTokenNullInBuild-Error"
            r2.a(r3)
        L_0x0112:
            com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest r2 = new com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest
            if (r1 != 0) goto L_0x0118
            r12 = r7
            goto L_0x011b
        L_0x0118:
            java.lang.String r3 = r1.a
            r12 = r3
        L_0x011b:
            if (r1 != 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            java.lang.String r7 = r1.b
        L_0x0120:
            r13 = r7
            r8 = r2
            r10 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.a(java.lang.String, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r5 = (com.clubhouse.android.data.repos.OnboardingRepo) r5
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
            com.clubhouse.android.data.models.remote.request.ResendPhoneNumberAuthRequest r2 = new com.clubhouse.android.data.models.remote.request.ResendPhoneNumberAuthRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$callPhoneNumberAuth$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$callPhoneNumberAuth$2
            r3 = 0
            r5.<init>(r6, r2, r3)
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$2 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$2
            r0.<init>(r5)
            com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$3 r1 = new com.clubhouse.android.data.repos.OnboardingRepo$callPhoneNumber$3
            r1.<init>(r5)
            r6.b(r0, r1)
            java.lang.Object r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.b(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(m0.l.c<? super com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.OnboardingRepo$checkWaitlistStatus$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.OnboardingRepo$checkWaitlistStatus$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$checkWaitlistStatus$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$checkWaitlistStatus$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$checkWaitlistStatus$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r0 = (com.clubhouse.android.data.repos.OnboardingRepo) r0
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
            com.clubhouse.android.data.network.ServerDataSource$checkWaitlistStatus$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$checkWaitlistStatus$2
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r4
        L_0x004d:
            com.clubhouse.android.shared.Result r5 = (com.clubhouse.android.shared.Result) r5
            java.lang.Object r5 = r5.a()
            com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse r5 = (com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse) r5
            com.clubhouse.android.shared.auth.UserManager r0 = r0.b
            com.clubhouse.android.user.model.UserSelf r1 = r0.h()
            if (r1 != 0) goto L_0x005e
            goto L_0x0074
        L_0x005e:
            java.lang.String r2 = "user"
            m0.n.b.i.e(r1, r2)
            i0.e.b.f3.i.c r2 = r0.a
            r2.b(r1)
            r0.e(r1)
            i0.e.b.f3.i.c r0 = r0.a
            monitor-enter(r0)
            i0.e.b.f3.k.b r1 = r0.a     // Catch:{ all -> 0x0075 }
            r1.k()     // Catch:{ all -> 0x0075 }
            monitor-exit(r0)
        L_0x0074:
            return r5
        L_0x0075:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.c(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.util.List<java.lang.String> r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetSuggestedFollowsFriendsOnlyResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r8 = (com.clubhouse.android.data.repos.OnboardingRepo) r8
            i0.j.f.p.h.d4(r9)
            goto L_0x007b
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r7.a
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = i0.j.f.p.h.K(r8, r5)
            r4.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L_0x004c:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r8.next()
            java.lang.String r5 = (java.lang.String) r5
            com.clubhouse.android.data.models.local.Contact r6 = new com.clubhouse.android.data.models.local.Contact
            r6.<init>(r5)
            r4.add(r6)
            goto L_0x004c
        L_0x0061:
            com.clubhouse.android.data.models.remote.request.UploadContactsRequest r8 = new com.clubhouse.android.data.models.remote.request.UploadContactsRequest
            r5 = 0
            r8.<init>((java.lang.String) r5, (boolean) r2, (java.util.List) r4, (int) r3)
            r0.c = r7
            r0.x = r3
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$getSuggestedFollowsFriendsOnly$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getSuggestedFollowsFriendsOnly$2
            r2.<init>(r9, r8, r5)
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r8 = r7
        L_0x007b:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$3 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$3
            r0.<init>(r8)
            com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$4 r1 = new com.clubhouse.android.data.repos.OnboardingRepo$getFriendsFollowSuggestions$4
            r1.<init>(r8)
            r9.b(r0, r1)
            java.lang.Object r8 = r9.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.d(java.util.List, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(m0.l.c<? super com.clubhouse.android.data.models.remote.response.OnboardingSuggestedClubsResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedClubs$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedClubs$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedClubs$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedClubs$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedClubs$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r6)
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r5.a
            com.clubhouse.android.data.models.remote.request.OnboardingRequest r2 = new com.clubhouse.android.data.models.remote.request.OnboardingRequest
            n0.a.g2.q<com.clubhouse.android.data.models.remote.request.OnboardingState> r4 = r5.e
            java.lang.Object r4 = r4.getValue()
            com.clubhouse.android.data.models.remote.request.OnboardingState r4 = (com.clubhouse.android.data.models.remote.request.OnboardingState) r4
            r2.<init>(r4)
            r0.q = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$getOnboardingSuggestedClubs$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$getOnboardingSuggestedClubs$2
            r4 = 0
            r3.<init>(r6, r2, r4)
            java.lang.Object r6 = r6.a(r3, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.e(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(m0.l.c<? super com.clubhouse.android.data.models.remote.response.OnboardingSuggestedTopicsResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedTopics$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedTopics$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedTopics$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedTopics$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$getSuggestedTopics$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r6)
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r5.a
            com.clubhouse.android.data.models.remote.request.OnboardingRequest r2 = new com.clubhouse.android.data.models.remote.request.OnboardingRequest
            n0.a.g2.q<com.clubhouse.android.data.models.remote.request.OnboardingState> r4 = r5.e
            java.lang.Object r4 = r4.getValue()
            com.clubhouse.android.data.models.remote.request.OnboardingState r4 = (com.clubhouse.android.data.models.remote.request.OnboardingState) r4
            r2.<init>(r4)
            r0.q = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$getOnboardingSuggestedTopics$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$getOnboardingSuggestedTopics$2
            r4 = 0
            r3.<init>(r6, r2, r4)
            java.lang.Object r6 = r6.a(r3, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.f(m0.l.c):java.lang.Object");
    }

    public final void g(CompletePhoneNumberAuthResponse completePhoneNumberAuthResponse) {
        Boolean bool = completePhoneNumberAuthResponse.b;
        Boolean bool2 = Boolean.TRUE;
        if (i.a(bool, bool2)) {
            UserManager userManager = this.b;
            i.e(completePhoneNumberAuthResponse, "<this>");
            BasicUser basicUser = completePhoneNumberAuthResponse.d;
            if (basicUser == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (completePhoneNumberAuthResponse.e != null) {
                int intValue = basicUser.getId().intValue();
                BasicUser basicUser2 = completePhoneNumberAuthResponse.d;
                UserSelf userSelf = new UserSelf(intValue, basicUser2.d, basicUser2.q, basicUser2.x, new AccessCredential(basicUser2.getId().intValue(), completePhoneNumberAuthResponse.e));
                Objects.requireNonNull(userManager);
                i.e(userSelf, "user");
                userManager.a.b(userSelf);
                userManager.e(userSelf);
                this.h = i.a(completePhoneNumberAuthResponse.i, bool2);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public final OnboardingDestination h(SourceLocation sourceLocation) {
        OnboardingDestination onboardingDestination;
        i.e(sourceLocation, "fromScreen");
        List<T> a0 = g.a0(this.e.getValue().a, sourceLocation);
        q<OnboardingState> qVar = this.e;
        qVar.setValue(OnboardingState.a(qVar.getValue(), a0, (List) null, (List) null, (List) null, 14));
        Set<T> o02 = g.o0(this.f, a0);
        ArrayList arrayList = new ArrayList();
        for (T t : o02) {
            Objects.requireNonNull(OnboardingDestination.Companion);
            i.e(t, "sourceLocation");
            OnboardingDestination[] values = OnboardingDestination.values();
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    onboardingDestination = null;
                    break;
                }
                onboardingDestination = values[i2];
                if (onboardingDestination.getSourceLocation() == t) {
                    break;
                }
                i2++;
            }
            if (onboardingDestination != null) {
                arrayList.add(onboardingDestination);
            }
        }
        OnboardingDestination onboardingDestination2 = (OnboardingDestination) g.w(arrayList);
        return onboardingDestination2 == null ? OnboardingDestination.ONBOARDING_WELCOME : onboardingDestination2;
    }

    public final void i(List<Integer> list) {
        i.e(list, "ids");
        OnboardingState value = this.e.getValue();
        this.e.setValue(OnboardingState.a(value, (List) null, (List) null, (List) null, g.Z(value.d, list), 7));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r0 = (com.clubhouse.android.data.repos.OnboardingRepo) r0
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
            com.clubhouse.android.data.network.ServerDataSource$rejectWelcomeChannel$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$rejectWelcomeChannel$2
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r4
        L_0x004d:
            com.clubhouse.android.shared.Result r5 = (com.clubhouse.android.shared.Result) r5
            com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$2 r1 = new com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$2
            r1.<init>(r0)
            com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$3 r2 = new com.clubhouse.android.data.repos.OnboardingRepo$rejectWelcomeChannel$3
            r2.<init>(r0)
            r5.b(r1, r2)
            java.lang.Object r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.j(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.lang.String r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r5 = (com.clubhouse.android.data.repos.OnboardingRepo) r5
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
            com.clubhouse.android.data.models.remote.request.ResendPhoneNumberAuthRequest r2 = new com.clubhouse.android.data.models.remote.request.ResendPhoneNumberAuthRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$resendPhoneNumberAuth$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$resendPhoneNumberAuth$2
            r3 = 0
            r5.<init>(r6, r2, r3)
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$2 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$2
            r0.<init>(r5)
            com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$3 r1 = new com.clubhouse.android.data.repos.OnboardingRepo$resendValidationCode$3
            r1.<init>(r5)
            r6.b(r0, r1)
            java.lang.Object r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.k(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r11, java.lang.Boolean r12, m0.l.c<? super com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r11 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r11 = (com.clubhouse.android.data.repos.OnboardingRepo) r11
            i0.j.f.p.h.d4(r13)
            goto L_0x0063
        L_0x002b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0033:
            i0.j.f.p.h.d4(r13)
            n0.a.g2.q<com.clubhouse.android.data.models.remote.request.OnboardingState> r13 = r10.e
            com.clubhouse.android.data.models.remote.request.OnboardingState r2 = new com.clubhouse.android.data.models.remote.request.OnboardingState
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r4 = r2
            r4.<init>((java.util.List) r5, (java.util.List) r6, (java.util.List) r7, (java.util.List) r8, (int) r9)
            r13.setValue(r2)
            com.clubhouse.android.data.network.ServerDataSource r13 = r10.a
            com.clubhouse.android.data.models.remote.request.StartPhoneNumberAuthRequest r2 = new com.clubhouse.android.data.models.remote.request.StartPhoneNumberAuthRequest
            r2.<init>(r11, r12)
            r0.c = r10
            r0.x = r3
            java.util.Objects.requireNonNull(r13)
            com.clubhouse.android.data.network.ServerDataSource$startPhoneNumberAuth$2 r11 = new com.clubhouse.android.data.network.ServerDataSource$startPhoneNumberAuth$2
            r12 = 0
            r11.<init>(r13, r2, r12)
            java.lang.Object r13 = r13.a(r11, r0)
            if (r13 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r11 = r10
        L_0x0063:
            com.clubhouse.android.shared.Result r13 = (com.clubhouse.android.shared.Result) r13
            com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$response$1 r12 = new com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$response$1
            r12.<init>(r11)
            com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$response$2 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$startPhoneNumberAuth$response$2
            r0.<init>(r11)
            r13.b(r12, r0)
            java.lang.Object r12 = r13.a()
            com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse r12 = (com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse) r12
            java.lang.Boolean r13 = r12.b
            r11.j = r13
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.l(java.lang.String, java.lang.Boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.lang.String r5, java.lang.String r6, m0.l.c<? super com.clubhouse.android.data.models.remote.request.SuggestUsernameResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r5 = (com.clubhouse.android.data.repos.OnboardingRepo) r5
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
            com.clubhouse.android.data.models.remote.request.SuggestUsernameRequest r2 = new com.clubhouse.android.data.models.remote.request.SuggestUsernameRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$suggestUsername$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$suggestUsername$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$2 r6 = new com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$3 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$suggestUsername$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.m(java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(java.lang.String r13, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.clubhouse.android.data.repos.OnboardingRepo$updateName$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.clubhouse.android.data.repos.OnboardingRepo$updateName$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$updateName$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$updateName$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$updateName$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r13 = r0.d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r0 = (com.clubhouse.android.data.repos.OnboardingRepo) r0
            i0.j.f.p.h.d4(r14)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            i0.j.f.p.h.d4(r14)
            com.clubhouse.android.data.network.ServerDataSource r14 = r12.a
            com.clubhouse.android.data.models.remote.request.UpdateNameRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateNameRequest
            r2.<init>(r13)
            r0.c = r12
            r0.d = r13
            r0.y = r3
            java.util.Objects.requireNonNull(r14)
            com.clubhouse.android.data.network.ServerDataSource$updateName$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$updateName$2
            r3.<init>(r14, r2, r4)
            java.lang.Object r14 = r14.a(r3, r0)
            if (r14 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r12
        L_0x0058:
            r7 = r13
            com.clubhouse.android.shared.Result r14 = (com.clubhouse.android.shared.Result) r14
            com.clubhouse.android.data.repos.OnboardingRepo$updateName$2 r13 = new com.clubhouse.android.data.repos.OnboardingRepo$updateName$2
            r13.<init>(r0)
            com.clubhouse.android.data.repos.OnboardingRepo$updateName$3 r1 = new com.clubhouse.android.data.repos.OnboardingRepo$updateName$3
            r1.<init>(r0)
            r14.b(r13, r1)
            java.lang.Object r13 = r14.a()
            r14 = r13
            com.clubhouse.android.data.models.remote.response.EmptySuccessResponse r14 = (com.clubhouse.android.data.models.remote.response.EmptySuccessResponse) r14
            com.clubhouse.android.shared.auth.UserManager r14 = r0.b
            r1 = 6
            com.clubhouse.android.shared.auth.UserManager.g(r14, r7, r4, r4, r1)
            com.clubhouse.android.shared.auth.UserManager r14 = r0.b
            com.clubhouse.android.user.model.UserSelf r5 = r14.h()
            if (r5 != 0) goto L_0x007e
            goto L_0x008d
        L_0x007e:
            com.clubhouse.android.shared.auth.UserManager r14 = r0.b
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 29
            com.clubhouse.android.user.model.UserSelf r0 = com.clubhouse.android.user.model.UserSelf.a(r5, r6, r7, r8, r9, r10, r11)
            r14.a(r0)
        L_0x008d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.n(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(i0.e.b.b3.b.d r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r5 = (com.clubhouse.android.data.repos.OnboardingRepo) r5
            i0.j.f.p.h.d4(r6)
            goto L_0x0055
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r6)
            java.lang.String r6 = "file"
            java.lang.String r2 = "image.jpg"
            q0.z$c r5 = q0.z.c.b(r6, r2, r5)
            com.clubhouse.android.data.network.ServerDataSource r6 = r4.a
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$updatePhoto$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$updatePhoto$2
            r3 = 0
            r2.<init>(r6, r5, r3)
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r5 = r4
        L_0x0055:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$2 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$2
            r0.<init>(r5)
            com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$3 r1 = new com.clubhouse.android.data.repos.OnboardingRepo$updatePhoto$3
            r1.<init>(r5)
            r6.b(r0, r1)
            java.lang.Object r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.o(i0.e.b.b3.b.d, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(java.lang.String r13, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r13 = r0.d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r0 = (com.clubhouse.android.data.repos.OnboardingRepo) r0
            i0.j.f.p.h.d4(r14)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            i0.j.f.p.h.d4(r14)
            com.clubhouse.android.data.network.ServerDataSource r14 = r12.a
            com.clubhouse.android.data.models.remote.request.UpdateUsernameRequest r2 = new com.clubhouse.android.data.models.remote.request.UpdateUsernameRequest
            r2.<init>(r13)
            r0.c = r12
            r0.d = r13
            r0.y = r3
            java.util.Objects.requireNonNull(r14)
            com.clubhouse.android.data.network.ServerDataSource$updateUsername$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$updateUsername$2
            r3.<init>(r14, r2, r4)
            java.lang.Object r14 = r14.a(r3, r0)
            if (r14 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r12
        L_0x0058:
            r8 = r13
            com.clubhouse.android.shared.Result r14 = (com.clubhouse.android.shared.Result) r14
            com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$2 r13 = new com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$2
            r13.<init>(r0)
            com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$3 r1 = new com.clubhouse.android.data.repos.OnboardingRepo$updateUsername$3
            r1.<init>(r0)
            r14.b(r13, r1)
            java.lang.Object r13 = r14.a()
            r14 = r13
            com.clubhouse.android.data.models.remote.response.EmptySuccessResponse r14 = (com.clubhouse.android.data.models.remote.response.EmptySuccessResponse) r14
            com.clubhouse.android.shared.auth.UserManager r14 = r0.b
            r1 = 5
            com.clubhouse.android.shared.auth.UserManager.g(r14, r4, r8, r4, r1)
            com.clubhouse.android.shared.auth.UserManager r14 = r0.b
            com.clubhouse.android.user.model.UserSelf r5 = r14.h()
            if (r5 != 0) goto L_0x007e
            goto L_0x008d
        L_0x007e:
            com.clubhouse.android.shared.auth.UserManager r14 = r0.b
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 27
            com.clubhouse.android.user.model.UserSelf r0 = com.clubhouse.android.user.model.UserSelf.a(r5, r6, r7, r8, r9, r10, r11)
            r14.a(r0)
        L_0x008d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.p(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(java.lang.String r7, java.lang.String r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r7 = (com.clubhouse.android.data.repos.OnboardingRepo) r7
            i0.j.f.p.h.d4(r9)
            goto L_0x0065
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r7 = (com.clubhouse.android.data.repos.OnboardingRepo) r7
            i0.j.f.p.h.d4(r9)
            goto L_0x004e
        L_0x003f:
            i0.j.f.p.h.d4(r9)
            r0.c = r6
            r0.x = r5
            java.lang.Object r9 = r6.a(r3, r7, r8, r0)
            if (r9 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r7 = r6
        L_0x004e:
            com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest r9 = (com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest) r9
            com.clubhouse.android.data.network.ServerDataSource r8 = r7.a
            r0.c = r7
            r0.x = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$completePhoneNumberAuth$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$completePhoneNumberAuth$2
            r2.<init>(r8, r9, r3)
            java.lang.Object r9 = r8.a(r2, r0)
            if (r9 != r1) goto L_0x0065
            return r1
        L_0x0065:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$response$1 r8 = new com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$response$1
            r8.<init>(r7)
            com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$response$2 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithCode$response$2
            r0.<init>(r7)
            r9.b(r8, r0)
            java.lang.Object r8 = r9.a()
            com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse r8 = (com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse) r8
            int r9 = r8.m
            r7.g = r9
            java.util.List<com.clubhouse.android.data.models.local.user.SourceLocation> r9 = r8.n
            if (r9 != 0) goto L_0x008b
            com.clubhouse.android.data.models.local.OnboardingDestination$a r9 = com.clubhouse.android.data.models.local.OnboardingDestination.Companion
            java.util.Objects.requireNonNull(r9)
            java.util.List r9 = com.clubhouse.android.data.models.local.OnboardingDestination.DEFAULT_SEQUENCE
        L_0x008b:
            java.lang.String r0 = "<set-?>"
            m0.n.b.i.e(r9, r0)
            r7.f = r9
            java.util.List<java.lang.String> r9 = r8.l
            r0 = 0
            if (r9 != 0) goto L_0x0098
            goto L_0x00a5
        L_0x0098:
            com.clubhouse.android.data.repos.OnboardingRepo$Companion$OnboardingFlag r1 = com.clubhouse.android.data.repos.OnboardingRepo$Companion$OnboardingFlag.EnableSuggestUsername
            java.lang.String r1 = r1.getKey()
            boolean r9 = r9.contains(r1)
            if (r9 != r5) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r5 = r0
        L_0x00a6:
            r7.i = r5
            r7.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.q(java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.lang.String r7, java.lang.String r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithSinch$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithSinch$1 r0 = (com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithSinch$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithSinch$1 r0 = new com.clubhouse.android.data.repos.OnboardingRepo$validatePhoneNumberWithSinch$1
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r7 = (com.clubhouse.android.data.repos.OnboardingRepo) r7
            i0.j.f.p.h.d4(r9)
            goto L_0x0065
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.OnboardingRepo r7 = (com.clubhouse.android.data.repos.OnboardingRepo) r7
            i0.j.f.p.h.d4(r9)
            goto L_0x004e
        L_0x003f:
            i0.j.f.p.h.d4(r9)
            r0.c = r6
            r0.x = r5
            java.lang.Object r9 = r6.a(r7, r3, r8, r0)
            if (r9 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r7 = r6
        L_0x004e:
            com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest r9 = (com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest) r9
            com.clubhouse.android.data.network.ServerDataSource r8 = r7.a
            r0.c = r7
            r0.x = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$completeFlashcallAuth$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$completeFlashcallAuth$2
            r2.<init>(r8, r9, r3)
            java.lang.Object r9 = r8.a(r2, r0)
            if (r9 != r1) goto L_0x0065
            return r1
        L_0x0065:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            java.lang.Object r8 = r9.a()
            com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse r8 = (com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse) r8
            int r9 = r8.m
            r7.g = r9
            java.util.List<com.clubhouse.android.data.models.local.user.SourceLocation> r9 = r8.n
            if (r9 != 0) goto L_0x007e
            com.clubhouse.android.data.models.local.OnboardingDestination$a r9 = com.clubhouse.android.data.models.local.OnboardingDestination.Companion
            java.util.Objects.requireNonNull(r9)
            java.util.List r9 = com.clubhouse.android.data.models.local.OnboardingDestination.DEFAULT_SEQUENCE
        L_0x007e:
            java.lang.String r0 = "<set-?>"
            m0.n.b.i.e(r9, r0)
            r7.f = r9
            java.util.List<java.lang.String> r9 = r8.l
            r0 = 0
            if (r9 != 0) goto L_0x008b
            goto L_0x0098
        L_0x008b:
            com.clubhouse.android.data.repos.OnboardingRepo$Companion$OnboardingFlag r1 = com.clubhouse.android.data.repos.OnboardingRepo$Companion$OnboardingFlag.EnableSuggestUsername
            java.lang.String r1 = r1.getKey()
            boolean r9 = r9.contains(r1)
            if (r9 != r5) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r5 = r0
        L_0x0099:
            r7.i = r5
            r7.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.OnboardingRepo.r(java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }
}
