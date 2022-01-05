package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import h0.b.f.b0;
import h0.b.f.c1;
import h0.b.f.v;
import h0.i.i.q;
import h0.i.i.t;
import java.util.concurrent.atomic.AtomicInteger;

public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> c = new a(Float.class, "thumbPos");
    public static final int[] d = {16842912};
    public final TextPaint A2;
    public ColorStateList B2;
    public Layout C2;
    public Layout D2;
    public TransformationMethod E2;
    public ObjectAnimator F2;
    public final v G2;
    public final Rect H2;
    public boolean Y1;
    public boolean Z1;
    public Drawable a2;
    public ColorStateList b2;
    public PorterDuff.Mode c2;
    public boolean d2;
    public boolean e2;
    public int f2;
    public int g2;
    public int h2;
    public boolean i2;
    public CharSequence j2;
    public CharSequence k2;
    public boolean l2;
    public int m2;
    public int n2;
    public float o2;
    public float p2;
    public Drawable q;
    public VelocityTracker q2;
    public int r2;
    public float s2;
    public int t2;
    public int u2;
    public int v2;
    public int w2;
    public ColorStateList x;
    public int x2;
    public PorterDuff.Mode y;
    public int y2;
    public int z2;

    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).s2);
        }

        public void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    private boolean getTargetCheckedState() {
        return this.s2 > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (c1.b(this)) {
            f = 1.0f - this.s2;
        } else {
            f = this.s2;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.a2;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.H2;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            rect = b0.b(drawable2);
        } else {
            rect = b0.c;
        }
        return ((((this.t2 - this.v2) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public final void a() {
        Drawable drawable = this.q;
        if (drawable == null) {
            return;
        }
        if (this.Y1 || this.Z1) {
            Drawable mutate = drawable.mutate();
            this.q = mutate;
            if (this.Y1) {
                mutate.setTintList(this.x);
            }
            if (this.Z1) {
                this.q.setTintMode(this.y);
            }
            if (this.q.isStateful()) {
                this.q.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.a2;
        if (drawable == null) {
            return;
        }
        if (this.d2 || this.e2) {
            Drawable mutate = drawable.mutate();
            this.a2 = mutate;
            if (this.d2) {
                mutate.setTintList(this.b2);
            }
            if (this.e2) {
                this.a2.setTintMode(this.c2);
            }
            if (this.a2.isStateful()) {
                this.a2.setState(getDrawableState());
            }
        }
    }

    public final Layout c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.E2;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.A2;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.k2;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            AtomicInteger atomicInteger = q.a;
            new t(androidx.core.R.id.tag_state_description, CharSequence.class, 64, 30).e(this, obj);
        }
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i3;
        Rect rect2 = this.H2;
        int i4 = this.w2;
        int i5 = this.x2;
        int i6 = this.y2;
        int i7 = this.z2;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.q;
        if (drawable != null) {
            rect = b0.b(drawable);
        } else {
            rect = b0.c;
        }
        Drawable drawable2 = this.a2;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i8 = rect2.left;
            thumbOffset += i8;
            if (rect != null) {
                int i9 = rect.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                i = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.a2.setBounds(i4, i, i6, i3);
                }
            } else {
                i = i5;
            }
            i3 = i7;
            this.a2.setBounds(i4, i, i6, i3);
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i16 = thumbOffset - rect2.left;
            int i17 = thumbOffset + this.v2 + rect2.right;
            this.q.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f3) {
        super.drawableHotspotChanged(f, f3);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setHotspot(f, f3);
        }
        Drawable drawable2 = this.a2;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.a2;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.j2;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            AtomicInteger atomicInteger = q.a;
            new t(androidx.core.R.id.tag_state_description, CharSequence.class, 64, 30).e(this, obj);
        }
    }

    public int getCompoundPaddingLeft() {
        if (!c1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.t2;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.h2 : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (c1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.t2;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.h2 : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.l2;
    }

    public boolean getSplitTrack() {
        return this.i2;
    }

    public int getSwitchMinWidth() {
        return this.g2;
    }

    public int getSwitchPadding() {
        return this.h2;
    }

    public CharSequence getTextOff() {
        return this.k2;
    }

    public CharSequence getTextOn() {
        return this.j2;
    }

    public Drawable getThumbDrawable() {
        return this.q;
    }

    public int getThumbTextPadding() {
        return this.f2;
    }

    public ColorStateList getThumbTintList() {
        return this.x;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.y;
    }

    public Drawable getTrackDrawable() {
        return this.a2;
    }

    public ColorStateList getTrackTintList() {
        return this.b2;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.c2;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.a2;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.F2;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.F2.end();
            this.F2 = null;
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.H2;
        Drawable drawable = this.a2;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.x2;
        int i4 = this.z2;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.q;
        if (drawable != null) {
            if (!this.i2 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b = b0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.C2 : this.D2;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.B2;
            if (colorStateList != null) {
                this.A2.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A2.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.j2 : this.k2;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i3, i4, i5);
        int i11 = 0;
        if (this.q != null) {
            Rect rect = this.H2;
            Drawable drawable = this.a2;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = b0.b(this.q);
            i6 = Math.max(0, b.left - rect.left);
            i11 = Math.max(0, b.right - rect.right);
        } else {
            i6 = 0;
        }
        if (c1.b(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.t2 + i8) - i6) - i11;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i11;
            i8 = (i7 - this.t2) + i6 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i12 = this.u2;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i12 / 2);
            int i13 = height;
            i9 = i12 + height;
            i10 = i13;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.u2 + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.u2;
        }
        this.w2 = i8;
        this.x2 = i10;
        this.z2 = i9;
        this.y2 = i7;
    }

    public void onMeasure(int i, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.l2) {
            if (this.C2 == null) {
                this.C2 = c(this.j2);
            }
            if (this.D2 == null) {
                this.D2 = c(this.k2);
            }
        }
        Rect rect = this.H2;
        Drawable drawable = this.q;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.q.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.q.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (this.l2) {
            i6 = (this.f2 * 2) + Math.max(this.C2.getWidth(), this.D2.getWidth());
        } else {
            i6 = 0;
        }
        this.v2 = Math.max(i6, i5);
        Drawable drawable2 = this.a2;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.a2.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            Rect b = b0.b(drawable3);
            i8 = Math.max(i8, b.left);
            i9 = Math.max(i9, b.right);
        }
        int max = Math.max(this.g2, (this.v2 * 2) + i8 + i9);
        int max2 = Math.max(i7, i4);
        this.t2 = max;
        this.u2 = max2;
        super.onMeasure(i, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.j2 : this.k2;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.q2
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00fd
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L_0x0090
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0090
            goto L_0x0150
        L_0x0018:
            int r0 = r10.m2
            if (r0 == r2) goto L_0x005c
            if (r0 == r5) goto L_0x0020
            goto L_0x0150
        L_0x0020:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.o2
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003c
        L_0x0033:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r1 = r3
            goto L_0x003c
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L_0x003c:
            boolean r0 = h0.b.f.c1.b(r10)
            if (r0 == 0) goto L_0x0043
            float r1 = -r1
        L_0x0043:
            float r0 = r10.s2
            float r1 = r1 + r0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            r4 = r3
            goto L_0x0052
        L_0x0051:
            r4 = r1
        L_0x0052:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            r10.o2 = r11
            r10.setThumbPosition(r4)
        L_0x005b:
            return r2
        L_0x005c:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.o2
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.n2
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0082
            float r3 = r10.p2
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.n2
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0150
        L_0x0082:
            r10.m2 = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.o2 = r0
            r10.p2 = r1
            return r2
        L_0x0090:
            int r0 = r10.m2
            if (r0 != r5) goto L_0x00f5
            r10.m2 = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto L_0x00a4
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00a4
            r0 = r2
            goto L_0x00a5
        L_0x00a4:
            r0 = r1
        L_0x00a5:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto L_0x00db
            android.view.VelocityTracker r0 = r10.q2
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.q2
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.r2
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            boolean r6 = h0.b.f.c1.b(r10)
            if (r6 == 0) goto L_0x00ce
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d4
            goto L_0x00d2
        L_0x00ce:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d4
        L_0x00d2:
            r0 = r2
            goto L_0x00dc
        L_0x00d4:
            r0 = r1
            goto L_0x00dc
        L_0x00d6:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00dc
        L_0x00db:
            r0 = r5
        L_0x00dc:
            if (r0 == r5) goto L_0x00e1
            r10.playSoundEffect(r1)
        L_0x00e1:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        L_0x00f5:
            r10.m2 = r1
            android.view.VelocityTracker r0 = r10.q2
            r0.clear()
            goto L_0x0150
        L_0x00fd:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L_0x0150
            android.graphics.drawable.Drawable r4 = r10.q
            if (r4 != 0) goto L_0x0110
            goto L_0x0148
        L_0x0110:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.q
            android.graphics.Rect r6 = r10.H2
            r5.getPadding(r6)
            int r5 = r10.x2
            int r6 = r10.n2
            int r5 = r5 - r6
            int r7 = r10.w2
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.v2
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.H2
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.z2
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0148
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0148
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0148
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0148
            r1 = r2
        L_0x0148:
            if (r1 == 0) goto L_0x0150
            r10.m2 = r2
            r10.o2 = r0
            r10.p2 = r3
        L_0x0150:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            e();
        } else {
            d();
        }
        float f = 1.0f;
        if (getWindowToken() != null) {
            AtomicInteger atomicInteger = q.a;
            if (isLaidOut()) {
                if (!isChecked) {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c, new float[]{f});
                this.F2 = ofFloat;
                ofFloat.setDuration(250);
                this.F2.setAutoCancel(true);
                this.F2.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.F2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g0.a.b.b.a.G0(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.l2 != z) {
            this.l2 = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.i2 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.g2 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.h2 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.A2.getTypeface() != null && !this.A2.getTypeface().equals(typeface)) || (this.A2.getTypeface() == null && typeface != null)) {
            this.A2.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.k2 = charSequence;
        requestLayout();
        if (!isChecked()) {
            d();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.j2 = charSequence;
        requestLayout();
        if (isChecked()) {
            e();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.s2 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(h0.b.b.a.a.a(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f2 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.x = colorStateList;
        this.Y1 = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.y = mode;
        this.Z1 = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.a2;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.a2 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(h0.b.b.a.a.a(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.b2 = colorStateList;
        this.d2 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.c2 = mode;
        this.e2 = true;
        b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q || drawable == this.a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0129, code lost:
        if (r3 != null) goto L_0x0130;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r18.<init>(r19, r20, r21)
            r11 = 0
            r7.x = r11
            r7.y = r11
            r12 = 0
            r7.Y1 = r12
            r7.Z1 = r12
            r7.b2 = r11
            r7.c2 = r11
            r7.d2 = r12
            r7.e2 = r12
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.q2 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.H2 = r0
            android.content.Context r0 = r18.getContext()
            h0.b.f.r0.a(r7, r0)
            android.text.TextPaint r13 = new android.text.TextPaint
            r14 = 1
            r13.<init>(r14)
            r7.A2 = r13
            android.content.res.Resources r0 = r18.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r13.density = r0
            int[] r2 = androidx.appcompat.R.styleable.SwitchCompat
            h0.b.f.w0 r15 = new h0.b.f.w0
            android.content.res.TypedArray r6 = r8.obtainStyledAttributes(r9, r2, r10, r12)
            r15.<init>(r8, r6)
            r16 = 0
            r0 = r18
            r1 = r19
            r3 = r20
            r4 = r6
            r5 = r21
            r17 = r6
            r6 = r16
            h0.i.i.q.o(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_android_thumb
            android.graphics.drawable.Drawable r0 = r15.g(r0)
            r7.q = r0
            if (r0 == 0) goto L_0x006f
            r0.setCallback(r7)
        L_0x006f:
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_track
            android.graphics.drawable.Drawable r0 = r15.g(r0)
            r7.a2 = r0
            if (r0 == 0) goto L_0x007c
            r0.setCallback(r7)
        L_0x007c:
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_android_textOn
            java.lang.CharSequence r0 = r15.n(r0)
            r7.j2 = r0
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_android_textOff
            java.lang.CharSequence r0 = r15.n(r0)
            r7.k2 = r0
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_showText
            boolean r0 = r15.a(r0, r14)
            r7.l2 = r0
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_thumbTextPadding
            int r0 = r15.f(r0, r12)
            r7.f2 = r0
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_switchMinWidth
            int r0 = r15.f(r0, r12)
            r7.g2 = r0
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_switchPadding
            int r0 = r15.f(r0, r12)
            r7.h2 = r0
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_splitTrack
            boolean r0 = r15.a(r0, r12)
            r7.i2 = r0
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_thumbTint
            android.content.res.ColorStateList r0 = r15.c(r0)
            if (r0 == 0) goto L_0x00c0
            r7.x = r0
            r7.Y1 = r14
        L_0x00c0:
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_thumbTintMode
            r1 = -1
            int r0 = r15.j(r0, r1)
            android.graphics.PorterDuff$Mode r0 = h0.b.f.b0.c(r0, r11)
            android.graphics.PorterDuff$Mode r2 = r7.y
            if (r2 == r0) goto L_0x00d3
            r7.y = r0
            r7.Z1 = r14
        L_0x00d3:
            boolean r0 = r7.Y1
            if (r0 != 0) goto L_0x00db
            boolean r0 = r7.Z1
            if (r0 == 0) goto L_0x00de
        L_0x00db:
            r18.a()
        L_0x00de:
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_trackTint
            android.content.res.ColorStateList r0 = r15.c(r0)
            if (r0 == 0) goto L_0x00ea
            r7.b2 = r0
            r7.d2 = r14
        L_0x00ea:
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_trackTintMode
            int r0 = r15.j(r0, r1)
            android.graphics.PorterDuff$Mode r0 = h0.b.f.b0.c(r0, r11)
            android.graphics.PorterDuff$Mode r2 = r7.c2
            if (r2 == r0) goto L_0x00fc
            r7.c2 = r0
            r7.e2 = r14
        L_0x00fc:
            boolean r0 = r7.d2
            if (r0 != 0) goto L_0x0104
            boolean r0 = r7.e2
            if (r0 == 0) goto L_0x0107
        L_0x0104:
            r18.b()
        L_0x0107:
            int r0 = androidx.appcompat.R.styleable.SwitchCompat_switchTextAppearance
            int r0 = r15.l(r0, r12)
            if (r0 == 0) goto L_0x01bf
            int[] r2 = androidx.appcompat.R.styleable.TextAppearance
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r0, r2)
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_textColor
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x012c
            int r3 = r0.getResourceId(r2, r12)
            if (r3 == 0) goto L_0x012c
            java.lang.ThreadLocal<android.util.TypedValue> r4 = h0.b.b.a.a.a
            android.content.res.ColorStateList r3 = r8.getColorStateList(r3)
            if (r3 == 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r2)
        L_0x0130:
            if (r3 == 0) goto L_0x0135
            r7.B2 = r3
            goto L_0x013b
        L_0x0135:
            android.content.res.ColorStateList r2 = r18.getTextColors()
            r7.B2 = r2
        L_0x013b:
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            int r2 = r0.getDimensionPixelSize(r2, r12)
            if (r2 == 0) goto L_0x0152
            float r2 = (float) r2
            float r3 = r13.getTextSize()
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0152
            r13.setTextSize(r2)
            r18.requestLayout()
        L_0x0152:
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            int r2 = r0.getInt(r2, r1)
            int r3 = androidx.appcompat.R.styleable.TextAppearance_android_textStyle
            int r1 = r0.getInt(r3, r1)
            r3 = 2
            if (r2 == r14) goto L_0x016e
            if (r2 == r3) goto L_0x016b
            r4 = 3
            if (r2 == r4) goto L_0x0168
            r2 = r11
            goto L_0x0170
        L_0x0168:
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            goto L_0x0170
        L_0x016b:
            android.graphics.Typeface r2 = android.graphics.Typeface.SERIF
            goto L_0x0170
        L_0x016e:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
        L_0x0170:
            r4 = 0
            if (r1 <= 0) goto L_0x019d
            if (r2 != 0) goto L_0x017a
            android.graphics.Typeface r2 = android.graphics.Typeface.defaultFromStyle(r1)
            goto L_0x017e
        L_0x017a:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r1)
        L_0x017e:
            r7.setSwitchTypeface(r2)
            if (r2 == 0) goto L_0x0188
            int r2 = r2.getStyle()
            goto L_0x0189
        L_0x0188:
            r2 = r12
        L_0x0189:
            int r2 = ~r2
            r1 = r1 & r2
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r14 = r12
        L_0x0191:
            r13.setFakeBoldText(r14)
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0199
            r4 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0199:
            r13.setTextSkewX(r4)
            goto L_0x01a6
        L_0x019d:
            r13.setFakeBoldText(r12)
            r13.setTextSkewX(r4)
            r7.setSwitchTypeface(r2)
        L_0x01a6:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r1 = r0.getBoolean(r1, r12)
            if (r1 == 0) goto L_0x01ba
            h0.b.d.a r1 = new h0.b.d.a
            android.content.Context r2 = r18.getContext()
            r1.<init>(r2)
            r7.E2 = r1
            goto L_0x01bc
        L_0x01ba:
            r7.E2 = r11
        L_0x01bc:
            r0.recycle()
        L_0x01bf:
            h0.b.f.v r0 = new h0.b.f.v
            r0.<init>(r7)
            r7.G2 = r0
            r0.e(r9, r10)
            r17.recycle()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r19)
            int r1 = r0.getScaledTouchSlop()
            r7.n2 = r1
            int r0 = r0.getScaledMinimumFlingVelocity()
            r7.r2 = r0
            r18.refreshDrawableState()
            boolean r0 = r18.isChecked()
            r7.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
