package com.clubhouse.android.ui.clubs;

import g0.a.b.b.a;
import h0.u.w;
import i0.e.b.b3.b.e.f;
import i0.e.b.g3.l.s1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.clubs.ClubMemberSearchViewModel$loadClubMembers$1", f = "ClubMemberSearchViewModel.kt", l = {121}, m = "invokeSuspend")
/* compiled from: ClubMemberSearchViewModel.kt */
public final class ClubMemberSearchViewModel$loadClubMembers$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ClubMemberSearchViewModel d;
    public final /* synthetic */ int q;

    @c(c = "com.clubhouse.android.ui.clubs.ClubMemberSearchViewModel$loadClubMembers$1$1", f = "ClubMemberSearchViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.ClubMemberSearchViewModel$loadClubMembers$1$1  reason: invalid class name */
    /* compiled from: ClubMemberSearchViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w<f>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(clubMemberSearchViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(clubMemberSearchViewModel, (m0.l.c) obj2);
            r02.c = (w) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final w wVar = (w) this.c;
            ClubMemberSearchViewModel clubMemberSearchViewModel = clubMemberSearchViewModel;
            AnonymousClass1 r1 = new l<s1, s1>() {
                public Object invoke(Object obj) {
                    s1 s1Var = (s1) obj;
                    m0.n.b.i.e(s1Var, "$this$setState");
                    return s1.copy$default(s1Var, 0, false, false, wVar, (String) null, (w) null, 55, (Object) null);
                }
            };
            int i = ClubMemberSearchViewModel.m;
            clubMemberSearchViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchViewModel$loadClubMembers$1(ClubMemberSearchViewModel clubMemberSearchViewModel, int i, m0.l.c<? super ClubMemberSearchViewModel$loadClubMembers$1> cVar) {
        super(2, cVar);
        this.d = clubMemberSearchViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ClubMemberSearchViewModel$loadClubMembers$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ClubMemberSearchViewModel$loadClubMembers$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<w<w<f>>> h = a.h(this.d.p.k(this.q), this.d.c);
            final ClubMemberSearchViewModel clubMemberSearchViewModel = this.d;
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
