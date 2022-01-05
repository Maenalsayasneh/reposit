package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetMutualFollowsPagingSource", f = "GetMutualFollowsPagingSource.kt", l = {25}, m = "query")
/* compiled from: GetMutualFollowsPagingSource.kt */
public final class GetMutualFollowsPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetMutualFollowsPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetMutualFollowsPagingSource$query$1(GetMutualFollowsPagingSource getMutualFollowsPagingSource, m0.l.c<? super GetMutualFollowsPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getMutualFollowsPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
