package com.instabug.library.ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public class InstabugViewPager extends ViewPager {
    private boolean autoHeight = false;
    private boolean swipeable = true;

    public InstabugViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.swipeable) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void onMeasure(int i, int i2) {
        if (this.autoHeight) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            if (i3 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.swipeable) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void scrollBackward(boolean z) {
        scrollBackwardWithOffset(z, 1);
    }

    public void scrollBackwardWithOffset(boolean z, int i) {
        if (getAdapter() != null && getCurrentItem() > 0) {
            setCurrentItem(getCurrentItem() - i, z);
        }
    }

    public void scrollForward(boolean z) {
        if (getAdapter() != null && getAdapter().getCount() - 1 > getCurrentItem()) {
            setCurrentItem(getCurrentItem() + 1, z);
        }
    }

    public void setAutoHeight(boolean z) {
        this.autoHeight = z;
    }

    public void setSwipeable(boolean z) {
        this.swipeable = z;
    }
}
