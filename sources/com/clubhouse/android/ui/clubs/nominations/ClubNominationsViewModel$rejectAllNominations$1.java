package com.clubhouse.android.ui.clubs.nominations;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.nominations.ClubNominationsViewModel$rejectAllNominations$1", f = "ClubNominationsViewModel.kt", l = {142}, m = "invokeSuspend")
/* compiled from: ClubNominationsViewModel.kt */
public final class ClubNominationsViewModel$rejectAllNominations$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubNominationsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsViewModel$rejectAllNominations$1(ClubNominationsViewModel clubNominationsViewModel, m0.l.c<? super ClubNominationsViewModel$rejectAllNominations$1> cVar) {
        super(1, cVar);
        this.d = clubNominationsViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubNominationsViewModel$rejectAllNominations$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubNominationsViewModel$rejectAllNominations$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubNominationsViewModel clubNominationsViewModel = this.d;
            ClubRepo clubRepo = clubNominationsViewModel.o;
            int i2 = clubNominationsViewModel.n.a;
            this.c = 1;
            obj = clubRepo.p(i2, this);
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
