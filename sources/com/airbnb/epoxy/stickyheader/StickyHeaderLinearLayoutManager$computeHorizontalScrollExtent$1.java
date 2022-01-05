package com.airbnb.epoxy.stickyheader;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
public final class StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1 extends Lambda implements a<Integer> {
    public final /* synthetic */ StickyHeaderLinearLayoutManager c;
    public final /* synthetic */ RecyclerView.y d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.y yVar) {
        super(0);
        this.c = stickyHeaderLinearLayoutManager;
        this.d = yVar;
    }

    public Object invoke() {
        return Integer.valueOf(StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1.super.computeHorizontalScrollExtent(this.d));
    }
}
