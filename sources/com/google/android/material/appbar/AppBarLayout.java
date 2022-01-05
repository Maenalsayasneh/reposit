package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import h0.i.i.d0;
import h0.i.i.g0.b;
import h0.i.i.h;
import h0.i.i.q;
import i0.h.a.c.b.c;
import i0.h.a.c.b.d;
import i0.h.a.c.b.e;
import i0.h.a.c.b.f;
import i0.h.a.c.b.g;
import i0.h.a.c.b.j;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int c = R.style.Widget_Design_AppBarLayout;
    public boolean Y1;
    public int Z1 = 0;
    public d0 a2;
    public boolean b2;
    public boolean c2;
    public int d;
    public boolean d2;
    public int e2;
    public WeakReference<View> f2;
    public ValueAnimator g2;
    public int[] h2;
    public Drawable i2;
    public int q = -1;
    public int x = -1;
    public int y = -1;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends g {
        public ScrollingViewBehavior() {
        }

        public AppBarLayout F(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).j) + this.e) - E(view2);
                AtomicInteger atomicInteger = q.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.d2) {
                return false;
            }
            appBarLayout.c(appBarLayout.d(view));
            return false;
        }

        public void h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                q.m(b.a.b.a(), coordinatorLayout);
                q.j(coordinatorLayout, 0);
                q.m(b.a.c.a(), coordinatorLayout);
                q.j(coordinatorLayout, 0);
            }
        }

        public boolean t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout F = F(coordinatorLayout.f(view));
            if (F != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    F.b(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            this.f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            int r6 = com.google.android.material.R.attr.appBarLayoutStyle
            int r7 = c
            android.content.Context r13 = i0.h.a.c.a0.a.a.a(r13, r14, r6, r7)
            r12.<init>(r13, r14, r6)
            r13 = -1
            r12.q = r13
            r12.x = r13
            r12.y = r13
            r8 = 0
            r12.Z1 = r8
            android.content.Context r9 = r12.getContext()
            r0 = 1
            r12.setOrientation(r0)
            int r10 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r12.setOutlineProvider(r0)
            android.content.Context r11 = r12.getContext()
            int[] r2 = i0.h.a.c.b.j.a
            int[] r5 = new int[r8]
            r0 = r11
            r1 = r14
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r0 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.hasValue(r8)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0045
            int r1 = r0.getResourceId(r8, r8)     // Catch:{ all -> 0x00f2 }
            android.animation.StateListAnimator r1 = android.animation.AnimatorInflater.loadStateListAnimator(r11, r1)     // Catch:{ all -> 0x00f2 }
            r12.setStateListAnimator(r1)     // Catch:{ all -> 0x00f2 }
        L_0x0045:
            r0.recycle()
            int[] r2 = com.google.android.material.R.styleable.AppBarLayout
            int[] r5 = new int[r8]
            r0 = r9
            r1 = r14
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r14 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = h0.i.i.q.a
            r12.setBackground(r0)
            android.graphics.drawable.Drawable r0 = r12.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x008c
            android.graphics.drawable.Drawable r0 = r12.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            i0.h.a.c.w.g r1 = new i0.h.a.c.w.g
            r1.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.t(r0)
            i0.h.a.c.w.g$b r0 = r1.q
            i0.h.a.c.n.a r2 = new i0.h.a.c.n.a
            r2.<init>(r9)
            r0.b = r2
            r1.B()
            r12.setBackground(r1)
        L_0x008c:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_expanded
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto L_0x009b
            boolean r0 = r14.getBoolean(r0, r8)
            r12.b(r0, r8, r8)
        L_0x009b:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_elevation
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto L_0x00ab
            int r0 = r14.getDimensionPixelSize(r0, r8)
            float r0 = (float) r0
            i0.h.a.c.b.j.a(r12, r0)
        L_0x00ab:
            r0 = 26
            if (r10 < r0) goto L_0x00cd
            int r0 = com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto L_0x00be
            boolean r0 = r14.getBoolean(r0, r8)
            r12.setKeyboardNavigationCluster(r0)
        L_0x00be:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto L_0x00cd
            boolean r0 = r14.getBoolean(r0, r8)
            r12.setTouchscreenBlocksFocus(r0)
        L_0x00cd:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_liftOnScroll
            boolean r0 = r14.getBoolean(r0, r8)
            r12.d2 = r0
            int r0 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r13 = r14.getResourceId(r0, r13)
            r12.e2 = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r13 = r14.getDrawable(r13)
            r12.setStatusBarForeground(r13)
            r14.recycle()
            i0.h.a.c.b.a r13 = new i0.h.a.c.b.a
            r13.<init>(r12)
            h0.i.i.q.c.c(r12, r13)
            return
        L_0x00f2:
            r13 = move-exception
            r0.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new a((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.Z1 = i3 | i;
        requestLayout();
    }

    public boolean c(boolean z) {
        if (this.c2 == z) {
            return false;
        }
        this.c2 = z;
        refreshDrawableState();
        if (this.d2 && (getBackground() instanceof i0.h.a.c.w.g)) {
            i0.h.a.c.w.g gVar = (i0.h.a.c.w.g) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.g2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
            this.g2 = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.g2.setInterpolator(i0.h.a.c.a.a.a);
            this.g2.addUpdateListener(new i0.h.a.c.b.b(this, gVar));
            this.g2.start();
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f2
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0031
            int r0 = r4.e2
            if (r0 == r2) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.e2
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f2 = r3
        L_0x0031:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f2
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.canScrollVertically(r2)
            if (r0 != 0) goto L_0x004e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L_0x0050
        L_0x004e:
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.d(android.view.View):boolean");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.i2 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.d));
            this.i2.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i2;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        AtomicInteger atomicInteger = q.a;
        if (!childAt.getFitsSystemWindows()) {
            return true;
        }
        return false;
    }

    public final void f() {
        setWillNotDraw(!(this.i2 != null && getTopInset() > 0));
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int i3 = this.x;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = aVar.a;
            if ((i5 & 5) == 5) {
                int i6 = aVar.topMargin + aVar.bottomMargin;
                if ((i5 & 8) != 0) {
                    AtomicInteger atomicInteger = q.a;
                    i = i6 + childAt.getMinimumHeight();
                } else if ((i5 & 2) != 0) {
                    AtomicInteger atomicInteger2 = q.a;
                    i = i6 + (measuredHeight - childAt.getMinimumHeight());
                } else {
                    i = i6 + measuredHeight;
                }
                if (childCount == 0) {
                    AtomicInteger atomicInteger3 = q.a;
                    if (childAt.getFitsSystemWindows()) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                }
                i4 += i;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.x = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.y;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = aVar.topMargin + aVar.bottomMargin + childAt.getMeasuredHeight();
            int i5 = aVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                AtomicInteger atomicInteger = q.a;
                i4 -= childAt.getMinimumHeight();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.y = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.e2;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        AtomicInteger atomicInteger = q.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.Z1;
    }

    public Drawable getStatusBarForeground() {
        return this.i2;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        d0 d0Var = this.a2;
        if (d0Var != null) {
            return d0Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.q;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = aVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            int i6 = measuredHeight + aVar.topMargin + aVar.bottomMargin + i4;
            if (i3 == 0) {
                AtomicInteger atomicInteger = q.a;
                if (childAt.getFitsSystemWindows()) {
                    i6 -= getTopInset();
                }
            }
            i4 = i6;
            if ((i5 & 2) != 0) {
                AtomicInteger atomicInteger2 = q.a;
                i4 -= childAt.getMinimumHeight();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.q = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i0.h.a.c.w.g) {
            i0.h.a.b.c.m.b.m0(this, (i0.h.a.c.w.g) background);
        }
    }

    public int[] onCreateDrawableState(int i) {
        if (this.h2 == null) {
            this.h2 = new int[4];
        }
        int[] iArr = this.h2;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.b2;
        int i3 = R.attr.state_liftable;
        if (!z) {
            i3 = -i3;
        }
        iArr[0] = i3;
        iArr[1] = (!z || !this.c2) ? -R.attr.state_lifted : R.attr.state_lifted;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -i4;
        }
        iArr[2] = i4;
        iArr[3] = (!z || !this.c2) ? -R.attr.state_collapsed : R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f2;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2 = null;
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        boolean z2;
        super.onLayout(z, i, i3, i4, i5);
        AtomicInteger atomicInteger = q.a;
        boolean z3 = true;
        if (getFitsSystemWindows() && e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.q = -1;
        this.x = -1;
        this.y = -1;
        this.Y1 = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((a) getChildAt(i6).getLayoutParams()).b != null) {
                this.Y1 = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.i2;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.d2) {
            int childCount3 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i8 = ((a) getChildAt(i7).getLayoutParams()).a;
                if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.b2 != z3) {
            this.b2 = z3;
            refreshDrawableState();
        }
    }

    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824) {
            AtomicInteger atomicInteger = q.a;
            if (getFitsSystemWindows() && e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = g0.a.b.b.a.o(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.q = -1;
        this.x = -1;
        this.y = -1;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        i0.h.a.b.c.m.b.l0(this, f);
    }

    public void setExpanded(boolean z) {
        AtomicInteger atomicInteger = q.a;
        b(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.d2 = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.e2 = i;
        WeakReference<View> weakReference = this.f2;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2 = null;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.i2;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.i2 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.i2.setState(getDrawableState());
                }
                Drawable drawable4 = this.i2;
                AtomicInteger atomicInteger = q.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.i2.setVisible(getVisibility() == 0, false);
                this.i2.setCallback(this);
            }
            f();
            AtomicInteger atomicInteger2 = q.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(h0.b.b.a.a.a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        j.a(this, f);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.i2;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i2;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends f<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public int m = -1;
        public boolean n;
        public float o;
        public WeakReference<View> p;

        public BaseBehavior() {
        }

        public static boolean J(int i, int i2) {
            return (i & i2) == i2;
        }

        public int E() {
            return B() + this.j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int H(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.E()
                r1 = 0
                if (r11 == 0) goto L_0x00ba
                if (r0 < r11) goto L_0x00ba
                if (r0 > r12) goto L_0x00ba
                int r3 = g0.a.b.b.a.o(r10, r11, r12)
                if (r0 == r3) goto L_0x00bc
                boolean r10 = r9.Y1
                if (r10 == 0) goto L_0x0086
                int r10 = java.lang.Math.abs(r3)
                int r11 = r9.getChildCount()
                r12 = r1
            L_0x0020:
                if (r12 >= r11) goto L_0x0086
                android.view.View r2 = r9.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.a) r4
                android.view.animation.Interpolator r5 = r4.b
                int r6 = r2.getTop()
                if (r10 < r6) goto L_0x0083
                int r6 = r2.getBottom()
                if (r10 > r6) goto L_0x0083
                if (r5 == 0) goto L_0x0086
                int r11 = r4.a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0058
                int r12 = r2.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r1 = r1 + r12
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0058
                java.util.concurrent.atomic.AtomicInteger r11 = h0.i.i.q.a
                int r11 = r2.getMinimumHeight()
                int r1 = r1 - r11
            L_0x0058:
                java.util.concurrent.atomic.AtomicInteger r11 = h0.i.i.q.a
                boolean r11 = r2.getFitsSystemWindows()
                if (r11 == 0) goto L_0x0065
                int r11 = r9.getTopInset()
                int r1 = r1 - r11
            L_0x0065:
                if (r1 <= 0) goto L_0x0086
                int r11 = r2.getTop()
                int r10 = r10 - r11
                float r11 = (float) r1
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r10 = r10 * r11
                int r10 = java.lang.Math.round(r10)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r2.getTop()
                int r12 = r12 + r10
                int r12 = r12 * r11
                goto L_0x0087
            L_0x0083:
                int r12 = r12 + 1
                goto L_0x0020
            L_0x0086:
                r12 = r3
            L_0x0087:
                boolean r10 = r7.D(r12)
                int r11 = r0 - r3
                int r12 = r3 - r12
                r7.j = r12
                if (r10 != 0) goto L_0x009a
                boolean r10 = r9.Y1
                if (r10 == 0) goto L_0x009a
                r8.c(r9)
            L_0x009a:
                int r10 = r7.B()
                r9.d = r10
                boolean r10 = r9.willNotDraw()
                if (r10 != 0) goto L_0x00ab
                java.util.concurrent.atomic.AtomicInteger r10 = h0.i.i.q.a
                r9.postInvalidateOnAnimation()
            L_0x00ab:
                if (r3 >= r0) goto L_0x00af
                r10 = -1
                goto L_0x00b0
            L_0x00af:
                r10 = 1
            L_0x00b0:
                r4 = r10
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r0.Q(r1, r2, r3, r4, r5)
                r1 = r11
                goto L_0x00bc
            L_0x00ba:
                r7.j = r1
            L_0x00bc:
                r7.P(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.H(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(E() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int E = E();
            if (E == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(i0.h.a.c.a.a.e);
                this.l.addUpdateListener(new c(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration((long) Math.min(i2, 600));
            this.l.setIntValues(new int[]{E, i});
            this.l.start();
        }

        public final View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof h) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    i2 = 0;
                }
                int i4 = i3;
                int i5 = i2;
                if (i4 != i5) {
                    iArr[1] = F(coordinatorLayout, appBarLayout, i, i4, i5);
                }
            }
            if (appBarLayout.d2) {
                appBarLayout.c(appBarLayout.d(view));
            }
        }

        public void M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                iArr[1] = F(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i == 0) {
                P(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean N(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L_0x002a
                boolean r6 = r4.d2
                if (r6 != 0) goto L_0x002b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L_0x0012
                r6 = r0
                goto L_0x0013
            L_0x0012:
                r6 = r1
            L_0x0013:
                if (r6 == 0) goto L_0x0026
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L_0x0026
                r3 = r0
                goto L_0x0027
            L_0x0026:
                r3 = r1
            L_0x0027:
                if (r3 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r0 = r1
            L_0x002b:
                if (r0 == 0) goto L_0x0034
                android.animation.ValueAnimator r3 = r2.l
                if (r3 == 0) goto L_0x0034
                r3.cancel()
            L_0x0034:
                r3 = 0
                r2.p = r3
                r2.k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.N(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        public final void O(CoordinatorLayout coordinatorLayout, T t) {
            int E = E();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                a aVar = (a) childAt.getLayoutParams();
                if (J(aVar.a, 32)) {
                    top -= aVar.topMargin;
                    bottom += aVar.bottomMargin;
                }
                int i2 = -E;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i3 = aVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if (J(i3, 2)) {
                        AtomicInteger atomicInteger = q.a;
                        i5 += childAt2.getMinimumHeight();
                    } else if (J(i3, 5)) {
                        AtomicInteger atomicInteger2 = q.a;
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (E < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (J(i3, 32)) {
                        i4 += aVar2.topMargin;
                        i5 -= aVar2.bottomMargin;
                    }
                    if (E < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    I(coordinatorLayout, t, g0.a.b.b.a.o(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void P(CoordinatorLayout coordinatorLayout, T t) {
            b.a aVar = b.a.b;
            q.m(aVar.a(), coordinatorLayout);
            q.j(coordinatorLayout, 0);
            b.a aVar2 = b.a.c;
            q.m(aVar2.a(), coordinatorLayout);
            q.j(coordinatorLayout, 0);
            View K = K(coordinatorLayout);
            if (K != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.f) K.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                if (E() != (-t.getTotalScrollRange()) && K.canScrollVertically(1)) {
                    q.n(coordinatorLayout, aVar, (CharSequence) null, new e(this, t, false));
                }
                if (E() == 0) {
                    return;
                }
                if (K.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        q.n(coordinatorLayout, aVar2, (CharSequence) null, new d(this, coordinatorLayout, t, K, i));
                        return;
                    }
                    return;
                }
                q.n(coordinatorLayout, aVar2, (CharSequence) null, new e(this, t, true));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void Q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x009f
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.a) r0
                int r0 = r0.a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005d
                java.util.concurrent.atomic.AtomicInteger r1 = h0.i.i.q.a
                int r1 = r4.getMinimumHeight()
                if (r10 <= 0) goto L_0x004a
                r10 = r0 & 12
                if (r10 == 0) goto L_0x004a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005d
                goto L_0x005b
            L_0x004a:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x005d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005d
            L_0x005b:
                r9 = r3
                goto L_0x005e
            L_0x005d:
                r9 = r2
            L_0x005e:
                boolean r10 = r8.d2
                if (r10 == 0) goto L_0x006a
                android.view.View r9 = r6.K(r7)
                boolean r9 = r8.d(r9)
            L_0x006a:
                boolean r9 = r8.c(r9)
                if (r11 != 0) goto L_0x009c
                if (r9 == 0) goto L_0x009f
                java.util.List r7 = r7.g(r8)
                int r9 = r7.size()
                r10 = r2
            L_0x007b:
                if (r10 >= r9) goto L_0x009a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x0097
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f
                if (r7 == 0) goto L_0x009a
                r2 = r3
                goto L_0x009a
            L_0x0097:
                int r10 = r10 + 1
                goto L_0x007b
            L_0x009a:
                if (r2 == 0) goto L_0x009f
            L_0x009c:
                r8.jumpDrawablesToCurrentState()
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.Q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.k(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i3 = this.m;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.n) {
                    AtomicInteger atomicInteger = q.a;
                    i2 = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.o) + i4;
                }
                G(coordinatorLayout, appBarLayout, i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        I(coordinatorLayout, appBarLayout, i5, 0.0f);
                    } else {
                        G(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        I(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        G(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.Z1 = 0;
            this.m = -1;
            D(g0.a.b.b.a.o(B(), -appBarLayout.getTotalScrollRange(), 0));
            Q(coordinatorLayout, appBarLayout, B(), 0, true);
            appBarLayout.d = B();
            if (!appBarLayout.willNotDraw()) {
                AtomicInteger atomicInteger2 = q.a;
                appBarLayout.postInvalidateOnAnimation();
            }
            P(coordinatorLayout, appBarLayout);
            return true;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.t(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            M(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                this.m = savedState.q;
                this.o = savedState.x;
                this.n = savedState.y;
                return;
            }
            this.m = -1;
        }

        public Parcelable v(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int B = B();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + B;
                if (childAt.getTop() + B > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.q = i;
                    AtomicInteger atomicInteger = q.a;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z = true;
                    }
                    savedState.y = z;
                    savedState.x = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return absSavedState;
        }

        public /* bridge */ /* synthetic */ boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return N(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                O(coordinatorLayout, appBarLayout);
                if (appBarLayout.d2) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.p = new WeakReference<>(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int q;
            public float x;
            public boolean y;

            public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                public Object[] newArray(int i) {
                    return new SavedState[i];
                }

                public Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, (ClassLoader) null);
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.q = parcel.readInt();
                this.x = parcel.readFloat();
                this.y = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.d, i);
                parcel.writeInt(this.q);
                parcel.writeFloat(this.x);
                parcel.writeByte(this.y ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m15generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m16generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public static class a extends LinearLayout.LayoutParams {
        public int a = 1;
        public Interpolator b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
