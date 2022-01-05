package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R;
import androidx.customview.view.AbsSavedState;
import h0.i.i.d0;
import h0.i.i.j;
import h0.i.i.k;
import h0.i.i.l;
import h0.i.i.m;
import h0.i.i.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class CoordinatorLayout extends ViewGroup implements j, k {
    public static final String c;
    public static final Class<?>[] d = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> q = new ThreadLocal<>();
    public static final Comparator<View> x = new h();
    public static final h0.i.h.d<Rect> y = new h0.i.h.e(12);
    public final List<View> Y1 = new ArrayList();
    public final h0.h.a.a<View> Z1 = new h0.h.a.a<>();
    public final List<View> a2 = new ArrayList();
    public final List<View> b2 = new ArrayList();
    public Paint c2;
    public final int[] d2 = new int[2];
    public final int[] e2 = new int[2];
    public boolean f2;
    public boolean g2;
    public int[] h2;
    public View i2;
    public View j2;
    public g k2;
    public boolean l2;
    public d0 m2;
    public boolean n2;
    public Drawable o2;
    public ViewGroup.OnHierarchyChangeListener p2;
    public m q2;
    public final l r2 = new l();

    public class a implements m {
        public a() {
        }

        public d0 a(View view, d0 d0Var) {
            c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.m2, d0Var)) {
                coordinatorLayout.m2 = d0Var;
                boolean z = true;
                boolean z2 = d0Var.e() > 0;
                coordinatorLayout.n2 = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!d0Var.g()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        AtomicInteger atomicInteger = q.a;
                        if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).a) != null) {
                            d0Var = cVar.e(d0Var);
                            if (d0Var.g()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return d0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int b() {
            return -16777216;
        }

        public float c() {
            return 0.0f;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public d0 e(d0 d0Var) {
            return d0Var;
        }

        public void f(f fVar) {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void h(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void i() {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean m() {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void o() {
        }

        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                o();
            }
        }

        @Deprecated
        public void q() {
        }

        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (i5 == 0) {
                q();
            }
        }

        @Deprecated
        public void s() {
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean w() {
            return false;
        }

        public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return w();
            }
            return false;
        }

        @Deprecated
        public void y() {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                y();
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.p2;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.r(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.p2;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.r(0);
            return true;
        }
    }

    public static class h implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            AtomicInteger atomicInteger = q.a;
            float z = ((View) obj).getZ();
            float z2 = ((View) obj2).getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            c = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
            r0.<init>()
            x = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            d = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            q = r0
            h0.i.h.e r0 = new h0.i.h.e
            r1 = 12
            r0.<init>(r1)
            y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CoordinatorLayout(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r5 = androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle
            r9.<init>(r10, r11, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.Y1 = r0
            h0.h.a.a r0 = new h0.h.a.a
            r0.<init>()
            r9.Z1 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.a2 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.b2 = r0
            r0 = 2
            int[] r1 = new int[r0]
            r9.d2 = r1
            int[] r0 = new int[r0]
            r9.e2 = r0
            h0.i.i.l r0 = new h0.i.i.l
            r0.<init>()
            r9.r2 = r0
            r7 = 0
            if (r5 != 0) goto L_0x003d
            int[] r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            int r1 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r7, r1)
            goto L_0x0043
        L_0x003d:
            int[] r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r5, r7)
        L_0x0043:
            r8 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0063
            if (r5 != 0) goto L_0x0059
            int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r5 = 0
            int r6 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r8
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            goto L_0x0063
        L_0x0059:
            int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r6 = 0
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r8
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
        L_0x0063:
            int r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines
            int r0 = r8.getResourceId(r0, r7)
            if (r0 == 0) goto L_0x008c
            android.content.res.Resources r1 = r10.getResources()
            int[] r0 = r1.getIntArray(r0)
            r9.h2 = r0
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            float r0 = r0.density
            int[] r1 = r9.h2
            int r1 = r1.length
        L_0x007e:
            if (r7 >= r1) goto L_0x008c
            int[] r2 = r9.h2
            r3 = r2[r7]
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2[r7] = r3
            int r7 = r7 + 1
            goto L_0x007e
        L_0x008c:
            int r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r9.o2 = r0
            r8.recycle()
            r9.z()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$e
            r0.<init>()
            super.setOnHierarchyChangeListener(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
            int r0 = r9.getImportantForAccessibility()
            if (r0 != 0) goto L_0x00ae
            r0 = 1
            r9.setImportantForAccessibility(r0)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static Rect a() {
        Rect a3 = y.a();
        return a3 == null ? new Rect() : a3;
    }

    public final void b(f fVar, Rect rect, int i, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i3 + max2);
    }

    public void c(View view) {
        List orDefault = this.Z1.b.getOrDefault(view, null);
        if (orDefault != null && !orDefault.isEmpty()) {
            for (int i = 0; i < orDefault.size(); i++) {
                View view2 = (View) orDefault.get(i);
                c cVar = ((f) view2.getLayoutParams()).a;
                if (cVar != null) {
                    cVar.g(this, view2, view);
                }
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void d(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            h(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float c3 = cVar.c();
            if (c3 > 0.0f) {
                if (this.c2 == null) {
                    this.c2 = new Paint();
                }
                this.c2.setColor(fVar.a.b());
                Paint paint = this.c2;
                int round = Math.round(c3 * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.c2);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o2;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void e(View view, int i, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        int i7;
        boolean z;
        int i8;
        int childCount = getChildCount();
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.d2;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.r(this, childAt, view, i, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.d2;
                    if (i4 > 0) {
                        i7 = Math.max(i9, iArr3[0]);
                    } else {
                        i7 = Math.min(i9, iArr3[0]);
                    }
                    i9 = i7;
                    if (i5 > 0) {
                        z = true;
                        i8 = Math.max(i10, this.d2[1]);
                    } else {
                        z = true;
                        i8 = Math.min(i10, this.d2[1]);
                    }
                    i10 = i8;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z2) {
            r(1);
        }
    }

    public List<View> f(View view) {
        h0.h.a.a<View> aVar = this.Z1;
        int i = aVar.b.Z1;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList l = aVar.b.l(i3);
            if (l != null && l.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.b.i(i3));
            }
        }
        this.b2.clear();
        if (arrayList != null) {
            this.b2.addAll(arrayList);
        }
        return this.b2;
    }

    public List<View> g(View view) {
        List orDefault = this.Z1.b.getOrDefault(view, null);
        this.b2.clear();
        if (orDefault != null) {
            this.b2.addAll(orDefault);
        }
        return this.b2;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        v();
        return Collections.unmodifiableList(this.Y1);
    }

    public final d0 getLastWindowInsets() {
        return this.m2;
    }

    public int getNestedScrollAxes() {
        return this.r2.a();
    }

    public Drawable getStatusBarBackground() {
        return this.o2;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void h(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = h0.h.a.b.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = h0.h.a.b.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h0.h.a.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = h0.h.a.b.b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void i(int i, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5;
        int i6;
        int i7 = fVar.c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i);
        int i8 = fVar.d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        if (i11 == 1) {
            i5 = rect.left + (rect.width() / 2);
        } else if (i11 != 5) {
            i5 = rect.left;
        } else {
            i5 = rect.right;
        }
        if (i12 == 16) {
            i6 = rect.top + (rect.height() / 2);
        } else if (i12 != 80) {
            i6 = rect.top;
        } else {
            i6 = rect.bottom;
        }
        if (i9 == 1) {
            i5 -= i3 / 2;
        } else if (i9 != 5) {
            i5 -= i3;
        }
        if (i10 == 16) {
            i6 -= i4 / 2;
        } else if (i10 != 80) {
            i6 -= i4;
        }
        rect2.set(i5, i6, i3 + i5, i4 + i6);
    }

    public final int j(int i) {
        int[] iArr = this.h2;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    public void k(View view, int i, int i3, int i4, int i5, int i6) {
        e(view, i, i3, i4, i5, 0, this.e2);
    }

    public boolean l(View view, View view2, int i, int i3) {
        int i4 = i3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.a;
                if (cVar != null) {
                    boolean x2 = cVar.x(this, childAt, view, view2, i, i3);
                    z |= x2;
                    fVar.c(i4, x2);
                } else {
                    fVar.c(i4, false);
                }
            }
        }
        return z;
    }

    public void m(View view, View view2, int i, int i3) {
        c cVar;
        l lVar = this.r2;
        if (i3 == 1) {
            lVar.b = i;
        } else {
            lVar.a = i;
        }
        this.j2 = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            f fVar = (f) getChildAt(i4).getLayoutParams();
            if (fVar.a(i3) && (cVar = fVar.a) != null && i3 == 0) {
                cVar.s();
            }
        }
    }

    public void n(View view, int i) {
        l lVar = this.r2;
        if (i == 1) {
            lVar.b = 0;
        } else {
            lVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i)) {
                c cVar = fVar.a;
                if (cVar != null) {
                    cVar.z(this, childAt, view, i);
                }
                fVar.c(i, false);
                fVar.p = false;
            }
        }
        this.j2 = null;
    }

    public void o(View view, int i, int i3, int[] iArr, int i4) {
        c cVar;
        int i5;
        int i6;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i4;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.a) != null) {
                    int[] iArr2 = this.d2;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.p(this, childAt, view, i, i3, iArr2, i4);
                    int[] iArr3 = this.d2;
                    if (i > 0) {
                        i5 = Math.max(i7, iArr3[0]);
                    } else {
                        i5 = Math.min(i7, iArr3[0]);
                    }
                    i7 = i5;
                    int[] iArr4 = this.d2;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr4[1]);
                    } else {
                        i6 = Math.min(i8, iArr4[1]);
                    }
                    i8 = i6;
                    z = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z) {
            r(1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w(false);
        if (this.l2) {
            if (this.k2 == null) {
                this.k2 = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.k2);
        }
        if (this.m2 == null) {
            AtomicInteger atomicInteger = q.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.g2 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w(false);
        if (this.l2 && this.k2 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.k2);
        }
        View view = this.j2;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.g2 = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n2 && this.o2 != null) {
            d0 d0Var = this.m2;
            int e3 = d0Var != null ? d0Var.e() : 0;
            if (e3 > 0) {
                this.o2.setBounds(0, 0, getWidth(), e3);
                this.o2.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w(true);
        }
        boolean u = u(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            w(true);
        }
        return u;
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        c cVar;
        AtomicInteger atomicInteger = q.a;
        int layoutDirection = getLayoutDirection();
        int size = this.Y1.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.Y1.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).a) == null || !cVar.k(this, view, layoutDirection))) {
                s(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0180, code lost:
        if (r0.l(r30, r20, r8, r21, r23, 0) == false) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.v()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = r8
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r7.getChildAt(r1)
            h0.h.a.a<android.view.View> r4 = r7.Z1
            h0.f.h<T, java.util.ArrayList<T>> r5 = r4.b
            int r5 = r5.Z1
            r6 = r8
        L_0x0019:
            if (r6 >= r5) goto L_0x0030
            h0.f.h<T, java.util.ArrayList<T>> r9 = r4.b
            java.lang.Object r9 = r9.l(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = r2
            goto L_0x0031
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0030:
            r3 = r8
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = r8
        L_0x0039:
            boolean r1 = r7.l2
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.g2
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.k2
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r7.k2 = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.k2
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r7.l2 = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r7.g2
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.k2
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.k2
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r7.l2 = r8
        L_0x006d:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.concurrent.atomic.AtomicInteger r3 = h0.i.i.q.a
            int r11 = r30.getLayoutDirection()
            if (r11 != r2) goto L_0x0087
            r12 = r2
            goto L_0x0088
        L_0x0087:
            r12 = r8
        L_0x0088:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            h0.i.i.d0 r3 = r7.m2
            if (r3 == 0) goto L_0x00b1
            boolean r3 = r30.getFitsSystemWindows()
            if (r3 == 0) goto L_0x00b1
            r19 = r2
            goto L_0x00b3
        L_0x00b1:
            r19 = r8
        L_0x00b3:
            java.util.List<android.view.View> r2 = r7.Y1
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = r8
            r3 = r2
        L_0x00bd:
            if (r3 >= r6) goto L_0x01d6
            java.util.List<android.view.View> r0 = r7.Y1
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00d9
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01cd
        L_0x00d9:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.e
            if (r0 < 0) goto L_0x0123
            if (r13 == 0) goto L_0x0123
            int r0 = r7.j(r0)
            int r8 = r1.c
            if (r8 != 0) goto L_0x00f1
            r8 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f1:
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x00fe
            if (r12 == 0) goto L_0x0103
        L_0x00fe:
            r2 = 5
            if (r8 != r2) goto L_0x010f
            if (r12 == 0) goto L_0x010f
        L_0x0103:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r8 = r0
            r21 = r2
            goto L_0x0127
        L_0x010f:
            if (r8 != r2) goto L_0x0113
            if (r12 == 0) goto L_0x0118
        L_0x0113:
            r2 = 3
            if (r8 != r2) goto L_0x0121
            if (r12 == 0) goto L_0x0121
        L_0x0118:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x0127
        L_0x0121:
            r8 = 0
            goto L_0x0125
        L_0x0123:
            r22 = r2
        L_0x0125:
            r21 = r8
        L_0x0127:
            if (r19 == 0) goto L_0x0159
            boolean r0 = r20.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0159
            h0.i.i.d0 r0 = r7.m2
            int r0 = r0.c()
            h0.i.i.d0 r2 = r7.m2
            int r2 = r2.d()
            int r2 = r2 + r0
            h0.i.i.d0 r0 = r7.m2
            int r0 = r0.e()
            h0.i.i.d0 r8 = r7.m2
            int r8 = r8.b()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x015d
        L_0x0159:
            r8 = r31
            r23 = r32
        L_0x015d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.a
            if (r0 == 0) goto L_0x0183
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.l(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x019d
            goto L_0x0190
        L_0x0183:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x0190:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x019d:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01cd:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00bd
        L_0x01d6:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f3, float f4, boolean z) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z2 |= cVar.m();
                }
            }
        }
        if (z2) {
            r(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f3, float f4) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.a) != null) {
                    z |= cVar.n(this, childAt, view, f3, f4);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
        o(view, i, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i3, int i4, int i5) {
        e(view, i, i3, i4, i5, 0, this.e2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        m(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        SparseArray<Parcelable> sparseArray = savedState.q;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c cVar = p(childAt).a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.u(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable v;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (!(id == -1 || cVar == null || (v = cVar.v(this, childAt)) == null)) {
                sparseArray.append(id, v);
            }
        }
        savedState.q = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return l(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.i2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.u(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.i2
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.i2
            boolean r6 = r6.A(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.i2
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.w(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public f p(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e3) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Default behavior class ");
                        P0.append(dVar.value().getName());
                        P0.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", P0.toString(), e3);
                    }
                }
                fVar.b = true;
            }
        }
        return fVar;
    }

    public boolean q(View view, int i, int i3) {
        Rect a3 = a();
        h(view, a3);
        try {
            return a3.contains(i, i3);
        } finally {
            a3.setEmpty();
            y.b(a3);
        }
    }

    public final void r(int i) {
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        Rect rect2;
        int i11;
        int i12;
        int i13;
        f fVar;
        c cVar;
        int i14 = i;
        AtomicInteger atomicInteger = q.a;
        int layoutDirection = getLayoutDirection();
        int size = this.Y1.size();
        Rect a3 = a();
        Rect a4 = a();
        Rect a5 = a();
        int i15 = 0;
        while (i15 < size) {
            View view = this.Y1.get(i15);
            f fVar2 = (f) view.getLayoutParams();
            if (i14 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = a5;
                i3 = i15;
            } else {
                int i16 = 0;
                while (i16 < i15) {
                    if (fVar2.l == this.Y1.get(i16)) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.k != null) {
                            Rect a6 = a();
                            Rect a7 = a();
                            Rect a8 = a();
                            h(fVar3.k, a6);
                            d(view, false, a7);
                            int measuredWidth = view.getMeasuredWidth();
                            i13 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i17 = measuredWidth;
                            Rect rect3 = a8;
                            i12 = i15;
                            Rect rect4 = a7;
                            Rect rect5 = a6;
                            f fVar4 = fVar3;
                            i11 = i16;
                            rect2 = a5;
                            fVar = fVar2;
                            i(layoutDirection, a6, rect3, fVar3, i17, measuredHeight);
                            Rect rect6 = rect3;
                            boolean z4 = (rect6.left == rect4.left && rect6.top == rect4.top) ? false : true;
                            f fVar5 = fVar4;
                            b(fVar5, rect6, i17, measuredHeight);
                            int i18 = rect6.left - rect4.left;
                            int i19 = rect6.top - rect4.top;
                            if (i18 != 0) {
                                AtomicInteger atomicInteger2 = q.a;
                                view.offsetLeftAndRight(i18);
                            }
                            if (i19 != 0) {
                                AtomicInteger atomicInteger3 = q.a;
                                view.offsetTopAndBottom(i19);
                            }
                            if (z4 && (cVar = fVar5.a) != null) {
                                cVar.g(this, view, fVar5.k);
                            }
                            rect5.setEmpty();
                            h0.i.h.d<Rect> dVar = y;
                            dVar.b(rect5);
                            rect4.setEmpty();
                            dVar.b(rect4);
                            rect6.setEmpty();
                            dVar.b(rect6);
                            i16 = i11 + 1;
                            fVar2 = fVar;
                            size = i13;
                            i15 = i12;
                            a5 = rect2;
                        }
                    }
                    i11 = i16;
                    i13 = size;
                    rect2 = a5;
                    i12 = i15;
                    fVar = fVar2;
                    i16 = i11 + 1;
                    fVar2 = fVar;
                    size = i13;
                    i15 = i12;
                    a5 = rect2;
                }
                int i20 = size;
                Rect rect7 = a5;
                i3 = i15;
                f fVar6 = fVar2;
                d(view, true, a4);
                if (fVar6.g != 0 && !a4.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar6.g, layoutDirection);
                    int i21 = absoluteGravity & 112;
                    if (i21 == 48) {
                        a3.top = Math.max(a3.top, a4.bottom);
                    } else if (i21 == 80) {
                        a3.bottom = Math.max(a3.bottom, getHeight() - a4.top);
                    }
                    int i22 = absoluteGravity & 7;
                    if (i22 == 3) {
                        a3.left = Math.max(a3.left, a4.right);
                    } else if (i22 == 5) {
                        a3.right = Math.max(a3.right, getWidth() - a4.left);
                    }
                }
                if (fVar6.h != 0 && view.getVisibility() == 0) {
                    AtomicInteger atomicInteger4 = q.a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar7 = (f) view.getLayoutParams();
                        c cVar2 = fVar7.a;
                        Rect a9 = a();
                        Rect a10 = a();
                        a10.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(this, view, a9)) {
                            a9.set(a10);
                        } else if (!a10.contains(a9)) {
                            StringBuilder P0 = i0.d.a.a.a.P0("Rect should be within the child's bounds. Rect:");
                            P0.append(a9.toShortString());
                            P0.append(" | Bounds:");
                            P0.append(a10.toShortString());
                            throw new IllegalArgumentException(P0.toString());
                        }
                        a10.setEmpty();
                        h0.i.h.d<Rect> dVar2 = y;
                        dVar2.b(a10);
                        if (a9.isEmpty()) {
                            a9.setEmpty();
                            dVar2.b(a9);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar7.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (a9.top - fVar7.topMargin) - fVar7.j) >= (i10 = a3.top)) {
                                z2 = false;
                            } else {
                                y(view, i10 - i9);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a9.bottom) - fVar7.bottomMargin) + fVar7.j) < (i8 = a3.bottom)) {
                                y(view, height - i8);
                                z2 = true;
                            }
                            if (!z2) {
                                y(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (a9.left - fVar7.leftMargin) - fVar7.i) >= (i7 = a3.left)) {
                                z3 = false;
                            } else {
                                x(view, i7 - i6);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a9.right) - fVar7.rightMargin) + fVar7.i) < (i5 = a3.right)) {
                                x(view, width - i5);
                                z3 = true;
                            }
                            if (!z3) {
                                x(view, 0);
                            }
                            a9.setEmpty();
                            dVar2.b(a9);
                        }
                    }
                }
                if (i14 != 2) {
                    rect = rect7;
                    rect.set(((f) view.getLayoutParams()).q);
                    if (rect.equals(a4)) {
                        i4 = i20;
                    } else {
                        ((f) view.getLayoutParams()).q.set(a4);
                    }
                } else {
                    rect = rect7;
                }
                i4 = i20;
                for (int i23 = i3 + 1; i23 < i4; i23++) {
                    View view2 = this.Y1.get(i23);
                    f fVar8 = (f) view2.getLayoutParams();
                    c cVar3 = fVar8.a;
                    if (cVar3 != null && cVar3.d(this, view2, view)) {
                        if (i14 != 0 || !fVar8.p) {
                            if (i14 != 2) {
                                z = cVar3.g(this, view2, view);
                            } else {
                                cVar3.h(this, view2, view);
                                z = true;
                            }
                            if (i14 == 1) {
                                fVar8.p = z;
                            }
                        } else {
                            fVar8.p = false;
                        }
                    }
                }
            }
            i15 = i3 + 1;
            size = i4;
            a5 = rect;
        }
        Rect rect8 = a5;
        a3.setEmpty();
        h0.i.h.d<Rect> dVar3 = y;
        dVar3.b(a3);
        a4.setEmpty();
        dVar3.b(a4);
        rect8.setEmpty();
        dVar3.b(rect8);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVar = ((f) view.getLayoutParams()).a;
        if (cVar == null || !cVar.t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2) {
            w(false);
            this.f2 = true;
        }
    }

    public void s(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        int i3 = 0;
        if (view2 == null && fVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a3 = a();
            Rect a4 = a();
            try {
                h(view2, a3);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                i(i, a3, a4, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a4, measuredWidth, measuredHeight);
                view.layout(a4.left, a4.top, a4.right, a4.bottom);
            } finally {
                a3.setEmpty();
                h0.i.h.d<Rect> dVar = y;
                dVar.b(a3);
                a4.setEmpty();
                dVar.b(a4);
            }
        } else {
            int i4 = fVar.e;
            if (i4 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i5 = fVar3.c;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i4 = width - i4;
                }
                int j = j(i4) - measuredWidth2;
                if (i6 == 1) {
                    j += measuredWidth2 / 2;
                } else if (i6 == 5) {
                    j += measuredWidth2;
                }
                if (i7 == 16) {
                    i3 = 0 + (measuredHeight2 / 2);
                } else if (i7 == 80) {
                    i3 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(j, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            Rect a5 = a();
            a5.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
            if (this.m2 != null) {
                AtomicInteger atomicInteger = q.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a5.left = this.m2.c() + a5.left;
                    a5.top = this.m2.e() + a5.top;
                    a5.right -= this.m2.d();
                    a5.bottom -= this.m2.b();
                }
            }
            Rect a6 = a();
            int i8 = fVar4.c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), a5, a6, i);
            view.layout(a6.left, a6.top, a6.right, a6.bottom);
            a5.setEmpty();
            h0.i.h.d<Rect> dVar2 = y;
            dVar2.b(a5);
            a6.setEmpty();
            dVar2.b(a6);
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.p2 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.o2;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o2 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.o2.setState(getDrawableState());
                }
                Drawable drawable4 = this.o2;
                AtomicInteger atomicInteger = q.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.o2.setVisible(getVisibility() == 0, false);
                this.o2.setCallback(this);
            }
            AtomicInteger atomicInteger2 = q.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? h0.i.b.a.getDrawable(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.o2;
        if (drawable != null && drawable.isVisible() != z) {
            this.o2.setVisible(z, false);
        }
    }

    public void t(View view, int i, int i3, int i4, int i5) {
        measureChildWithMargins(view, i, i3, i4, i5);
    }

    public final boolean u(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.a2;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.a;
            boolean z4 = true;
            if ((!z2 && !z3) || actionMasked == 0) {
                if (!z2 && cVar != null) {
                    if (i3 == 0) {
                        z2 = cVar.j(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        z2 = cVar.A(this, view, motionEvent2);
                    }
                    if (z2) {
                        this.i2 = view;
                    }
                }
                c cVar2 = fVar.a;
                if (cVar2 == null) {
                    fVar.m = false;
                }
                boolean z5 = fVar.m;
                if (z5) {
                    z = true;
                } else {
                    z = (cVar2 != null && cVar2.c() > 0.0f) | z5;
                    fVar.m = z;
                }
                if (!z || z5) {
                    z4 = false;
                }
                if (z && !z4) {
                    break;
                }
                z3 = z4;
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    cVar.j(this, view, motionEvent3);
                } else if (i3 == 1) {
                    cVar.A(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r12 = this;
            java.util.List<android.view.View> r0 = r12.Y1
            r0.clear()
            h0.h.a.a<android.view.View> r0 = r12.Z1
            h0.f.h<T, java.util.ArrayList<T>> r1 = r0.b
            int r1 = r1.Z1
            r2 = 0
            r3 = r2
        L_0x000d:
            if (r3 >= r1) goto L_0x0024
            h0.f.h<T, java.util.ArrayList<T>> r4 = r0.b
            java.lang.Object r4 = r4.l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0021
            r4.clear()
            h0.i.h.d<java.util.ArrayList<T>> r5 = r0.a
            r5.b(r4)
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0024:
            h0.f.h<T, java.util.ArrayList<T>> r0 = r0.b
            r0.clear()
            int r0 = r12.getChildCount()
            r1 = r2
        L_0x002e:
            if (r1 >= r0) goto L_0x0198
            android.view.View r3 = r12.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r12.p(r3)
            int r5 = r4.f
            r6 = -1
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0045
            r4.l = r7
            r4.k = r7
            goto L_0x00cb
        L_0x0045:
            android.view.View r5 = r4.k
            if (r5 == 0) goto L_0x0076
            int r5 = r5.getId()
            int r6 = r4.f
            if (r5 == r6) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            android.view.View r5 = r4.k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0058:
            if (r6 == r12) goto L_0x0071
            if (r6 == 0) goto L_0x006b
            if (r6 != r3) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x0066
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0066:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0058
        L_0x006b:
            r4.l = r7
            r4.k = r7
        L_0x006f:
            r5 = r2
            goto L_0x0074
        L_0x0071:
            r4.l = r5
            r5 = r8
        L_0x0074:
            if (r5 != 0) goto L_0x00cb
        L_0x0076:
            int r5 = r4.f
            android.view.View r5 = r12.findViewById(r5)
            r4.k = r5
            if (r5 == 0) goto L_0x00c1
            if (r5 != r12) goto L_0x0095
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x008d
            r4.l = r7
            r4.k = r7
            goto L_0x00cb
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0099:
            if (r6 == r12) goto L_0x00be
            if (r6 == 0) goto L_0x00be
            if (r6 != r3) goto L_0x00b2
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x00aa
            r4.l = r7
            r4.k = r7
            goto L_0x00cb
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            boolean r9 = r6 instanceof android.view.View
            if (r9 == 0) goto L_0x00b9
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b9:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0099
        L_0x00be:
            r4.l = r5
            goto L_0x00cb
        L_0x00c1:
            boolean r5 = r12.isInEditMode()
            if (r5 == 0) goto L_0x0173
            r4.l = r7
            r4.k = r7
        L_0x00cb:
            h0.h.a.a<android.view.View> r5 = r12.Z1
            r5.a(r3)
            r5 = r2
        L_0x00d1:
            if (r5 >= r0) goto L_0x016f
            if (r5 != r1) goto L_0x00d7
            goto L_0x016b
        L_0x00d7:
            android.view.View r6 = r12.getChildAt(r5)
            android.view.View r9 = r4.l
            if (r6 == r9) goto L_0x010e
            java.util.concurrent.atomic.AtomicInteger r9 = h0.i.i.q.a
            int r9 = r12.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
            int r10 = r10.g
            int r10 = android.view.Gravity.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x00fe
            int r11 = r4.h
            int r9 = android.view.Gravity.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x00fe
            r9 = r8
            goto L_0x00ff
        L_0x00fe:
            r9 = r2
        L_0x00ff:
            if (r9 != 0) goto L_0x010e
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r9 = r4.a
            if (r9 == 0) goto L_0x010c
            boolean r9 = r9.d(r12, r3, r6)
            if (r9 == 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r9 = r2
            goto L_0x010f
        L_0x010e:
            r9 = r8
        L_0x010f:
            if (r9 == 0) goto L_0x016b
            h0.h.a.a<android.view.View> r9 = r12.Z1
            h0.f.h<T, java.util.ArrayList<T>> r9 = r9.b
            int r9 = r9.f(r6)
            if (r9 < 0) goto L_0x011d
            r9 = r8
            goto L_0x011e
        L_0x011d:
            r9 = r2
        L_0x011e:
            if (r9 != 0) goto L_0x0125
            h0.h.a.a<android.view.View> r9 = r12.Z1
            r9.a(r6)
        L_0x0125:
            h0.h.a.a<android.view.View> r9 = r12.Z1
            h0.f.h<T, java.util.ArrayList<T>> r10 = r9.b
            int r10 = r10.f(r6)
            if (r10 < 0) goto L_0x0131
            r10 = r8
            goto L_0x0132
        L_0x0131:
            r10 = r2
        L_0x0132:
            if (r10 == 0) goto L_0x0163
            h0.f.h<T, java.util.ArrayList<T>> r10 = r9.b
            int r10 = r10.f(r3)
            if (r10 < 0) goto L_0x013e
            r10 = r8
            goto L_0x013f
        L_0x013e:
            r10 = r2
        L_0x013f:
            if (r10 == 0) goto L_0x0163
            h0.f.h<T, java.util.ArrayList<T>> r10 = r9.b
            java.lang.Object r10 = r10.getOrDefault(r6, r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x015f
            h0.i.h.d<java.util.ArrayList<T>> r10 = r9.a
            java.lang.Object r10 = r10.a()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 != 0) goto L_0x015a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x015a:
            h0.f.h<T, java.util.ArrayList<T>> r9 = r9.b
            r9.put(r6, r10)
        L_0x015f:
            r10.add(r3)
            goto L_0x016b
        L_0x0163:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x016b:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x016f:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x0173:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            android.content.res.Resources r2 = r12.getResources()
            int r4 = r4.f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0198:
            java.util.List<android.view.View> r0 = r12.Y1
            h0.h.a.a<android.view.View> r1 = r12.Z1
            java.util.ArrayList<T> r3 = r1.c
            r3.clear()
            java.util.HashSet<T> r3 = r1.d
            r3.clear()
            h0.f.h<T, java.util.ArrayList<T>> r3 = r1.b
            int r3 = r3.Z1
        L_0x01aa:
            if (r2 >= r3) goto L_0x01bc
            h0.f.h<T, java.util.ArrayList<T>> r4 = r1.b
            java.lang.Object r4 = r4.i(r2)
            java.util.ArrayList<T> r5 = r1.c
            java.util.HashSet<T> r6 = r1.d
            r1.b(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01aa
        L_0x01bc:
            java.util.ArrayList<T> r1 = r1.c
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r12.Y1
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.v():void");
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o2;
    }

    public final void w(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            c cVar = ((f) childAt.getLayoutParams()).a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.j(this, childAt, obtain);
                } else {
                    cVar.A(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.i2 = null;
        this.f2 = false;
    }

    public final void x(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i) {
            AtomicInteger atomicInteger = q.a;
            view.offsetLeftAndRight(i - i3);
            fVar.i = i;
        }
    }

    public final void y(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i) {
            AtomicInteger atomicInteger = q.a;
            view.offsetTopAndBottom(i - i3);
            fVar.j = i;
        }
    }

    public final void z() {
        AtomicInteger atomicInteger = q.a;
        if (getFitsSystemWindows()) {
            if (this.q2 == null) {
                this.q2 = new a();
            }
            q.c.c(this, this.q2);
            setSystemUiVisibility(1280);
            return;
        }
        q.c.c(this, (m) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray<Parcelable> q;

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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.q = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.q.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            SparseArray<Parcelable> sparseArray = this.q;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.q.keyAt(i2);
                parcelableArr[i2] = this.q.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        public int f = -1;
        public int g = 0;
        public int h = 0;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        public boolean a(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        public void b(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.i();
                }
                this.a = cVar;
                this.b = true;
                if (cVar != null) {
                    cVar.f(this);
                }
            }
        }

        public void c(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.c = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.d = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.e = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.g = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.h = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i2 = R.styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i2);
            this.b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(i2);
                String str = CoordinatorLayout.c;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.c;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.q;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.d);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e2) {
                        throw new RuntimeException(i0.d.a.a.a.n0("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.a;
            if (cVar2 != null) {
                cVar2.f(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
