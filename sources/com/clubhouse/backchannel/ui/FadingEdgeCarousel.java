package com.clubhouse.backchannel.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.epoxy.Carousel;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/clubhouse/backchannel/ui/FadingEdgeCarousel;", "Lcom/airbnb/epoxy/Carousel;", "", "isPaddingOffsetRequired", "()Z", "", "getLeftPaddingOffset", "()I", "getRightPaddingOffset", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: FadingEdgeCarousel.kt */
public final class FadingEdgeCarousel extends Carousel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FadingEdgeCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        setHorizontalFadingEdgeEnabled(true);
    }

    public int getLeftPaddingOffset() {
        return -getPaddingLeft();
    }

    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    public boolean isPaddingOffsetRequired() {
        return true;
    }
}
