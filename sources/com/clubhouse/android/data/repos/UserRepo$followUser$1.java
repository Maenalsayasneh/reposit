package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.UserRepo", f = "UserRepo.kt", l = {290, 292}, m = "followUser")
/* compiled from: UserRepo.kt */
public final class UserRepo$followUser$1 extends ContinuationImpl {
    public final /* synthetic */ UserRepo Y1;
    public int Z1;
    public Object c;
    public Object d;
    public Object q;
    public int x;
    public /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$followUser$1(UserRepo userRepo, m0.l.c<? super UserRepo$followUser$1> cVar) {
        super(cVar);
        this.Y1 = userRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.Z1 |= Integer.MIN_VALUE;
        return this.Y1.i(0, (SourceLocation) null, (Map<String, ? extends Object>) null, this);
    }
}
