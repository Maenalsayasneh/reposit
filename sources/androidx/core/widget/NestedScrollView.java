package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import h0.i.i.g0.b;
import h0.i.i.h;
import h0.i.i.i;
import h0.i.i.k;
import h0.i.i.l;
import h0.i.i.q;
import h0.v.a.k;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class NestedScrollView extends FrameLayout implements k, h {
    public static final a c = new a();
    public static final int[] d = {16843130};
    public EdgeEffect Y1;
    public EdgeEffect Z1;
    public int a2;
    public boolean b2 = true;
    public boolean c2 = false;
    public View d2 = null;
    public boolean e2 = false;
    public VelocityTracker f2;
    public boolean g2;
    public boolean h2 = true;
    public int i2;
    public int j2;
    public int k2;
    public int l2 = -1;
    public final int[] m2 = new int[2];
    public final int[] n2 = new int[2];
    public int o2;
    public int p2;
    public long q;
    public SavedState q2;
    public final l r2;
    public final i s2;
    public float t2;
    public b u2;
    public final Rect x = new Rect();
    public OverScroller y = new OverScroller(getContext());

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;

        public class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("HorizontalScrollView.SavedState{");
            P0.append(Integer.toHexString(System.identityHashCode(this)));
            P0.append(" scrollPosition=");
            return i0.d.a.a.a.u0(P0, this.c, "}");
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.c = parcel.readInt();
        }
    }

    public static class a extends h0.i.i.a {
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public void onInitializeAccessibilityNodeInfo(View view, h0.i.i.g0.b bVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.b.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.b.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.a(b.a.c);
                    bVar.a(b.a.g);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.a(b.a.b);
                    bVar.a(b.a.h);
                }
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.B(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), k.d.DEFAULT_SWIPE_ANIMATION_DURATION, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), k.d.DEFAULT_SWIPE_ANIMATION_DURATION, true);
            return true;
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NestedScrollView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = androidx.core.R.attr.nestedScrollViewStyle
            r5.<init>(r6, r7, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.x = r1
            r1 = 1
            r5.b2 = r1
            r2 = 0
            r5.c2 = r2
            r3 = 0
            r5.d2 = r3
            r5.e2 = r2
            r5.h2 = r1
            r3 = -1
            r5.l2 = r3
            r3 = 2
            int[] r4 = new int[r3]
            r5.m2 = r4
            int[] r3 = new int[r3]
            r5.n2 = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4)
            r5.y = r3
            r5.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r3)
            r5.setWillNotDraw(r2)
            android.content.Context r3 = r5.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r5.i2 = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r5.j2 = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r5.k2 = r3
            int[] r3 = d
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r3, r0, r2)
            boolean r7 = r6.getBoolean(r2, r2)
            r5.setFillViewport(r7)
            r6.recycle()
            h0.i.i.l r6 = new h0.i.i.l
            r6.<init>()
            r5.r2 = r6
            h0.i.i.i r6 = new h0.i.i.i
            r6.<init>(r5)
            r5.s2 = r6
            r5.setNestedScrollingEnabled(r1)
            androidx.core.widget.NestedScrollView$a r6 = c
            h0.i.i.q.p(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static int c(int i, int i3, int i4) {
        if (i3 >= i4 || i < 0) {
            return 0;
        }
        return i3 + i > i4 ? i4 - i3 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.t2 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.t2 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.t2;
    }

    public static boolean s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !s((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public final void A(View view) {
        view.getDrawingRect(this.x);
        offsetDescendantRectToMyCoords(view, this.x);
        int d3 = d(this.x);
        if (d3 != 0) {
            scrollBy(0, d3);
        }
    }

    public final void B(int i, int i3, int i4, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.q > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.y;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                y(z);
            } else {
                if (!this.y.isFinished()) {
                    a();
                }
                scrollBy(i, i3);
            }
            this.q = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public boolean C(int i, int i3) {
        return this.s2.h(i, i3);
    }

    public void D(int i) {
        this.s2.i(i);
    }

    public final void a() {
        this.y.abortAnimation();
        this.s2.i(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !t(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.x);
            offsetDescendantRectToMyCoords(findNextFocus, this.x);
            g(d(this.x));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!t(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.y.isFinished()) {
            this.y.computeScrollOffset();
            int currY = this.y.getCurrY();
            int i = currY - this.p2;
            this.p2 = currY;
            int[] iArr = this.n2;
            boolean z = false;
            iArr[1] = 0;
            f(0, i, iArr, (int[]) null, 1);
            int i3 = i - this.n2[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                w(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.n2;
                iArr2[1] = 0;
                this.s2.e(0, scrollY2, 0, i4, this.m2, 1, iArr2);
                i3 = i4 - this.n2[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    i();
                    if (i3 < 0) {
                        if (this.Y1.isFinished()) {
                            this.Y1.onAbsorb((int) this.y.getCurrVelocity());
                        }
                    } else if (this.Z1.isFinished()) {
                        this.Z1.onAbsorb((int) this.y.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.y.isFinished()) {
                AtomicInteger atomicInteger = q.a;
                postInvalidateOnAnimation();
                return;
            }
            this.s2.i(1);
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public int d(Rect rect) {
        int i;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i5;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i5 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f3, boolean z) {
        return this.s2.a(f, f3, z);
    }

    public boolean dispatchNestedPreFling(float f, float f3) {
        return this.s2.b(f, f3);
    }

    public boolean dispatchNestedPreScroll(int i, int i3, int[] iArr, int[] iArr2) {
        return f(i, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i3, int i4, int i5, int[] iArr) {
        return this.s2.d(i, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.Y1 != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.Y1.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.Y1.setSize(width, height);
                if (this.Y1.draw(canvas)) {
                    AtomicInteger atomicInteger = q.a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (!this.Z1.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i3 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.Z1.setSize(width2, height2);
                if (this.Z1.draw(canvas)) {
                    AtomicInteger atomicInteger2 = q.a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public void e(View view, int i, int i3, int i4, int i5, int i6, int[] iArr) {
        u(i5, i6, iArr);
    }

    public boolean f(int i, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.s2.c(i, i3, iArr, iArr2, i4);
    }

    public final void g(int i) {
        if (i == 0) {
            return;
        }
        if (this.h2) {
            B(0, i, k.d.DEFAULT_SWIPE_ANIMATION_DURATION, false);
        } else {
            scrollBy(0, i);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.r2.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final void h() {
        this.e2 = false;
        x();
        this.s2.i(0);
        EdgeEffect edgeEffect = this.Y1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.Z1.onRelease();
        }
    }

    public boolean hasNestedScrollingParent() {
        return r(0);
    }

    public final void i() {
        if (getOverScrollMode() == 2) {
            this.Y1 = null;
            this.Z1 = null;
        } else if (this.Y1 == null) {
            Context context = getContext();
            this.Y1 = new EdgeEffect(context);
            this.Z1 = new EdgeEffect(context);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.s2.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.x
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fb
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ec
            r4 = 20
            if (r0 == r4) goto L_0x00dc
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fb
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r5 = r3
        L_0x0084:
            if (r5 != r3) goto L_0x0088
            r7 = r1
            goto L_0x0089
        L_0x0088:
            r7 = r2
        L_0x0089:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00c0
            android.graphics.Rect r7 = r6.x
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d1
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.x
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d1
            int r1 = r1 - r0
            r7.top = r1
            goto L_0x00d1
        L_0x00c0:
            android.graphics.Rect r7 = r6.x
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.x
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d1
            r7.top = r2
        L_0x00d1:
            android.graphics.Rect r7 = r6.x
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.z(r5, r1, r0)
            goto L_0x00fb
        L_0x00dc:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e7
            boolean r2 = r6.b(r3)
            goto L_0x00fb
        L_0x00e7:
            boolean r2 = r6.q(r3)
            goto L_0x00fb
        L_0x00ec:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f7
            boolean r2 = r6.b(r5)
            goto L_0x00fb
        L_0x00f7:
            boolean r2 = r6.q(r5)
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.j(android.view.KeyEvent):boolean");
    }

    public void k(View view, int i, int i3, int i4, int i5, int i6) {
        u(i5, i6, (int[]) null);
    }

    public boolean l(View view, View view2, int i, int i3) {
        return (i & 2) != 0;
    }

    public void m(View view, View view2, int i, int i3) {
        l lVar = this.r2;
        if (i3 == 1) {
            lVar.b = i;
        } else {
            lVar.a = i;
        }
        C(2, i3);
    }

    public void measureChild(View view, int i, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i) {
        l lVar = this.r2;
        if (i == 1) {
            lVar.b = 0;
        } else {
            lVar.a = 0;
        }
        D(i);
    }

    public void o(View view, int i, int i3, int[] iArr, int i4) {
        f(i, i3, iArr, (int[]) null, i4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c2 = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.e2) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r11.e2
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00ae
            r4 = -1
            if (r0 == r2) goto L_0x0085
            if (r0 == r1) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0117
        L_0x001f:
            r11.v(r12)
            goto L_0x0117
        L_0x0024:
            int r0 = r11.l2
            if (r0 != r4) goto L_0x002a
            goto L_0x0117
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0117
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.a2
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.i2
            if (r4 <= r5) goto L_0x0117
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto L_0x0117
            r11.e2 = r2
            r11.a2 = r0
            android.view.VelocityTracker r0 = r11.f2
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f2 = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.f2
            r0.addMovement(r12)
            r11.o2 = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0117
            r12.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0117
        L_0x0085:
            r11.e2 = r3
            r11.l2 = r4
            r11.x()
            android.widget.OverScroller r4 = r11.y
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a8
            java.util.concurrent.atomic.AtomicInteger r12 = h0.i.i.q.a
            r11.postInvalidateOnAnimation()
        L_0x00a8:
            h0.i.i.i r12 = r11.s2
            r12.i(r3)
            goto L_0x0117
        L_0x00ae:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e2
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e2
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e2
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e2
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e2
            r4 = r2
            goto L_0x00e3
        L_0x00e2:
            r4 = r3
        L_0x00e3:
            if (r4 != 0) goto L_0x00eb
            r11.e2 = r3
            r11.x()
            goto L_0x0117
        L_0x00eb:
            r11.a2 = r0
            int r0 = r12.getPointerId(r3)
            r11.l2 = r0
            android.view.VelocityTracker r0 = r11.f2
            if (r0 != 0) goto L_0x00fe
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f2 = r0
            goto L_0x0101
        L_0x00fe:
            r0.clear()
        L_0x0101:
            android.view.VelocityTracker r0 = r11.f2
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.y
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.y
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.e2 = r12
            r11.C(r1, r3)
        L_0x0117:
            boolean r12 = r11.e2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        super.onLayout(z, i, i3, i4, i5);
        int i6 = 0;
        this.b2 = false;
        View view = this.d2;
        if (view != null && s(view, this)) {
            A(this.d2);
        }
        this.d2 = null;
        if (!this.c2) {
            if (this.q2 != null) {
                scrollTo(getScrollX(), this.q2.c);
                this.q2 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c3 = c(scrollY, paddingTop, i6);
            if (c3 != scrollY) {
                scrollTo(getScrollX(), c3);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.c2 = true;
    }

    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (this.g2 && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        p((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f3) {
        return dispatchNestedPreFling(f, f3);
    }

    public void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
        f(i, i3, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i, int i3, int i4, int i5) {
        u(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.r2.a = i;
        C(2, 0);
    }

    public void onOverScrolled(int i, int i3, boolean z, boolean z2) {
        super.scrollTo(i, i3);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !(true ^ t(view, 0, getHeight()))) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.q2 = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i, int i3, int i4, int i5) {
        super.onScrollChanged(i, i3, i4, i5);
        b bVar = this.u2;
        if (bVar != null) {
            bVar.a(this, i, i3, i4, i5);
        }
    }

    public void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && t(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.x);
            offsetDescendantRectToMyCoords(findFocus, this.x);
            g(d(this.x));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.r2.a = 0;
        D(0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f2 == null) {
            this.f2 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.o2 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.o2);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2;
                velocityTracker.computeCurrentVelocity(1000, (float) this.k2);
                int yVelocity = (int) velocityTracker.getYVelocity(this.l2);
                if (Math.abs(yVelocity) >= this.j2) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        p(i);
                    }
                } else if (this.y.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    AtomicInteger atomicInteger = q.a;
                    postInvalidateOnAnimation();
                }
                this.l2 = -1;
                h();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.l2);
                if (findPointerIndex == -1) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Invalid pointerId=");
                    P0.append(this.l2);
                    P0.append(" in onTouchEvent");
                    Log.e("NestedScrollView", P0.toString());
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.a2 - y2;
                    if (!this.e2 && Math.abs(i3) > this.i2) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.e2 = true;
                        i3 = i3 > 0 ? i3 - this.i2 : i3 + this.i2;
                    }
                    int i4 = i3;
                    if (this.e2) {
                        if (f(0, i4, this.n2, this.m2, 0)) {
                            i4 -= this.n2[1];
                            this.o2 += this.m2[1];
                        }
                        int i5 = i4;
                        this.a2 = y2 - this.m2[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i6 = scrollRange;
                        if (w(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0) && !r(0)) {
                            this.f2.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.n2;
                        iArr[1] = 0;
                        this.s2.e(0, scrollY2, 0, i5 - scrollY2, this.m2, 0, iArr);
                        int i7 = this.a2;
                        int[] iArr2 = this.m2;
                        this.a2 = i7 - iArr2[1];
                        this.o2 += iArr2[1];
                        if (z) {
                            int i8 = i5 - this.n2[1];
                            i();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                this.Y1.onPull(((float) i8) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.Z1.isFinished()) {
                                    this.Z1.onRelease();
                                }
                            } else if (i9 > i6) {
                                this.Z1.onPull(((float) i8) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.Y1.isFinished()) {
                                    this.Y1.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.Y1;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.Z1.isFinished())) {
                                AtomicInteger atomicInteger2 = q.a;
                                postInvalidateOnAnimation();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.e2 && getChildCount() > 0 && this.y.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    AtomicInteger atomicInteger3 = q.a;
                    postInvalidateOnAnimation();
                }
                this.l2 = -1;
                h();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.a2 = (int) motionEvent2.getY(actionIndex);
                this.l2 = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                v(motionEvent);
                this.a2 = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.l2));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.y.isFinished();
            this.e2 = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.y.isFinished()) {
                a();
            }
            this.a2 = (int) motionEvent.getY();
            this.l2 = motionEvent2.getPointerId(0);
            C(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f2;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i) {
        if (getChildCount() > 0) {
            this.y.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            y(true);
        }
    }

    public boolean q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.x;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.x.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.x;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.x;
        return z(i, rect3.top, rect3.bottom);
    }

    public boolean r(int i) {
        return this.s2.f(i) != null;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.b2) {
            A(view2);
        } else {
            this.d2 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d3 = d(rect);
        boolean z2 = d3 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, d3);
            } else {
                B(0, d3, k.d.DEFAULT_SWIPE_ANIMATION_DURATION, false);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.b2 = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c3 = c(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c4 = c(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c3 != getScrollX() || c4 != getScrollY()) {
                super.scrollTo(c3, c4);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.g2) {
            this.g2 = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        i iVar = this.s2;
        if (iVar.d) {
            View view = iVar.c;
            AtomicInteger atomicInteger = q.a;
            view.stopNestedScroll();
        }
        iVar.d = z;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.u2 = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.h2 = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.s2.h(i, 0);
    }

    public void stopNestedScroll() {
        this.s2.i(0);
    }

    public final boolean t(View view, int i, int i3) {
        view.getDrawingRect(this.x);
        offsetDescendantRectToMyCoords(view, this.x);
        return this.x.bottom + i >= getScrollY() && this.x.top - i <= getScrollY() + i3;
    }

    public final void u(int i, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.s2.e(0, scrollY2, 0, i - scrollY2, (int[]) null, i3, iArr);
    }

    public final void v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.l2) {
            int i = actionIndex == 0 ? 1 : 0;
            this.a2 = (int) motionEvent.getY(i);
            this.l2 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean w(int i, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i10 = i4 + i;
        int i11 = !z5 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z6 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
            z = true;
        } else if (i10 < i14) {
            z = true;
            i10 = i14;
        } else {
            z = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z2 = true;
        } else if (i12 < i16) {
            z2 = true;
            i12 = i16;
        } else {
            z2 = false;
        }
        if (z2 && !r(1)) {
            this.y.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i10, i12, z, z2);
        if (z || z2) {
            return true;
        }
        return false;
    }

    public final void x() {
        VelocityTracker velocityTracker = this.f2;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2 = null;
        }
    }

    public final void y(boolean z) {
        if (z) {
            C(2, 1);
        } else {
            this.s2.i(1);
        }
        this.p2 = getScrollY();
        AtomicInteger atomicInteger = q.a;
        postInvalidateOnAnimation();
    }

    public final boolean z(int i, int i3, int i4) {
        boolean z;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z2 = i5 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z4 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            g(z2 ? i6 - scrollY : i7 - i8);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z;
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
