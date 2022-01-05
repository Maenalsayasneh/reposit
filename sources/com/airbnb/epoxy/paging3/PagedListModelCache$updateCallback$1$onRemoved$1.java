package com.airbnb.epoxy.paging3;

import i0.b.a.p0.f;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.o;
import m0.n.a.a;
import m0.q.d;

/* compiled from: PagedListModelCache.kt */
public final class PagedListModelCache$updateCallback$1$onRemoved$1 extends Lambda implements a<i> {
    public final /* synthetic */ PagedListModelCache$updateCallback$1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedListModelCache$updateCallback$1$onRemoved$1(PagedListModelCache$updateCallback$1 pagedListModelCache$updateCallback$1, int i, int i2) {
        super(0);
        this.c = pagedListModelCache$updateCallback$1;
        this.d = i;
        this.q = i2;
    }

    public Object invoke() {
        f.a(this.c.a);
        Iterator it = m0.q.i.f(0, this.d).iterator();
        while (((d) it).hasNext()) {
            ((o) it).a();
            this.c.a.a.remove(this.q);
        }
        this.c.a.g.invoke();
        return i.a;
    }
}
