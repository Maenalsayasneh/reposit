package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource", f = "SuggestedFollowPagingSource.kt", l = {32}, m = "query")
/* compiled from: SuggestedFollowPagingSource.kt */
public final class SuggestedFollowPagingSource$query$1 extends ContinuationImpl {
    public Object c;
    public int d;
    public /* synthetic */ Object q;
    public final /* synthetic */ SuggestedFollowPagingSource x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestedFollowPagingSource$query$1(SuggestedFollowPagingSource suggestedFollowPagingSource, m0.l.c<? super SuggestedFollowPagingSource$query$1> cVar) {
        super(cVar);
        this.x = suggestedFollowPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.e(0, 0, this);
    }
}
