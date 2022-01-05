package com.instabug.library.view.viewgroup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.instabug.library.R;
import com.instabug.library.util.ScreenUtility;
import i0.j.e.e1.a.a;
import i0.j.e.e1.a.b;
import i0.j.e.e1.a.c;

public class IBPercentageRelativeLayout extends RelativeLayout implements b {
    private final float maxHeightRatio;
    private final a presenter;

    public IBPercentageRelativeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public float getMaxHeightRatio() {
        return this.maxHeightRatio;
    }

    public float getScreenHeight() {
        if (!ScreenUtility.hasNavBar(getContext())) {
            return (float) Resources.getSystem().getDisplayMetrics().heightPixels;
        }
        return (float) (Resources.getSystem().getDisplayMetrics().heightPixels - ScreenUtility.getNavigationBarHeight(getResources()));
    }

    public void onMeasure(int i, int i2) {
        c cVar = (c) this.presenter;
        float screenHeight = (cVar.a.getScreenHeight() * ((float) ((int) cVar.a.getMaxHeightRatio()))) / 100.0f;
        int size = View.MeasureSpec.getSize(i2);
        if (screenHeight > 0.0f && screenHeight < ((float) size)) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) screenHeight, View.MeasureSpec.getMode(i2));
        }
        int[] iArr = {i, i2};
        super.onMeasure(iArr[0], iArr[1]);
    }

    public IBPercentageRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public IBPercentageRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.IBPercentageRelativeLayout);
            this.maxHeightRatio = obtainStyledAttributes.getFloat(R.styleable.IBPercentageRelativeLayout_maxHeightRatio, 100.0f);
            obtainStyledAttributes.recycle();
        } else {
            this.maxHeightRatio = 100.0f;
        }
        this.presenter = new c(this);
    }
}
