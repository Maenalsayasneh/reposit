package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$updateMemberPrivacy$1", f = "ClubViewModel.kt", l = {532}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$updateMemberPrivacy$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$updateMemberPrivacy$1(ClubViewModel clubViewModel, int i, boolean z, m0.l.c<? super ClubViewModel$updateMemberPrivacy$1> cVar) {
        super(1, cVar);
        this.d = clubViewModel;
        this.q = i;
        this.x = z;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubViewModel$updateMemberPrivacy$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubViewModel$updateMemberPrivacy$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.q;
            int i2 = this.q;
            boolean z = this.x;
            this.c = 1;
            obj = clubRepo.B(i2, z, this);
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
