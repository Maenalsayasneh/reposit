package com.clubhouse.android.ui.onboarding;

import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.g3.r.a3.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.FollowFriendsFragment$onViewCreated$1", f = "FollowFriendsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowFriendsFragment.kt */
public final class FollowFriendsFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowFriendsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsFragment$onViewCreated$1(FollowFriendsFragment followFriendsFragment, m0.l.c<? super FollowFriendsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = followFriendsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowFriendsFragment$onViewCreated$1 followFriendsFragment$onViewCreated$1 = new FollowFriendsFragment$onViewCreated$1(this.d, cVar);
        followFriendsFragment$onViewCreated$1.c = obj;
        return followFriendsFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        FollowFriendsFragment$onViewCreated$1 followFriendsFragment$onViewCreated$1 = new FollowFriendsFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        followFriendsFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        followFriendsFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof d) {
            v.b1(this.d, ((d) bVar).a);
        }
        return i.a;
    }
}
