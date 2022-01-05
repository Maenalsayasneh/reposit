package com.clubhouse.android.data.network.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.network.paging.GetRecentSpeakersPagingSource", f = "GetRecentSpeakersPagingSource.kt", l = {22}, m = "query")
/* compiled from: GetRecentSpeakersPagingSource.kt */
public final class GetRecentSpeakersPagingSource$query$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ GetRecentSpeakersPagingSource d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRecentSpeakersPagingSource$query$1(GetRecentSpeakersPagingSource getRecentSpeakersPagingSource, m0.l.c<? super GetRecentSpeakersPagingSource$query$1> cVar) {
        super(cVar);
        this.d = getRecentSpeakersPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.e(0, 0, this);
    }
}
