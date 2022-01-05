package com.clubhouse.android.ui.hallway.buddyList;

import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.remote.request.CreateChannelRequest;
import com.clubhouse.android.data.repos.ChannelRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel$createClosedChannel$1", f = "BuddyListViewModel.kt", l = {313}, m = "invokeSuspend")
/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$createClosedChannel$1 extends SuspendLambda implements l<m0.l.c<? super ChannelInRoomWithAccess>, Object> {
    public int c;
    public final /* synthetic */ BuddyListViewModel d;
    public final /* synthetic */ CreateChannelRequest q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$createClosedChannel$1(BuddyListViewModel buddyListViewModel, CreateChannelRequest createChannelRequest, m0.l.c<? super BuddyListViewModel$createClosedChannel$1> cVar) {
        super(1, cVar);
        this.d = buddyListViewModel;
        this.q = createChannelRequest;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BuddyListViewModel$createClosedChannel$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new BuddyListViewModel$createClosedChannel$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ChannelRepo channelRepo = this.d.s;
            CreateChannelRequest createChannelRequest = this.q;
            this.c = 1;
            obj = channelRepo.g(createChannelRequest, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
