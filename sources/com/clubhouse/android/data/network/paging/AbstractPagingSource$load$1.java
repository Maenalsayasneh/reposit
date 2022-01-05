package com.clubhouse.android.data.network.paging;

import h0.u.x;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.AbstractPagingSource", f = "AbstractPagingSource.kt", l = {22}, m = "load$suspendImpl")
/* compiled from: AbstractPagingSource.kt */
public final class AbstractPagingSource$load$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractPagingSource<T> d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractPagingSource$load$1(AbstractPagingSource<T> abstractPagingSource, m0.l.c<? super AbstractPagingSource$load$1> cVar) {
        super(cVar);
        this.d = abstractPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return AbstractPagingSource.d(this.d, (x.a) null, this);
    }
}
