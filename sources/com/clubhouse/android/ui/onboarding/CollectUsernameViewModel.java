package com.clubhouse.android.ui.onboarding;

import android.content.res.Resources;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.r.c2;
import i0.e.b.g3.r.w0;
import i0.e.b.g3.r.w1;
import i0.e.b.g3.r.y1;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: CollectUsernameViewModel.kt */
public final class CollectUsernameViewModel extends i0.e.b.a3.b.a<w0> {
    public static final /* synthetic */ int m = 0;
    public final OnboardingRepo n;
    public final Resources o;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.CollectUsernameViewModel$1", f = "CollectUsernameViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.CollectUsernameViewModel$1  reason: invalid class name */
    /* compiled from: CollectUsernameViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ CollectUsernameViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, aVar, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, aVar, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final c cVar = (c) this.c;
            if (cVar instanceof c2) {
                CollectUsernameViewModel collectUsernameViewModel = this.d;
                String str = ((c2) cVar).a;
                int i = CollectUsernameViewModel.m;
                Objects.requireNonNull(collectUsernameViewModel);
                if (str.length() == 0) {
                    collectUsernameViewModel.o(new d(collectUsernameViewModel.o.getString(R.string.please_select_a_username)));
                } else if (str.length() > 15) {
                    collectUsernameViewModel.o(new d(collectUsernameViewModel.o.getString(R.string.username_too_long)));
                } else {
                    collectUsernameViewModel.m(new CollectUsernameViewModel$updateUsername$1(str));
                    MavericksViewModel.f(collectUsernameViewModel, new CollectUsernameViewModel$updateUsername$2(collectUsernameViewModel, str, (m0.l.c<? super CollectUsernameViewModel$updateUsername$2>) null), (d0) null, (m) null, new CollectUsernameViewModel$updateUsername$3(collectUsernameViewModel), 3, (Object) null);
                }
            } else if (cVar instanceof w1) {
                ((AmplitudeAnalytics) aVar).a("Onboarding-Username-Change");
                CollectUsernameViewModel collectUsernameViewModel2 = this.d;
                AnonymousClass1 r02 = AnonymousClass1.c;
                int i2 = CollectUsernameViewModel.m;
                collectUsernameViewModel2.m(r02);
            } else if (cVar instanceof y1) {
                CollectUsernameViewModel collectUsernameViewModel3 = this.d;
                AnonymousClass2 r1 = new l<w0, w0>() {
                    public Object invoke(Object obj) {
                        w0 w0Var = (w0) obj;
                        i.e(w0Var, "$this$setState");
                        return w0.copy$default(w0Var, (String) null, (String) null, ((y1) cVar).a, (List) null, false, false, (b) null, 123, (Object) null);
                    }
                };
                int i3 = CollectUsernameViewModel.m;
                collectUsernameViewModel3.m(r1);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectUsernameViewModel(w0 w0Var, OnboardingRepo onboardingRepo, Resources resources, final i0.e.a.a aVar) {
        super(w0Var);
        i.e(w0Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(resources, "resources");
        i.e(aVar, "analytics");
        this.n = onboardingRepo;
        this.o = resources;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        ((AmplitudeAnalytics) aVar).a("Onboarding-Username-Start");
        if (onboardingRepo.i) {
            String str = w0Var.a;
            String str2 = w0Var.b;
            m(CollectUsernameViewModel$fetchSuggestedUsernames$1.c);
            MavericksViewModel.f(this, new CollectUsernameViewModel$fetchSuggestedUsernames$2(this, str, str2, (m0.l.c<? super CollectUsernameViewModel$fetchSuggestedUsernames$2>) null), (d0) null, (m) null, CollectUsernameViewModel$fetchSuggestedUsernames$3.c, 3, (Object) null);
        }
    }

    /* compiled from: CollectUsernameViewModel.kt */
    public static final class a implements v<CollectUsernameViewModel, w0> {
        public final /* synthetic */ i0.e.b.c3.h.c<CollectUsernameViewModel, w0> a = new i0.e.b.c3.h.c<>(CollectUsernameViewModel.class);

        public a() {
        }

        public CollectUsernameViewModel create(j0 j0Var, w0 w0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(w0Var, "state");
            return this.a.create(j0Var, w0Var);
        }

        public w0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
