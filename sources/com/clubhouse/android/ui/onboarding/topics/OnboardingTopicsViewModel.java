package com.clubhouse.android.ui.onboarding.topics;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.data.repos.TopicRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.m.g.b;
import i0.e.b.g3.r.a3.d;
import i0.e.b.g3.r.a3.f;
import i0.e.b.g3.r.k0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: OnboardingTopicsViewModel.kt */
public final class OnboardingTopicsViewModel extends i0.e.b.a3.b.a<f> {
    public static final /* synthetic */ int m = 0;
    public final TopicRepo n;
    public final OnboardingRepo o;
    public final i0.e.a.a p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsViewModel$1", f = "OnboardingTopicsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.topics.OnboardingTopicsViewModel$1  reason: invalid class name */
    /* compiled from: OnboardingTopicsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.b.c, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ OnboardingTopicsViewModel d;

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
            if (cVar instanceof i0.e.b.g3.m.g.a) {
                OnboardingTopicsViewModel onboardingTopicsViewModel = this.d;
                Topic topic = ((i0.e.b.g3.m.g.a) cVar).a;
                int i = OnboardingTopicsViewModel.m;
                Objects.requireNonNull(onboardingTopicsViewModel);
                MavericksViewModel.f(onboardingTopicsViewModel, new OnboardingTopicsViewModel$addUserTopic$1(onboardingTopicsViewModel, topic, (c<? super OnboardingTopicsViewModel$addUserTopic$1>) null), (d0) null, (m) null, new OnboardingTopicsViewModel$addUserTopic$2(topic), 3, (Object) null);
            } else if (cVar instanceof b) {
                OnboardingTopicsViewModel onboardingTopicsViewModel2 = this.d;
                Topic topic2 = ((b) cVar).a;
                int i2 = OnboardingTopicsViewModel.m;
                Objects.requireNonNull(onboardingTopicsViewModel2);
                MavericksViewModel.f(onboardingTopicsViewModel2, new OnboardingTopicsViewModel$removeUserTopic$1(onboardingTopicsViewModel2, topic2, (c<? super OnboardingTopicsViewModel$removeUserTopic$1>) null), (d0) null, (m) null, new OnboardingTopicsViewModel$removeUserTopic$2(topic2), 3, (Object) null);
            } else if (cVar instanceof k0) {
                OnboardingTopicsViewModel.q(this.d);
            }
            return m0.i.a;
        }
    }

    static {
        new a((m0.n.b.f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingTopicsViewModel(f fVar, TopicRepo topicRepo, OnboardingRepo onboardingRepo, i0.e.a.a aVar) {
        super(fVar);
        i.e(fVar, "initialState");
        i.e(topicRepo, "topicRepo");
        i.e(onboardingRepo, "onboardingRepo");
        i.e(aVar, "analytics");
        this.n = topicRepo;
        this.o = onboardingRepo;
        this.p = aVar;
        MavericksViewModel.f(this, new OnboardingTopicsViewModel$loadSuggestedTopics$1(this, (c<? super OnboardingTopicsViewModel$loadSuggestedTopics$1>) null), (d0) null, (m) null, new OnboardingTopicsViewModel$loadSuggestedTopics$2(this), 3, (Object) null);
        ((AmplitudeAnalytics) aVar).a("Onboarding-Topics-Start");
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), this.c);
    }

    public static final void q(OnboardingTopicsViewModel onboardingTopicsViewModel) {
        ((AmplitudeAnalytics) onboardingTopicsViewModel.p).a("Onboarding-Topics-Done");
        onboardingTopicsViewModel.o(new d(onboardingTopicsViewModel.o.h(SourceLocation.ONBOARDING_TOPICS)));
    }

    /* compiled from: OnboardingTopicsViewModel.kt */
    public static final class a implements v<OnboardingTopicsViewModel, f> {
        public final /* synthetic */ i0.e.b.c3.h.c<OnboardingTopicsViewModel, f> a = new i0.e.b.c3.h.c<>(OnboardingTopicsViewModel.class);

        public a() {
        }

        public OnboardingTopicsViewModel create(j0 j0Var, f fVar) {
            i.e(j0Var, "viewModelContext");
            i.e(fVar, "state");
            return this.a.create(j0Var, fVar);
        }

        public f initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(m0.n.b.f fVar) {
        }
    }
}
