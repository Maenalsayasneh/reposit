package com.airbnb.epoxy.paging3;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: PagedListEpoxyController.kt */
public final class PagedListEpoxyController$modelCache$2 extends Lambda implements a<i> {
    public final /* synthetic */ PagedListEpoxyController c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedListEpoxyController$modelCache$2(PagedListEpoxyController pagedListEpoxyController) {
        super(0);
        this.c = pagedListEpoxyController;
    }

    public Object invoke() {
        this.c.requestModelBuild();
        return i.a;
    }
}
