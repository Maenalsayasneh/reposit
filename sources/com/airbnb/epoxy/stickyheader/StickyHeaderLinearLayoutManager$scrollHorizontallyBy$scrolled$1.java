package com.airbnb.epoxy.stickyheader;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
public final class StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1 extends Lambda implements a<Integer> {
    public final /* synthetic */ StickyHeaderLinearLayoutManager c;
    public final /* synthetic */ int d;
    public final /* synthetic */ RecyclerView.u q;
    public final /* synthetic */ RecyclerView.y x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        super(0);
        this.c = stickyHeaderLinearLayoutManager;
        this.d = i;
        this.q = uVar;
        this.x = yVar;
    }

    public Object invoke() {
        return Integer.valueOf(StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1.super.scrollHorizontallyBy(this.d, this.q, this.x));
    }
}
