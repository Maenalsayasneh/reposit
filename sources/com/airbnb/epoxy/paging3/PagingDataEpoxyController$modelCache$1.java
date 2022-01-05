package com.airbnb.epoxy.paging3;

import i0.b.a.t;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;

/* compiled from: PagingDataEpoxyController.kt */
public final class PagingDataEpoxyController$modelCache$1 extends Lambda implements p<Integer, T, t<?>> {
    public final /* synthetic */ PagingDataEpoxyController c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataEpoxyController$modelCache$1(PagingDataEpoxyController pagingDataEpoxyController) {
        super(2);
        this.c = pagingDataEpoxyController;
    }

    public Object invoke(Object obj, Object obj2) {
        return this.c.buildItemModel(((Number) obj).intValue(), obj2);
    }
}
