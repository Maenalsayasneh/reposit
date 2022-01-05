package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.ChannelRepo", f = "ChannelRepo.kt", l = {340}, m = "changeHandraisePermissions")
/* compiled from: ChannelRepo.kt */
public final class ChannelRepo$changeHandraisePermissions$1 extends ContinuationImpl {
    public int Y1;
    public Object c;
    public Object d;
    public Object q;
    public /* synthetic */ Object x;
    public final /* synthetic */ ChannelRepo y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelRepo$changeHandraisePermissions$1(ChannelRepo channelRepo, m0.l.c<? super ChannelRepo$changeHandraisePermissions$1> cVar) {
        super(cVar);
        this.y = channelRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.Y1 |= Integer.MIN_VALUE;
        return this.y.e((String) null, false, (HandraisePermission) null, this);
    }
}
