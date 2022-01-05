package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.ReportTarget;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {550}, m = "getIncidentCategories")
/* compiled from: UserRepo.kt */
public final class UserRepo$getIncidentCategories$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ UserRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getIncidentCategories$1(UserRepo userRepo, m0.l.c<? super UserRepo$getIncidentCategories$1> cVar) {
        super(cVar);
        this.q = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.l((IncidentCategory) null, (ReportTarget) null, this);
    }
}
