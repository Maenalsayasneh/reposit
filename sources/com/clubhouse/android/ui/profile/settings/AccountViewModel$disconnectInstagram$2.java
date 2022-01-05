package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.request.UpdateInstagramProfileResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.settings.AccountViewModel$disconnectInstagram$2", f = "AccountViewModel.kt", l = {160}, m = "invokeSuspend")
/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$disconnectInstagram$2 extends SuspendLambda implements l<m0.l.c<? super UpdateInstagramProfileResponse>, Object> {
    public int c;
    public final /* synthetic */ AccountViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$disconnectInstagram$2(AccountViewModel accountViewModel, m0.l.c<? super AccountViewModel$disconnectInstagram$2> cVar) {
        super(1, cVar);
        this.d = accountViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new AccountViewModel$disconnectInstagram$2(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new AccountViewModel$disconnectInstagram$2(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.q;
            this.c = 1;
            obj = userRepo.f(this);
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
