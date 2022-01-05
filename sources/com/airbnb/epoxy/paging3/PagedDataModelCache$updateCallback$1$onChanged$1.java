package com.airbnb.epoxy.paging3;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.o;
import m0.n.a.a;
import m0.q.d;

/* compiled from: PagedDataModelCache.kt */
public final class PagedDataModelCache$updateCallback$1$onChanged$1 extends Lambda implements a<i> {
    public final /* synthetic */ PagedDataModelCache$updateCallback$1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedDataModelCache$updateCallback$1$onChanged$1(PagedDataModelCache$updateCallback$1 pagedDataModelCache$updateCallback$1, int i, int i2) {
        super(0);
        this.c = pagedDataModelCache$updateCallback$1;
        this.d = i;
        this.q = i2;
    }

    public Object invoke() {
        PagedDataModelCache.a(this.c.a);
        int i = this.d;
        Iterator it = m0.q.i.f(i, this.q + i).iterator();
        while (((d) it).hasNext()) {
            this.c.a.a.set(((o) it).a(), (Object) null);
        }
        this.c.a.h.invoke();
        return i.a;
    }
}
