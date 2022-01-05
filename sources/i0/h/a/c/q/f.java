package i0.h.a.c.q;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import com.google.android.material.R;
import h0.b.f.f0;

/* compiled from: ForegroundLinearLayout */
public class f extends f0 {
    public Drawable i2;
    public final Rect j2;
    public final Rect k2;
    public int l2;
    public boolean m2;
    public boolean n2;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.i2;
        if (drawable != null) {
            if (this.n2) {
                this.n2 = false;
                Rect rect = this.j2;
                Rect rect2 = this.k2;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.m2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.l2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.i2;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.i2;
        if (drawable != null && drawable.isStateful()) {
            this.i2.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.i2;
    }

    public int getForegroundGravity() {
        return this.l2;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i2;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        super.onLayout(z, i, i3, i4, i5);
        this.n2 = z | this.n2;
    }

    public void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        this.n2 = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.i2;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.i2);
            }
            this.i2 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.l2 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.l2 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.l2 = i;
            if (i == 119 && this.i2 != null) {
                this.i2.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i2;
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j2 = new Rect();
        this.k2 = new Rect();
        this.l2 = 119;
        this.m2 = true;
        this.n2 = false;
        int[] iArr = R.styleable.ForegroundLinearLayout;
        j.a(context, attributeSet, i, 0);
        j.b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.l2 = obtainStyledAttributes.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.l2);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.m2 = obtainStyledAttributes.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }
}
