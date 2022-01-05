package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.MessageData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo", f = "DefaultBackchannelRepo.kt", l = {323}, m = "sendMessage")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$sendMessage$2 extends ContinuationImpl {
    public final /* synthetic */ DefaultBackchannelRepo Y1;
    public int Z1;
    public Object c;
    public Object d;
    public Object q;
    public Object x;
    public /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$sendMessage$2(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$sendMessage$2> cVar) {
        super(cVar);
        this.Y1 = defaultBackchannelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.Z1 |= Integer.MIN_VALUE;
        return this.Y1.D((String) null, (MessageData) null, (String) null, this);
    }
}
