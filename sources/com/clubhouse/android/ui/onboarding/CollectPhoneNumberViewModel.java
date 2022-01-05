package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.f3.i.c;
import i0.e.b.g3.r.d2;
import i0.e.b.g3.r.p0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: CollectPhoneNumberViewModel.kt */
public final class CollectPhoneNumberViewModel extends i0.e.b.a3.b.a<p0> {
    public static final /* synthetic */ int m = 0;
    public final OnboardingRepo n;
    public final i0.e.a.a o;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.CollectPhoneNumberViewModel$1", f = "CollectPhoneNumberViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.CollectPhoneNumberViewModel$1  reason: invalid class name */
    /* compiled from: CollectPhoneNumberViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.b.c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ CollectPhoneNumberViewModel d;

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
            r02.c = (i0.e.b.a3.b.c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            i0.e.b.a3.b.c cVar = (i0.e.b.a3.b.c) this.c;
            if (cVar instanceof d2) {
                CollectPhoneNumberViewModel collectPhoneNumberViewModel = this.d;
                String str = ((d2) cVar).a;
                int i = CollectPhoneNumberViewModel.m;
                Objects.requireNonNull(collectPhoneNumberViewModel);
                collectPhoneNumberViewModel.m(new CollectPhoneNumberViewModel$validatePhoneNumber$1(str));
                MavericksViewModel.f(collectPhoneNumberViewModel, new CollectPhoneNumberViewModel$validatePhoneNumber$2(collectPhoneNumberViewModel, str, (m0.l.c<? super CollectPhoneNumberViewModel$validatePhoneNumber$2>) null), (d0) null, (m) null, new CollectPhoneNumberViewModel$validatePhoneNumber$3(collectPhoneNumberViewModel), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectPhoneNumberViewModel(p0 p0Var, OnboardingRepo onboardingRepo, i0.e.a.a aVar) {
        super(p0Var);
        i.e(p0Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(aVar, "analytics");
        this.n = onboardingRepo;
        this.o = aVar;
        c cVar = onboardingRepo.b.a;
        synchronized (cVar) {
            cVar.a.k();
        }
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        ((AmplitudeAnalytics) aVar).a("Onboarding-PhoneNumber-Start");
    }

    /* compiled from: CollectPhoneNumberViewModel.kt */
    public static final class a implements v<CollectPhoneNumberViewModel, p0> {
        public final /* synthetic */ i0.e.b.c3.h.c<CollectPhoneNumberViewModel, p0> a = new i0.e.b.c3.h.c<>(CollectPhoneNumberViewModel.class);

        public a() {
        }

        public CollectPhoneNumberViewModel create(j0 j0Var, p0 p0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(p0Var, "state");
            return this.a.create(j0Var, p0Var);
        }

        public p0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
