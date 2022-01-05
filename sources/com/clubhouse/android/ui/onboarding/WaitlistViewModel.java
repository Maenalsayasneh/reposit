package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.android.user.model.UserSelf;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.r.u2;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: WaitlistViewModel.kt */
public final class WaitlistViewModel extends i0.e.b.a3.b.a<u2> {
    public final OnboardingRepo m;
    public final i0.e.a.a n;
    public final UserManager o;

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaitlistViewModel(u2 u2Var, OnboardingRepo onboardingRepo, i0.e.a.a aVar, UserManager userManager) {
        super(u2Var);
        i.e(u2Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(aVar, "analytics");
        i.e(userManager, "userManager");
        this.m = onboardingRepo;
        this.n = aVar;
        this.o = userManager;
        String str = u2Var.a;
        if (str == null || str.length() == 0) {
            m(new l<u2, u2>(this) {
                public final /* synthetic */ WaitlistViewModel c;

                {
                    this.c = r1;
                }

                public Object invoke(Object obj) {
                    String str;
                    u2 u2Var = (u2) obj;
                    i.e(u2Var, "$this$setState");
                    UserSelf h = this.c.o.h();
                    if (h == null) {
                        str = null;
                    } else {
                        str = h.c;
                    }
                    return u2.copy$default(u2Var, str, false, 2, (Object) null);
                }
            });
        }
        MavericksViewModel.f(this, new WaitlistViewModel$checkWaitlistStatus$1(this, (c<? super WaitlistViewModel$checkWaitlistStatus$1>) null), (d0) null, (m) null, new WaitlistViewModel$checkWaitlistStatus$2(this), 3, (Object) null);
    }

    /* compiled from: WaitlistViewModel.kt */
    public static final class a implements v<WaitlistViewModel, u2> {
        public final /* synthetic */ i0.e.b.c3.h.c<WaitlistViewModel, u2> a = new i0.e.b.c3.h.c<>(WaitlistViewModel.class);

        public a() {
        }

        public WaitlistViewModel create(j0 j0Var, u2 u2Var) {
            i.e(j0Var, "viewModelContext");
            i.e(u2Var, "state");
            return this.a.create(j0Var, u2Var);
        }

        public u2 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
