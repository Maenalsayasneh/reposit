package i0.e.b.g3.r;

import android.content.Context;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.b.b.v;
import i0.e.b.c3.h.c;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: AddPhotoViewModel.kt */
public final class j0 extends i0.e.b.a3.b.a<i0> {
    public final OnboardingRepo m;
    public final Context n;
    public final i0.e.a.a o;

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(i0 i0Var, OnboardingRepo onboardingRepo, Context context, i0.e.a.a aVar) {
        super(i0Var);
        i.e(i0Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(context, "applicationContext");
        i.e(aVar, "analytics");
        this.m = onboardingRepo;
        this.n = context;
        this.o = aVar;
        ((AmplitudeAnalytics) aVar).a("Onboarding-Photo-Start");
    }

    /* compiled from: AddPhotoViewModel.kt */
    public static final class a implements v<j0, i0> {
        public final /* synthetic */ c<j0, i0> a = new c<>(j0.class);

        public a() {
        }

        public j0 create(i0.b.b.j0 j0Var, i0 i0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(i0Var, "state");
            return this.a.create(j0Var, i0Var);
        }

        public i0 initialState(i0.b.b.j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
