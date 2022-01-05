package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import h0.b.f.l;
import h0.i.i.q;
import i0.h.a.c.a.g;
import i0.h.a.c.a.j;
import i0.h.a.c.p.d;
import i0.h.a.c.p.e;
import i0.h.a.c.p.h;
import i0.h.a.c.q.o;
import i0.h.a.c.w.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class FloatingActionButton extends o implements i0.h.a.c.o.a, i0.h.a.c.w.o, CoordinatorLayout.b {
    public static final int d = R.style.Widget_Design_FloatingActionButton;
    public PorterDuff.Mode Y1;
    public ColorStateList Z1;
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public boolean f2;
    public final Rect g2 = new Rect();
    public final Rect h2 = new Rect();
    public final l i2;
    public final i0.h.a.c.o.b j2;
    public e k2;
    public ColorStateList q;
    public PorterDuff.Mode x;
    public ColorStateList y;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class b implements i0.h.a.c.v.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements e.C0142e {
        public final j<T> a;

        public c(j<T> jVar) {
            this.a = jVar;
        }

        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            int r6 = com.google.android.material.R.attr.floatingActionButtonStyle
            int r7 = d
            android.content.Context r12 = i0.h.a.c.a0.a.a.a(r12, r13, r6, r7)
            r11.<init>(r12, r13, r6)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r11.g2 = r12
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r11.h2 = r12
            android.content.Context r12 = r11.getContext()
            int[] r2 = com.google.android.material.R.styleable.FloatingActionButton
            r8 = 0
            int[] r5 = new int[r8]
            r0 = r12
            r1 = r13
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r0 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R.styleable.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = i0.h.a.b.c.m.b.M(r12, r0, r1)
            r11.q = r1
            int r1 = com.google.android.material.R.styleable.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = i0.h.a.b.c.m.b.f0(r1, r3)
            r11.x = r1
            int r1 = com.google.android.material.R.styleable.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = i0.h.a.b.c.m.b.M(r12, r0, r1)
            r11.Z1 = r1
            int r1 = com.google.android.material.R.styleable.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r11.b2 = r1
            int r1 = com.google.android.material.R.styleable.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r8)
            r11.c2 = r1
            int r1 = com.google.android.material.R.styleable.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r8)
            r11.a2 = r1
            int r1 = com.google.android.material.R.styleable.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = com.google.android.material.R.styleable.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = com.google.android.material.R.styleable.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = com.google.android.material.R.styleable.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r8)
            r11.f2 = r4
            android.content.res.Resources r4 = r11.getResources()
            int r5 = com.google.android.material.R.dimen.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = com.google.android.material.R.styleable.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r8)
            r11.e2 = r5
            int r5 = com.google.android.material.R.styleable.FloatingActionButton_showMotionSpec
            i0.h.a.c.a.g r5 = i0.h.a.c.a.g.a(r12, r0, r5)
            int r9 = com.google.android.material.R.styleable.FloatingActionButton_hideMotionSpec
            i0.h.a.c.a.g r9 = i0.h.a.c.a.g.a(r12, r0, r9)
            i0.h.a.c.w.c r10 = i0.h.a.c.w.k.a
            i0.h.a.c.w.k$b r12 = i0.h.a.c.w.k.b(r12, r13, r6, r7, r10)
            i0.h.a.c.w.k r12 = r12.a()
            int r7 = com.google.android.material.R.styleable.FloatingActionButton_ensureMinTouchTargetSize
            boolean r7 = r0.getBoolean(r7, r8)
            int r8 = com.google.android.material.R.styleable.FloatingActionButton_android_enabled
            r10 = 1
            boolean r8 = r0.getBoolean(r8, r10)
            r11.setEnabled(r8)
            r0.recycle()
            h0.b.f.l r0 = new h0.b.f.l
            r0.<init>(r11)
            r11.i2 = r0
            r0.b(r13, r6)
            i0.h.a.c.o.b r13 = new i0.h.a.c.o.b
            r13.<init>(r11)
            r11.j2 = r13
            i0.h.a.c.p.e r13 = r11.getImpl()
            r13.q(r12)
            i0.h.a.c.p.e r12 = r11.getImpl()
            android.content.res.ColorStateList r13 = r11.q
            android.graphics.PorterDuff$Mode r0 = r11.x
            android.content.res.ColorStateList r6 = r11.Z1
            int r8 = r11.a2
            r12.f(r13, r0, r6, r8)
            i0.h.a.c.p.e r12 = r11.getImpl()
            r12.r = r4
            i0.h.a.c.p.e r12 = r11.getImpl()
            float r13 = r12.o
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 == 0) goto L_0x00f6
            r12.o = r1
            float r13 = r12.p
            float r0 = r12.q
            r12.l(r1, r13, r0)
        L_0x00f6:
            i0.h.a.c.p.e r12 = r11.getImpl()
            float r13 = r12.p
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x0109
            r12.p = r3
            float r13 = r12.o
            float r0 = r12.q
            r12.l(r13, r3, r0)
        L_0x0109:
            i0.h.a.c.p.e r12 = r11.getImpl()
            float r13 = r12.q
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x011c
            r12.q = r2
            float r13 = r12.o
            float r0 = r12.p
            r12.l(r13, r0, r2)
        L_0x011c:
            i0.h.a.c.p.e r12 = r11.getImpl()
            int r13 = r11.e2
            int r0 = r12.A
            if (r0 == r13) goto L_0x012d
            r12.A = r13
            float r13 = r12.z
            r12.o(r13)
        L_0x012d:
            i0.h.a.c.p.e r12 = r11.getImpl()
            r12.w = r5
            i0.h.a.c.p.e r12 = r11.getImpl()
            r12.x = r9
            i0.h.a.c.p.e r12 = r11.getImpl()
            r12.m = r7
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.MATRIX
            r11.setScaleType(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private e getImpl() {
        if (this.k2 == null) {
            this.k2 = new h(this, new b());
        }
        return this.k2;
    }

    public static int n(int i, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public boolean a() {
        return this.j2.b;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.D == null) {
            impl.D = new ArrayList<>();
        }
        impl.D.add((Object) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.C == null) {
            impl.C = new ArrayList<>();
        }
        impl.C.add(animatorListener);
    }

    public void f(j<? extends FloatingActionButton> jVar) {
        e impl = getImpl();
        c cVar = new c((j) null);
        if (impl.E == null) {
            impl.E = new ArrayList<>();
        }
        impl.E.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        AtomicInteger atomicInteger = q.a;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        l(rect);
        return true;
    }

    public ColorStateList getBackgroundTintList() {
        return this.q;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.x;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().d();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().q;
    }

    public Drawable getContentBackground() {
        return getImpl().l;
    }

    public int getCustomSize() {
        return this.c2;
    }

    public int getExpandedComponentIdHint() {
        return this.j2.c;
    }

    public g getHideMotionSpec() {
        return getImpl().x;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.Z1;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.Z1;
    }

    public k getShapeAppearanceModel() {
        k kVar = getImpl().h;
        Objects.requireNonNull(kVar);
        return kVar;
    }

    public g getShowMotionSpec() {
        return getImpl().w;
    }

    public int getSize() {
        return this.b2;
    }

    public int getSizeDimension() {
        return h(this.b2);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.y;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.Y1;
    }

    public boolean getUseCompatPadding() {
        return this.f2;
    }

    public final int h(int i) {
        int i3 = this.c2;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        } else {
            return h(0);
        }
    }

    public void i(a aVar, boolean z) {
        i0.h.a.c.p.b bVar;
        e impl = getImpl();
        if (aVar == null) {
            bVar = null;
        } else {
            bVar = new i0.h.a.c.p.b(this, aVar);
        }
        if (!impl.g()) {
            Animator animator = impl.v;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.s()) {
                g gVar = impl.x;
                if (gVar == null) {
                    if (impl.u == null) {
                        impl.u = g.b(impl.F.getContext(), R.animator.design_fab_hide_motion_spec);
                    }
                    gVar = impl.u;
                    Objects.requireNonNull(gVar);
                }
                AnimatorSet b3 = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                b3.addListener(new i0.h.a.c.p.c(impl, z, bVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.D;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b3.addListener(it.next());
                    }
                }
                b3.start();
                return;
            }
            impl.F.b(z ? 8 : 4, z);
            if (bVar != null) {
                bVar.a.a(bVar.b);
            }
        }
    }

    public boolean j() {
        return getImpl().g();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public boolean k() {
        return getImpl().h();
    }

    public final void l(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.g2;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void m() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.y;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.Y1;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(h0.b.f.j.c(colorForState, mode));
        }
    }

    public void o(a aVar, boolean z) {
        i0.h.a.c.p.b bVar;
        e impl = getImpl();
        if (aVar == null) {
            bVar = null;
        } else {
            bVar = new i0.h.a.c.p.b(this, aVar);
        }
        if (!impl.h()) {
            Animator animator = impl.v;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.s()) {
                if (impl.F.getVisibility() != 0) {
                    impl.F.setAlpha(0.0f);
                    impl.F.setScaleY(0.0f);
                    impl.F.setScaleX(0.0f);
                    impl.o(0.0f);
                }
                g gVar = impl.w;
                if (gVar == null) {
                    if (impl.t == null) {
                        impl.t = g.b(impl.F.getContext(), R.animator.design_fab_show_motion_spec);
                    }
                    gVar = impl.t;
                    Objects.requireNonNull(gVar);
                }
                AnimatorSet b3 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                b3.addListener(new d(impl, z, bVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.C;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b3.addListener(it.next());
                    }
                }
                b3.start();
                return;
            }
            impl.F.b(0, z);
            impl.F.setAlpha(1.0f);
            impl.F.setScaleY(1.0f);
            impl.F.setScaleX(1.0f);
            impl.o(1.0f);
            if (bVar != null) {
                bVar.a.b(bVar.b);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e impl = getImpl();
        i0.h.a.c.w.g gVar = impl.i;
        if (gVar != null) {
            i0.h.a.b.c.m.b.m0(impl.F, gVar);
        }
        if (!(impl instanceof h)) {
            ViewTreeObserver viewTreeObserver = impl.F.getViewTreeObserver();
            if (impl.L == null) {
                impl.L = new i0.h.a.c.p.g(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.L);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.L = null;
        }
    }

    public void onMeasure(int i, int i3) {
        int sizeDimension = getSizeDimension();
        this.d2 = (sizeDimension - this.e2) / 2;
        getImpl().v();
        int min = Math.min(n(sizeDimension, i), n(sizeDimension, i3));
        Rect rect = this.g2;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.d);
        i0.h.a.c.o.b bVar = this.j2;
        Bundle orDefault = extendableSavedState.q.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        Objects.requireNonNull(bVar);
        bVar.b = bundle.getBoolean("expanded", false);
        bVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.b) {
            ViewParent parent = bVar.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(bVar.a);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        h0.f.h<String, Bundle> hVar = extendableSavedState.q;
        i0.h.a.c.o.b bVar = this.j2;
        Objects.requireNonNull(bVar);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.b);
        bundle.putInt("expandedComponentIdHint", bVar.c);
        hVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !g(this.h2) || this.h2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.q != colorStateList) {
            this.q = colorStateList;
            e impl = getImpl();
            i0.h.a.c.w.g gVar = impl.i;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            i0.h.a.c.p.a aVar = impl.k;
            if (aVar != null) {
                aVar.b(colorStateList);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.x != mode) {
            this.x = mode;
            i0.h.a.c.w.g gVar = getImpl().i;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        e impl = getImpl();
        if (impl.o != f) {
            impl.o = f;
            impl.l(f, impl.p, impl.q);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        e impl = getImpl();
        if (impl.p != f) {
            impl.p = f;
            impl.l(impl.o, f, impl.q);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        e impl = getImpl();
        if (impl.q != f) {
            impl.q = f;
            impl.l(impl.o, impl.p, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.c2) {
            this.c2 = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().w(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m) {
            getImpl().m = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.j2.c = i;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().x = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(g.b(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            e impl = getImpl();
            impl.o(impl.z);
            if (this.y != null) {
                m();
            }
        }
    }

    public void setImageResource(int i) {
        this.i2.c(i);
        m();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m();
    }

    public void setShadowPaddingEnabled(boolean z) {
        e impl = getImpl();
        impl.n = z;
        impl.v();
    }

    public void setShapeAppearanceModel(k kVar) {
        getImpl().q(kVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().w = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(g.b(getContext(), i));
    }

    public void setSize(int i) {
        this.c2 = 0;
        if (i != this.b2) {
            this.b2 = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.Y1 != mode) {
            this.Y1 = mode;
            m();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().n();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().n();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2 != z) {
            this.f2 = z;
            getImpl().j();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public boolean B(FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.g2;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final boolean C(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.b && fVar.f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!C(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            i0.h.a.c.q.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.o((a) null, false);
            return true;
        }

        public final boolean E(View view, FloatingActionButton floatingActionButton) {
            if (!C(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.o((a) null, false);
            return true;
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return B((FloatingActionButton) view, rect);
        }

        public void f(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    E(view2, floatingActionButton);
                }
            }
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> f = coordinatorLayout.f(floatingActionButton);
            int size = f.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = f.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && E(view2, floatingActionButton)) {
                        break;
                    }
                } else if (D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.s(floatingActionButton, i);
            Rect rect = floatingActionButton.g2;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                AtomicInteger atomicInteger = q.a;
                floatingActionButton.offsetTopAndBottom(i3);
            }
            if (i2 == 0) {
                return true;
            }
            AtomicInteger atomicInteger2 = q.a;
            floatingActionButton.offsetLeftAndRight(i2);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.b = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.Z1 != colorStateList) {
            this.Z1 = colorStateList;
            getImpl().p(this.Z1);
        }
    }
}
