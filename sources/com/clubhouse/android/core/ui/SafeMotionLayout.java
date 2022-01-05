package com.clubhouse.android.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/clubhouse/android/core/ui/SafeMotionLayout;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "Lm0/i;", "onMeasure", "(II)V", "y", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: SafeMotionLayout.kt */
public final class SafeMotionLayout extends MotionLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeMotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable unused) {
        }
    }

    public void y() {
        try {
            super.y();
        } catch (Throwable unused) {
        }
    }
}
