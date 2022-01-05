package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {213, 215}, m = "onEvent")
/* compiled from: Separators.kt */
public final class SeparatorState$onEvent$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ SeparatorState q;
    public Object x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeparatorState$onEvent$1(SeparatorState separatorState, m0.l.c cVar) {
        super(cVar);
        this.q = separatorState;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.a((PageEvent) null, this);
    }
}
