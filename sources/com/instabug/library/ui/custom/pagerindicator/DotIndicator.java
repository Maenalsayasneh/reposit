package com.instabug.library.ui.custom.pagerindicator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.instabug.library.R;
import com.instabug.library.view.ViewUtils;
import java.util.ArrayList;

public final class DotIndicator extends RelativeLayout implements SelectionIndicator {
    private static final int DEFAULT_DOT_TRANSITION_DURATION_MS = 200;
    private static final int DEFAULT_NUMBER_OF_DOTS = 1;
    private static final int DEFAULT_SELECTED_DOT_COLOR = -1;
    private static final int DEFAULT_SELECTED_DOT_DIAMETER_DP = 9;
    private static final int DEFAULT_SELECTED_DOT_INDEX = 0;
    private static final int DEFAULT_SPACING_BETWEEN_DOTS_DP = 7;
    private static final int DEFAULT_UNSELECTED_DOT_COLOR = -1;
    private static final int DEFAULT_UNSELECTED_DOT_DIAMETER_DP = 6;
    private static final String TAG = "[DotIndicator]";
    private int dotTransitionDuration;
    private final ArrayList<Dot> dots;
    private int numberOfDots;
    private int selectedDotColor;
    private int selectedDotDiameterPx;
    private int selectedDotIndex;
    private int spacingBetweenDotsPx;
    private int unselectedDotColor;
    private int unselectedDotDiameterPx;

    public DotIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE", "CustomViewStyleable"})
    private void init(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.IBDotIndicator, i, 0);
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 9.0f);
        int convertDpToPx2 = ViewUtils.convertDpToPx(getContext(), 6.0f);
        int convertDpToPx3 = ViewUtils.convertDpToPx(getContext(), 7.0f);
        this.numberOfDots = obtainStyledAttributes.getInt(R.styleable.IBDotIndicator_ibViewPagerNumberOfDots, 1);
        this.selectedDotIndex = obtainStyledAttributes.getInt(R.styleable.IBDotIndicator_ibViewPagerSelectedDotIndex, 0);
        this.unselectedDotDiameterPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.IBDotIndicator_ibViewPagerUnselectedDotDiameter, convertDpToPx2);
        this.selectedDotDiameterPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.IBDotIndicator_ibViewPagerSelectedDotDiameter, convertDpToPx);
        this.unselectedDotColor = obtainStyledAttributes.getColor(R.styleable.IBDotIndicator_ibViewPagerUnselectedDotColor, -1);
        this.selectedDotColor = obtainStyledAttributes.getColor(R.styleable.IBDotIndicator_ibViewPagerSelectedDotColor, -1);
        this.spacingBetweenDotsPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.IBDotIndicator_ibViewPagerSpacingBetweenDots, convertDpToPx3);
        this.dotTransitionDuration = obtainStyledAttributes.getDimensionPixelSize(R.styleable.IBDot_ibViewPagerTransitionDuration, 200);
        obtainStyledAttributes.recycle();
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        setGravity(17);
        reflectParametersInView();
    }

    private void reflectParametersInView() {
        removeAllViews();
        this.dots.clear();
        for (int i = 0; i < this.numberOfDots; i++) {
            Dot dot = new Dot(getContext());
            dot.setInactiveDiameterPx(this.unselectedDotDiameterPx).setActiveDiameterPx(this.selectedDotDiameterPx).setActiveColor(this.selectedDotColor).setInactiveColor(this.unselectedDotColor).setTransitionDuration(this.dotTransitionDuration);
            if (i == this.selectedDotIndex) {
                dot.setActive(false);
            } else {
                dot.setInactive(false);
            }
            int max = Math.max(this.selectedDotDiameterPx, this.unselectedDotDiameterPx);
            int i2 = (this.spacingBetweenDotsPx + this.unselectedDotDiameterPx) * i;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(max, max);
            layoutParams.setMargins(i2, 0, 0, 0);
            layoutParams.setMarginStart(i2);
            dot.setLayoutParams(layoutParams);
            addView(dot);
            this.dots.add(i, dot);
        }
    }

    public int getNumberOfItems() {
        return this.numberOfDots;
    }

    public int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    public int getSelectedDotDiameter() {
        return this.selectedDotDiameterPx;
    }

    public int getSelectedItemIndex() {
        return this.selectedDotIndex;
    }

    public int getSpacingBetweenDots() {
        return this.spacingBetweenDotsPx;
    }

    public int getTransitionDuration() {
        return this.dotTransitionDuration;
    }

    public int getUnselectedDotColor() {
        return this.unselectedDotColor;
    }

    public int getUnselectedDotDiameter() {
        return this.unselectedDotDiameterPx;
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void redrawDots() {
        reflectParametersInView();
    }

    public void setNumberOfItems(int i) {
        this.numberOfDots = i;
        reflectParametersInView();
    }

    public void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
        reflectParametersInView();
    }

    public void setSelectedDotDiameterDp(int i) {
        setSelectedDotDiameterPx(ViewUtils.convertDpToPx(getContext(), (float) i));
    }

    public void setSelectedDotDiameterPx(int i) {
        this.selectedDotDiameterPx = i;
        reflectParametersInView();
    }

    public void setSelectedItem(int i, boolean z) {
        if (this.dots.size() > 0) {
            try {
                if (this.selectedDotIndex < this.dots.size()) {
                    this.dots.get(this.selectedDotIndex).setInactive(z);
                }
                this.dots.get(i).setActive(z);
                this.selectedDotIndex = i;
            } catch (IndexOutOfBoundsException unused) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public void setSpacingBetweenDotsDp(int i) {
        setSpacingBetweenDotsPx(ViewUtils.convertDpToPx(getContext(), (float) i));
    }

    public void setSpacingBetweenDotsPx(int i) {
        this.spacingBetweenDotsPx = i;
        reflectParametersInView();
    }

    public void setTransitionDuration(int i) {
        this.dotTransitionDuration = i;
        reflectParametersInView();
    }

    public void setUnselectedDotColor(int i) {
        this.unselectedDotColor = i;
        reflectParametersInView();
    }

    public void setUnselectedDotDiameterDp(int i) {
        setUnselectedDotDiameterPx(ViewUtils.convertDpToPx(getContext(), (float) i));
    }

    public void setUnselectedDotDiameterPx(int i) {
        this.unselectedDotDiameterPx = i;
        reflectParametersInView();
    }

    public void setVisibility(boolean z) {
        setVisibility(z ? 0 : 4);
    }

    public DotIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public DotIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dots = new ArrayList<>();
        init(attributeSet, i);
    }
}
