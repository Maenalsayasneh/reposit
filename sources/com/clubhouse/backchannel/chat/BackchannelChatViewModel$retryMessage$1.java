package com.clubhouse.backchannel.chat;

import i0.e.c.f.d.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.chat.BackchannelChatViewModel$retryMessage$1", f = "BackchannelChatViewModel.kt", l = {182}, m = "invokeSuspend")
/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$retryMessage$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ BackchannelChatViewModel d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$retryMessage$1(BackchannelChatViewModel backchannelChatViewModel, String str, m0.l.c<? super BackchannelChatViewModel$retryMessage$1> cVar) {
        super(1, cVar);
        this.d = backchannelChatViewModel;
        this.q = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BackchannelChatViewModel$retryMessage$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new BackchannelChatViewModel$retryMessage$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.o;
            String str = this.q;
            this.c = 1;
            if (aVar.o(str, this) == coroutineSingletons) {
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
