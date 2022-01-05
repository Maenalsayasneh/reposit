package com.clubhouse.android.data.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.FeedDataSource", f = "FeedDataSource.kt", l = {28}, m = "getFeedItems")
/* compiled from: FeedDataSource.kt */
public final class FeedDataSource$getFeedItems$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ FeedDataSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedDataSource$getFeedItems$1(FeedDataSource feedDataSource, m0.l.c<? super FeedDataSource$getFeedItems$1> cVar) {
        super(cVar);
        this.q = feedDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
