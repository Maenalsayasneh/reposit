package com.clubhouse.android.ui.profile.settings;

import android.content.res.Resources;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.core.oauth.OAuthAuthentication;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.shared.auth.UserManager;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.u.t5;
import i0.e.b.g3.u.v5;
import i0.e.b.g3.u.w4;
import i0.e.b.g3.u.x4;
import i0.e.b.g3.u.z5.n0;
import i0.e.b.g3.u.z5.r0;
import i0.e.b.g3.u.z5.s0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: AccountViewModel.kt */
public final class AccountViewModel extends i0.e.b.a3.b.a<n0> {
    public static final /* synthetic */ int m = 0;
    public final UserManager n;
    public final OAuthAuthentication o;
    public final Resources p;
    public final UserRepo q;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.settings.AccountViewModel$1", f = "AccountViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.settings.AccountViewModel$1  reason: invalid class name */
    /* compiled from: AccountViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ AccountViewModel d;

        /* renamed from: com.clubhouse.android.ui.profile.settings.AccountViewModel$1$a */
        /* compiled from: kotlin-style lambda group */
        public static final class a extends Lambda implements l<n0, n0> {
            public static final a c = new a(0);
            public static final a d = new a(1);
            public final /* synthetic */ int q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(1);
                this.q = i;
            }

            public final Object invoke(Object obj) {
                int i = this.q;
                if (i == 0) {
                    n0 n0Var = (n0) obj;
                    i.e(n0Var, "$this$setState");
                    return n0.copy$default(n0Var, false, (String) null, false, (String) null, true, 15, (Object) null);
                } else if (i == 1) {
                    n0 n0Var2 = (n0) obj;
                    i.e(n0Var2, "$this$setState");
                    return n0.copy$default(n0Var2, false, (String) null, false, (String) null, false, 15, (Object) null);
                } else {
                    throw null;
                }
            }
        }

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            c cVar = (c) this.c;
            if (cVar instanceof r0) {
                AccountViewModel accountViewModel = this.d;
                int i = AccountViewModel.m;
                Objects.requireNonNull(accountViewModel);
                accountViewModel.m(AccountViewModel$disconnectInstagram$1.c);
                MavericksViewModel.f(accountViewModel, new AccountViewModel$disconnectInstagram$2(accountViewModel, (m0.l.c<? super AccountViewModel$disconnectInstagram$2>) null), (d0) null, (m) null, new AccountViewModel$disconnectInstagram$3(accountViewModel), 3, (Object) null);
            } else if (cVar instanceof s0) {
                AccountViewModel accountViewModel2 = this.d;
                int i2 = AccountViewModel.m;
                Objects.requireNonNull(accountViewModel2);
                accountViewModel2.m(AccountViewModel$disconnectTwitter$1.c);
                MavericksViewModel.f(accountViewModel2, new AccountViewModel$disconnectTwitter$2(accountViewModel2, (m0.l.c<? super AccountViewModel$disconnectTwitter$2>) null), (d0) null, (m) null, new AccountViewModel$disconnectTwitter$3(accountViewModel2), 3, (Object) null);
            } else if (cVar instanceof t5) {
                AccountViewModel accountViewModel3 = this.d;
                String str = ((t5) cVar).a;
                int i3 = AccountViewModel.m;
                Objects.requireNonNull(accountViewModel3);
                accountViewModel3.m(AccountViewModel$updateInstagramProfile$1.c);
                MavericksViewModel.f(accountViewModel3, new AccountViewModel$updateInstagramProfile$2(accountViewModel3, str, (m0.l.c<? super AccountViewModel$updateInstagramProfile$2>) null), (d0) null, (m) null, new AccountViewModel$updateInstagramProfile$3(accountViewModel3), 3, (Object) null);
            } else if (cVar instanceof v5) {
                AccountViewModel accountViewModel4 = this.d;
                String str2 = ((v5) cVar).a;
                int i4 = AccountViewModel.m;
                Objects.requireNonNull(accountViewModel4);
                accountViewModel4.m(AccountViewModel$updateTwitterProfile$1.c);
                m0.r.t.a.r.m.a1.a.E2(accountViewModel4.c, (e) null, (CoroutineStart) null, new AccountViewModel$updateTwitterProfile$2(accountViewModel4, str2, (m0.l.c<? super AccountViewModel$updateTwitterProfile$2>) null), 3, (Object) null);
            } else if (cVar instanceof w4) {
                AccountViewModel accountViewModel5 = this.d;
                a aVar = a.c;
                int i5 = AccountViewModel.m;
                accountViewModel5.m(aVar);
            } else if (cVar instanceof x4) {
                AccountViewModel accountViewModel6 = this.d;
                a aVar2 = a.d;
                int i6 = AccountViewModel.m;
                accountViewModel6.m(aVar2);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel(n0 n0Var, UserManager userManager, i0.e.b.f3.i.a aVar, OAuthAuthentication oAuthAuthentication, Resources resources) {
        super(n0Var);
        i.e(n0Var, "initialState");
        i.e(userManager, "userManager");
        i.e(aVar, "userComponentHandler");
        i.e(oAuthAuthentication, "oauthAuthentication");
        i.e(resources, "resources");
        this.n = userManager;
        this.o = oAuthAuthentication;
        this.p = resources;
        this.q = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        MavericksViewModel.f(this, new AccountViewModel$loadSelfProfile$1(this, (m0.l.c<? super AccountViewModel$loadSelfProfile$1>) null), (d0) null, (m) null, new AccountViewModel$loadSelfProfile$2(this), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(m0.l.c<? super android.content.Intent> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.ui.profile.settings.AccountViewModel$connectTwitterIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.ui.profile.settings.AccountViewModel$connectTwitterIntent$1 r0 = (com.clubhouse.android.ui.profile.settings.AccountViewModel$connectTwitterIntent$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.ui.profile.settings.AccountViewModel$connectTwitterIntent$1 r0 = new com.clubhouse.android.ui.profile.settings.AccountViewModel$connectTwitterIntent$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.c
            com.clubhouse.android.ui.profile.settings.AccountViewModel r0 = (com.clubhouse.android.ui.profile.settings.AccountViewModel) r0
            i0.j.f.p.h.d4(r5)
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r5)
            com.clubhouse.android.core.oauth.OAuthAuthentication r5 = r4.o
            r0.c = r4
            r0.x = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 != 0) goto L_0x0059
            i0.e.b.a3.b.d r1 = new i0.e.b.a3.b.d
            android.content.res.Resources r2 = r0.p
            r3 = 2131952920(0x7f130518, float:1.9542296E38)
            java.lang.String r2 = r2.getString(r3)
            r1.<init>(r2)
            r0.o(r1)
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.profile.settings.AccountViewModel.q(m0.l.c):java.lang.Object");
    }

    /* compiled from: AccountViewModel.kt */
    public static final class a implements v<AccountViewModel, n0> {
        public final /* synthetic */ i0.e.b.c3.h.c<AccountViewModel, n0> a = new i0.e.b.c3.h.c<>(AccountViewModel.class);

        public a() {
        }

        public AccountViewModel create(j0 j0Var, n0 n0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(n0Var, "state");
            return this.a.create(j0Var, n0Var);
        }

        public n0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
