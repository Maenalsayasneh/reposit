package com.clubhouse.android.ui.clubs;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import h0.b0.v;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.a2;
import i0.e.b.g3.l.u1;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: HalfClubRulesViewModel.kt */
public final class HalfClubRulesViewModel$joinClub$1 extends Lambda implements l<a2, i> {
    public final /* synthetic */ HalfClubRulesViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.HalfClubRulesViewModel$joinClub$1$1", f = "HalfClubRulesViewModel.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.HalfClubRulesViewModel$joinClub$1$1  reason: invalid class name */
    /* compiled from: HalfClubRulesViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super JoinClubResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(a2Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(a2Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ClubRepo clubRepo = HalfClubRulesViewModel.this.n;
                a2 a2Var = a2Var;
                int i2 = a2Var.b;
                HalfClubRulesArgs halfClubRulesArgs = a2Var.a;
                String str = halfClubRulesArgs.q;
                SourceLocation sourceLocation = halfClubRulesArgs.x;
                Map<String, Object> t2 = v.t2(halfClubRulesArgs.y, sourceLocation);
                this.c = 1;
                obj = clubRepo.n(i2, str, sourceLocation, t2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfClubRulesViewModel$joinClub$1(HalfClubRulesViewModel halfClubRulesViewModel) {
        super(1);
        this.c = halfClubRulesViewModel;
    }

    public Object invoke(Object obj) {
        final a2 a2Var = (a2) obj;
        m0.n.b.i.e(a2Var, "state");
        final HalfClubRulesViewModel halfClubRulesViewModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final HalfClubRulesViewModel halfClubRulesViewModel2 = this.c;
        MavericksViewModel.f(halfClubRulesViewModel, r2, (d0) null, (m) null, new p<a2, b<? extends JoinClubResponse>, a2>() {
            public Object invoke(Object obj, Object obj2) {
                a2 a2Var = (a2) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(a2Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    HalfClubRulesViewModel halfClubRulesViewModel = HalfClubRulesViewModel.this;
                    u1 u1Var = u1.a;
                    int i = HalfClubRulesViewModel.m;
                    halfClubRulesViewModel.o(u1Var);
                }
                if (bVar instanceof i0.b.b.c) {
                    HalfClubRulesViewModel halfClubRulesViewModel2 = HalfClubRulesViewModel.this;
                    d dVar = new d(((i0.b.b.c) bVar).b.getLocalizedMessage());
                    int i2 = HalfClubRulesViewModel.m;
                    halfClubRulesViewModel2.o(dVar);
                }
                return a2Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
