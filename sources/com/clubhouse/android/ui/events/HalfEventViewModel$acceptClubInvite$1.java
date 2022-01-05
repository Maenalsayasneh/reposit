package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.events.HalfEventViewModel$acceptClubInvite$1", f = "HalfEventViewModel.kt", l = {176}, m = "invokeSuspend")
/* compiled from: HalfEventViewModel.kt */
public final class HalfEventViewModel$acceptClubInvite$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ HalfEventViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventViewModel$acceptClubInvite$1(HalfEventViewModel halfEventViewModel, int i, m0.l.c<? super HalfEventViewModel$acceptClubInvite$1> cVar) {
        super(1, cVar);
        this.d = halfEventViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new HalfEventViewModel$acceptClubInvite$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new HalfEventViewModel$acceptClubInvite$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.q;
            int i2 = this.q;
            this.c = 1;
            obj = clubRepo.a(i2, this);
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
