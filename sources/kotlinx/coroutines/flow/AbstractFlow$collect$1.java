package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
/* compiled from: Flow.kt */
public final class AbstractFlow$collect$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractFlow<T> q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, m0.l.c<? super AbstractFlow$collect$1> cVar) {
        super(cVar);
        this.q = abstractFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.collect((e) null, this);
    }
}
