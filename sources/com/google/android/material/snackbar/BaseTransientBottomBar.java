package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import h0.i.i.d0;
import h0.i.i.q;
import i0.h.a.c.x.j;
import i0.h.a.c.x.k;
import i0.h.a.c.x.l;
import i0.h.a.c.x.m;
import i0.h.a.c.x.n;
import i0.h.a.c.x.o;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final Handler a = new Handler(Looper.getMainLooper(), new a());
    public static final int[] b = {R.attr.snackbarStyle};
    public static final String c = BaseTransientBottomBar.class.getSimpleName();
    public final ViewGroup d;
    public final Context e;
    public final i f;
    public final n g;
    public int h;
    public final Runnable i = new b();
    public Rect j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final AccessibilityManager p;
    public o.b q = new e();

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final f i = new f(this);

        public boolean B(View view) {
            Objects.requireNonNull(this.i);
            return view instanceof i;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            f fVar = this.i;
            Objects.requireNonNull(fVar);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    o.b().f(fVar.a);
                }
            } else if (coordinatorLayout.q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                o.b().e(fVar.a);
            }
            return super.j(coordinatorLayout, view, motionEvent);
        }
    }

    public static class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                baseTransientBottomBar.f.setOnAttachStateChangeListener(new k(baseTransientBottomBar));
                if (baseTransientBottomBar.f.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                        Behavior behavior = new Behavior();
                        f fVar2 = behavior.i;
                        Objects.requireNonNull(fVar2);
                        fVar2.a = baseTransientBottomBar.q;
                        behavior.b = new m(baseTransientBottomBar);
                        fVar.b(behavior);
                        fVar.g = 80;
                    }
                    baseTransientBottomBar.o = 0;
                    baseTransientBottomBar.h();
                    baseTransientBottomBar.f.setVisibility(4);
                    baseTransientBottomBar.d.addView(baseTransientBottomBar.f);
                }
                i iVar = baseTransientBottomBar.f;
                AtomicInteger atomicInteger = q.a;
                if (iVar.isLaidOut()) {
                    baseTransientBottomBar.g();
                } else {
                    baseTransientBottomBar.f.setOnLayoutChangeListener(new l(baseTransientBottomBar));
                }
                return true;
            } else if (i != 1) {
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i2 = message.arg1;
                if (!baseTransientBottomBar2.f() || baseTransientBottomBar2.f.getVisibility() != 0) {
                    baseTransientBottomBar2.d(i2);
                } else if (baseTransientBottomBar2.f.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat.setInterpolator(i0.h.a.c.a.a.a);
                    ofFloat.addUpdateListener(new i0.h.a.c.x.d(baseTransientBottomBar2));
                    ofFloat.setDuration(75);
                    ofFloat.addListener(new i0.h.a.c.x.c(baseTransientBottomBar2, i2));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(new int[]{0, baseTransientBottomBar2.c()});
                    valueAnimator.setInterpolator(i0.h.a.c.a.a.b);
                    valueAnimator.setDuration(250);
                    valueAnimator.addListener(new i0.h.a.c.x.h(baseTransientBottomBar2, i2));
                    valueAnimator.addUpdateListener(new i0.h.a.c.x.i(baseTransientBottomBar2));
                    valueAnimator.start();
                }
                return true;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f != null && (context = baseTransientBottomBar.e) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.f.getLocationOnScreen(iArr);
                int height = (i - (baseTransientBottomBar2.f.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f.getTranslationY());
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                if (height < baseTransientBottomBar3.n) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Handler handler = BaseTransientBottomBar.a;
                        Log.w(BaseTransientBottomBar.c, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i2 = marginLayoutParams.bottomMargin;
                    BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
                    marginLayoutParams.bottomMargin = (baseTransientBottomBar4.n - height) + i2;
                    baseTransientBottomBar4.f.requestLayout();
                }
            }
        }
    }

    public class c implements h0.i.i.m {
        public c() {
        }

        public d0 a(View view, d0 d0Var) {
            BaseTransientBottomBar.this.k = d0Var.b();
            BaseTransientBottomBar.this.l = d0Var.c();
            BaseTransientBottomBar.this.m = d0Var.d();
            BaseTransientBottomBar.this.h();
            return d0Var;
        }
    }

    public class d extends h0.i.i.a {
        public d() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, h0.i.i.g0.b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.b.addAction(1048576);
            bVar.b.setDismissable(true);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            BaseTransientBottomBar.this.a();
            return true;
        }
    }

    public class e implements o.b {
        public e() {
        }

        public void a() {
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public void b(int i) {
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    public static class f {
        public o.b a;

        public f(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f = SwipeDismissBehavior.C(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.g = SwipeDismissBehavior.C(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.d = 0;
        }
    }

    public interface g {
    }

    public interface h {
    }

    public static class i extends FrameLayout {
        public static final View.OnTouchListener c = new a();
        public final float Y1;
        public ColorStateList Z1;
        public PorterDuff.Mode a2;
        public h d;
        public g q;
        public int x;
        public final float y;

        public static class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public i(Context context, AttributeSet attributeSet) {
            super(i0.h.a.c.a0.a.a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            int i = R.styleable.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                AtomicInteger atomicInteger = q.a;
                setElevation((float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.x = obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            this.y = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(i0.h.a.b.c.m.b.M(context2, obtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(i0.h.a.b.c.m.b.f0(obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.Y1 = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(c);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                int i2 = R.attr.colorSurface;
                int i3 = R.attr.colorOnSurface;
                gradientDrawable.setColor(i0.h.a.b.c.m.b.b0(i0.h.a.b.c.m.b.L(this, i2), i0.h.a.b.c.m.b.L(this, i3), getBackgroundOverlayColorAlpha()));
                ColorStateList colorStateList = this.Z1;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                AtomicInteger atomicInteger2 = q.a;
                setBackground(gradientDrawable);
            }
        }

        public float getActionTextColorAlpha() {
            return this.Y1;
        }

        public int getAnimationMode() {
            return this.x;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.y;
        }

        public void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            g gVar = this.q;
            if (gVar != null) {
                k kVar = (k) gVar;
                Objects.requireNonNull(kVar);
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = kVar.a.f.getRootWindowInsets()) != null) {
                    kVar.a.n = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    kVar.a.h();
                }
            }
            AtomicInteger atomicInteger = q.a;
            requestApplyInsets();
        }

        public void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            g gVar = this.q;
            if (gVar != null) {
                k kVar = (k) gVar;
                BaseTransientBottomBar baseTransientBottomBar = kVar.a;
                Objects.requireNonNull(baseTransientBottomBar);
                o b = o.b();
                o.b bVar = baseTransientBottomBar.q;
                synchronized (b.b) {
                    if (!b.c(bVar)) {
                        if (!b.d(bVar)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    BaseTransientBottomBar.a.post(new j(kVar));
                }
            }
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            h hVar = this.d;
            if (hVar != null) {
                l lVar = (l) hVar;
                lVar.a.f.setOnLayoutChangeListener((h) null);
                lVar.a.g();
            }
        }

        public void setAnimationMode(int i) {
            this.x = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.Z1 == null)) {
                drawable = drawable.mutate();
                drawable.setTintList(this.Z1);
                drawable.setTintMode(this.a2);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.Z1 = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.a2);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.a2 = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        public void setOnAttachStateChangeListener(g gVar) {
            this.q = gVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : c);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(h hVar) {
            this.d = hVar;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, n nVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (nVar != null) {
            this.d = viewGroup;
            this.g = nVar;
            this.e = context;
            i0.h.a.c.q.j.c(context, i0.h.a.c.q.j.a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            i iVar = (i) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
            this.f = iVar;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                float actionTextColorAlpha = iVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.d.setTextColor(i0.h.a.b.c.m.b.b0(i0.h.a.b.c.m.b.L(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.d.getCurrentTextColor(), actionTextColorAlpha));
                }
            }
            iVar.addView(view);
            ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            AtomicInteger atomicInteger = q.a;
            iVar.setAccessibilityLiveRegion(1);
            iVar.setImportantForAccessibility(1);
            iVar.setFitsSystemWindows(true);
            q.c.c(iVar, new c());
            q.p(iVar, new d());
            this.p = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void a() {
        b(3);
    }

    public void b(int i2) {
        o b2 = o.b();
        o.b bVar = this.q;
        synchronized (b2.b) {
            if (b2.c(bVar)) {
                b2.a(b2.d, i2);
            } else if (b2.d(bVar)) {
                b2.a(b2.e, i2);
            }
        }
    }

    public final int c() {
        int height = this.f.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public void d(int i2) {
        o b2 = o.b();
        o.b bVar = this.q;
        synchronized (b2.b) {
            if (b2.c(bVar)) {
                b2.d = null;
                if (b2.e != null) {
                    b2.h();
                }
            }
        }
        ViewParent parent = this.f.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f);
        }
    }

    public void e() {
        o b2 = o.b();
        o.b bVar = this.q;
        synchronized (b2.b) {
            if (b2.c(bVar)) {
                b2.g(b2.d);
            }
        }
    }

    public boolean f() {
        AccessibilityManager accessibilityManager = this.p;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (f()) {
            this.f.post(new i0.h.a.c.x.a(this));
            return;
        }
        if (this.f.getParent() != null) {
            this.f.setVisibility(0);
        }
        e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (((r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f) && (((androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0).a instanceof com.google.android.material.behavior.SwipeDismissBehavior)) != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r4 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$i r0 = r4.f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0061
            android.graphics.Rect r1 = r4.j
            if (r1 != 0) goto L_0x000f
            goto L_0x0061
        L_0x000f:
            int r2 = r4.k
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r3 = r1.bottom
            int r3 = r3 + r2
            r0.bottomMargin = r3
            int r2 = r1.left
            int r3 = r4.l
            int r2 = r2 + r3
            r0.leftMargin = r2
            int r1 = r1.right
            int r2 = r4.m
            int r1 = r1 + r2
            r0.rightMargin = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$i r0 = r4.f
            r0.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0060
            int r0 = r4.n
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x004f
            com.google.android.material.snackbar.BaseTransientBottomBar$i r0 = r4.f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r3 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
            if (r3 == 0) goto L_0x004b
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.a
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L_0x004b
            r0 = r1
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            if (r0 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            if (r1 == 0) goto L_0x0060
            com.google.android.material.snackbar.BaseTransientBottomBar$i r0 = r4.f
            java.lang.Runnable r1 = r4.i
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$i r0 = r4.f
            java.lang.Runnable r1 = r4.i
            r0.post(r1)
        L_0x0060:
            return
        L_0x0061:
            java.lang.String r0 = c
            java.lang.String r1 = "Unable to update margins because layout params are not MarginLayoutParams"
            android.util.Log.w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.h():void");
    }
}
