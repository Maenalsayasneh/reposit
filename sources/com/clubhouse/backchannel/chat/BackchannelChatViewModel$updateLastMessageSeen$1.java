package com.clubhouse.backchannel.chat;

import i0.e.c.f.d.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.chat.BackchannelChatViewModel$updateLastMessageSeen$1", f = "BackchannelChatViewModel.kt", l = {174}, m = "invokeSuspend")
/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$updateLastMessageSeen$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ BackchannelChatViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$updateLastMessageSeen$1(BackchannelChatViewModel backchannelChatViewModel, int i, m0.l.c<? super BackchannelChatViewModel$updateLastMessageSeen$1> cVar) {
        super(1, cVar);
        this.d = backchannelChatViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BackchannelChatViewModel$updateLastMessageSeen$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new BackchannelChatViewModel$updateLastMessageSeen$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            BackchannelChatViewModel backchannelChatViewModel = this.d;
            a aVar = backchannelChatViewModel.o;
            String str = backchannelChatViewModel.n.a;
            int i2 = this.q;
            this.c = 1;
            if (aVar.q(str, i2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
