package com.airbnb.epoxy.stickyheader;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
public final class StickyHeaderLinearLayoutManager$onFocusSearchFailed$1 extends Lambda implements a<View> {
    public final /* synthetic */ StickyHeaderLinearLayoutManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int q;
    public final /* synthetic */ RecyclerView.u x;
    public final /* synthetic */ RecyclerView.y y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$onFocusSearchFailed$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        super(0);
        this.c = stickyHeaderLinearLayoutManager;
        this.d = view;
        this.q = i;
        this.x = uVar;
        this.y = yVar;
    }

    public Object invoke() {
        return StickyHeaderLinearLayoutManager$onFocusSearchFailed$1.super.onFocusSearchFailed(this.d, this.q, this.x, this.y);
    }
}
