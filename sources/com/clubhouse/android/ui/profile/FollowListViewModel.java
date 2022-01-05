package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.UserRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.u.l4;
import i0.e.b.g3.u.p5;
import i0.j.f.p.h;
import java.util.Objects;
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
import m0.r.m;
import n0.a.d0;

/* compiled from: FollowListViewModel.kt */
public final class FollowListViewModel extends i0.e.b.a3.b.a<l4> {
    public static final /* synthetic */ int m = 0;
    public final UserRepo n;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.FollowListViewModel$2", f = "FollowListViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.FollowListViewModel$2  reason: invalid class name */
    /* compiled from: FollowListViewModel.kt */
    public static final class AnonymousClass2 extends SuspendLambda implements p<i0.e.b.a3.b.c, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ FollowListViewModel d;

        {
            this.d = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            AnonymousClass2 r02 = new AnonymousClass2(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass2 r02 = new AnonymousClass2(this.d, (c) obj2);
            r02.c = (i0.e.b.a3.b.c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            i0.e.b.a3.b.c cVar = (i0.e.b.a3.b.c) this.c;
            if (cVar instanceof p5) {
                FollowListViewModel followListViewModel = this.d;
                int i = ((p5) cVar).a;
                int i2 = FollowListViewModel.m;
                Objects.requireNonNull(followListViewModel);
                MavericksViewModel.f(followListViewModel, new FollowListViewModel$toggleFollowUser$1(followListViewModel, i, (c<? super FollowListViewModel$toggleFollowUser$1>) null), (d0) null, (m) null, FollowListViewModel$toggleFollowUser$2.c, 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowListViewModel(l4 l4Var, i0.e.b.f3.i.a aVar) {
        super(l4Var);
        i.e(l4Var, "initialState");
        i.e(aVar, "userComponentHandler");
        this.n = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        n(new l<l4, m0.i>(this) {
            public final /* synthetic */ FollowListViewModel c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                l4 l4Var = (l4) obj;
                i.e(l4Var, "state");
                int ordinal = l4Var.a.ordinal();
                if (ordinal == 0) {
                    FollowListViewModel followListViewModel = this.c;
                    m0.r.t.a.r.m.a1.a.E2(followListViewModel.c, (e) null, (CoroutineStart) null, new FollowListViewModel$getFollowers$1(followListViewModel, l4Var.b, (c<? super FollowListViewModel$getFollowers$1>) null), 3, (Object) null);
                } else if (ordinal == 1) {
                    FollowListViewModel followListViewModel2 = this.c;
                    m0.r.t.a.r.m.a1.a.E2(followListViewModel2.c, (e) null, (CoroutineStart) null, new FollowListViewModel$getFollowing$1(followListViewModel2, l4Var.b, (c<? super FollowListViewModel$getFollowing$1>) null), 3, (Object) null);
                } else if (ordinal == 2) {
                    FollowListViewModel followListViewModel3 = this.c;
                    m0.r.t.a.r.m.a1.a.E2(followListViewModel3.c, (e) null, (CoroutineStart) null, new FollowListViewModel$getMutualFollows$1(followListViewModel3, l4Var.b, (c<? super FollowListViewModel$getMutualFollows$1>) null), 3, (Object) null);
                } else if (ordinal == 3) {
                    FollowListViewModel followListViewModel4 = this.c;
                    m0.r.t.a.r.m.a1.a.E2(followListViewModel4.c, (e) null, (CoroutineStart) null, new FollowListViewModel$getFollowersFromNotification$1(followListViewModel4, l4Var.c, (c<? super FollowListViewModel$getFollowersFromNotification$1>) null), 3, (Object) null);
                }
                return m0.i.a;
            }
        });
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass2(this, (c<? super AnonymousClass2>) null)), this.c);
    }

    /* compiled from: FollowListViewModel.kt */
    public static final class a implements v<FollowListViewModel, l4> {
        public final /* synthetic */ i0.e.b.c3.h.c<FollowListViewModel, l4> a = new i0.e.b.c3.h.c<>(FollowListViewModel.class);

        public a() {
        }

        public FollowListViewModel create(j0 j0Var, l4 l4Var) {
            i.e(j0Var, "viewModelContext");
            i.e(l4Var, "state");
            return this.a.create(j0Var, l4Var);
        }

        public l4 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
