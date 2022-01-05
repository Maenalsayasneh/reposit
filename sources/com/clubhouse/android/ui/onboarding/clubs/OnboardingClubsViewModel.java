package com.clubhouse.android.ui.onboarding.clubs;

import android.content.res.Resources;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.shared.auth.UserManager;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.r.a3.d;
import i0.e.b.g3.r.k0;
import i0.e.b.g3.r.z2.e;
import i0.e.b.g3.r.z2.h;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.j.g;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: OnboardingClubsViewModel.kt */
public final class OnboardingClubsViewModel extends i0.e.b.a3.b.a<h> {
    public static final /* synthetic */ int m = 0;
    public final UserManager n;
    public final OnboardingRepo o;
    public final i0.e.a.a p;
    public final Resources q;
    public final ClubRepo r;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsViewModel$1", f = "OnboardingClubsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.clubs.OnboardingClubsViewModel$1  reason: invalid class name */
    /* compiled from: OnboardingClubsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.b.c, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ OnboardingClubsViewModel d;

        {
            this.d = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (c) obj2);
            r02.c = (i0.e.b.a3.b.c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i0.j.f.p.h.d4(obj);
            final i0.e.b.a3.b.c cVar = (i0.e.b.a3.b.c) this.c;
            if (cVar instanceof i0.e.b.g3.r.z2.i) {
                OnboardingClubsViewModel onboardingClubsViewModel = this.d;
                Club club = ((i0.e.b.g3.r.z2.i) cVar).a;
                int i = OnboardingClubsViewModel.m;
                Objects.requireNonNull(onboardingClubsViewModel);
                onboardingClubsViewModel.n(new OnboardingClubsViewModel$toggleClub$1(club, onboardingClubsViewModel));
            } else if (cVar instanceof e) {
                OnboardingClubsViewModel onboardingClubsViewModel2 = this.d;
                AnonymousClass1 r1 = new l<h, h>() {
                    public Object invoke(Object obj) {
                        h hVar = (h) obj;
                        i.e(hVar, "$this$setState");
                        return h.copy$default(hVar, false, (List) null, (String) null, g.e0(hVar.d, Integer.valueOf(((e) cVar).a.getId())), 7, (Object) null);
                    }
                };
                int i2 = OnboardingClubsViewModel.m;
                onboardingClubsViewModel2.m(r1);
            } else if (cVar instanceof k0) {
                OnboardingClubsViewModel.q(this.d);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingClubsViewModel(h hVar, i0.e.b.f3.i.a aVar, UserManager userManager, OnboardingRepo onboardingRepo, i0.e.a.a aVar2, Resources resources) {
        super(hVar);
        i.e(hVar, "initialState");
        i.e(aVar, "userComponentHandler");
        i.e(userManager, "userManager");
        i.e(onboardingRepo, "onboardingRepo");
        i.e(aVar2, "analytics");
        i.e(resources, "resources");
        this.n = userManager;
        this.o = onboardingRepo;
        this.p = aVar2;
        this.q = resources;
        this.r = ((i0.e.b.c3.i.a) i0.j.f.p.h.L0(aVar, i0.e.b.c3.i.a.class)).l();
        MavericksViewModel.f(this, new OnboardingClubsViewModel$loadSuggestedClubs$1(this, (c<? super OnboardingClubsViewModel$loadSuggestedClubs$1>) null), (d0) null, (m) null, new OnboardingClubsViewModel$loadSuggestedClubs$2(this), 3, (Object) null);
        ((AmplitudeAnalytics) aVar2).a("Onboarding-Clubs-Start");
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), this.c);
    }

    public static final void q(OnboardingClubsViewModel onboardingClubsViewModel) {
        ((AmplitudeAnalytics) onboardingClubsViewModel.p).a("Onboarding-Clubs-Done");
        onboardingClubsViewModel.o(new d(onboardingClubsViewModel.o.h(SourceLocation.ONBOARDING_CLUBS)));
    }

    /* compiled from: OnboardingClubsViewModel.kt */
    public static final class a implements v<OnboardingClubsViewModel, h> {
        public final /* synthetic */ i0.e.b.c3.h.c<OnboardingClubsViewModel, h> a = new i0.e.b.c3.h.c<>(OnboardingClubsViewModel.class);

        public a() {
        }

        public OnboardingClubsViewModel create(j0 j0Var, h hVar) {
            i.e(j0Var, "viewModelContext");
            i.e(hVar, "state");
            return this.a.create(j0Var, hVar);
        }

        public h initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
