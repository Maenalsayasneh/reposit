package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import g0.a.b.b.a;
import h0.u.w;
import i0.b.b.b;
import i0.e.b.b3.b.e.f;
import i0.e.b.g3.l.v1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$loadClubMembers$1", f = "ClubViewModel.kt", l = {223}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$loadClubMembers$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ int q;

    @c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$loadClubMembers$1$1", f = "ClubViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.ClubViewModel$loadClubMembers$1$1  reason: invalid class name */
    /* compiled from: ClubViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w<f>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(clubViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(clubViewModel, (m0.l.c) obj2);
            r02.c = (w) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final w wVar = (w) this.c;
            ClubViewModel clubViewModel = clubViewModel;
            AnonymousClass1 r1 = new l<v1, v1>() {
                public Object invoke(Object obj) {
                    v1 v1Var = (v1) obj;
                    m0.n.b.i.e(v1Var, "$this$setState");
                    return v1.copy$default(v1Var, (Integer) null, (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, wVar, false, (i0.e.b.g3.l.y2.a) null, 223, (Object) null);
                }
            };
            int i = ClubViewModel.m;
            clubViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$loadClubMembers$1(ClubViewModel clubViewModel, int i, m0.l.c<? super ClubViewModel$loadClubMembers$1> cVar) {
        super(2, cVar);
        this.d = clubViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ClubViewModel$loadClubMembers$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ClubViewModel$loadClubMembers$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<w<w<f>>> h = a.h(this.d.q.k(this.q), this.d.c);
            final ClubViewModel clubViewModel = this.d;
            AnonymousClass1 r1 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (m0.r.t.a.r.m.a1.a.E0(h, r1, this) == coroutineSingletons) {
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
