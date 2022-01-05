package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.R;
import h0.b.f.g;
import h0.i.i.g0.b;
import h0.i.i.q;
import i0.h.a.c.j.b;
import i0.h.a.c.t.d;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import i0.h.a.c.w.o;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Chip extends g implements b.a, o {
    public static final int[] Y1 = {16842913};
    public static final int[] Z1 = {16842911};
    public static final int x = R.style.Widget_MaterialComponents_Chip_Action;
    public static final Rect y = new Rect();
    public i0.h.a.c.j.b a2;
    public InsetDrawable b2;
    public RippleDrawable c2;
    public View.OnClickListener d2;
    public CompoundButton.OnCheckedChangeListener e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public int k2;
    public int l2;
    public final b m2;
    public final Rect n2 = new Rect();
    public final RectF o2 = new RectF();
    public final d p2 = new a();

    public class a extends d {
        public a() {
        }

        public void a(int i) {
        }

        public void b(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            i0.h.a.c.j.b bVar = chip.a2;
            if (bVar.z3) {
                charSequence = bVar.A2;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends h0.k.a.a {
        public b(Chip chip) {
            super(chip);
        }

        public void d(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            int i = Chip.x;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                i0.h.a.c.j.b bVar = chip2.a2;
                if (bVar != null && bVar.G2) {
                    z = true;
                }
                if (z && chip2.d2 != null) {
                    list.add(1);
                }
            }
        }

        public boolean g(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.d2;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.m2.l(1, 1);
                }
            }
            return z;
        }

        public void h(h0.i.i.g0.b bVar) {
            bVar.b.setCheckable(Chip.this.f());
            bVar.b.setClickable(Chip.this.isClickable());
            if (Chip.this.f() || Chip.this.isClickable()) {
                bVar.b.setClassName(Chip.this.f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                bVar.b.setClassName("android.view.View");
            }
            bVar.b.setText(Chip.this.getText());
        }

        public void i(int i, h0.i.i.g0.b bVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    bVar.b.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = R.string.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    bVar.b.setContentDescription(context.getString(i2, objArr).trim());
                }
                bVar.b.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                bVar.a(b.a.a);
                bVar.b.setEnabled(Chip.this.isEnabled());
                return;
            }
            bVar.b.setContentDescription(charSequence);
            bVar.b.setBoundsInParent(Chip.y);
        }

        public void j(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.i2 = z;
                chip.refreshDrawableState();
            }
        }

        public int n(float f, float f2) {
            Chip chip = Chip.this;
            int i = Chip.x;
            return (!chip.e() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0119, code lost:
        r4 = r1.getResourceId(r4, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            int r8 = com.google.android.material.R.attr.chipStyle
            int r9 = x
            r1 = r18
            android.content.Context r1 = i0.h.a.c.a0.a.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.n2 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.o2 = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.p2 = r1
            android.content.Context r10 = r17.getContext()
            r11 = 1
            r12 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0031
            goto L_0x0091
        L_0x0031:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0042:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x035f
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0357
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0351
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x034b
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x0343
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0343
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0343
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0343
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r12)
            if (r1 == r12) goto L_0x0091
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0091:
            i0.h.a.c.j.b r13 = new i0.h.a.c.j.b
            r13.<init>(r10, r7, r8, r9)
            android.content.Context r1 = r13.a3
            int[] r14 = com.google.android.material.R.styleable.Chip
            r15 = 0
            int[] r6 = new int[r15]
            r2 = r19
            r3 = r14
            r4 = r8
            r5 = r9
            android.content.res.TypedArray r1 = i0.h.a.c.q.j.d(r1, r2, r3, r4, r5, r6)
            int r6 = com.google.android.material.R.styleable.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r6)
            r13.B3 = r2
            android.content.Context r2 = r13.a3
            int r3 = com.google.android.material.R.styleable.Chip_chipSurfaceColor
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.M(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.t2
            if (r3 == r2) goto L_0x00c3
            r13.t2 = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00c3:
            android.content.Context r2 = r13.a3
            int r3 = com.google.android.material.R.styleable.Chip_chipBackgroundColor
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.M(r2, r1, r3)
            r13.T(r2)
            int r2 = com.google.android.material.R.styleable.Chip_chipMinHeight
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r13.a0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_chipCornerRadius
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00e7
            float r2 = r1.getDimension(r2, r3)
            r13.U(r2)
        L_0x00e7:
            android.content.Context r2 = r13.a3
            int r4 = com.google.android.material.R.styleable.Chip_chipStrokeColor
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.M(r2, r1, r4)
            r13.c0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_chipStrokeWidth
            float r2 = r1.getDimension(r2, r3)
            r13.d0(r2)
            android.content.Context r2 = r13.a3
            int r4 = com.google.android.material.R.styleable.Chip_rippleColor
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.M(r2, r1, r4)
            r13.n0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_android_text
            java.lang.CharSequence r2 = r1.getText(r2)
            r13.o0(r2)
            android.content.Context r2 = r13.a3
            int r4 = com.google.android.material.R.styleable.Chip_android_textAppearance
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x0125
            int r4 = r1.getResourceId(r4, r15)
            if (r4 == 0) goto L_0x0125
            i0.h.a.c.t.b r5 = new i0.h.a.c.t.b
            r5.<init>(r2, r4)
            goto L_0x0126
        L_0x0125:
            r5 = 0
        L_0x0126:
            int r2 = com.google.android.material.R.styleable.Chip_android_textSize
            float r4 = r5.k
            float r2 = r1.getDimension(r2, r4)
            r5.k = r2
            i0.h.a.c.q.h r2 = r13.g3
            android.content.Context r4 = r13.a3
            r2.b(r5, r4)
            int r2 = com.google.android.material.R.styleable.Chip_android_ellipsize
            int r2 = r1.getInt(r2, r15)
            if (r2 == r11) goto L_0x0150
            r4 = 2
            if (r2 == r4) goto L_0x014b
            r4 = 3
            if (r2 == r4) goto L_0x0146
            goto L_0x0154
        L_0x0146:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r13.y3 = r2
            goto L_0x0154
        L_0x014b:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r13.y3 = r2
            goto L_0x0154
        L_0x0150:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r13.y3 = r2
        L_0x0154:
            int r2 = com.google.android.material.R.styleable.Chip_chipIconVisible
            boolean r2 = r1.getBoolean(r2, r15)
            r13.Z(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x017a
            java.lang.String r4 = "chipIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x017a
            java.lang.String r4 = "chipIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x017a
            int r4 = com.google.android.material.R.styleable.Chip_chipIconEnabled
            boolean r4 = r1.getBoolean(r4, r15)
            r13.Z(r4)
        L_0x017a:
            android.content.Context r4 = r13.a3
            int r5 = com.google.android.material.R.styleable.Chip_chipIcon
            android.graphics.drawable.Drawable r4 = i0.h.a.b.c.m.b.P(r4, r1, r5)
            r13.W(r4)
            int r4 = com.google.android.material.R.styleable.Chip_chipIconTint
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x0196
            android.content.Context r5 = r13.a3
            android.content.res.ColorStateList r4 = i0.h.a.b.c.m.b.M(r5, r1, r4)
            r13.Y(r4)
        L_0x0196:
            int r4 = com.google.android.material.R.styleable.Chip_chipIconSize
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.getDimension(r4, r5)
            r13.X(r4)
            int r4 = com.google.android.material.R.styleable.Chip_closeIconVisible
            boolean r4 = r1.getBoolean(r4, r15)
            r13.k0(r4)
            if (r7 == 0) goto L_0x01c5
            java.lang.String r4 = "closeIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x01c5
            java.lang.String r4 = "closeIconVisible"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 != 0) goto L_0x01c5
            int r4 = com.google.android.material.R.styleable.Chip_closeIconEnabled
            boolean r4 = r1.getBoolean(r4, r15)
            r13.k0(r4)
        L_0x01c5:
            android.content.Context r4 = r13.a3
            int r5 = com.google.android.material.R.styleable.Chip_closeIcon
            android.graphics.drawable.Drawable r4 = i0.h.a.b.c.m.b.P(r4, r1, r5)
            r13.e0(r4)
            android.content.Context r4 = r13.a3
            int r5 = com.google.android.material.R.styleable.Chip_closeIconTint
            android.content.res.ColorStateList r4 = i0.h.a.b.c.m.b.M(r4, r1, r5)
            r13.j0(r4)
            int r4 = com.google.android.material.R.styleable.Chip_closeIconSize
            float r4 = r1.getDimension(r4, r3)
            r13.g0(r4)
            int r4 = com.google.android.material.R.styleable.Chip_android_checkable
            boolean r4 = r1.getBoolean(r4, r15)
            r13.P(r4)
            int r4 = com.google.android.material.R.styleable.Chip_checkedIconVisible
            boolean r4 = r1.getBoolean(r4, r15)
            r13.S(r4)
            if (r7 == 0) goto L_0x0211
            java.lang.String r4 = "checkedIconEnabled"
            java.lang.String r4 = r7.getAttributeValue(r2, r4)
            if (r4 == 0) goto L_0x0211
            java.lang.String r4 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r4)
            if (r2 != 0) goto L_0x0211
            int r2 = com.google.android.material.R.styleable.Chip_checkedIconEnabled
            boolean r2 = r1.getBoolean(r2, r15)
            r13.S(r2)
        L_0x0211:
            android.content.Context r2 = r13.a3
            int r4 = com.google.android.material.R.styleable.Chip_checkedIcon
            android.graphics.drawable.Drawable r2 = i0.h.a.b.c.m.b.P(r2, r1, r4)
            r13.Q(r2)
            int r2 = com.google.android.material.R.styleable.Chip_checkedIconTint
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x022d
            android.content.Context r4 = r13.a3
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.M(r4, r1, r2)
            r13.R(r2)
        L_0x022d:
            android.content.Context r2 = r13.a3
            int r4 = com.google.android.material.R.styleable.Chip_showMotionSpec
            i0.h.a.c.a.g r2 = i0.h.a.c.a.g.a(r2, r1, r4)
            r13.Q2 = r2
            android.content.Context r2 = r13.a3
            int r4 = com.google.android.material.R.styleable.Chip_hideMotionSpec
            i0.h.a.c.a.g r2 = i0.h.a.c.a.g.a(r2, r1, r4)
            r13.R2 = r2
            int r2 = com.google.android.material.R.styleable.Chip_chipStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.b0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_iconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.m0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_iconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.l0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_textStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.q0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_textEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.p0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_closeIconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.h0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_closeIconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.f0(r2)
            int r2 = com.google.android.material.R.styleable.Chip_chipEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.V(r2)
            int r2 = com.google.android.material.R.styleable.Chip_android_maxWidth
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r13.A3 = r2
            r1.recycle()
            int[] r5 = new int[r15]
            i0.h.a.c.q.j.a(r10, r7, r8, r9)
            r1 = r10
            r2 = r19
            r3 = r14
            r4 = r8
            r16 = r5
            r5 = r9
            r12 = r6
            r6 = r16
            i0.h.a.c.q.j.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r8, r9)
            int r2 = com.google.android.material.R.styleable.Chip_ensureMinTouchTargetSize
            boolean r2 = r1.getBoolean(r2, r15)
            r0.j2 = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = i0.h.a.b.c.m.b.E(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = com.google.android.material.R.styleable.Chip_chipMinTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.l2 = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            float r1 = r17.getElevation()
            r13.s(r1)
            int[] r6 = new int[r15]
            i0.h.a.c.q.j.a(r10, r7, r8, r9)
            r1 = r10
            r2 = r19
            r3 = r14
            i0.h.a.c.q.j.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r8, r9)
            boolean r2 = r1.hasValue(r12)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.m2 = r1
            r17.h()
            if (r2 != 0) goto L_0x030c
            i0.h.a.c.j.a r1 = new i0.h.a.c.j.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x030c:
            boolean r1 = r0.f2
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.A2
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.y3
            r0.setEllipsize(r1)
            r17.k()
            i0.h.a.c.j.b r1 = r0.a2
            boolean r1 = r1.z3
            if (r1 != 0) goto L_0x032a
            r0.setLines(r11)
            r0.setHorizontallyScrolling(r11)
        L_0x032a:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.j()
            boolean r1 = r0.j2
            if (r1 == 0) goto L_0x033c
            int r1 = r0.l2
            r0.setMinHeight(r1)
        L_0x033c:
            int r1 = r17.getLayoutDirection()
            r0.k2 = r1
            return
        L_0x0343:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x034b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0351:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0357:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x035f:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.o2.setEmpty();
        if (e() && this.d2 != null) {
            i0.h.a.c.j.b bVar = this.a2;
            bVar.G(bVar.getBounds(), this.o2);
        }
        return this.o2;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.n2.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.n2;
    }

    private i0.h.a.c.t.b getTextAppearance() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.g3.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.h2 != z) {
            this.h2 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.g2 != z) {
            this.g2 = z;
            refreshDrawableState();
        }
    }

    public void a() {
        d(this.l2);
        requestLayout();
        invalidateOutline();
    }

    public boolean d(int i) {
        this.l2 = i;
        int i3 = 0;
        if (!this.j2) {
            if (this.b2 != null) {
                g();
            } else {
                int[] iArr = i0.h.a.c.u.a.a;
                i();
            }
            return false;
        }
        int max = Math.max(0, i - ((int) this.a2.v2));
        int max2 = Math.max(0, i - this.a2.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i4 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i3 = max / 2;
            }
            int i5 = i3;
            if (this.b2 != null) {
                Rect rect = new Rect();
                this.b2.getPadding(rect);
                if (rect.top == i5 && rect.bottom == i5 && rect.left == i4 && rect.right == i4) {
                    int[] iArr2 = i0.h.a.c.u.a.a;
                    i();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            this.b2 = new InsetDrawable(this.a2, i4, i5, i4, i5);
            int[] iArr3 = i0.h.a.c.u.a.a;
            i();
            return true;
        }
        if (this.b2 != null) {
            g();
        } else {
            int[] iArr4 = i0.h.a.c.u.a.a;
            i();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.Class<h0.k.a.a> r0 = h0.k.a.a.class
            java.lang.String r1 = "Unable to send Accessibility Exit event"
            java.lang.String r2 = "Chip"
            int r3 = r11.getAction()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 10
            r6 = 1
            r7 = 0
            if (r3 != r5) goto L_0x005a
            java.lang.String r3 = "m"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r3.setAccessible(r6)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            com.google.android.material.chip.Chip$b r8 = r10.m2     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            int r3 = r3.intValue()     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            if (r3 == r4) goto L_0x005a
            java.lang.String r3 = "m"
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r8[r7] = r9     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r8)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r0.setAccessible(r6)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            com.google.android.material.chip.Chip$b r3 = r10.m2     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r8[r7] = r9     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r0.invoke(r3, r8)     // Catch:{ NoSuchMethodException -> 0x0056, IllegalAccessException -> 0x0051, InvocationTargetException -> 0x004c, NoSuchFieldException -> 0x0047 }
            r0 = r6
            goto L_0x005b
        L_0x0047:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
            goto L_0x005a
        L_0x004c:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
            goto L_0x005a
        L_0x0051:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            android.util.Log.e(r2, r1, r0)
        L_0x005a:
            r0 = r7
        L_0x005b:
            if (r0 != 0) goto L_0x00ba
            com.google.android.material.chip.Chip$b r0 = r10.m2
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x00af
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x0070
            goto L_0x00af
        L_0x0070:
            int r1 = r11.getAction()
            r2 = 7
            r3 = 256(0x100, float:3.59E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r1 == r2) goto L_0x0092
            r2 = 9
            if (r1 == r2) goto L_0x0092
            if (r1 == r5) goto L_0x0082
            goto L_0x00af
        L_0x0082:
            int r1 = r0.m
            if (r1 == r4) goto L_0x00af
            if (r1 != r4) goto L_0x0089
            goto L_0x00ad
        L_0x0089:
            r0.m = r4
            r0.l(r4, r8)
            r0.l(r1, r3)
            goto L_0x00ad
        L_0x0092:
            float r1 = r11.getX()
            float r2 = r11.getY()
            int r1 = r0.n(r1, r2)
            int r2 = r0.m
            if (r2 != r1) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            r0.m = r1
            r0.l(r1, r8)
            r0.l(r2, r3)
        L_0x00ab:
            if (r1 == r4) goto L_0x00af
        L_0x00ad:
            r0 = r6
            goto L_0x00b0
        L_0x00af:
            r0 = r7
        L_0x00b0:
            if (r0 != 0) goto L_0x00ba
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r6 = r7
        L_0x00ba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.m2;
        Objects.requireNonNull(bVar);
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i4 = 0;
                                while (i < repeatCount && bVar.e(i3, (Rect) null)) {
                                    i++;
                                    i4 = 1;
                                }
                                i = i4;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = bVar.l;
                    if (i5 != Integer.MIN_VALUE) {
                        bVar.g(i5, 16, (Bundle) null);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = bVar.e(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = bVar.e(1, (Rect) null);
            }
        }
        if (i == 0 || this.m2.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        i0.h.a.c.j.b bVar = this.a2;
        int i = 0;
        if (bVar != null && i0.h.a.c.j.b.M(bVar.H2)) {
            i0.h.a.c.j.b bVar2 = this.a2;
            int isEnabled = isEnabled();
            if (this.i2) {
                isEnabled++;
            }
            if (this.h2) {
                isEnabled++;
            }
            if (this.g2) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.i2) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.h2) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.g2) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            i = bVar2.i0(iArr);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public final boolean e() {
        i0.h.a.c.j.b bVar = this.a2;
        return (bVar == null || bVar.J() == null) ? false : true;
    }

    public boolean f() {
        i0.h.a.c.j.b bVar = this.a2;
        return bVar != null && bVar.M2;
    }

    public final void g() {
        if (this.b2 != null) {
            this.b2 = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = i0.h.a.c.u.a.a;
            i();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.b2;
        return insetDrawable == null ? this.a2 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.O2;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.P2;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.u2;
        }
        return null;
    }

    public float getChipCornerRadius() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return Math.max(0.0f, bVar.I());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.a2;
    }

    public float getChipEndPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.Z2;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar == null || (drawable = bVar.C2) == null) {
            return null;
        }
        return g0.a.b.b.a.D0(drawable);
    }

    public float getChipIconSize() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.E2;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.D2;
        }
        return null;
    }

    public float getChipMinHeight() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.v2;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.S2;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.x2;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.y2;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.J();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.L2;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.Y2;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.K2;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.X2;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.J2;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.y3;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        b bVar = this.m2;
        if (bVar.l == 1 || bVar.k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public i0.h.a.c.a.g getHideMotionSpec() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.R2;
        }
        return null;
    }

    public float getIconEndPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.U2;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.T2;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.z2;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.a2.q.a;
    }

    public i0.h.a.c.a.g getShowMotionSpec() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.Q2;
        }
        return null;
    }

    public float getTextEndPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.W2;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            return bVar.V2;
        }
        return 0.0f;
    }

    public final void h() {
        if (e()) {
            i0.h.a.c.j.b bVar = this.a2;
            if ((bVar != null && bVar.G2) && this.d2 != null) {
                q.p(this, this.m2);
                return;
            }
        }
        q.p(this, (h0.i.i.a) null);
    }

    public final void i() {
        this.c2 = new RippleDrawable(i0.h.a.c.u.a.b(this.a2.z2), getBackgroundDrawable(), (Drawable) null);
        this.a2.r0(false);
        RippleDrawable rippleDrawable = this.c2;
        AtomicInteger atomicInteger = q.a;
        setBackground(rippleDrawable);
        j();
    }

    public final void j() {
        i0.h.a.c.j.b bVar;
        if (!TextUtils.isEmpty(getText()) && (bVar = this.a2) != null) {
            int H = (int) (bVar.H() + bVar.Z2 + bVar.W2);
            i0.h.a.c.j.b bVar2 = this.a2;
            int E = (int) (bVar2.E() + bVar2.S2 + bVar2.V2);
            if (this.b2 != null) {
                Rect rect = new Rect();
                this.b2.getPadding(rect);
                E += rect.left;
                H += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            AtomicInteger atomicInteger = q.a;
            setPaddingRelative(E, paddingTop, H, paddingBottom);
        }
    }

    public final void k() {
        TextPaint paint = getPaint();
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        i0.h.a.c.t.b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(getContext(), paint, this.p2);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i0.h.a.b.c.m.b.m0(this, this.a2);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, Y1);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, Z1);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        b bVar = this.m2;
        int i3 = bVar.l;
        if (i3 != Integer.MIN_VALUE) {
            bVar.b(i3);
        }
        if (z) {
            bVar.e(i, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (f() || isClickable()) {
            accessibilityNodeInfo.setClassName(f() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i3 = -1;
            if (chipGroup.q) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= chipGroup.getChildCount()) {
                        i5 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i4) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i4)) == this) {
                            break;
                        }
                        i5++;
                    }
                    i4++;
                }
                i = i5;
            } else {
                i = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i3 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(i3, 1, i, 1, false, isChecked()).a);
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.k2 != i) {
            this.k2 = i;
            j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.g2
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r2)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.g2
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.d2
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.m2
            r0.l(r3, r3)
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            r5.setCloseIconPressed(r2)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r3)
        L_0x004a:
            r0 = r3
            goto L_0x004d
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 != 0) goto L_0x0055
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.c2) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.c2) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.P(z);
        }
    }

    public void setCheckableResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.P(bVar.a3.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar == null) {
            this.f2 = z;
        } else if (bVar.M2) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.e2) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.Q(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.Q(h0.b.b.a.a.a(bVar.a3, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.R(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            Context context = bVar.a3;
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            bVar.R(context.getColorStateList(i));
        }
    }

    public void setCheckedIconVisible(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.S(bVar.a3.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null && bVar.u2 != colorStateList) {
            bVar.u2 = colorStateList;
            bVar.onStateChange(bVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            Context context = bVar.a3;
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            bVar.T(context.getColorStateList(i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.U(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.U(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(i0.h.a.c.j.b bVar) {
        i0.h.a.c.j.b bVar2 = this.a2;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.x3 = new WeakReference<>((Object) null);
            }
            this.a2 = bVar;
            bVar.z3 = false;
            Objects.requireNonNull(bVar);
            bVar.x3 = new WeakReference<>(this);
            d(this.l2);
        }
    }

    public void setChipEndPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null && bVar.Z2 != f) {
            bVar.Z2 = f;
            bVar.invalidateSelf();
            bVar.N();
        }
    }

    public void setChipEndPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.V(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.W(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.W(h0.b.b.a.a.a(bVar.a3, i));
        }
    }

    public void setChipIconSize(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.X(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.X(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.Y(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            Context context = bVar.a3;
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            bVar.Y(context.getColorStateList(i));
        }
    }

    public void setChipIconVisible(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.Z(bVar.a3.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null && bVar.v2 != f) {
            bVar.v2 = f;
            bVar.invalidateSelf();
            bVar.N();
        }
    }

    public void setChipMinHeightResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.a0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null && bVar.S2 != f) {
            bVar.S2 = f;
            bVar.invalidateSelf();
            bVar.N();
        }
    }

    public void setChipStartPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.b0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.c0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            Context context = bVar.a3;
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            bVar.c0(context.getColorStateList(i));
        }
    }

    public void setChipStrokeWidth(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.d0(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.d0(bVar.a3.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.e0(drawable);
        }
        h();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null && bVar.L2 != charSequence) {
            h0.i.g.a c = h0.i.g.a.c();
            bVar.L2 = c.e(charSequence, c.h, true);
            bVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.f0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.f0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.e0(h0.b.b.a.a.a(bVar.a3, i));
        }
        h();
    }

    public void setCloseIconSize(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.g0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.g0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.h0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.h0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.j0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            Context context = bVar.a3;
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            bVar.j0(context.getColorStateList(i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i3, int i4, int i5) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i3, int i4, int i5) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            g.b bVar2 = bVar.q;
            if (bVar2.o != f) {
                bVar2.o = f;
                bVar.B();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.a2 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                i0.h.a.c.j.b bVar = this.a2;
                if (bVar != null) {
                    bVar.y3 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.j2 = z;
        d(this.l2);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(i0.h.a.c.a.g gVar) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.R2 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.R2 = i0.h.a.c.a.g.b(bVar.a3, i);
        }
    }

    public void setIconEndPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.l0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.l0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.m0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.m0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.a2 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.A3 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.e2 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.d2 = onClickListener;
        h();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.n0(colorStateList);
        }
        if (!this.a2.v3) {
            i();
        }
    }

    public void setRippleColorResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            Context context = bVar.a3;
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            bVar.n0(context.getColorStateList(i));
            if (!this.a2.v3) {
                i();
            }
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        i0.h.a.c.j.b bVar = this.a2;
        bVar.q.a = kVar;
        bVar.invalidateSelf();
    }

    public void setShowMotionSpec(i0.h.a.c.a.g gVar) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.Q2 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.Q2 = i0.h.a.c.a.g.b(bVar.a3, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(bVar.z3 ? null : charSequence, bufferType);
            i0.h.a.c.j.b bVar2 = this.a2;
            if (bVar2 != null) {
                bVar2.o0(charSequence);
            }
        }
    }

    public void setTextAppearance(i0.h.a.c.t.b bVar) {
        i0.h.a.c.j.b bVar2 = this.a2;
        if (bVar2 != null) {
            bVar2.g3.b(bVar, bVar2.a3);
        }
        k();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null && bVar.W2 != f) {
            bVar.W2 = f;
            bVar.invalidateSelf();
            bVar.N();
        }
    }

    public void setTextEndPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.p0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null && bVar.V2 != f) {
            bVar.V2 = f;
            bVar.invalidateSelf();
            bVar.N();
        }
    }

    public void setTextStartPaddingResource(int i) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.q0(bVar.a3.getResources().getDimension(i));
        }
    }

    public void setCloseIconVisible(boolean z) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.k0(z);
        }
        h();
    }

    public void setCheckedIconVisible(boolean z) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.S(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.Z(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.g3.b(new i0.h.a.c.t.b(bVar.a3, i), bVar.a3);
        }
        k();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        i0.h.a.c.j.b bVar = this.a2;
        if (bVar != null) {
            bVar.g3.b(new i0.h.a.c.t.b(bVar.a3, i), bVar.a3);
        }
        k();
    }
}
