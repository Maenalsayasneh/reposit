package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetFollowingPagingSource", f = "GetFollowingPagingSource.kt", l = {26}, m = "query")
/* compiled from: GetFollowingPagingSource.kt */
public final class GetFollowingPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetFollowingPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFollowingPagingSource$query$1(GetFollowingPagingSource getFollowingPagingSource, m0.l.c<? super GetFollowingPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getFollowingPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
