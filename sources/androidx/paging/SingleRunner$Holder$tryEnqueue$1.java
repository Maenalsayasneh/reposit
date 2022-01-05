package androidx.paging;

import androidx.paging.SingleRunner;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.f1;

@c(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129, 100}, m = "tryEnqueue")
/* compiled from: SingleRunner.kt */
public final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {
    public Object Y1;
    public int Z1;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ SingleRunner.Holder q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$tryEnqueue$1(SingleRunner.Holder holder, m0.l.c cVar) {
        super(cVar);
        this.q = holder;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.b(0, (f1) null, this);
    }
}
