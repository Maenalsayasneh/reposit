package com.clubhouse.backchannel.data.repos;

import com.clubhouse.android.core.storage.Store;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import i0.e.b.a3.e.a;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$sendMessage$3$1", f = "DefaultBackchannelRepo.kt", l = {335}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$sendMessage$3$1 extends SuspendLambda implements l<m0.l.c<? super List<? extends Store.a<String, ChatMessage>>>, Object> {
    public int c;
    public final /* synthetic */ DefaultBackchannelRepo d;
    public final /* synthetic */ ChatMessage q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$sendMessage$3$1(DefaultBackchannelRepo defaultBackchannelRepo, ChatMessage chatMessage, m0.l.c<? super DefaultBackchannelRepo$sendMessage$3$1> cVar) {
        super(1, cVar);
        this.d = defaultBackchannelRepo;
        this.q = chatMessage;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new DefaultBackchannelRepo$sendMessage$3$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new DefaultBackchannelRepo$sendMessage$3$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            DefaultBackchannelRepo defaultBackchannelRepo = this.d;
            ChatMessage chatMessage = this.q;
            this.c = 1;
            obj = DefaultBackchannelRepo.x(defaultBackchannelRepo, chatMessage, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h.L2(new Store.a.c((a) obj));
    }
}
