package com.clubhouse.android.ui.recentSpeakers;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.UserRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.v.f;
import i0.e.b.g3.v.g;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: RecentSpeakersViewModel.kt */
public final class RecentSpeakersViewModel extends i0.e.b.a3.b.a<f> {
    public static final /* synthetic */ int m = 0;
    public final UserRepo n;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.recentSpeakers.RecentSpeakersViewModel$1", f = "RecentSpeakersViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.recentSpeakers.RecentSpeakersViewModel$1  reason: invalid class name */
    /* compiled from: RecentSpeakersViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ RecentSpeakersViewModel d;

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
            if (cVar instanceof g) {
                RecentSpeakersViewModel recentSpeakersViewModel = this.d;
                int i = ((g) cVar).a;
                int i2 = RecentSpeakersViewModel.m;
                Objects.requireNonNull(recentSpeakersViewModel);
                MavericksViewModel.f(recentSpeakersViewModel, new RecentSpeakersViewModel$toggleFollowUser$1(recentSpeakersViewModel, i, (m0.l.c<? super RecentSpeakersViewModel$toggleFollowUser$1>) null), (d0) null, (m) null, RecentSpeakersViewModel$toggleFollowUser$2.c, 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((m0.n.b.f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentSpeakersViewModel(f fVar, i0.e.b.f3.i.a aVar) {
        super(fVar);
        i.e(fVar, "initialState");
        i.e(aVar, "userComponentHandler");
        this.n = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        m0.r.t.a.r.m.a1.a.E2(this.c, (e) null, (CoroutineStart) null, new RecentSpeakersViewModel$getRecentSpeakers$1(this, (m0.l.c<? super RecentSpeakersViewModel$getRecentSpeakers$1>) null), 3, (Object) null);
    }

    /* compiled from: RecentSpeakersViewModel.kt */
    public static final class a implements v<RecentSpeakersViewModel, f> {
        public final /* synthetic */ i0.e.b.c3.h.c<RecentSpeakersViewModel, f> a = new i0.e.b.c3.h.c<>(RecentSpeakersViewModel.class);

        public a() {
        }

        public RecentSpeakersViewModel create(j0 j0Var, f fVar) {
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
