package com.clubhouse.android.ui.clubs.nominations;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.nominations.ClubNominationsViewModel$approveNomination$1", f = "ClubNominationsViewModel.kt", l = {100}, m = "invokeSuspend")
/* compiled from: ClubNominationsViewModel.kt */
public final class ClubNominationsViewModel$approveNomination$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubNominationsViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ int x;
    public final /* synthetic */ Integer y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsViewModel$approveNomination$1(ClubNominationsViewModel clubNominationsViewModel, int i, int i2, Integer num, m0.l.c<? super ClubNominationsViewModel$approveNomination$1> cVar) {
        super(1, cVar);
        this.d = clubNominationsViewModel;
        this.q = i;
        this.x = i2;
        this.y = num;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubNominationsViewModel$approveNomination$1(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubNominationsViewModel$approveNomination$1(this.d, this.q, this.x, this.y, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.o;
            int i2 = this.q;
            int i3 = this.x;
            Integer num = this.y;
            this.c = 1;
            obj = clubRepo.f(i2, i3, num, this);
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
