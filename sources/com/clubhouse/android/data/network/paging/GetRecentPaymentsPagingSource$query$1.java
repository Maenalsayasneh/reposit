package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetRecentPaymentsPagingSource", f = "GetRecentPaymentsPagingSource.kt", l = {23}, m = "query")
/* compiled from: GetRecentPaymentsPagingSource.kt */
public final class GetRecentPaymentsPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetRecentPaymentsPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRecentPaymentsPagingSource$query$1(GetRecentPaymentsPagingSource getRecentPaymentsPagingSource, m0.l.c<? super GetRecentPaymentsPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getRecentPaymentsPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
