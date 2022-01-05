package com.clubhouse.android.data.repos;

import i0.e.b.b3.b.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {532}, m = "createIncident")
/* compiled from: UserRepo.kt */
public final class UserRepo$createIncident$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ UserRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$createIncident$1(UserRepo userRepo, m0.l.c<? super UserRepo$createIncident$1> cVar) {
        super(cVar);
        this.q = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.d((String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, (d) null, this);
    }
}
