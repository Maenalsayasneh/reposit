package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {104}, m = "filter")
/* compiled from: PageEvent.kt */
public final class PageEvent$Insert$filter$1 extends ContinuationImpl {
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
    public Object g2;
    public int h2;
    public int i2;
    public final /* synthetic */ PageEvent.Insert q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$filter$1(PageEvent.Insert insert, m0.l.c cVar) {
        super(cVar);
        this.q = insert;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.a((p) null, this);
    }
}
