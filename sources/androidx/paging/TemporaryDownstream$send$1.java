package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.j.l;
import m0.l.f.a.c;

@c(c = "androidx.paging.TemporaryDownstream", f = "CachedPageEventFlow.kt", l = {149}, m = "send")
/* compiled from: CachedPageEventFlow.kt */
public final class TemporaryDownstream$send$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ TemporaryDownstream q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemporaryDownstream$send$1(TemporaryDownstream temporaryDownstream, m0.l.c cVar) {
        super(cVar);
        this.q = temporaryDownstream;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.a((l) null, this);
    }
}
