package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {303, 366, 378, 384, 396, 405, 427, 436, 449, 460}, m = "onInsert")
/* compiled from: Separators.kt */
public final class SeparatorState$onInsert$1 extends ContinuationImpl {
    public Object Y1;
    public Object Z1;
    public Object a2;
    public Object b2;
    public /* synthetic */ Object c;
    public Object c2;
    public int d;
    public Object d2;
    public Object e2;
    public Object f2;
    public boolean g2;
    public int h2;
    public int i2;
    public int j2;
    public final /* synthetic */ SeparatorState q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeparatorState$onInsert$1(SeparatorState separatorState, m0.l.c cVar) {
        super(cVar);
        this.q = separatorState;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.b((PageEvent.Insert) null, this);
    }
}
