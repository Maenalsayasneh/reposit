package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {228}, m = "getSuggestedFollowsSimilar")
/* compiled from: UserRepo.kt */
public final class UserRepo$getSuggestedFollowsSimilar$1 extends ContinuationImpl {
    public Object c;
    public int d;
    public /* synthetic */ Object q;
    public final /* synthetic */ UserRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getSuggestedFollowsSimilar$1(UserRepo userRepo, m0.l.c<? super UserRepo$getSuggestedFollowsSimilar$1> cVar) {
        super(cVar);
        this.x = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.n(0, this);
    }
}
