package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.r.b2;
import i0.e.b.g3.r.o0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: CollectNameViewModel.kt */
public final class CollectNameViewModel extends i0.e.b.a3.b.a<o0> {
    public static final /* synthetic */ int m = 0;
    public final OnboardingRepo n;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.CollectNameViewModel$1", f = "CollectNameViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.CollectNameViewModel$1  reason: invalid class name */
    /* compiled from: CollectNameViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ CollectNameViewModel d;

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
            if (cVar instanceof b2) {
                CollectNameViewModel collectNameViewModel = this.d;
                b2 b2Var = (b2) cVar;
                String str = b2Var.a;
                String str2 = b2Var.b;
                int i = CollectNameViewModel.m;
                Objects.requireNonNull(collectNameViewModel);
                StringBuilder sb = new StringBuilder();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                sb.append(StringsKt__IndentKt.X(str).toString());
                sb.append(' ');
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                sb.append(StringsKt__IndentKt.X(str2).toString());
                MavericksViewModel.f(collectNameViewModel, new CollectNameViewModel$updateName$1(collectNameViewModel, sb.toString(), (m0.l.c<? super CollectNameViewModel$updateName$1>) null), (d0) null, (m) null, new CollectNameViewModel$updateName$2(collectNameViewModel, str, str2), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectNameViewModel(o0 o0Var, OnboardingRepo onboardingRepo, i0.e.a.a aVar) {
        super(o0Var);
        i.e(o0Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(aVar, "analytics");
        this.n = onboardingRepo;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        ((AmplitudeAnalytics) aVar).a("Onboarding-Name-Start");
    }

    /* compiled from: CollectNameViewModel.kt */
    public static final class a implements v<CollectNameViewModel, o0> {
        public final /* synthetic */ i0.e.b.c3.h.c<CollectNameViewModel, o0> a = new i0.e.b.c3.h.c<>(CollectNameViewModel.class);

        public a() {
        }

        public CollectNameViewModel create(j0 j0Var, o0 o0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(o0Var, "state");
            return this.a.create(j0Var, o0Var);
        }

        public o0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
