package com.clubhouse.android.data.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.RefreshableDataSource", f = "RefreshableDataSource.kt", l = {51, 52}, m = "fetch")
/* compiled from: RefreshableDataSource.kt */
public final class RefreshableDataSource$fetch$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ RefreshableDataSource<T> q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshableDataSource$fetch$1(RefreshableDataSource<T> refreshableDataSource, m0.l.c<? super RefreshableDataSource$fetch$1> cVar) {
        super(cVar);
        this.q = refreshableDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
