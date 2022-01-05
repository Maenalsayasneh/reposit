package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.SearchUsersPagingSource", f = "SearchUsersPagingSource.kt", l = {26}, m = "query")
/* compiled from: SearchUsersPagingSource.kt */
public final class SearchUsersPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ SearchUsersPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchUsersPagingSource$query$1(SearchUsersPagingSource searchUsersPagingSource, m0.l.c<? super SearchUsersPagingSource$query$1> cVar) {
        super(cVar);
        this.q = searchUsersPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
