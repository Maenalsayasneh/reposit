package com.clubhouse.android.ui.recentSpeakers;

import com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.data.repos.UserRepo$getRecentSpeakers$1;
import g0.a.b.b.a;
import h0.u.u;
import h0.u.v;
import h0.u.w;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.v.f;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.recentSpeakers.RecentSpeakersViewModel$getRecentSpeakers$1", f = "RecentSpeakersViewModel.kt", l = {72}, m = "invokeSuspend")
/* compiled from: RecentSpeakersViewModel.kt */
public final class RecentSpeakersViewModel$getRecentSpeakers$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ RecentSpeakersViewModel d;

    @c(c = "com.clubhouse.android.ui.recentSpeakers.RecentSpeakersViewModel$getRecentSpeakers$1$1", f = "RecentSpeakersViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.recentSpeakers.RecentSpeakersViewModel$getRecentSpeakers$1$1  reason: invalid class name */
    /* compiled from: RecentSpeakersViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w<m>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(recentSpeakersViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(recentSpeakersViewModel, (m0.l.c) obj2);
            r02.c = (w) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final w wVar = (w) this.c;
            RecentSpeakersViewModel recentSpeakersViewModel = recentSpeakersViewModel;
            AnonymousClass1 r1 = new l<f, f>() {
                public Object invoke(Object obj) {
                    m0.n.b.i.e((f) obj, "$this$setState");
                    w<m> wVar = wVar;
                    m0.n.b.i.e(wVar, "recentSpeakersData");
                    return new f(wVar);
                }
            };
            int i = RecentSpeakersViewModel.m;
            recentSpeakersViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentSpeakersViewModel$getRecentSpeakers$1(RecentSpeakersViewModel recentSpeakersViewModel, m0.l.c<? super RecentSpeakersViewModel$getRecentSpeakers$1> cVar) {
        super(2, cVar);
        this.d = recentSpeakersViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new RecentSpeakersViewModel$getRecentSpeakers$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new RecentSpeakersViewModel$getRecentSpeakers$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.n;
            d<w<w<Item>>> h = a.h(new EntityAwarePagingDataSource(userRepo.c, userRepo, userRepo.e, userRepo.f, userRepo.a, new u(new v(50, 10, false, 50, 0, 0, 52), (Object) null, new UserRepo$getRecentSpeakers$1(userRepo), 2)).e, this.d.c);
            final RecentSpeakersViewModel recentSpeakersViewModel = this.d;
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
