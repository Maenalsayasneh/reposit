package com.clubhouse.android.data.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.data.network.AbstractDataSource", f = "AbstractDataSource.kt", l = {32}, m = "getResult")
/* compiled from: AbstractDataSource.kt */
public final class AbstractDataSource$getResult$1<T> extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractDataSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDataSource$getResult$1(AbstractDataSource abstractDataSource, m0.l.c<? super AbstractDataSource$getResult$1> cVar) {
        super(cVar);
        this.q = abstractDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.a((l) null, this);
    }
}
