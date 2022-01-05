package com.clubhouse.android.data.repos;

import i0.e.b.a3.c.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {360}, m = "updateTwitterProfile")
/* compiled from: UserRepo.kt */
public final class UserRepo$updateTwitterProfile$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ UserRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$updateTwitterProfile$1(UserRepo userRepo, m0.l.c<? super UserRepo$updateTwitterProfile$1> cVar) {
        super(cVar);
        this.q = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.B((a) null, this);
    }
}
