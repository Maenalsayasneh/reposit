package com.clubhouse.android.ui.clubs;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.app.R;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.y2.a;
import i0.j.f.p.h;
import java.util.List;
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
public final class ClubViewModel$clubMigrationOpenMembership$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$clubMigrationOpenMembership$1$1", f = "ClubViewModel.kt", l = {473}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.ClubViewModel$clubMigrationOpenMembership$1$1  reason: invalid class name */
    /* compiled from: ClubViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(v1Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(v1Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ClubRepo clubRepo = ClubViewModel.this.q;
                Integer num = v1Var.a;
                if (num != null) {
                    int intValue = num.intValue();
                    this.c = 1;
                    obj = clubRepo.A(intValue, true, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
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
    public ClubViewModel$clubMigrationOpenMembership$1(ClubViewModel clubViewModel) {
        super(1);
        this.c = clubViewModel;
    }

    public Object invoke(Object obj) {
        final v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "state");
        final ClubViewModel clubViewModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ClubViewModel clubViewModel2 = this.c;
        MavericksViewModel.f(clubViewModel, r2, (d0) null, (m) null, new p<v1, b<? extends EmptySuccessResponse>, v1>() {
            public Object invoke(Object obj, Object obj2) {
                GetClubResponse getClubResponse;
                v1 v1Var = (v1) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(v1Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    ClubViewModel clubViewModel = ClubViewModel.this;
                    String string = clubViewModel.o.getString(R.string.upsell_type_member_approval_yes_success);
                    m0.n.b.i.d(string, "resources.getString(R.string.upsell_type_member_approval_yes_success)");
                    clubViewModel.o(new e(string));
                    GetClubResponse getClubResponse2 = v1Var.e;
                    if (getClubResponse2 == null) {
                        getClubResponse = null;
                    } else {
                        getClubResponse = GetClubResponse.a(getClubResponse2, ClubWithAdmin.d(getClubResponse2.c, false, false, false, 0, (String) null, (String) null, (String) null, (List) null, 0, 0, (String) null, false, false, true, false, false, (Map) null, (String) null, 253951), false, false, false, false, false, false, (BasicUser) null, (List) null, (String) null, (List) null, (Integer) null, 4094);
                    }
                    return v1.copy$default(v1Var, (Integer) null, (ClubArgs) null, (b) null, (b) null, getClubResponse, (w) null, false, (a) null, 239, (Object) null);
                } else if (!(bVar instanceof i0.b.b.c)) {
                    return v1Var;
                } else {
                    ClubViewModel clubViewModel2 = ClubViewModel.this;
                    d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                    int i = ClubViewModel.m;
                    clubViewModel2.o(dVar);
                    return v1Var;
                }
            }
        }, 3, (Object) null);
        return i.a;
    }
}
