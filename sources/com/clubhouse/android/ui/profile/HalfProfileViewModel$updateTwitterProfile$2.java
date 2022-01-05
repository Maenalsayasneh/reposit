package com.clubhouse.android.ui.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$updateTwitterProfile$2", f = "HalfProfileViewModel.kt", l = {340, 345}, m = "invokeSuspend")
/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$updateTwitterProfile$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public int d;
    public final /* synthetic */ HalfProfileViewModel q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$updateTwitterProfile$2(HalfProfileViewModel halfProfileViewModel, String str, m0.l.c<? super HalfProfileViewModel$updateTwitterProfile$2> cVar) {
        super(2, cVar);
        this.q = halfProfileViewModel;
        this.x = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new HalfProfileViewModel$updateTwitterProfile$2(this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new HalfProfileViewModel$updateTwitterProfile$2(this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[Catch:{ Exception -> 0x009e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.d
            java.lang.String r2 = "resources.getString(R.string.twitter_connect_error)"
            r3 = 2
            r4 = 2131952920(0x7f130518, float:1.9542296E38)
            r5 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r5) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            java.lang.Object r0 = r8.c
            i0.e.b.a3.c.a r0 = (i0.e.b.a3.c.a) r0
            i0.j.f.p.h.d4(r9)     // Catch:{ Exception -> 0x009e }
            goto L_0x004c
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            i0.j.f.p.h.d4(r9)     // Catch:{ Exception -> 0x009e }
            goto L_0x0037
        L_0x0025:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.ui.profile.HalfProfileViewModel r9 = r8.q     // Catch:{ Exception -> 0x009e }
            com.clubhouse.android.core.oauth.OAuthAuthentication r9 = r9.o     // Catch:{ Exception -> 0x009e }
            java.lang.String r1 = r8.x     // Catch:{ Exception -> 0x009e }
            r8.d = r5     // Catch:{ Exception -> 0x009e }
            java.lang.Object r9 = r9.c(r1, r8)     // Catch:{ Exception -> 0x009e }
            if (r9 != r0) goto L_0x0037
            return r0
        L_0x0037:
            i0.e.b.a3.c.a r9 = (i0.e.b.a3.c.a) r9     // Catch:{ Exception -> 0x009e }
            if (r9 == 0) goto L_0x008d
            com.clubhouse.android.ui.profile.HalfProfileViewModel r1 = r8.q     // Catch:{ Exception -> 0x009e }
            com.clubhouse.android.data.repos.UserRepo r1 = r1.s     // Catch:{ Exception -> 0x009e }
            r8.c = r9     // Catch:{ Exception -> 0x009e }
            r8.d = r3     // Catch:{ Exception -> 0x009e }
            java.lang.Object r1 = r1.B(r9, r8)     // Catch:{ Exception -> 0x009e }
            if (r1 != r0) goto L_0x004a
            return r0
        L_0x004a:
            r0 = r9
            r9 = r1
        L_0x004c:
            com.clubhouse.android.data.models.remote.response.EmptySuccessResponse r9 = (com.clubhouse.android.data.models.remote.response.EmptySuccessResponse) r9     // Catch:{ Exception -> 0x009e }
            boolean r9 = r9.a     // Catch:{ Exception -> 0x009e }
            if (r9 == 0) goto L_0x007c
            com.clubhouse.android.ui.profile.HalfProfileViewModel r9 = r8.q     // Catch:{ Exception -> 0x009e }
            i0.e.b.a3.b.e r1 = new i0.e.b.a3.b.e     // Catch:{ Exception -> 0x009e }
            android.content.res.Resources r2 = r9.p     // Catch:{ Exception -> 0x009e }
            r3 = 2131952921(0x7f130519, float:1.9542298E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x009e }
            r6 = 0
            java.lang.String r7 = r0.a     // Catch:{ Exception -> 0x009e }
            r5[r6] = r7     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = r2.getString(r3, r5)     // Catch:{ Exception -> 0x009e }
            java.lang.String r3 = "resources.getString(\n                                    R.string.twitter_connect_success,\n                                    twitterSession.username\n                                )"
            m0.n.b.i.d(r2, r3)     // Catch:{ Exception -> 0x009e }
            r1.<init>(r2)     // Catch:{ Exception -> 0x009e }
            r9.o(r1)     // Catch:{ Exception -> 0x009e }
            com.clubhouse.android.ui.profile.HalfProfileViewModel r9 = r8.q     // Catch:{ Exception -> 0x009e }
            com.clubhouse.android.ui.profile.HalfProfileViewModel$updateTwitterProfile$2$1 r1 = new com.clubhouse.android.ui.profile.HalfProfileViewModel$updateTwitterProfile$2$1     // Catch:{ Exception -> 0x009e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x009e }
            r9.m(r1)     // Catch:{ Exception -> 0x009e }
            goto L_0x00b7
        L_0x007c:
            com.clubhouse.android.core.oauth.TwitterAuthException r9 = new com.clubhouse.android.core.oauth.TwitterAuthException     // Catch:{ Exception -> 0x009e }
            com.clubhouse.android.ui.profile.HalfProfileViewModel r0 = r8.q     // Catch:{ Exception -> 0x009e }
            android.content.res.Resources r0 = r0.p     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = r0.getString(r4)     // Catch:{ Exception -> 0x009e }
            m0.n.b.i.d(r0, r2)     // Catch:{ Exception -> 0x009e }
            r9.<init>(r0)     // Catch:{ Exception -> 0x009e }
            throw r9     // Catch:{ Exception -> 0x009e }
        L_0x008d:
            com.clubhouse.android.core.oauth.TwitterAuthException r9 = new com.clubhouse.android.core.oauth.TwitterAuthException     // Catch:{ Exception -> 0x009e }
            com.clubhouse.android.ui.profile.HalfProfileViewModel r0 = r8.q     // Catch:{ Exception -> 0x009e }
            android.content.res.Resources r0 = r0.p     // Catch:{ Exception -> 0x009e }
            java.lang.String r0 = r0.getString(r4)     // Catch:{ Exception -> 0x009e }
            m0.n.b.i.d(r0, r2)     // Catch:{ Exception -> 0x009e }
            r9.<init>(r0)     // Catch:{ Exception -> 0x009e }
            throw r9     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            com.clubhouse.android.ui.profile.HalfProfileViewModel r9 = r8.q
            com.clubhouse.android.ui.profile.HalfProfileViewModel$updateTwitterProfile$2$2 r0 = com.clubhouse.android.ui.profile.HalfProfileViewModel$updateTwitterProfile$2.AnonymousClass2.c
            int r1 = com.clubhouse.android.ui.profile.HalfProfileViewModel.m
            r9.m(r0)
            com.clubhouse.android.ui.profile.HalfProfileViewModel r9 = r8.q
            i0.e.b.a3.b.d r0 = new i0.e.b.a3.b.d
            android.content.res.Resources r1 = r9.p
            java.lang.String r1 = r1.getString(r4)
            r0.<init>(r1)
            r9.o(r0)
        L_0x00b7:
            m0.i r9 = m0.i.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.profile.HalfProfileViewModel$updateTwitterProfile$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
