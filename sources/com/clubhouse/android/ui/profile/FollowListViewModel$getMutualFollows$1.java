package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.data.repos.UserRepo$getMutualFollows$1;
import g0.a.b.b.a;
import h0.u.u;
import h0.u.v;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.u.l4;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.profile.FollowListViewModel$getMutualFollows$1", f = "FollowListViewModel.kt", l = {82}, m = "invokeSuspend")
/* compiled from: FollowListViewModel.kt */
public final class FollowListViewModel$getMutualFollows$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ FollowListViewModel d;
    public final /* synthetic */ int q;

    @c(c = "com.clubhouse.android.ui.profile.FollowListViewModel$getMutualFollows$1$1", f = "FollowListViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.FollowListViewModel$getMutualFollows$1$1  reason: invalid class name */
    /* compiled from: FollowListViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w<j>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(followListViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(followListViewModel, (m0.l.c) obj2);
            r02.c = (w) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final w wVar = (w) this.c;
            FollowListViewModel followListViewModel = followListViewModel;
            AnonymousClass1 r1 = new l<l4, l4>() {
                public Object invoke(Object obj) {
                    l4 l4Var = (l4) obj;
                    m0.n.b.i.e(l4Var, "$this$setState");
                    return l4.copy$default(l4Var, (FollowListType) null, 0, 0, wVar, 7, (Object) null);
                }
            };
            int i = FollowListViewModel.m;
            followListViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowListViewModel$getMutualFollows$1(FollowListViewModel followListViewModel, int i, m0.l.c<? super FollowListViewModel$getMutualFollows$1> cVar) {
        super(2, cVar);
        this.d = followListViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FollowListViewModel$getMutualFollows$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new FollowListViewModel$getMutualFollows$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.n;
            d<w<w<Item>>> h = a.h(new EntityAwarePagingDataSource(userRepo.c, userRepo, userRepo.e, userRepo.f, userRepo.a, new u(new v(50, 10, false, 50, 0, 0, 52), (Object) null, new UserRepo$getMutualFollows$1(userRepo, this.q), 2)).e, this.d.c);
            final FollowListViewModel followListViewModel = this.d;
            AnonymousClass1 r4 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (m0.r.t.a.r.m.a1.a.E0(h, r4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
