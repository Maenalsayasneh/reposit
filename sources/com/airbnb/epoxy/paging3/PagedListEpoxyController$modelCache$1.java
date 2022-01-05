package com.airbnb.epoxy.paging3;

import i0.b.a.t;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;

/* compiled from: PagedListEpoxyController.kt */
public final class PagedListEpoxyController$modelCache$1 extends Lambda implements p<Integer, T, t<?>> {
    public final /* synthetic */ PagedListEpoxyController c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedListEpoxyController$modelCache$1(PagedListEpoxyController pagedListEpoxyController) {
        super(2);
        this.c = pagedListEpoxyController;
    }

    public Object invoke(Object obj, Object obj2) {
        return this.c.buildItemModel(((Number) obj).intValue(), obj2);
    }
}
