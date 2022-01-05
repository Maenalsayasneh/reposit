package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
public final class StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1 extends Lambda implements a<PointF> {
    public final /* synthetic */ StickyHeaderLinearLayoutManager c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i) {
        super(0);
        this.c = stickyHeaderLinearLayoutManager;
        this.d = i;
    }

    public Object invoke() {
        return StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1.super.computeScrollVectorForPosition(this.d);
    }
}
