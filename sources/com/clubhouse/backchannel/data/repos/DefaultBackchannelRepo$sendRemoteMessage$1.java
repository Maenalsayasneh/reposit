package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo", f = "DefaultBackchannelRepo.kt", l = {457}, m = "sendRemoteMessage")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$sendRemoteMessage$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ DefaultBackchannelRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$sendRemoteMessage$1(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$sendRemoteMessage$1> cVar) {
        super(cVar);
        this.q = defaultBackchannelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return DefaultBackchannelRepo.x(this.q, (ChatMessage) null, this);
    }
}
