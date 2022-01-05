package com.clubhouse.android.data.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.MeDataSource", f = "MeDataSource.kt", l = {30}, m = "makeRequest")
/* compiled from: MeDataSource.kt */
public final class MeDataSource$makeRequest$1 extends ContinuationImpl {
    public Object c;
    public long d;
    public /* synthetic */ Object q;
    public final /* synthetic */ MeDataSource x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeDataSource$makeRequest$1(MeDataSource meDataSource, m0.l.c<? super MeDataSource$makeRequest$1> cVar) {
        super(cVar);
        this.x = meDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(this);
    }
}
