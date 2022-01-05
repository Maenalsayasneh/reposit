package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.SearchV2PagingSource", f = "SearchV2PagingSource.kt", l = {26}, m = "query")
/* compiled from: SearchV2PagingSource.kt */
public final class SearchV2PagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ SearchV2PagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchV2PagingSource$query$1(SearchV2PagingSource searchV2PagingSource, m0.l.c<? super SearchV2PagingSource$query$1> cVar) {
        super(cVar);
        this.q = searchV2PagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
