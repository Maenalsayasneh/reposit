package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import h0.b.f.b;
import h0.b.f.p0;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionBarContainer extends FrameLayout {
    public Drawable Y1;
    public Drawable Z1;
    public boolean a2;
    public boolean b2;
    public boolean c;
    public int c2;
    public View d;
    public View q;
    public View x;
    public Drawable y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        AtomicInteger atomicInteger = q.a;
        setBackground(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.y = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.Y1 = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.c2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == R.id.split_action_bar) {
            this.a2 = true;
            this.Z1 = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.a2 ? !(this.y == null && this.Y1 == null) : this.Z1 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful()) {
            this.y.setState(getDrawableState());
        }
        Drawable drawable2 = this.Y1;
        if (drawable2 != null && drawable2.isStateful()) {
            this.Y1.setState(getDrawableState());
        }
        Drawable drawable3 = this.Z1;
        if (drawable3 != null && drawable3.isStateful()) {
            this.Z1.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.d;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.Y1;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.Z1;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.q = findViewById(R.id.action_bar);
        this.x = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.d
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.a2
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.Z1
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.y
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.q
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.y
            android.view.View r7 = r4.q
            int r7 = r7.getLeft()
            android.view.View r8 = r4.q
            int r8 = r8.getTop()
            android.view.View r0 = r4.q
            int r0 = r0.getRight()
            android.view.View r2 = r4.q
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.x
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.y
            android.view.View r7 = r4.x
            int r7 = r7.getLeft()
            android.view.View r8 = r4.x
            int r8 = r8.getTop()
            android.view.View r0 = r4.x
            int r0 = r0.getRight()
            android.view.View r2 = r4.x
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.y
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.b2 = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.Y1
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.q == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.c2) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.q != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.d;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.q)) {
                    i3 = a(this.q);
                } else {
                    i3 = !b(this.x) ? a(this.x) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.d) + i3, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.y);
        }
        this.y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.q;
            if (view != null) {
                this.y.setBounds(view.getLeft(), this.q.getTop(), this.q.getRight(), this.q.getBottom());
            }
        }
        boolean z = true;
        if (!this.a2 ? !(this.y == null && this.Y1 == null) : this.Z1 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.Z1;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.Z1);
        }
        this.Z1 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.a2 && (drawable2 = this.Z1) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.a2 ? this.y == null && this.Y1 == null : this.Z1 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.Y1;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.Y1);
        }
        this.Y1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.b2 && (drawable2 = this.Y1) != null) {
                drawable2.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
            }
        }
        boolean z = true;
        if (!this.a2 ? !(this.y == null && this.Y1 == null) : this.Z1 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.d;
        if (view != null) {
            removeView(view);
        }
        this.d = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.c = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.Y1;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.Z1;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.y && !this.a2) || (drawable == this.Y1 && this.b2) || ((drawable == this.Z1 && this.a2) || super.verifyDrawable(drawable));
    }
}
