package com.clubhouse.android.data.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.UserProfileDataSource", f = "UserProfileDataSource.kt", l = {29}, m = "makeRequest")
/* compiled from: UserProfileDataSource.kt */
public final class UserProfileDataSource$makeRequest$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ UserProfileDataSource x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserProfileDataSource$makeRequest$1(UserProfileDataSource userProfileDataSource, m0.l.c<? super UserProfileDataSource$makeRequest$1> cVar) {
        super(cVar);
        this.x = userProfileDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(this);
    }
}
