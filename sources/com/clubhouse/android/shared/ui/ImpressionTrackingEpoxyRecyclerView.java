package com.clubhouse.android.shared.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.epoxy.EpoxyRecyclerView;
import i0.b.a.y;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/clubhouse/android/shared/ui/ImpressionTrackingEpoxyRecyclerView;", "Lcom/airbnb/epoxy/EpoxyRecyclerView;", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: ImpressionTrackingEpoxyRecyclerView.kt */
public final class ImpressionTrackingEpoxyRecyclerView extends EpoxyRecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImpressionTrackingEpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        y yVar = new y();
        yVar.m = 50;
        yVar.a(this);
    }
}
