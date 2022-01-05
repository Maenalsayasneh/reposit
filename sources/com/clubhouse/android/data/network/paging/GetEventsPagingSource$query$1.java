package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetEventsPagingSource", f = "GetEventsPagingSource.kt", l = {29}, m = "query")
/* compiled from: GetEventsPagingSource.kt */
public final class GetEventsPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetEventsPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetEventsPagingSource$query$1(GetEventsPagingSource getEventsPagingSource, m0.l.c<? super GetEventsPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getEventsPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
