package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.stripe.android.model.PaymentMethodOptionsParams;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.r.t1;
import kotlin.text.StringsKt__IndentKt;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: ValidateNumberViewModel.kt */
public final class ValidateNumberViewModel extends i0.e.b.a3.b.a<t1> {
    public static final /* synthetic */ int m = 0;
    public final OnboardingRepo n;
    public final i0.e.a.a o;
    public String p;
    public long q = System.nanoTime();
    public int r = 1;

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberViewModel(t1 t1Var, OnboardingRepo onboardingRepo, i0.e.a.a aVar) {
        super(t1Var);
        i.e(t1Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(aVar, "analytics");
        this.n = onboardingRepo;
        this.o = aVar;
        n(new l<t1, m0.i>(this) {
            public final /* synthetic */ ValidateNumberViewModel c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                t1 t1Var = (t1) obj;
                i.e(t1Var, "state");
                this.c.p = t1Var.a;
                return m0.i.a;
            }
        });
        ((AmplitudeAnalytics) aVar).a("Onboarding-PhoneVerify-Start");
    }

    public final void q(String str) {
        i.e(str, PaymentMethodOptionsParams.Blik.PARAM_CODE);
        if (!StringsKt__IndentKt.o(str)) {
            MavericksViewModel.f(this, new ValidateNumberViewModel$validateCode$1(this, str, (c<? super ValidateNumberViewModel$validateCode$1>) null), (d0) null, (m) null, ValidateNumberViewModel$validateCode$2.c, 3, (Object) null);
        }
    }

    /* compiled from: ValidateNumberViewModel.kt */
    public static final class a implements v<ValidateNumberViewModel, t1> {
        public final /* synthetic */ i0.e.b.c3.h.c<ValidateNumberViewModel, t1> a = new i0.e.b.c3.h.c<>(ValidateNumberViewModel.class);

        public a() {
        }

        public ValidateNumberViewModel create(j0 j0Var, t1 t1Var) {
            i.e(j0Var, "viewModelContext");
            i.e(t1Var, "state");
            return this.a.create(j0Var, t1Var);
        }

        public t1 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
