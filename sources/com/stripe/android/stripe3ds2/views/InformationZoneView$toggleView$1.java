package com.stripe.android.stripe3ds2.views;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/i;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: InformationZoneView.kt */
public final class InformationZoneView$toggleView$1 implements Runnable {
    public final /* synthetic */ View $detailsView;

    public InformationZoneView$toggleView$1(View view) {
        this.$detailsView = view;
    }

    public final void run() {
        Rect rect = new Rect(0, 0, this.$detailsView.getWidth(), this.$detailsView.getHeight());
        this.$detailsView.getHitRect(rect);
        this.$detailsView.requestRectangleOnScreen(rect, false);
    }
}
