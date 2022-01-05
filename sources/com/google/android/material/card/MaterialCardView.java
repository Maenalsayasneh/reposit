package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.R;
import h0.i.i.q;
import i0.h.a.b.c.m.b;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import i0.h.a.c.w.o;
import java.util.concurrent.atomic.AtomicInteger;

public class MaterialCardView extends CardView implements Checkable, o {
    public static final int[] c2 = {16842911};
    public static final int[] d2 = {16842912};
    public static final int[] e2 = {R.attr.state_dragged};
    public static final int f2 = R.style.Widget_MaterialComponents_CardView;
    public final i0.h.a.c.i.a g2;
    public boolean h2 = true;
    public boolean i2 = false;
    public boolean j2 = false;
    public a k2;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            int r6 = com.google.android.material.R.attr.materialCardViewStyle
            int r7 = f2
            android.content.Context r9 = i0.h.a.c.a0.a.a.a(r9, r10, r6, r7)
            r8.<init>(r9, r10, r6)
            r9 = 0
            r8.i2 = r9
            r8.j2 = r9
            r0 = 1
            r8.h2 = r0
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialCardView
            int[] r5 = new int[r9]
            r1 = r10
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r0 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            i0.h.a.c.i.a r1 = new i0.h.a.c.i.a
            r1.<init>(r8, r10, r6, r7)
            r8.g2 = r1
            android.content.res.ColorStateList r10 = super.getCardBackgroundColor()
            i0.h.a.c.w.g r2 = r1.e
            r2.t(r10)
            int r10 = super.getContentPaddingLeft()
            int r2 = super.getContentPaddingTop()
            int r3 = super.getContentPaddingRight()
            int r4 = super.getContentPaddingBottom()
            android.graphics.Rect r5 = r1.d
            r5.set(r10, r2, r3, r4)
            r1.k()
            com.google.android.material.card.MaterialCardView r10 = r1.c
            android.content.Context r10 = r10.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_strokeColor
            android.content.res.ColorStateList r10 = i0.h.a.b.c.m.b.M(r10, r0, r2)
            r1.o = r10
            if (r10 != 0) goto L_0x0061
            r10 = -1
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            r1.o = r10
        L_0x0061:
            int r10 = com.google.android.material.R.styleable.MaterialCardView_strokeWidth
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r1.i = r10
            int r10 = com.google.android.material.R.styleable.MaterialCardView_android_checkable
            boolean r10 = r0.getBoolean(r10, r9)
            r1.u = r10
            com.google.android.material.card.MaterialCardView r2 = r1.c
            r2.setLongClickable(r10)
            com.google.android.material.card.MaterialCardView r10 = r1.c
            android.content.Context r10 = r10.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_checkedIconTint
            android.content.res.ColorStateList r10 = i0.h.a.b.c.m.b.M(r10, r0, r2)
            r1.m = r10
            com.google.android.material.card.MaterialCardView r10 = r1.c
            android.content.Context r10 = r10.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_checkedIcon
            android.graphics.drawable.Drawable r10 = i0.h.a.b.c.m.b.P(r10, r0, r2)
            r1.g(r10)
            int r10 = com.google.android.material.R.styleable.MaterialCardView_checkedIconSize
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r1.h = r10
            int r10 = com.google.android.material.R.styleable.MaterialCardView_checkedIconMargin
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r1.g = r10
            com.google.android.material.card.MaterialCardView r10 = r1.c
            android.content.Context r10 = r10.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_rippleColor
            android.content.res.ColorStateList r10 = i0.h.a.b.c.m.b.M(r10, r0, r2)
            r1.l = r10
            if (r10 != 0) goto L_0x00c1
            com.google.android.material.card.MaterialCardView r10 = r1.c
            int r2 = com.google.android.material.R.attr.colorControlHighlight
            int r10 = i0.h.a.b.c.m.b.L(r10, r2)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            r1.l = r10
        L_0x00c1:
            com.google.android.material.card.MaterialCardView r10 = r1.c
            android.content.Context r10 = r10.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor
            android.content.res.ColorStateList r10 = i0.h.a.b.c.m.b.M(r10, r0, r2)
            i0.h.a.c.w.g r2 = r1.f
            if (r10 != 0) goto L_0x00d5
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r9)
        L_0x00d5:
            r2.t(r10)
            r1.m()
            i0.h.a.c.w.g r9 = r1.e
            com.google.android.material.card.MaterialCardView r10 = r1.c
            float r10 = r10.getCardElevation()
            r9.s(r10)
            r1.n()
            com.google.android.material.card.MaterialCardView r9 = r1.c
            i0.h.a.c.w.g r10 = r1.e
            android.graphics.drawable.Drawable r10 = r1.f(r10)
            r9.setBackgroundInternal(r10)
            com.google.android.material.card.MaterialCardView r9 = r1.c
            boolean r9 = r9.isClickable()
            if (r9 == 0) goto L_0x0101
            android.graphics.drawable.Drawable r9 = r1.e()
            goto L_0x0103
        L_0x0101:
            i0.h.a.c.w.g r9 = r1.f
        L_0x0103:
            r1.j = r9
            com.google.android.material.card.MaterialCardView r10 = r1.c
            android.graphics.drawable.Drawable r9 = r1.f(r9)
            r10.setForeground(r9)
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.g2.e.getBounds());
        return rectF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r8.g2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L_0x002a
            i0.h.a.c.i.a r0 = r8.g2
            android.graphics.drawable.Drawable r1 = r0.p
            if (r1 == 0) goto L_0x002a
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.Drawable r3 = r0.p
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + -1
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.Drawable r0 = r0.p
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.d():void");
    }

    public boolean e() {
        i0.h.a.c.i.a aVar = this.g2;
        return aVar != null && aVar.u;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.g2.e.q.d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.g2.f.q.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.g2.k;
    }

    public int getCheckedIconMargin() {
        return this.g2.g;
    }

    public int getCheckedIconSize() {
        return this.g2.h;
    }

    public ColorStateList getCheckedIconTint() {
        return this.g2.m;
    }

    public int getContentPaddingBottom() {
        return this.g2.d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.g2.d.left;
    }

    public int getContentPaddingRight() {
        return this.g2.d.right;
    }

    public int getContentPaddingTop() {
        return this.g2.d.top;
    }

    public float getProgress() {
        return this.g2.e.q.k;
    }

    public float getRadius() {
        return this.g2.e.n();
    }

    public ColorStateList getRippleColor() {
        return this.g2.l;
    }

    public k getShapeAppearanceModel() {
        return this.g2.n;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.g2.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.g2.o;
    }

    public int getStrokeWidth() {
        return this.g2.i;
    }

    public boolean isChecked() {
        return this.i2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.m0(this, this.g2.e);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, c2);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, d2);
        }
        if (this.j2) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, e2);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onMeasure(int i, int i3) {
        int i4;
        int i5;
        super.onMeasure(i, i3);
        i0.h.a.c.i.a aVar = this.g2;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (aVar.q != null) {
            int i6 = aVar.g;
            int i7 = aVar.h;
            int i8 = (measuredWidth - i6) - i7;
            int i9 = (measuredHeight - i6) - i7;
            if (aVar.c.getUseCompatPadding()) {
                i9 -= (int) Math.ceil((double) (aVar.d() * 2.0f));
                i8 -= (int) Math.ceil((double) (aVar.c() * 2.0f));
            }
            int i10 = i9;
            int i11 = aVar.g;
            MaterialCardView materialCardView = aVar.c;
            AtomicInteger atomicInteger = q.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i8;
                i5 = i11;
            } else {
                i5 = i8;
                i4 = i11;
            }
            aVar.q.setLayerInset(2, i5, aVar.g, i4, i10);
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h2) {
            if (!this.g2.t) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.g2.t = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        i0.h.a.c.i.a aVar = this.g2;
        aVar.e.t(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        i0.h.a.c.i.a aVar = this.g2;
        aVar.e.s(aVar.c.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.g2.f;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.t(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.g2.u = z;
    }

    public void setChecked(boolean z) {
        if (this.i2 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g2.g(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.g2.g = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.g2.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.g2.g(h0.b.b.a.a.a(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.g2.h = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.g2.h = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        i0.h.a.c.i.a aVar = this.g2;
        aVar.m = colorStateList;
        Drawable drawable = aVar.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        i0.h.a.c.i.a aVar = this.g2;
        if (aVar != null) {
            Drawable drawable = aVar.j;
            Drawable e = aVar.c.isClickable() ? aVar.e() : aVar.f;
            aVar.j = e;
            if (drawable == e) {
                return;
            }
            if (aVar.c.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) aVar.c.getForeground()).setDrawable(e);
            } else {
                aVar.c.setForeground(aVar.f(e));
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.j2 != z) {
            this.j2 = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g2.l();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.k2 = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.g2.l();
        this.g2.k();
    }

    public void setProgress(float f) {
        i0.h.a.c.i.a aVar = this.g2;
        aVar.e.u(f);
        g gVar = aVar.f;
        if (gVar != null) {
            gVar.u(f);
        }
        g gVar2 = aVar.s;
        if (gVar2 != null) {
            gVar2.u(f);
        }
    }

    public void setRadius(float f) {
        super.setRadius(f);
        i0.h.a.c.i.a aVar = this.g2;
        aVar.h(aVar.n.e(f));
        aVar.j.invalidateSelf();
        if (aVar.j() || aVar.i()) {
            aVar.k();
        }
        if (aVar.j()) {
            aVar.l();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        i0.h.a.c.i.a aVar = this.g2;
        aVar.l = colorStateList;
        aVar.m();
    }

    public void setRippleColorResource(int i) {
        i0.h.a.c.i.a aVar = this.g2;
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
        aVar.l = context.getColorStateList(i);
        aVar.m();
    }

    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.d(getBoundsAsRectF()));
        this.g2.h(kVar);
    }

    public void setStrokeColor(int i) {
        i0.h.a.c.i.a aVar = this.g2;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (aVar.o != valueOf) {
            aVar.o = valueOf;
            aVar.n();
        }
    }

    public void setStrokeWidth(int i) {
        i0.h.a.c.i.a aVar = this.g2;
        if (i != aVar.i) {
            aVar.i = i;
            aVar.n();
        }
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.g2.l();
        this.g2.k();
    }

    public void toggle() {
        if (e() && isEnabled()) {
            this.i2 = !this.i2;
            refreshDrawableState();
            d();
            a aVar = this.k2;
            if (aVar != null) {
                aVar.a(this, this.i2);
            }
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g2.e.t(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        i0.h.a.c.i.a aVar = this.g2;
        if (aVar.o != colorStateList) {
            aVar.o = colorStateList;
            aVar.n();
        }
    }
}
