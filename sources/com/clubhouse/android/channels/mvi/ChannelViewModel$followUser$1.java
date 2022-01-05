package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.user.model.User;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$followUser$1", f = "ChannelViewModel.kt", l = {432}, m = "invokeSuspend")
/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$followUser$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ChannelViewModel d;
    public final /* synthetic */ User q;
    public final /* synthetic */ SourceLocation x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$followUser$1(ChannelViewModel channelViewModel, User user, SourceLocation sourceLocation, m0.l.c<? super ChannelViewModel$followUser$1> cVar) {
        super(1, cVar);
        this.d = channelViewModel;
        this.q = user;
        this.x = sourceLocation;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChannelViewModel$followUser$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ChannelViewModel$followUser$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.t;
            int intValue = this.q.getId().intValue();
            SourceLocation sourceLocation = this.x;
            this.c = 1;
            obj = UserRepo.j(userRepo, intValue, sourceLocation, (Map) null, this, 4, (Object) null);
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
