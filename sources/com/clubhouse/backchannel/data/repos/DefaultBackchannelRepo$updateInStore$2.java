package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo", f = "DefaultBackchannelRepo.kt", l = {558}, m = "updateInStore")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$updateInStore$2 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ DefaultBackchannelRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$updateInStore$2(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$updateInStore$2> cVar) {
        super(cVar);
        this.x = defaultBackchannelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return DefaultBackchannelRepo.y(this.x, (ChatMessage) null, this);
    }
}
