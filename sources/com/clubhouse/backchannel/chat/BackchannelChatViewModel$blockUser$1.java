package com.clubhouse.backchannel.chat;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.chat.BackchannelChatViewModel$blockUser$1", f = "BackchannelChatViewModel.kt", l = {190}, m = "invokeSuspend")
/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$blockUser$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ BackchannelChatViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$blockUser$1(BackchannelChatViewModel backchannelChatViewModel, int i, m0.l.c<? super BackchannelChatViewModel$blockUser$1> cVar) {
        super(1, cVar);
        this.d = backchannelChatViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BackchannelChatViewModel$blockUser$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new BackchannelChatViewModel$blockUser$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.p;
            int i2 = this.q;
            this.c = 1;
            obj = userRepo.b(i2, this);
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
