package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ChannelRepo", f = "ChannelRepo.kt", l = {304}, m = "raiseHands")
/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$raiseHands$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ ChannelRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$raiseHands$1(ChannelRepo channelRepo, m0.l.c<? super ChannelRepo$raiseHands$1> cVar) {
        super(cVar);
        this.x = channelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.y((String) null, this);
    }
}
