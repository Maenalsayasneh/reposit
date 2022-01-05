package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.SearchClubMembersPagingSource", f = "SearchClubMembersPagingSource.kt", l = {26}, m = "query")
/* compiled from: SearchClubMembersPagingSource.kt */
public final class SearchClubMembersPagingSource$query$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ SearchClubMembersPagingSource d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchClubMembersPagingSource$query$1(SearchClubMembersPagingSource searchClubMembersPagingSource, m0.l.c<? super SearchClubMembersPagingSource$query$1> cVar) {
        super(cVar);
        this.d = searchClubMembersPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.e(0, 0, this);
    }
}
