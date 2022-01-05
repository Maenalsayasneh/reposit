package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.R;
import h0.b.a.r;
import h0.b.e.i.m;
import h0.b.f.a0;
import h0.b.f.z;
import h0.i.i.d0;
import h0.i.i.j;
import h0.i.i.k;
import h0.i.i.l;
import h0.i.i.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements z, j, k {
    public static final int[] c = {R.attr.actionBarSize, 16842841};
    public a0 Y1;
    public Drawable Z1;
    public boolean a2;
    public boolean b2;
    public boolean c2;
    public int d;
    public boolean d2;
    public boolean e2;
    public int f2;
    public int g2;
    public final Rect h2 = new Rect();
    public final Rect i2 = new Rect();
    public final Rect j2 = new Rect();
    public final Rect k2 = new Rect();
    public final Rect l2 = new Rect();
    public final Rect m2 = new Rect();
    public final Rect n2 = new Rect();
    public d0 o2;
    public d0 p2;
    public int q = 0;
    public d0 q2;
    public d0 r2;
    public d s2;
    public OverScroller t2;
    public ViewPropertyAnimator u2;
    public final AnimatorListenerAdapter v2;
    public final Runnable w2;
    public ContentFrameLayout x;
    public final Runnable x2;
    public ActionBarContainer y;
    public final l y2;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.u2 = null;
            actionBarOverlayLayout.e2 = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.u2 = null;
            actionBarOverlayLayout.e2 = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.u2 = actionBarOverlayLayout.y.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.v2);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.u2 = actionBarOverlayLayout.y.animate().translationY((float) (-ActionBarOverlayLayout.this.y.getHeight())).setListener(ActionBarOverlayLayout.this.v2);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d0 d0Var = d0.a;
        this.o2 = d0Var;
        this.p2 = d0Var;
        this.q2 = d0Var;
        this.r2 = d0Var;
        this.v2 = new a();
        this.w2 = new b();
        this.x2 = new c();
        r(context);
        this.y2 = new l();
    }

    public void a(Menu menu, m.a aVar) {
        s();
        this.Y1.a(menu, aVar);
    }

    public boolean b() {
        s();
        return this.Y1.b();
    }

    public void c() {
        s();
        this.Y1.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        s();
        return this.Y1.d();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.Z1 != null && !this.a2) {
            if (this.y.getVisibility() == 0) {
                i = (int) (this.y.getTranslationY() + ((float) this.y.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.Z1.setBounds(0, i, getWidth(), this.Z1.getIntrinsicHeight() + i);
            this.Z1.draw(canvas);
        }
    }

    public void e(View view, int i, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i, i3, i4, i5);
        }
    }

    public boolean f() {
        s();
        return this.Y1.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        s();
        return this.Y1.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.y;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.y2.a();
    }

    public CharSequence getTitle() {
        s();
        return this.Y1.getTitle();
    }

    public boolean h() {
        s();
        return this.Y1.h();
    }

    public void i(int i) {
        s();
        if (i == 2) {
            this.Y1.w();
        } else if (i == 5) {
            this.Y1.x();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public void j() {
        s();
        this.Y1.i();
    }

    public void k(View view, int i, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i, i3, i4, i5);
        }
    }

    public boolean l(View view, View view2, int i, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i);
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

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        d0 k = d0.k(windowInsets, this);
        boolean p = p(this.y, new Rect(k.c(), k.e(), k.d(), k.b()), true, true, false, true);
        Rect rect = this.h2;
        AtomicInteger atomicInteger = q.a;
        q.c.b(this, k, rect);
        Rect rect2 = this.h2;
        d0 l = k.b.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.o2 = l;
        boolean z = true;
        if (!this.p2.equals(l)) {
            this.p2 = this.o2;
            p = true;
        }
        if (!this.i2.equals(this.h2)) {
            this.i2.set(this.h2);
        } else {
            z = p;
        }
        if (z) {
            requestLayout();
        }
        return k.b.a().b.c().b.b().i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        AtomicInteger atomicInteger = q.a;
        requestApplyInsets();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i, int i3) {
        int i4;
        d0.d dVar;
        s();
        measureChildWithMargins(this.y, i, 0, i3, 0);
        e eVar = (e) this.y.getLayoutParams();
        int max = Math.max(0, this.y.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.y.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.y.getMeasuredState());
        AtomicInteger atomicInteger = q.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            i4 = this.d;
            if (this.c2 && this.y.getTabContainer() != null) {
                i4 += this.d;
            }
        } else {
            i4 = this.y.getVisibility() != 8 ? this.y.getMeasuredHeight() : 0;
        }
        this.j2.set(this.h2);
        d0 d0Var = this.o2;
        this.q2 = d0Var;
        if (this.b2 || z) {
            h0.i.c.b b3 = h0.i.c.b.b(d0Var.c(), this.q2.e() + i4, this.q2.d(), this.q2.b() + 0);
            d0 d0Var2 = this.q2;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                dVar = new d0.c(d0Var2);
            } else if (i5 >= 29) {
                dVar = new d0.b(d0Var2);
            } else {
                dVar = new d0.a(d0Var2);
            }
            dVar.d(b3);
            this.q2 = dVar.b();
        } else {
            Rect rect = this.j2;
            rect.top += i4;
            rect.bottom += 0;
            this.q2 = d0Var.b.l(0, i4, 0, 0);
        }
        p(this.x, this.j2, true, true, true, true);
        if (!this.r2.equals(this.q2)) {
            d0 d0Var3 = this.q2;
            this.r2 = d0Var3;
            q.c(this.x, d0Var3);
        }
        measureChildWithMargins(this.x, i, 0, i3, 0);
        e eVar2 = (e) this.x.getLayoutParams();
        int max3 = Math.max(max, this.x.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.x.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.x.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f3, boolean z) {
        boolean z2 = false;
        if (!this.d2 || !z) {
            return false;
        }
        this.t2.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.t2.getFinalY() > this.y.getHeight()) {
            z2 = true;
        }
        if (z2) {
            q();
            this.x2.run();
        } else {
            q();
            this.w2.run();
        }
        this.e2 = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i3, int i4, int i5) {
        int i6 = this.f2 + i3;
        this.f2 = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (h0.b.a.r) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            h0.i.i.l r1 = r0.y2
            r1.a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f2 = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.s2
            if (r1 == 0) goto L_0x001d
            h0.b.a.r r1 = (h0.b.a.r) r1
            h0.b.e.g r2 = r1.w
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.w = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.y.getVisibility() != 0) {
            return false;
        }
        return this.d2;
    }

    public void onStopNestedScroll(View view) {
        if (this.d2 && !this.e2) {
            if (this.f2 <= this.y.getHeight()) {
                q();
                postDelayed(this.w2, 600);
            } else {
                q();
                postDelayed(this.x2, 600);
            }
        }
        d dVar = this.s2;
        if (dVar != null) {
            Objects.requireNonNull((r) dVar);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i3 = this.g2 ^ i;
        this.g2 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.s2;
        if (dVar != null) {
            ((r) dVar).r = !z2;
            if (z || !z2) {
                r rVar = (r) dVar;
                if (rVar.t) {
                    rVar.t = false;
                    rVar.C(true);
                }
            } else {
                r rVar2 = (r) dVar;
                if (!rVar2.t) {
                    rVar2.t = true;
                    rVar2.C(true);
                }
            }
        }
        if ((i3 & 256) != 0 && this.s2 != null) {
            AtomicInteger atomicInteger = q.a;
            requestApplyInsets();
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.q = i;
        d dVar = this.s2;
        if (dVar != null) {
            ((r) dVar).q = i;
        }
    }

    public final boolean p(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i5 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i5;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    public void q() {
        removeCallbacks(this.w2);
        removeCallbacks(this.x2);
        ViewPropertyAnimator viewPropertyAnimator = this.u2;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(c);
        boolean z = false;
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.Z1 = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.a2 = z;
        this.t2 = new OverScroller(context);
    }

    public void s() {
        a0 a0Var;
        if (this.x == null) {
            this.x = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.y = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof a0) {
                a0Var = (a0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                a0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("Can't make a decor toolbar out of ");
                P0.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(P0.toString());
            }
            this.Y1 = a0Var;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.y.setTranslationY((float) (-Math.max(0, Math.min(i, this.y.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.s2 = dVar;
        if (getWindowToken() != null) {
            ((r) this.s2).q = this.q;
            int i = this.g2;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AtomicInteger atomicInteger = q.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.c2 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.d2) {
            this.d2 = z;
            if (!z) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        s();
        this.Y1.setIcon(i);
    }

    public void setLogo(int i) {
        s();
        this.Y1.n(i);
    }

    public void setOverlayMode(boolean z) {
        this.b2 = z;
        this.a2 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.Y1.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.Y1.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.Y1.setIcon(drawable);
    }
}
