package com.clubhouse.backchannel.chat;

import i0.e.c.f.b.a.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.chat.BackchannelChatViewModel$loadChat$1", f = "BackchannelChatViewModel.kt", l = {152}, m = "invokeSuspend")
/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$loadChat$1 extends SuspendLambda implements l<m0.l.c<? super a>, Object> {
    public int c;
    public final /* synthetic */ BackchannelChatViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$loadChat$1(BackchannelChatViewModel backchannelChatViewModel, m0.l.c<? super BackchannelChatViewModel$loadChat$1> cVar) {
        super(1, cVar);
        this.d = backchannelChatViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BackchannelChatViewModel$loadChat$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new BackchannelChatViewModel$loadChat$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            BackchannelChatViewModel backchannelChatViewModel = this.d;
            i0.e.c.f.d.a aVar = backchannelChatViewModel.o;
            String str = backchannelChatViewModel.n.a;
            this.c = 1;
            obj = aVar.l(str, this);
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
