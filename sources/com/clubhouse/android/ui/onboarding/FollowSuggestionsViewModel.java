package com.clubhouse.android.ui.onboarding;

import androidx.paging.PageFetcher;
import androidx.paging.Pager$flow$1;
import androidx.paging.Pager$flow$2;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.data.repos.UserRepo;
import h0.u.e0;
import h0.u.v;
import h0.u.w;
import i0.b.b.j0;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.r.a2;
import i0.e.b.g3.r.b1;
import i0.e.b.g3.r.k0;
import i0.e.b.g3.r.z1;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.g2.d;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel extends i0.e.b.a3.b.a<FollowSuggestionsState> {
    public static final /* synthetic */ int m = 0;
    public final i0.e.a.a n;
    public final OnboardingRepo o;
    public final i0.e.a.b.a p;
    public final UserRepo q;
    public final SuggestedFollowPagingSource r;
    public final d<w<j>> s;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$1", f = "FollowSuggestionsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$1  reason: invalid class name */
    /* compiled from: FollowSuggestionsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.b.c, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ FollowSuggestionsViewModel d;

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
            h.d4(obj);
            i0.e.b.a3.b.c cVar = (i0.e.b.a3.b.c) this.c;
            if (cVar instanceof z1) {
                FollowSuggestionsViewModel followSuggestionsViewModel = this.d;
                UserInList userInList = ((z1) cVar).a;
                int i = FollowSuggestionsViewModel.m;
                Objects.requireNonNull(followSuggestionsViewModel);
                followSuggestionsViewModel.n(new FollowSuggestionsViewModel$toggleFollow$1(userInList, followSuggestionsViewModel));
            } else if (cVar instanceof a2) {
                FollowSuggestionsViewModel followSuggestionsViewModel2 = this.d;
                int i2 = FollowSuggestionsViewModel.m;
                Objects.requireNonNull(followSuggestionsViewModel2);
                followSuggestionsViewModel2.n(new FollowSuggestionsViewModel$toggleSuggestions$1(followSuggestionsViewModel2));
            } else if (cVar instanceof k0) {
                FollowSuggestionsViewModel followSuggestionsViewModel3 = this.d;
                int i3 = FollowSuggestionsViewModel.m;
                Objects.requireNonNull(followSuggestionsViewModel3);
                followSuggestionsViewModel3.n(new FollowSuggestionsViewModel$advanceToNext$1(followSuggestionsViewModel3));
            } else if (cVar instanceof b1) {
                FollowSuggestionsViewModel followSuggestionsViewModel4 = this.d;
                int i4 = FollowSuggestionsViewModel.m;
                followSuggestionsViewModel4.q(0);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel(FollowSuggestionsState followSuggestionsState, i0.e.a.a aVar, OnboardingRepo onboardingRepo, i0.e.b.f3.i.a aVar2, SuggestedFollowPagingSource.a aVar3, i0.e.a.b.a aVar4) {
        super(followSuggestionsState);
        l lVar;
        i.e(followSuggestionsState, "initialState");
        i.e(aVar, "analytics");
        i.e(onboardingRepo, "onboardingRepo");
        i.e(aVar2, "userComponentHandler");
        i.e(aVar3, "suggestedFollowPagingSourceFactory");
        i.e(aVar4, "actionTrailRecorder");
        this.n = aVar;
        this.o = onboardingRepo;
        this.p = aVar4;
        this.q = ((i0.e.b.c3.i.a) h.L0(aVar2, i0.e.b.c3.i.a.class)).c();
        SuggestedFollowPagingSource a2 = aVar3.a(true, onboardingRepo.e.getValue(), onboardingRepo.g);
        this.r = a2;
        v vVar = new v(50, 10, false, 50, 0, 0, 52);
        FollowSuggestionsViewModel$suggestedFollowPager$1 followSuggestionsViewModel$suggestedFollowPager$1 = new FollowSuggestionsViewModel$suggestedFollowPager$1(this);
        i.e(vVar, "config");
        i.e(followSuggestionsViewModel$suggestedFollowPager$1, "pagingSourceFactory");
        i.e(vVar, "config");
        i.e(followSuggestionsViewModel$suggestedFollowPager$1, "pagingSourceFactory");
        if (followSuggestionsViewModel$suggestedFollowPager$1 instanceof e0) {
            lVar = new Pager$flow$1(followSuggestionsViewModel$suggestedFollowPager$1);
        } else {
            lVar = new Pager$flow$2(followSuggestionsViewModel$suggestedFollowPager$1, (c) null);
        }
        this.s = new PageFetcher(lVar, (Object) null, vVar).c;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(a2.i, new FollowSuggestionsViewModel$getAllFollowSuggestions$1(this, (c<? super FollowSuggestionsViewModel$getAllFollowSuggestions$1>) null)), this.c);
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(a2.h, new FollowSuggestionsViewModel$getAllFollowSuggestions$2(this, (c<? super FollowSuggestionsViewModel$getAllFollowSuggestions$2>) null)), this.c);
        m0.r.t.a.r.m.a1.a.E2(this.c, (e) null, (CoroutineStart) null, new FollowSuggestionsViewModel$getAllFollowSuggestions$3(this, (c<? super FollowSuggestionsViewModel$getAllFollowSuggestions$3>) null), 3, (Object) null);
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), this.c);
        ((AmplitudeAnalytics) aVar).a("Onboarding-Follows-Start");
    }

    public final void q(int i) {
        ((AmplitudeAnalytics) this.n).b("Onboarding-Follow-Suggestions-Done", h.S2(new Pair("count", Integer.valueOf(i))));
        m(new FollowSuggestionsViewModel$finish$1(this));
    }

    /* compiled from: FollowSuggestionsViewModel.kt */
    public static final class a implements i0.b.b.v<FollowSuggestionsViewModel, FollowSuggestionsState> {
        public final /* synthetic */ i0.e.b.c3.h.c<FollowSuggestionsViewModel, FollowSuggestionsState> a = new i0.e.b.c3.h.c<>(FollowSuggestionsViewModel.class);

        public a() {
        }

        public FollowSuggestionsViewModel create(j0 j0Var, FollowSuggestionsState followSuggestionsState) {
            i.e(j0Var, "viewModelContext");
            i.e(followSuggestionsState, "state");
            return this.a.create(j0Var, followSuggestionsState);
        }

        public FollowSuggestionsState initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
