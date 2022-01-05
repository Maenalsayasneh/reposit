package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.data.models.remote.response.GetClubNominationsResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubViewModel$refreshNominations$1", f = "GrowClubViewModel.kt", l = {93}, m = "invokeSuspend")
/* compiled from: GrowClubViewModel.kt */
public final class GrowClubViewModel$refreshNominations$1 extends SuspendLambda implements l<m0.l.c<? super GetClubNominationsResponse>, Object> {
    public int c;
    public final /* synthetic */ GrowClubViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubViewModel$refreshNominations$1(GrowClubViewModel growClubViewModel, m0.l.c<? super GrowClubViewModel$refreshNominations$1> cVar) {
        super(1, cVar);
        this.d = growClubViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new GrowClubViewModel$refreshNominations$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new GrowClubViewModel$refreshNominations$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            GrowClubViewModel growClubViewModel = this.d;
            ClubRepo clubRepo = growClubViewModel.q;
            int i2 = growClubViewModel.n.a;
            this.c = 1;
            obj = clubRepo.l(i2, this);
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
