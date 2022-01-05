package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$refresh$1", f = "ClubViewModel.kt", l = {187}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$refresh$1 extends SuspendLambda implements l<m0.l.c<? super GetClubResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$refresh$1(ClubViewModel clubViewModel, int i, m0.l.c<? super ClubViewModel$refresh$1> cVar) {
        super(1, cVar);
        this.d = clubViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubViewModel$refresh$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubViewModel$refresh$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.q;
            Integer num = new Integer(this.q);
            this.c = 1;
            obj = clubRepo.j(num, (String) null, (String) null, (Map<String, ? extends Object>) null, this);
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
