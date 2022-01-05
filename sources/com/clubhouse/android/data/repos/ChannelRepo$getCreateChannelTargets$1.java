package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ChannelRepo", f = "ChannelRepo.kt", l = {96}, m = "getCreateChannelTargets")
/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$getCreateChannelTargets$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ChannelRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$getCreateChannelTargets$1(ChannelRepo channelRepo, m0.l.c<? super ChannelRepo$getCreateChannelTargets$1> cVar) {
        super(cVar);
        this.q = channelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.k(this);
    }
}
