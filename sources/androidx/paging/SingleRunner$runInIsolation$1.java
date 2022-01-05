package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
/* compiled from: SingleRunner.kt */
public final class SingleRunner$runInIsolation$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ SingleRunner q;
    public Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$1(SingleRunner singleRunner, m0.l.c cVar) {
        super(cVar);
        this.q = singleRunner;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.a(0, (l<? super m0.l.c<? super i>, ? extends Object>) null, this);
    }
}
