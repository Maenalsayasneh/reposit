package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.ProfileViewModel$canCreateClub$1", f = "ProfileViewModel.kt", l = {529}, m = "invokeSuspend")
/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$canCreateClub$1 extends SuspendLambda implements l<m0.l.c<? super GetCanCreateClubResponse>, Object> {
    public int c;
    public final /* synthetic */ ProfileViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$canCreateClub$1(ProfileViewModel profileViewModel, m0.l.c<? super ProfileViewModel$canCreateClub$1> cVar) {
        super(1, cVar);
        this.d = profileViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ProfileViewModel$canCreateClub$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new ProfileViewModel$canCreateClub$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.t;
            this.c = 1;
            obj = clubRepo.g(this);
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
