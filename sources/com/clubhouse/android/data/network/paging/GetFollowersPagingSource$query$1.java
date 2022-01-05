package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetFollowersPagingSource", f = "GetFollowersPagingSource.kt", l = {29}, m = "query")
/* compiled from: GetFollowersPagingSource.kt */
public final class GetFollowersPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetFollowersPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetFollowersPagingSource$query$1(GetFollowersPagingSource getFollowersPagingSource, m0.l.c<? super GetFollowersPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getFollowersPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
