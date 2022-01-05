package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import h0.b.f.f;
import h0.i.i.q;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import i0.h.a.c.w.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class MaterialButton extends f implements Checkable, o {
    private static final int[] CHECKABLE_STATE_SET = {16842911};
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Button;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final i0.h.a.c.h.a materialButtonHelper;
    private final LinkedHashSet<a> onCheckedChangeListeners;
    private b onPressedChangeListenerInternal;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean q;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.q ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                SavedState.class.getClassLoader();
            }
            this.q = parcel.readInt() != 1 ? false : true;
        }
    }

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private String getA11yClassName() {
        return (isCheckable() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private boolean isIconEnd() {
        int i = this.iconGravity;
        return i == 3 || i == 4;
    }

    private boolean isIconStart() {
        int i = this.iconGravity;
        return i == 1 || i == 2;
    }

    private boolean isIconTop() {
        int i = this.iconGravity;
        return i == 16 || i == 32;
    }

    private boolean isLayoutRTL() {
        AtomicInteger atomicInteger = q.a;
        return getLayoutDirection() == 1;
    }

    private boolean isUsingOriginalBackground() {
        i0.h.a.c.h.a aVar = this.materialButtonHelper;
        return aVar != null && !aVar.o;
    }

    private void resetIconDrawable() {
        if (isIconStart()) {
            setCompoundDrawablesRelative(this.icon, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (isIconEnd()) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.icon, (Drawable) null);
        } else if (isIconTop()) {
            setCompoundDrawablesRelative((Drawable) null, this.icon, (Drawable) null, (Drawable) null);
        }
    }

    private void updateIcon(boolean z) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.icon = mutate;
            mutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int i = this.iconSize;
            if (i == 0) {
                i = this.icon.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i3 = this.iconLeft;
            int i4 = this.iconTop;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            resetIconDrawable();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = false;
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((isIconStart() && drawable3 != this.icon) || ((isIconEnd() && drawable5 != this.icon) || (isIconTop() && drawable4 != this.icon))) {
            z2 = true;
        }
        if (z2) {
            resetIconDrawable();
        }
    }

    private void updateIconPosition(int i, int i2) {
        if (this.icon != null && getLayout() != null) {
            if (isIconStart() || isIconEnd()) {
                this.iconTop = 0;
                int i3 = this.iconGravity;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.iconLeft = 0;
                    updateIcon(false);
                    return;
                }
                int i4 = this.iconSize;
                if (i4 == 0) {
                    i4 = this.icon.getIntrinsicWidth();
                }
                int textWidth = i - getTextWidth();
                AtomicInteger atomicInteger = q.a;
                int paddingEnd = ((((textWidth - getPaddingEnd()) - i4) - this.iconPadding) - getPaddingStart()) / 2;
                boolean isLayoutRTL = isLayoutRTL();
                if (this.iconGravity != 4) {
                    z = false;
                }
                if (isLayoutRTL != z) {
                    paddingEnd = -paddingEnd;
                }
                if (this.iconLeft != paddingEnd) {
                    this.iconLeft = paddingEnd;
                    updateIcon(false);
                }
            } else if (isIconTop()) {
                this.iconLeft = 0;
                if (this.iconGravity == 16) {
                    this.iconTop = 0;
                    updateIcon(false);
                    return;
                }
                int i5 = this.iconSize;
                if (i5 == 0) {
                    i5 = this.icon.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.iconPadding) - getPaddingBottom()) / 2;
                if (this.iconTop != textHeight) {
                    this.iconTop = textHeight;
                    updateIcon(false);
                }
            }
        }
    }

    public void addOnCheckedChangeListener(a aVar) {
        this.onCheckedChangeListeners.add(aVar);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.f;
    }

    public int getInsetTop() {
        return this.materialButtonHelper.e;
    }

    public ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        i0.h.a.c.h.a aVar = this.materialButtonHelper;
        return aVar != null && aVar.q;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            i0.h.a.b.c.m.b.m0(this, this.materialButtonHelper.b());
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isCheckable()) {
            Button.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setChecked(savedState.q);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.q = this.checked;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateIconPosition(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void removeOnCheckedChangeListener(a aVar) {
        this.onCheckedChangeListeners.remove(aVar);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            if (aVar.b() != null) {
                aVar.b().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w(LOG_TAG, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            aVar.o = true;
            aVar.a.setSupportBackgroundTintList(aVar.j);
            aVar.a.setSupportBackgroundTintMode(aVar.i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? h0.b.b.a.a.a(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.q = z;
        }
    }

    public void setChecked(boolean z) {
        if (isCheckable() && isEnabled() && this.checked != z) {
            this.checked = z;
            refreshDrawableState();
            if (!this.broadcasting) {
                this.broadcasting = true;
                Iterator it = this.onCheckedChangeListeners.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.checked);
                }
                this.broadcasting = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            if (!aVar.p || aVar.g != i) {
                aVar.g = i;
                aVar.p = true;
                aVar.e(aVar.b.e((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (isUsingOriginalBackground()) {
            g b2 = this.materialButtonHelper.b();
            g.b bVar = b2.q;
            if (bVar.o != f) {
                bVar.o = f;
                b2.B();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.iconGravity != i) {
            this.iconGravity = i;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.iconPadding != i) {
            this.iconPadding = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? h0.b.b.a.a.a(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.iconSize != i) {
            this.iconSize = i;
            updateIcon(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public void setIconTintResource(int i) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
        setIconTint(context.getColorStateList(i));
    }

    public void setInsetBottom(int i) {
        i0.h.a.c.h.a aVar = this.materialButtonHelper;
        aVar.f(aVar.e, i);
    }

    public void setInsetTop(int i) {
        i0.h.a.c.h.a aVar = this.materialButtonHelper;
        aVar.f(i, aVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.onPressedChangeListenerInternal = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.onPressedChangeListenerInternal;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            if (aVar.l != colorStateList) {
                aVar.l = colorStateList;
                if (aVar.a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.a.getBackground()).setColor(i0.h.a.c.u.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (isUsingOriginalBackground()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            setRippleColor(context.getColorStateList(i));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.e(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            aVar.n = z;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            if (aVar.k != colorStateList) {
                aVar.k = colorStateList;
                aVar.h();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (isUsingOriginalBackground()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
            setStrokeColor(context.getColorStateList(i));
        }
    }

    public void setStrokeWidth(int i) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            if (aVar.h != i) {
                aVar.h = i;
                aVar.h();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            if (aVar.j != colorStateList) {
                aVar.j = colorStateList;
                if (aVar.b() != null) {
                    aVar.b().setTintList(aVar.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (isUsingOriginalBackground()) {
            i0.h.a.c.h.a aVar = this.materialButtonHelper;
            if (aVar.i != mode) {
                aVar.i = mode;
                if (aVar.b() != null && aVar.i != null) {
                    aVar.b().setTintMode(aVar.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void toggle() {
        setChecked(!this.checked);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r9 = i0.h.a.c.a0.a.a.a(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.onCheckedChangeListeners = r9
            r9 = 0
            r8.checked = r9
            r8.broadcasting = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconPadding = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = i0.h.a.b.c.m.b.f0(r1, r3)
            r8.iconTintMode = r1
            android.content.Context r1 = r8.getContext()
            int r3 = com.google.android.material.R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = i0.h.a.b.c.m.b.M(r1, r0, r3)
            r8.iconTint = r1
            android.content.Context r1 = r8.getContext()
            int r3 = com.google.android.material.R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = i0.h.a.b.c.m.b.P(r1, r0, r3)
            r8.icon = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconGravity
            r3 = 1
            int r1 = r0.getInteger(r1, r3)
            r8.iconGravity = r1
            int r1 = com.google.android.material.R.styleable.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconSize = r1
            i0.h.a.c.w.a r1 = new i0.h.a.c.w.a
            float r4 = (float) r9
            r1.<init>(r4)
            i0.h.a.c.w.k$b r10 = i0.h.a.c.w.k.b(r7, r10, r11, r6, r1)
            i0.h.a.c.w.k r10 = r10.a()
            i0.h.a.c.h.a r11 = new i0.h.a.c.h.a
            r11.<init>(r8, r10)
            r8.materialButtonHelper = r11
            java.util.Objects.requireNonNull(r11)
            int r10 = com.google.android.material.R.styleable.MaterialButton_android_insetLeft
            int r10 = r0.getDimensionPixelOffset(r10, r9)
            r11.c = r10
            int r10 = com.google.android.material.R.styleable.MaterialButton_android_insetRight
            int r10 = r0.getDimensionPixelOffset(r10, r9)
            r11.d = r10
            int r10 = com.google.android.material.R.styleable.MaterialButton_android_insetTop
            int r10 = r0.getDimensionPixelOffset(r10, r9)
            r11.e = r10
            int r10 = com.google.android.material.R.styleable.MaterialButton_android_insetBottom
            int r10 = r0.getDimensionPixelOffset(r10, r9)
            r11.f = r10
            int r10 = com.google.android.material.R.styleable.MaterialButton_cornerRadius
            boolean r1 = r0.hasValue(r10)
            if (r1 == 0) goto L_0x00b7
            int r10 = r0.getDimensionPixelSize(r10, r2)
            r11.g = r10
            i0.h.a.c.w.k r1 = r11.b
            float r10 = (float) r10
            i0.h.a.c.w.k r10 = r1.e(r10)
            r11.e(r10)
            r11.p = r3
        L_0x00b7:
            int r10 = com.google.android.material.R.styleable.MaterialButton_strokeWidth
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r11.h = r10
            int r10 = com.google.android.material.R.styleable.MaterialButton_backgroundTintMode
            int r10 = r0.getInt(r10, r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = i0.h.a.b.c.m.b.f0(r10, r1)
            r11.i = r10
            android.content.Context r10 = r8.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialButton_backgroundTint
            android.content.res.ColorStateList r10 = i0.h.a.b.c.m.b.M(r10, r0, r1)
            r11.j = r10
            android.content.Context r10 = r8.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialButton_strokeColor
            android.content.res.ColorStateList r10 = i0.h.a.b.c.m.b.M(r10, r0, r1)
            r11.k = r10
            android.content.Context r10 = r8.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialButton_rippleColor
            android.content.res.ColorStateList r10 = i0.h.a.b.c.m.b.M(r10, r0, r1)
            r11.l = r10
            int r10 = com.google.android.material.R.styleable.MaterialButton_android_checkable
            boolean r10 = r0.getBoolean(r10, r9)
            r11.q = r10
            int r10 = com.google.android.material.R.styleable.MaterialButton_elevation
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r11.s = r10
            java.util.concurrent.atomic.AtomicInteger r10 = h0.i.i.q.a
            int r10 = r8.getPaddingStart()
            int r1 = r8.getPaddingTop()
            int r2 = r8.getPaddingEnd()
            int r4 = r8.getPaddingBottom()
            int r5 = com.google.android.material.R.styleable.MaterialButton_android_background
            boolean r5 = r0.hasValue(r5)
            if (r5 == 0) goto L_0x0128
            r11.o = r3
            android.content.res.ColorStateList r5 = r11.j
            r8.setSupportBackgroundTintList(r5)
            android.graphics.PorterDuff$Mode r5 = r11.i
            r8.setSupportBackgroundTintMode(r5)
            goto L_0x012b
        L_0x0128:
            r11.g()
        L_0x012b:
            int r5 = r11.c
            int r10 = r10 + r5
            int r5 = r11.e
            int r1 = r1 + r5
            int r5 = r11.d
            int r2 = r2 + r5
            int r11 = r11.f
            int r4 = r4 + r11
            r8.setPaddingRelative(r10, r1, r2, r4)
            r0.recycle()
            int r10 = r8.iconPadding
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.icon
            if (r10 == 0) goto L_0x0147
            r9 = r3
        L_0x0147:
            r8.updateIcon(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
