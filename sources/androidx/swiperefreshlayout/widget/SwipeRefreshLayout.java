package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import h0.i.i.i;
import h0.i.i.j;
import h0.i.i.k;
import h0.i.i.l;
import h0.i.i.q;
import h0.z.a.d;
import java.util.concurrent.atomic.AtomicInteger;

public class SwipeRefreshLayout extends ViewGroup implements k, j, h0.i.i.h {
    public static final String c = SwipeRefreshLayout.class.getSimpleName();
    public static final int[] d = {16842766};
    public Animation A2;
    public Animation B2;
    public boolean C2;
    public int D2;
    public boolean E2;
    public g F2;
    public boolean G2;
    public Animation.AnimationListener H2 = new a();
    public final Animation I2 = new e();
    public final Animation J2 = new f();
    public int Y1;
    public float Z1 = -1.0f;
    public float a2;
    public final l b2;
    public final i c2;
    public final int[] d2 = new int[2];
    public final int[] e2 = new int[2];
    public final int[] f2 = new int[2];
    public boolean g2;
    public int h2;
    public int i2;
    public float j2;
    public float k2;
    public boolean l2;
    public int m2 = -1;
    public boolean n2;
    public final DecelerateInterpolator o2;
    public h0.z.a.a p2;
    public View q;
    public int q2 = -1;
    public int r2;
    public float s2;
    public int t2;
    public int u2;
    public int v2;
    public h0.z.a.d w2;
    public h x;
    public Animation x2;
    public boolean y = false;
    public Animation y2;
    public Animation z2;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        public void onAnimationEnd(Animation animation) {
            h hVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.y) {
                swipeRefreshLayout.w2.setAlpha(255);
                SwipeRefreshLayout.this.w2.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.C2 && (hVar = swipeRefreshLayout2.x) != null) {
                    hVar.q0();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.i2 = swipeRefreshLayout3.p2.getTop();
                return;
            }
            swipeRefreshLayout.i();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        public b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    public class c extends Animation {
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public c(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            h0.z.a.d dVar = SwipeRefreshLayout.this.w2;
            int i = this.c;
            dVar.setAlpha((int) ((((float) (this.d - i)) * f) + ((float) i)));
        }
    }

    public class d implements Animation.AnimationListener {
        public d() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.n2) {
                swipeRefreshLayout.r((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public class e extends Animation {
        public e() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.E2) {
                i = swipeRefreshLayout.u2 - Math.abs(swipeRefreshLayout.t2);
            } else {
                i = swipeRefreshLayout.u2;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.r2;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.p2.getTop());
            h0.z.a.d dVar = SwipeRefreshLayout.this.w2;
            float f2 = 1.0f - f;
            d.a aVar = dVar.x;
            if (f2 != aVar.p) {
                aVar.p = f2;
            }
            dVar.invalidateSelf();
        }
    }

    public class f extends Animation {
        public f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.g(f);
        }
    }

    public interface g {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface h {
        void q0();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y1 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.h2 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.o2 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.D2 = (int) (displayMetrics.density * 40.0f);
        this.p2 = new h0.z.a.a(getContext());
        h0.z.a.d dVar = new h0.z.a.d(getContext());
        this.w2 = dVar;
        dVar.c(1);
        this.p2.setImageDrawable(this.w2);
        this.p2.setVisibility(8);
        addView(this.p2);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.u2 = i;
        this.Z1 = (float) i;
        this.b2 = new l();
        this.c2 = new i(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.D2;
        this.i2 = i3;
        this.t2 = i3;
        g(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.p2.getBackground().setAlpha(i);
        h0.z.a.d dVar = this.w2;
        dVar.x.t = i;
        dVar.invalidateSelf();
    }

    public boolean a() {
        g gVar = this.F2;
        if (gVar != null) {
            return gVar.a(this, this.q);
        }
        View view = this.q;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.q == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.p2)) {
                    this.q = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f3) {
        if (f3 > this.Z1) {
            j(true, true);
            return;
        }
        this.y = false;
        h0.z.a.d dVar = this.w2;
        d.a aVar = dVar.x;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        dVar.invalidateSelf();
        d dVar2 = null;
        boolean z = this.n2;
        if (!z) {
            dVar2 = new d();
        }
        int i = this.i2;
        if (z) {
            this.r2 = i;
            this.s2 = this.p2.getScaleX();
            h0.z.a.f fVar = new h0.z.a.f(this);
            this.B2 = fVar;
            fVar.setDuration(150);
            if (dVar2 != null) {
                this.p2.c = dVar2;
            }
            this.p2.clearAnimation();
            this.p2.startAnimation(this.B2);
        } else {
            this.r2 = i;
            this.J2.reset();
            this.J2.setDuration(200);
            this.J2.setInterpolator(this.o2);
            if (dVar2 != null) {
                this.p2.c = dVar2;
            }
            this.p2.clearAnimation();
            this.p2.startAnimation(this.J2);
        }
        h0.z.a.d dVar3 = this.w2;
        d.a aVar2 = dVar3.x;
        if (aVar2.n) {
            aVar2.n = false;
        }
        dVar3.invalidateSelf();
    }

    public final boolean d(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    public boolean dispatchNestedFling(float f3, float f4, boolean z) {
        return this.c2.a(f3, f4, z);
    }

    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.c2.b(f3, f4);
    }

    public boolean dispatchNestedPreScroll(int i, int i3, int[] iArr, int[] iArr2) {
        return this.c2.c(i, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i3, int i4, int i5, int[] iArr) {
        return this.c2.d(i, i3, i4, i5, iArr);
    }

    public void e(View view, int i, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            int i7 = iArr[1];
            int[] iArr2 = this.e2;
            if (i6 == 0) {
                this.c2.e(i, i3, i4, i5, iArr2, i6, iArr);
            }
            int i8 = i5 - (iArr[1] - i7);
            int i9 = i8 == 0 ? i5 + this.e2[1] : i8;
            if (i9 < 0 && !a()) {
                float abs = this.a2 + ((float) Math.abs(i9));
                this.a2 = abs;
                f(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    public final void f(float f3) {
        h0.z.a.d dVar = this.w2;
        d.a aVar = dVar.x;
        if (!aVar.n) {
            aVar.n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f3 / this.Z1));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f3) - this.Z1;
        int i = this.v2;
        if (i <= 0) {
            if (this.E2) {
                i = this.u2 - this.t2;
            } else {
                i = this.u2;
            }
        }
        float f4 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f4 * 2.0f) / f4) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.t2 + ((int) ((f4 * min) + (f4 * pow * 2.0f)));
        if (this.p2.getVisibility() != 0) {
            this.p2.setVisibility(0);
        }
        if (!this.n2) {
            this.p2.setScaleX(1.0f);
            this.p2.setScaleY(1.0f);
        }
        if (this.n2) {
            setAnimationProgress(Math.min(1.0f, f3 / this.Z1));
        }
        if (f3 < this.Z1) {
            if (this.w2.x.t > 76 && !d(this.z2)) {
                this.z2 = p(this.w2.x.t, 76);
            }
        } else if (this.w2.x.t < 255 && !d(this.A2)) {
            this.A2 = p(this.w2.x.t, 255);
        }
        h0.z.a.d dVar2 = this.w2;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar2 = dVar2.x;
        aVar2.e = 0.0f;
        aVar2.f = min2;
        dVar2.invalidateSelf();
        h0.z.a.d dVar3 = this.w2;
        float min3 = Math.min(1.0f, max);
        d.a aVar3 = dVar3.x;
        if (min3 != aVar3.p) {
            aVar3.p = min3;
        }
        dVar3.invalidateSelf();
        h0.z.a.d dVar4 = this.w2;
        dVar4.x.g = ((pow * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.i2);
    }

    public void g(float f3) {
        int i = this.r2;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.t2 - i)) * f3))) - this.p2.getTop());
    }

    public int getChildDrawingOrder(int i, int i3) {
        int i4 = this.q2;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i - 1) {
            return i4;
        }
        return i3 >= i4 ? i3 + 1 : i3;
    }

    public int getNestedScrollAxes() {
        return this.b2.a();
    }

    public int getProgressCircleDiameter() {
        return this.D2;
    }

    public int getProgressViewEndOffset() {
        return this.u2;
    }

    public int getProgressViewStartOffset() {
        return this.t2;
    }

    public final void h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.m2) {
            this.m2 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.c2.g(0);
    }

    public void i() {
        this.p2.clearAnimation();
        this.w2.stop();
        this.p2.setVisibility(8);
        setColorViewAlpha(255);
        if (this.n2) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.t2 - this.i2);
        }
        this.i2 = this.p2.getTop();
    }

    public boolean isNestedScrollingEnabled() {
        return this.c2.d;
    }

    public final void j(boolean z, boolean z3) {
        if (this.y != z) {
            this.C2 = z3;
            b();
            this.y = z;
            if (z) {
                int i = this.i2;
                Animation.AnimationListener animationListener = this.H2;
                this.r2 = i;
                this.I2.reset();
                this.I2.setDuration(200);
                this.I2.setInterpolator(this.o2);
                if (animationListener != null) {
                    this.p2.c = animationListener;
                }
                this.p2.clearAnimation();
                this.p2.startAnimation(this.I2);
                return;
            }
            r(this.H2);
        }
    }

    public void k(View view, int i, int i3, int i4, int i5, int i6) {
        e(view, i, i3, i4, i5, i6, this.f2);
    }

    public boolean l(View view, View view2, int i, int i3) {
        if (i3 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void m(View view, View view2, int i, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public void o(View view, int i, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i, i3, iArr);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.y || this.g2) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.m2;
                    if (i == -1) {
                        Log.e(c, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    q(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        h(motionEvent);
                    }
                }
            }
            this.l2 = false;
            this.m2 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.t2 - this.p2.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.m2 = pointerId;
            this.l2 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.k2 = motionEvent.getY(findPointerIndex2);
        }
        return this.l2;
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.q == null) {
                b();
            }
            View view = this.q;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.p2.getMeasuredWidth();
                int measuredHeight2 = this.p2.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.i2;
                this.p2.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (this.q == null) {
            b();
        }
        View view = this.q;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.p2.measure(View.MeasureSpec.makeMeasureSpec(this.D2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.D2, 1073741824));
            this.q2 = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.p2) {
                    this.q2 = i4;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f3, float f4, boolean z) {
        return dispatchNestedFling(f3, f4, z);
    }

    public boolean onNestedPreFling(View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    public void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
        if (i3 > 0) {
            float f3 = this.a2;
            if (f3 > 0.0f) {
                float f4 = (float) i3;
                if (f4 > f3) {
                    iArr[1] = (int) f3;
                    this.a2 = 0.0f;
                } else {
                    this.a2 = f3 - f4;
                    iArr[1] = i3;
                }
                f(this.a2);
            }
        }
        if (this.E2 && i3 > 0 && this.a2 == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.p2.setVisibility(8);
        }
        int[] iArr2 = this.d2;
        if (dispatchNestedPreScroll(i - iArr[0], i3 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i3, int i4, int i5) {
        e(view, i, i3, i4, i5, 0, this.f2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.b2.a = i;
        startNestedScroll(i & 2);
        this.a2 = 0.0f;
        this.g2 = true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.c);
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.y);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.y && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.b2.b(0);
        this.g2 = false;
        float f3 = this.a2;
        if (f3 > 0.0f) {
            c(f3);
            this.a2 = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.y || this.g2) {
            return false;
        }
        if (actionMasked == 0) {
            this.m2 = motionEvent.getPointerId(0);
            this.l2 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.m2);
            if (findPointerIndex < 0) {
                Log.e(c, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.l2) {
                this.l2 = false;
                c((motionEvent.getY(findPointerIndex) - this.j2) * 0.5f);
            }
            this.m2 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.m2);
            if (findPointerIndex2 < 0) {
                Log.e(c, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y3 = motionEvent.getY(findPointerIndex2);
            q(y3);
            if (this.l2) {
                float f3 = (y3 - this.j2) * 0.5f;
                if (f3 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                f(f3);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(c, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.m2 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                h(motionEvent);
            }
        }
        return true;
    }

    public final Animation p(int i, int i3) {
        c cVar = new c(i, i3);
        cVar.setDuration(300);
        h0.z.a.a aVar = this.p2;
        aVar.c = null;
        aVar.clearAnimation();
        this.p2.startAnimation(cVar);
        return cVar;
    }

    public final void q(float f3) {
        float f4 = this.k2;
        int i = this.Y1;
        if (f3 - f4 > ((float) i) && !this.l2) {
            this.j2 = f4 + ((float) i);
            this.l2 = true;
            this.w2.setAlpha(76);
        }
    }

    public void r(Animation.AnimationListener animationListener) {
        b bVar = new b();
        this.y2 = bVar;
        bVar.setDuration(150);
        h0.z.a.a aVar = this.p2;
        aVar.c = animationListener;
        aVar.clearAnimation();
        this.p2.startAnimation(this.y2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.q;
        if (view != null) {
            AtomicInteger atomicInteger = q.a;
            if (!view.isNestedScrollingEnabled()) {
                if (!this.G2 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f3) {
        this.p2.setScaleX(f3);
        this.p2.setScaleY(f3);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        h0.z.a.d dVar = this.w2;
        d.a aVar = dVar.x;
        aVar.i = iArr;
        aVar.a(0);
        dVar.x.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = h0.i.b.a.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.Z1 = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            i();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.G2 = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        i iVar = this.c2;
        if (iVar.d) {
            View view = iVar.c;
            AtomicInteger atomicInteger = q.a;
            view.stopNestedScroll();
        }
        iVar.d = z;
    }

    public void setOnChildScrollUpCallback(g gVar) {
        this.F2 = gVar;
    }

    public void setOnRefreshListener(h hVar) {
        this.x = hVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.p2.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(h0.i.b.a.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.y == z) {
            j(z, false);
            return;
        }
        this.y = z;
        if (!this.E2) {
            i = this.u2 + this.t2;
        } else {
            i = this.u2;
        }
        setTargetOffsetTopAndBottom(i - this.i2);
        this.C2 = false;
        Animation.AnimationListener animationListener = this.H2;
        this.p2.setVisibility(0);
        this.w2.setAlpha(255);
        h0.z.a.e eVar = new h0.z.a.e(this);
        this.x2 = eVar;
        eVar.setDuration((long) this.h2);
        if (animationListener != null) {
            this.p2.c = animationListener;
        }
        this.p2.clearAnimation();
        this.p2.startAnimation(this.x2);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.D2 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.D2 = (int) (displayMetrics.density * 40.0f);
            }
            this.p2.setImageDrawable((Drawable) null);
            this.w2.c(i);
            this.p2.setImageDrawable(this.w2);
        }
    }

    public void setSlingshotDistance(int i) {
        this.v2 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.p2.bringToFront();
        h0.z.a.a aVar = this.p2;
        AtomicInteger atomicInteger = q.a;
        aVar.offsetTopAndBottom(i);
        this.i2 = this.p2.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.c2.h(i, 0);
    }

    public void stopNestedScroll() {
        this.c2.i(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean c;

        public class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.c ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.c = parcel.readByte() != 0;
        }
    }
}
