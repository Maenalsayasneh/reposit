package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetClubMembersPagingSource", f = "GetClubMembersPagingSource.kt", l = {29}, m = "query")
/* compiled from: GetClubMembersPagingSource.kt */
public final class GetClubMembersPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetClubMembersPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetClubMembersPagingSource$query$1(GetClubMembersPagingSource getClubMembersPagingSource, m0.l.c<? super GetClubMembersPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getClubMembersPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
