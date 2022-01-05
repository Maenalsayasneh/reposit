package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.user.model.User;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubViewModel$addToClub$1", f = "GrowClubViewModel.kt", l = {101}, m = "invokeSuspend")
/* compiled from: GrowClubViewModel.kt */
public final class GrowClubViewModel$addToClub$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ GrowClubViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ User x;
    public final /* synthetic */ String y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubViewModel$addToClub$1(GrowClubViewModel growClubViewModel, int i, User user, String str, m0.l.c<? super GrowClubViewModel$addToClub$1> cVar) {
        super(1, cVar);
        this.d = growClubViewModel;
        this.q = i;
        this.x = user;
        this.y = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new GrowClubViewModel$addToClub$1(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj) {
        return new GrowClubViewModel$addToClub$1(this.d, this.q, this.x, this.y, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.q;
            int i2 = this.q;
            int intValue = this.x.getId().intValue();
            String str = this.y;
            this.c = 1;
            obj = clubRepo.d(i2, intValue, str, this);
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
