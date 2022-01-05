package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetNotificationsPagingSource", f = "GetNotificationsPagingSource.kt", l = {31}, m = "query")
/* compiled from: GetNotificationsPagingSource.kt */
public final class GetNotificationsPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GetNotificationsPagingSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetNotificationsPagingSource$query$1(GetNotificationsPagingSource getNotificationsPagingSource, m0.l.c<? super GetNotificationsPagingSource$query$1> cVar) {
        super(cVar);
        this.q = getNotificationsPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.e(0, 0, this);
    }
}
