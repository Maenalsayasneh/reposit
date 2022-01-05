package com.instabug.library.ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class InstabugScrollView extends ScrollView {
    public OnScrollListener onScrollListener;

    public interface OnScrollListener {
        void onBottomReached();

        void onScrolling();

        void onTopReached();
    }

    public InstabugScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        OnScrollListener onScrollListener2;
        OnScrollListener onScrollListener3;
        OnScrollListener onScrollListener4;
        int bottom = getChildAt(getChildCount() - 1).getBottom() - (getScrollY() + getHeight());
        if (bottom == 0 && (onScrollListener4 = this.onScrollListener) != null) {
            onScrollListener4.onBottomReached();
        } else if (getScrollY() == 0 && (onScrollListener3 = this.onScrollListener) != null) {
            onScrollListener3.onTopReached();
        } else if (bottom > 0 && (onScrollListener2 = this.onScrollListener) != null) {
            onScrollListener2.onScrolling();
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    public void setOnScrollListener(OnScrollListener onScrollListener2) {
        this.onScrollListener = onScrollListener2;
    }

    public InstabugScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstabugScrollView(Context context) {
        super(context);
    }
}
