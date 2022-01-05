package com.clubhouse.backchannel.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo", f = "DefaultBackchannelRepo.kt", l = {367}, m = "addChatMember")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$addChatMember$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ DefaultBackchannelRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$addChatMember$1(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$addChatMember$1> cVar) {
        super(cVar);
        this.q = defaultBackchannelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.f((String) null, 0, this);
    }
}
