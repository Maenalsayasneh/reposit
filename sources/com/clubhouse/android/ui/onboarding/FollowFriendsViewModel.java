package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.data.repos.PhoneContactsRepo;
import com.clubhouse.android.data.repos.UserRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.r.a2;
import i0.e.b.g3.r.a3.d;
import i0.e.b.g3.r.c1;
import i0.e.b.g3.r.e1;
import i0.e.b.g3.r.z1;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: FollowFriendsViewModel.kt */
public final class FollowFriendsViewModel extends i0.e.b.a3.b.a<e1> {
    public static final /* synthetic */ int m = 0;
    public final OnboardingRepo n;
    public final i0.e.a.a o;
    public final i0.e.a.b.a p;
    public final UserRepo q;
    public final PhoneContactsRepo r;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.FollowFriendsViewModel$1", f = "FollowFriendsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.FollowFriendsViewModel$1  reason: invalid class name */
    /* compiled from: FollowFriendsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ FollowFriendsViewModel d;

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
            if (cVar instanceof z1) {
                FollowFriendsViewModel followFriendsViewModel = this.d;
                UserInList userInList = ((z1) cVar).a;
                int i = FollowFriendsViewModel.m;
                Objects.requireNonNull(followFriendsViewModel);
                followFriendsViewModel.n(new FollowFriendsViewModel$toggleFollow$1(userInList, followFriendsViewModel));
            } else if (cVar instanceof a2) {
                FollowFriendsViewModel followFriendsViewModel2 = this.d;
                int i2 = FollowFriendsViewModel.m;
                Objects.requireNonNull(followFriendsViewModel2);
                followFriendsViewModel2.n(new FollowFriendsViewModel$toggleSuggestions$1(followFriendsViewModel2));
            } else if (cVar instanceof c1) {
                FollowFriendsViewModel followFriendsViewModel3 = this.d;
                int i3 = FollowFriendsViewModel.m;
                Objects.requireNonNull(followFriendsViewModel3);
                followFriendsViewModel3.n(new FollowFriendsViewModel$followMultiple$1(followFriendsViewModel3));
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsViewModel(e1 e1Var, OnboardingRepo onboardingRepo, i0.e.a.a aVar, i0.e.b.f3.i.a aVar2, i0.e.a.b.a aVar3) {
        super(e1Var);
        Class cls = i0.e.b.c3.i.a.class;
        i.e(e1Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(aVar, "analytics");
        i.e(aVar2, "userComponentHandler");
        i.e(aVar3, "actionTrailRecorder");
        this.n = onboardingRepo;
        this.o = aVar;
        this.p = aVar3;
        this.q = ((i0.e.b.c3.i.a) h.L0(aVar2, cls)).c();
        this.r = ((i0.e.b.c3.i.a) h.L0(aVar2, cls)).g();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        MavericksViewModel.f(this, new FollowFriendsViewModel$getFriendsFollowSuggestions$1(this, (m0.l.c<? super FollowFriendsViewModel$getFriendsFollowSuggestions$1>) null), (d0) null, (m) null, new FollowFriendsViewModel$getFriendsFollowSuggestions$2(this), 3, (Object) null);
    }

    public final void q(boolean z, boolean z2) {
        i0.e.a.a aVar = this.o;
        AmplitudeAnalytics amplitudeAnalytics = (AmplitudeAnalytics) aVar;
        amplitudeAnalytics.b("Onboarding-Follow-Friends-Done", g.N(new Pair("skipped", Boolean.valueOf(z)), new Pair("failed", Boolean.valueOf(z2))));
        o(new d(this.n.h(SourceLocation.ONBOARDING_FRIENDS)));
    }

    /* compiled from: FollowFriendsViewModel.kt */
    public static final class a implements v<FollowFriendsViewModel, e1> {
        public final /* synthetic */ i0.e.b.c3.h.c<FollowFriendsViewModel, e1> a = new i0.e.b.c3.h.c<>(FollowFriendsViewModel.class);

        public a() {
        }

        public FollowFriendsViewModel create(j0 j0Var, e1 e1Var) {
            i.e(j0Var, "viewModelContext");
            i.e(e1Var, "state");
            return this.a.create(j0Var, e1Var);
        }

        public e1 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
