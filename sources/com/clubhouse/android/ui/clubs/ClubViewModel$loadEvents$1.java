package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetEventsResponse;
import com.clubhouse.android.data.repos.EventRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$loadEvents$1", f = "ClubViewModel.kt", l = {198}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$loadEvents$1 extends SuspendLambda implements l<m0.l.c<? super GetEventsResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ Integer q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$loadEvents$1(ClubViewModel clubViewModel, Integer num, m0.l.c<? super ClubViewModel$loadEvents$1> cVar) {
        super(1, cVar);
        this.d = clubViewModel;
        this.q = num;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubViewModel$loadEvents$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubViewModel$loadEvents$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            EventRepo eventRepo = this.d.s;
            int intValue = this.q.intValue();
            this.c = 1;
            obj = eventRepo.e(intValue, this);
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
