package com.clubhouse.backchannel.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo", f = "DefaultBackchannelRepo.kt", l = {350}, m = "updateLastMessageSeen")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$updateLastMessageSeen$1 extends ContinuationImpl {
    public int Y1;
    public Object c;
    public Object d;
    public int q;
    public /* synthetic */ Object x;
    public final /* synthetic */ DefaultBackchannelRepo y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$updateLastMessageSeen$1(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$updateLastMessageSeen$1> cVar) {
        super(cVar);
        this.y = defaultBackchannelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.Y1 |= Integer.MIN_VALUE;
        return this.y.q((String) null, 0, this);
    }
}
