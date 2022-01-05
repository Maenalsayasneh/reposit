package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.user.ReportReason;
import i0.e.b.b3.b.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {479}, m = "reportIncident")
/* compiled from: UserRepo.kt */
public final class UserRepo$reportIncident$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ UserRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$reportIncident$1(UserRepo userRepo, m0.l.c<? super UserRepo$reportIncident$1> cVar) {
        super(cVar);
        this.q = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.v(0, (String) null, (ReportReason) null, (String) null, (String) null, (d) null, this);
    }
}
