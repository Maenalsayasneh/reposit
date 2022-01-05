package com.airbnb.epoxy.paging3;

import h0.u.w;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.airbnb.epoxy.paging3.PagedDataModelCache", f = "PagedDataModelCache.kt", l = {131}, m = "submitData")
/* compiled from: PagedDataModelCache.kt */
public final class PagedDataModelCache$submitData$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ PagedDataModelCache q;
    public Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedDataModelCache$submitData$1(PagedDataModelCache pagedDataModelCache, m0.l.c cVar) {
        super(cVar);
        this.q = pagedDataModelCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.b((w) null, this);
    }
}
