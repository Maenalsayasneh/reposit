package com.clubhouse.android.ui.clubs;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.l.v1;
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

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$joinClub$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubViewModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ SourceLocation q;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$joinClub$1$1", f = "ClubViewModel.kt", l = {500}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.ClubViewModel$joinClub$1$1  reason: invalid class name */
    /* compiled from: ClubViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super JoinClubResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(i, str, sourceLocation, v1Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(i, str, sourceLocation, v1Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            Map<String, Object> map;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ClubRepo clubRepo = ClubViewModel.this.q;
                int i2 = i;
                String str = str;
                SourceLocation sourceLocation = sourceLocation;
                ClubArgs clubArgs = v1Var.b;
                if (clubArgs == null) {
                    map = null;
                } else {
                    map = clubArgs.Z1;
                }
                Map<String, Object> t2 = v.t2(map, sourceLocation);
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
    public ClubViewModel$joinClub$1(ClubViewModel clubViewModel, String str, SourceLocation sourceLocation) {
        super(1);
        this.c = clubViewModel;
        this.d = str;
        this.q = sourceLocation;
    }

    public Object invoke(Object obj) {
        final v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "state");
        Integer num = v1Var.a;
        if (num != null) {
            final int intValue = num.intValue();
            ClubViewModel clubViewModel = this.c;
            final String str = this.d;
            final SourceLocation sourceLocation = this.q;
            final ClubViewModel clubViewModel2 = clubViewModel;
            final int i = intValue;
            AnonymousClass1 r02 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final ClubViewModel clubViewModel3 = this.c;
            MavericksViewModel.f(clubViewModel, r02, (d0) null, (m) null, new p<v1, b<? extends JoinClubResponse>, v1>() {
                public Object invoke(Object obj, Object obj2) {
                    String str;
                    v1 v1Var = (v1) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(v1Var, "$this$execute");
                    m0.n.b.i.e(bVar, "it");
                    if (bVar instanceof f0) {
                        ClubViewModel.s(ClubViewModel.this, intValue);
                        ClubViewModel.q(ClubViewModel.this, intValue);
                        ClubViewModel clubViewModel = ClubViewModel.this;
                        ClubWithAdmin clubWithAdmin = v1Var.i;
                        if (clubWithAdmin != null && clubWithAdmin.g2) {
                            str = clubViewModel.o.getString(R.string.join_club_success_full, new Object[]{clubWithAdmin.y});
                        } else {
                            str = clubViewModel.o.getString(R.string.applied_to_club);
                        }
                        m0.n.b.i.d(str, "if (club?.isMembershipOpen == true) {\n                                resources.getString(R.string.join_club_success_full, club.name)\n                            } else {\n                                resources.getString(R.string.applied_to_club)\n                            }");
                        clubViewModel.o(new e(str));
                    } else if (bVar instanceof i0.b.b.c) {
                        ClubViewModel clubViewModel2 = ClubViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i = ClubViewModel.m;
                        clubViewModel2.o(dVar);
                    }
                    return v1Var;
                }
            }, 3, (Object) null);
            return i.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
