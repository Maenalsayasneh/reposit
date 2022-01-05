package com.clubhouse.android.data.network;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.BuddyListDataSource", f = "BuddyListDataSource.kt", l = {49}, m = "makeRequest")
/* compiled from: BuddyListDataSource.kt */
public final class BuddyListDataSource$makeRequest$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ BuddyListDataSource q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListDataSource$makeRequest$1(BuddyListDataSource buddyListDataSource, m0.l.c<? super BuddyListDataSource$makeRequest$1> cVar) {
        super(cVar);
        this.q = buddyListDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.c(this);
    }
}
