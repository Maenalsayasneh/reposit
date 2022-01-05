package com.clubhouse.android.data.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {582}, m = "clearRecentSearches")
/* compiled from: UserRepo.kt */
public final class UserRepo$clearRecentSearches$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ UserRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$clearRecentSearches$1(UserRepo userRepo, m0.l.c<? super UserRepo$clearRecentSearches$1> cVar) {
        super(cVar);
        this.d = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
