package com.clubhouse.backchannel.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo", f = "DefaultBackchannelRepo.kt", l = {386, 388}, m = "setMessageRequestsEnabled")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$setMessageRequestsEnabled$1 extends ContinuationImpl {
    public Object c;
    public boolean d;
    public /* synthetic */ Object q;
    public final /* synthetic */ DefaultBackchannelRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$setMessageRequestsEnabled$1(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$setMessageRequestsEnabled$1> cVar) {
        super(cVar);
        this.x = defaultBackchannelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(false, this);
    }
}
