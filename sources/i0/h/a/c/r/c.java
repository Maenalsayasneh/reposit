package i0.h.a.c.r;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R;
import i0.h.a.b.c.m.b;
import i0.h.a.c.q.j;

/* compiled from: BaseProgressIndicatorSpec */
public abstract class c {
    public int a;
    public int b;
    public int[] c = new int[0];
    public int d;
    public int e;
    public int f;

    public c(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = R.styleable.BaseProgressIndicator;
        j.a(context, attributeSet, i, i2);
        j.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = b.O(context, obtainStyledAttributes, R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.b = Math.min(b.O(context, obtainStyledAttributes, R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.a / 2);
        this.e = obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f = obtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        int i3 = R.styleable.BaseProgressIndicator_indicatorColor;
        if (!obtainStyledAttributes.hasValue(i3)) {
            this.c = new int[]{b.K(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(i3).type != 1) {
            this.c = new int[]{obtainStyledAttributes.getColor(i3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(i3, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        int i4 = R.styleable.BaseProgressIndicator_trackColor;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.d = obtainStyledAttributes.getColor(i4, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f2 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.d = b.v(this.d, (int) (f2 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public abstract void a();
}
