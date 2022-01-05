package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "isSwipingAllowed", "Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowViewPager.kt */
public final class PaymentFlowViewPager extends ViewPager {
    private final boolean isSwipingAllowed;

    public PaymentFlowViewPager(Context context) {
        this(context, (AttributeSet) null, false, 6, (f) null);
    }

    public PaymentFlowViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentFlowViewPager(Context context, AttributeSet attributeSet, boolean z, int i, f fVar) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? false : z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.isSwipingAllowed) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.isSwipingAllowed) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowViewPager(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        i.e(context, "context");
        this.isSwipingAllowed = z;
    }
}
