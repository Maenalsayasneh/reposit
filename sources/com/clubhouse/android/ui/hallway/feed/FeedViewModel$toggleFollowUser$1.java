package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.UserRepo;
import i0.e.b.b3.b.e.m;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$toggleFollowUser$1", f = "FeedViewModel.kt", l = {241, 246}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$toggleFollowUser$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;
    public final /* synthetic */ m q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$toggleFollowUser$1(FeedViewModel feedViewModel, m mVar, m0.l.c<? super FeedViewModel$toggleFollowUser$1> cVar) {
        super(1, cVar);
        this.d = feedViewModel;
        this.q = mVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FeedViewModel$toggleFollowUser$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new FeedViewModel$toggleFollowUser$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            if (this.d.t.t(this.q.g.getId().intValue())) {
                UserRepo userRepo = this.d.t;
                int intValue = this.q.g.getId().intValue();
                this.c = 1;
                if (userRepo.x(intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                UserRepo userRepo2 = this.d.t;
                int intValue2 = this.q.g.getId().intValue();
                SourceLocation sourceLocation = SourceLocation.HALLWAY;
                this.c = 2;
                if (UserRepo.j(userRepo2, intValue2, sourceLocation, (Map) null, this, 4, (Object) null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.d.o.a(SourceLocation.HALLWAY, this.q.g.b2);
                return i.a;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            this.d.o.a(SourceLocation.HALLWAY, this.q.g.b2);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.d.o.b(SourceLocation.HALLWAY, this.q.g.b2);
        return i.a;
    }
}
