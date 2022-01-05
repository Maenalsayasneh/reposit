package com.clubhouse.backchannel.data.repos;

import com.clubhouse.android.core.storage.Store;
import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$updateLastMessageSeen$2$1", f = "DefaultBackchannelRepo.kt", l = {358}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$updateLastMessageSeen$2$1 extends SuspendLambda implements l<m0.l.c<? super List<? extends Store.a<String, Chat>>>, Object> {
    public int c;
    public final /* synthetic */ DefaultBackchannelRepo d;
    public final /* synthetic */ String q;
    public final /* synthetic */ int x;
    public final /* synthetic */ Chat y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$updateLastMessageSeen$2$1(DefaultBackchannelRepo defaultBackchannelRepo, String str, int i, Chat chat, m0.l.c<? super DefaultBackchannelRepo$updateLastMessageSeen$2$1> cVar) {
        super(1, cVar);
        this.d = defaultBackchannelRepo;
        this.q = str;
        this.x = i;
        this.y = chat;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new DefaultBackchannelRepo$updateLastMessageSeen$2$1(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj) {
        return new DefaultBackchannelRepo$updateLastMessageSeen$2$1(this.d, this.q, this.x, this.y, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            DefaultBackchannelRepo defaultBackchannelRepo = this.d;
            String str = this.q;
            int i2 = this.x;
            this.c = 1;
            if (DefaultBackchannelRepo.z(defaultBackchannelRepo, str, i2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h.L2(new Store.a.c(this.y));
    }
}
