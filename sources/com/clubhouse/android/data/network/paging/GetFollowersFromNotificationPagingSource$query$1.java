package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetFollowersFromNotificationPagingSource", f = "GetFollowersFromNotificationPagingSource.kt", l = {28}, m = "query")
/* compiled from: GetFollowersFromNotificationPagingSource.kt */
public final class GetFollowersFromNotificationPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetFollowersFromNotificationPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFollowersFromNotificationPagingSource$query$1(GetFollowersFromNotificationPagingSource getFollowersFromNotificationPagingSource, m0.l.c<? super GetFollowersFromNotificationPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getFollowersFromNotificationPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
