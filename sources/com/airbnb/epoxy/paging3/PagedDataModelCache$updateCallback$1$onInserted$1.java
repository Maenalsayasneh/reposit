package com.airbnb.epoxy.paging3;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: PagedDataModelCache.kt */
public final class PagedDataModelCache$updateCallback$1$onInserted$1 extends Lambda implements a<i> {
    public final /* synthetic */ PagedDataModelCache$updateCallback$1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedDataModelCache$updateCallback$1$onInserted$1(PagedDataModelCache$updateCallback$1 pagedDataModelCache$updateCallback$1, int i, int i2) {
        super(0);
        this.c = pagedDataModelCache$updateCallback$1;
        this.d = i;
        this.q = i2;
    }

    public Object invoke() {
        PagedDataModelCache.a(this.c.a);
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            this.c.a.a.add(this.q, (Object) null);
        }
        this.c.a.h.invoke();
        return i.a;
    }
}
