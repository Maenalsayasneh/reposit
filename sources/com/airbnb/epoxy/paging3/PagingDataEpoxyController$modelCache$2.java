package com.airbnb.epoxy.paging3;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: PagingDataEpoxyController.kt */
public final class PagingDataEpoxyController$modelCache$2 extends Lambda implements a<i> {
    public final /* synthetic */ PagingDataEpoxyController c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataEpoxyController$modelCache$2(PagingDataEpoxyController pagingDataEpoxyController) {
        super(0);
        this.c = pagingDataEpoxyController;
    }

    public Object invoke() {
        this.c.requestModelBuild();
        return i.a;
    }
}
