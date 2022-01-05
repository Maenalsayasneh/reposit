package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource", f = "GetEventsPagingForUserSource.kt", l = {32}, m = "query")
/* compiled from: GetEventsPagingForUserSource.kt */
public final class GetEventsPagingForUserSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetEventsPagingForUserSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetEventsPagingForUserSource$query$1(GetEventsPagingForUserSource getEventsPagingForUserSource, m0.l.c<? super GetEventsPagingForUserSource$query$1> cVar) {
        super(cVar);
        this.q = getEventsPagingForUserSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
