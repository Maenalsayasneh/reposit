package com.airbnb.epoxy.stickyheader;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
public final class StickyHeaderLinearLayoutManager$onLayoutChildren$1 extends Lambda implements a<i> {
    public final /* synthetic */ StickyHeaderLinearLayoutManager c;
    public final /* synthetic */ RecyclerView.u d;
    public final /* synthetic */ RecyclerView.y q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$onLayoutChildren$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, RecyclerView.u uVar, RecyclerView.y yVar) {
        super(0);
        this.c = stickyHeaderLinearLayoutManager;
        this.d = uVar;
        this.q = yVar;
    }

    public Object invoke() {
        StickyHeaderLinearLayoutManager$onLayoutChildren$1.super.onLayoutChildren(this.d, this.q);
        return i.a;
    }
}
