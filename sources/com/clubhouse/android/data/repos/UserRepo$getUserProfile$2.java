package com.clubhouse.android.data.repos;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {195}, m = "getUserProfile")
/* compiled from: UserRepo.kt */
public final class UserRepo$getUserProfile$2 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ UserRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getUserProfile$2(UserRepo userRepo, m0.l.c<? super UserRepo$getUserProfile$2> cVar) {
        super(cVar);
        this.x = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.p((Integer) null, (String) null, (Map<String, ? extends Object>) null, this);
    }
}
