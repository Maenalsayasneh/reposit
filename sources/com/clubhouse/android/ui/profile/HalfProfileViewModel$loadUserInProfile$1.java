package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$loadUserInProfile$1", f = "HalfProfileViewModel.kt", l = {287}, m = "invokeSuspend")
/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$loadUserInProfile$1 extends SuspendLambda implements l<m0.l.c<? super GetProfileResponse>, Object> {
    public int c;
    public final /* synthetic */ HalfProfileViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$loadUserInProfile$1(HalfProfileViewModel halfProfileViewModel, int i, m0.l.c<? super HalfProfileViewModel$loadUserInProfile$1> cVar) {
        super(1, cVar);
        this.d = halfProfileViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new HalfProfileViewModel$loadUserInProfile$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new HalfProfileViewModel$loadUserInProfile$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.s;
            Integer num = new Integer(this.q);
            this.c = 1;
            obj = UserRepo.q(userRepo, num, (String) null, (Map) null, this, 6, (Object) null);
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
